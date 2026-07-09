/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.d.b.e.q;

public abstract class p {
    private final int a;
    private final long b;
    private final int c;
    private final int d;

    protected p(q q2) {
        this.a = q.a(q2);
        this.b = q.b(q2);
        this.c = q.c(q2);
        this.d = q.d(q2);
    }

    protected byte[] a() {
        byte[] byArray = new byte[32];
        ab.a(this.a, byArray, 0);
        ab.a(this.b, byArray, 4);
        ab.a(this.c, byArray, 12);
        ab.a(this.d, byArray, 28);
        return byArray;
    }

    protected final int e() {
        return this.a;
    }

    protected final long f() {
        return this.b;
    }

    public final int g() {
        return this.d;
    }
}

