/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.ec.a;

public final class p {
    static final int[] a = new int[]{-4553, -2, -1, -1, -1, -1};
    private static int[] b = new int[]{20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};
    private static final int[] c = new int[]{-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    public static void a(int[] nArray, int[] nArray2, int[] nArray3) {
        if (org.bouncycastle.math.ec.a.a(nArray, nArray2, nArray3) != 0 || nArray3[5] == -1 && org.bouncycastle.math.ec.a.c(nArray3, a)) {
            ab.a(6, 4553, nArray3);
        }
    }

    public static void a(int[] nArray, int[] nArray2) {
        if (ab.d(6, nArray, nArray2) != 0 || nArray2[5] == -1 && org.bouncycastle.math.ec.a.c(nArray2, a)) {
            ab.a(6, 4553, nArray2);
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
        p.c(nArray4, nArray3);
    }

    public static void c(int[] nArray, int[] nArray2, int[] nArray3) {
        if ((org.bouncycastle.math.ec.a.e(nArray, nArray2, nArray3) != 0 || nArray3[11] == -1 && ab.c(12, nArray3, b)) && ab.a(8, c, nArray3) != 0) {
            ab.b(12, nArray3, 8);
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
        if (org.bouncycastle.math.ec.a.a(org.bouncycastle.math.ec.a.f(nArray, nArray, nArray2), nArray2) != 0 || nArray2[5] == -1 && org.bouncycastle.math.ec.a.c(nArray2, a)) {
            ab.a(6, 4553, nArray2);
        }
    }

    public static void a(int n2, int[] nArray) {
        block4: {
            block3: {
                block2: {
                    if (n2 == 0) break block2;
                    int[] nArray2 = nArray;
                    long l2 = (long)n2 & 0xFFFFFFFFL;
                    long l3 = 0L + (l2 * 4553L + ((long)nArray2[0] & 0xFFFFFFFFL));
                    nArray2[0] = (int)l3;
                    l3 = (l3 >>> 32) + (l2 + ((long)nArray2[1] & 0xFFFFFFFFL));
                    nArray2[1] = (int)l3;
                    l3 = (l3 >>> 32) + ((long)nArray2[2] & 0xFFFFFFFFL);
                    nArray2[2] = (int)l3;
                    if ((l3 >>> 32 == 0L ? 0 : ab.c(6, nArray2, 3)) != 0) break block3;
                }
                if (nArray[5] != -1 || !org.bouncycastle.math.ec.a.c(nArray, a)) break block4;
            }
            ab.a(6, 4553, nArray);
        }
    }

    public static void d(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[12];
        org.bouncycastle.math.ec.a.d(nArray, nArray3);
        p.c(nArray3, nArray2);
    }

    public static void a(int[] nArray, int n2, int[] nArray2) {
        int[] nArray3 = new int[12];
        org.bouncycastle.math.ec.a.d(nArray, nArray3);
        p.c(nArray3, nArray2);
        while (--n2 > 0) {
            org.bouncycastle.math.ec.a.d(nArray2, nArray3);
            p.c(nArray3, nArray2);
        }
    }

    public static void d(int[] nArray, int[] nArray2, int[] nArray3) {
        if (org.bouncycastle.math.ec.a.g(nArray, nArray2, nArray3) != 0) {
            ab.c(6, 4553, nArray3);
        }
    }

    public static void e(int[] nArray, int[] nArray2) {
        if (ab.a(6, nArray, 0, nArray2) != 0 || nArray2[5] == -1 && org.bouncycastle.math.ec.a.c(nArray2, a)) {
            ab.a(6, 4553, nArray2);
        }
    }
}

