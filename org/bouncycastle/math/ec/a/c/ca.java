/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.crypto.a.a.c;
import org.bouncycastle.e.a;
import org.bouncycastle.openpgp.h;

public final class ca {
    private final String a;
    private final BigInteger b;
    private final BigInteger c;
    private final BigInteger[] d;
    private final BigInteger[] e;

    private static void c(long[] lArray, long[] lArray2, long[] lArray3) {
        lArray3[0] = lArray[0] ^ lArray2[0];
        lArray3[1] = lArray[1] ^ lArray2[1];
        lArray3[2] = lArray[2] ^ lArray2[2];
        lArray3[3] = lArray[3] ^ lArray2[3];
        lArray3[4] = lArray[4] ^ lArray2[4];
        lArray3[5] = lArray[5] ^ lArray2[5];
        lArray3[6] = lArray[6] ^ lArray2[6];
        lArray3[7] = lArray[7] ^ lArray2[7];
    }

    public static long[] a(BigInteger object) {
        long[] lArray = h.b((BigInteger)object);
        object = lArray;
        long[] lArray2 = lArray;
        long l2 = lArray[3];
        long l3 = l2 >>> 47;
        lArray2[0] = lArray2[0] ^ l3;
        lArray2[2] = lArray2[2] ^ l3 << 30;
        lArray2[3] = l2 & 0x7FFFFFFFFFFFL;
        return object;
    }

    public static void a(long[] lArray, long[] lArray2) {
        if (h.b(lArray)) {
            throw new IllegalStateException();
        }
        long[] lArray3 = new long[4];
        long[] lArray4 = new long[4];
        ca.c(lArray, lArray3);
        ca.a(lArray3, lArray, lArray3);
        ca.c(lArray3, lArray3);
        ca.a(lArray3, lArray, lArray3);
        ca.a(lArray3, 3, lArray4);
        ca.a(lArray4, lArray3, lArray4);
        ca.c(lArray4, lArray4);
        ca.a(lArray4, lArray, lArray4);
        ca.a(lArray4, 7, lArray3);
        ca.a(lArray3, lArray4, lArray3);
        ca.a(lArray3, 14, lArray4);
        ca.a(lArray4, lArray3, lArray4);
        ca.c(lArray4, lArray4);
        ca.a(lArray4, lArray, lArray4);
        ca.a(lArray4, 29, lArray3);
        ca.a(lArray3, lArray4, lArray3);
        ca.c(lArray3, lArray3);
        ca.a(lArray3, lArray, lArray3);
        ca.a(lArray3, 59, lArray4);
        ca.a(lArray4, lArray3, lArray4);
        ca.c(lArray4, lArray4);
        ca.a(lArray4, lArray, lArray4);
        ca.a(lArray4, 119, lArray3);
        ca.a(lArray3, lArray4, lArray3);
        ca.c(lArray3, lArray2);
    }

    public static void a(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[8];
        ca.d(lArray, lArray2, lArray4);
        ca.b(lArray4, lArray3);
    }

    public static void b(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[8];
        ca.d(lArray, lArray2, lArray4);
        ca.c(lArray3, lArray4, lArray3);
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
        l5 ^= l9 << 17;
        l6 ^= l9 >>> 47;
        l7 ^= l9 << 47;
        l4 ^= (l8 ^= l9 >>> 17) << 17;
        l5 ^= l8 >>> 47;
        l6 ^= l8 << 47;
        l3 ^= (l7 ^= l8 >>> 17) << 17;
        l4 ^= l7 >>> 47;
        l5 ^= l7 << 47;
        long l10 = (l5 ^= l6 >>> 17) >>> 47;
        lArray2[0] = (l2 ^= (l6 ^= l7 >>> 17) << 17) ^ l10;
        lArray2[1] = l3 ^= l6 >>> 47;
        lArray2[2] = (l4 ^= l6 << 47) ^ l10 << 30;
        lArray2[3] = l5 & 0x7FFFFFFFFFFFL;
    }

    public static void c(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[8];
        ca.f(lArray, lArray3);
        ca.b(lArray3, lArray2);
    }

    public static void d(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[8];
        ca.f(lArray, lArray3);
        ca.c(lArray2, lArray3, lArray2);
    }

    public static void a(long[] lArray, int n2, long[] lArray2) {
        long[] lArray3 = new long[8];
        ca.f(lArray, lArray3);
        ca.b(lArray3, lArray2);
        while (--n2 > 0) {
            ca.f(lArray2, lArray3);
            ca.b(lArray3, lArray2);
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
        lArray[0] = l2 ^ l3 << 60;
        lArray[1] = l3 >>> 4 ^ l4 << 56;
        lArray[2] = l4 >>> 8 ^ l5 << 52;
        lArray[3] = l5 >>> 12 ^ l6 << 48;
        lArray[4] = l6 >>> 16 ^ l7 << 44;
        lArray[5] = l7 >>> 20 ^ l8 << 40;
        lArray[6] = l8 >>> 24 ^ l9 << 36;
        lArray[7] = l9 >>> 28;
    }

    private static void e(long[] lArray, long[] lArray2) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = lArray[3];
        lArray2[0] = l2 & 0xFFFFFFFFFFFFFFFL;
        lArray2[1] = (l2 >>> 60 ^ l3 << 4) & 0xFFFFFFFFFFFFFFFL;
        lArray2[2] = (l3 >>> 56 ^ l4 << 8) & 0xFFFFFFFFFFFFFFFL;
        lArray2[3] = l4 >>> 52 ^ l5 << 12;
    }

