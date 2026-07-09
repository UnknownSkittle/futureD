/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.e.a;
import org.bouncycastle.math.ec.a.c.bo;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.k;
import org.bouncycastle.openpgp.h;

public final class bp
extends k {
    private long[] f;

    public bp(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.f = bo.a(bigInteger);
    }

    public bp() {
        this.f = new long[4];
    }

    private bp(long[] lArray) {
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
        return 193;
    }

    public final j a(j object) {
        long[] lArray;
        long[] lArray2 = lArray = new long[4];
        long[] lArray3 = ((bp)object).f;
        object = this.f;
        lArray2[0] = (long)(object[0] ^ lArray3[0]);
        lArray2[1] = (long)(object[1] ^ lArray3[1]);
        lArray2[2] = (long)(object[2] ^ lArray3[2]);
        lArray2[3] = (long)(object[3] ^ lArray3[3]);
        return new bp(lArray);
    }

    public final j c() {
        long[] lArray;
        long[] lArray2 = lArray = new long[4];
        long[] lArray3 = this.f;
        lArray2[0] = lArray3[0] ^ 1L;
        lArray2[1] = lArray3[1];
        lArray2[2] = lArray3[2];
        lArray2[3] = lArray3[3];
        return new bp(lArray);
    }

    public final j b(j j2) {
        return this.a(j2);
    }

    public final j c(j j2) {
        long[] lArray = new long[4];
        bo.a(this.f, ((bp)j2).f, lArray);
        return new bp(lArray);
    }

    public final j a(j j2, j j3, j j4) {
        return this.b(j2, j3, j4);
    }

    public final j b(j object, j object2, j object3) {
        long[] lArray = this.f;
        object = ((bp)object).f;
        object2 = ((bp)object2).f;
        object3 = ((bp)object3).f;
        long[] lArray2 = new long[8];
        bo.b(lArray, (long[])object, lArray2);
        bo.b((long[])object2, (long[])object3, lArray2);
        object = new long[4];
        bo.b(lArray2, (long[])object);
        return new bp((long[])object);
    }

    public final j d(j j2) {
        return this.c(j2.f());
    }

    public final j d() {
        return this;
    }

    public final j e() {
        long[] lArray = new long[4];
        bo.c(this.f, lArray);
        return new bp(lArray);
    }

    public final j a(j object, j object2) {
        long[] lArray = this.f;
        object = ((bp)object).f;
        object2 = ((bp)object2).f;
        long[] lArray2 = new long[8];
        bo.d(lArray, lArray2);
        bo.b((long[])object, (long[])object2, lArray2);
        object = new long[4];
        bo.b(lArray2, (long[])object);
        return new bp((long[])object);
    }

    public final j a(int n2) {
        if (n2 <= 0) {
            return this;
        }
        long[] lArray = new long[4];
        bo.a(this.f, n2, lArray);
        return new bp(lArray);
    }

    public final int m() {
        return (int)this.f[0] & 1;
    }

    public final j f() {
        long[] lArray = new long[4];
        bo.a(this.f, lArray);
        return new bp(lArray);
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
        long l6 = l2 & 0xFFFFFFFFL ^ lArray3[3] << 32;
        long l7 = l2 >>> 32;
        lArray2[0] = l4 ^ l5 << 8;
        lArray2[1] = l6 ^ l7 << 8 ^ l5 >>> 56 ^ l5 << 33;
        lArray2[2] = l7 >>> 56 ^ l7 << 33 ^ l5 >>> 31;
        lArray2[3] = l7 >>> 31;
        return new bp(lArray);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bp)) {
            return false;
        }
        object = (bp)object;
        return h.a(this.f, ((bp)object).f);
    }

    public final int hashCode() {
        return 0x1D731F ^ a.a(this.f, 4);
    }
}

