/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.b;

import com.a.a.b.ai;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Collection;
import java.util.List;
import org.apache.a.b.c.j;
import org.apache.a.b.f;
import org.apache.a.e.a.b;
import org.apache.a.e.a.d;
import org.apache.a.e.h;
import org.apache.a.f.k;
import org.apache.a.h.b.e;
import org.apache.a.m;
import org.apache.a.q;
import org.apache.commons.c.a;
import org.apache.commons.c.c;

final class n
extends e
implements org.apache.a.b.c.c {
    private final a a = org.apache.commons.c.c.b(this.getClass());
    private final org.apache.a.h.f.a b;
    private final h c;
    private final d d;
    private final org.apache.a.d.c<k> e;
    private final org.apache.a.d.c<org.apache.a.a.c> f;
    private final org.apache.a.b.e g;
    private final f h;
    private final org.apache.a.b.a.a i;
    private final List<Closeable> j;

    public n(org.apache.a.h.f.a a2, h h2, d d2, org.apache.a.d.c<k> c2, org.apache.a.d.c<org.apache.a.a.c> c3, org.apache.a.b.e e2, f f2, org.apache.a.b.a.a a3, List<Closeable> list) {
        ai.a(a2, "HTTP client exec chain");
        ai.a(h2, "HTTP connection manager");
        ai.a(d2, "HTTP route planner");
        this.b = a2;
        this.c = h2;
        this.d = d2;
        this.e = c2;
        this.f = c3;
        this.g = e2;
        this.h = f2;
        this.i = a3;
        this.j = list;
    }

    @Override
    protected final org.apache.a.b.c.b a(org.apache.a.n object, q object2) {
        ai.a(object2, "HTTP request");
        org.apache.a.b.c.e e2 = null;
        if (object2 instanceof org.apache.a.b.c.e) {
            e2 = (org.apache.a.b.c.e)object2;
        }
        try {
            Object object3;
            j j2 = org.apache.a.b.c.j.a((q)object2, (org.apache.a.n)object);
            org.apache.a.b.e.a a2 = org.apache.a.b.e.a.a(new org.apache.a.m.a());
            Object object4 = null;
            if (object2 instanceof org.apache.a.b.c.c) {
                object4 = ((org.apache.a.b.c.c)object2).c_();
            }
            if (!(object4 != null || (object2 = object2.f()) instanceof org.apache.a.k.d && ((org.apache.a.k.d)object2).a().isEmpty())) {
                object4 = this.i;
                object4 = org.apache.a.b.a.a.a((org.apache.a.b.a.a)object4).d(object2.a("http.socket.timeout", ((org.apache.a.b.a.a)object4).o())).b(object2.a("http.connection.stalecheck", ((org.apache.a.b.a.a)object4).d())).c(object2.a("http.connection.timeout", ((org.apache.a.b.a.a)object4).n())).a(object2.a("http.protocol.expect-continue", ((org.apache.a.b.a.a)object4).a())).f(object2.a("http.protocol.handle-authentication", ((org.apache.a.b.a.a)object4).j())).e(object2.a("http.protocol.allow-circular-redirects", ((org.apache.a.b.a.a)object4).h())).b((int)object2.a("http.conn-manager.timeout", (long)((org.apache.a.b.a.a)object4).m())).a(object2.a("http.protocol.max-redirects", ((org.apache.a.b.a.a)object4).i())).c(object2.a("http.protocol.handle-redirects", ((org.apache.a.b.a.a)object4).f())).d(!object2.a("http.protocol.reject-relative-redirect", !((org.apache.a.b.a.a)object4).g()));
                object3 = (org.apache.a.n)object2.a("http.route.default-proxy");
                if (object3 != null) {
                    ((org.apache.a.b.a.b)object4).a((org.apache.a.n)object3);
                }
                if ((object3 = (InetAddress)object2.a("http.route.local-address")) != null) {
                    ((org.apache.a.b.a.b)object4).a((InetAddress)object3);
                }
                if ((object3 = (Collection)object2.a("http.auth.target-scheme-pref")) != null) {
                    ((org.apache.a.b.a.b)object4).a((Collection<String>)object3);
                }
                if ((object3 = (Collection)object2.a("http.auth.proxy-scheme-pref")) != null) {
                    ((org.apache.a.b.a.b)object4).b((Collection<String>)object3);
                }
                if ((object2 = (String)object2.a("http.protocol.cookie-policy")) != null) {
                    ((org.apache.a.b.a.b)object4).a((String)object2);
                }
                object4 = ((org.apache.a.b.a.b)object4).a();
            }
            if (object4 != null) {
                a2.a("http.request-config", object4);
            }
            object4 = a2;
            object2 = this;
            if (((org.apache.a.m.e)object4).a("http.auth.target-scope") == null) {
                ((org.apache.a.m.e)object4).a("http.auth.target-scope", new org.apache.a.a.e());
            }
            if (((org.apache.a.m.e)object4).a("http.auth.proxy-scope") == null) {
                ((org.apache.a.m.e)object4).a("http.auth.proxy-scope", new org.apache.a.a.e());
            }
            if (((org.apache.a.m.e)object4).a("http.authscheme-registry") == null) {
                ((org.apache.a.m.e)object4).a("http.authscheme-registry", ((n)object2).f);
            }
            if (((org.apache.a.m.e)object4).a("http.cookiespec-registry") == null) {
                ((org.apache.a.m.e)object4).a("http.cookiespec-registry", ((n)object2).e);
            }
            if (((org.apache.a.m.e)object4).a("http.cookie-store") == null) {
                ((org.apache.a.m.e)object4).a("http.cookie-store", ((n)object2).g);
            }
            if (((org.apache.a.m.e)object4).a("http.auth.credentials-provider") == null) {
                ((org.apache.a.m.e)object4).a("http.auth.credentials-provider", ((n)object2).h);
            }
            if (((org.apache.a.m.e)object4).a("http.request-config") == null) {
                ((org.apache.a.m.e)object4).a("http.request-config", ((n)object2).i);
            }
            org.apache.a.n n2 = object;
            object3 = a2;
            object = j2;
            object4 = n2;
            object2 = this;
            if (object4 == null) {
                object4 = (org.apache.a.n)object.f().a("http.default-host");
            }
            object2 = ((n)object2).d.a((org.apache.a.n)object4, (q)object, (org.apache.a.m.d)object3);
            return this.b.a((b)object2, j2, a2, e2);
        } catch (m m2) {
            throw new org.apache.a.b.d(m2);
        }
    }

    @Override
    public final org.apache.a.b.a.a c_() {
        return this.i;
    }

    @Override
    public final void close() {
        if (this.j != null) {
            for (Closeable closeable : this.j) {
                try {
                    closeable.close();
                } catch (IOException iOException) {
                    this.a.c(iOException.getMessage(), iOException);
                }
            }
        }
    }
}

