/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.b.a;

public final class x {
    static final int[] a = new int[]{-6803, -2, -1, -1, -1, -1, -1};
    private static int[] b = new int[]{46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};
    private static final int[] c = new int[]{-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    public static void a(int[] nArray, int[] nArray2, int[] nArray3) {
        if (org.bouncycastle.math.b.a.a(nArray, nArray2, nArray3) != 0 || nArray3[6] == -1 && org.bouncycastle.math.b.a.c(nArray3, a)) {
            ab.a(7, 6803, nArray3);
        }
    }

    public static void a(int[] nArray, int[] nArray2) {
        if (ab.d(7, nArray, nArray2) != 0 || nArray2[6] == -1 && org.bouncycastle.math.b.a.c(nArray2, a)) {
            ab.a(7, 6803, nArray2);
        }
    }

    public static int[] a(BigInteger object) {
        int[] nArray = org.bouncycastle.math.b.a.a((BigInteger)object);
        object = nArray;
        if (nArray[6] == -1 && org.bouncycastle.math.b.a.c((int[])object, a)) {
            ab.a(7, 6803, (int[])object);
        }
        return object;
    }

    public static void b(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4 = new int[14];
        org.bouncycastle.math.b.a.c(nArray, nArray2, nArray4);
        x.c(nArray4, nArray3);
    }

    public static void c(int[] nArray, int[] nArray2, int[] nArray3) {
        if ((org.bouncycastle.math.b.a.d(nArray, nArray2, nArray3) != 0 || nArray3[13] == -1 && ab.c(14, nArray3, b)) && ab.a(9, c, nArray3) != 0) {
            ab.b(14, nArray3, 9);
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
        if (org.bouncycastle.math.b.a.a(org.bouncycastle.math.b.a.e(nArray, nArray, nArray2), nArray2) != 0 || nArray2[6] == -1 && org.bouncycastle.math.b.a.c(nArray2, a)) {
            ab.a(7, 6803, nArray2);
        }
    }

    public static void a(int n2, int[] nArray) {
        block4: {
            block3: {
                block2: {
                    if (n2 == 0) break block2;
                    int[] nArray2 = nArray;
                    long l2 = (long)n2 & 0xFFFFFFFFL;
                    long l3 = 0L + (l2 * 6803L + ((long)nArray2[0] & 0xFFFFFFFFL));
                    nArray2[0] = (int)l3;
                    l3 = (l3 >>> 32) + (l2 + ((long)nArray2[1] & 0xFFFFFFFFL));
                    nArray2[1] = (int)l3;
                    l3 = (l3 >>> 32) + ((long)nArray2[2] & 0xFFFFFFFFL);
                    nArray2[2] = (int)l3;
                    if ((l3 >>> 32 == 0L ? 0 : ab.c(7, nArray2, 3)) != 0) break block3;
                }
                if (nArray[6] != -1 || !org.bouncycastle.math.b.a.c(nArray, a)) break block4;
            }
            ab.a(7, 6803, nArray);
        }
    }

    public static void d(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[14];
        org.bouncycastle.math.b.a.d(nArray, nArray3);
        x.c(nArray3, nArray2);
    }

    public static void a(int[] nArray, int n2, int[] nArray2) {
        int[] nArray3 = new int[14];
        org.bouncycastle.math.b.a.d(nArray, nArray3);
        x.c(nArray3, nArray2);
        while (--n2 > 0) {
            org.bouncycastle.math.b.a.d(nArray2, nArray3);
            x.c(nArray3, nArray2);
        }
    }

    public static void d(int[] nArray, int[] nArray2, int[] nArray3) {
        if (org.bouncycastle.math.b.a.f(nArray, nArray2, nArray3) != 0) {
            ab.c(7, 6803, nArray3);
        }
    }

    public static void e(int[] nArray, int[] nArray2) {
        if (ab.a(7, nArray, 0, nArray2) != 0 || nArray2[6] == -1 && org.bouncycastle.math.b.a.c(nArray2, a)) {
            ab.a(7, 6803, nArray2);
        }
    }
}

