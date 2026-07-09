/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package pw.knx.feather.tessellate;

import pw.knx.feather.structures.Color;
import pw.knx.feather.tessellate.BasicTess;
import pw.knx.feather.tessellate.ExpandingTess;

public interface Tessellator {
    public Tessellator setColor(int var1);

    default public Tessellator setColor(Color color) {
        return this.setColor(color.getHex(Color.HexFormat.ABGR));
    }

    public Tessellator setTexture(float var1, float var2);

    public Tessellator addVertex(float var1, float var2, float var3);

    public Tessellator bind();

    public Tessellator pass(int var1);

    public Tessellator reset();

    public Tessellator unbind();

    default public Tessellator draw(int mode) {
        return this.bind().pass(mode).reset();
    }

    public static Tessellator createBasic(int size) {
        return new BasicTess(size);
    }

    public static Tessellator createExpanding(int size, float ratio, float factor) {
        return new ExpandingTess(size, ratio, factor);
    }
}

