/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;

final class n
extends ag<Number> {
    n() {
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        if (a2.f() == c.i) {
            a2.j();
            return null;
        }
        return a2.l();
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        if ((object = (Number)object) == null) {
            d2.f();
            return;
        }
        d2.b(object.toString());
    }
}

