/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.b;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.crypto.b.c;
import org.bouncycastle.e.f;

public final class j
extends c {
    public j() {
    }

    private j(j j2) {
        super(j2);
    }

    public final String a() {
        return "SHA-512";
    }

    public final int b() {
        return 64;
    }

    public final int a(byte[] byArray, int n2) {
        this.e();
        ab.a(this.a, byArray, n2);
        ab.a(this.b, byArray, n2 + 8);
        ab.a(this.c, byArray, n2 + 16);
        ab.a(this.d, byArray, n2 + 24);
        ab.a(this.e, byArray, n2 + 32);
        ab.a(this.f, byArray, n2 + 40);
        ab.a(this.g, byArray, n2 + 48);
        ab.a(this.h, byArray, n2 + 56);
        this.c();
        return 64;
    }

    public final void c() {
        super.c();
        this.a = 7640891576956012808L;
        this.b = -4942790177534073029L;
        this.c = 4354685564936845355L;
        this.d = -6534734903238641935L;
        this.e = 5840696475078001361L;
        this.f = -7276294671716946913L;
        this.g = 2270897969802886507L;
        this.h = 6620516959819538809L;
    }

    public final f g() {
        return new j(this);
    }

    public final void a(f f2) {
        f2 = (j)f2;
        this.a((c)f2);
    }
}

