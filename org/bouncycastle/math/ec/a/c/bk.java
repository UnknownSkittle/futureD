/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.bh;
import org.bouncycastle.math.ec.a.c.bl;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class bk
extends e {
    private bl h = new bl(this);

    public bk() {
        super(163, 3, 6, 7);
        this.a = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.b = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
        this.d = BigInteger.valueOf(2L);
        this.e = 6;
    }

    protected final d c() {
        return new bk();
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
        return 163;
    }

    public final j a(BigInteger bigInteger) {
        return new bh(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new bl((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new bl(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.h;
    }

    public final boolean n() {
        return false;
    }
}

