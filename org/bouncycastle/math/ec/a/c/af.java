/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.openpgp.h;

public final class af {
    static final int[] a = new int[]{-977, -2, -1, -1, -1, -1, -1, -1};
    private static int[] b = new int[]{954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};
    private static final int[] c = new int[]{-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    public static void a(int[] nArray, int[] nArray2, int[] nArray3) {
        if (h.a(nArray, nArray2, nArray3) != 0 || nArray3[7] == -1 && h.d(nArray3, a)) {
            ab.a(8, 977, nArray3);
        }
    }

    public static void a(int[] nArray, int[] nArray2) {
        if (ab.d(8, nArray, nArray2) != 0 || nArray2[7] == -1 && h.d(nArray2, a)) {
            ab.a(8, 977, nArray2);
        }
    }

    public static int[] a(BigInteger object) {
        int[] nArray = h.a((BigInteger)object);
        object = nArray;
        if (nArray[7] == -1 && h.d((int[])object, a)) {
            h.h(a, (int[])object);
        }
        return object;
    }

    public static void b(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4 = new int[16];
        h.d(nArray, nArray2, nArray4);
        af.c(nArray4, nArray3);
    }

    public static void c(int[] nArray, int[] nArray2, int[] nArray3) {
        if ((h.e(nArray, nArray2, nArray3) != 0 || nArray3[15] == -1 && ab.c(16, nArray3, b)) && ab.a(10, c, nArray3) != 0) {
            ab.b(16, nArray3, 10);
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
        if (h.a(h.f(nArray, nArray, nArray2), nArray2) != 0 || nArray2[7] == -1 && h.d(nArray2, a)) {
            ab.a(8, 977, nArray2);
        }
    }

    public static void a(int n2, int[] nArray) {
        block4: {
            block3: {
                block2: {
                    if (n2 == 0) break block2;
                    int[] nArray2 = nArray;
                    long l2 = (long)n2 & 0xFFFFFFFFL;
                    long l3 = 0L + (l2 * 977L + ((long)nArray2[0] & 0xFFFFFFFFL));
                    nArray2[0] = (int)l3;
                    l3 = (l3 >>> 32) + (l2 + ((long)nArray2[1] & 0xFFFFFFFFL));
                    nArray2[1] = (int)l3;
                    l3 = (l3 >>> 32) + ((long)nArray2[2] & 0xFFFFFFFFL);
                    nArray2[2] = (int)l3;
                    if ((l3 >>> 32 == 0L ? 0 : ab.c(8, nArray2, 3)) != 0) break block3;
                }
                if (nArray[7] != -1 || !h.d(nArray, a)) break block4;
            }
            ab.a(8, 977, nArray);
        }
    }

    public static void d(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[16];
        h.f(nArray, nArray3);
        af.c(nArray3, nArray2);
    }

    public static void a(int[] nArray, int n2, int[] nArray2) {
        int[] nArray3 = new int[16];
        h.f(nArray, nArray3);
        af.c(nArray3, nArray2);
        while (--n2 > 0) {
            h.f(nArray2, nArray3);
            af.c(nArray3, nArray2);
        }
    }

    public static void d(int[] nArray, int[] nArray2, int[] nArray3) {
        if (h.g(nArray, nArray2, nArray3) != 0) {
            ab.c(8, 977, nArray3);
        }
    }

    public static void e(int[] nArray, int[] nArray2) {
        if (ab.a(8, nArray, 0, nArray2) != 0 || nArray2[7] == -1 && h.d(nArray2, a)) {
            ab.a(8, 977, nArray2);
        }
    }
}

