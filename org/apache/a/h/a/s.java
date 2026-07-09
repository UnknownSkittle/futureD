/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.a;

import org.apache.a.h.a.p;

final class s {
    private int a = 1732584193;
    private int b = -271733879;
    private int c = -1732584194;
    private int d = 271733878;
    private long e = 0L;
    private byte[] f = new byte[64];

    s() {
    }

    final void a(byte[] byArray) {
        int n2 = (int)(this.e & 0x3FL);
        int n3 = 0;
        while (byArray.length - n3 + n2 >= this.f.length) {
            int n4;
            int n5 = this.f.length - n2;
            System.arraycopy(byArray, n3, this.f, n2, n5);
            this.e += (long)n5;
            n2 = 0;
            n3 += n5;
            s s2 = this;
            int[] nArray = new int[16];
            for (n4 = 0; n4 < 16; ++n4) {
                nArray[n4] = (s2.f[n4 << 2] & 0xFF) + ((s2.f[(n4 << 2) + 1] & 0xFF) << 8) + ((s2.f[(n4 << 2) + 2] & 0xFF) << 16) + ((s2.f[(n4 << 2) + 3] & 0xFF) << 24);
            }
            n4 = s2.a;
            int n6 = s2.b;
            int n7 = s2.c;
            int n8 = s2.d;
            int[] nArray2 = nArray;
            s s3 = s2;
            s3.a = p.a(s3.a + p.a(s3.b, s3.c, s3.d) + nArray2[0], 3);
            s3.d = p.a(s3.d + p.a(s3.a, s3.b, s3.c) + nArray2[1], 7);
            s3.c = p.a(s3.c + p.a(s3.d, s3.a, s3.b) + nArray2[2], 11);
            s3.b = p.a(s3.b + p.a(s3.c, s3.d, s3.a) + nArray2[3], 19);
            s3.a = p.a(s3.a + p.a(s3.b, s3.c, s3.d) + nArray2[4], 3);
            s3.d = p.a(s3.d + p.a(s3.a, s3.b, s3.c) + nArray2[5], 7);
            s3.c = p.a(s3.c + p.a(s3.d, s3.a, s3.b) + nArray2[6], 11);
            s3.b = p.a(s3.b + p.a(s3.c, s3.d, s3.a) + nArray2[7], 19);
            s3.a = p.a(s3.a + p.a(s3.b, s3.c, s3.d) + nArray2[8], 3);
            s3.d = p.a(s3.d + p.a(s3.a, s3.b, s3.c) + nArray2[9], 7);
            s3.c = p.a(s3.c + p.a(s3.d, s3.a, s3.b) + nArray2[10], 11);
            s3.b = p.a(s3.b + p.a(s3.c, s3.d, s3.a) + nArray2[11], 19);
            s3.a = p.a(s3.a + p.a(s3.b, s3.c, s3.d) + nArray2[12], 3);
            s3.d = p.a(s3.d + p.a(s3.a, s3.b, s3.c) + nArray2[13], 7);
            s3.c = p.a(s3.c + p.a(s3.d, s3.a, s3.b) + nArray2[14], 11);
            s3.b = p.a(s3.b + p.a(s3.c, s3.d, s3.a) + nArray2[15], 19);
            nArray2 = nArray;
            s3 = s2;
            s3.a = p.a(s3.a + p.b(s3.b, s3.c, s3.d) + nArray2[0] + 1518500249, 3);
            s3.d = p.a(s3.d + p.b(s3.a, s3.b, s3.c) + nArray2[4] + 1518500249, 5);
            s3.c = p.a(s3.c + p.b(s3.d, s3.a, s3.b) + nArray2[8] + 1518500249, 9);
            s3.b = p.a(s3.b + p.b(s3.c, s3.d, s3.a) + nArray2[12] + 1518500249, 13);
            s3.a = p.a(s3.a + p.b(s3.b, s3.c, s3.d) + nArray2[1] + 1518500249, 3);
            s3.d = p.a(s3.d + p.b(s3.a, s3.b, s3.c) + nArray2[5] + 1518500249, 5);
            s3.c = p.a(s3.c + p.b(s3.d, s3.a, s3.b) + nArray2[9] + 1518500249, 9);
            s3.b = p.a(s3.b + p.b(s3.c, s3.d, s3.a) + nArray2[13] + 1518500249, 13);
            s3.a = p.a(s3.a + p.b(s3.b, s3.c, s3.d) + nArray2[2] + 1518500249, 3);
            s3.d = p.a(s3.d + p.b(s3.a, s3.b, s3.c) + nArray2[6] + 1518500249, 5);
            s3.c = p.a(s3.c + p.b(s3.d, s3.a, s3.b) + nArray2[10] + 1518500249, 9);
            s3.b = p.a(s3.b + p.b(s3.c, s3.d, s3.a) + nArray2[14] + 1518500249, 13);
            s3.a = p.a(s3.a + p.b(s3.b, s3.c, s3.d) + nArray2[3] + 1518500249, 3);
            s3.d = p.a(s3.d + p.b(s3.a, s3.b, s3.c) + nArray2[7] + 1518500249, 5);
            s3.c = p.a(s3.c + p.b(s3.d, s3.a, s3.b) + nArray2[11] + 1518500249, 9);
            s3.b = p.a(s3.b + p.b(s3.c, s3.d, s3.a) + nArray2[15] + 1518500249, 13);
            nArray2 = nArray;
            s3 = s2;
            s3.a = p.a(s3.a + p.c(s3.b, s3.c, s3.d) + nArray2[0] + 1859775393, 3);
            s3.d = p.a(s3.d + p.c(s3.a, s3.b, s3.c) + nArray2[8] + 1859775393, 9);
            s3.c = p.a(s3.c + p.c(s3.d, s3.a, s3.b) + nArray2[4] + 1859775393, 11);
            s3.b = p.a(s3.b + p.c(s3.c, s3.d, s3.a) + nArray2[12] + 1859775393, 15);
            s3.a = p.a(s3.a + p.c(s3.b, s3.c, s3.d) + nArray2[2] + 1859775393, 3);
            s3.d = p.a(s3.d + p.c(s3.a, s3.b, s3.c) + nArray2[10] + 1859775393, 9);
            s3.c = p.a(s3.c + p.c(s3.d, s3.a, s3.b) + nArray2[6] + 1859775393, 11);
            s3.b = p.a(s3.b + p.c(s3.c, s3.d, s3.a) + nArray2[14] + 1859775393, 15);
            s3.a = p.a(s3.a + p.c(s3.b, s3.c, s3.d) + nArray2[1] + 1859775393, 3);
            s3.d = p.a(s3.d + p.c(s3.a, s3.b, s3.c) + nArray2[9] + 1859775393, 9);
            s3.c = p.a(s3.c + p.c(s3.d, s3.a, s3.b) + nArray2[5] + 1859775393, 11);
            s3.b = p.a(s3.b + p.c(s3.c, s3.d, s3.a) + nArray2[13] + 1859775393, 15);
            s3.a = p.a(s3.a + p.c(s3.b, s3.c, s3.d) + nArray2[3] + 1859775393, 3);
            s3.d = p.a(s3.d + p.c(s3.a, s3.b, s3.c) + nArray2[11] + 1859775393, 9);
            s3.c = p.a(s3.c + p.c(s3.d, s3.a, s3.b) + nArray2[7] + 1859775393, 11);
            s3.b = p.a(s3.b + p.c(s3.c, s3.d, s3.a) + nArray2[15] + 1859775393, 15);
            s2.a += n4;
            s2.b += n6;
            s2.c += n7;
            s2.d += n8;
        }
        if (n3 < byArray.length) {
            int n9 = byArray.length - n3;
            System.arraycopy(byArray, n3, this.f, n2, n9);
            this.e += (long)n9;
        }
    }

    final byte[] a() {
        int n2 = (int)(this.e & 0x3FL);
        n2 = n2 < 56 ? 56 - n2 : 120 - n2;
        byte[] byArray = new byte[n2 + 8];
        byte[] byArray2 = byArray;
        byArray[0] = -128;
        for (int i2 = 0; i2 < 8; ++i2) {
            byArray2[n2 + i2] = (byte)(this.e << 3 >>> (i2 << 3));
        }
        this.a(byArray2);
        byte[] byArray3 = new byte[16];
        p.a(byArray3, this.a, 0);
        p.a(byArray3, this.b, 4);
        p.a(byArray3, this.c, 8);
        p.a(byArray3, this.d, 12);
        return byArray3;
    }
}

