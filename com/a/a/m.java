/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import com.a.a.k;

final class m
extends ag<Number> {
    private /* synthetic */ k a;

    m(k k2) {
        this.a = k2;
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        if (a2.f() == c.i) {
            a2.j();
            return null;
        }
        return Float.valueOf((float)a2.k());
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        if ((object = (Number)object) == null) {
            d2.f();
            return;
        }
        k.a(((Number)object).floatValue());
        d2.a((Number)object);
    }
}

