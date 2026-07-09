/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.i;

import java.math.BigInteger;
import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.p;

public final class g
implements c {
    private d f;
    private byte[] g;
    private p h;
    private BigInteger i;
    private BigInteger j;
    private BigInteger k = null;

    public g(d d2, p p2, BigInteger bigInteger) {
        this(d2, p2, bigInteger, b);
    }

    private g(d d2, p p2, BigInteger bigInteger, BigInteger bigInteger2) {
        if (d2 == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new NullPointerException("n");
        }
        this.f = d2;
        if (p2 == null) {
            throw new IllegalArgumentException("point has null value");
        }
        if (p2.n()) {
            throw new IllegalArgumentException("point at infinity");
        }
        if (!(p2 = p2.m()).o()) {
            throw new IllegalArgumentException("point not on curve");
        }
        d d3 = p2.c();
        if (!d2.a(d3)) {
            throw new IllegalArgumentException("Point must be on the same curve");
        }
        this.h = d2.a(p2);
        this.i = bigInteger;
        this.j = bigInteger2;
        this.g = null;
    }

    public final d a() {
        return this.f;
    }

    public final p b() {
        return this.h;
    }

    public final BigInteger c() {
        return this.i;
    }

    public final BigInteger d() {
        return this.j;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof g) {
            object = (g)object;
            return this.f.a(((g)object).f) && this.h.a(((g)object).h) && this.i.equals(((g)object).i) && this.j.equals(((g)object).j);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() * 37 ^ this.h.hashCode()) * 37 ^ this.i.hashCode()) * 37 ^ this.j.hashCode();
    }
}

