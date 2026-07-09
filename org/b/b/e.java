/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.b.b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.b.a.a;
import org.b.a.c;
import org.b.a.d;
import org.b.b.b;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class e
implements org.b.b {
    private final String a;
    private volatile org.b.b b;
    private Boolean c;
    private Method d;
    private a e;
    private Queue<d> f;
    private final boolean g;

    public e(String string, Queue<d> queue, boolean bl2) {
        this.a = string;
        this.f = queue;
        this.g = bl2;
    }

    @Override
    public final String a() {
        return this.a;
    }

    @Override
    public final boolean b() {
        return this.i().b();
    }

    @Override
    public final void a(String string) {
        this.i().a(string);
    }

    @Override
    public final void a(String string, Throwable throwable) {
        this.i().a(string, throwable);
    }

    @Override
    public final boolean c() {
        return this.i().c();
    }

    @Override
    public final void b(String string) {
        this.i().b(string);
    }

    @Override
    public final boolean d() {
        return this.i().d();
    }

    @Override
    public final void c(String string) {
        this.i().c(string);
    }

    @Override
    public final void b(String string, Throwable throwable) {
        this.i().b(string, throwable);
    }

    @Override
    public final boolean e() {
        return this.i().e();
    }

    @Override
    public final void d(String string) {
        this.i().d(string);
    }

    @Override
    public final void c(String string, Throwable throwable) {
        this.i().c(string, throwable);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        object = (e)object;
        return this.a.equals(((e)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    private org.b.b i() {
        if (this.b != null) {
            return this.b;
        }
        if (this.g) {
            return org.b.b.b.a;
        }
        return this.j();
    }

    private org.b.b j() {
        if (this.e == null) {
            e e2 = this;
            this.e = new a(e2, e2.f);
        }
        return this.e;
    }

    public final void a(org.b.b b2) {
        this.b = b2;
    }

    public final boolean f() {
        if (this.c != null) {
            return this.c;
        }
        try {
            this.d = this.b.getClass().getMethod("log", c.class);
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException noSuchMethodException) {
            this.c = Boolean.FALSE;
        }
        return this.c;
    }

    public final void a(c c2) {
        if (this.f()) {
            try {
                this.d.invoke((Object)this.b, c2);
                return;
            } catch (IllegalAccessException illegalAccessException) {
                return;
            } catch (IllegalArgumentException illegalArgumentException) {
                return;
            } catch (InvocationTargetException invocationTargetException) {}
        }
    }

    public final boolean g() {
        return this.b == null;
    }

    public final boolean h() {
        return this.b instanceof b;
    }
}

