/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.openpgp.h;

public class bo {
    private SecureRandom a;
    private int b;

    private static void c(long[] lArray, long[] lArray2, long[] lArray3) {
        lArray3[0] = lArray[0] ^ lArray2[0];
        lArray3[1] = lArray[1] ^ lArray2[1];
        lArray3[2] = lArray[2] ^ lArray2[2];
        lArray3[3] = lArray[3] ^ lArray2[3];
        lArray3[4] = lArray[4] ^ lArray2[4];
        lArray3[5] = lArray[5] ^ lArray2[5];
        lArray3[6] = lArray[6] ^ lArray2[6];
    }

    public static long[] a(BigInteger object) {
        long l2;
        long[] lArray = h.b((BigInteger)object);
        object = lArray;
        long[] lArray2 = lArray;
        long l3 = lArray[3];
        long l4 = l2 = l3 >>> 1;
        lArray2[0] = lArray2[0] ^ (l4 ^ l4 << 15);
        lArray2[1] = lArray2[1] ^ l2 >>> 49;
        lArray2[3] = l3 & 1L;
        return object;
    }

    public static void a(long[] lArray, long[] lArray2) {
        if (h.b(lArray)) {
            throw new IllegalStateException();
        }
        long[] lArray3 = new long[4];
        long[] lArray4 = new long[4];
        bo.c(lArray, lArray3);
        bo.a(lArray3, 1, lArray4);
        bo.a(lArray3, lArray4, lArray3);
        bo.a(lArray4, 1, lArray4);
        bo.a(lArray3, lArray4, lArray3);
        bo.a(lArray3, 3, lArray4);
        bo.a(lArray3, lArray4, lArray3);
        bo.a(lArray3, 6, lArray4);
        bo.a(lArray3, lArray4, lArray3);
        bo.a(lArray3, 12, lArray4);
        bo.a(lArray3, lArray4, lArray3);
        bo.a(lArray3, 24, lArray4);
        bo.a(lArray3, lArray4, lArray3);
        bo.a(lArray3, 48, lArray4);
        bo.a(lArray3, lArray4, lArray3);
        bo.a(lArray3, 96, lArray4);
        bo.a(lArray3, lArray4, lArray2);
    }

    public static void a(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[8];
        bo.d(lArray, lArray2, lArray4);
        bo.b(lArray4, lArray3);
    }

    public static void b(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[8];
        bo.d(lArray, lArray2, lArray4);
        bo.c(lArray3, lArray4, lArray3);
    }

