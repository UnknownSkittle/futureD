/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.b;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.crypto.b.c;
import org.bouncycastle.e.f;

public final class h
extends c {
    public h() {
    }

    private h(h h2) {
        super(h2);
    }

    public final String a() {
        return "SHA-384";
    }

    public final int b() {
        return 48;
    }

    public final int a(byte[] byArray, int n2) {
        this.e();
        ab.a(this.a, byArray, n2);
        ab.a(this.b, byArray, n2 + 8);
        ab.a(this.c, byArray, n2 + 16);
        ab.a(this.d, byArray, n2 + 24);
        ab.a(this.e, byArray, n2 + 32);
        ab.a(this.f, byArray, n2 + 40);
        this.c();
        return 48;
    }

    public final void c() {
        super.c();
        this.a = -3766243637369397544L;
        this.b = 7105036623409894663L;
        this.c = -7973340178411365097L;
        this.d = 1526699215303891257L;
        this.e = 7436329637833083697L;
        this.f = -8163818279084223215L;
        this.g = -2662702644619276377L;
        this.h = 5167115440072839076L;
    }

    public final f g() {
        return new h(this);
    }

    public final void a(f f2) {
        f2 = (h)f2;
        super.a((c)f2);
    }
}

