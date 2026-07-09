/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h;

import com.a.a.b.ai;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.a.g.d;
import org.apache.a.h.a;
import org.apache.a.h.g.h;
import org.apache.a.h.g.j;
import org.apache.a.i;
import org.apache.a.i.c;
import org.apache.a.i.e;
import org.apache.a.k;
import org.apache.a.l;
import org.apache.a.p;
import org.apache.a.q;
import org.apache.a.s;

public class b
extends a
implements i {
    private final org.apache.a.i.b<s> a;
    private final org.apache.a.i.d<q> b;

    public b(int n2, d d2, d d3, e<q> h2, c<s> j2) {
        super(n2, d2, d3);
        this.b = (h2 != null ? h2 : h.a).a(this.l());
        this.a = (j2 != null ? j2 : j.a).a(this.k());
    }

    protected void b(s s2) {
    }

    protected void b(q q2) {
    }

    @Override
    public void a(Socket socket) {
        super.a(socket);
    }

    @Override
    public final boolean a(int n2) {
        this.j();
        try {
            return this.c(n2);
        } catch (SocketTimeoutException socketTimeoutException) {
            return false;
        }
    }

    @Override
    public final void a(q q2) {
        ai.a(q2, "HTTP request");
        this.j();
        this.b.b(q2);
        this.b(q2);
        this.n();
    }

    @Override
    public final void a(l object) {
        ai.a(object, "HTTP request");
        this.j();
        k k2 = object.b();
        if (k2 == null) {
            return;
        }
        object = this.a((p)object);
        k2.writeTo((OutputStream)object);
        ((OutputStream)object).close();
    }

    @Override
    public final s a() {
        this.j();
        s s2 = this.a.a();
        this.b(s2);
        if (s2.a().b() >= 200) {
            this.o();
        }
        return s2;
    }

    @Override
    public final void a(s s2) {
        ai.a(s2, "HTTP response");
        this.j();
        k k2 = this.b((p)s2);
        s2.a(k2);
    }

    @Override
    public final void b() {
        this.j();
        this.m();
    }
}

