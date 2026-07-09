/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.e.a;
import org.bouncycastle.math.ec.a.c.bu;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.k;
import org.bouncycastle.openpgp.h;

public final class bv
extends k {
    private long[] f;

    public bv(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        this.f = bu.a(bigInteger);
    }

    public bv() {
        this.f = new long[4];
    }

    private bv(long[] lArray) {
        this.f = lArray;
    }

    public final boolean i() {
        return h.a(this.f);
    }

    public final boolean j() {
        return h.b(this.f);
    }

    public final boolean k() {
        return (this.f[0] & 1L) != 0L;
    }

    public final BigInteger a() {
        return h.c(this.f);
    }

    public final int b() {
        return 233;
    }

    public final j a(j object) {
        long[] lArray;
        long[] lArray2 = lArray = new long[4];
        long[] lArray3 = ((bv)object).f;
        object = this.f;
        lArray2[0] = (long)(object[0] ^ lArray3[0]);
        lArray2[1] = (long)(object[1] ^ lArray3[1]);
        lArray2[2] = (long)(object[2] ^ lArray3[2]);
        lArray2[3] = (long)(object[3] ^ lArray3[3]);
        return new bv(lArray);
    }

    public final j c() {
        long[] lArray;
        long[] lArray2 = lArray = new long[4];
        long[] lArray3 = this.f;
        lArray2[0] = lArray3[0] ^ 1L;
        lArray2[1] = lArray3[1];
        lArray2[2] = lArray3[2];
        lArray2[3] = lArray3[3];
        return new bv(lArray);
    }

    public final j b(j j2) {
        return this.a(j2);
    }

    public final j c(j j2) {
        long[] lArray = new long[4];
        bu.a(this.f, ((bv)j2).f, lArray);
        return new bv(lArray);
    }

    public final j a(j j2, j j3, j j4) {
        return this.b(j2, j3, j4);
    }

    public final j b(j object, j object2, j object3) {
        long[] lArray = this.f;
        object = ((bv)object).f;
        object2 = ((bv)object2).f;
        object3 = ((bv)object3).f;
        long[] lArray2 = new long[8];
        bu.b(lArray, (long[])object, lArray2);
        bu.b((long[])object2, (long[])object3, lArray2);
        object = new long[4];
        bu.b(lArray2, (long[])object);
        return new bv((long[])object);
    }

    public final j d(j j2) {
        return this.c(j2.f());
    }

    public final j d() {
        return this;
    }

    public final j e() {
        long[] lArray = new long[4];
        bu.c(this.f, lArray);
        return new bv(lArray);
    }

    public final j a(j object, j object2) {
        long[] lArray = this.f;
        object = ((bv)object).f;
        object2 = ((bv)object2).f;
        long[] lArray2 = new long[8];
        bu.d(lArray, lArray2);
        bu.b((long[])object, (long[])object2, lArray2);
        object = new long[4];
        bu.b(lArray2, (long[])object);
        return new bv((long[])object);
    }

    public final j a(int n2) {
        if (n2 <= 0) {
            return this;
        }
        long[] lArray = new long[4];
        bu.a(this.f, n2, lArray);
        return new bv(lArray);
    }

    public final int m() {
        long[] lArray = this.f;
        return (int)(this.f[0] ^ lArray[2] >>> 31) & 1;
    }

    public final j f() {
        long[] lArray = new long[4];
        bu.a(this.f, lArray);
        return new bv(lArray);
    }

    public final j g() {
        long[] lArray;
        long[] lArray2 = lArray = new long[4];
        long[] lArray3 = this.f;
        long l2 = org.bouncycastle.asn1.util.a.a(this.f[0]);
        long l3 = org.bouncycastle.asn1.util.a.a(lArray3[1]);
        long l4 = l2 & 0xFFFFFFFFL | l3 << 32;
        long l5 = l2 >>> 32 | l3 & 0xFFFFFFFF00000000L;
        l2 = org.bouncycastle.asn1.util.a.a(lArray3[2]);
        l3 = org.bouncycastle.asn1.util.a.a(lArray3[3]);
        long l6 = l2 & 0xFFFFFFFFL | l3 << 32;
        long l7 = l2 >>> 32 | l3 & 0xFFFFFFFF00000000L;
        long l8 = l7 >>> 27;
        l7 ^= l5 >>> 27 | l7 << 37;
        long l9 = l5;
        l5 = l9 ^ l9 << 37;
        lArray3 = new long[8];
        int[] nArray = new int[]{32, 117, 191};
        for (int i2 = 0; i2 < 3; ++i2) {
            int n2 = nArray[i2] >>> 6;
            int n3 = nArray[i2] & 0x3F;
            int n4 = n2;
            lArray3[n4] = lArray3[n4] ^ l5 << n3;
            int n5 = n2 + 1;
            lArray3[n5] = lArray3[n5] ^ (l7 << n3 | l5 >>> -n3);
            int n6 = n2 + 2;
            lArray3[n6] = lArray3[n6] ^ (l8 << n3 | l7 >>> -n3);
            int n7 = n2 + 3;
            lArray3[n7] = lArray3[n7] ^ l8 >>> -n3;
        }
        bu.b(lArray3, lArray2);
        lArray2[0] = lArray2[0] ^ l4;
        lArray2[1] = lArray2[1] ^ l6;
        return new bv(lArray);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bv)) {
            return false;
        }
        object = (bv)object;
        return h.a(this.f, ((bv)object).f);
    }

    public final int hashCode() {
        return 0x238DDA ^ a.a(this.f, 4);
    }
}

