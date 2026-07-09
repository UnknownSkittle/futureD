/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.a;
import org.bouncycastle.math.ec.b;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.v;

public final class w
extends a {
    private d a;
    private org.bouncycastle.math.ec.b.b b;

    public w(d d2, org.bouncycastle.math.ec.b.b b2) {
        if (d2.i() == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.a = d2;
        this.b = b2;
    }

    protected final p b(p p2, BigInteger object) {
        if (!this.a.a(p2.c())) {
            throw new IllegalStateException();
        }
        BigInteger bigInteger = p2.c().i();
        object = this.b.a(object.mod(bigInteger));
        bigInteger = object[0];
        object = object[1];
        v v2 = this.b.a();
        return org.bouncycastle.math.ec.b.a(p2, bigInteger, v2, (BigInteger)object);
    }
}

