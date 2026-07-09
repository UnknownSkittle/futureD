/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.d.b.e.ad;
import org.bouncycastle.d.b.e.b;
import org.bouncycastle.d.b.e.r;
import org.bouncycastle.d.b.e.s;
import org.bouncycastle.d.b.e.y;

public final class t {
    private final r a;
    private long b = 0L;
    private byte[] c = null;
    private byte[] d = null;
    private byte[] e = null;
    private byte[] f = null;
    private b g = null;
    private byte[] h = null;
    private y i = null;

    public t(r r2) {
        this.a = r2;
    }

    public final t a(long l2) {
        this.b = l2;
        return this;
    }

    public final t a(byte[] byArray) {
        this.c = ad.a(byArray);
        return this;
    }

    public final t b(byte[] byArray) {
        this.d = ad.a(byArray);
        return this;
    }

    public final t c(byte[] byArray) {
        this.e = ad.a(byArray);
        return this;
    }

    public final t d(byte[] byArray) {
        this.f = ad.a(byArray);
        return this;
    }

    public final t a(b b2) {
        this.g = b2;
        return this;
    }

    public final s a() {
        return new s(this, 0);
    }

    static /* synthetic */ r a(t t2) {
        return t2.a;
    }

    static /* synthetic */ long b(t t2) {
        return t2.b;
    }

    static /* synthetic */ byte[] c(t t2) {
        return t2.c;
    }

    static /* synthetic */ byte[] d(t t2) {
        return t2.d;
    }

    static /* synthetic */ byte[] e(t t2) {
        return t2.e;
    }

    static /* synthetic */ byte[] f(t t2) {
        return t2.f;
    }

    static /* synthetic */ b g(t t2) {
        return t2.g;
    }
}

