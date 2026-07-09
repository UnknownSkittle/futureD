/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package pw.knx.feather.texture;

import pw.knx.feather.Feather;
import pw.knx.feather.tessellate.Tessellator;
import pw.knx.feather.texture.Texture;

public class BasicTexture
implements Texture {
    private int texID;
    private float u;
    private float v;
    private float u1;
    private float v1;
    private float width;
    private float height;

    @Override
    public Texture bind() {
        Feather.FEATHER.bindTexture(this.texID);
        return this;
    }

    @Override
    public Texture draw(Tessellator tess, int mode, float x2, float y2) {
        tess.setTexture(this.u1, this.v).addVertex(x2 + this.width, y2, 0.0f).setTexture(this.u, this.v).addVertex(x2, y2, 0.0f);
        tess.setTexture(this.u, this.v1).addVertex(x2, y2 + this.height, 0.0f).setTexture(this.u1, this.v1).addVertex(x2 + this.width, y2 + this.height, 0.0f);
        tess.draw(mode);
        return this;
    }

    @Override
    public int id() {
        return this.texID;
    }

    @Override
    public float u() {
        return this.u;
    }

    @Override
    public float v() {
        return this.v;
    }

    @Override
    public float u1() {
        return this.u1;
    }

    @Override
    public float v1() {
        return this.v1;
    }

    @Override
    public float width() {
        return this.width;
    }

    @Override
    public float height() {
        return this.height;
    }

    @Override
    public Texture setID(int id2) {
        this.texID = id2;
        return this;
    }

    @Override
    public Texture setU(float u2) {
        this.u = u2;
        return this;
    }

    @Override
    public Texture setV(float v2) {
        this.v = v2;
        return this;
    }

    @Override
    public Texture setU1(float u1) {
        this.u1 = u1;
        return this;
    }

    @Override
    public Texture setV1(float v1) {
        this.v1 = v1;
        return this;
    }

    @Override
    public Texture setWidth(float width) {
        this.width = width;
        return this;
    }

    @Override
    public Texture setHeight(float height) {
        this.height = height;
        return this;
    }
}

