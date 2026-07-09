/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.d.b.e.i;
import org.bouncycastle.d.b.e.p;
import org.bouncycastle.d.b.e.q;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class j
extends q<j> {
    private int a = 0;
    private int b = 0;
    private int c = 0;

    protected j() {
        super(1);
    }

    protected final j a(int n2) {
        this.a = n2;
        return this;
    }

    protected final j b(int n2) {
        this.b = n2;
        return this;
    }

    protected final j c(int n2) {
        this.c = n2;
        return this;
    }

    @Override
    protected final p a() {
        return new i(this, 0);
    }

    static /* synthetic */ int a(j j2) {
        return j2.a;
    }

    static /* synthetic */ int b(j j2) {
        return j2.b;
    }

    static /* synthetic */ int c(j j2) {
        return j2.c;
    }
}

