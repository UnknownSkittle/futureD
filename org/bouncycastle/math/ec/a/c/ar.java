/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.openpgp.h;
import org.bouncycastle.openpgp.p;

public final class ar {
    static final int[] a = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    public static void a(int[] nArray, int[] nArray2, int[] nArray3) {
        int n2 = ab.a(16, nArray, nArray2, nArray3) + nArray[16] + nArray2[16];
        if (n2 > 511 || n2 == 511 && ab.b(16, nArray3, a)) {
            n2 = n2 + ab.a(nArray3) & 0x1FF;
        }
        nArray3[16] = n2;
    }

    public static void a(int[] nArray, int[] nArray2) {
        int n2 = ab.d(16, nArray, nArray2) + nArray[16];
        if (n2 > 511 || n2 == 511 && ab.b(16, nArray2, a)) {
            n2 = n2 + ab.a(nArray2) & 0x1FF;
        }
        nArray2[16] = n2;
    }

    public static int[] a(BigInteger object) {
        if (ab.b(17, (int[])(object = (Object)ab.a(521, (BigInteger)object)), a)) {
            ab.d(17, (int[])object);
        }
        return object;
    }

    public static void b(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4;
        int[] nArray5 = nArray4 = new int[33];
        int[] nArray6 = nArray;
        int[] nArray7 = nArray5;
        int[] nArray8 = nArray2;
        int[] nArray9 = nArray6;
        h.d(nArray6, nArray8, nArray7);
        int n2 = 16;
        int[] nArray10 = nArray7;
        int[] nArray11 = nArray8;
        int[] nArray12 = nArray9;
        long l2 = (long)nArray11[8] & 0xFFFFFFFFL;
        long l3 = (long)nArray11[9] & 0xFFFFFFFFL;
        long l4 = (long)nArray11[10] & 0xFFFFFFFFL;
        long l5 = (long)nArray11[11] & 0xFFFFFFFFL;
        long l6 = (long)nArray11[12] & 0xFFFFFFFFL;
        long l7 = (long)nArray11[13] & 0xFFFFFFFFL;
        long l8 = (long)nArray11[14] & 0xFFFFFFFFL;
        long l9 = (long)nArray11[15] & 0xFFFFFFFFL;
        long l10 = (long)nArray12[8] & 0xFFFFFFFFL;
        long l11 = 0L + l10 * l2;
        nArray10[16] = (int)l11;
        l11 = (l11 >>> 32) + l10 * l3;
        nArray10[17] = (int)l11;
        l11 = (l11 >>> 32) + l10 * l4;
        nArray10[18] = (int)l11;
        l11 = (l11 >>> 32) + l10 * l5;
        nArray10[19] = (int)l11;
        l11 = (l11 >>> 32) + l10 * l6;
        nArray10[20] = (int)l11;
        l11 = (l11 >>> 32) + l10 * l7;
        nArray10[21] = (int)l11;
        l11 = (l11 >>> 32) + l10 * l8;
        nArray10[22] = (int)l11;
        l11 = (l11 >>> 32) + l10 * l9;
        nArray10[23] = (int)l11;
        nArray10[24] = (int)(l11 >>>= 32);
        for (int i2 = 1; i2 < 8; ++i2) {
            long l12 = (long)nArray12[i2 + 8] & 0xFFFFFFFFL;
            long l13 = 0L + (l12 * l2 + ((long)nArray10[++n2] & 0xFFFFFFFFL));
            nArray10[n2] = (int)l13;
            l13 = (l13 >>> 32) + (l12 * l3 + ((long)nArray10[n2 + 1] & 0xFFFFFFFFL));
            nArray10[n2 + 1] = (int)l13;
            l13 = (l13 >>> 32) + (l12 * l4 + ((long)nArray10[n2 + 2] & 0xFFFFFFFFL));
            nArray10[n2 + 2] = (int)l13;
            l13 = (l13 >>> 32) + (l12 * l5 + ((long)nArray10[n2 + 3] & 0xFFFFFFFFL));
            nArray10[n2 + 3] = (int)l13;
            l13 = (l13 >>> 32) + (l12 * l6 + ((long)nArray10[n2 + 4] & 0xFFFFFFFFL));
            nArray10[n2 + 4] = (int)l13;
            l13 = (l13 >>> 32) + (l12 * l7 + ((long)nArray10[n2 + 5] & 0xFFFFFFFFL));
            nArray10[n2 + 5] = (int)l13;
            l13 = (l13 >>> 32) + (l12 * l8 + ((long)nArray10[n2 + 6] & 0xFFFFFFFFL));
            nArray10[n2 + 6] = (int)l13;
            l13 = (l13 >>> 32) + (l12 * l9 + ((long)nArray10[n2 + 7] & 0xFFFFFFFFL));
            nArray10[n2 + 7] = (int)l13;
            nArray10[n2 + 8] = (int)(l13 >>>= 32);
        }
        int n3 = h.b(nArray7, nArray7);
        int n4 = n3 + h.a(nArray7, 0, nArray7, 8, 0);
        n3 += h.a(nArray7, 24, nArray7, 16, n4);
        int[] nArray13 = new int[8];
        int[] nArray14 = new int[8];
        boolean bl2 = h.c(nArray9, nArray9, nArray13) != h.c(nArray8, nArray8, nArray14);
        int[] nArray15 = new int[16];
        h.d(nArray13, nArray14, nArray15);
        ab.a(32, n3 += bl2 ? ab.a(16, nArray15, nArray7, 8) : ab.b(16, nArray15, nArray7, 8), nArray7, 24);
        n2 = nArray[16];
        int n5 = nArray2[16];
        nArray13 = nArray5;
        nArray14 = nArray;
        n3 = n5;
        nArray7 = nArray2;
        int n6 = n2;
        long l14 = 0L;
        long l15 = (long)n6 & 0xFFFFFFFFL;
        long l16 = (long)n3 & 0xFFFFFFFFL;
        n3 = 0;
        do {
            nArray13[n3 + 16] = (int)(l14 += l15 * ((long)nArray7[n3] & 0xFFFFFFFFL) + l16 * ((long)nArray14[n3] & 0xFFFFFFFFL) + ((long)nArray13[n3 + 16] & 0xFFFFFFFFL));
            l14 >>>= 32;
        } while (++n3 < 16);
        nArray5[32] = (int)l14 + n2 * n5;
        ar.e(nArray4, nArray3);
    }

