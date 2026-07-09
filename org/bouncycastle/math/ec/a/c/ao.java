/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.e.a;
import org.bouncycastle.math.ec.a.c.am;
import org.bouncycastle.math.ec.a.c.an;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.l;

public final class ao
extends l {
    private static BigInteger g = am.h;
    protected int[] f;

    public ao(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.f = an.a(bigInteger);
    }

    public ao() {
        this.f = new int[12];
    }

    protected ao(int[] nArray) {
        this.f = nArray;
    }

    public final boolean j() {
        return ab.b(12, this.f);
    }

    public final boolean i() {
        return ab.a(12, this.f);
    }

    public final boolean k() {
        return (this.f[0] & 1) == 1;
    }

    public final BigInteger a() {
        return ab.c(12, this.f);
    }

    public final int b() {
        return g.bitLength();
    }

    public final j a(j j2) {
        int[] nArray = new int[12];
        an.a(this.f, ((ao)j2).f, nArray);
        return new ao(nArray);
    }

    public final j c() {
        int[] nArray = new int[12];
        an.a(this.f, nArray);
        return new ao(nArray);
    }

    public final j b(j j2) {
        int[] nArray = new int[12];
        an.d(this.f, ((ao)j2).f, nArray);
        return new ao(nArray);
    }

    public final j c(j j2) {
        int[] nArray = new int[12];
        an.c(this.f, ((ao)j2).f, nArray);
        return new ao(nArray);
    }

    public final j d(j j2) {
        int[] nArray = new int[12];
        ab.a(an.a, ((ao)j2).f, nArray);
        an.c(nArray, this.f, nArray);
        return new ao(nArray);
    }

    public final j d() {
        int[] nArray = new int[12];
        an.b(this.f, nArray);
        return new ao(nArray);
    }

    public final j e() {
        int[] nArray = new int[12];
        an.d(this.f, nArray);
        return new ao(nArray);
    }

    public final j f() {
        int[] nArray = new int[12];
        ab.a(an.a, this.f, nArray);
        return new ao(nArray);
    }

    public final j g() {
        int[] nArray = this.f;
        if (ab.b(12, nArray) || ab.a(12, nArray)) {
            return this;
        }
        int[] nArray2 = new int[12];
        int[] nArray3 = new int[12];
        int[] nArray4 = new int[12];
        int[] nArray5 = new int[12];
        an.d(nArray, nArray2);
        an.c(nArray2, nArray, nArray2);
        an.a(nArray2, 2, nArray3);
        an.c(nArray3, nArray2, nArray3);
        an.d(nArray3, nArray3);
        an.c(nArray3, nArray, nArray3);
        an.a(nArray3, 5, nArray4);
        an.c(nArray4, nArray3, nArray4);
        an.a(nArray4, 5, nArray5);
        an.c(nArray5, nArray3, nArray5);
        an.a(nArray5, 15, nArray3);
        an.c(nArray3, nArray5, nArray3);
        an.a(nArray3, 2, nArray4);
        an.c(nArray2, nArray4, nArray2);
        an.a(nArray4, 28, nArray4);
        an.c(nArray3, nArray4, nArray3);
        an.a(nArray3, 60, nArray4);
        an.c(nArray4, nArray3, nArray4);
        int[] nArray6 = nArray3;
        an.a(nArray4, 120, nArray6);
        an.c(nArray6, nArray4, nArray6);
        an.a(nArray6, 15, nArray6);
        an.c(nArray6, nArray5, nArray6);
        an.a(nArray6, 33, nArray6);
        an.c(nArray6, nArray2, nArray6);
        an.a(nArray6, 64, nArray6);
        an.c(nArray6, nArray, nArray6);
        an.a(nArray6, 30, nArray2);
        an.d(nArray2, nArray3);
        if (ab.b(12, nArray, nArray3)) {
            return new ao(nArray2);
        }
        return null;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ao)) {
            return false;
        }
        object = (ao)object;
        return ab.b(12, this.f, ((ao)object).f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.a(this.f, 12);
    }
}

