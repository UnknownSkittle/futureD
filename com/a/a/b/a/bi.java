/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ac;
import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;

final class bi
extends ag<Number> {
    bi() {
    }

    private static Number a(a a2) {
        if (a2.f() == c.i) {
            a2.j();
            return null;
        }
        try {
            return (byte)a2.m();
        } catch (NumberFormatException numberFormatException) {
            throw new ac(numberFormatException);
        }
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        return bi.a(a2);
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        d2.a((Number)object);
    }
}

