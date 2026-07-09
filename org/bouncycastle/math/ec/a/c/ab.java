/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.math.b.a;

public final class ab {
    static final int[] a = new int[]{1, 0, 0, -1, -1, -1, -1};
    private static int[] b = new int[]{1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    private static final int[] c = new int[]{-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void a(int[] nArray, int[] nArray2, int[] nArray3) {
        if (org.bouncycastle.math.b.a.a(nArray, nArray2, nArray3) != 0 || nArray3[6] == -1 && org.bouncycastle.math.b.a.c(nArray3, a)) {
            ab.a(nArray3);
        }
    }

    public static void a(int[] nArray, int[] nArray2) {
        if (org.bouncycastle.asn1.k.ab.d(7, nArray, nArray2) != 0 || nArray2[6] == -1 && org.bouncycastle.math.b.a.c(nArray2, a)) {
            ab.a(nArray2);
        }
    }

    public static int[] a(BigInteger object) {
        int[] nArray = org.bouncycastle.math.b.a.a((BigInteger)object);
        object = nArray;
        if (nArray[6] == -1 && org.bouncycastle.math.b.a.c((int[])object, a)) {
            Object object2 = object;
            int[] nArray2 = a;
            long l2 = 0L + (((long)object2[0] & 0xFFFFFFFFL) - ((long)nArray2[0] & 0xFFFFFFFFL));
            object2[0] = (int)l2;
            l2 = (l2 >> 32) + (((long)object2[1] & 0xFFFFFFFFL) - ((long)nArray2[1] & 0xFFFFFFFFL));
            object2[1] = (int)l2;
            l2 = (l2 >> 32) + (((long)object2[2] & 0xFFFFFFFFL) - ((long)nArray2[2] & 0xFFFFFFFFL));
            object2[2] = (int)l2;
            l2 = (l2 >> 32) + (((long)object2[3] & 0xFFFFFFFFL) - ((long)nArray2[3] & 0xFFFFFFFFL));
            object2[3] = (int)l2;
            l2 = (l2 >> 32) + (((long)object2[4] & 0xFFFFFFFFL) - ((long)nArray2[4] & 0xFFFFFFFFL));
            object2[4] = (int)l2;
            l2 = (l2 >> 32) + (((long)object2[5] & 0xFFFFFFFFL) - ((long)nArray2[5] & 0xFFFFFFFFL));
            object2[5] = (int)l2;
            l2 = (l2 >> 32) + (((long)object2[6] & 0xFFFFFFFFL) - ((long)nArray2[6] & 0xFFFFFFFFL));
            object2[6] = (int)l2;
        }
        return object;
    }

    public static void b(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4 = new int[14];
        org.bouncycastle.math.b.a.c(nArray, nArray2, nArray4);
        ab.c(nArray4, nArray3);
    }

    public static void c(int[] nArray, int[] nArray2, int[] nArray3) {
        if ((org.bouncycastle.math.b.a.d(nArray, nArray2, nArray3) != 0 || nArray3[13] == -1 && org.bouncycastle.asn1.k.ab.c(14, nArray3, b)) && org.bouncycastle.asn1.k.ab.a(11, c, nArray3) != 0) {
            org.bouncycastle.asn1.k.ab.b(14, nArray3, 11);
        }
    }

    public static void b(int[] nArray, int[] nArray2) {
        if (org.bouncycastle.math.b.a.b(nArray)) {
            org.bouncycastle.math.b.a.d(nArray2);
            return;
        }
        org.bouncycastle.math.b.a.f(a, nArray, nArray2);
    }

    public static void c(int[] nArray, int[] nArray2) {
        long l2 = (long)nArray[10] & 0xFFFFFFFFL;
        long l3 = (long)nArray[11] & 0xFFFFFFFFL;
        long l4 = (long)nArray[12] & 0xFFFFFFFFL;
        long l5 = (long)nArray[13] & 0xFFFFFFFFL;
        long l6 = ((long)nArray[7] & 0xFFFFFFFFL) + l3 - 1L;
        long l7 = ((long)nArray[8] & 0xFFFFFFFFL) + l4;
        long l8 = ((long)nArray[9] & 0xFFFFFFFFL) + l5;
        long l9 = 0L + (((long)nArray[0] & 0xFFFFFFFFL) - l6);
        long l10 = l9 & 0xFFFFFFFFL;
        l9 = (l9 >> 32) + (((long)nArray[1] & 0xFFFFFFFFL) - l7);
        nArray2[1] = (int)l9;
        l9 = (l9 >> 32) + (((long)nArray[2] & 0xFFFFFFFFL) - l8);
        nArray2[2] = (int)l9;
        l9 = (l9 >> 32) + (((long)nArray[3] & 0xFFFFFFFFL) + l6 - l2);
        long l11 = l9 & 0xFFFFFFFFL;
        l9 = (l9 >> 32) + (((long)nArray[4] & 0xFFFFFFFFL) + l7 - l3);
        nArray2[4] = (int)l9;
        l9 = (l9 >> 32) + (((long)nArray[5] & 0xFFFFFFFFL) + l8 - l4);
        nArray2[5] = (int)l9;
        l9 = (l9 >> 32) + (((long)nArray[6] & 0xFFFFFFFFL) + l2 - l5);
        nArray2[6] = (int)l9;
        l9 = (l9 >> 32) + 1L;
        l11 += l9;
        nArray2[0] = (int)(l10 -= l9);
        l9 = l10 >> 32;
        if (l9 != 0L) {
            nArray2[1] = (int)(l9 += (long)nArray2[1] & 0xFFFFFFFFL);
            l9 = (l9 >> 32) + ((long)nArray2[2] & 0xFFFFFFFFL);
            nArray2[2] = (int)l9;
            l11 += l9 >> 32;
        }
        nArray2[3] = (int)l11;
        if (l11 >> 32 != 0L && org.bouncycastle.asn1.k.ab.b(7, nArray2, 4) != 0 || nArray2[6] == -1 && org.bouncycastle.math.b.a.c(nArray2, a)) {
            ab.a(nArray2);
        }
    }

    public static void a(int n2, int[] nArray) {
        long l2 = 0L;
        if (n2 != 0) {
            long l3 = (long)n2 & 0xFFFFFFFFL;
            l2 = 0L + (((long)nArray[0] & 0xFFFFFFFFL) - l3);
            nArray[0] = (int)l2;
            if ((l2 >>= 32) != 0L) {
                nArray[1] = (int)(l2 += (long)nArray[1] & 0xFFFFFFFFL);
                l2 = (l2 >> 32) + ((long)nArray[2] & 0xFFFFFFFFL);
                nArray[2] = (int)l2;
                l2 >>= 32;
            }
            nArray[3] = (int)(l2 += ((long)nArray[3] & 0xFFFFFFFFL) + l3);
            l2 >>= 32;
        }
        if (l2 != 0L && org.bouncycastle.asn1.k.ab.b(7, nArray, 4) != 0 || nArray[6] == -1 && org.bouncycastle.math.b.a.c(nArray, a)) {
            ab.a(nArray);
        }
    }

    public static void d(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[14];
        org.bouncycastle.math.b.a.d(nArray, nArray3);
        ab.c(nArray3, nArray2);
    }

    public static void a(int[] nArray, int n2, int[] nArray2) {
        int[] nArray3 = new int[14];
        org.bouncycastle.math.b.a.d(nArray, nArray3);
        ab.c(nArray3, nArray2);
        while (--n2 > 0) {
            org.bouncycastle.math.b.a.d(nArray2, nArray3);
            ab.c(nArray3, nArray2);
        }
    }

    public static void d(int[] nArray, int[] nArray2, int[] nArray3) {
        if (org.bouncycastle.math.b.a.f(nArray, nArray2, nArray3) != 0) {
            nArray = nArray3;
            long l2 = ((long)nArray3[0] & 0xFFFFFFFFL) + 1L;
            nArray[0] = (int)l2;
            if ((l2 >>= 32) != 0L) {
                nArray[1] = (int)(l2 += (long)nArray[1] & 0xFFFFFFFFL);
                l2 = (l2 >> 32) + ((long)nArray[2] & 0xFFFFFFFFL);
                nArray[2] = (int)l2;
                l2 >>= 32;
            }
            nArray[3] = (int)(l2 += ((long)nArray[3] & 0xFFFFFFFFL) - 1L);
            if (l2 >> 32 != 0L) {
                org.bouncycastle.asn1.k.ab.a(7, nArray, 4);
            }
        }
    }

    public static void e(int[] nArray, int[] nArray2) {
        if (org.bouncycastle.asn1.k.ab.a(7, nArray, 0, nArray2) != 0 || nArray2[6] == -1 && org.bouncycastle.math.b.a.c(nArray2, a)) {
            ab.a(nArray2);
        }
    }

    private static void a(int[] nArray) {
        long l2 = ((long)nArray[0] & 0xFFFFFFFFL) - 1L;
        nArray[0] = (int)l2;
        if ((l2 >>= 32) != 0L) {
            nArray[1] = (int)(l2 += (long)nArray[1] & 0xFFFFFFFFL);
            l2 = (l2 >> 32) + ((long)nArray[2] & 0xFFFFFFFFL);
            nArray[2] = (int)l2;
            l2 >>= 32;
        }
        nArray[3] = (int)(l2 += ((long)nArray[3] & 0xFFFFFFFFL) + 1L);
        if (l2 >> 32 != 0L) {
            org.bouncycastle.asn1.k.ab.b(7, nArray, 4);
        }
    }
}

