/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.e.a;
import org.bouncycastle.math.ec.a.c.ae;
import org.bouncycastle.math.ec.a.c.af;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.l;
import org.bouncycastle.openpgp.h;

public final class ag
extends l {
    private static BigInteger g = ae.h;
    protected int[] f;

    public ag(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.f = af.a(bigInteger);
    }

    public ag() {
        this.f = new int[8];
    }

    protected ag(int[] nArray) {
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
        af.a(this.f, ((ag)j2).f, nArray);
        return new ag(nArray);
    }

    public final j c() {
        int[] nArray = new int[8];
        af.a(this.f, nArray);
        return new ag(nArray);
    }

    public final j b(j j2) {
        int[] nArray = new int[8];
        af.d(this.f, ((ag)j2).f, nArray);
        return new ag(nArray);
    }

    public final j c(j j2) {
        int[] nArray = new int[8];
        af.b(this.f, ((ag)j2).f, nArray);
        return new ag(nArray);
    }

    public final j d(j j2) {
        int[] nArray = new int[8];
        ab.a(af.a, ((ag)j2).f, nArray);
        af.b(nArray, this.f, nArray);
        return new ag(nArray);
    }

    public final j d() {
        int[] nArray = new int[8];
        af.b(this.f, nArray);
        return new ag(nArray);
    }

    public final j e() {
        int[] nArray = new int[8];
        af.d(this.f, nArray);
        return new ag(nArray);
    }

    public final j f() {
        int[] nArray = new int[8];
        ab.a(af.a, this.f, nArray);
        return new ag(nArray);
    }

    public final j g() {
        int[] nArray = this.f;
        if (h.b(this.f) || h.a(nArray)) {
            return this;
        }
        int[] nArray2 = new int[8];
        af.d(nArray, nArray2);
        af.b(nArray2, nArray, nArray2);
        int[] nArray3 = new int[8];
        af.d(nArray2, nArray3);
        af.b(nArray3, nArray, nArray3);
        int[] nArray4 = new int[8];
        af.a(nArray3, 3, nArray4);
        af.b(nArray4, nArray3, nArray4);
        int[] nArray5 = nArray4;
        af.a(nArray4, 3, nArray5);
        af.b(nArray5, nArray3, nArray5);
        nArray4 = nArray5;
        af.a(nArray5, 2, nArray4);
        af.b(nArray4, nArray2, nArray4);
        nArray5 = new int[8];
        af.a(nArray4, 11, nArray5);
        af.b(nArray5, nArray4, nArray5);
        af.a(nArray5, 22, nArray4);
        af.b(nArray4, nArray5, nArray4);
        int[] nArray6 = new int[8];
        af.a(nArray4, 44, nArray6);
        af.b(nArray6, nArray4, nArray6);
        int[] nArray7 = new int[8];
        af.a(nArray6, 88, nArray7);
        af.b(nArray7, nArray6, nArray7);
        af.a(nArray7, 44, nArray6);
        af.b(nArray6, nArray4, nArray6);
        af.a(nArray6, 3, nArray4);
        af.b(nArray4, nArray3, nArray4);
        nArray3 = nArray4;
        af.a(nArray4, 23, nArray3);
        af.b(nArray3, nArray5, nArray3);
        af.a(nArray3, 6, nArray3);
        af.b(nArray3, nArray2, nArray3);
        af.a(nArray3, 2, nArray3);
        af.d(nArray3, nArray2);
        if (h.c(nArray, nArray2)) {
            return new ag(nArray3);
        }
        return null;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ag)) {
            return false;
        }
        object = (ag)object;
        return h.c(this.f, ((ag)object).f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.a(this.f, 8);
    }
}

