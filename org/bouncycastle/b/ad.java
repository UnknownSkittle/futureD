/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.b.c;
import org.bouncycastle.b.e;
import org.bouncycastle.b.f;
import org.bouncycastle.b.g;
import org.bouncycastle.b.v;

public final class ad
extends f
implements e {
    private v a;
    private v b;
    private v c;
    private v d;
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;

    public ad(c c2) {
        this.a = new v(c2);
        this.b = new v(c2);
        this.c = new v(c2);
        this.d = new v(c2);
        this.e = this.a.a.remainder(this.b.a.subtract(BigInteger.valueOf(1L)));
        this.f = this.a.a.remainder(this.c.a.subtract(BigInteger.valueOf(1L)));
        this.g = this.c.a.modInverse(this.b.a);
    }

    public ad(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int n2 = bigInteger2.compareTo(bigInteger3);
        if (n2 >= 0) {
            if (n2 == 0) {
                throw new IllegalArgumentException("p and q cannot be equal");
            }
            BigInteger bigInteger4 = bigInteger2;
            bigInteger2 = bigInteger3;
            bigInteger3 = bigInteger4;
        }
        this.a = new v(bigInteger);
        this.b = new v(bigInteger2);
        this.c = new v(bigInteger3);
        this.d = new v(bigInteger2.modInverse(bigInteger3));
        this.e = bigInteger.remainder(bigInteger2.subtract(BigInteger.valueOf(1L)));
        this.f = bigInteger.remainder(bigInteger3.subtract(BigInteger.valueOf(1L)));
        this.g = bigInteger3.modInverse(bigInteger2);
    }

    public final BigInteger b() {
        return this.b.a.multiply(this.c.a);
    }

    public final BigInteger c() {
        return this.a.a;
    }

    public final BigInteger d() {
        return this.b.a;
    }

    public final BigInteger e() {
        return this.c.a;
    }

    public final BigInteger f() {
        return this.e;
    }

    public final BigInteger g() {
        return this.f;
    }

    public final BigInteger h() {
        return this.g;
    }

    public final byte[] a() {
        try {
            return super.a();
        } catch (IOException iOException) {
            return null;
        }
    }

    public final void a(g g2) {
        v v2 = this.a;
        g g3 = g2;
        ((f)v2).a(g3);
        v2 = this.b;
        g3 = g2;
        ((f)v2).a(g3);
        v2 = this.c;
        g3 = g2;
        ((f)v2).a(g3);
        v2 = this.d;
        g3 = g2;
        ((f)v2).a(g3);
    }
}

