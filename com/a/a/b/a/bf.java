/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ac;
import com.a.a.ag;
import com.a.a.b.a.be;
import com.a.a.d.a;
import com.a.a.d.d;

final class bf
extends ag<T1> {
    private /* synthetic */ Class a;
    private /* synthetic */ be b;

    bf(be be2, Class clazz) {
        this.b = be2;
        this.a = clazz;
    }

    @Override
    public final void write(d d2, T1 T1) {
        this.b.a.write(d2, T1);
    }

    @Override
    public final T1 read(a a2) {
        if ((a2 = this.b.a.read(a2)) != null && !this.a.isInstance(a2)) {
            throw new ac("Expected a " + this.a.getName() + " but was " + a2.getClass().getName());
        }
        return a2;
    }
}

