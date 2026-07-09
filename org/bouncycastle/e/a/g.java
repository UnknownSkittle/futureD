/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.e.a;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.e.a.d;

public final class g
implements d {
    private byte[] a = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    private byte[] b = new byte[128];

    private void a() {
        int n2;
        for (n2 = 0; n2 < 128; ++n2) {
            this.b[n2] = -1;
        }
        for (n2 = 0; n2 < 16; ++n2) {
            this.b[this.a[n2]] = (byte)n2;
        }
        this.b[65] = this.b[97];
        this.b[66] = this.b[98];
        this.b[67] = this.b[99];
        this.b[68] = this.b[100];
        this.b[69] = this.b[101];
        this.b[70] = this.b[102];
    }

    public g() {
        this.a();
    }

    public final int a(byte[] byArray, int n2, int n3, OutputStream outputStream) {
        for (int i2 = n2; i2 < n2 + n3; ++i2) {
            int n4 = byArray[i2] & 0xFF;
            outputStream.write(this.a[n4 >>> 4]);
            outputStream.write(this.a[n4 & 0xF]);
        }
        return n3 << 1;
    }

    private static boolean a(char c2) {
        return c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == ' ';
    }

    public final int a(byte[] byArray, int n2, OutputStream outputStream) {
        int n3;
        int n4 = 0;
        for (n3 = n2; n3 > 0 && g.a((char)byArray[n3 - 1]); --n3) {
        }
        int n5 = 0;
        while (n5 < n3) {
            while (n5 < n3 && g.a((char)byArray[n5])) {
                ++n5;
            }
            byte by2 = this.b[byArray[n5++]];
            while (n5 < n3 && g.a((char)byArray[n5])) {
                ++n5;
            }
            if ((by2 | (n2 = this.b[byArray[n5++]])) < 0) {
                throw new IOException("invalid characters encountered in Hex data");
            }
            outputStream.write(by2 << 4 | n2);
            ++n4;
        }
        return n4;
    }

    public final int a(String string, OutputStream outputStream) {
        int n2;
        int n3 = 0;
        for (n2 = string.length(); n2 > 0 && g.a(string.charAt(n2 - 1)); --n2) {
        }
        int n4 = 0;
        while (n4 < n2) {
            byte by2;
            while (n4 < n2 && g.a(string.charAt(n4))) {
                ++n4;
            }
            byte by3 = this.b[string.charAt(n4++)];
            while (n4 < n2 && g.a(string.charAt(n4))) {
                ++n4;
            }
            if ((by3 | (by2 = this.b[string.charAt(n4++)])) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            outputStream.write(by3 << 4 | by2);
            ++n3;
        }
        return n3;
    }
}

