/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.b.f;
import org.bouncycastle.math.ec.a.c.a;
import org.bouncycastle.math.ec.a.c.b;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.l;

public final class c
extends l {
    private static BigInteger g = a.h;
    protected int[] f;

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.f = b.a(bigInteger);
    }

    public c() {
        this.f = new int[4];
    }

    protected c(int[] nArray) {
        this.f = nArray;
    }

    public final boolean j() {
        return org.bouncycastle.b.f.b(this.f);
    }

    public final boolean i() {
        return org.bouncycastle.b.f.a(this.f);
    }

    public final boolean k() {
        return (this.f[0] & 1) == 1;
    }

    public final BigInteger a() {
        int[] nArray = this.f;
        byte[] byArray = new byte[16];
        for (int i2 = 0; i2 < 4; ++i2) {
            int n2 = nArray[i2];
            if (n2 == 0) continue;
            ab.a(n2, byArray, 3 - i2 << 2);
        }
        return new BigInteger(1, byArray);
    }

    public final int b() {
        return g.bitLength();
    }

    public final j a(j j2) {
        int[] nArray = new int[4];
        b.a(this.f, ((c)j2).f, nArray);
        return new c(nArray);
    }

    public final j c() {
        int[] nArray = new int[4];
        b.a(this.f, nArray);
        return new c(nArray);
    }

    public final j b(j j2) {
        int[] nArray = new int[4];
        b.d(this.f, ((c)j2).f, nArray);
        return new c(nArray);
    }

    public final j c(j j2) {
        int[] nArray = new int[4];
        b.b(this.f, ((c)j2).f, nArray);
        return new c(nArray);
    }

    public final j d(j j2) {
        int[] nArray = new int[4];
        ab.a(b.a, ((c)j2).f, nArray);
        b.b(nArray, this.f, nArray);
        return new c(nArray);
    }

    public final j d() {
        int[] nArray = new int[4];
        b.b(this.f, nArray);
        return new c(nArray);
    }

    public final j e() {
        int[] nArray = new int[4];
        b.d(this.f, nArray);
        return new c(nArray);
    }

    public final j f() {
        int[] nArray = new int[4];
        ab.a(b.a, this.f, nArray);
        return new c(nArray);
    }

    public final j g() {
        int[] nArray = this.f;
        if (org.bouncycastle.b.f.b(this.f) || org.bouncycastle.b.f.a(nArray)) {
            return this;
        }
        int[] nArray2 = new int[4];
        b.d(nArray, nArray2);
        b.b(nArray2, nArray, nArray2);
        int[] nArray3 = new int[4];
        b.a(nArray2, 2, nArray3);
        b.b(nArray3, nArray2, nArray3);
        int[] nArray4 = new int[4];
        b.a(nArray3, 4, nArray4);
        b.b(nArray4, nArray3, nArray4);
        b.a(nArray4, 2, nArray3);
        b.b(nArray3, nArray2, nArray3);
        b.a(nArray3, 10, nArray2);
        b.b(nArray2, nArray3, nArray2);
        b.a(nArray2, 10, nArray4);
        b.b(nArray4, nArray3, nArray4);
        nArray2 = nArray3;
        b.d(nArray4, nArray2);
        b.b(nArray2, nArray, nArray2);
        b.a(nArray2, 95, nArray2);
        nArray3 = nArray4;
        b.d(nArray2, nArray3);
        if (org.bouncycastle.b.f.a(nArray, nArray3)) {
            return new c(nArray2);
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
        return org.bouncycastle.b.f.a(this.f, ((c)object).f);
    }

    public final int hashCode() {
        return g.hashCode() ^ org.bouncycastle.e.a.a(this.f, 4);
    }
}

