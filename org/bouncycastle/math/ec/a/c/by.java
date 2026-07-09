/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.bv;
import org.bouncycastle.math.ec.a.c.bz;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class by
extends e {
    private bz h = new bz(this);

    public by() {
        super(233, 74, 0, 0);
        this.a = this.a(BigInteger.valueOf(1L));
        this.b = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD")));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7"));
        this.d = BigInteger.valueOf(2L);
        this.e = 6;
    }

    protected final d c() {
        return new by();
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
        return 233;
    }

    public final j a(BigInteger bigInteger) {
        return new bv(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new bz((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new bz(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.h;
    }

    public final boolean n() {
        return false;
    }
}

