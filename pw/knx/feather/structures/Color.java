/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package pw.knx.feather.structures;

public class Color {
    private float alpha = 1.0f;
    private float hue;
    private float saturation;
    private float brightness;
    private float red;
    private float green;
    private float blue;
    private int redInt;
    private int greenInt;
    private int blueInt;
    private boolean updateHSB;
    private boolean updateRGB;
    private boolean updateRGBInts;

    private Color() {
    }

    public Color scaleHSB(float scaleH, float scaleS, float scaleB) {
        return this.scaleHue(scaleH).scaleSaturation(scaleS).scaleBrightness(scaleB);
    }

    public Color scaleRGB(float scaleR, float scaleG, float scaleB) {
        return this.scaleRed(scaleR).scaleGreen(scaleG).scaleBlue(scaleB);
    }

    public Color scaleHue(float scale) {
        return this.hue(this.getHue() * scale);
    }

    public Color scaleSaturation(float scale) {
        return this.saturation(this.getSaturation() * scale);
    }

    public Color scaleBrightness(float scale) {
        return this.brightness(this.getBrightness() * scale);
    }

    public Color scaleRed(float scale) {
        return this.red(this.getRed() * scale);
    }

    public Color scaleGreen(float scale) {
        return this.green(this.getGreen() * scale);
    }

    public Color scaleBlue(float scale) {
        return this.blue(this.getBlue() * scale);
    }

    public Color scaleAlpha(float scale) {
        return this.alpha(this.getAlpha() * scale);
    }

    public Color translateHSB(float offsetH, float offsetS, float offsetB) {
        return this.translateHue(offsetH).translateSaturation(offsetS).translateBrightness(offsetB);
    }

    public Color translateRGB(float offsetR, float offsetG, float offsetB) {
        return this.translateRed(offsetR).translateGreen(offsetG).translateBlue(offsetB);
    }

    public Color translateRGB(int offsetR, int offsetG, int offsetB) {
        return this.translateRed(offsetR).translateGreen(offsetG).translateBlue(offsetB);
    }

    public Color translateHue(float offset) {
        return this.hue(this.getHue() + offset);
    }

    public Color translateSaturation(float offset) {
        return this.saturation(this.getSaturation() + offset);
    }

    public Color translateBrightness(float offset) {
        return this.brightness(this.getBrightness() + offset);
    }

    public Color translateRed(float offset) {
        return this.red(this.getRed() + offset);
    }

    public Color translateGreen(float offset) {
        return this.green(this.getGreen() + offset);
    }

    public Color translateBlue(float offset) {
        return this.blue(this.getBlue() + offset);
    }

    public Color translateRed(int offset) {
        return this.red(this.getRedInt() + offset);
    }

    public Color translateGreen(int offset) {
        return this.green(this.getGreenInt() + offset);
    }

    public Color translateBlue(int offset) {
        return this.blue(this.getBlueInt() + offset);
    }

    public Color translateAlpha(float offset) {
        return this.alpha(this.getAlpha() + offset);
    }

    public Color translateAlpha(int offset) {
        return this.alpha(this.getAlphaInt() + offset);
    }

    public Color hsb(float hue, float saturation, float brightness) {
        return this.hue(hue).saturation(saturation).brightness(brightness);
    }

    public Color rgb(float red, float green, float blue) {
        return this.red(red).green(green).blue(blue);
    }

    public Color rgb(int red, int green, int blue) {
        return this.red(red).green(green).blue(blue);
    }

    public Color hex(int hex) {
        return this.hex(hex, HexFormat.ARGB);
    }

    public Color hex(int hex, HexFormat format) {
        int alpha = format.getAlphaInt(hex);
        if (alpha != 0) {
            this.alpha(alpha);
        }
        return this.red(format.getRedInt(hex)).green(format.getGreenInt(hex)).blue(format.getBlueInt(hex));
    }

    public Color hue(float hue) {
        this.onSetHSB();
        this.hue = this.clamp(hue, 0.0f, 1.0f);
        return this;
    }

    public Color saturation(float saturation) {
        this.onSetHSB();
        this.saturation = this.clamp(saturation, 0.0f, 1.0f);
        return this;
    }

    public Color brightness(float brightness) {
        this.onSetHSB();
        this.brightness = this.clamp(brightness, 0.0f, 1.0f);
        return this;
    }

    public Color red(float red) {
        this.onSetRGB();
        this.red = this.clamp(red, 0.0f, 1.0f);
        return this;
    }

    public Color green(float green) {
        this.onSetRGB();
        this.green = this.clamp(green, 0.0f, 1.0f);
        return this;
    }

    public Color blue(float blue) {
        this.onSetRGB();
        this.blue = this.clamp(blue, 0.0f, 1.0f);
        return this;
    }

    public Color red(int red) {
        this.onSetRGBInts();
        this.redInt = this.clamp(red, 0, 255);
        return this;
    }

    public Color green(int green) {
        this.onSetRGBInts();
        this.greenInt = this.clamp(green, 0, 255);
        return this;
    }

    public Color blue(int blue) {
        this.onSetRGBInts();
        this.blueInt = this.clamp(blue, 0, 255);
        return this;
    }

    public Color alpha(float alpha) {
        this.alpha = this.clamp(alpha, 0.0f, 1.0f);
        return this;
    }

