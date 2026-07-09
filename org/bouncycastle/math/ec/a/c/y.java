/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.e.a;
import org.bouncycastle.math.ec.a.c.w;
import org.bouncycastle.math.ec.a.c.x;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.l;

public final class y
extends l {
    private static BigInteger g = w.h;
    private static final int[] h = new int[]{868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};
    protected int[] f;

    public y(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.f = x.a(bigInteger);
    }

    public y() {
        this.f = new int[7];
    }

    protected y(int[] nArray) {
        this.f = nArray;
    }

    public final boolean j() {
        return org.bouncycastle.math.b.a.b(this.f);
    }

    public final boolean i() {
        return org.bouncycastle.math.b.a.a(this.f);
    }

    public final boolean k() {
        return (this.f[0] & 1) == 1;
    }

    public final BigInteger a() {
        return org.bouncycastle.math.b.a.c(this.f);
    }

    public final int b() {
        return g.bitLength();
    }

    public final j a(j j2) {
        int[] nArray = new int[7];
        x.a(this.f, ((y)j2).f, nArray);
        return new y(nArray);
    }

    public final j c() {
        int[] nArray = new int[7];
        x.a(this.f, nArray);
        return new y(nArray);
    }

    public final j b(j j2) {
        int[] nArray = new int[7];
        x.d(this.f, ((y)j2).f, nArray);
        return new y(nArray);
    }

    public final j c(j j2) {
        int[] nArray = new int[7];
        x.b(this.f, ((y)j2).f, nArray);
        return new y(nArray);
    }

    public final j d(j j2) {
        int[] nArray = new int[7];
        ab.a(x.a, ((y)j2).f, nArray);
        x.b(nArray, this.f, nArray);
        return new y(nArray);
    }

    public final j d() {
        int[] nArray = new int[7];
        x.b(this.f, nArray);
        return new y(nArray);
    }

    public final j e() {
        int[] nArray = new int[7];
        x.d(this.f, nArray);
        return new y(nArray);
    }

    public final j f() {
        int[] nArray = new int[7];
        ab.a(x.a, this.f, nArray);
        return new y(nArray);
    }

    public final j g() {
        int[] nArray = this.f;
        if (org.bouncycastle.math.b.a.b(this.f) || org.bouncycastle.math.b.a.a(nArray)) {
            return this;
        }
        int[] nArray2 = new int[7];
        x.d(nArray, nArray2);
        x.b(nArray2, nArray, nArray2);
        int[] nArray3 = nArray2;
        x.d(nArray2, nArray3);
        x.b(nArray3, nArray, nArray3);
        nArray2 = new int[7];
        x.d(nArray3, nArray2);
        x.b(nArray2, nArray, nArray2);
        int[] nArray4 = new int[7];
        x.a(nArray2, 4, nArray4);
        x.b(nArray4, nArray2, nArray4);
        int[] nArray5 = new int[7];
        x.a(nArray4, 3, nArray5);
        x.b(nArray5, nArray3, nArray5);
        int[] nArray6 = nArray5;
        x.a(nArray5, 8, nArray6);
        x.b(nArray6, nArray4, nArray6);
        x.a(nArray6, 4, nArray4);
        x.b(nArray4, nArray2, nArray4);
        x.a(nArray4, 19, nArray2);
        x.b(nArray2, nArray6, nArray2);
        nArray5 = new int[7];
        x.a(nArray2, 42, nArray5);
        x.b(nArray5, nArray2, nArray5);
        x.a(nArray5, 23, nArray2);
        x.b(nArray2, nArray4, nArray2);
        x.a(nArray2, 84, nArray4);
        x.b(nArray4, nArray5, nArray4);
        nArray2 = nArray4;
        x.a(nArray4, 20, nArray2);
        x.b(nArray2, nArray6, nArray2);
        x.a(nArray2, 3, nArray2);
        x.b(nArray2, nArray, nArray2);
        x.a(nArray2, 2, nArray2);
        x.b(nArray2, nArray, nArray2);
        x.a(nArray2, 4, nArray2);
        x.b(nArray2, nArray3, nArray2);
        x.d(nArray2, nArray2);
        nArray3 = nArray5;
        x.d(nArray2, nArray3);
        if (org.bouncycastle.math.b.a.b(nArray, nArray3)) {
            return new y(nArray2);
        }
        x.b(nArray2, h, nArray2);
        x.d(nArray2, nArray3);
        if (org.bouncycastle.math.b.a.b(nArray, nArray3)) {
            return new y(nArray2);
        }
        return null;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof y)) {
            return false;
        }
        object = (y)object;
        return org.bouncycastle.math.b.a.b(this.f, ((y)object).f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.a(this.f, 7);
    }
}

