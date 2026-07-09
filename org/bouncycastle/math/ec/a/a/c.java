/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.a;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.ec.a.a.a;
import org.bouncycastle.math.ec.a.a.b;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.l;
import org.bouncycastle.openpgp.h;

public final class c
extends l {
    private static BigInteger g = a.h;
    private static final int[] h = new int[]{1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};
    protected int[] f;

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
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
        return org.bouncycastle.openpgp.h.b(this.f);
    }

    public final boolean i() {
        return org.bouncycastle.openpgp.h.a(this.f);
    }

    public final boolean k() {
        return (this.f[0] & 1) == 1;
    }

    public final BigInteger a() {
        return org.bouncycastle.openpgp.h.c(this.f);
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
        if (org.bouncycastle.openpgp.h.b(this.f) || org.bouncycastle.openpgp.h.a(nArray)) {
            return this;
        }
        int[] nArray2 = new int[8];
        b.d(nArray, nArray2);
        b.b(nArray2, nArray, nArray2);
        int[] nArray3 = nArray2;
        b.d(nArray2, nArray3);
        b.b(nArray3, nArray, nArray3);
        nArray2 = new int[8];
        b.d(nArray3, nArray2);
        b.b(nArray2, nArray, nArray2);
        int[] nArray4 = new int[8];
        b.a(nArray2, 3, nArray4);
        b.b(nArray4, nArray3, nArray4);
        b.a(nArray4, 4, nArray3);
        b.b(nArray3, nArray2, nArray3);
        b.a(nArray3, 4, nArray4);
        b.b(nArray4, nArray2, nArray4);
        b.a(nArray4, 15, nArray2);
        b.b(nArray2, nArray4, nArray2);
        b.a(nArray2, 30, nArray4);
        b.b(nArray4, nArray2, nArray4);
        b.a(nArray4, 60, nArray2);
        b.b(nArray2, nArray4, nArray2);
        b.a(nArray2, 11, nArray4);
        b.b(nArray4, nArray3, nArray4);
        b.a(nArray4, 120, nArray3);
        b.b(nArray3, nArray2, nArray3);
        b.d(nArray3, nArray3);
        b.d(nArray3, nArray2);
        if (org.bouncycastle.openpgp.h.c(nArray, nArray2)) {
            return new c(nArray3);
        }
        b.b(nArray3, h, nArray3);
        b.d(nArray3, nArray2);
        if (org.bouncycastle.openpgp.h.c(nArray, nArray2)) {
            return new c(nArray3);
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
        return org.bouncycastle.openpgp.h.c(this.f, ((c)object).f);
    }

    public final int hashCode() {
        return g.hashCode() ^ org.bouncycastle.e.a.a(this.f, 8);
    }
}

