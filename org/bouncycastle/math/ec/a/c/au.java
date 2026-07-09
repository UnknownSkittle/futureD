/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.b.f;

public final class au {
    private int a = 11994318;

    private static void c(long[] lArray, long[] lArray2, long[] lArray3) {
        lArray3[0] = lArray[0] ^ lArray2[0];
        lArray3[1] = lArray[1] ^ lArray2[1];
        lArray3[2] = lArray[2] ^ lArray2[2];
        lArray3[3] = lArray[3] ^ lArray2[3];
    }

    public static long[] a(BigInteger object) {
        Object object2 = object;
        if (((BigInteger)object2).signum() < 0 || ((BigInteger)object2).bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        object = new long[2];
        int n2 = 0;
        while (((BigInteger)object2).signum() != 0) {
            object[n2++] = ((BigInteger)object2).longValue();
            object2 = ((BigInteger)object2).shiftRight(64);
        }
        object2 = object;
        Object object3 = object2[1];
        reference var4_4 = object3 >>> 49;
        Object object4 = object2;
        reference v1 = var4_4;
        object4[0] = object4[0] ^ (v1 ^ v1 << 9);
        object2[1] = object3 & 0x1FFFFFFFFFFFFL;
        return object;
    }

    public static void a(long[] lArray, long[] lArray2) {
        if (f.a(lArray)) {
            throw new IllegalStateException();
        }
        long[] lArray3 = new long[2];
        long[] lArray4 = new long[2];
        au.c(lArray, lArray3);
        au.a(lArray3, lArray, lArray3);
        au.c(lArray3, lArray3);
        au.a(lArray3, lArray, lArray3);
        au.a(lArray3, 3, lArray4);
        au.a(lArray4, lArray3, lArray4);
        au.c(lArray4, lArray4);
        au.a(lArray4, lArray, lArray4);
        au.a(lArray4, 7, lArray3);
        au.a(lArray3, lArray4, lArray3);
        au.a(lArray3, 14, lArray4);
        au.a(lArray4, lArray3, lArray4);
        au.a(lArray4, 28, lArray3);
        au.a(lArray3, lArray4, lArray3);
        au.a(lArray3, 56, lArray4);
        au.a(lArray4, lArray3, lArray4);
        au.c(lArray4, lArray2);
    }

    public static void a(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[4];
        au.d(lArray, lArray2, lArray4);
        au.b(lArray4, lArray3);
    }

    public static void b(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[4];
        au.d(lArray, lArray2, lArray4);
        au.c(lArray3, lArray4, lArray3);
    }

    public static void b(long[] lArray, long[] lArray2) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = lArray[3];
        l3 ^= l5 << 15 ^ l5 << 24;
        long l6 = (l3 ^= l4 >>> 49 ^ l4 >>> 40) >>> 49;
        lArray2[0] = (l2 ^= (l4 ^= l5 >>> 49 ^ l5 >>> 40) << 15 ^ l4 << 24) ^ l6 ^ l6 << 9;
        lArray2[1] = l3 & 0x1FFFFFFFFFFFFL;
    }

    public static void c(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[4];
        au.e(lArray, lArray3);
        au.b(lArray3, lArray2);
    }

    public static void d(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[4];
        au.e(lArray, lArray3);
        au.c(lArray2, lArray3, lArray2);
    }

    public static void a(long[] lArray, int n2, long[] lArray2) {
        long[] lArray3 = new long[4];
        au.e(lArray, lArray3);
        au.b(lArray3, lArray2);
        while (--n2 > 0) {
            au.e(lArray2, lArray3);
            au.b(lArray3, lArray2);
        }
    }

    private static void d(long[] lArray, long[] lArray2, long[] lArray3) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        l3 = (l2 >>> 57 ^ l3 << 7) & 0x1FFFFFFFFFFFFFFL;
        long l4 = lArray2[0];
        long l5 = lArray2[1];
        l5 = (l4 >>> 57 ^ l5 << 7) & 0x1FFFFFFFFFFFFFFL;
        lArray = new long[6];
        au.a(l2 &= 0x1FFFFFFFFFFFFFFL, l4 &= 0x1FFFFFFFFFFFFFFL, lArray, 0);
        au.a(l3, l5, lArray, 2);
        au.a(l2 ^ l3, l4 ^ l5, lArray, 4);
        long l6 = lArray[1] ^ lArray[2];
        long l7 = lArray[0];
        long l8 = lArray[3];
        long l9 = lArray[4] ^ l7 ^ l6;
        long l10 = lArray[5] ^ l8 ^ l6;
        lArray3[0] = l7 ^ l9 << 57;
        lArray3[1] = l9 >>> 7 ^ l10 << 50;
        lArray3[2] = l10 >>> 14 ^ l8 << 43;
        lArray3[3] = l8 >>> 21;
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

    private static void e(long[] lArray, long[] lArray2) {
        org.bouncycastle.asn1.util.a.a(lArray[0], lArray2, 0);
        org.bouncycastle.asn1.util.a.a(lArray[1], lArray2, 2);
    }

    public final void a(int n2) {
        this.a ^= n2 << 16;
        for (n2 = 0; n2 < 8; ++n2) {
            this.a <<= 1;
            if ((this.a & 0x1000000) == 0) continue;
            this.a ^= 0x1864CFB;
        }
    }

    public final int a() {
        return this.a;
    }

    public final void b() {
        this.a = 11994318;
    }
}

