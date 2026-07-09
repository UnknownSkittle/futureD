/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.a;

import org.bouncycastle.d.b.a.d;
import org.bouncycastle.d.d.a.a;
import org.bouncycastle.d.d.a.b;
import org.bouncycastle.d.d.a.f;
import org.bouncycastle.d.d.a.g;

public final class e
extends d {
    private int a;
    private int b;
    private b c;
    private f d;
    private a e;
    private org.bouncycastle.d.d.a.e f;
    private org.bouncycastle.d.d.a.e g;
    private a h;
    private f[] i;

    public e(int n2, int n3, b b2, f f2, org.bouncycastle.d.d.a.e e2, org.bouncycastle.d.d.a.e e3, a a2) {
        super(true);
        this.b = n3;
        this.a = n2;
        this.c = b2;
        this.d = f2;
        this.e = a2;
        this.f = e2;
        this.g = e3;
        this.h = org.bouncycastle.asn1.util.a.a(b2, f2);
        g g2 = new g(b2, f2);
        this.i = g2.a();
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final b d() {
        return this.c;
    }

    public final f e() {
        return this.d;
    }

    public final a f() {
        return this.e;
    }

    public final org.bouncycastle.d.d.a.e g() {
        return this.f;
    }

    public final org.bouncycastle.d.d.a.e h() {
        return this.g;
    }
}

