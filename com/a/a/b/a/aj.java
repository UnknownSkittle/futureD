/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;

final class aj
extends ag<String> {
    aj() {
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        c c2 = a2.f();
        if (c2 == c.i) {
            a2.j();
            return null;
        }
        if (c2 == c.h) {
            return Boolean.toString(a2.i());
        }
        return a2.h();
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        d2.b((String)object);
    }
}

