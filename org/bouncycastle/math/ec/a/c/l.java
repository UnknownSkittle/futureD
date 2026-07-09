/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.jcajce.provider.c.a;

public final class l {
    static final int[] a = new int[]{-21389, -2, -1, -1, -1};
    private static int[] b = new int[]{457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};
    private static final int[] c = new int[]{-457489321, -42779, -2, -1, -1, 42777, 2};

    public static void a(int[] nArray, int[] nArray2, int[] nArray3) {
        if (org.bouncycastle.jcajce.provider.c.a.a(nArray, nArray2, nArray3) != 0 || nArray3[4] == -1 && org.bouncycastle.jcajce.provider.c.a.b(nArray3, a)) {
            ab.a(5, 21389, nArray3);
        }
    }

    public static void a(int[] nArray, int[] nArray2) {
        if (ab.d(5, nArray, nArray2) != 0 || nArray2[4] == -1 && org.bouncycastle.jcajce.provider.c.a.b(nArray2, a)) {
            ab.a(5, 21389, nArray2);
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
        l.c(nArray4, nArray3);
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
        if (org.bouncycastle.jcajce.provider.c.a.a(org.bouncycastle.jcajce.provider.c.a.e(nArray, nArray, nArray2), nArray2) != 0 || nArray2[4] == -1 && org.bouncycastle.jcajce.provider.c.a.b(nArray2, a)) {
            ab.a(5, 21389, nArray2);
        }
    }

    public static void a(int n2, int[] nArray) {
        block4: {
            block3: {
                block2: {
                    if (n2 == 0) break block2;
                    int[] nArray2 = nArray;
                    long l2 = (long)n2 & 0xFFFFFFFFL;
                    long l3 = 0L + (l2 * 21389L + ((long)nArray2[0] & 0xFFFFFFFFL));
                    nArray2[0] = (int)l3;
                    l3 = (l3 >>> 32) + (l2 + ((long)nArray2[1] & 0xFFFFFFFFL));
                    nArray2[1] = (int)l3;
                    l3 = (l3 >>> 32) + ((long)nArray2[2] & 0xFFFFFFFFL);
                    nArray2[2] = (int)l3;
                    if ((l3 >>> 32 == 0L ? 0 : ab.c(5, nArray2, 3)) != 0) break block3;
                }
                if (nArray[4] != -1 || !org.bouncycastle.jcajce.provider.c.a.b(nArray, a)) break block4;
            }
            ab.a(5, 21389, nArray);
        }
    }

    public static void d(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[10];
        org.bouncycastle.jcajce.provider.c.a.c(nArray, nArray3);
        l.c(nArray3, nArray2);
    }

    public static void a(int[] nArray, int n2, int[] nArray2) {
        int[] nArray3 = new int[10];
        org.bouncycastle.jcajce.provider.c.a.c(nArray, nArray3);
        l.c(nArray3, nArray2);
        while (--n2 > 0) {
            org.bouncycastle.jcajce.provider.c.a.c(nArray2, nArray3);
            l.c(nArray3, nArray2);
        }
    }

    public static void d(int[] nArray, int[] nArray2, int[] nArray3) {
        if (org.bouncycastle.jcajce.provider.c.a.f(nArray, nArray2, nArray3) != 0) {
            ab.c(5, 21389, nArray3);
        }
    }

    public static void e(int[] nArray, int[] nArray2) {
        if (ab.a(5, nArray, 0, nArray2) != 0 || nArray2[4] == -1 && org.bouncycastle.jcajce.provider.c.a.b(nArray2, a)) {
            ab.a(5, 21389, nArray2);
        }
    }
}

