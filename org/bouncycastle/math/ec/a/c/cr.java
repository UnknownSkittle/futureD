/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.e.a;
import org.bouncycastle.math.ec.a.c.cq;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.k;

public final class cr
extends k {
    protected long[] f;

    public cr(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.f = cq.a(bigInteger);
    }

    public cr() {
        this.f = new long[9];
    }

    protected cr(long[] lArray) {
        this.f = lArray;
    }

    public final boolean i() {
        long[] lArray = this.f;
        if (this.f[0] != 1L) {
            return false;
        }
        for (int i2 = 1; i2 < 9; ++i2) {
            if (lArray[i2] == 0L) continue;
            return false;
        }
        return true;
    }

    public final boolean j() {
        return org.bouncycastle.math.b.a.a(this.f);
    }

    public final boolean k() {
        return (this.f[0] & 1L) != 0L;
    }

    public final BigInteger a() {
        long[] lArray = this.f;
        byte[] byArray = new byte[72];
        for (int i2 = 0; i2 < 9; ++i2) {
            long l2 = lArray[i2];
            if (l2 == 0L) continue;
            ab.a(l2, byArray, 8 - i2 << 3);
        }
        return new BigInteger(1, byArray);
    }

    public final int b() {
        return 571;
    }

    public final j a(j j2) {
        long[] lArray = new long[9];
        cq.a(this.f, ((cr)j2).f, lArray);
        return new cr(lArray);
    }

    public final j c() {
        long[] lArray = new long[9];
        cq.a(this.f, lArray);
        return new cr(lArray);
    }

    public final j b(j j2) {
        return this.a(j2);
    }

    public final j c(j j2) {
        long[] lArray = new long[9];
        cq.c(this.f, ((cr)j2).f, lArray);
        return new cr(lArray);
    }

    public final j a(j j2, j j3, j j4) {
        return this.b(j2, j3, j4);
    }

    public final j b(j object, j object2, j object3) {
        long[] lArray = this.f;
        object = ((cr)object).f;
        object2 = ((cr)object2).f;
        object3 = ((cr)object3).f;
        long[] lArray2 = new long[18];
        cq.d(lArray, (long[])object, lArray2);
        cq.d((long[])object2, (long[])object3, lArray2);
        object = new long[9];
        cq.c(lArray2, (long[])object);
        return new cr((long[])object);
    }

    public final j d(j j2) {
        return this.c(j2.f());
    }

    public final j d() {
        return this;
    }

    public final j e() {
        long[] lArray = new long[9];
        cq.e(this.f, lArray);
        return new cr(lArray);
    }

    public final j a(j object, j object2) {
        long[] lArray = this.f;
        object = ((cr)object).f;
        object2 = ((cr)object2).f;
        long[] lArray2 = new long[18];
        cq.f(lArray, lArray2);
        cq.d((long[])object, (long[])object2, lArray2);
        object = new long[9];
        cq.c(lArray2, (long[])object);
        return new cr((long[])object);
    }

    public final j a(int n2) {
        if (n2 <= 0) {
            return this;
        }
        long[] lArray = new long[9];
        cq.a(this.f, n2, lArray);
        return new cr(lArray);
    }

    public final int m() {
        return cq.b(this.f);
    }

    public final j f() {
        long[] lArray = new long[9];
        cq.b(this.f, lArray);
        return new cr(lArray);
    }

    public final j g() {
        long[] lArray = new long[9];
        cq.d(this.f, lArray);
        return new cr(lArray);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof cr)) {
            return false;
        }
        object = (cr)object;
        long[] lArray = ((cr)object).f;
        object = this.f;
        for (int i2 = 8; i2 >= 0; --i2) {
            if (object[i2] == lArray[i2]) continue;
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 0x5724CC ^ a.a(this.f, 9);
    }
}

