/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL15
 */
package pw.knx.feather;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import pw.knx.feather.animate.Animator;
import pw.knx.feather.font.FontCache;
import pw.knx.feather.font.FontGlyph;
import pw.knx.feather.font.GlyphLayout;
import pw.knx.feather.tessellate.Tessellator;
import pw.knx.feather.texture.Texture;

public enum Feather {
    FEATHER;

    private final Tessellator tess = Tessellator.createExpanding(16, 1.0f, 2.0f);
    private final Map<Font, FontCache> fonts = new HashMap<Font, FontCache>();
    private FontCache currentFont;
    private final Animator animator = new Animator();

    public Feather bindTexture(int id2) {
        GL11.glBindTexture((int)3553, (int)id2);
        return this;
    }

    public Feather bindBuffer(int id2) {
        GL15.glBindBuffer((int)34962, (int)id2);
        return this;
    }

    public Feather setFont(Font font) {
        this.currentFont = this.fonts.computeIfAbsent(font, FontCache::from);
        return this;
    }

    public Feather drawString(String str, float x2, float y2) {
        if (this.currentFont == null) {
            throw new RuntimeException("You must first set the Font to draw");
        }
        GlyphLayout entry = this.currentFont.cacheString(str);
        int boundTex = 0;
        for (FontGlyph glyph : entry.glyphs) {
            Texture texture = glyph.texture;
            if (boundTex != texture.id()) {
                if (boundTex != 0) {
                    this.tess.draw(7);
                }
                boundTex = texture.bind().id();
            }
            float x1 = x2 + (float)glyph.x;
            float x22 = x1 + texture.width();
            float y1 = y2 + (float)glyph.y;
            float y22 = y1 + texture.height();
            this.tess.setTexture(texture.u(), texture.v()).addVertex(x1, y1, 0.0f);
            this.tess.setTexture(texture.u(), texture.v1()).addVertex(x1, y22, 0.0f);
            this.tess.setTexture(texture.u1(), texture.v1()).addVertex(x22, y22, 0.0f);
            this.tess.setTexture(texture.u1(), texture.v()).addVertex(x22, y1, 0.0f);
        }
        this.tess.draw(7);
        return this;
    }

    public Animator animate() {
        return this.animator;
    }
}

