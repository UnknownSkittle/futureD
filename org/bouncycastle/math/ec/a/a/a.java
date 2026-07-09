/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.a;

import java.math.BigInteger;
import org.bouncycastle.math.ec.a.a.b;
import org.bouncycastle.math.ec.a.a.c;
import org.bouncycastle.math.ec.a.a.d;
import org.bouncycastle.math.ec.f;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.openpgp.h;

public final class a
extends f {
    public static final BigInteger h = org.bouncycastle.openpgp.h.c(org.bouncycastle.math.ec.a.a.b.a);
    private d i = new d(this);

    public a() {
        super(h);
        this.a = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
        this.b = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.d = BigInteger.valueOf(8L);
        this.e = 4;
    }

    protected final org.bouncycastle.math.ec.d c() {
        return new a();
    }

    public final boolean a(int n2) {
        switch (n2) {
            case 4: {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        return h.bitLength();
    }

    public final j a(BigInteger bigInteger) {
        return new c(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new d((org.bouncycastle.math.ec.d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new d(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.i;
    }
}

