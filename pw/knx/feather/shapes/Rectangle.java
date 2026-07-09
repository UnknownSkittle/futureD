/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package pw.knx.feather.shapes;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public int x() {
        return this.x;
    }

    public int y() {
        return this.y;
    }

    public int width() {
        return this.width;
    }

    public int height() {
        return this.height;
    }

    public int x1() {
        return this.x + this.width;
    }

    public int y1() {
        return this.y + this.height;
    }

    public Rectangle setX(int x2) {
        this.x = x2;
        return this;
    }

    public Rectangle setY(int y2) {
        this.y = y2;
        return this;
    }

    public Rectangle setX1(int x1) {
        return this.setWidth(x1 - this.x);
    }

    public Rectangle setY1(int y1) {
        return this.setHeight(y1 - this.y);
    }

    public Rectangle setWidth(int w2) {
        this.width = w2;
        return this;
    }

    public Rectangle setHeight(int h2) {
        this.height = h2;
        return this;
    }

    public Rectangle setTo(int x2, int y2, int w2, int h2) {
        return this.setX(x2).setY(y2).setWidth(w2).setHeight(h2);
    }

    public Rectangle setTo(Rectangle rect) {
        return this.setTo(rect.x, rect.y, rect.width, rect.height);
    }

    public Rectangle offset(int dx2, int dy2) {
        return this.offset(dx2, dy2, 0, 0);
    }

    public Rectangle offset(int dx2, int dy2, int dWidth, int dHeight) {
        return this.setTo(this.x + dx2, this.y + dy2, this.width + dWidth, this.height + dHeight);
    }

    public Rectangle expand(int dx2, int dy2) {
        return this.offset(-dx2, -dy2, 2 * dx2, 2 * dy2);
    }

    public Rectangle contract(int dx2, int dy2) {
        return this.offset(dx2, dy2, -2 * dx2, -2 * dy2);
    }

    public boolean contains(int i2, int j2) {
        return i2 >= this.x && j2 >= this.y && i2 <= this.x1() && j2 <= this.y1();
    }

    public Rectangle copy() {
        return new Rectangle().setTo(this);
    }
}

