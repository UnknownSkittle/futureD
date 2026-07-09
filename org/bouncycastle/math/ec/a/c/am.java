/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.math.ec.a.c.ao;
import org.bouncycastle.math.ec.a.c.ap;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.f;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class am
extends f {
    public static final BigInteger h = new BigInteger(1, org.bouncycastle.e.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));
    private ap i = new ap(this);

    public am() {
        super(h);
        this.a = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.b = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.d = BigInteger.valueOf(1L);
        this.e = 2;
    }

    protected final d c() {
        return new am();
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
        return new ao(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new ap((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new ap(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.i;
    }
}

