/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.a.b;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public abstract class f
extends d {
    protected f(BigInteger bigInteger) {
        super(org.bouncycastle.math.a.b.a(bigInteger));
    }

    protected final p a(int n2, BigInteger object) {
        j j2 = ((j)(object = this.a((BigInteger)object))).e().a(this.a).c((j)object).a(this.b).g();
        if (j2 == null) {
            throw new IllegalArgumentException("Invalid point compression");
        }
        if (j2.k() != (n2 == 1)) {
            j2 = j2.d();
        }
        return this.a((j)object, j2, true);
    }
}

