/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package pw.knx.feather.font;

import pw.knx.feather.font.FontGlyph;

public class GlyphLayout {
    public final FontGlyph[] glyphs;
    public final int width;

    GlyphLayout(FontGlyph[] glyphs, int width) {
        this.glyphs = glyphs;
        this.width = width;
    }
}

