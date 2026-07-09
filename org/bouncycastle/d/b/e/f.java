/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.d.b.e.h;
import org.bouncycastle.d.b.e.p;

final class f
extends p {
    private final int a;
    private final int b;
    private final int c;

    private f(h h2) {
        super(h2);
        this.a = 0;
        this.b = h.a(h2);
        this.c = h.b(h2);
    }

    protected final byte[] a() {
        byte[] byArray = super.a();
        ab.a(0, byArray, 16);
        ab.a(this.b, byArray, 20);
        ab.a(this.c, byArray, 24);
        return byArray;
    }

    protected final int b() {
        return this.b;
    }

    protected final int c() {
        return this.c;
    }

    /* synthetic */ f(h h2, byte by2) {
        this(h2);
    }
}

