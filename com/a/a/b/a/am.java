/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;

final class am
extends ag<StringBuilder> {
    am() {
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        if (a2.f() == c.i) {
            a2.j();
            return null;
        }
        return new StringBuilder(a2.h());
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        d2.b((object = (StringBuilder)object) == null ? null : ((StringBuilder)object).toString());
    }
}