    public static void b(int[] nArray, int[] nArray2) {
        if (ab.b(17, nArray)) {
            ab.d(17, nArray2);
            return;
        }
        ab.c(17, a, nArray, nArray2);
    }

    private static void e(int[] nArray, int[] nArray2) {
        int n2 = nArray[32];
        int n3 = (ab.a(nArray, n2, nArray2) >>> 23) + (n2 >>> 9) + ab.a(16, nArray, nArray2);
        if (n3 > 511 || n3 == 511 && ab.b(16, nArray2, a)) {
            n3 = n3 + ab.a(nArray2) & 0x1FF;
        }
        nArray2[16] = n3;
    }

    public static void a(int[] nArray) {
        int n2 = nArray[16];
        if ((n2 = ab.b(16, n2 >>> 9, nArray) + (n2 & 0x1FF)) > 511 || n2 == 511 && ab.b(16, nArray, a)) {
            n2 = n2 + ab.a(nArray) & 0x1FF;
        }
        nArray[16] = n2;
    }

    public static void c(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[33];
        ar.f(nArray, nArray3);
        ar.e(nArray3, nArray2);
    }

    public static void a(int[] nArray, int n2, int[] nArray2) {
        int[] nArray3 = new int[33];
        ar.f(nArray, nArray3);
        ar.e(nArray3, nArray2);
        while (--n2 > 0) {
            ar.f(nArray2, nArray3);
            ar.e(nArray3, nArray2);
        }
    }

    public static void c(int[] nArray, int[] nArray2, int[] nArray3) {
        int n2 = ab.c(16, nArray, nArray2, nArray3) + nArray[16] - nArray2[16];
        if (n2 < 0) {
            int n3;
            int n4;
            block2: {
                n4 = n2;
                nArray2 = nArray3;
                n2 = 0;
                while (n2 < 16) {
                    int n5 = n2++;
                    nArray2[n5] = nArray2[n5] - 1;
                    if (nArray2[n5] == -1) continue;
                    n3 = 0;
                    break block2;
                }
                n3 = -1;
            }
            n2 = n4 + n3 & 0x1FF;
        }
        nArray3[16] = n2;
    }

    public static void d(int[] nArray, int[] nArray2) {
        int n2 = nArray[16];
        int n3 = ab.a(16, nArray, n2 << 23, nArray2) | n2 << 1;
        nArray2[16] = n3 & 0x1FF;
    }

    private static void f(int[] nArray, int[] nArray2) {
        int n2;
        p.a(nArray, nArray2);
        int n3 = n2 = nArray[16];
        nArray2[32] = ab.e(n2 << 1, nArray, nArray2) + n3 * n3;
    }
}

