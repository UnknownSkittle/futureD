/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.crypto.a.a.c;
import org.bouncycastle.jcajce.provider.c.a;

public final class ck {
    private final String a;
    private final BigInteger b;
    private final BigInteger[] c;

    private static void c(long[] lArray, long[] lArray2, long[] lArray3) {
        for (int i2 = 0; i2 < 13; ++i2) {
            lArray3[i2] = lArray[i2] ^ lArray2[i2];
        }
    }

    public static long[] a(BigInteger object) {
        Object object2 = object;
        if (((BigInteger)object2).signum() < 0 || ((BigInteger)object2).bitLength() > 448) {
            throw new IllegalArgumentException();
        }
        object = new long[7];
        int n2 = 0;
        while (((BigInteger)object2).signum() != 0) {
            object[n2++] = ((BigInteger)object2).longValue();
            object2 = ((BigInteger)object2).shiftRight(64);
        }
        object2 = object;
        Object object3 = object2[6];
        reference var4_4 = object3 >>> 25;
        Object object4 = object2;
        object4[0] = object4[0] ^ var4_4;
        Object object5 = object2;
        object5[1] = object5[1] ^ var4_4 << 23;
        object2[6] = object3 & 0x1FFFFFFL;
        return object;
    }

    public static void a(long[] lArray, long[] lArray2) {
        if (org.bouncycastle.jcajce.provider.c.a.a(lArray)) {
            throw new IllegalStateException();
        }
        long[] lArray3 = new long[7];
        long[] lArray4 = new long[7];
        long[] lArray5 = new long[7];
        ck.c(lArray, lArray3);
        ck.a(lArray3, 1, lArray4);
        ck.a(lArray3, lArray4, lArray3);
        ck.a(lArray4, 1, lArray4);
        ck.a(lArray3, lArray4, lArray3);
        ck.a(lArray3, 3, lArray4);
        ck.a(lArray3, lArray4, lArray3);
        ck.a(lArray3, 6, lArray4);
        ck.a(lArray3, lArray4, lArray3);
        ck.a(lArray3, 12, lArray4);
        ck.a(lArray3, lArray4, lArray5);
        ck.a(lArray5, 24, lArray3);
        ck.a(lArray3, 24, lArray4);
        ck.a(lArray3, lArray4, lArray3);
        ck.a(lArray3, 48, lArray4);
        ck.a(lArray3, lArray4, lArray3);
        ck.a(lArray3, 96, lArray4);
        ck.a(lArray3, lArray4, lArray3);
        ck.a(lArray3, 192, lArray4);
        ck.a(lArray3, lArray4, lArray3);
        ck.a(lArray3, lArray5, lArray2);
    }

    public static void a(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[14];
        ck.d(lArray, lArray2, lArray4);
        ck.b(lArray4, lArray3);
    }

    public static void b(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[14];
        ck.d(lArray, lArray2, lArray4);
        ck.c(lArray3, lArray4, lArray3);
    }

