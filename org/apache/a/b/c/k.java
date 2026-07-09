/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.c;

import org.apache.a.b.c.j;
import org.apache.a.e;
import org.apache.a.l;
import org.apache.a.n;

final class k
extends j
implements l {
    private org.apache.a.k c;

    k(l l2, n n2) {
        super(l2, n2, (byte)0);
        this.c = l2.b();
    }

    @Override
    public final org.apache.a.k b() {
        return this.c;
    }

    @Override
    public final void a(org.apache.a.k k2) {
        this.c = k2;
    }

    @Override
    public final boolean a() {
        e e2 = this.c("Expect");
        return e2 != null && "100-continue".equalsIgnoreCase(e2.d());
    }
}

