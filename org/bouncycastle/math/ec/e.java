/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.math.a.b;
import org.bouncycastle.math.a.f;
import org.bouncycastle.math.ec.ab;
import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public abstract class e
extends d {
    private BigInteger[] h;

    protected e(int n2, int n3, int n4, int n5) {
        f f2;
        if (n3 == 0) {
            throw new IllegalArgumentException("k1 must be > 0");
        }
        if (n4 == 0) {
            if (n5 != 0) {
                throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
            }
            f2 = org.bouncycastle.math.a.b.a(new int[]{0, n3, n2});
        } else {
            if (n4 <= n3) {
                throw new IllegalArgumentException("k2 must be > k1");
            }
            if (n5 <= n4) {
                throw new IllegalArgumentException("k3 must be > k2");
            }
            f2 = org.bouncycastle.math.a.b.a(new int[]{0, n3, n4, n5, n2});
        }
        super(f2);
        this.h = null;
    }

    public final p a(BigInteger object, BigInteger object2, boolean bl2) {
        object = this.a((BigInteger)object);
        object2 = this.a((BigInteger)object2);
        switch (this.k()) {
            case 5: 
            case 6: {
                if (((j)object).j()) {
                    if (((j)object2).e().equals(this.h())) break;
                    throw new IllegalArgumentException();
                }
                object2 = ((j)object2).d((j)object).a((j)object);
            }
        }
        return this.a((j)object, (j)object2, bl2);
    }

    protected final p a(int n2, BigInteger object) {
        object = this.a((BigInteger)object);
        j j2 = null;
        if (((j)object).j()) {
            j2 = this.h().g();
        } else {
            j j3 = ((j)object).e().f().c(this.h()).a(this.g()).a((j)object);
            if ((j3 = this.a(j3)) != null) {
                if (j3.k() != (n2 == 1)) {
                    j3 = j3.c();
                }
                switch (this.k()) {
                    case 5: 
                    case 6: {
                        j2 = j3.a((j)object);
                        break;
                    }
                    default: {
                        j2 = j3.c((j)object);
                    }
                }
            }
        }
        if (j2 == null) {
            throw new IllegalArgumentException("Invalid point compression");
        }
        return this.a((j)object, j2, true);
    }

    protected final j a(j j2) {
        j j3;
        if (j2.j()) {
            return j2;
        }
        j j4 = this.a(org.bouncycastle.math.ec.c.a);
        int n2 = this.a();
        Random random = new Random();
        do {
            j j5 = this.a(new BigInteger(n2, random));
            j3 = j4;
            j j6 = j2;
            for (int i2 = 1; i2 < n2; ++i2) {
                j6 = j6.e();
                j3 = j3.e().a(j6.c(j5));
                j6 = j6.a(j2);
            }
            if (j6.j()) continue;
            return null;
        } while (j3.e().a(j3).j());
        return j3;
    }

    final synchronized BigInteger[] m() {
        if (this.h == null) {
            this.h = ab.a(this);
        }
        return this.h;
    }

    public boolean n() {
        return this.c != null && this.d != null && this.b.i() && (this.a.j() || this.a.i());
    }
}

