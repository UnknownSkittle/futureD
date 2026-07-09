/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.b;

import java.math.BigInteger;
import org.bouncycastle.math.ec.b.b;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.v;
import org.bouncycastle.math.ec.z;

public final class c
implements b {
    private d a;
    private org.bouncycastle.math.ec.b.d b;
    private v c;

    public c(d d2, org.bouncycastle.math.ec.b.d d3) {
        this.a = d2;
        this.b = d3;
        this.c = new z(d2.a(d3.a()));
    }

    public final BigInteger[] a(BigInteger bigInteger) {
        int n2 = this.b.h();
        BigInteger bigInteger2 = org.bouncycastle.math.ec.b.c.a(bigInteger, this.b.f(), n2);
        BigInteger bigInteger3 = org.bouncycastle.math.ec.b.c.a(bigInteger, this.b.g(), n2);
        org.bouncycastle.math.ec.b.d d2 = this.b;
        bigInteger = bigInteger.subtract(bigInteger2.multiply(d2.b()).add(bigInteger3.multiply(d2.d())));
        bigInteger3 = bigInteger2.multiply(d2.c()).add(bigInteger3.multiply(d2.e())).negate();
        return new BigInteger[]{bigInteger, bigInteger3};
    }

    public final v a() {
        return this.c;
    }

    private static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, int n2) {
        boolean bl2 = bigInteger2.signum() < 0;
        bigInteger = bigInteger.multiply(bigInteger2.abs());
        boolean bl3 = bigInteger.testBit(n2 - 1);
        bigInteger = bigInteger.shiftRight(n2);
        if (bl3) {
            bigInteger = bigInteger.add(org.bouncycastle.math.ec.c.b);
        }
        if (bl2) {
            return bigInteger.negate();
        }
        return bigInteger;
    }
}

