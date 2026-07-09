/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.b.a;

import java.util.Queue;
import org.b.a.b;
import org.b.a.d;
import org.b.b.e;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class a
implements org.b.b {
    private String a;
    private e b;
    private Queue<d> c;

    public a(e e2, Queue<d> queue) {
        this.b = e2;
        this.a = e2.a();
        this.c = queue;
    }

    @Override
    public final String a() {
        return this.a;
    }

    private void a(b object, String object2, Throwable object3) {
        Throwable throwable = object3;
        object3 = object2;
        object2 = object;
        object = this;
        d d2 = new d();
        new d().h = System.currentTimeMillis();
        d2.a = object2;
        d2.d = ((a)object).b;
        d2.c = ((a)object).a;
        d2.b = null;
        d2.f = object3;
        d2.g = null;
        d2.i = throwable;
        d2.e = Thread.currentThread().getName();
        ((a)object).c.add(d2);
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void a(String string) {
        this.a(org.b.a.b.e, string, null);
    }

    @Override
    public final void a(String string, Throwable throwable) {
        this.a(org.b.a.b.d, string, throwable);
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final void b(String string) {
        this.a(org.b.a.b.c, string, null);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void c(String string) {
        this.a(org.b.a.b.b, string, null);
    }

    @Override
    public final void b(String string, Throwable throwable) {
        this.a(org.b.a.b.b, string, throwable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void d(String string) {
        this.a(org.b.a.b.a, string, null);
    }

    @Override
    public final void c(String string, Throwable throwable) {
        this.a(org.b.a.b.a, string, throwable);
    }
}

