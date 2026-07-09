/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.math.ec.a;

public final class ba {
    private static final long[] a = new long[]{2791191049453778211L, 2791191049453778402L, 6L};

    public static void a(long[] lArray, long[] lArray2, long[] lArray3) {
        lArray3[0] = lArray[0] ^ lArray2[0];
        lArray3[1] = lArray[1] ^ lArray2[1];
        lArray3[2] = lArray[2] ^ lArray2[2];
    }

    private static void d(long[] lArray, long[] lArray2, long[] lArray3) {
        lArray3[0] = lArray[0] ^ lArray2[0];
        lArray3[1] = lArray[1] ^ lArray2[1];
        lArray3[2] = lArray[2] ^ lArray2[2];
        lArray3[3] = lArray[3] ^ lArray2[3];
        lArray3[4] = lArray[4] ^ lArray2[4];
    }

    public static void a(long[] lArray, long[] lArray2) {
        lArray2[0] = lArray[0] ^ 1L;
        lArray2[1] = lArray[1];
        lArray2[2] = lArray[2];
    }

    public static long[] a(BigInteger object) {
        long l2;
        long[] lArray = org.bouncycastle.math.ec.a.b((BigInteger)object);
        object = lArray;
        long[] lArray2 = lArray;
        long l3 = lArray[2];
        long l4 = l2 = l3 >>> 3;
        lArray2[0] = lArray2[0] ^ (l4 ^ l4 << 2 ^ l2 << 3 ^ l2 << 8);
        lArray2[1] = lArray2[1] ^ l2 >>> 56;
        lArray2[2] = l3 & 7L;
        return object;
    }

    public static void b(long[] lArray, long[] lArray2) {
        if (org.bouncycastle.math.ec.a.b(lArray)) {
            throw new IllegalStateException();
        }
        long[] lArray3 = new long[3];
        long[] lArray4 = new long[3];
        ba.e(lArray, lArray3);
        ba.b(lArray3, lArray, lArray3);
        ba.a(lArray3, 2, lArray4);
        ba.b(lArray4, lArray3, lArray4);
        ba.a(lArray4, 4, lArray3);
        ba.b(lArray3, lArray4, lArray3);
        ba.a(lArray3, 8, lArray4);
        ba.b(lArray4, lArray3, lArray4);
        ba.a(lArray4, 16, lArray3);
        ba.b(lArray3, lArray4, lArray3);
        ba.a(lArray3, 32, lArray4);
        ba.b(lArray4, lArray3, lArray4);
        ba.e(lArray4, lArray4);
        ba.b(lArray4, lArray, lArray4);
        ba.a(lArray4, 65, lArray3);
        ba.b(lArray3, lArray4, lArray3);
        ba.e(lArray3, lArray2);
    }

    public static void b(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[6];
        ba.e(lArray, lArray2, lArray4);
        ba.c(lArray4, lArray3);
    }

    public static void c(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[6];
        ba.e(lArray, lArray2, lArray4);
        ba.d(lArray3, lArray4, lArray3);
    }