    public Color alpha(int alpha) {
        return this.alpha((float)alpha / 255.0f);
    }

    private Color onSetHSB() {
        this.updateHSB();
        this.updateRGB = true;
        this.updateRGBInts = true;
        return this;
    }

    private Color onSetRGB() {
        this.updateRGB();
        this.updateHSB = true;
        this.updateRGBInts = true;
        return this;
    }

    private Color onSetRGBInts() {
        this.updateRGBInts();
        this.updateHSB = true;
        this.updateRGB = true;
        return this;
    }

    public float getHue() {
        this.updateHSB();
        return this.hue;
    }

    public float getSaturation() {
        this.updateHSB();
        return this.saturation;
    }

    public float getBrightness() {
        this.updateHSB();
        return this.brightness;
    }

    public float getRed() {
        this.updateRGB();
        return this.red;
    }

    public float getGreen() {
        this.updateRGB();
        return this.green;
    }

    public float getBlue() {
        this.updateRGB();
        return this.blue;
    }

    public int getRedInt() {
        this.updateRGBInts();
        return this.redInt;
    }

    public int getGreenInt() {
        this.updateRGBInts();
        return this.greenInt;
    }

    public int getBlueInt() {
        this.updateRGBInts();
        return this.blueInt;
    }

    public float getAlpha() {
        return this.alpha;
    }

    public int getAlphaInt() {
        return (int)(this.getAlpha() * 255.0f);
    }

    public int getHex() {
        return this.getHex(HexFormat.ARGB);
    }

    public int getHex(HexFormat format) {
        return format.getHex(this.getRedInt(), this.getGreenInt(), this.getBlueInt(), this.getAlphaInt());
    }

    private Color updateHSB() {
        if (this.updateHSB) {
            float[] hsb = new float[3];
            java.awt.Color.RGBtoHSB(this.getRedInt(), this.getGreenInt(), this.getBlueInt(), hsb);
            this.hue = hsb[0];
            this.saturation = hsb[1];
            this.brightness = hsb[2];
            this.updateHSB = false;
        }
        return this;
    }

    private Color updateRGB() {
        if (this.updateRGB) {
            this.red = (float)this.getRedInt() / 255.0f;
            this.green = (float)this.getGreenInt() / 255.0f;
            this.blue = (float)this.getBlueInt() / 255.0f;
            this.updateRGB = false;
        }
        return this;
    }

    private Color updateRGBInts() {
        if (this.updateRGBInts) {
            if (this.updateRGB) {
                int hex = java.awt.Color.HSBtoRGB(this.getHue(), this.getSaturation(), this.getBrightness());
                this.redInt = HexFormat.ARGB.getRedInt(hex);
                this.greenInt = HexFormat.ARGB.getGreenInt(hex);
                this.blueInt = HexFormat.ARGB.getBlueInt(hex);
            } else {
                this.redInt = (int)(this.getRed() * 255.0f);
                this.greenInt = (int)(this.getGreen() * 255.0f);
                this.blueInt = (int)(this.getBlue() * 255.0f);
            }
            this.updateRGBInts = false;
        }
        return this;
    }

    private float clamp(float toClamp, float low, float high) {
        return Math.max(Math.min(toClamp, high), low);
    }

    private int clamp(int toClamp, int low, int high) {
        return Math.max(Math.min(toClamp, high), low);
    }

    public Color copy() {
        return Color.fromRGB(this.getRedInt(), this.getGreenInt(), this.getBlueInt());
    }

    public static Color fromHSB(float hue, float saturation, float brightness) {
        return new Color().hsb(hue, saturation, brightness);
    }

    public static Color fromRGB(float red, float green, float blue) {
        return new Color().rgb(red, green, blue);
    }

    public static Color fromRGB(int red, int green, int blue) {
        return new Color().rgb(red, green, blue);
    }

    public static Color fromHex(int color) {
        return new Color().hex(color);
    }

    public static enum HexFormat {
        ARGB(1, 2, 3, 0),
        BGRA(0, 3, 2, 1),
        RGBA(0, 1, 2, 3),
        ABGR(3, 2, 1, 0);

        final int rx;
        final int gx;
        final int bx;
        final int ax;

        private HexFormat(int rx, int gx2, int bx2, int ax2) {
            this.rx = 24 - (rx << 3);
            this.gx = 24 - (gx2 << 3);
            this.bx = 24 - (bx2 << 3);
            this.ax = 24 - (ax2 << 3);
        }

        public int getHex(int r2, int g2, int b2, int a2) {
            return r2 << this.rx | g2 << this.gx | b2 << this.bx | a2 << this.ax;
        }

        public int getRedInt(int hex) {
            return hex >>> this.rx & 0xFF;
        }

        public int getGreenInt(int hex) {
            return hex >>> this.gx & 0xFF;
        }

        public int getBlueInt(int hex) {
            return hex >>> this.bx & 0xFF;
        }

        public int getAlphaInt(int hex) {
            return hex >>> this.ax & 0xFF;
        }

        public int convert(int hex, HexFormat format) {
            return this.getHex(format.getRedInt(hex), format.getGreenInt(hex), format.getBlueInt(hex), format.getAlphaInt(hex));
        }
    }
}

