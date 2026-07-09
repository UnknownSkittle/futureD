/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.g;

import org.apache.a.af;
import org.apache.a.h.d;
import org.apache.a.h.g.a;
import org.apache.a.i.f;
import org.apache.a.j.u;
import org.apache.a.j.v;
import org.apache.a.n.b;
import org.apache.a.p;
import org.apache.a.s;
import org.apache.a.t;
import org.apache.a.z;

public final class i
extends a<s> {
    private final t b;
    private final b c;

    public i(f f2, u u2, t t2) {
        super(f2, u2, null);
        this.b = t2 != null ? t2 : d.a;
        this.c = new b(128);
    }

    @Override
    protected final /* synthetic */ p a(f object) {
        Object object2 = object;
        object = this;
        ((i)object).c.a();
        if (object2.a(((i)object).c) == -1) {
            throw new z("The target server failed to respond");
        }
        object2 = new v(0, ((i)object).c.length());
        object2 = ((i)object).a.b(((i)object).c, (v)object2);
        return ((i)object).b.a((af)object2);
    }
}

