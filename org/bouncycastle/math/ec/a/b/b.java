/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.b;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.openpgp.h;

public final class b {
    static final int[] a = new int[]{-1, -1, 0, -1, -1, -1, -1, -2};
    private static int[] b = new int[]{1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    public static void a(int[] nArray, int[] nArray2, int[] nArray3) {
        if (h.a(nArray, nArray2, nArray3) != 0 || nArray3[7] >>> 1 >= Integer.MAX_VALUE && h.d(nArray3, a)) {
            org.bouncycastle.math.ec.a.b.b.a(nArray3);
        }
    }

    public static void a(int[] nArray, int[] nArray2) {
        if (ab.d(8, nArray, nArray2) != 0 || nArray2[7] >>> 1 >= Integer.MAX_VALUE && h.d(nArray2, a)) {
            org.bouncycastle.math.ec.a.b.b.a(nArray2);
        }
    }

    public static int[] a(BigInteger object) {
        int[] nArray = h.a((BigInteger)object);
        object = nArray;
        if (nArray[7] >>> 1 >= Integer.MAX_VALUE && h.d((int[])object, a)) {
            h.h(a, (int[])object);
        }
        return object;
    }

    public static void b(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4 = new int[16];
        h.d(nArray, nArray2, nArray4);
        org.bouncycastle.math.ec.a.b.b.c(nArray4, nArray3);
    }

    public static void c(int[] nArray, int[] nArray2, int[] nArray3) {
        if (h.e(nArray, nArray2, nArray3) != 0 || nArray3[15] >>> 1 >= Integer.MAX_VALUE && ab.c(16, nArray3, b)) {
            ab.f(16, b, nArray3);
        }
    }

    public static void b(int[] nArray, int[] nArray2) {
        if (h.b(nArray)) {
            h.d(nArray2);
            return;
        }
        h.g(a, nArray, nArray2);
    }

    public static void c(int[] nArray, int[] nArray2) {
        long l2 = (long)nArray[8] & 0xFFFFFFFFL;
        long l3 = (long)nArray[9] & 0xFFFFFFFFL;
        long l4 = (long)nArray[10] & 0xFFFFFFFFL;
        long l5 = (long)nArray[11] & 0xFFFFFFFFL;
        long l6 = (long)nArray[12] & 0xFFFFFFFFL;
        long l7 = (long)nArray[13] & 0xFFFFFFFFL;
        long l8 = (long)nArray[14] & 0xFFFFFFFFL;
        long l9 = (long)nArray[15] & 0xFFFFFFFFL;
        long l10 = l2 + l3;
        long l11 = l4 + l5;
        long l12 = l6 + l9;
        long l13 = l7 + l8;
        long l14 = l13 + (l9 << 1);
        long l15 = l10 + l13;
        long l16 = l11 + l12 + l15;
        long l17 = 0L + (((long)nArray[0] & 0xFFFFFFFFL) + l16 + l7 + l8 + l9);
        nArray2[0] = (int)l17;
        l17 = (l17 >> 32) + (((long)nArray[1] & 0xFFFFFFFFL) + l16 - l2 + l8 + l9);
        nArray2[1] = (int)l17;
        l17 = (l17 >> 32) + (((long)nArray[2] & 0xFFFFFFFFL) - l15);
        nArray2[2] = (int)l17;
        l17 = (l17 >> 32) + (((long)nArray[3] & 0xFFFFFFFFL) + l16 - l3 - l4 + l7);
        nArray2[3] = (int)l17;
        l17 = (l17 >> 32) + (((long)nArray[4] & 0xFFFFFFFFL) + l16 - l11 - l2 + l8);
        nArray2[4] = (int)l17;
        l17 = (l17 >> 32) + (((long)nArray[5] & 0xFFFFFFFFL) + l14 + l4);
        nArray2[5] = (int)l17;
        l17 = (l17 >> 32) + (((long)nArray[6] & 0xFFFFFFFFL) + l5 + l8 + l9);
        nArray2[6] = (int)l17;
        l17 = (l17 >> 32) + (((long)nArray[7] & 0xFFFFFFFFL) + l16 + l14 + l6);
        nArray2[7] = (int)l17;
        org.bouncycastle.math.ec.a.b.b.a((int)(l17 >> 32), nArray2);
    }

    public static void a(int n2, int[] nArray) {
        long l2 = 0L;
        if (n2 != 0) {
            long l3 = (long)n2 & 0xFFFFFFFFL;
            l2 = 0L + (((long)nArray[0] & 0xFFFFFFFFL) + l3);
            nArray[0] = (int)l2;
            if ((l2 >>= 32) != 0L) {
                nArray[1] = (int)(l2 += (long)nArray[1] & 0xFFFFFFFFL);
                l2 >>= 32;
            }
            nArray[2] = (int)(l2 += ((long)nArray[2] & 0xFFFFFFFFL) - l3);
            l2 = (l2 >> 32) + (((long)nArray[3] & 0xFFFFFFFFL) + l3);
            nArray[3] = (int)l2;
            if ((l2 >>= 32) != 0L) {
                nArray[4] = (int)(l2 += (long)nArray[4] & 0xFFFFFFFFL);
                l2 = (l2 >> 32) + ((long)nArray[5] & 0xFFFFFFFFL);
                nArray[5] = (int)l2;
                l2 = (l2 >> 32) + ((long)nArray[6] & 0xFFFFFFFFL);
                nArray[6] = (int)l2;
                l2 >>= 32;
            }
            nArray[7] = (int)(l2 += ((long)nArray[7] & 0xFFFFFFFFL) + l3);
            l2 >>= 32;
        }
        if (l2 != 0L || nArray[7] >>> 1 >= Integer.MAX_VALUE && h.d(nArray, a)) {
            org.bouncycastle.math.ec.a.b.b.a(nArray);
        }
    }

    public static void d(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[16];
        h.f(nArray, nArray3);
        org.bouncycastle.math.ec.a.b.b.c(nArray3, nArray2);
    }

    public static void a(int[] nArray, int n2, int[] nArray2) {
        int[] nArray3 = new int[16];
        h.f(nArray, nArray3);
        org.bouncycastle.math.ec.a.b.b.c(nArray3, nArray2);
        while (--n2 > 0) {
            h.f(nArray2, nArray3);
            org.bouncycastle.math.ec.a.b.b.c(nArray3, nArray2);
        }
    }

    public static void d(int[] nArray, int[] nArray2, int[] nArray3) {
        if (h.g(nArray, nArray2, nArray3) != 0) {
            nArray = nArray3;
            long l2 = ((long)nArray3[0] & 0xFFFFFFFFL) - 1L;
            nArray[0] = (int)l2;
            if ((l2 >>= 32) != 0L) {
                nArray[1] = (int)(l2 += (long)nArray[1] & 0xFFFFFFFFL);
                l2 >>= 32;
            }
            nArray[2] = (int)(l2 += ((long)nArray[2] & 0xFFFFFFFFL) + 1L);
            l2 = (l2 >> 32) + (((long)nArray[3] & 0xFFFFFFFFL) - 1L);
            nArray[3] = (int)l2;
            if ((l2 >>= 32) != 0L) {
                nArray[4] = (int)(l2 += (long)nArray[4] & 0xFFFFFFFFL);
                l2 = (l2 >> 32) + ((long)nArray[5] & 0xFFFFFFFFL);
                nArray[5] = (int)l2;
                l2 = (l2 >> 32) + ((long)nArray[6] & 0xFFFFFFFFL);
                nArray[6] = (int)l2;
                l2 >>= 32;
            }
            nArray[7] = (int)(l2 += ((long)nArray[7] & 0xFFFFFFFFL) - 1L);
        }
    }

    public static void e(int[] nArray, int[] nArray2) {
        if (ab.a(8, nArray, 0, nArray2) != 0 || nArray2[7] >>> 1 >= Integer.MAX_VALUE && h.d(nArray2, a)) {
            org.bouncycastle.math.ec.a.b.b.a(nArray2);
        }
    }

    private static void a(int[] nArray) {
        long l2 = ((long)nArray[0] & 0xFFFFFFFFL) + 1L;
        nArray[0] = (int)l2;
        if ((l2 >>= 32) != 0L) {
            nArray[1] = (int)(l2 += (long)nArray[1] & 0xFFFFFFFFL);
            l2 >>= 32;
        }
        nArray[2] = (int)(l2 += ((long)nArray[2] & 0xFFFFFFFFL) - 1L);
        l2 = (l2 >> 32) + (((long)nArray[3] & 0xFFFFFFFFL) + 1L);
        nArray[3] = (int)l2;
        if ((l2 >>= 32) != 0L) {
            nArray[4] = (int)(l2 += (long)nArray[4] & 0xFFFFFFFFL);
            l2 = (l2 >> 32) + ((long)nArray[5] & 0xFFFFFFFFL);
            nArray[5] = (int)l2;
            l2 = (l2 >> 32) + ((long)nArray[6] & 0xFFFFFFFFL);
            nArray[6] = (int)l2;
            l2 >>= 32;
        }
        nArray[7] = (int)(l2 += ((long)nArray[7] & 0xFFFFFFFFL) + 1L);
    }
}

