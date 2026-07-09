/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.bp;
import org.bouncycastle.math.ec.a.c.br;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class bq
extends e {
    private br h = new br(this);

    public bq() {
        super(193, 15, 0, 0);
        this.a = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.b = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("01000000000000000000000000C7F34A778F443ACC920EBA49"));
        this.d = BigInteger.valueOf(2L);
        this.e = 6;
    }

    protected final d c() {
        return new bq();
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
        return 193;
    }

    public final j a(BigInteger bigInteger) {
        return new bp(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new br((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new br(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.h;
    }

    public final boolean n() {
        return false;
    }
}