    public static void b(long[] lArray, long[] lArray2) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = lArray[3];
        long l6 = lArray[4];
        long l7 = lArray[5];
        long l8 = lArray[6];
        l4 ^= l8 << 63;
        l5 ^= l8 >>> 1 ^ l8 << 14;
        l3 ^= l7 << 63;
        l4 ^= l7 >>> 1 ^ l7 << 14;
        long l9 = (l5 ^= l7 >>> 50) >>> 1;
        lArray2[0] = (l2 ^= (l6 ^= l8 >>> 50) << 63) ^ l9 ^ l9 << 15;
        lArray2[1] = (l3 ^= l6 >>> 1 ^ l6 << 14) ^ l9 >>> 49;
        lArray2[2] = l4 ^= l6 >>> 50;
        lArray2[3] = l5 & 1L;
    }

    public static void c(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[8];
        bo.f(lArray, lArray3);
        bo.b(lArray3, lArray2);
    }

    public static void d(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[8];
        bo.f(lArray, lArray3);
        bo.c(lArray2, lArray3, lArray2);
    }

    public static void a(long[] lArray, int n2, long[] lArray2) {
        long[] lArray3 = new long[8];
        bo.f(lArray, lArray3);
        bo.b(lArray3, lArray2);
        while (--n2 > 0) {
            bo.f(lArray2, lArray3);
            bo.b(lArray3, lArray2);
        }
    }

    private static void a(long[] lArray) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = lArray[3];
        long l6 = lArray[4];
        long l7 = lArray[5];
        long l8 = lArray[6];
        long l9 = lArray[7];
        lArray[0] = l2 ^ l3 << 49;
        lArray[1] = l3 >>> 15 ^ l4 << 34;
        lArray[2] = l4 >>> 30 ^ l5 << 19;
        lArray[3] = l5 >>> 45 ^ l6 << 4 ^ l7 << 53;
        lArray[4] = l6 >>> 60 ^ l8 << 38 ^ l7 >>> 11;
        lArray[5] = l8 >>> 26 ^ l9 << 23;
        lArray[6] = l9 >>> 41;
        lArray[7] = 0L;
    }

    private static void e(long[] lArray, long[] lArray2) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = lArray[3];
        lArray2[0] = l2 & 0x1FFFFFFFFFFFFL;
        lArray2[1] = (l2 >>> 49 ^ l3 << 15) & 0x1FFFFFFFFFFFFL;
        lArray2[2] = (l3 >>> 34 ^ l4 << 30) & 0x1FFFFFFFFFFFFL;
        lArray2[3] = l4 >>> 19 ^ l5 << 45;
    }

    private static void d(long[] lArray, long[] lArray2, long[] lArray3) {
        int n2;
        long[] lArray4 = new long[4];
        long[] lArray5 = new long[4];
        bo.e(lArray, lArray4);
        bo.e(lArray2, lArray5);
        bo.a(lArray4[0], lArray5[0], lArray3, 0);
        bo.a(lArray4[1], lArray5[1], lArray3, 1);
        bo.a(lArray4[2], lArray5[2], lArray3, 2);
        bo.a(lArray4[3], lArray5[3], lArray3, 3);
        for (n2 = 5; n2 > 0; --n2) {
            int n3 = n2;
            lArray3[n3] = lArray3[n3] ^ lArray3[n2 - 1];
        }
        bo.a(lArray4[0] ^ lArray4[1], lArray5[0] ^ lArray5[1], lArray3, 1);
        bo.a(lArray4[2] ^ lArray4[3], lArray5[2] ^ lArray5[3], lArray3, 3);
        for (n2 = 7; n2 > 1; --n2) {
            int n4 = n2;
            lArray3[n4] = lArray3[n4] ^ lArray3[n2 - 2];
        }
        long l2 = lArray4[0] ^ lArray4[2];
        long l3 = lArray4[1] ^ lArray4[3];
        long l4 = lArray5[0] ^ lArray5[2];
        long l5 = lArray5[1] ^ lArray5[3];
        bo.a(l2 ^ l3, l4 ^ l5, lArray3, 3);
        lArray = new long[3];
        bo.a(l2, l4, lArray, 0);
        bo.a(l3, l5, lArray, 1);
        long l6 = lArray[0];
        long l7 = lArray[1];
        long l8 = lArray[2];
        lArray3[2] = lArray3[2] ^ l6;
        lArray3[3] = lArray3[3] ^ (l6 ^ l7);
        lArray3[4] = lArray3[4] ^ (l8 ^ l7);
        lArray3[5] = lArray3[5] ^ l8;
        bo.a(lArray3);
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
        long l5 = lArray3[n3 & 7] ^ lArray3[n3 >>> 3 & 7] << 3;
        int n4 = 36;
        do {
            n3 = (int)(l2 >>> n4);
            long l6 = lArray3[n3 & 7] ^ lArray3[n3 >>> 3 & 7] << 3 ^ lArray3[n3 >>> 6 & 7] << 6 ^ lArray3[n3 >>> 9 & 7] << 9 ^ lArray3[n3 >>> 12 & 7] << 12;
            l5 ^= l6 << n4;
            l4 ^= l6 >>> -n4;
        } while ((n4 -= 15) > 0);
        int n5 = n2;
        lArray[n5] = lArray[n5] ^ l5 & 0x1FFFFFFFFFFFFL;
        int n6 = n2 + 1;
        lArray[n6] = lArray[n6] ^ (l5 >>> 49 ^ l4 << 15);
    }

    private static void f(long[] lArray, long[] lArray2) {
        org.bouncycastle.asn1.util.a.a(lArray[0], lArray2, 0);
        org.bouncycastle.asn1.util.a.a(lArray[1], lArray2, 2);
        org.bouncycastle.asn1.util.a.a(lArray[2], lArray2, 4);
        lArray2[6] = lArray[3] & 1L;
    }

    public bo() {
    }

    public bo(SecureRandom secureRandom) {
        this.a = secureRandom;
        this.b = 192;
    }

    public final SecureRandom i() {
        return this.a;
    }

    public final int j() {
        return this.b;
    }
}

