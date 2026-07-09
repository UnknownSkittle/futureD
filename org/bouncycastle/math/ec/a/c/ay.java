/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.av;
import org.bouncycastle.math.ec.a.c.az;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class ay
extends e {
    private az h = new az(this);

    public ay() {
        super(113, 9, 0, 0);
        this.a = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.b = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("0095E9A9EC9B297BD4BF36E059184F")));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("010000000000000108789B2496AF93"));
        this.d = BigInteger.valueOf(2L);
        this.e = 6;
    }

    protected final d c() {
        return new ay();
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
        return 113;
    }

    public final j a(BigInteger bigInteger) {
        return new av(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new az((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new az(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.h;
    }

    public final boolean n() {
        return false;
    }
}

