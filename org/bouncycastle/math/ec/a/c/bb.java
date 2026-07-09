/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.math.ec.a;
import org.bouncycastle.math.ec.a.c.ba;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.k;

public final class bb
extends k {
    private long[] f;

    public bb(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.f = ba.a(bigInteger);
    }

    public bb() {
        this.f = new long[3];
    }

    private bb(long[] lArray) {
        this.f = lArray;
    }

    public final boolean i() {
        return a.a(this.f);
    }

    public final boolean j() {
        return a.b(this.f);
    }

    public final boolean k() {
        return (this.f[0] & 1L) != 0L;
    }

    public final BigInteger a() {
        return a.c(this.f);
    }

    public final int b() {
        return 131;
    }

    public final j a(j j2) {
        long[] lArray = new long[3];
        ba.a(this.f, ((bb)j2).f, lArray);
        return new bb(lArray);
    }

    public final j c() {
        long[] lArray = new long[3];
        ba.a(this.f, lArray);
        return new bb(lArray);
    }

    public final j b(j j2) {
        return this.a(j2);
    }

    public final j c(j j2) {
        long[] lArray = new long[3];
        ba.b(this.f, ((bb)j2).f, lArray);
        return new bb(lArray);
    }

    public final j a(j j2, j j3, j j4) {
        return this.b(j2, j3, j4);
    }

    public final j b(j object, j object2, j object3) {
        long[] lArray = this.f;
        object = ((bb)object).f;
        object2 = ((bb)object2).f;
        object3 = ((bb)object3).f;
        long[] lArray2 = new long[5];
        ba.c(lArray, (long[])object, lArray2);
        ba.c((long[])object2, (long[])object3, lArray2);
        object = new long[3];
        ba.c(lArray2, (long[])object);
        return new bb((long[])object);
    }

    public final j d(j j2) {
        return this.c(j2.f());
    }

    public final j d() {
        return this;
    }

    public final j e() {
        long[] lArray = new long[3];
        ba.e(this.f, lArray);
        return new bb(lArray);
    }

    public final j a(j object, j object2) {
        long[] lArray = this.f;
        object = ((bb)object).f;
        object2 = ((bb)object2).f;
        long[] lArray2 = new long[5];
        ba.f(lArray, lArray2);
        ba.c((long[])object, (long[])object2, lArray2);
        object = new long[3];
        ba.c(lArray2, (long[])object);
        return new bb((long[])object);
    }

    public final j a(int n2) {
        if (n2 <= 0) {
            return this;
        }
        long[] lArray = new long[3];
        ba.a(this.f, n2, lArray);
        return new bb(lArray);
    }

    public final int m() {
        return ba.a(this.f);
    }

    public final j f() {
        long[] lArray = new long[3];
        ba.b(this.f, lArray);
        return new bb(lArray);
    }

    public final j g() {
        long[] lArray = new long[3];
        ba.d(this.f, lArray);
        return new bb(lArray);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bb)) {
            return false;
        }
        object = (bb)object;
        return a.a(this.f, ((bb)object).f);
    }

    public final int hashCode() {
        return 0x202F8 ^ org.bouncycastle.e.a.a(this.f, 3);
    }
}

