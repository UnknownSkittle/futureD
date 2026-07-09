/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.g;

import com.a.a.b.ai;
import org.apache.a.e;
import org.apache.a.i.d;
import org.apache.a.i.g;
import org.apache.a.j.j;
import org.apache.a.j.t;
import org.apache.a.p;

public abstract class b<T extends p>
implements d<T> {
    protected final g a;
    protected final org.apache.a.n.b b;
    protected final t c;

    public b(g g2, t t2) {
        this.a = ai.a(g2, "Session input buffer");
        this.c = t2 != null ? t2 : j.a;
        this.b = new org.apache.a.n.b(128);
    }

    protected abstract void a(T var1);

    @Override
    public final void b(T object) {
        ai.a(object, "HTTP message");
        this.a(object);
        object = object.e();
        while (object.hasNext()) {
            e e2 = object.a();
            this.a.a(this.c.a(this.b, e2));
        }
        this.b.a();
        this.a.a(this.b);
    }
}

