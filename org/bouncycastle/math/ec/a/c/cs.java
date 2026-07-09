/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.cr;
import org.bouncycastle.math.ec.a.c.ct;
import org.bouncycastle.math.ec.ai;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.o;
import org.bouncycastle.math.ec.p;

public final class cs
extends e {
    private ct h = new ct(this);

    public cs() {
        super(571, 2, 5, 10);
        this.a = this.a(BigInteger.valueOf(0L));
        this.b = this.a(BigInteger.valueOf(1L));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.d = BigInteger.valueOf(4L);
        this.e = 6;
    }

    protected final d c() {
        return new cs();
    }

    public final boolean a(int n2) {
        switch (n2) {
            case 6: {
                return true;
            }
        }
        return false;
    }

    protected final o d() {
        return new ai();
    }

    public final int a() {
        return 571;
    }

    public final j a(BigInteger bigInteger) {
        return new cr(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new ct((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new ct(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.h;
    }

    public final boolean n() {
        return true;
    }
}

