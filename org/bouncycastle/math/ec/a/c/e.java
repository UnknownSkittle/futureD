/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.math.ec.a.c.k;
import org.bouncycastle.math.ec.a.c.m;
import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.f;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class e
extends f {
    private static BigInteger h = k.h;
    private org.bouncycastle.math.ec.a.c.f i = new org.bouncycastle.math.ec.a.c.f(this);

    public e() {
        super(h);
        this.a = this.a(org.bouncycastle.math.ec.c.a);
        this.b = this.a(BigInteger.valueOf(7L));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.d = BigInteger.valueOf(1L);
        this.e = 2;
    }

    protected final d c() {
        return new e();
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
        return new org.bouncycastle.math.ec.a.c.f((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new org.bouncycastle.math.ec.a.c.f(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.i;
    }
}

