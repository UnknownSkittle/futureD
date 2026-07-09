/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.a;

import org.bouncycastle.d.b.a.a;

public final class c
extends a {
    private int a;
    private int b;
    private org.bouncycastle.d.d.a.a c;

    public c(int n2, int n3, org.bouncycastle.d.d.a.a a2, String string) {
        super(false, string);
        this.a = n2;
        this.b = n3;
        this.c = new org.bouncycastle.d.d.a.a(a2);
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    public final org.bouncycastle.d.d.a.a e() {
        return this.c;
    }
}

