/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.math.ec.a.c.i;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.f;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class g
extends f {
    public static final BigInteger h = new BigInteger(1, org.bouncycastle.e.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));
    private org.bouncycastle.math.ec.a.c.j i = new org.bouncycastle.math.ec.a.c.j(this);

    public g() {
        super(h);
        this.a = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.b = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("0100000000000000000001F4C8F927AED3CA752257"));
        this.d = BigInteger.valueOf(1L);
        this.e = 2;
    }

    protected final d c() {
        return new g();
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
        return new i(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new org.bouncycastle.math.ec.a.c.j((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new org.bouncycastle.math.ec.a.c.j(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.i;
    }
}

