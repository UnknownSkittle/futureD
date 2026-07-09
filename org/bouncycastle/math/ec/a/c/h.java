/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.jcajce.provider.c.a;

public final class h {
    static final int[] a = new int[]{Integer.MAX_VALUE, -1, -1, -1, -1};
    private static int[] b = new int[]{1, 0x40000001, 0, 0, 0, -2, -2, -1, -1, -1};
    private static final int[] c = new int[]{-1, -1073741826, -1, -1, -1, 1, 1};

    public static void a(int[] nArray, int[] nArray2, int[] nArray3) {
        if (org.bouncycastle.jcajce.provider.c.a.a(nArray, nArray2, nArray3) != 0 || nArray3[4] == -1 && org.bouncycastle.jcajce.provider.c.a.b(nArray3, a)) {
            ab.b(5, -2147483647, nArray3);
        }
    }

    public static void a(int[] nArray, int[] nArray2) {
        if (ab.d(5, nArray, nArray2) != 0 || nArray2[4] == -1 && org.bouncycastle.jcajce.provider.c.a.b(nArray2, a)) {
            ab.b(5, -2147483647, nArray2);
        }
    }

    public static int[] a(BigInteger object) {
        int[] nArray = org.bouncycastle.jcajce.provider.c.a.a((BigInteger)object);
        object = nArray;
        if (nArray[4] == -1 && org.bouncycastle.jcajce.provider.c.a.b((int[])object, a)) {
            org.bouncycastle.jcajce.provider.c.a.d(a, (int[])object);
        }
        return object;
    }

    public static void b(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4 = new int[10];
        org.bouncycastle.jcajce.provider.c.a.c(nArray, nArray2, nArray4);
        h.c(nArray4, nArray3);
    }

    public static void c(int[] nArray, int[] nArray2, int[] nArray3) {
        if ((org.bouncycastle.jcajce.provider.c.a.d(nArray, nArray2, nArray3) != 0 || nArray3[9] == -1 && ab.c(10, nArray3, b)) && ab.a(7, c, nArray3) != 0) {
            ab.b(10, nArray3, 7);
        }
    }

    public static void b(int[] nArray, int[] nArray2) {
        if (org.bouncycastle.jcajce.provider.c.a.b(nArray)) {
            org.bouncycastle.jcajce.provider.c.a.d(nArray2);
            return;
        }
        org.bouncycastle.jcajce.provider.c.a.f(a, nArray, nArray2);
    }

    public static void c(int[] nArray, int[] nArray2) {
        long l2 = (long)nArray[5] & 0xFFFFFFFFL;
        long l3 = (long)nArray[6] & 0xFFFFFFFFL;
        long l4 = (long)nArray[7] & 0xFFFFFFFFL;
        long l5 = (long)nArray[8] & 0xFFFFFFFFL;
        long l6 = (long)nArray[9] & 0xFFFFFFFFL;
        long l7 = 0L + (((long)nArray[0] & 0xFFFFFFFFL) + l2 + (l2 << 31));
        nArray2[0] = (int)l7;
        l7 = (l7 >>> 32) + (((long)nArray[1] & 0xFFFFFFFFL) + l3 + (l3 << 31));
        nArray2[1] = (int)l7;
        l7 = (l7 >>> 32) + (((long)nArray[2] & 0xFFFFFFFFL) + l4 + (l4 << 31));
        nArray2[2] = (int)l7;
        l7 = (l7 >>> 32) + (((long)nArray[3] & 0xFFFFFFFFL) + l5 + (l5 << 31));
        nArray2[3] = (int)l7;
        l7 = (l7 >>> 32) + (((long)nArray[4] & 0xFFFFFFFFL) + l6 + (l6 << 31));
        nArray2[4] = (int)l7;
        h.a((int)(l7 >>> 32), nArray2);
    }

    public static void a(int n2, int[] nArray) {
        if (n2 != 0 && org.bouncycastle.jcajce.provider.c.a.a(n2, nArray) != 0 || nArray[4] == -1 && org.bouncycastle.jcajce.provider.c.a.b(nArray, a)) {
            ab.b(5, -2147483647, nArray);
        }
    }

    public static void d(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[10];
        org.bouncycastle.jcajce.provider.c.a.c(nArray, nArray3);
        h.c(nArray3, nArray2);
    }

    public static void a(int[] nArray, int n2, int[] nArray2) {
        int[] nArray3 = new int[10];
        org.bouncycastle.jcajce.provider.c.a.c(nArray, nArray3);
        h.c(nArray3, nArray2);
        while (--n2 > 0) {
            org.bouncycastle.jcajce.provider.c.a.c(nArray2, nArray3);
            h.c(nArray3, nArray2);
        }
    }

    public static void d(int[] nArray, int[] nArray2, int[] nArray3) {
        if (org.bouncycastle.jcajce.provider.c.a.f(nArray, nArray2, nArray3) != 0) {
            nArray2 = nArray3;
            long l2 = ((long)nArray3[0] & 0xFFFFFFFFL) - 0x80000001L;
            nArray2[0] = (int)l2;
            if (l2 >> 32 != 0L) {
                ab.a(5, nArray2, 1);
            }
        }
    }

    public static void e(int[] nArray, int[] nArray2) {
        if (ab.a(5, nArray, 0, nArray2) != 0 || nArray2[4] == -1 && org.bouncycastle.jcajce.provider.c.a.b(nArray2, a)) {
            ab.b(5, -2147483647, nArray2);
        }
    }
}

