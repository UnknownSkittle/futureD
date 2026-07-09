/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.d.a;

import java.util.ArrayList;
import java.util.List;
import org.a.b.q;
import org.a.c.b;
import org.a.d.a.a;
import org.a.d.a.c;
import org.a.d.a.d;
import org.a.d.a.f;
import org.a.d.a.g;
import org.a.d.a.h;

public final class e
implements d {
    private final String a;
    private final boolean b;
    private final boolean c;
    private final List<b> d;
    private final List<d> e;

    private e(f f2) {
        this.a = f.a(f2);
        this.b = false;
        this.c = false;
        this.d = new ArrayList<b>(f.b(f2));
        this.e = new ArrayList<d>(f.c(f2).size() + 1);
        this.e.addAll(f.c(f2));
        this.e.add(this);
    }

    public final void a(q q2, Appendable appendable) {
        new g(this, new h(appendable), 0).a(q2);
    }

    /* synthetic */ e(f f2, byte by2) {
        this(f2);
    }

    static /* synthetic */ List a(e e2) {
        return e2.d;
    }

    static /* synthetic */ List b(e e2) {
        return e2.e;
    }

    static /* synthetic */ String c(e e2) {
        return e2.a;
    }

    @Override
    public final org.a.d.a a(c c2) {
        return new a(c2);
    }
}

