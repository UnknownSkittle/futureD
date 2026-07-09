/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSession;
import org.apache.a.h.c.b;
import org.apache.a.h.c.d;
import org.apache.a.i;
import org.apache.a.l;
import org.apache.a.q;
import org.apache.a.s;

class c
implements org.apache.a.e.l,
org.apache.a.m.d {
    private volatile b a;

    private c(b b2) {
        this.a = b2;
    }

    private org.apache.a.e.l j() {
        b b2 = this.a;
        if (b2 == null) {
            return null;
        }
        return (org.apache.a.e.l)b2.h();
    }

    private org.apache.a.e.l k() {
        org.apache.a.e.l l2 = this.j();
        if (l2 == null) {
            throw new d();
        }
        return l2;
    }

    @Override
    public void close() {
        b b2 = this.a;
        if (b2 != null) {
            b2.c();
        }
    }

    @Override
    public final void e() {
        b b2 = this.a;
        if (b2 != null) {
            ((i)b2.h()).e();
        }
    }

    @Override
    public final boolean c() {
        b b2 = this.a;
        if (b2 != null) {
            return !b2.d();
        }
        return false;
    }

    @Override
    public final boolean d() {
        org.apache.a.e.l l2 = this.j();
        if (l2 != null) {
            return l2.d();
        }
        return true;
    }

    @Override
    public final void b(int n2) {
        this.k().b(n2);
    }

    @Override
    public final void a(Socket socket) {
        this.k().a(socket);
    }

    @Override
    public final Socket h() {
        return this.k().h();
    }

    @Override
    public final SSLSession i() {
        return this.k().i();
    }

    @Override
    public final boolean a(int n2) {
        return this.k().a(n2);
    }

    @Override
    public final void a(q q2) {
        this.k().a(q2);
    }

    @Override
    public final void a(l l2) {
        this.k().a(l2);
    }

    @Override
    public final s a() {
        return this.k().a();
    }

    @Override
    public final void a(s s2) {
        this.k().a(s2);
    }

    @Override
    public final void b() {
        this.k().b();
    }

    @Override
    public final InetAddress f() {
        return this.k().f();
    }

    @Override
    public final int g() {
        return this.k().g();
    }

    @Override
    public final Object a(String string) {
        org.apache.a.e.l l2 = this.k();
        if (l2 instanceof org.apache.a.m.d) {
            return ((org.apache.a.m.d)((Object)l2)).a(string);
        }
        return null;
    }

    @Override
    public final void a(String string, Object object) {
        org.apache.a.e.l l2 = this.k();
        if (l2 instanceof org.apache.a.m.d) {
            ((org.apache.a.m.d)((Object)l2)).a(string, object);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CPoolProxy{");
        org.apache.a.e.l l2 = this.j();
        if (l2 != null) {
            stringBuilder.append(l2);
        } else {
            stringBuilder.append("detached");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static i a(b b2) {
        return new c(b2);
    }

    private static c c(i i2) {
        if (!c.class.isInstance(i2)) {
            throw new IllegalStateException("Unexpected connection proxy class: " + i2.getClass());
        }
        return (c)c.class.cast(i2);
    }

    public static b a(i object) {
        object = c.c((i)object).a;
        if (object == null) {
            throw new d();
        }
        return object;
    }

    public static b b(i i2) {
        i2 = c.c(i2);
        b b2 = ((c)i2).a;
        ((c)i2).a = null;
        return b2;
    }
}

