/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ac;
import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;

final class ai
extends ag<Character> {
    ai() {
    }

    @Override
    public final /* synthetic */ Object read(a object) {
        if (((a)object).f() == c.i) {
            ((a)object).j();
            return null;
        }
        if (((String)(object = ((a)object).h())).length() != 1) {
            throw new ac("Expecting character, got: ".concat(String.valueOf(object)));
        }
        return Character.valueOf(((String)object).charAt(0));
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        d2.b((object = (Character)object) == null ? null : String.valueOf(object));
    }
}

