/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ac;
import com.a.a.ag;
import com.a.a.b.x;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;

final class ah
extends ag<Number> {
    ah() {
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        c c2 = a2.f();
        switch (c2) {
            case i: {
                a2.j();
                return null;
            }
            case g: 
            case f: {
                return new x(a2.h());
            }
        }
        throw new ac("Expecting number, got: ".concat(String.valueOf((Object)c2)));
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        d2.a((Number)object);
    }
}

