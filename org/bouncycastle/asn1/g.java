/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.math.BigInteger;
import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;
import org.bouncycastle.e.a;
import org.bouncycastle.e.h;

public final class g
extends u {
    private final byte[] a;
    private static g[] b = new g[12];

    private g(byte[] byArray) {
        if (!h.a("org.bouncycastle.asn1.allow_unsafe_integer") && k.a(byArray)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        this.a = org.bouncycastle.e.a.d(byArray);
    }

    public final BigInteger b() {
        return new BigInteger(this.a);
    }

    final boolean a() {
        return false;
    }

    final int e() {
        return 1 + bz.a(this.a.length) + this.a.length;
    }

    final void a(r r2) {
        r2.a(10, this.a);
    }

    final boolean a(u u2) {
        if (!(u2 instanceof g)) {
            return false;
        }
        u2 = (g)u2;
        return org.bouncycastle.e.a.a(this.a, ((g)u2).a);
    }

    public final int hashCode() {
        return org.bouncycastle.e.a.c(this.a);
    }

    static g a(byte[] byArray) {
        if (byArray.length > 1) {
            return new g(byArray);
        }
        if (byArray.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int n2 = byArray[0] & 0xFF;
        if (n2 >= b.length) {
            return new g(org.bouncycastle.e.a.d(byArray));
        }
        g g2 = b[n2];
        if (g2 == null) {
            g2 = g.b[n2] = new g(org.bouncycastle.e.a.d(byArray));
        }
        return g2;
    }
}

