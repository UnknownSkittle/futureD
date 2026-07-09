/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.d.b.e.j;
import org.bouncycastle.d.b.e.p;

final class i
extends p {
    private final int a;
    private final int b;
    private final int c;

    private i(j j2) {
        super(j2);
        this.a = j.a(j2);
        this.b = j.b(j2);
        this.c = j.c(j2);
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

    /* synthetic */ i(j j2, byte by2) {
        this(j2);
    }
}

