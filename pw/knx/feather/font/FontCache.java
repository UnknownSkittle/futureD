/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package pw.knx.feather.font;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.lwjgl.opengl.GL11;
import pw.knx.feather.font.FontGlyph;
import pw.knx.feather.font.GlyphLayout;
import pw.knx.feather.texture.Texture;

public class FontCache {
    private static final int TEXTURE_WIDTH = 256;
    private static final int TEXTURE_HEIGHT = 256;
    private static final Color CLEAR = new Color(255, 255, 255, 0);
    private final BufferedImage glyphImage = new BufferedImage(256, 256, 2);
    private final Graphics2D glyphGraphics = this.glyphImage.createGraphics();
    private final FontRenderContext fontContext = this.glyphGraphics.getFontRenderContext();
    private BufferedImage stringImage;
    private Graphics2D stringGraphics;
    private int cacheX = 1;
    private int cacheY = 1;
    private int cacheLineHeight = 0;
    private int texture;
    private final Font[] allFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
    private final List<Font> usedFonts = new ArrayList<Font>();
    private final Map<String, GlyphLayout> stringCache = new WeakHashMap<String, GlyphLayout>();
    private final Map<Font, Integer> fontCache = new HashMap<Font, Integer>();
    private final Map<Long, Texture> glyphCache = new HashMap<Long, Texture>();
    private final int[] imageData = new int[65536];
    private final IntBuffer imageBuffer = ByteBuffer.allocateDirect(262144).order(ByteOrder.BIG_ENDIAN).asIntBuffer();
    private final List<FontGlyph> glyphs = new ArrayList<FontGlyph>();

    FontCache() {
        this.glyphGraphics.setBackground(CLEAR);
        this.glyphGraphics.setComposite(AlphaComposite.Src);
        this.allocateTexture();
        this.allocateStringImage(256, 256);
        GraphicsEnvironment.getLocalGraphicsEnvironment().preferLocaleFonts();
    }

    public Font getFont() {
        return this.usedFonts.get(0);
    }

    public GlyphLayout cacheString(String str) {
        GlyphLayout entry = this.stringCache.get(str);
        if (entry == null) {
            int width = this.layoutBidi(str);
            entry = new GlyphLayout(this.glyphs.toArray(new FontGlyph[this.glyphs.size()]), width);
            this.glyphs.clear();
            Arrays.sort(entry.glyphs);
            this.stringCache.put(str, entry);
        }
        return entry;
    }

    private Font cacheFont(char ch2) {
        for (Font font : this.usedFonts) {
            if (!font.canDisplay(ch2)) continue;
            return font;
        }
        for (Font font : this.allFonts) {
            if (!font.canDisplay(ch2)) continue;
            font = font.deriveFont(this.getFont().getStyle(), this.getFont().getSize());
            this.usedFonts.add(font);
            return font;
        }
        return this.getFont();
    }

    private int cacheGlyphs(char[] text, int start, int limit, int directionFlag, Font font) {
        GlyphVector vector = this.layoutVector(font, text, start, limit, directionFlag);
        for (int i2 = 0; i2 < vector.getNumGlyphs(); ++i2) {
            Point2D pos = vector.getGlyphPosition(i2);
            pos.setLocation(pos.getX() + (double)(2 * i2), pos.getY());
            vector.setGlyphPosition(i2, pos);
        }
        Rectangle vectorBounds = null;
        Rectangle dirty = null;
        long fontKey = (long)this.fontCache.get(font).intValue() << 32;
        int numGlyphs = vector.getNumGlyphs();
        for (int index = 0; index < numGlyphs; ++index) {
            int glyphCode = vector.getGlyphCode(index);
            Texture tex = this.glyphCache.get(fontKey | (long)glyphCode);
            if (tex == null) {
                if (vectorBounds == null) {
                    vectorBounds = this.cacheVector(vector);
                }
                Rectangle rect = vector.getGlyphPixelBounds(index, null, -vectorBounds.x, -vectorBounds.y);
                if (this.cacheX + rect.width + 1 > 256) {
                    this.cacheX = 1;
                    this.cacheY += this.cacheLineHeight + 1;
                    this.cacheLineHeight = 0;
                }
                if (this.cacheY + rect.height + 1 > 256) {
                    this.updateTexture(dirty);
                    dirty = null;
                    this.allocateTexture();
                    this.cacheX = 1;
                    this.cacheY = 1;
                    this.cacheLineHeight = 0;
                }
                this.cacheLineHeight = Math.max(rect.height, this.cacheLineHeight);
                this.glyphGraphics.drawImage(this.stringImage, this.cacheX, this.cacheY, this.cacheX + rect.width, this.cacheY + rect.height, rect.x, rect.y, rect.x + rect.width, rect.y + rect.height, null);
                rect.setLocation(this.cacheX, this.cacheY);
                tex = Texture.from(rect.x, rect.y, rect.width, rect.height, 256).setID(this.texture);
                this.glyphCache.put(fontKey | (long)glyphCode, tex);
                if (dirty == null) {
                    dirty = new Rectangle(this.cacheX, this.cacheY, rect.width, rect.height);
                } else {
                    dirty.add(rect);
                }
                this.cacheX += rect.width + 1;
            }
            Point point = vector.getGlyphPixelBounds(index, null, 0.0f, 0.0f).getLocation();
            this.glyphs.add(new FontGlyph(tex, point.x - 2 * index, point.y));
        }
        this.updateTexture(dirty);
        return (int)vector.getGlyphPosition(numGlyphs).getX() - 2 * numGlyphs;
    }

