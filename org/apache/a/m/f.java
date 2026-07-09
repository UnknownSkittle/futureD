/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.m;

import org.apache.a.m.b;
import org.apache.a.m.h;
import org.apache.a.r;
import org.apache.a.u;

public final class f {
    private b<r> a;
    private b<u> b;

    public static f a() {
        return new f();
    }

    f() {
    }

    private b<r> c() {
        if (this.a == null) {
            this.a = new b();
        }
        return this.a;
    }

    public final f a(r object) {
        r r2 = object;
        object = this;
        ((f)object).c().a(r2);
        return object;
    }

    public final f a(r ... rArray) {
        this.c().a((r[])rArray);
        return this;
    }

    public final f a(u object) {
        u u2 = object;
        object = this;
        f f2 = object;
        if (((f)object).b == null) {
            f2.b = new b();
        }
        f2.b.a(u2);
        return object;
    }

    public final r b() {
        return new h(this.a != null ? this.a.a() : null, this.b != null ? this.b.a() : null);
    }
}

