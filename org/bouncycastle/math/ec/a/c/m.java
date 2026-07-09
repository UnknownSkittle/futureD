/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.jcajce.provider.c.a;
import org.bouncycastle.math.ec.a.c.k;
import org.bouncycastle.math.ec.a.c.l;
import org.bouncycastle.math.ec.j;

public final class m
extends org.bouncycastle.math.ec.l {
    private static BigInteger g = k.h;
    protected int[] f;

    public m(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.f = l.a(bigInteger);
    }

    public m() {
        this.f = new int[5];
    }

    protected m(int[] nArray) {
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
        int[] nArray = new int[5];
        l.a(this.f, ((m)j2).f, nArray);
        return new m(nArray);
    }

    public final j c() {
        int[] nArray = new int[5];
        l.a(this.f, nArray);
        return new m(nArray);
    }

    public final j b(j j2) {
        int[] nArray = new int[5];
        l.d(this.f, ((m)j2).f, nArray);
        return new m(nArray);
    }

    public final j c(j j2) {
        int[] nArray = new int[5];
        l.b(this.f, ((m)j2).f, nArray);
        return new m(nArray);
    }

    public final j d(j j2) {
        int[] nArray = new int[5];
        ab.a(l.a, ((m)j2).f, nArray);
        l.b(nArray, this.f, nArray);
        return new m(nArray);
    }

    public final j d() {
        int[] nArray = new int[5];
        l.b(this.f, nArray);
        return new m(nArray);
    }

    public final j e() {
        int[] nArray = new int[5];
        l.d(this.f, nArray);
        return new m(nArray);
    }

    public final j f() {
        int[] nArray = new int[5];
        ab.a(l.a, this.f, nArray);
        return new m(nArray);
    }

    public final j g() {
        int[] nArray = this.f;
        if (a.b(this.f) || a.a(nArray)) {
            return this;
        }
        int[] nArray2 = new int[5];
        l.d(nArray, nArray2);
        l.b(nArray2, nArray, nArray2);
        int[] nArray3 = new int[5];
        l.d(nArray2, nArray3);
        l.b(nArray3, nArray, nArray3);
        int[] nArray4 = new int[5];
        l.d(nArray3, nArray4);
        l.b(nArray4, nArray, nArray4);
        int[] nArray5 = new int[5];
        l.a(nArray4, 3, nArray5);
        l.b(nArray5, nArray3, nArray5);
        l.a(nArray5, 7, nArray4);
        l.b(nArray4, nArray5, nArray4);
        l.a(nArray4, 3, nArray5);
        l.b(nArray5, nArray3, nArray5);
        int[] nArray6 = new int[5];
        l.a(nArray5, 14, nArray6);
        l.b(nArray6, nArray4, nArray6);
        l.a(nArray6, 31, nArray4);
        l.b(nArray4, nArray6, nArray4);
        l.a(nArray4, 62, nArray6);
        l.b(nArray6, nArray4, nArray6);
        l.a(nArray6, 3, nArray4);
        l.b(nArray4, nArray3, nArray4);
        l.a(nArray4, 18, nArray4);
        l.b(nArray4, nArray5, nArray4);
        l.a(nArray4, 2, nArray4);
        l.b(nArray4, nArray, nArray4);
        l.a(nArray4, 3, nArray4);
        l.b(nArray4, nArray2, nArray4);
        l.a(nArray4, 6, nArray4);
        l.b(nArray4, nArray3, nArray4);
        l.a(nArray4, 2, nArray4);
        l.b(nArray4, nArray, nArray4);
        l.d(nArray4, nArray2);
        if (a.a(nArray, nArray2)) {
            return new m(nArray4);
        }
        return null;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof m)) {
            return false;
        }
        object = (m)object;
        return a.a(this.f, ((m)object).f);
    }

    public final int hashCode() {
        return g.hashCode() ^ org.bouncycastle.e.a.a(this.f, 5);
    }
}

