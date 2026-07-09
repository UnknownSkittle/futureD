/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  com.a.a.b.a.y$com.a.a.b.a.z
 */
package com.a.a.b.a;

import com.a.a.ab;
import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b.a.y;
import com.a.a.d.a;
import com.a.a.d.d;
import com.a.a.k;
import com.a.a.u;
import com.a.a.x;

public final class y<T>
extends ag<T> {
    private final ab<T> a;
    private final u<T> b;
    private k c;
    private final com.a.a.c.a<T> d;
    private final ai e;
    private final z f = new com.a.a.b.a.z(this, 0);
    private ag<T> g;

    public y(ab<T> ab2, u<T> u2, k k2, com.a.a.c.a<T> a2) {
        this.a = ab2;
        this.b = u2;
        this.c = k2;
        this.d = a2;
        this.e = null;
    }

    @Override
    public final T read(a a2) {
        if (this.b == null) {
            return this.a().read(a2);
        }
        if (com.a.a.b.ai.a(a2) instanceof x) {
            return null;
        }
        this.d.getType();
        return this.b.a();
    }

    @Override
    public final void write(d d2, T t2) {
        if (this.a == null) {
            this.a().write(d2, t2);
            return;
        }
        if (t2 == null) {
            d2.f();
            return;
        }
        this.d.getType();
        com.a.a.b.ai.a(this.a.a(), d2);
    }

    private ag<T> a() {
        ag<T> ag2 = this.g;
        if (ag2 != null) {
            return ag2;
        }
        this.g = this.c.a(null, this.d);
        return this.g;
    }
}

