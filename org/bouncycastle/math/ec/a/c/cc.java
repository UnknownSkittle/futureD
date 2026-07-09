/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.cb;
import org.bouncycastle.math.ec.a.c.cd;
import org.bouncycastle.math.ec.ai;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.o;
import org.bouncycastle.math.ec.p;

public final class cc
extends e {
    private cd h = new cd(this);

    public cc() {
        super(239, 158, 0, 0);
        this.a = this.a(BigInteger.valueOf(0L));
        this.b = this.a(BigInteger.valueOf(1L));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.d = BigInteger.valueOf(4L);
        this.e = 6;
    }

    protected final d c() {
        return new cc();
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
        return 239;
    }

    public final j a(BigInteger bigInteger) {
        return new cb(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new cd((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new cd(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.h;
    }

    public final boolean n() {
        return true;
    }
}

