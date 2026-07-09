/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.ag;
import com.a.a.b.t;
import com.a.a.d.a;
import com.a.a.d.d;
import com.a.a.k;

final class u
extends ag<T> {
    private ag<T> a;
    private /* synthetic */ boolean b;
    private /* synthetic */ boolean c;
    private /* synthetic */ k d;
    private /* synthetic */ com.a.a.c.a e;
    private /* synthetic */ t f;

    u(t t2, boolean bl2, boolean bl3, k k2, com.a.a.c.a a2) {
        this.f = t2;
        this.b = bl2;
        this.c = bl3;
        this.d = k2;
        this.e = a2;
    }

    @Override
    public final T read(a a2) {
        if (this.b) {
            a2.n();
            return null;
        }
        return this.a().read(a2);
    }

    @Override
    public final void write(d d2, T t2) {
        if (this.c) {
            d2.f();
            return;
        }
        this.a().write(d2, t2);
    }

    private ag<T> a() {
        ag ag2 = this.a;
        if (ag2 != null) {
            return ag2;
        }
        this.a = this.d.a(this.f, this.e);
        return this.a;
    }
}