    private static void d(long[] lArray, long[] lArray2, long[] lArray3) {
        int n2;
        long[] lArray4 = new long[4];
        long[] lArray5 = new long[4];
        ca.e(lArray, lArray4);
        ca.e(lArray2, lArray5);
        ca.a(lArray4[0], lArray5[0], lArray3, 0);
        ca.a(lArray4[1], lArray5[1], lArray3, 1);
        ca.a(lArray4[2], lArray5[2], lArray3, 2);
        ca.a(lArray4[3], lArray5[3], lArray3, 3);
        for (n2 = 5; n2 > 0; --n2) {
            int n3 = n2;
            lArray3[n3] = lArray3[n3] ^ lArray3[n2 - 1];
        }
        ca.a(lArray4[0] ^ lArray4[1], lArray5[0] ^ lArray5[1], lArray3, 1);
        ca.a(lArray4[2] ^ lArray4[3], lArray5[2] ^ lArray5[3], lArray3, 3);
        for (n2 = 7; n2 > 1; --n2) {
            int n4 = n2;
            lArray3[n4] = lArray3[n4] ^ lArray3[n2 - 2];
        }
        long l2 = lArray4[0] ^ lArray4[2];
        long l3 = lArray4[1] ^ lArray4[3];
        long l4 = lArray5[0] ^ lArray5[2];
        long l5 = lArray5[1] ^ lArray5[3];
        ca.a(l2 ^ l3, l4 ^ l5, lArray3, 3);
        lArray = new long[3];
        ca.a(l2, l4, lArray, 0);
        ca.a(l3, l5, lArray, 1);
        long l6 = lArray[0];
        long l7 = lArray[1];
        long l8 = lArray[2];
        lArray3[2] = lArray3[2] ^ l6;
        lArray3[3] = lArray3[3] ^ (l6 ^ l7);
        lArray3[4] = lArray3[4] ^ (l8 ^ l7);
        lArray3[5] = lArray3[5] ^ l8;
        ca.a(lArray3);
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
        int n4 = 54;
        do {
            n3 = (int)(l2 >>> n4);
            long l6 = lArray3[n3 & 7] ^ lArray3[n3 >>> 3 & 7] << 3;
            l5 ^= l6 << n4;
            l4 ^= l6 >>> -n4;
        } while ((n4 -= 6) > 0);
        int n5 = n2;
        lArray[n5] = lArray[n5] ^ l5 & 0xFFFFFFFFFFFFFFFL;
        int n6 = n2 + 1;
        lArray[n6] = lArray[n6] ^ (l5 >>> 60 ^ (l4 ^= (l2 & 0x820820820820820L & l3 << 4 >> 63) >>> 5) << 4);
    }

    private static void f(long[] lArray, long[] lArray2) {
        org.bouncycastle.asn1.util.a.a(lArray[0], lArray2, 0);
        org.bouncycastle.asn1.util.a.a(lArray[1], lArray2, 2);
        org.bouncycastle.asn1.util.a.a(lArray[2], lArray2, 4);
        long l2 = lArray[3];
        lArray2[6] = org.bouncycastle.asn1.util.a.d((int)l2);
        lArray2[7] = (long)org.bouncycastle.asn1.util.a.c((int)(l2 >>> 32)) & 0xFFFFFFFFL;
    }

    public ca(String string, BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArray, BigInteger[] bigIntegerArray2) {
        org.bouncycastle.crypto.a.a.c.a((Object)string, "participantId");
        org.bouncycastle.crypto.a.a.c.a((Object)bigInteger, "gx1");
        org.bouncycastle.crypto.a.a.c.a((Object)bigInteger2, "gx2");
        org.bouncycastle.crypto.a.a.c.a(bigIntegerArray, "knowledgeProofForX1");
        org.bouncycastle.crypto.a.a.c.a(bigIntegerArray2, "knowledgeProofForX2");
        this.a = string;
        this.b = bigInteger;
        this.c = bigInteger2;
        this.d = org.bouncycastle.e.a.a(bigIntegerArray, bigIntegerArray.length);
        this.e = org.bouncycastle.e.a.a(bigIntegerArray2, bigIntegerArray2.length);
    }

    public final String a() {
        return this.a;
    }

    public final BigInteger b() {
        return this.b;
    }

    public final BigInteger c() {
        return this.c;
    }

    public final BigInteger[] d() {
        return org.bouncycastle.e.a.a(this.d, this.d.length);
    }

    public final BigInteger[] e() {
        return org.bouncycastle.e.a.a(this.e, this.e.length);
    }
}

