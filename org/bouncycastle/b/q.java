/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.b.c;
import org.bouncycastle.b.e;
import org.bouncycastle.b.f;
import org.bouncycastle.b.g;
import org.bouncycastle.b.v;

public final class q
extends f
implements e {
    private v a;
    private v b;
    private v c;

    public q(c c2) {
        this.a = new v(c2);
        this.b = new v(c2);
        this.c = new v(c2);
    }

    public q(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.a = new v(bigInteger);
        this.b = new v(bigInteger2);
        this.c = new v(bigInteger3);
    }

    public final byte[] a() {
        try {
            return super.a();
        } catch (IOException iOException) {
            return null;
        }
    }

    public final BigInteger b() {
        return this.a.a;
    }

    public final BigInteger c() {
        return this.b.a;
    }

    public final BigInteger d() {
        return this.c.a;
    }

    public final void a(g g2) {
        v v2 = this.a;
        g g3 = g2;
        ((f)v2).a(g3);
        v2 = this.b;
        g3 = g2;
        ((f)v2).a(g3);
        v2 = this.c;
        g3 = g2;
        ((f)v2).a(g3);
    }
}

