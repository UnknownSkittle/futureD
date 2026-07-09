/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.math.ec.a.c.q;
import org.bouncycastle.math.ec.a.c.r;
import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.f;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class o
extends f {
    public static final BigInteger h = new BigInteger(1, org.bouncycastle.e.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));
    private r i = new r(this);

    public o() {
        super(h);
        this.a = this.a(org.bouncycastle.math.ec.c.a);
        this.b = this.a(BigInteger.valueOf(3L));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.d = BigInteger.valueOf(1L);
        this.e = 2;
    }

    protected final d c() {
        return new o();
    }

    public final boolean a(int n2) {
        switch (n2) {
            case 2: {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        return h.bitLength();
    }

    public final j a(BigInteger bigInteger) {
        return new q(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new r((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new r(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.i;
    }
}

