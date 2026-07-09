/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a.a;

import org.a.b.f;
import org.a.b.q;
import org.a.b.u;
import org.a.b.v;
import org.a.c.b.a;

public abstract class b
implements a {
    private final char a;

    protected b(char c2) {
        this.a = c2;
    }

    @Override
    public final char a() {
        return this.a;
    }

    @Override
    public final char b() {
        return this.a;
    }

    @Override
    public final int c() {
        return 1;
    }

    @Override
    public final int a(org.a.c.b.b b2, org.a.c.b.b b3) {
        if ((b2.b() || b3.a()) && (b2.d() + b3.d()) % 3 == 0) {
            return 0;
        }
        if (b2.c() >= 2 && b3.c() >= 2) {
            return 2;
        }
        return 1;
    }

    @Override
    public final void a(v v2, v v3, int n2) {
        Object object = String.valueOf(this.a);
        q q2 = n2 == 1 ? new f((String)object) : new u((String)object + (String)object);
        object = v2.h();
        while (object != null && object != v3) {
            q q3 = ((q)object).h();
            q2.b((q)object);
            object = q3;
        }
        v2.c(q2);
    }
}

