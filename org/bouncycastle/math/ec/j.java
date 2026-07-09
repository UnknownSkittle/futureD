/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.c;

public abstract class j
implements c {
    public abstract BigInteger a();

    public abstract int b();

    public abstract j a(j var1);

    public abstract j c();

    public abstract j b(j var1);

    public abstract j c(j var1);

    public abstract j d(j var1);

    public abstract j d();

    public abstract j e();

    public abstract j f();

    public abstract j g();

    public int h() {
        return this.a().bitLength();
    }

    public boolean i() {
        return this.h() == 1;
    }

    public boolean j() {
        return 0 == this.a().signum();
    }

    public j a(j j2, j j3, j j4) {
        return this.c(j2).b(j3.c(j4));
    }

    public j b(j j2, j j3, j j4) {
        return this.c(j2).a(j3.c(j4));
    }

    public j a(j j2, j j3) {
        return this.e().a(j2.c(j3));
    }

    public j a(int n2) {
        j j2 = this;
        for (int i2 = 0; i2 < n2; ++i2) {
            j2 = j2.e();
        }
        return j2;
    }

    public boolean k() {
        return this.a().testBit(0);
    }

    public String toString() {
        return this.a().toString(16);
    }

    public final byte[] l() {
        return org.bouncycastle.e.c.a((this.b() + 7) / 8, this.a());
    }
}

