/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import org.apache.a.ab;
import org.apache.a.af;
import org.apache.a.h.d;
import org.apache.a.h.g.a;
import org.apache.a.j.u;
import org.apache.a.j.v;
import org.apache.a.n.b;
import org.apache.a.p;
import org.apache.a.s;
import org.apache.a.t;
import org.apache.a.z;
import org.apache.commons.c.c;

public final class f
extends a<s> {
    private final org.apache.commons.c.a b = org.apache.commons.c.c.b(this.getClass());
    private final t c;
    private final b d;

    public f(org.apache.a.i.f f2, u u2, t t2) {
        super(f2, u2, null);
        this.c = t2 != null ? t2 : org.apache.a.h.d.a;
        this.d = new b(128);
    }

    @Override
    protected final /* synthetic */ p a(org.apache.a.i.f object) {
        v v2;
        org.apache.a.i.f f2 = object;
        object = this;
        int n2 = 0;
        while (true) {
            ((f)object).d.a();
            int n3 = f2.a(((f)object).d);
            if (n3 == -1 && n2 == 0) {
                throw new z("The target server failed to respond");
            }
            v2 = new v(0, ((f)object).d.length());
            if (((f)object).a.a(((f)object).d, v2)) break;
            if (n3 == -1) {
                throw new ab("The server failed to respond with a valid HTTP response");
            }
            if (((f)object).b.a()) {
                ((f)object).b.a("Garbage in response: " + ((f)object).d.toString());
            }
            ++n2;
        }
        af af2 = ((f)object).a.b(((f)object).d, v2);
        return ((f)object).c.a(af2);
    }
}