    public static void b(long[] lArray, long[] lArray2) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = lArray[3];
        long l6 = lArray[4];
        long l7 = lArray[5];
        long l8 = lArray[6];
        long l9 = lArray[7];
        long l10 = lArray[12];
        l7 ^= l10 << 39;
        l8 ^= l10 >>> 25 ^ l10 << 62;
        l9 ^= l10 >>> 2;
        l10 = lArray[11];
        l6 ^= l10 << 39;
        l7 ^= l10 >>> 25 ^ l10 << 62;
        l8 ^= l10 >>> 2;
        l10 = lArray[10];
        l5 ^= l10 << 39;
        l6 ^= l10 >>> 25 ^ l10 << 62;
        l7 ^= l10 >>> 2;
        l10 = lArray[9];
        l4 ^= l10 << 39;
        l5 ^= l10 >>> 25 ^ l10 << 62;
        l6 ^= l10 >>> 2;
        l10 = lArray[8];
        l3 ^= l10 << 39;
        l4 ^= l10 >>> 25 ^ l10 << 62;
        long l11 = l8 >>> 25;
        lArray2[0] = (l2 ^= l9 << 39) ^ l11;
        lArray2[1] = (l3 ^= l9 >>> 25 ^ l9 << 62) ^ l11 << 23;
        lArray2[2] = l4 ^= l9 >>> 2;
        lArray2[3] = l5 ^= l10 >>> 2;
        lArray2[4] = l6;
        lArray2[5] = l7;
        lArray2[6] = l8 & 0x1FFFFFFL;
    }

    public static void c(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[13];
        ck.f(lArray, lArray3);
        ck.b(lArray3, lArray2);
    }

    public static void d(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[13];
        ck.f(lArray, lArray3);
        ck.c(lArray2, lArray3, lArray2);
    }

    public static void a(long[] lArray, int n2, long[] lArray2) {
        long[] lArray3 = new long[13];
        ck.f(lArray, lArray3);
        ck.b(lArray3, lArray2);
        while (--n2 > 0) {
            ck.f(lArray2, lArray3);
            ck.b(lArray3, lArray2);
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
        long l10 = lArray[8];
        long l11 = lArray[9];
        long l12 = lArray[10];
        long l13 = lArray[11];
        long l14 = lArray[12];
        long l15 = lArray[13];
        lArray[0] = l2 ^ l3 << 59;
        lArray[1] = l3 >>> 5 ^ l4 << 54;
        lArray[2] = l4 >>> 10 ^ l5 << 49;
        lArray[3] = l5 >>> 15 ^ l6 << 44;
        lArray[4] = l6 >>> 20 ^ l7 << 39;
        lArray[5] = l7 >>> 25 ^ l8 << 34;
        lArray[6] = l8 >>> 30 ^ l9 << 29;
        lArray[7] = l9 >>> 35 ^ l10 << 24;
        lArray[8] = l10 >>> 40 ^ l11 << 19;
        lArray[9] = l11 >>> 45 ^ l12 << 14;
        lArray[10] = l12 >>> 50 ^ l13 << 9;
        lArray[11] = l13 >>> 55 ^ l14 << 4 ^ l15 << 63;
        lArray[12] = l14 >>> 60 ^ l15 >>> 1;
        lArray[13] = 0L;
    }

    private static void e(long[] lArray, long[] lArray2) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = lArray[3];
        long l6 = lArray[4];
        long l7 = lArray[5];
        long l8 = lArray[6];
        lArray2[0] = l2 & 0x7FFFFFFFFFFFFFFL;
        lArray2[1] = (l2 >>> 59 ^ l3 << 5) & 0x7FFFFFFFFFFFFFFL;
        lArray2[2] = (l3 >>> 54 ^ l4 << 10) & 0x7FFFFFFFFFFFFFFL;
        lArray2[3] = (l4 >>> 49 ^ l5 << 15) & 0x7FFFFFFFFFFFFFFL;
        lArray2[4] = (l5 >>> 44 ^ l6 << 20) & 0x7FFFFFFFFFFFFFFL;
        lArray2[5] = (l6 >>> 39 ^ l7 << 25) & 0x7FFFFFFFFFFFFFFL;
        lArray2[6] = l7 >>> 34 ^ l8 << 30;
    }

    private static void d(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[7];
        long[] lArray5 = new long[7];
        ck.e(lArray, lArray4);
        ck.e(lArray2, lArray5);
        for (int i2 = 0; i2 < 7; ++i2) {
            ck.a(lArray4, lArray5[i2], lArray3, i2);
        }
        ck.a(lArray3);
    }

    private static void a(long[] lArray, long l2, long[] lArray2, int n2) {
        long[] lArray3 = new long[8];
        long[] lArray4 = lArray3;
        lArray3[1] = l2;
        lArray4[2] = lArray4[1] << 1;
        lArray4[3] = lArray4[2] ^ l2;
        lArray4[4] = lArray4[2] << 1;
        lArray4[5] = lArray4[4] ^ l2;
        lArray4[6] = lArray4[3] << 1;
        lArray4[7] = lArray4[6] ^ l2;
        for (int i2 = 0; i2 < 7; ++i2) {
            long l3 = lArray[i2];
            int n3 = (int)l3;
            long l4 = 0L;
            long l5 = lArray4[n3 & 7] ^ lArray4[n3 >>> 3 & 7] << 3;
            int n4 = 54;
            do {
                n3 = (int)(l3 >>> n4);
                long l6 = lArray4[n3 & 7] ^ lArray4[n3 >>> 3 & 7] << 3;
                l5 ^= l6 << n4;
                l4 ^= l6 >>> -n4;
            } while ((n4 -= 6) > 0);
            int n5 = n2 + i2;
            lArray2[n5] = lArray2[n5] ^ l5 & 0x7FFFFFFFFFFFFFFL;
            int n6 = n2 + i2 + 1;
            lArray2[n6] = lArray2[n6] ^ (l5 >>> 59 ^ l4 << 5);
        }
    }

    private static void f(long[] lArray, long[] lArray2) {
        for (int i2 = 0; i2 < 6; ++i2) {
            org.bouncycastle.asn1.util.a.a(lArray[i2], lArray2, i2 << 1);
        }
        lArray2[12] = org.bouncycastle.asn1.util.a.d((int)lArray[6]);
    }

    public ck(String string, BigInteger bigInteger, BigInteger[] bigIntegerArray) {
        org.bouncycastle.crypto.a.a.c.a((Object)string, "participantId");
        org.bouncycastle.crypto.a.a.c.a((Object)bigInteger, "a");
        org.bouncycastle.crypto.a.a.c.a(bigIntegerArray, "knowledgeProofForX2s");
        this.a = string;
        this.b = bigInteger;
        this.c = org.bouncycastle.e.a.a(bigIntegerArray, bigIntegerArray.length);
    }

    public final String a() {
        return this.a;
    }

    public final BigInteger b() {
        return this.b;
    }

    public final BigInteger[] c() {
        return org.bouncycastle.e.a.a(this.c, this.c.length);
    }
}