    private Rectangle cacheVector(GlyphVector vector) {
        Rectangle vectorBounds = vector.getPixelBounds(this.fontContext, 0.0f, 0.0f);
        if (vectorBounds.width > this.stringImage.getWidth() || vectorBounds.height > this.stringImage.getHeight()) {
            this.allocateStringImage(Math.max(vectorBounds.width, this.stringImage.getWidth()), Math.max(vectorBounds.height, this.stringImage.getHeight()));
        }
        this.stringGraphics.clearRect(0, 0, vectorBounds.width, vectorBounds.height);
        this.stringGraphics.drawGlyphVector(vector, -vectorBounds.x, -vectorBounds.y);
        return vectorBounds;
    }

    private int layoutBidi(String str) {
        char[] text = str.toCharArray();
        if (!Bidi.requiresBidi(text, 0, text.length)) {
            return this.layoutFont(text, 0, text.length, 0);
        }
        Bidi bidi = new Bidi(text, 0, null, 0, text.length, -2);
        if (bidi.isRightToLeft()) {
            return this.layoutFont(text, 0, text.length, 1);
        }
        int runCount = bidi.getRunCount();
        byte[] levels = new byte[runCount];
        Object[] ranges = new Integer[runCount];
        for (int i2 = 0; i2 < runCount; ++i2) {
            levels[i2] = (byte)bidi.getRunLevel(i2);
            ranges[i2] = i2;
        }
        Bidi.reorderVisually(levels, 0, ranges, 0, runCount);
        int width = 0;
        for (int i3 = 0; i3 < runCount; ++i3) {
            int index = (Integer)ranges[i3];
            width += this.layoutFont(text, bidi.getRunStart(index), bidi.getRunLimit(index), bidi.getRunLevel(index) & 1);
        }
        return width;
    }

    private int layoutFont(char[] text, int start, int limit, int directionFlag) {
        int width = 0;
        while (start < limit) {
            Font font = this.cacheFont(text[start]);
            int next = font.canDisplayUpTo(text, start, limit);
            if (next == start) {
                ++next;
            } else if (next == -1) {
                next = limit;
            }
            width += this.cacheGlyphs(text, start, next, directionFlag, font);
            start = next;
        }
        return width;
    }

    private GlyphVector layoutVector(Font font, char[] text, int start, int limit, int layoutFlags) {
        if (!this.fontCache.containsKey(font)) {
            this.fontCache.put(font, this.fontCache.size());
        }
        return font.layoutGlyphVector(this.fontContext, text, start, limit, layoutFlags);
    }

    private void updateTexture(Rectangle dirty) {
        if (dirty != null) {
            this.updateBuffer(dirty.x, dirty.y, dirty.width, dirty.height);
            GL11.glBindTexture((int)3553, (int)this.texture);
            GL11.glTexSubImage2D((int)3553, (int)0, (int)dirty.x, (int)dirty.y, (int)dirty.width, (int)dirty.height, (int)6408, (int)5121, (IntBuffer)this.imageBuffer);
        }
    }

    private void allocateTexture() {
        this.glyphGraphics.clearRect(0, 0, 256, 256);
        this.texture = GL11.glGenTextures();
        this.updateBuffer(0, 0, 256, 256);
        GL11.glBindTexture((int)3553, (int)this.texture);
        GL11.glTexImage2D((int)3553, (int)0, (int)32828, (int)256, (int)256, (int)0, (int)6408, (int)5121, (IntBuffer)this.imageBuffer);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
    }

    private void allocateStringImage(int width, int height) {
        this.stringImage = new BufferedImage(width, height, 2);
        this.stringGraphics = this.stringImage.createGraphics();
        this.setRenderingHints();
        this.stringGraphics.setBackground(CLEAR);
        this.stringGraphics.setPaint(Color.WHITE);
    }

    private void updateBuffer(int x2, int y2, int width, int height) {
        this.glyphImage.getRGB(x2, y2, width, height, this.imageData, 0, width);
        for (int i2 = 0; i2 < width * height; ++i2) {
            int color = this.imageData[i2];
            this.imageData[i2] = color << 8 | color >>> 24;
        }
        this.imageBuffer.clear();
        this.imageBuffer.put(this.imageData);
        this.imageBuffer.flip();
    }

    private void setRenderingHints() {
        this.stringGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.stringGraphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        this.stringGraphics.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
    }

    public static FontCache from(Font font) {
        FontCache cache = new FontCache();
        cache.usedFonts.add(font);
        return cache;
    }
}

