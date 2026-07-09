/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.cr;
import org.bouncycastle.math.ec.a.c.cv;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class cu
extends e {
    private cv i = new cv(this);
    private static cr j = new cr(new BigInteger(1, org.bouncycastle.e.a.f.a("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
    static final cr h = (cr)j.g();

    public cu() {
        super(571, 2, 5, 10);
        this.a = this.a(BigInteger.valueOf(1L));
        this.b = j;
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.d = BigInteger.valueOf(2L);
        this.e = 6;
    }

    protected final d c() {
        return new cu();
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
        return 571;
    }

    public final j a(BigInteger bigInteger) {
        return new cr(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new cv((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new cv(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.i;
    }

    public final boolean n() {
        return false;
    }
}