    public static void c(long[] lArray, long[] lArray2) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = lArray[3];
        long l6 = lArray[4];
        l3 ^= l6 << 61 ^ l6 << 63;
        l4 ^= l6 >>> 3 ^ l6 >>> 1 ^ l6 ^ l6 << 5;
        long l7 = (l4 ^= l5 >>> 59) >>> 3;
        lArray2[0] = (l2 ^= (l5 ^= l6 >>> 59) << 61 ^ l5 << 63) ^ l7 ^ l7 << 2 ^ l7 << 3 ^ l7 << 8;
        lArray2[1] = (l3 ^= l5 >>> 3 ^ l5 >>> 1 ^ l5 ^ l5 << 5) ^ l7 >>> 56;
        lArray2[2] = l4 & 7L;
    }

    public static void d(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[3];
        long l2 = org.bouncycastle.asn1.util.a.a(lArray[0]);
        long l3 = org.bouncycastle.asn1.util.a.a(lArray[1]);
        long l4 = l2 & 0xFFFFFFFFL | l3 << 32;
        lArray3[0] = l2 >>> 32 | l3 & 0xFFFFFFFF00000000L;
        l2 = org.bouncycastle.asn1.util.a.a(lArray[2]);
        long l5 = l2 & 0xFFFFFFFFL;
        lArray3[1] = l2 >>> 32;
        ba.b(lArray3, a, lArray2);
        lArray2[0] = lArray2[0] ^ l4;
        lArray2[1] = lArray2[1] ^ l5;
    }

    public static void e(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[5];
        ba.g(lArray, lArray3);
        ba.c(lArray3, lArray2);
    }

    public static void f(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[5];
        ba.g(lArray, lArray3);
        ba.d(lArray2, lArray3, lArray2);
    }

    public static void a(long[] lArray, int n2, long[] lArray2) {
        long[] lArray3 = new long[5];
        ba.g(lArray, lArray3);
        ba.c(lArray3, lArray2);
        while (--n2 > 0) {
            ba.g(lArray2, lArray3);
            ba.c(lArray3, lArray2);
        }
    }

    public static int a(long[] lArray) {
        return (int)(lArray[0] ^ lArray[1] >>> 59 ^ lArray[2] >>> 1) & 1;
    }

    private static void b(long[] lArray) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = lArray[3];
        long l6 = lArray[4];
        long l7 = lArray[5];
        lArray[0] = l2 ^ l3 << 44;
        lArray[1] = l3 >>> 20 ^ l4 << 24;
        lArray[2] = l4 >>> 40 ^ l5 << 4 ^ l6 << 48;
        lArray[3] = l5 >>> 60 ^ l7 << 28 ^ l6 >>> 16;
        lArray[4] = l7 >>> 36;
        lArray[5] = 0L;
    }

    private static void e(long[] lArray, long[] lArray2, long[] lArray3) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        l4 = (l3 >>> 24 ^ l4 << 40) & 0xFFFFFFFFFFFL;
        l3 = (l2 >>> 44 ^ l3 << 20) & 0xFFFFFFFFFFFL;
        l2 &= 0xFFFFFFFFFFFL;
        long l5 = lArray2[0];
        long l6 = lArray2[1];
        long l7 = lArray2[2];
        l7 = (l6 >>> 24 ^ l7 << 40) & 0xFFFFFFFFFFFL;
        l6 = (l5 >>> 44 ^ l6 << 20) & 0xFFFFFFFFFFFL;
        lArray = new long[10];
        ba.a(l2, l5 &= 0xFFFFFFFFFFFL, lArray, 0);
        ba.a(l4, l7, lArray, 2);
        long l8 = l2 ^ l3 ^ l4;
        long l9 = l5 ^ l6 ^ l7;
        ba.a(l8, l9, lArray, 4);
        long l10 = l3 << 1 ^ l4 << 2;
        long l11 = l6 << 1 ^ l7 << 2;
        ba.a(l2 ^ l10, l5 ^ l11, lArray, 6);
        ba.a(l8 ^ l10, l9 ^ l11, lArray, 8);
        long l12 = lArray[6] ^ lArray[8];
        long l13 = lArray[7] ^ lArray[9];
        long l14 = l12 << 1 ^ lArray[6];
        long l15 = l12 ^ l13 << 1 ^ lArray[7];
        long l16 = lArray[0];
        long l17 = lArray[1] ^ lArray[0] ^ lArray[4];
        long l18 = lArray[1] ^ lArray[5];
        long l19 = l16 ^ l14 ^ lArray[2] << 4 ^ lArray[2] << 1;
        long l20 = l17 ^ l15 ^ lArray[3] << 4 ^ lArray[3] << 1;
        long l21 = l18 ^ l13;
        l20 ^= l19 >>> 44;
        l19 &= 0xFFFFFFFFFFFL;
        l21 ^= l20 >>> 44;
        l19 = l19 >>> 1 ^ ((l20 &= 0xFFFFFFFFFFFL) & 1L) << 43;
        l20 = l20 >>> 1 ^ (l21 & 1L) << 43;
        l21 >>>= 1;
        long l22 = l19;
        long l23 = l22 ^ l22 << 1;
        long l24 = l23 ^ l23 << 2;
        long l25 = l24 ^ l24 << 4;
        long l26 = l25 ^ l25 << 8;
        long l27 = l26 ^ l26 << 16;
        l19 = (l27 ^ l27 << 32) & 0xFFFFFFFFFFFL;
        long l28 = l20 ^ l19 >>> 43;
        long l29 = l28 ^ l28 << 1;
        long l30 = l29 ^ l29 << 2;
        long l31 = l30 ^ l30 << 4;
        long l32 = l31 ^ l31 << 8;
        long l33 = l32 ^ l32 << 16;
        l20 = (l33 ^ l33 << 32) & 0xFFFFFFFFFFFL;
        long l34 = l21 ^ l20 >>> 43;
        long l35 = l34 ^ l34 << 1;
        long l36 = l35 ^ l35 << 2;
        long l37 = l36 ^ l36 << 4;
        long l38 = l37 ^ l37 << 8;
        long l39 = l38 ^ l38 << 16;
        l21 = l39 ^ l39 << 32;
        lArray3[0] = l16;
        lArray3[1] = l17 ^ l19 ^ lArray[2];
        lArray3[2] = l18 ^ l20 ^ l19 ^ lArray[3];
        lArray3[3] = l21 ^ l20;
        lArray3[4] = l21 ^ lArray[2];
        lArray3[5] = lArray[3];
        ba.b(lArray3);
    }

    private static void a(long l2, long l3, long[] lArray, int n2) {
        long[] lArray2 = new long[8];
        long[] lArray3 = lArray2;
        lArray2[1] = l3;
        lArray3[2] = lArray3[1] << 1;
        lArray3[3] = lArray3[2] ^ l3;
        lArray3[4] = lArray3[2] << 1;
        lArray3[5] = lArray3[4] ^ l3;
        lArray3[6] = lArray3[3] << 1;
        lArray3[7] = lArray3[6] ^ l3;
        int n3 = (int)l2;
        long l4 = 0L;
        long l5 = lArray3[n3 & 7] ^ lArray3[n3 >>> 3 & 7] << 3 ^ lArray3[n3 >>> 6 & 7] << 6;
        int n4 = 33;
        do {
            n3 = (int)(l2 >>> n4);
            long l6 = lArray3[n3 & 7] ^ lArray3[n3 >>> 3 & 7] << 3 ^ lArray3[n3 >>> 6 & 7] << 6 ^ lArray3[n3 >>> 9 & 7] << 9;
            l5 ^= l6 << n4;
            l4 ^= l6 >>> -n4;
        } while ((n4 -= 12) > 0);
        lArray[n2] = l5 & 0xFFFFFFFFFFFL;
        lArray[n2 + 1] = l5 >>> 44 ^ l4 << 20;
    }

    private static void g(long[] lArray, long[] lArray2) {
        org.bouncycastle.asn1.util.a.a(lArray[0], lArray2, 0);
        org.bouncycastle.asn1.util.a.a(lArray[1], lArray2, 2);
        lArray2[4] = (long)org.bouncycastle.asn1.util.a.b((int)lArray[2]) & 0xFFFFFFFFL;
    }
}

