/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.c;

import java.io.Reader;
import java.util.List;
import org.a.a.i;
import org.a.a.s;
import org.a.b.q;
import org.a.c.b;
import org.a.c.b.a;
import org.a.c.d;

public final class c {
    private final List<org.a.c.a.c> a;
    private final List<a> b;
    private final b c;
    private final List<b> d;

    private c(d d2) {
        this.a = i.a(org.a.c.d.a(d2), org.a.c.d.b(d2));
        this.c = null;
        this.d = org.a.c.d.c(d2);
        this.b = org.a.c.d.d(d2);
        this.a();
    }

    public final q a(Reader iterator) {
        Object object = this.a();
        iterator = new i(this.a, (org.a.c.a)object).a((Reader)((Object)iterator));
        object = iterator;
        iterator = this.d.iterator();
        while (iterator.hasNext()) {
            object = iterator.next().a();
        }
        return object;
    }

    private org.a.c.a a() {
        return new s(this.b);
    }

    /* synthetic */ c(d d2, byte by2) {
        this(d2);
    }
}

