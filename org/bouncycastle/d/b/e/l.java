/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.d.b.e.k;
import org.bouncycastle.d.b.e.p;
import org.bouncycastle.d.b.e.q;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class l
extends q<l> {
    private int a = 0;
    private int b = 0;
    private int c = 0;

    protected l() {
        super(0);
    }

    protected final l a(int n2) {
        this.a = n2;
        return this;
    }

    protected final l b(int n2) {
        this.b = n2;
        return this;
    }

    protected final l c(int n2) {
        this.c = n2;
        return this;
    }

    @Override
    protected final p a() {
        return new k(this, 0);
    }

    static /* synthetic */ int a(l l2) {
        return l2.a;
    }

    static /* synthetic */ int b(l l2) {
        return l2.b;
    }

    static /* synthetic */ int c(l l2) {
        return l2.c;
    }
}

