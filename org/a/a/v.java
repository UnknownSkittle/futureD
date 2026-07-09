/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import org.a.a.c.g;
import org.a.a.u;
import org.a.a.w;
import org.a.a.y;
import org.a.b.o;
import org.a.c.a.b;
import org.a.c.a.c;
import org.a.c.a.d;
import org.a.c.a.e;
import org.a.c.a.f;

public final class v
extends c {
    @Override
    public final d a(f object, e e2) {
        b b2 = e2.a();
        if (object.f() >= g.a && !(b2 instanceof u)) {
            return null;
        }
        int n2 = object.d();
        int n3 = object.e() + object.f();
        boolean bl2 = e2.b() != null;
        w w2 = u.a(object.b(), n2, n3, bl2);
        if (w2 == null) {
            return null;
        }
        n2 = w2.b;
        object = new y(n2 - object.e());
        if (!(b2 instanceof u) || !u.a((o)b2.b(), w2.a)) {
            b2 = new u(w2.a);
            w2.a.a(true);
            return d.a(new b[]{b2, object}).b(n2);
        }
        return d.a(new b[]{object}).b(n2);
    }
}

