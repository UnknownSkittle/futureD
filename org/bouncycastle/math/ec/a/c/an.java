/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;

public final class an {
    static final int[] a = new int[]{-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    private static int[] b = new int[]{1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] c = new int[]{-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void a(int[] nArray, int[] nArray2, int[] nArray3) {
        if (ab.a(12, nArray, nArray2, nArray3) != 0 || nArray3[11] == -1 && ab.c(12, nArray3, a)) {
            an.a(nArray3);
        }
    }

    public static void b(int[] nArray, int[] nArray2, int[] nArray3) {
        if ((ab.a(24, nArray, nArray2, nArray3) != 0 || nArray3[23] == -1 && ab.c(24, nArray3, b)) && ab.a(17, c, nArray3) != 0) {
            ab.b(24, nArray3, 17);
        }
    }

    public static void a(int[] nArray, int[] nArray2) {
        if (ab.d(12, nArray, nArray2) != 0 || nArray2[11] == -1 && ab.c(12, nArray2, a)) {
            an.a(nArray2);
        }
    }

    public static int[] a(BigInteger object) {
        int[] nArray = ab.a(384, (BigInteger)object);
        object = nArray;
        if (nArray[11] == -1 && ab.c(12, (int[])object, a)) {
            ab.f(12, a, (int[])object);
        }
        return object;
    }

    public static void c(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4 = new int[24];
        ab.b(nArray, nArray2, nArray4);
        an.c(nArray4, nArray3);
    }

    public static void b(int[] nArray, int[] nArray2) {
        if (ab.b(12, nArray)) {
            ab.d(12, nArray2);
            return;
        }
        ab.c(12, a, nArray, nArray2);
    }

    public static void c(int[] nArray, int[] nArray2) {
        long l2 = (long)nArray[16] & 0xFFFFFFFFL;
        long l3 = (long)nArray[17] & 0xFFFFFFFFL;
        long l4 = (long)nArray[18] & 0xFFFFFFFFL;
        long l5 = (long)nArray[19] & 0xFFFFFFFFL;
        long l6 = (long)nArray[20] & 0xFFFFFFFFL;
        long l7 = (long)nArray[21] & 0xFFFFFFFFL;
        long l8 = (long)nArray[22] & 0xFFFFFFFFL;
        long l9 = (long)nArray[23] & 0xFFFFFFFFL;
        long l10 = ((long)nArray[12] & 0xFFFFFFFFL) + l6 - 1L;
        long l11 = ((long)nArray[13] & 0xFFFFFFFFL) + l8;
        long l12 = ((long)nArray[14] & 0xFFFFFFFFL) + l8 + l9;
        long l13 = ((long)nArray[15] & 0xFFFFFFFFL) + l9;
        long l14 = l3 + l7;
        long l15 = l7 - l9;
        long l16 = l8 - l9;
        long l17 = l10 + l15;
        long l18 = 0L + (((long)nArray[0] & 0xFFFFFFFFL) + l17);
        nArray2[0] = (int)l18;
        l18 = (l18 >> 32) + (((long)nArray[1] & 0xFFFFFFFFL) + l9 - l10 + l11);
        nArray2[1] = (int)l18;
        l18 = (l18 >> 32) + (((long)nArray[2] & 0xFFFFFFFFL) - l7 - l11 + l12);
        nArray2[2] = (int)l18;
        l18 = (l18 >> 32) + (((long)nArray[3] & 0xFFFFFFFFL) - l12 + l13 + l17);
        nArray2[3] = (int)l18;
        l18 = (l18 >> 32) + (((long)nArray[4] & 0xFFFFFFFFL) + l2 + l7 + l11 - l13 + l17);
        nArray2[4] = (int)l18;
        l18 = (l18 >> 32) + (((long)nArray[5] & 0xFFFFFFFFL) - l2 + l11 + l12 + l14);
        nArray2[5] = (int)l18;
        l18 = (l18 >> 32) + (((long)nArray[6] & 0xFFFFFFFFL) + l4 - l3 + l12 + l13);
        nArray2[6] = (int)l18;
        l18 = (l18 >> 32) + (((long)nArray[7] & 0xFFFFFFFFL) + l2 + l5 - l4 + l13);
        nArray2[7] = (int)l18;
        l18 = (l18 >> 32) + (((long)nArray[8] & 0xFFFFFFFFL) + l2 + l3 + l6 - l5);
        nArray2[8] = (int)l18;
        l18 = (l18 >> 32) + (((long)nArray[9] & 0xFFFFFFFFL) + l4 - l6 + l14);
        nArray2[9] = (int)l18;
        l18 = (l18 >> 32) + (((long)nArray[10] & 0xFFFFFFFFL) + l4 + l5 - l15 + l16);
        nArray2[10] = (int)l18;
        l18 = (l18 >> 32) + (((long)nArray[11] & 0xFFFFFFFFL) + l5 + l6 - l16);
        nArray2[11] = (int)l18;
        an.a((int)((l18 >> 32) + 1L), nArray2);
    }

    public static void a(int n2, int[] nArray) {
        long l2 = 0L;
        if (n2 != 0) {
            long l3 = (long)n2 & 0xFFFFFFFFL;
            l2 = 0L + (((long)nArray[0] & 0xFFFFFFFFL) + l3);
            nArray[0] = (int)l2;
            l2 = (l2 >> 32) + (((long)nArray[1] & 0xFFFFFFFFL) - l3);
            nArray[1] = (int)l2;
            if ((l2 >>= 32) != 0L) {
                nArray[2] = (int)(l2 += (long)nArray[2] & 0xFFFFFFFFL);
                l2 >>= 32;
            }
            nArray[3] = (int)(l2 += ((long)nArray[3] & 0xFFFFFFFFL) + l3);
            l2 = (l2 >> 32) + (((long)nArray[4] & 0xFFFFFFFFL) + l3);
            nArray[4] = (int)l2;
            l2 >>= 32;
        }
        if (l2 != 0L && ab.b(12, nArray, 5) != 0 || nArray[11] == -1 && ab.c(12, nArray, a)) {
            an.a(nArray);
        }
    }

    public static void d(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[24];
        ab.a(nArray, nArray3);
        an.c(nArray3, nArray2);
    }

    public static void a(int[] nArray, int n2, int[] nArray2) {
        int[] nArray3 = new int[24];
        ab.a(nArray, nArray3);
        an.c(nArray3, nArray2);
        while (--n2 > 0) {
            ab.a(nArray2, nArray3);
            an.c(nArray3, nArray2);
        }
    }

    public static void d(int[] nArray, int[] nArray2, int[] nArray3) {
        if (ab.c(12, nArray, nArray2, nArray3) != 0) {
            nArray = nArray3;
            long l2 = ((long)nArray3[0] & 0xFFFFFFFFL) - 1L;
            nArray[0] = (int)l2;
            l2 = (l2 >> 32) + (((long)nArray[1] & 0xFFFFFFFFL) + 1L);
            nArray[1] = (int)l2;
            if ((l2 >>= 32) != 0L) {
                nArray[2] = (int)(l2 += (long)nArray[2] & 0xFFFFFFFFL);
                l2 >>= 32;
            }
            nArray[3] = (int)(l2 += ((long)nArray[3] & 0xFFFFFFFFL) - 1L);
            l2 = (l2 >> 32) + (((long)nArray[4] & 0xFFFFFFFFL) - 1L);
            nArray[4] = (int)l2;
            if (l2 >> 32 != 0L) {
                ab.a(12, nArray, 5);
            }
        }
    }

    public static void e(int[] nArray, int[] nArray2) {
        if (ab.a(12, nArray, 0, nArray2) != 0 || nArray2[11] == -1 && ab.c(12, nArray2, a)) {
            an.a(nArray2);
        }
    }

    private static void a(int[] nArray) {
        long l2 = ((long)nArray[0] & 0xFFFFFFFFL) + 1L;
        nArray[0] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray[1] & 0xFFFFFFFFL) - 1L);
        nArray[1] = (int)l2;
        if ((l2 >>= 32) != 0L) {
            nArray[2] = (int)(l2 += (long)nArray[2] & 0xFFFFFFFFL);
            l2 >>= 32;
        }
        nArray[3] = (int)(l2 += ((long)nArray[3] & 0xFFFFFFFFL) + 1L);
        l2 = (l2 >> 32) + (((long)nArray[4] & 0xFFFFFFFFL) + 1L);
        nArray[4] = (int)l2;
        if (l2 >> 32 != 0L) {
            ab.b(12, nArray, 5);
        }
    }
}

