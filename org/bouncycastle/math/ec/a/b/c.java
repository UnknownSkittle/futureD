/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.b;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.ec.a.b.a;
import org.bouncycastle.math.ec.a.b.b;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.l;
import org.bouncycastle.openpgp.h;

public final class c
extends l {
    private static BigInteger g = a.h;
    protected int[] f;

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.f = b.a(bigInteger);
    }

    public c() {
        this.f = new int[8];
    }

    protected c(int[] nArray) {
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
        b.a(this.f, ((c)j2).f, nArray);
        return new c(nArray);
    }

    public final j c() {
        int[] nArray = new int[8];
        b.a(this.f, nArray);
        return new c(nArray);
    }

    public final j b(j j2) {
        int[] nArray = new int[8];
        b.d(this.f, ((c)j2).f, nArray);
        return new c(nArray);
    }

    public final j c(j j2) {
        int[] nArray = new int[8];
        b.b(this.f, ((c)j2).f, nArray);
        return new c(nArray);
    }

    public final j d(j j2) {
        int[] nArray = new int[8];
        ab.a(b.a, ((c)j2).f, nArray);
        b.b(nArray, this.f, nArray);
        return new c(nArray);
    }

    public final j d() {
        int[] nArray = new int[8];
        b.b(this.f, nArray);
        return new c(nArray);
    }

    public final j e() {
        int[] nArray = new int[8];
        b.d(this.f, nArray);
        return new c(nArray);
    }

    public final j f() {
        int[] nArray = new int[8];
        ab.a(b.a, this.f, nArray);
        return new c(nArray);
    }

    public final j g() {
        int[] nArray = this.f;
        if (h.b(this.f) || h.a(nArray)) {
            return this;
        }
        int[] nArray2 = new int[8];
        b.d(nArray, nArray2);
        b.b(nArray2, nArray, nArray2);
        int[] nArray3 = new int[8];
        b.a(nArray2, 2, nArray3);
        b.b(nArray3, nArray2, nArray3);
        int[] nArray4 = new int[8];
        b.a(nArray3, 2, nArray4);
        b.b(nArray4, nArray2, nArray4);
        b.a(nArray4, 6, nArray2);
        b.b(nArray2, nArray4, nArray2);
        int[] nArray5 = new int[8];
        b.a(nArray2, 12, nArray5);
        b.b(nArray5, nArray2, nArray5);
        b.a(nArray5, 6, nArray2);
        b.b(nArray2, nArray4, nArray2);
        b.d(nArray2, nArray4);
        b.b(nArray4, nArray, nArray4);
        b.a(nArray4, 31, nArray5);
        b.b(nArray5, nArray4, nArray2);
        b.a(nArray5, 32, nArray5);
        b.b(nArray5, nArray2, nArray5);
        b.a(nArray5, 62, nArray5);
        b.b(nArray5, nArray2, nArray5);
        b.a(nArray5, 4, nArray5);
        b.b(nArray5, nArray3, nArray5);
        b.a(nArray5, 32, nArray5);
        b.b(nArray5, nArray, nArray5);
        b.a(nArray5, 62, nArray5);
        nArray2 = nArray3;
        b.d(nArray5, nArray2);
        if (h.c(nArray, nArray2)) {
            return new c(nArray5);
        }
        return null;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        return h.c(this.f, ((c)object).f);
    }

    public final int hashCode() {
        return g.hashCode() ^ org.bouncycastle.e.a.a(this.f, 8);
    }
}

