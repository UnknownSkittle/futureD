/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.math.ec.a.c.y;
import org.bouncycastle.math.ec.a.c.z;
import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.f;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class w
extends f {
    public static final BigInteger h = new BigInteger(1, org.bouncycastle.e.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));
    private z i = new z(this);

    public w() {
        super(h);
        this.a = this.a(org.bouncycastle.math.ec.c.a);
        this.b = this.a(BigInteger.valueOf(5L));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.d = BigInteger.valueOf(1L);
        this.e = 2;
    }

    protected final d c() {
        return new w();
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
        return new y(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new z((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new z(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.i;
    }
}

