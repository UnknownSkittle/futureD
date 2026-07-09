/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package pw.knx.feather.shapes;

public class Dimensions {
    private int width;
    private int height;

    public int width() {
        return this.width;
    }

    public int height() {
        return this.height;
    }

    public Dimensions setWidth(int w2) {
        this.width = w2;
        return this;
    }

    public Dimensions setHeight(int h2) {
        this.height = h2;
        return this;
    }

    public Dimensions setTo(int width, int height) {
        return this.setWidth(width).setHeight(height);
    }

    public Dimensions setTo(Dimensions size) {
        return this.setTo(size.width, size.height);
    }

    public Dimensions offset(int dWidth, int dHeight) {
        return this.setTo(this.width + dWidth, this.height + dHeight);
    }
}

