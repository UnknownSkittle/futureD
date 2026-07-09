/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.f;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.n;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.u;

public final class i
extends f {
    private BigInteger h;
    private BigInteger i;
    private u j;

    public i(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(bigInteger);
        this.h = bigInteger;
        this.i = n.a(bigInteger);
        this.j = new u((d)this, null, null, false);
        this.a = this.a(bigInteger2);
        this.b = this.a(bigInteger3);
        this.c = bigInteger4;
        this.d = bigInteger5;
        this.e = 4;
    }

    private i(BigInteger bigInteger, BigInteger bigInteger2, j j2, j j3, BigInteger bigInteger3, BigInteger bigInteger4) {
        super(bigInteger);
        this.h = bigInteger;
        this.i = bigInteger2;
        this.j = new u((d)this, null, null, false);
        this.a = j2;
        this.b = j3;
        this.c = bigInteger3;
        this.d = bigInteger4;
        this.e = 4;
    }

    protected final d c() {
        return new i(this.h, this.i, this.a, this.b, this.c, this.d);
    }

    public final boolean a(int n2) {
        switch (n2) {
            case 0: 
            case 1: 
            case 2: 
            case 4: {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        return this.h.bitLength();
    }

    public final j a(BigInteger bigInteger) {
        return new n(this.h, this.i, bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new u((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new u(this, j2, j3, jArray, bl2);
    }

    public final p a(p p2) {
        if (this != p2.c() && this.k() == 2 && !p2.n()) {
            switch (p2.c().k()) {
                case 2: 
                case 3: 
                case 4: {
                    i i2 = this;
                    return new u(i2, i2.a(p2.b.a()), this.a(p2.c.a()), new j[]{this.a(p2.d[0].a())}, p2.e);
                }
            }
        }
        return super.a(p2);
    }

    public final p e() {
        return this.j;
    }
}

