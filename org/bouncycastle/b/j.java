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

public final class j
extends f
implements e {
    private v a;
    private v b;
    private v c;
    private v d;

    public j(c c2) {
        this.a = new v(c2);
        this.b = new v(c2);
        this.c = new v(c2);
        this.d = new v(c2);
    }

    public j(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.a = new v(bigInteger);
        this.b = new v(bigInteger2);
        this.c = new v(bigInteger3);
        this.d = new v(bigInteger4);
    }

    public final byte[] a() {
        try {
            return super.a();
        } catch (IOException iOException) {
            return null;
        }
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
        v2 = this.d;
        g3 = g2;
        ((f)v2).a(g3);
    }

    public final BigInteger b() {
        return this.c.a;
    }

    public final BigInteger c() {
        return this.a.a;
    }

    public final BigInteger d() {
        return this.b.a;
    }

    public final BigInteger e() {
        return this.d.a;
    }
}

