/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.e.a;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.e.a.d;

public final class b
implements d {
    private byte[] a = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private byte b = (byte)61;
    private byte[] c = new byte[128];

    private void a() {
        int n2;
        for (n2 = 0; n2 < 128; ++n2) {
            this.c[n2] = -1;
        }
        for (n2 = 0; n2 < 64; ++n2) {
            this.c[this.a[n2]] = (byte)n2;
        }
    }

    public b() {
        this.a();
    }

    public final int a(byte[] byArray, int n2, int n3, OutputStream outputStream) {
        int n4;
        int n5;
        int n6 = n3 % 3;
        n3 -= n6;
        for (n5 = n2; n5 < n2 + n3; n5 += 3) {
            n4 = byArray[n5] & 0xFF;
            int n7 = byArray[n5 + 1] & 0xFF;
            int n8 = byArray[n5 + 2] & 0xFF;
            outputStream.write(this.a[n4 >>> 2 & 0x3F]);
            outputStream.write(this.a[(n4 << 4 | n7 >>> 4) & 0x3F]);
            outputStream.write(this.a[(n7 << 2 | n8 >>> 6) & 0x3F]);
            outputStream.write(this.a[n8 & 0x3F]);
        }
        switch (n6) {
            case 0: {
                break;
            }
            case 1: {
                n4 = byArray[n2 + n3] & 0xFF;
                n5 = n4 >>> 2 & 0x3F;
                int n9 = n4 << 4 & 0x3F;
                outputStream.write(this.a[n5]);
                outputStream.write(this.a[n9]);
                outputStream.write(this.b);
                outputStream.write(this.b);
                break;
            }
            case 2: {
                n4 = byArray[n2 + n3] & 0xFF;
                n2 = byArray[n2 + n3 + 1] & 0xFF;
                n5 = n4 >>> 2 & 0x3F;
                int n10 = (n4 << 4 | n2 >>> 4) & 0x3F;
                n2 = n2 << 2 & 0x3F;
                outputStream.write(this.a[n5]);
                outputStream.write(this.a[n10]);
                outputStream.write(this.a[n2]);
                outputStream.write(this.b);
            }
        }
        return (n3 / 3 << 2) + (n6 == 0 ? 0 : 4);
    }

    private static boolean a(char c2) {
        return c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == ' ';
    }

    public final int a(byte[] byArray, int n2, OutputStream outputStream) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = 0;
        for (n7 = n2; n7 > 0 && org.bouncycastle.e.a.b.a((char)byArray[n7 - 1]); --n7) {
        }
        if (n7 == 0) {
            return 0;
        }
        int n9 = 0;
        for (n6 = n7; n6 > 0 && n9 != 4; --n6) {
            if (org.bouncycastle.e.a.b.a((char)byArray[n6 - 1])) continue;
            ++n9;
        }
        n9 = org.bouncycastle.e.a.b.a(byArray, 0, n6);
        while (n9 < n6) {
            n5 = this.c[byArray[n9++]];
            n9 = org.bouncycastle.e.a.b.a(byArray, n9, n6);
            n2 = this.c[byArray[n9++]];
            n9 = org.bouncycastle.e.a.b.a(byArray, n9, n6);
            n4 = this.c[byArray[n9++]];
            n9 = org.bouncycastle.e.a.b.a(byArray, n9, n6);
            if ((n5 | n2 | n4 | (n3 = this.c[byArray[n9++]])) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            outputStream.write(n5 << 2 | n2 >> 4);
            outputStream.write(n2 << 4 | n4 >> 2);
            outputStream.write(n4 << 6 | n3);
            n8 += 3;
            n9 = org.bouncycastle.e.a.b.a(byArray, n9, n6);
        }
        n5 = org.bouncycastle.e.a.b.a(byArray, n9, n7);
        n2 = org.bouncycastle.e.a.b.a(byArray, n5 + 1, n7);
        n4 = org.bouncycastle.e.a.b.a(byArray, n2 + 1, n7);
        n3 = org.bouncycastle.e.a.b.a(byArray, n4 + 1, n7);
        return n8 + this.a(outputStream, (char)byArray[n5], (char)byArray[n2], (char)byArray[n4], (char)byArray[n3]);
    }

    private static int a(byte[] byArray, int n2, int n3) {
        while (n2 < n3 && org.bouncycastle.e.a.b.a((char)byArray[n2])) {
            ++n2;
        }
        return n2;
    }

    public final int a(String string, OutputStream outputStream) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = 0;
        for (n7 = string.length(); n7 > 0 && org.bouncycastle.e.a.b.a(string.charAt(n7 - 1)); --n7) {
        }
        if (n7 == 0) {
            return 0;
        }
        int n9 = 0;
        for (n6 = n7; n6 > 0 && n9 != 4; --n6) {
            if (org.bouncycastle.e.a.b.a(string.charAt(n6 - 1))) continue;
            ++n9;
        }
        n9 = org.bouncycastle.e.a.b.a(string, 0, n6);
        while (n9 < n6) {
            n5 = this.c[string.charAt(n9++)];
            n9 = org.bouncycastle.e.a.b.a(string, n9, n6);
            n4 = this.c[string.charAt(n9++)];
            n9 = org.bouncycastle.e.a.b.a(string, n9, n6);
            n3 = this.c[string.charAt(n9++)];
            n9 = org.bouncycastle.e.a.b.a(string, n9, n6);
            if ((n5 | n4 | n3 | (n2 = this.c[string.charAt(n9++)])) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            outputStream.write(n5 << 2 | n4 >> 4);
            outputStream.write(n4 << 4 | n3 >> 2);
            outputStream.write(n3 << 6 | n2);
            n8 += 3;
            n9 = org.bouncycastle.e.a.b.a(string, n9, n6);
        }
        n5 = org.bouncycastle.e.a.b.a(string, n9, n7);
        n4 = org.bouncycastle.e.a.b.a(string, n5 + 1, n7);
        n3 = org.bouncycastle.e.a.b.a(string, n4 + 1, n7);
        n2 = org.bouncycastle.e.a.b.a(string, n3 + 1, n7);
        return n8 + this.a(outputStream, string.charAt(n5), string.charAt(n4), string.charAt(n3), string.charAt(n2));
    }

    private int a(OutputStream outputStream, char c2, char c3, char c4, char c5) {
        if (c4 == this.b) {
            if (c5 != this.b) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            if (((c2 = this.c[c2]) | (c3 = this.c[c3])) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write(c2 << 2 | c3 >> 4);
            return 1;
        }
        if (c5 == this.b) {
            if (((c2 = this.c[c2]) | (c3 = this.c[c3]) | (c4 = this.c[c4])) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write(c2 << 2 | c3 >> 4);
            outputStream.write(c3 << 4 | c4 >> 2);
            return 2;
        }
        if (((c2 = this.c[c2]) | (c3 = this.c[c3]) | (c4 = this.c[c4]) | (c5 = this.c[c5])) < 0) {
            throw new IOException("invalid characters encountered at end of base64 data");
        }
        outputStream.write(c2 << 2 | c3 >> 4);
        outputStream.write(c3 << 4 | c4 >> 2);
        outputStream.write(c4 << 6 | c5);
        return 3;
    }

    private static int a(String string, int n2, int n3) {
        while (n2 < n3 && org.bouncycastle.e.a.b.a(string.charAt(n2))) {
            ++n2;
        }
        return n2;
    }
}

