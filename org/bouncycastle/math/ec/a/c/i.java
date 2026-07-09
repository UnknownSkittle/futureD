/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.jcajce.provider.c.a;
import org.bouncycastle.math.ec.a.c.g;
import org.bouncycastle.math.ec.a.c.h;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.l;

public final class i
extends l {
    private static BigInteger g = org.bouncycastle.math.ec.a.c.g.h;
    protected int[] f;

    public i(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.f = h.a(bigInteger);
    }

    public i() {
        this.f = new int[5];
    }

    protected i(int[] nArray) {
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
        h.a(this.f, ((i)j2).f, nArray);
        return new i(nArray);
    }

    public final j c() {
        int[] nArray = new int[5];
        h.a(this.f, nArray);
        return new i(nArray);
    }

    public final j b(j j2) {
        int[] nArray = new int[5];
        h.d(this.f, ((i)j2).f, nArray);
        return new i(nArray);
    }

    public final j c(j j2) {
        int[] nArray = new int[5];
        h.b(this.f, ((i)j2).f, nArray);
        return new i(nArray);
    }

    public final j d(j j2) {
        int[] nArray = new int[5];
        ab.a(h.a, ((i)j2).f, nArray);
        h.b(nArray, this.f, nArray);
        return new i(nArray);
    }

    public final j d() {
        int[] nArray = new int[5];
        h.b(this.f, nArray);
        return new i(nArray);
    }

    public final j e() {
        int[] nArray = new int[5];
        h.d(this.f, nArray);
        return new i(nArray);
    }

    public final j f() {
        int[] nArray = new int[5];
        ab.a(h.a, this.f, nArray);
        return new i(nArray);
    }

    public final j g() {
        int[] nArray = this.f;
        if (a.b(this.f) || a.a(nArray)) {
            return this;
        }
        int[] nArray2 = new int[5];
        h.d(nArray, nArray2);
        h.b(nArray2, nArray, nArray2);
        int[] nArray3 = new int[5];
        h.a(nArray2, 2, nArray3);
        h.b(nArray3, nArray2, nArray3);
        h.a(nArray3, 4, nArray2);
        h.b(nArray2, nArray3, nArray2);
        h.a(nArray2, 8, nArray3);
        h.b(nArray3, nArray2, nArray3);
        h.a(nArray3, 16, nArray2);
        h.b(nArray2, nArray3, nArray2);
        h.a(nArray2, 32, nArray3);
        h.b(nArray3, nArray2, nArray3);
        h.a(nArray3, 64, nArray2);
        h.b(nArray2, nArray3, nArray2);
        h.d(nArray2, nArray3);
        h.b(nArray3, nArray, nArray3);
        h.a(nArray3, 29, nArray3);
        h.d(nArray3, nArray2);
        if (a.a(nArray, nArray2)) {
            return new i(nArray3);
        }
        return null;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof i)) {
            return false;
        }
        object = (i)object;
        return a.a(this.f, ((i)object).f);
    }

    public final int hashCode() {
        return g.hashCode() ^ org.bouncycastle.e.a.a(this.f, 5);
    }
}

