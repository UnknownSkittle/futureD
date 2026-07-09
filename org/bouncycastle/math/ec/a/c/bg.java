/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.math.ec.a;

public final class bg {
    private static final long[] a = new long[]{-5270498306774157648L, 5270498306774195053L, 0x492492492L};

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
        lArray3[5] = lArray[5] ^ lArray2[5];
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
        long l4 = l2 = l3 >>> 35;
        lArray2[0] = lArray2[0] ^ (l4 ^ l4 << 3 ^ l2 << 6 ^ l2 << 7);
        lArray2[2] = l3 & 0x7FFFFFFFFL;
        return object;
    }

    public static void b(long[] lArray, long[] lArray2) {
        if (org.bouncycastle.math.ec.a.b(lArray)) {
            throw new IllegalStateException();
        }
        long[] lArray3 = new long[3];
        long[] lArray4 = new long[3];
        bg.e(lArray, lArray3);
        bg.a(lArray3, 1, lArray4);
        bg.b(lArray3, lArray4, lArray3);
        bg.a(lArray4, 1, lArray4);
        bg.b(lArray3, lArray4, lArray3);
        bg.a(lArray3, 3, lArray4);
        bg.b(lArray3, lArray4, lArray3);
        bg.a(lArray4, 3, lArray4);
        bg.b(lArray3, lArray4, lArray3);
        bg.a(lArray3, 9, lArray4);
        bg.b(lArray3, lArray4, lArray3);
        bg.a(lArray4, 9, lArray4);
        bg.b(lArray3, lArray4, lArray3);
        bg.a(lArray3, 27, lArray4);
        bg.b(lArray3, lArray4, lArray3);
        bg.a(lArray4, 27, lArray4);
        bg.b(lArray3, lArray4, lArray3);
        bg.a(lArray3, 81, lArray4);
        bg.b(lArray3, lArray4, lArray2);
    }

    public static void b(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[6];
        bg.e(lArray, lArray2, lArray4);
        bg.c(lArray4, lArray3);
    }

    public static void c(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[6];
        bg.e(lArray, lArray2, lArray4);
        bg.d(lArray3, lArray4, lArray3);
    }

    public static void c(long[] lArray, long[] lArray2) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = lArray[3];
        long l6 = lArray[4];
        long l7 = lArray[5];
        l4 ^= l7 << 29 ^ l7 << 32 ^ l7 << 35 ^ l7 << 36;
        l3 ^= l6 << 29 ^ l6 << 32 ^ l6 << 35 ^ l6 << 36;
        long l8 = (l4 ^= l6 >>> 35 ^ l6 >>> 32 ^ l6 >>> 29 ^ l6 >>> 28) >>> 35;
        lArray2[0] = (l2 ^= (l5 ^= l7 >>> 35 ^ l7 >>> 32 ^ l7 >>> 29 ^ l7 >>> 28) << 29 ^ l5 << 32 ^ l5 << 35 ^ l5 << 36) ^ l8 ^ l8 << 3 ^ l8 << 6 ^ l8 << 7;
        lArray2[1] = l3 ^= l5 >>> 35 ^ l5 >>> 32 ^ l5 >>> 29 ^ l5 >>> 28;
        lArray2[2] = l4 & 0x7FFFFFFFFL;
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
        bg.b(lArray3, a, lArray2);
        lArray2[0] = lArray2[0] ^ l4;
        lArray2[1] = lArray2[1] ^ l5;
    }

    public static void e(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[6];
        bg.g(lArray, lArray3);
        bg.c(lArray3, lArray2);
    }

    public static void f(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[6];
        bg.g(lArray, lArray3);
        bg.d(lArray2, lArray3, lArray2);
    }

    public static void a(long[] lArray, int n2, long[] lArray2) {
        long[] lArray3 = new long[6];
        bg.g(lArray, lArray3);
        bg.c(lArray3, lArray2);
        while (--n2 > 0) {
            bg.g(lArray2, lArray3);
            bg.c(lArray3, lArray2);
        }
    }

    public static int a(long[] lArray) {
        return (int)(lArray[0] ^ lArray[2] >>> 29) & 1;
    }

    private static void b(long[] lArray) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = lArray[3];
        long l6 = lArray[4];
        long l7 = lArray[5];
        lArray[0] = l2 ^ l3 << 55;
        lArray[1] = l3 >>> 9 ^ l4 << 46;
        lArray[2] = l4 >>> 18 ^ l5 << 37;
        lArray[3] = l5 >>> 27 ^ l6 << 28;
        lArray[4] = l6 >>> 36 ^ l7 << 19;
        lArray[5] = l7 >>> 45;
    }

    private static void e(long[] lArray, long[] lArray2, long[] lArray3) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        l4 = l3 >>> 46 ^ l4 << 18;
        l3 = (l2 >>> 55 ^ l3 << 9) & 0x7FFFFFFFFFFFFFL;
        l2 &= 0x7FFFFFFFFFFFFFL;
        long l5 = lArray2[0];
        long l6 = lArray2[1];
        long l7 = lArray2[2];
        l7 = l6 >>> 46 ^ l7 << 18;
        l6 = (l5 >>> 55 ^ l6 << 9) & 0x7FFFFFFFFFFFFFL;
        lArray = new long[10];
        bg.a(l2, l5 &= 0x7FFFFFFFFFFFFFL, lArray, 0);
        bg.a(l4, l7, lArray, 2);
        long l8 = l2 ^ l3 ^ l4;
        long l9 = l5 ^ l6 ^ l7;
        bg.a(l8, l9, lArray, 4);
        long l10 = l3 << 1 ^ l4 << 2;
        long l11 = l6 << 1 ^ l7 << 2;
        bg.a(l2 ^ l10, l5 ^ l11, lArray, 6);
        bg.a(l8 ^ l10, l9 ^ l11, lArray, 8);
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
        l20 ^= l19 >>> 55;
        l19 &= 0x7FFFFFFFFFFFFFL;
        l21 ^= l20 >>> 55;
        l19 = l19 >>> 1 ^ ((l20 &= 0x7FFFFFFFFFFFFFL) & 1L) << 54;
        l20 = l20 >>> 1 ^ (l21 & 1L) << 54;
        l21 >>>= 1;
        long l22 = l19;
        long l23 = l22 ^ l22 << 1;
        long l24 = l23 ^ l23 << 2;
        long l25 = l24 ^ l24 << 4;
        long l26 = l25 ^ l25 << 8;
        long l27 = l26 ^ l26 << 16;
        l19 = (l27 ^ l27 << 32) & 0x7FFFFFFFFFFFFFL;
        long l28 = l20 ^ l19 >>> 54;
        long l29 = l28 ^ l28 << 1;
        long l30 = l29 ^ l29 << 2;
        long l31 = l30 ^ l30 << 4;
        long l32 = l31 ^ l31 << 8;
        long l33 = l32 ^ l32 << 16;
        l20 = (l33 ^ l33 << 32) & 0x7FFFFFFFFFFFFFL;
        long l34 = l21 ^ l20 >>> 54;
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
        bg.b(lArray3);
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
        long l5 = lArray3[n3 & 3];
        int n4 = 47;
        do {
            n3 = (int)(l2 >>> n4);
            long l6 = lArray3[n3 & 7] ^ lArray3[n3 >>> 3 & 7] << 3 ^ lArray3[n3 >>> 6 & 7] << 6;
            l5 ^= l6 << n4;
            l4 ^= l6 >>> -n4;
        } while ((n4 -= 9) > 0);
        lArray[n2] = l5 & 0x7FFFFFFFFFFFFFL;
        lArray[n2 + 1] = l5 >>> 55 ^ l4 << 9;
    }

    private static void g(long[] lArray, long[] lArray2) {
        org.bouncycastle.asn1.util.a.a(lArray[0], lArray2, 0);
        org.bouncycastle.asn1.util.a.a(lArray[1], lArray2, 2);
        long l2 = lArray[2];
        lArray2[4] = org.bouncycastle.asn1.util.a.d((int)l2);
        lArray2[5] = (long)org.bouncycastle.asn1.util.a.b((int)(l2 >>> 32)) & 0xFFFFFFFFL;
    }
}

