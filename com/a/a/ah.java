/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;

final class ah
extends ag<T> {
    private /* synthetic */ ag a;

    ah(ag ag2) {
        this.a = ag2;
    }

    @Override
    public final void write(d d2, T t2) {
        if (t2 == null) {
            d2.f();
            return;
        }
        this.a.write(d2, t2);
    }

    @Override
    public final T read(a a2) {
        if (a2.f() == c.i) {
            a2.j();
            return null;
        }
        return this.a.read(a2);
    }
}

