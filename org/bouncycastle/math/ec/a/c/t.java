/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.ec.a;

public final class t {
    static final int[] a = new int[]{-1, -1, -2, -1, -1, -1};
    private static int[] b = new int[]{1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    private static final int[] c = new int[]{-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void a(int[] nArray, int[] nArray2, int[] nArray3) {
        if (org.bouncycastle.math.ec.a.a(nArray, nArray2, nArray3) != 0 || nArray3[5] == -1 && org.bouncycastle.math.ec.a.c(nArray3, a)) {
            t.a(nArray3);
        }
    }

    public static void a(int[] nArray, int[] nArray2) {
        if (ab.d(6, nArray, nArray2) != 0 || nArray2[5] == -1 && org.bouncycastle.math.ec.a.c(nArray2, a)) {
            t.a(nArray2);
        }
    }

    public static int[] a(BigInteger object) {
        int[] nArray = org.bouncycastle.math.ec.a.a((BigInteger)object);
        object = nArray;
        if (nArray[5] == -1 && org.bouncycastle.math.ec.a.c((int[])object, a)) {
            org.bouncycastle.math.ec.a.e(a, (int[])object);
        }
        return object;
    }

    public static void b(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4 = new int[12];
        org.bouncycastle.math.ec.a.d(nArray, nArray2, nArray4);
        t.c(nArray4, nArray3);
    }

    public static void c(int[] nArray, int[] nArray2, int[] nArray3) {
        if ((org.bouncycastle.math.ec.a.e(nArray, nArray2, nArray3) != 0 || nArray3[11] == -1 && ab.c(12, nArray3, b)) && ab.a(9, c, nArray3) != 0) {
            ab.b(12, nArray3, 9);
        }
    }

    public static void b(int[] nArray, int[] nArray2) {
        if (org.bouncycastle.math.ec.a.b(nArray)) {
            org.bouncycastle.math.ec.a.d(nArray2);
            return;
        }
        org.bouncycastle.math.ec.a.g(a, nArray, nArray2);
    }

    public static void c(int[] nArray, int[] nArray2) {
        long l2 = (long)nArray[6] & 0xFFFFFFFFL;
        long l3 = (long)nArray[7] & 0xFFFFFFFFL;
        long l4 = (long)nArray[8] & 0xFFFFFFFFL;
        long l5 = (long)nArray[9] & 0xFFFFFFFFL;
        long l6 = (long)nArray[10] & 0xFFFFFFFFL;
        long l7 = (long)nArray[11] & 0xFFFFFFFFL;
        long l8 = l2 + l6;
        long l9 = l3 + l7;
        long l10 = 0L + (((long)nArray[0] & 0xFFFFFFFFL) + l8);
        int n2 = (int)l10;
        l10 = (l10 >> 32) + (((long)nArray[1] & 0xFFFFFFFFL) + l9);
        nArray2[1] = (int)l10;
        l10 >>= 32;
        long l11 = (l10 += ((long)nArray[2] & 0xFFFFFFFFL) + (l8 += l4)) & 0xFFFFFFFFL;
        l10 = (l10 >> 32) + (((long)nArray[3] & 0xFFFFFFFFL) + (l9 += l5));
        nArray2[3] = (int)l10;
        l10 >>= 32;
        nArray2[4] = (int)(l10 += ((long)nArray[4] & 0xFFFFFFFFL) + (l8 -= l2));
        l10 = (l10 >> 32) + (((long)nArray[5] & 0xFFFFFFFFL) + (l9 -= l3));
        nArray2[5] = (int)l10;
        l11 += (l10 >>= 32);
        nArray2[0] = (int)(l10 += (long)n2 & 0xFFFFFFFFL);
        if ((l10 >>= 32) != 0L) {
            nArray2[1] = (int)(l10 += (long)nArray2[1] & 0xFFFFFFFFL);
            l11 += l10 >> 32;
        }
        nArray2[2] = (int)l11;
        if (l11 >> 32 != 0L && ab.b(6, nArray2, 3) != 0 || nArray2[5] == -1 && org.bouncycastle.math.ec.a.c(nArray2, a)) {
            t.a(nArray2);
        }
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
            nArray[2] = (int)(l2 += ((long)nArray[2] & 0xFFFFFFFFL) + l3);
            l2 >>= 32;
        }
        if (l2 != 0L && ab.b(6, nArray, 3) != 0 || nArray[5] == -1 && org.bouncycastle.math.ec.a.c(nArray, a)) {
            t.a(nArray);
        }
    }

    public static void d(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[12];
        org.bouncycastle.math.ec.a.d(nArray, nArray3);
        t.c(nArray3, nArray2);
    }

    public static void a(int[] nArray, int n2, int[] nArray2) {
        int[] nArray3 = new int[12];
        org.bouncycastle.math.ec.a.d(nArray, nArray3);
        t.c(nArray3, nArray2);
        while (--n2 > 0) {
            org.bouncycastle.math.ec.a.d(nArray2, nArray3);
            t.c(nArray3, nArray2);
        }
    }

    public static void d(int[] nArray, int[] nArray2, int[] nArray3) {
        if (org.bouncycastle.math.ec.a.g(nArray, nArray2, nArray3) != 0) {
            nArray = nArray3;
            long l2 = ((long)nArray3[0] & 0xFFFFFFFFL) - 1L;
            nArray[0] = (int)l2;
            if ((l2 >>= 32) != 0L) {
                nArray[1] = (int)(l2 += (long)nArray[1] & 0xFFFFFFFFL);
                l2 >>= 32;
            }
            nArray[2] = (int)(l2 += ((long)nArray[2] & 0xFFFFFFFFL) - 1L);
            if (l2 >> 32 != 0L) {
                ab.a(6, nArray, 3);
            }
        }
    }

    public static void e(int[] nArray, int[] nArray2) {
        if (ab.a(6, nArray, 0, nArray2) != 0 || nArray2[5] == -1 && org.bouncycastle.math.ec.a.c(nArray2, a)) {
            t.a(nArray2);
        }
    }

    private static void a(int[] nArray) {
        long l2 = ((long)nArray[0] & 0xFFFFFFFFL) + 1L;
        nArray[0] = (int)l2;
        if ((l2 >>= 32) != 0L) {
            nArray[1] = (int)(l2 += (long)nArray[1] & 0xFFFFFFFFL);
            l2 >>= 32;
        }
        nArray[2] = (int)(l2 += ((long)nArray[2] & 0xFFFFFFFFL) + 1L);
        if (l2 >> 32 != 0L) {
            ab.b(6, nArray, 3);
        }
    }
}

