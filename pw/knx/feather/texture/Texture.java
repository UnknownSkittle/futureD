/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package pw.knx.feather.texture;

import pw.knx.feather.tessellate.Tessellator;
import pw.knx.feather.texture.BasicTexture;

public interface Texture {
    public int id();

    public float u();

    public float v();

    public float u1();

    public float v1();

    public float width();

    public float height();

    public Texture setID(int var1);

    public Texture setU(float var1);

    public Texture setV(float var1);

    public Texture setU1(float var1);

    public Texture setV1(float var1);

    public Texture setWidth(float var1);

    public Texture setHeight(float var1);

    public Texture bind();

    public Texture draw(Tessellator var1, int var2, float var3, float var4);

    public static Texture from(float u2, float v2, float u1, float v1, float width, float height) {
        return new BasicTexture().setU(u2).setV(v2).setU1(u1).setV1(v1).setWidth(width).setHeight(height);
    }

    public static Texture from(float u2, float v2, float width, float height, int dimensions) {
        return Texture.from(u2 / (float)dimensions, v2 / (float)dimensions, (u2 + width) / (float)dimensions, (v2 + height) / (float)dimensions, width, height);
    }
}

