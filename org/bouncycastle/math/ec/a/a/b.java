/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.a;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.openpgp.h;

public final class b {
    static final int[] a = new int[]{-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] b = new int[]{361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 0x3FFFFFFF};

    public static void a(int[] nArray, int[] nArray2, int[] nArray3) {
        h.a(nArray, nArray2, nArray3);
        if (h.d(nArray3, a)) {
            org.bouncycastle.math.ec.a.a.b.a(nArray3);
        }
    }

    public static void a(int[] nArray, int[] nArray2) {
        ab.d(8, nArray, nArray2);
        if (h.d(nArray2, a)) {
            org.bouncycastle.math.ec.a.a.b.a(nArray2);
        }
    }

    public static int[] a(BigInteger object) {
        object = h.a((BigInteger)object);
        while (h.d((int[])object, a)) {
            h.h(a, (int[])object);
        }
        return object;
    }

    public static void b(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4 = new int[16];
        h.d(nArray, nArray2, nArray4);
        org.bouncycastle.math.ec.a.a.b.c(nArray4, nArray3);
    }

    public static void c(int[] nArray, int[] nArray2, int[] nArray3) {
        h.e(nArray, nArray2, nArray3);
        if (ab.c(16, nArray3, b)) {
            nArray = nArray3;
            long l2 = ((long)nArray3[0] & 0xFFFFFFFFL) - ((long)b[0] & 0xFFFFFFFFL);
            nArray[0] = (int)l2;
            if ((l2 >>= 32) != 0L) {
                l2 = ab.a(8, nArray, 1);
            }
            nArray[8] = (int)(l2 += ((long)nArray[8] & 0xFFFFFFFFL) + 19L);
            if ((l2 >>= 32) != 0L) {
                l2 = ab.b(15, nArray, 9);
            }
            nArray[15] = (int)(l2 += ((long)nArray[15] & 0xFFFFFFFFL) - ((long)(b[15] + 1) & 0xFFFFFFFFL));
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
        int n2 = nArray[7];
        ab.b(nArray, n2, nArray2);
        int n3 = h.e(nArray, nArray2) << 1;
        int n4 = nArray2[7];
        n3 += (n4 >>> 31) - (n2 >>> 31);
        nArray2[7] = n4 = (n4 & Integer.MAX_VALUE) + ab.b(7, n3 * 19, nArray2);
        if (h.d(nArray2, a)) {
            org.bouncycastle.math.ec.a.a.b.a(nArray2);
        }
    }

    public static void a(int n2, int[] nArray) {
        int n3 = nArray[7];
        n2 = n2 << 1 | n3 >>> 31;
        nArray[7] = n3 = (n3 & Integer.MAX_VALUE) + ab.b(7, n2 * 19, nArray);
        if (h.d(nArray, a)) {
            org.bouncycastle.math.ec.a.a.b.a(nArray);
        }
    }

    public static void d(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[16];
        h.f(nArray, nArray3);
        org.bouncycastle.math.ec.a.a.b.c(nArray3, nArray2);
    }

    public static void a(int[] nArray, int n2, int[] nArray2) {
        int[] nArray3 = new int[16];
        h.f(nArray, nArray3);
        org.bouncycastle.math.ec.a.a.b.c(nArray3, nArray2);
        while (--n2 > 0) {
            h.f(nArray2, nArray3);
            org.bouncycastle.math.ec.a.a.b.c(nArray3, nArray2);
        }
    }

    public static void d(int[] nArray, int[] nArray2, int[] nArray3) {
        if (h.g(nArray, nArray2, nArray3) != 0) {
            nArray = nArray3;
            long l2 = ((long)nArray3[0] & 0xFFFFFFFFL) - 19L;
            nArray[0] = (int)l2;
            if ((l2 >>= 32) != 0L) {
                l2 = ab.a(7, nArray, 1);
            }
            nArray[7] = (int)(l2 += ((long)nArray[7] & 0xFFFFFFFFL) + 0x80000000L);
        }
    }

    public static void e(int[] nArray, int[] nArray2) {
        ab.a(8, nArray, 0, nArray2);
        if (h.d(nArray2, a)) {
            org.bouncycastle.math.ec.a.a.b.a(nArray2);
        }
    }

    private static int a(int[] nArray) {
        long l2 = ((long)nArray[0] & 0xFFFFFFFFL) + 19L;
        nArray[0] = (int)l2;
        if ((l2 >>= 32) != 0L) {
            l2 = ab.b(7, nArray, 1);
        }
        nArray[7] = (int)(l2 += ((long)nArray[7] & 0xFFFFFFFFL) - 0x80000000L);
        return (int)(l2 >> 32);
    }
}

