/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.util.a;

public final class ce {
    private static final long[] a = new long[]{878416384462358536L, 0x30C30C30C30C30C3L, -9076969306111048948L, 0x820820820820820L, 0x2082082L};

    public static void a(long[] lArray, long[] lArray2, long[] lArray3) {
        lArray3[0] = lArray[0] ^ lArray2[0];
        lArray3[1] = lArray[1] ^ lArray2[1];
        lArray3[2] = lArray[2] ^ lArray2[2];
        lArray3[3] = lArray[3] ^ lArray2[3];
        lArray3[4] = lArray[4] ^ lArray2[4];
    }

    private static void d(long[] lArray, long[] lArray2, long[] lArray3) {
        lArray3[0] = lArray[0] ^ lArray2[0];
        lArray3[1] = lArray[1] ^ lArray2[1];
        lArray3[2] = lArray[2] ^ lArray2[2];
        lArray3[3] = lArray[3] ^ lArray2[3];
        lArray3[4] = lArray[4] ^ lArray2[4];
        lArray3[5] = lArray[5] ^ lArray2[5];
        lArray3[6] = lArray[6] ^ lArray2[6];
        lArray3[7] = lArray[7] ^ lArray2[7];
        lArray3[8] = lArray[8] ^ lArray2[8];
    }

    public static void a(long[] lArray, long[] lArray2) {
        lArray2[0] = lArray[0] ^ 1L;
        lArray2[1] = lArray[1];
        lArray2[2] = lArray[2];
        lArray2[3] = lArray[3];
        lArray2[4] = lArray[4];
    }

    public static long[] a(BigInteger object) {
        Object object2 = object;
        if (((BigInteger)object2).signum() < 0 || ((BigInteger)object2).bitLength() > 320) {
            throw new IllegalArgumentException();
        }
        object = new long[5];
        int n2 = 0;
        while (((BigInteger)object2).signum() != 0) {
            object[n2++] = ((BigInteger)object2).longValue();
            object2 = ((BigInteger)object2).shiftRight(64);
        }
        object2 = object;
        Object object3 = object2[4];
        reference var4_4 = object3 >>> 27;
        Object object4 = object2;
        reference v1 = var4_4;
        object4[0] = object4[0] ^ (v1 ^ v1 << 5 ^ var4_4 << 7 ^ var4_4 << 12);
        object2[4] = object3 & 0x7FFFFFFL;
        return object;
    }

    public static void b(long[] lArray, long[] lArray2) {
        if (ab.a(lArray)) {
            throw new IllegalStateException();
        }
        long[] lArray3 = new long[5];
        long[] lArray4 = new long[5];
        ce.e(lArray, lArray3);
        ce.b(lArray3, lArray, lArray3);
        ce.a(lArray3, 2, lArray4);
        ce.b(lArray4, lArray3, lArray4);
        ce.a(lArray4, 4, lArray3);
        ce.b(lArray3, lArray4, lArray3);
        ce.a(lArray3, 8, lArray4);
        ce.b(lArray4, lArray3, lArray4);
        ce.e(lArray4, lArray4);
        ce.b(lArray4, lArray, lArray4);
        ce.a(lArray4, 17, lArray3);
        ce.b(lArray3, lArray4, lArray3);
        ce.e(lArray3, lArray3);
        ce.b(lArray3, lArray, lArray3);
        ce.a(lArray3, 35, lArray4);
        ce.b(lArray4, lArray3, lArray4);
        ce.a(lArray4, 70, lArray3);
        ce.b(lArray3, lArray4, lArray3);
        ce.e(lArray3, lArray3);
        ce.b(lArray3, lArray, lArray3);
        ce.a(lArray3, 141, lArray4);
        ce.b(lArray4, lArray3, lArray4);
        ce.e(lArray4, lArray2);
    }

    public static void b(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[10];
        ce.e(lArray, lArray2, lArray4);
        ce.c(lArray4, lArray3);
    }

    public static void c(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[10];
        ce.e(lArray, lArray2, lArray4);
        ce.d(lArray3, lArray4, lArray3);
    }

