/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import org.bouncycastle.math.ec.b.a;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.o;

public final class g {
    private int a;
    private a b;
    private o c;
    private /* synthetic */ d d;

    g(d d2, int n2, a a2, o o2) {
        this.d = d2;
        this.a = n2;
        this.b = a2;
        this.c = o2;
    }

    public final g a(a a2) {
        this.b = a2;
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final d a() {
        if (!this.d.a(this.a)) {
            throw new IllegalStateException("unsupported coordinate system");
        }
        d d2 = this.d.c();
        if (d2 == this.d) {
            throw new IllegalStateException("implementation returned current curve");
        }
        d d3 = d2;
        synchronized (d3) {
            d2.e = this.a;
            d2.f = this.b;
            d2.g = this.c;
        }
        return d2;
    }
}

