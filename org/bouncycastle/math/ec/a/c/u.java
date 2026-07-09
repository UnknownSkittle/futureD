/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.ec.a;
import org.bouncycastle.math.ec.a.c.s;
import org.bouncycastle.math.ec.a.c.t;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.l;

public final class u
extends l {
    private static BigInteger g = s.h;
    protected int[] f;

    public u(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.f = t.a(bigInteger);
    }

    public u() {
        this.f = new int[6];
    }

    protected u(int[] nArray) {
        this.f = nArray;
    }

    public final boolean j() {
        return a.b(this.f);
    }

    public final boolean i() {
        return a.a(this.f);
    }

    public final boolean k() {
        return (this.f[0] & 1) == 1;
    }

    public final BigInteger a() {
        return a.c(this.f);
    }

    public final int b() {
        return g.bitLength();
    }

    public final j a(j j2) {
        int[] nArray = new int[6];
        t.a(this.f, ((u)j2).f, nArray);
        return new u(nArray);
    }

    public final j c() {
        int[] nArray = new int[6];
        t.a(this.f, nArray);
        return new u(nArray);
    }

    public final j b(j j2) {
        int[] nArray = new int[6];
        t.d(this.f, ((u)j2).f, nArray);
        return new u(nArray);
    }

    public final j c(j j2) {
        int[] nArray = new int[6];
        t.b(this.f, ((u)j2).f, nArray);
        return new u(nArray);
    }

    public final j d(j j2) {
        int[] nArray = new int[6];
        ab.a(t.a, ((u)j2).f, nArray);
        t.b(nArray, this.f, nArray);
        return new u(nArray);
    }

    public final j d() {
        int[] nArray = new int[6];
        t.b(this.f, nArray);
        return new u(nArray);
    }

    public final j e() {
        int[] nArray = new int[6];
        t.d(this.f, nArray);
        return new u(nArray);
    }

    public final j f() {
        int[] nArray = new int[6];
        ab.a(t.a, this.f, nArray);
        return new u(nArray);
    }

    public final j g() {
        int[] nArray = this.f;
        if (a.b(this.f) || a.a(nArray)) {
            return this;
        }
        int[] nArray2 = new int[6];
        int[] nArray3 = new int[6];
        t.d(nArray, nArray2);
        t.b(nArray2, nArray, nArray2);
        t.a(nArray2, 2, nArray3);
        t.b(nArray3, nArray2, nArray3);
        t.a(nArray3, 4, nArray2);
        t.b(nArray2, nArray3, nArray2);
        t.a(nArray2, 8, nArray3);
        t.b(nArray3, nArray2, nArray3);
        t.a(nArray3, 16, nArray2);
        t.b(nArray2, nArray3, nArray2);
        t.a(nArray2, 32, nArray3);
        t.b(nArray3, nArray2, nArray3);
        t.a(nArray3, 64, nArray2);
        t.b(nArray2, nArray3, nArray2);
        t.a(nArray2, 62, nArray2);
        t.d(nArray2, nArray3);
        if (a.b(nArray, nArray3)) {
            return new u(nArray2);
        }
        return null;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof u)) {
            return false;
        }
        object = (u)object;
        return a.b(this.f, ((u)object).f);
    }

    public final int hashCode() {
        return g.hashCode() ^ org.bouncycastle.e.a.a(this.f, 6);
    }
}