    public static void c(long[] lArray, long[] lArray2) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = lArray[3];
        long l6 = lArray[4];
        long l7 = lArray[5];
        long l8 = lArray[6];
        long l9 = lArray[7];
        long l10 = lArray[8];
        l5 ^= l10 << 37 ^ l10 << 42 ^ l10 << 44 ^ l10 << 49;
        l4 ^= l9 << 37 ^ l9 << 42 ^ l9 << 44 ^ l9 << 49;
        l5 ^= l9 >>> 27 ^ l9 >>> 22 ^ l9 >>> 20 ^ l9 >>> 15;
        l3 ^= l8 << 37 ^ l8 << 42 ^ l8 << 44 ^ l8 << 49;
        long l11 = (l6 ^= l10 >>> 27 ^ l10 >>> 22 ^ l10 >>> 20 ^ l10 >>> 15) >>> 27;
        lArray2[0] = (l2 ^= l7 << 37 ^ l7 << 42 ^ l7 << 44 ^ l7 << 49) ^ l11 ^ l11 << 5 ^ l11 << 7 ^ l11 << 12;
        lArray2[1] = l3 ^= l7 >>> 27 ^ l7 >>> 22 ^ l7 >>> 20 ^ l7 >>> 15;
        lArray2[2] = l4 ^= l8 >>> 27 ^ l8 >>> 22 ^ l8 >>> 20 ^ l8 >>> 15;
        lArray2[3] = l5;
        lArray2[4] = l6 & 0x7FFFFFFL;
    }

    public static void d(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[5];
        long l2 = org.bouncycastle.asn1.util.a.a(lArray[0]);
        long l3 = org.bouncycastle.asn1.util.a.a(lArray[1]);
        long l4 = l2 & 0xFFFFFFFFL | l3 << 32;
        lArray3[0] = l2 >>> 32 | l3 & 0xFFFFFFFF00000000L;
        l2 = org.bouncycastle.asn1.util.a.a(lArray[2]);
        l3 = org.bouncycastle.asn1.util.a.a(lArray[3]);
        long l5 = l2 & 0xFFFFFFFFL | l3 << 32;
        lArray3[1] = l2 >>> 32 | l3 & 0xFFFFFFFF00000000L;
        l2 = org.bouncycastle.asn1.util.a.a(lArray[4]);
        long l6 = l2 & 0xFFFFFFFFL;
        lArray3[2] = l2 >>> 32;
        ce.b(lArray3, a, lArray2);
        lArray2[0] = lArray2[0] ^ l4;
        lArray2[1] = lArray2[1] ^ l5;
        lArray2[2] = lArray2[2] ^ l6;
    }

    public static void e(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[9];
        ce.h(lArray, lArray3);
        ce.c(lArray3, lArray2);
    }

    public static void f(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[9];
        ce.h(lArray, lArray3);
        ce.d(lArray2, lArray3, lArray2);
    }

    public static void a(long[] lArray, int n2, long[] lArray2) {
        long[] lArray3 = new long[9];
        ce.h(lArray, lArray3);
        ce.c(lArray3, lArray2);
        while (--n2 > 0) {
            ce.h(lArray2, lArray3);
            ce.c(lArray3, lArray2);
        }
    }

    public static int a(long[] lArray) {
        return (int)(lArray[0] ^ lArray[4] >>> 15) & 1;
    }

    private static void b(long[] lArray) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = lArray[3];
        long l6 = lArray[4];
        long l7 = lArray[5];
        long l8 = lArray[6];
        long l9 = lArray[7];
        long l10 = lArray[8];
        long l11 = lArray[9];
        lArray[0] = l2 ^ l3 << 57;
        lArray[1] = l3 >>> 7 ^ l4 << 50;
        lArray[2] = l4 >>> 14 ^ l5 << 43;
        lArray[3] = l5 >>> 21 ^ l6 << 36;
        lArray[4] = l6 >>> 28 ^ l7 << 29;
        lArray[5] = l7 >>> 35 ^ l8 << 22;
        lArray[6] = l8 >>> 42 ^ l9 << 15;
        lArray[7] = l9 >>> 49 ^ l10 << 8;
        lArray[8] = l10 >>> 56 ^ l11 << 1;
        lArray[9] = l11 >>> 63;
    }

    private static void g(long[] lArray, long[] lArray2) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = lArray[3];
        long l6 = lArray[4];
        lArray2[0] = l2 & 0x1FFFFFFFFFFFFFFL;
        lArray2[1] = (l2 >>> 57 ^ l3 << 7) & 0x1FFFFFFFFFFFFFFL;
        lArray2[2] = (l3 >>> 50 ^ l4 << 14) & 0x1FFFFFFFFFFFFFFL;
        lArray2[3] = (l4 >>> 43 ^ l5 << 21) & 0x1FFFFFFFFFFFFFFL;
        lArray2[4] = l5 >>> 36 ^ l6 << 28;
    }

    private static void e(long[] lArray, long[] lArray2, long[] lArray3) {
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        long[] lArray4 = new long[5];
        long[] lArray5 = new long[5];
        ce.g(lArray, lArray4);
        ce.g(lArray2, lArray5);
        lArray = new long[26];
        ce.a(lArray4[0], lArray5[0], lArray, 0);
        ce.a(lArray4[1], lArray5[1], lArray, 2);
        ce.a(lArray4[2], lArray5[2], lArray, 4);
        ce.a(lArray4[3], lArray5[3], lArray, 6);
        ce.a(lArray4[4], lArray5[4], lArray, 8);
        long l10 = lArray4[0] ^ lArray4[1];
        long l11 = lArray5[0] ^ lArray5[1];
        long l12 = lArray4[0] ^ lArray4[2];
        long l13 = lArray5[0] ^ lArray5[2];
        long l14 = lArray4[2] ^ lArray4[4];
        long l15 = lArray5[2] ^ lArray5[4];
        long l16 = lArray4[3] ^ lArray4[4];
        long l17 = lArray5[3] ^ lArray5[4];
        ce.a(l12 ^ lArray4[3], l13 ^ lArray5[3], lArray, 18);
        ce.a(l14 ^ lArray4[1], l15 ^ lArray5[1], lArray, 20);
        long l18 = l10 ^ l16;
        long l19 = l11 ^ l17;
        long l20 = l18 ^ lArray4[2];
        long l21 = l19 ^ lArray5[2];
        ce.a(l18, l19, lArray, 22);
        ce.a(l20, l21, lArray, 24);
        ce.a(l10, l11, lArray, 10);
        ce.a(l12, l13, lArray, 12);
        ce.a(l14, l15, lArray, 14);
        ce.a(l16, l17, lArray, 16);
        lArray3[0] = lArray[0];
        lArray3[9] = lArray[9];
        long l22 = lArray[0] ^ lArray[1];
        long l23 = l22 ^ lArray[2];
        lArray3[1] = l9 = l23 ^ lArray[10];
        long l24 = lArray[3] ^ lArray[4];
        long l25 = lArray[11] ^ lArray[12];
        long l26 = l24 ^ l25;
        lArray3[2] = l8 = l23 ^ l26;
        long l27 = l22 ^ l24;
        long l28 = lArray[5] ^ lArray[6];
        long l29 = l27 ^ l28 ^ lArray[8];
        long l30 = lArray[13] ^ lArray[14];
        long l31 = l29 ^ l30;
        long l32 = lArray[18] ^ lArray[22] ^ lArray[24];
        lArray3[3] = l7 = l31 ^ l32;
        long l33 = lArray[7] ^ lArray[8] ^ lArray[9];
        lArray3[8] = l6 = l33 ^ lArray[17];
        long l34 = l33 ^ l28;
        long l35 = lArray[15] ^ lArray[16];
        lArray3[7] = l5 = l34 ^ l35;
        long l36 = l5 ^ l9;
        long l37 = lArray[19] ^ lArray[20];
        long l38 = lArray[25] ^ lArray[24];
        long l39 = lArray[18] ^ lArray[23];
        long l40 = l37 ^ l38;
        lArray3[4] = l4 = l40 ^ l39 ^ l36;
        long l41 = l8 ^ l6;
        long l42 = l40 ^ l41;
        long l43 = lArray[21] ^ lArray[22];
        lArray3[5] = l3 = l42 ^ l43;
        lArray3[6] = l2 = l29 ^ lArray[0] ^ lArray[9] ^ l30 ^ lArray[21] ^ lArray[23] ^ lArray[25];
        ce.b(lArray3);
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
        long l5 = lArray3[n3 & 7];
        int n4 = 48;
        do {
            n3 = (int)(l2 >>> n4);
            long l6 = lArray3[n3 & 7] ^ lArray3[n3 >>> 3 & 7] << 3 ^ lArray3[n3 >>> 6 & 7] << 6;
            l5 ^= l6 << n4;
            l4 ^= l6 >>> -n4;
        } while ((n4 -= 9) > 0);
        lArray[n2] = l5 & 0x1FFFFFFFFFFFFFFL;
        lArray[n2 + 1] = l5 >>> 57 ^ (l4 ^= (l2 & 0x100804020100800L & l3 << 7 >> 63) >>> 8) << 7;
    }

    private static void h(long[] lArray, long[] lArray2) {
        for (int i2 = 0; i2 < 4; ++i2) {
            org.bouncycastle.asn1.util.a.a(lArray[i2], lArray2, i2 << 1);
        }
        lArray2[8] = org.bouncycastle.asn1.util.a.d((int)lArray[4]);
    }
}

