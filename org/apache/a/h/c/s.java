/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import org.apache.a.d.a;
import org.apache.a.e.a.b;
import org.apache.a.e.j;
import org.apache.a.e.l;
import org.apache.a.h.c.o;
import org.apache.a.h.c.r;
import org.apache.a.l.d;

final class s
implements d<b, l> {
    private final r a;
    private final j<b, l> b;

    s(r r2) {
        this.a = r2 != null ? r2 : new r();
        this.b = o.a;
    }

    @Override
    public final /* synthetic */ Object a(Object object) {
        b b2 = (b)object;
        object = this;
        a a2 = null;
        if (b2.e() != null) {
            a2 = ((s)object).a.b(b2.e());
        }
        if (a2 == null) {
            a2 = ((s)object).a.b(b2.a());
        }
        if (a2 == null) {
            a2 = ((s)object).a.b();
        }
        if (a2 == null) {
            a2 = org.apache.a.d.a.a;
        }
        return ((s)object).b.a(a2);
    }
}

