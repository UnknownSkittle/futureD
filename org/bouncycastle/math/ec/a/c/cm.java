/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.cl;
import org.bouncycastle.math.ec.a.c.cn;
import org.bouncycastle.math.ec.ai;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.o;
import org.bouncycastle.math.ec.p;

public final class cm
extends e {
    private cn h = new cn(this);

    public cm() {
        super(409, 87, 0, 0);
        this.a = this.a(BigInteger.valueOf(0L));
        this.b = this.a(BigInteger.valueOf(1L));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"));
        this.d = BigInteger.valueOf(4L);
        this.e = 6;
    }

    protected final d c() {
        return new cm();
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
        return 409;
    }

    public final j a(BigInteger bigInteger) {
        return new cl(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new cn((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new cn(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.h;
    }

    public final boolean n() {
        return true;
    }
}

