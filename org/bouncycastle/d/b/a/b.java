/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.a;

import org.bouncycastle.d.b.a.a;
import org.bouncycastle.d.d.a.e;
import org.bouncycastle.d.d.a.f;
import org.bouncycastle.d.d.a.g;

public final class b
extends a {
    private int a;
    private int b;
    private org.bouncycastle.d.d.a.b c;
    private f d;
    private e e;
    private org.bouncycastle.d.d.a.a f;
    private f[] g;

    public b(int n2, int n3, org.bouncycastle.d.d.a.b b2, f f2, e e2, String string) {
        this(n2, n3, b2, f2, org.bouncycastle.asn1.util.a.a(b2, f2), e2, string);
    }

    private b(int n2, int n3, org.bouncycastle.d.d.a.b b2, f f2, org.bouncycastle.d.d.a.a a2, e e2, String string) {
        super(true, string);
        this.a = n2;
        this.b = n3;
        this.c = b2;
        this.d = f2;
        this.f = a2;
        this.e = e2;
        g g2 = new g(b2, f2);
        this.g = g2.a();
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    public final org.bouncycastle.d.d.a.b e() {
        return this.c;
    }

    public final f f() {
        return this.d;
    }

    public final e g() {
        return this.e;
    }

    public final org.bouncycastle.d.d.a.a h() {
        return this.f;
    }
}

