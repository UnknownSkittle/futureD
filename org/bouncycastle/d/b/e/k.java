/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.d.b.e.l;
import org.bouncycastle.d.b.e.p;

final class k
extends p {
    private final int a;
    private final int b;
    private final int c;

    private k(l l2) {
        super(l2);
        this.a = l.a(l2);
        this.b = l.b(l2);
        this.c = l.c(l2);
    }

    protected final byte[] a() {
        byte[] byArray = super.a();
        ab.a(this.a, byArray, 16);
        ab.a(this.b, byArray, 20);
        ab.a(this.c, byArray, 24);
        return byArray;
    }

    protected final int b() {
        return this.a;
    }

    protected final int c() {
        return this.b;
    }

    protected final int d() {
        return this.c;
    }

    /* synthetic */ k(l l2, byte by2) {
        this(l2);
    }
}

