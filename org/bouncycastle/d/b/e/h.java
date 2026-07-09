/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.d.b.e.f;
import org.bouncycastle.d.b.e.p;
import org.bouncycastle.d.b.e.q;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class h
extends q<h> {
    private int a = 0;
    private int b = 0;

    protected h() {
        super(2);
    }

    protected final h a(int n2) {
        this.a = n2;
        return this;
    }

    protected final h b(int n2) {
        this.b = n2;
        return this;
    }

    @Override
    protected final p a() {
        return new f(this, 0);
    }

    static /* synthetic */ int a(h h2) {
        return h2.a;
    }

    static /* synthetic */ int b(h h2) {
        return h2.b;
    }
}

