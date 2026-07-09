/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.math.ec.a;
import org.bouncycastle.math.ec.a.c.bg;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.k;

public final class bh
extends k {
    private long[] f;

    public bh(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.f = bg.a(bigInteger);
    }

    public bh() {
        this.f = new long[3];
    }

    private bh(long[] lArray) {
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
        return 163;
    }

    public final j a(j j2) {
        long[] lArray = new long[3];
        bg.a(this.f, ((bh)j2).f, lArray);
        return new bh(lArray);
    }

    public final j c() {
        long[] lArray = new long[3];
        bg.a(this.f, lArray);
        return new bh(lArray);
    }

    public final j b(j j2) {
        return this.a(j2);
    }

    public final j c(j j2) {
        long[] lArray = new long[3];
        bg.b(this.f, ((bh)j2).f, lArray);
        return new bh(lArray);
    }

    public final j a(j j2, j j3, j j4) {
        return this.b(j2, j3, j4);
    }

    public final j b(j object, j object2, j object3) {
        long[] lArray = this.f;
        object = ((bh)object).f;
        object2 = ((bh)object2).f;
        object3 = ((bh)object3).f;
        long[] lArray2 = new long[6];
        bg.c(lArray, (long[])object, lArray2);
        bg.c((long[])object2, (long[])object3, lArray2);
        object = new long[3];
        bg.c(lArray2, (long[])object);
        return new bh((long[])object);
    }

    public final j d(j j2) {
        return this.c(j2.f());
    }

    public final j d() {
        return this;
    }

    public final j e() {
        long[] lArray = new long[3];
        bg.e(this.f, lArray);
        return new bh(lArray);
    }

    public final j a(j object, j object2) {
        long[] lArray = this.f;
        object = ((bh)object).f;
        object2 = ((bh)object2).f;
        long[] lArray2 = new long[6];
        bg.f(lArray, lArray2);
        bg.c((long[])object, (long[])object2, lArray2);
        object = new long[3];
        bg.c(lArray2, (long[])object);
        return new bh((long[])object);
    }

    public final j a(int n2) {
        if (n2 <= 0) {
            return this;
        }
        long[] lArray = new long[3];
        bg.a(this.f, n2, lArray);
        return new bh(lArray);
    }

    public final int m() {
        return bg.a(this.f);
    }

    public final j f() {
        long[] lArray = new long[3];
        bg.b(this.f, lArray);
        return new bh(lArray);
    }

    public final j g() {
        long[] lArray = new long[3];
        bg.d(this.f, lArray);
        return new bh(lArray);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bh)) {
            return false;
        }
        object = (bh)object;
        return a.a(this.f, ((bh)object).f);
    }

    public final int hashCode() {
        return 0x27FB3 ^ org.bouncycastle.e.a.a(this.f, 3);
    }
}

