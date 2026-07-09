/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.ec.a;
import org.bouncycastle.math.ec.a.c.o;
import org.bouncycastle.math.ec.a.c.p;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.l;

public final class q
extends l {
    private static BigInteger g = o.h;
    protected int[] f;

    public q(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.f = p.a(bigInteger);
    }

    public q() {
        this.f = new int[6];
    }

    protected q(int[] nArray) {
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
        p.a(this.f, ((q)j2).f, nArray);
        return new q(nArray);
    }

    public final j c() {
        int[] nArray = new int[6];
        p.a(this.f, nArray);
        return new q(nArray);
    }

    public final j b(j j2) {
        int[] nArray = new int[6];
        p.d(this.f, ((q)j2).f, nArray);
        return new q(nArray);
    }

    public final j c(j j2) {
        int[] nArray = new int[6];
        p.b(this.f, ((q)j2).f, nArray);
        return new q(nArray);
    }

    public final j d(j j2) {
        int[] nArray = new int[6];
        ab.a(p.a, ((q)j2).f, nArray);
        p.b(nArray, this.f, nArray);
        return new q(nArray);
    }

    public final j d() {
        int[] nArray = new int[6];
        p.b(this.f, nArray);
        return new q(nArray);
    }

    public final j e() {
        int[] nArray = new int[6];
        p.d(this.f, nArray);
        return new q(nArray);
    }

    public final j f() {
        int[] nArray = new int[6];
        ab.a(p.a, this.f, nArray);
        return new q(nArray);
    }

    public final j g() {
        int[] nArray = this.f;
        if (a.b(this.f) || a.a(nArray)) {
            return this;
        }
        int[] nArray2 = new int[6];
        p.d(nArray, nArray2);
        p.b(nArray2, nArray, nArray2);
        int[] nArray3 = new int[6];
        p.d(nArray2, nArray3);
        p.b(nArray3, nArray, nArray3);
        int[] nArray4 = new int[6];
        p.a(nArray3, 3, nArray4);
        p.b(nArray4, nArray3, nArray4);
        int[] nArray5 = nArray4;
        p.a(nArray4, 2, nArray5);
        p.b(nArray5, nArray2, nArray5);
        p.a(nArray5, 8, nArray2);
        p.b(nArray2, nArray5, nArray2);
        nArray4 = nArray5;
        p.a(nArray2, 3, nArray4);
        p.b(nArray4, nArray3, nArray4);
        nArray5 = new int[6];
        p.a(nArray4, 16, nArray5);
        p.b(nArray5, nArray2, nArray5);
        p.a(nArray5, 35, nArray2);
        p.b(nArray2, nArray5, nArray2);
        p.a(nArray2, 70, nArray5);
        p.b(nArray5, nArray2, nArray5);
        p.a(nArray5, 19, nArray2);
        p.b(nArray2, nArray4, nArray2);
        p.a(nArray2, 20, nArray2);
        p.b(nArray2, nArray4, nArray2);
        p.a(nArray2, 4, nArray2);
        p.b(nArray2, nArray3, nArray2);
        p.a(nArray2, 6, nArray2);
        p.b(nArray2, nArray3, nArray2);
        p.d(nArray2, nArray2);
        p.d(nArray2, nArray3);
        if (a.b(nArray, nArray3)) {
            return new q(nArray2);
        }
        return null;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof q)) {
            return false;
        }
        object = (q)object;
        return a.b(this.f, ((q)object).f);
    }

    public final int hashCode() {
        return g.hashCode() ^ org.bouncycastle.e.a.a(this.f, 6);
    }
}

