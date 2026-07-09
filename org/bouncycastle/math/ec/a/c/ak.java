/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.e.a;
import org.bouncycastle.math.ec.a.c.ai;
import org.bouncycastle.math.ec.a.c.aj;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.l;
import org.bouncycastle.openpgp.h;

public final class ak
extends l {
    private static BigInteger g = ai.h;
    protected int[] f;

    public ak(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.f = aj.a(bigInteger);
    }

    public ak() {
        this.f = new int[8];
    }

    protected ak(int[] nArray) {
        this.f = nArray;
    }

    public final boolean j() {
        return h.b(this.f);
    }

    public final boolean i() {
        return h.a(this.f);
    }

    public final boolean k() {
        return (this.f[0] & 1) == 1;
    }

    public final BigInteger a() {
        return h.c(this.f);
    }

    public final int b() {
        return g.bitLength();
    }

    public final j a(j j2) {
        int[] nArray = new int[8];
        aj.a(this.f, ((ak)j2).f, nArray);
        return new ak(nArray);
    }

    public final j c() {
        int[] nArray = new int[8];
        aj.a(this.f, nArray);
        return new ak(nArray);
    }

    public final j b(j j2) {
        int[] nArray = new int[8];
        aj.d(this.f, ((ak)j2).f, nArray);
        return new ak(nArray);
    }

    public final j c(j j2) {
        int[] nArray = new int[8];
        aj.b(this.f, ((ak)j2).f, nArray);
        return new ak(nArray);
    }

    public final j d(j j2) {
        int[] nArray = new int[8];
        ab.a(aj.a, ((ak)j2).f, nArray);
        aj.b(nArray, this.f, nArray);
        return new ak(nArray);
    }

    public final j d() {
        int[] nArray = new int[8];
        aj.b(this.f, nArray);
        return new ak(nArray);
    }

    public final j e() {
        int[] nArray = new int[8];
        aj.d(this.f, nArray);
        return new ak(nArray);
    }

    public final j f() {
        int[] nArray = new int[8];
        ab.a(aj.a, this.f, nArray);
        return new ak(nArray);
    }

    public final j g() {
        int[] nArray = this.f;
        if (h.b(this.f) || h.a(nArray)) {
            return this;
        }
        int[] nArray2 = new int[8];
        int[] nArray3 = new int[8];
        aj.d(nArray, nArray2);
        aj.b(nArray2, nArray, nArray2);
        aj.a(nArray2, 2, nArray3);
        aj.b(nArray3, nArray2, nArray3);
        aj.a(nArray3, 4, nArray2);
        aj.b(nArray2, nArray3, nArray2);
        aj.a(nArray2, 8, nArray3);
        aj.b(nArray3, nArray2, nArray3);
        aj.a(nArray3, 16, nArray2);
        aj.b(nArray2, nArray3, nArray2);
        aj.a(nArray2, 32, nArray2);
        aj.b(nArray2, nArray, nArray2);
        aj.a(nArray2, 96, nArray2);
        aj.b(nArray2, nArray, nArray2);
        aj.a(nArray2, 94, nArray2);
        aj.d(nArray2, nArray3);
        if (h.c(nArray, nArray3)) {
            return new ak(nArray2);
        }
        return null;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ak)) {
            return false;
        }
        object = (ak)object;
        return h.c(this.f, ((ak)object).f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.a(this.f, 8);
    }
}

