/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.d;

final class q<T>
extends ag<T> {
    private ag<T> a;

    q() {
    }

    public final void a(ag<T> ag2) {
        if (this.a != null) {
            throw new AssertionError();
        }
        this.a = ag2;
    }

    @Override
    public final T read(a a2) {
        if (this.a == null) {
            throw new IllegalStateException();
        }
        return this.a.read(a2);
    }

    @Override
    public final void write(d d2, T t2) {
        if (this.a == null) {
            throw new IllegalStateException();
        }
        this.a.write(d2, t2);
    }
}

