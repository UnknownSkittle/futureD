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

public final class o
extends f
implements e {
    private v a;

    public o(c c2) {
        this.a = new v(c2);
    }

    public o(BigInteger bigInteger) {
        this.a = new v(bigInteger);
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
        ((f)v2).a(g2);
    }

    public final BigInteger b() {
        return this.a.a;
    }
}

