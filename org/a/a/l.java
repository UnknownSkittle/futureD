/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import org.a.a.c.g;
import org.a.a.k;
import org.a.c.a.b;
import org.a.c.a.c;
import org.a.c.a.d;
import org.a.c.a.e;
import org.a.c.a.f;

public final class l
extends c {
    @Override
    public final d a(f object, e e2) {
        int n2 = object.f();
        if (n2 >= g.a) {
            return null;
        }
        int n3 = object.d();
        if ((object = k.a(object.b(), n3, n2)) != null) {
            return d.a(new b[]{object}).a(n3 + k.a((k)object).d());
        }
        return null;
    }
}

