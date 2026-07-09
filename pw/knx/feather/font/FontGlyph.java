/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package pw.knx.feather.font;

import pw.knx.feather.texture.Texture;

public class FontGlyph
implements Comparable<FontGlyph> {
    public final int x;
    public final int y;
    public final Texture texture;

    FontGlyph(Texture texture, int x2, int y2) {
        this.texture = texture;
        this.x = x2;
        this.y = y2;
    }

    @Override
    public int compareTo(FontGlyph o2) {
        return this.texture.id() == o2.texture.id() ? 0 : 1;
    }
}

