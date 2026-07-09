/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.bb;
import org.bouncycastle.math.ec.a.c.bf;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class be
extends e {
    private bf h = new bf(this);

    public be() {
        super(131, 2, 3, 8);
        this.a = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("03E5A88919D7CAFCBF415F07C2176573B2")));
        this.b = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("04B8266A46C55657AC734CE38F018F2192")));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("0400000000000000016954A233049BA98F"));
        this.d = BigInteger.valueOf(2L);
        this.e = 6;
    }

    protected final d c() {
        return new be();
    }

    public final boolean a(int n2) {
        switch (n2) {
            case 6: {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        return 131;
    }

    public final j a(BigInteger bigInteger) {
        return new bb(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new bf((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new bf(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.h;
    }

    public final boolean n() {
        return false;
    }
}

