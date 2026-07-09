/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.e.a;
import org.bouncycastle.math.ec.a.c.aq;
import org.bouncycastle.math.ec.a.c.ar;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.l;

public final class as
extends l {
    private static BigInteger g = aq.h;
    protected int[] f;

    public as(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.f = ar.a(bigInteger);
    }

    public as() {
        this.f = new int[17];
    }

    protected as(int[] nArray) {
        this.f = nArray;
    }

    public final boolean j() {
        return ab.b(17, this.f);
    }

    public final boolean i() {
        return ab.a(17, this.f);
    }

    public final boolean k() {
        return (this.f[0] & 1) == 1;
    }

    public final BigInteger a() {
        return ab.c(17, this.f);
    }

    public final int b() {
        return g.bitLength();
    }

    public final j a(j j2) {
        int[] nArray = new int[17];
        ar.a(this.f, ((as)j2).f, nArray);
        return new as(nArray);
    }

    public final j c() {
        int[] nArray = new int[17];
        ar.a(this.f, nArray);
        return new as(nArray);
    }

    public final j b(j j2) {
        int[] nArray = new int[17];
        ar.c(this.f, ((as)j2).f, nArray);
        return new as(nArray);
    }

    public final j c(j j2) {
        int[] nArray = new int[17];
        ar.b(this.f, ((as)j2).f, nArray);
        return new as(nArray);
    }

    public final j d(j j2) {
        int[] nArray = new int[17];
        ab.a(ar.a, ((as)j2).f, nArray);
        ar.b(nArray, this.f, nArray);
        return new as(nArray);
    }

    public final j d() {
        int[] nArray = new int[17];
        ar.b(this.f, nArray);
        return new as(nArray);
    }

    public final j e() {
        int[] nArray = new int[17];
        ar.c(this.f, nArray);
        return new as(nArray);
    }

    public final j f() {
        int[] nArray = new int[17];
        ab.a(ar.a, this.f, nArray);
        return new as(nArray);
    }

    public final j g() {
        int[] nArray = this.f;
        if (ab.b(17, nArray) || ab.a(17, nArray)) {
            return this;
        }
        int[] nArray2 = new int[17];
        int[] nArray3 = new int[17];
        ar.a(nArray, 519, nArray2);
        ar.c(nArray2, nArray3);
        if (ab.b(17, nArray, nArray3)) {
            return new as(nArray2);
        }
        return null;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof as)) {
            return false;
        }
        object = (as)object;
        return ab.b(17, this.f, ((as)object).f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.a(this.f, 17);
    }
}

