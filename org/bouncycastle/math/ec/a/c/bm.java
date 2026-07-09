/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.bh;
import org.bouncycastle.math.ec.a.c.bn;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class bm
extends e {
    private bn h = new bn(this);

    public bm() {
        super(163, 3, 6, 7);
        this.a = this.a(BigInteger.valueOf(1L));
        this.b = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("020A601907B8C953CA1481EB10512F78744A3205FD")));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("040000000000000000000292FE77E70C12A4234C33"));
        this.d = BigInteger.valueOf(2L);
        this.e = 6;
    }

    protected final d c() {
        return new bm();
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
        return new bn((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new bn(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.h;
    }

    public final boolean n() {
        return false;
    }
}

