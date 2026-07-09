/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.math.ec.a.c.m;
import org.bouncycastle.math.ec.a.c.n;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.f;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class k
extends f {
    public static final BigInteger h = new BigInteger(1, org.bouncycastle.e.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));
    private n i = new n(this);

    public k() {
        super(h);
        this.a = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.b = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("0100000000000000000000351EE786A818F3A1A16B"));
        this.d = BigInteger.valueOf(1L);
        this.e = 2;
    }

    protected final d c() {
        return new k();
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
        return new m(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new n((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new n(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.i;
    }
}

