/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.math.ec.a.c.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.f;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class a
extends f {
    public static final BigInteger h = new BigInteger(1, org.bouncycastle.e.a.f.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));
    private org.bouncycastle.math.ec.a.c.d i = new org.bouncycastle.math.ec.a.c.d(this);

    public a() {
        super(h);
        this.a = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.b = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("E87579C11079F43DD824993C2CEE5ED3")));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("FFFFFFFE0000000075A30D1B9038A115"));
        this.d = BigInteger.valueOf(1L);
        this.e = 2;
    }

    protected final d c() {
        return new a();
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
        return new c(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new org.bouncycastle.math.ec.a.c.d((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new org.bouncycastle.math.ec.a.c.d(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.i;
    }
}

