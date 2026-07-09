/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ac;
import com.a.a.ag;
import com.a.a.b.a.t;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import java.util.Map;

public final class s<T>
extends ag<T> {
    private final com.a.a.b.ag<T> a;
    private final Map<String, t> b;

    s(com.a.a.b.ag<T> ag2, Map<String, t> map) {
        this.a = ag2;
        this.b = map;
    }

    @Override
    public final T read(a a2) {
        if (a2.f() == c.i) {
            a2.j();
            return null;
        }
        T t2 = this.a.a();
        try {
            a2.c();
            while (a2.e()) {
                Object object = a2.g();
                if ((object = this.b.get(object)) == null || !((t)object).c) {
                    a2.n();
                    continue;
                }
                ((t)object).a(a2, t2);
            }
        } catch (IllegalStateException illegalStateException) {
            throw new ac(illegalStateException);
        } catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError((Object)illegalAccessException);
        }
        a2.d();
        return t2;
    }

    @Override
    public final void write(d d2, T t2) {
        if (t2 == null) {
            d2.f();
            return;
        }
        d2.d();
        try {
            for (t t3 : this.b.values()) {
                if (!t3.a(t2)) continue;
                d2.a(t3.a);
                t3.a(d2, t2);
            }
        } catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError((Object)illegalAccessException);
        }
        d2.e();
    }
}

