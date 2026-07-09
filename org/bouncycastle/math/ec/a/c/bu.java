/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.crypto.a.a.c;
import org.bouncycastle.crypto.j;
import org.bouncycastle.math.ec.a.c.ca;
import org.bouncycastle.math.ec.a.c.ck;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.h;

public final class bu {
    private final String a;
    private char[] b;
    private final j c;
    private final SecureRandom d;
    private final BigInteger e;
    private final BigInteger f;
    private final BigInteger g;
    private String h;
    private BigInteger i;
    private BigInteger j;
    private BigInteger k;
    private BigInteger l;
    private BigInteger m;
    private BigInteger n;
    private BigInteger o;
    private int p;

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
        long[] lArray = org.bouncycastle.openpgp.h.b((BigInteger)object);
        object = lArray;
        long[] lArray2 = lArray;
        long l2 = lArray[3];
        long l3 = l2 >>> 41;
        lArray2[0] = lArray2[0] ^ l3;
        lArray2[1] = lArray2[1] ^ l3 << 10;
        lArray2[3] = l2 & 0x1FFFFFFFFFFL;
        return object;
    }

    public static void a(long[] lArray, long[] lArray2) {
        if (org.bouncycastle.openpgp.h.b(lArray)) {
            throw new IllegalStateException();
        }
        long[] lArray3 = new long[4];
        long[] lArray4 = new long[4];
        bu.c(lArray, lArray3);
        bu.a(lArray3, lArray, lArray3);
        bu.c(lArray3, lArray3);
        bu.a(lArray3, lArray, lArray3);
        bu.a(lArray3, 3, lArray4);
        bu.a(lArray4, lArray3, lArray4);
        bu.c(lArray4, lArray4);
        bu.a(lArray4, lArray, lArray4);
        bu.a(lArray4, 7, lArray3);
        bu.a(lArray3, lArray4, lArray3);
        bu.a(lArray3, 14, lArray4);
        bu.a(lArray4, lArray3, lArray4);
        bu.c(lArray4, lArray4);
        bu.a(lArray4, lArray, lArray4);
        bu.a(lArray4, 29, lArray3);
        bu.a(lArray3, lArray4, lArray3);
        bu.a(lArray3, 58, lArray4);
        bu.a(lArray4, lArray3, lArray4);
        bu.a(lArray4, 116, lArray3);
        bu.a(lArray3, lArray4, lArray3);
        bu.c(lArray3, lArray2);
    }

    public static void a(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[8];
        bu.d(lArray, lArray2, lArray4);
        bu.b(lArray4, lArray3);
    }

    public static void b(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[8];
        bu.d(lArray, lArray2, lArray4);
        bu.c(lArray3, lArray4, lArray3);
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
        l5 ^= l9 << 23;
        l6 ^= l9 >>> 41 ^ l9 << 33;
        l4 ^= l8 << 23;
        l5 ^= l8 >>> 41 ^ l8 << 33;
        l3 ^= (l7 ^= l9 >>> 31) << 23;
        l4 ^= l7 >>> 41 ^ l7 << 33;
        long l10 = (l5 ^= l7 >>> 31) >>> 41;
        lArray2[0] = (l2 ^= (l6 ^= l8 >>> 31) << 23) ^ l10;
        lArray2[1] = (l3 ^= l6 >>> 41 ^ l6 << 33) ^ l10 << 10;
        lArray2[2] = l4 ^= l6 >>> 31;
        lArray2[3] = l5 & 0x1FFFFFFFFFFL;
    }

    public static void c(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[8];
        bu.f(lArray, lArray3);
        bu.b(lArray3, lArray2);
    }

    public static void d(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[8];
        bu.f(lArray, lArray3);
        bu.c(lArray2, lArray3, lArray2);
    }

    public static void a(long[] lArray, int n2, long[] lArray2) {
        long[] lArray3 = new long[8];
        bu.f(lArray, lArray3);
        bu.b(lArray3, lArray2);
        while (--n2 > 0) {
            bu.f(lArray2, lArray3);
            bu.b(lArray3, lArray2);
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
        lArray[0] = l2 ^ l3 << 59;
        lArray[1] = l3 >>> 5 ^ l4 << 54;
        lArray[2] = l4 >>> 10 ^ l5 << 49;
        lArray[3] = l5 >>> 15 ^ l6 << 44;
        lArray[4] = l6 >>> 20 ^ l7 << 39;
        lArray[5] = l7 >>> 25 ^ l8 << 34;
        lArray[6] = l8 >>> 30 ^ l9 << 29;
        lArray[7] = l9 >>> 35;
    }

    private static void e(long[] lArray, long[] lArray2) {
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = lArray[3];
        lArray2[0] = l2 & 0x7FFFFFFFFFFFFFFL;
        lArray2[1] = (l2 >>> 59 ^ l3 << 5) & 0x7FFFFFFFFFFFFFFL;
        lArray2[2] = (l3 >>> 54 ^ l4 << 10) & 0x7FFFFFFFFFFFFFFL;
        lArray2[3] = l4 >>> 49 ^ l5 << 15;
    }

    private static void d(long[] lArray, long[] lArray2, long[] lArray3) {
        int n2;
        long[] lArray4 = new long[4];
        long[] lArray5 = new long[4];
        bu.e(lArray, lArray4);
        bu.e(lArray2, lArray5);
        bu.a(lArray4[0], lArray5[0], lArray3, 0);
        bu.a(lArray4[1], lArray5[1], lArray3, 1);
        bu.a(lArray4[2], lArray5[2], lArray3, 2);
        bu.a(lArray4[3], lArray5[3], lArray3, 3);
        for (n2 = 5; n2 > 0; --n2) {
            int n3 = n2;
            lArray3[n3] = lArray3[n3] ^ lArray3[n2 - 1];
        }
        bu.a(lArray4[0] ^ lArray4[1], lArray5[0] ^ lArray5[1], lArray3, 1);
        bu.a(lArray4[2] ^ lArray4[3], lArray5[2] ^ lArray5[3], lArray3, 3);
        for (n2 = 7; n2 > 1; --n2) {
            int n4 = n2;
            lArray3[n4] = lArray3[n4] ^ lArray3[n2 - 2];
        }
        long l2 = lArray4[0] ^ lArray4[2];
        long l3 = lArray4[1] ^ lArray4[3];
        long l4 = lArray5[0] ^ lArray5[2];
        long l5 = lArray5[1] ^ lArray5[3];
        bu.a(l2 ^ l3, l4 ^ l5, lArray3, 3);
        lArray = new long[3];
        bu.a(l2, l4, lArray, 0);
        bu.a(l3, l5, lArray, 1);
        long l6 = lArray[0];
        long l7 = lArray[1];
        long l8 = lArray[2];
        lArray3[2] = lArray3[2] ^ l6;
        lArray3[3] = lArray3[3] ^ (l6 ^ l7);
        lArray3[4] = lArray3[4] ^ (l8 ^ l7);
        lArray3[5] = lArray3[5] ^ l8;
        bu.a(lArray3);
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
        lArray[n5] = lArray[n5] ^ l5 & 0x7FFFFFFFFFFFFFFL;
        int n6 = n2 + 1;
        lArray[n6] = lArray[n6] ^ (l5 >>> 59 ^ l4 << 5);
    }

    private static void f(long[] lArray, long[] lArray2) {
        org.bouncycastle.asn1.util.a.a(lArray[0], lArray2, 0);
        org.bouncycastle.asn1.util.a.a(lArray[1], lArray2, 2);
        org.bouncycastle.asn1.util.a.a(lArray[2], lArray2, 4);
        long l2 = lArray[3];
        lArray2[6] = org.bouncycastle.asn1.util.a.d((int)l2);
        lArray2[7] = (long)org.bouncycastle.asn1.util.a.c((int)(l2 >>> 32)) & 0xFFFFFFFFL;
    }

    public bu(String object, char[] cArray, org.bouncycastle.crypto.a.a.a a2, j j2, SecureRandom secureRandom) {
        org.bouncycastle.crypto.a.a.c.a(object, "participantId");
        org.bouncycastle.crypto.a.a.c.a(cArray, "password");
        org.bouncycastle.crypto.a.a.c.a(a2, "p");
        org.bouncycastle.crypto.a.a.c.a((Object)j2, "digest");
        org.bouncycastle.crypto.a.a.c.a(secureRandom, "random");
        if (cArray.length == 0) {
            throw new IllegalArgumentException("Password must not be empty.");
        }
        this.a = object;
        int n2 = cArray.length;
        object = cArray;
        char[] cArray2 = new char[n2];
        if (n2 < ((Object)object).length) {
            System.arraycopy(object, 0, cArray2, 0, n2);
        } else {
            System.arraycopy(object, 0, cArray2, 0, ((Object)object).length);
        }
        this.b = cArray2;
        this.e = a2.a();
        this.f = a2.b();
        this.g = a2.c();
        this.c = j2;
        this.d = secureRandom;
        this.p = 0;
    }

    public final ca a() {
        if (this.p >= 10) {
            throw new IllegalStateException("Round1 payload already created for " + this.a);
        }
        this.i = org.bouncycastle.crypto.a.a.c.a(this.f, this.d);
        this.j = org.bouncycastle.crypto.a.a.c.b(this.f, this.d);
        this.k = org.bouncycastle.crypto.a.a.c.a(this.e, this.g, this.i);
        this.l = org.bouncycastle.crypto.a.a.c.a(this.e, this.g, this.j);
        BigInteger[] bigIntegerArray = org.bouncycastle.crypto.a.a.c.a(this.e, this.f, this.g, this.k, this.i, this.a, this.c, this.d);
        BigInteger[] bigIntegerArray2 = org.bouncycastle.crypto.a.a.c.a(this.e, this.f, this.g, this.l, this.j, this.a, this.c, this.d);
        this.p = 10;
        return new ca(this.a, this.k, this.l, bigIntegerArray, bigIntegerArray2);
    }

    public final void a(ca ca2) {
        if (this.p >= 20) {
            throw new IllegalStateException("Validation already attempted for round1 payload for" + this.a);
        }
        this.h = ca2.a();
        this.m = ca2.b();
        this.n = ca2.c();
        BigInteger[] bigIntegerArray = ca2.d();
        BigInteger[] bigIntegerArray2 = ca2.e();
        org.bouncycastle.crypto.a.a.c.a(this.a, ca2.a());
        org.bouncycastle.crypto.a.a.c.a(this.n);
        org.bouncycastle.crypto.a.a.c.a(this.e, this.f, this.g, this.m, bigIntegerArray, ca2.a(), this.c);
        org.bouncycastle.crypto.a.a.c.a(this.e, this.f, this.g, this.n, bigIntegerArray2, ca2.a(), this.c);
        this.p = 20;
    }

    public final ck b() {
        if (this.p >= 30) {
            throw new IllegalStateException("Round2 payload already created for " + this.a);
        }
        if (this.p < 20) {
            throw new IllegalStateException("Round1 payload must be validated prior to creating Round2 payload for " + this.a);
        }
        BigInteger[] bigIntegerArray = org.bouncycastle.crypto.a.a.c.a(this.e, this.k, this.m, this.n);
        BigInteger bigInteger = org.bouncycastle.crypto.a.a.c.a(this.b);
        bigInteger = org.bouncycastle.crypto.a.a.c.b(this.f, this.j, bigInteger);
        BigInteger bigInteger2 = org.bouncycastle.crypto.a.a.c.c(this.e, (BigInteger)bigIntegerArray, bigInteger);
        bigIntegerArray = org.bouncycastle.crypto.a.a.c.a(this.e, this.f, (BigInteger)bigIntegerArray, bigInteger2, bigInteger, this.a, this.c, this.d);
        this.p = 30;
        return new ck(this.a, bigInteger2, bigIntegerArray);
    }

    public final void a(ck ck2) {
        if (this.p >= 40) {
            throw new IllegalStateException("Validation already attempted for round2 payload for" + this.a);
        }
        if (this.p < 20) {
            throw new IllegalStateException("Round1 payload must be validated prior to validating Round2 payload for " + this.a);
        }
        BigInteger bigInteger = org.bouncycastle.crypto.a.a.c.a(this.e, this.m, this.k, this.l);
        this.o = ck2.b();
        BigInteger[] bigIntegerArray = ck2.c();
        org.bouncycastle.crypto.a.a.c.a(this.a, ck2.a());
        org.bouncycastle.crypto.a.a.c.b(this.h, ck2.a());
        org.bouncycastle.crypto.a.a.c.b(bigInteger);
        org.bouncycastle.crypto.a.a.c.a(this.e, this.f, bigInteger, this.o, bigIntegerArray, ck2.a(), this.c);
        this.p = 40;
    }

    public final BigInteger c() {
        if (this.p >= 50) {
            throw new IllegalStateException("Key already calculated for " + this.a);
        }
        if (this.p < 40) {
            throw new IllegalStateException("Round2 payload must be validated prior to creating key for " + this.a);
        }
        BigInteger bigInteger = org.bouncycastle.crypto.a.a.c.a(this.b);
        org.bouncycastle.e.a.a(this.b);
        this.b = null;
        bigInteger = org.bouncycastle.crypto.a.a.c.a(this.e, this.f, this.n, this.j, bigInteger, this.o);
        this.i = null;
        this.j = null;
        this.o = null;
        this.p = 50;
        return bigInteger;
    }

    public final ap b(BigInteger bigInteger) {
        if (this.p >= 60) {
            throw new IllegalStateException("Round3 payload already created for " + this.a);
        }
        if (this.p < 50) {
            throw new IllegalStateException("Keying material must be calculated prior to creating Round3 payload for " + this.a);
        }
        bigInteger = org.bouncycastle.crypto.a.a.c.a(this.a, this.h, this.k, this.l, this.m, this.n, bigInteger, this.c);
        this.p = 60;
        return new ap(this.a, bigInteger);
    }

    public final void a(ap ap2, BigInteger bigInteger) {
        if (this.p >= 70) {
            throw new IllegalStateException("Validation already attempted for round3 payload for" + this.a);
        }
        if (this.p < 50) {
            throw new IllegalStateException("Keying material must be calculated validated prior to validating Round3 payload for " + this.a);
        }
        org.bouncycastle.crypto.a.a.c.a(this.a, ap2.a());
        org.bouncycastle.crypto.a.a.c.b(this.h, ap2.a());
        org.bouncycastle.crypto.a.a.c.a(this.a, this.h, this.k, this.l, this.m, this.n, bigInteger, this.c, ap2.b());
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.p = 70;
    }
}

