/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.c;

import com.a.a.b.ai;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;
import org.apache.a.ac;
import org.apache.a.b.a.a;
import org.apache.a.b.b.f;
import org.apache.a.b.c.i;
import org.apache.a.b.c.l;
import org.apache.a.b.c.n;
import org.apache.a.b.c.o;
import org.apache.a.b.f.d;
import org.apache.a.c;
import org.apache.a.g.e;
import org.apache.a.j.r;
import org.apache.a.k;
import org.apache.a.q;
import org.apache.a.y;

public final class m {
    private String a = null;
    private Charset b = org.apache.a.c.a;
    private ac c;
    private URI d;
    private r e;
    private k f;
    private List<y> g;
    private a h;

    private m() {
    }

    private m(byte by2) {
        this();
    }

    public static m a(q q2) {
        ai.a(q2, "HTTP request");
        return new m(0).b(q2);
    }

    private m b(q q2) {
        if (q2 == null) {
            return this;
        }
        this.a = q2.g().a();
        this.c = q2.g().b();
        if (this.e == null) {
            this.e = new r();
        }
        this.e.a();
        this.e.a(q2.d());
        this.g = null;
        this.f = null;
        if (q2 instanceof org.apache.a.l) {
            Object object = ((org.apache.a.l)q2).b();
            e e2 = org.apache.a.g.e.a((k)object);
            if (e2 != null && e2.a().equals(org.apache.a.g.e.a.a())) {
                try {
                    object = org.apache.a.b.f.d.a((k)object);
                    if (!object.isEmpty()) {
                        this.g = object;
                    }
                } catch (IOException iOException) {}
            } else {
                this.f = object;
            }
        }
        this.d = q2 instanceof l ? ((l)q2).i() : URI.create(q2.g().c());
        this.h = q2 instanceof org.apache.a.b.c.c ? ((org.apache.a.b.c.c)((Object)q2)).c_() : null;
        return this;
    }

    public final m a(URI uRI) {
        this.d = uRI;
        return this;
    }

    public final l a() {
        URI uRI = this.d != null ? this.d : URI.create("/");
        Object object = this.f;
        if (this.g != null && !this.g.isEmpty()) {
            if (object == null && ("POST".equalsIgnoreCase(this.a) || "PUT".equalsIgnoreCase(this.a))) {
                object = new f(this.g, this.b != null ? this.b : org.apache.a.m.c.a);
            } else {
                try {
                    uRI = new org.apache.a.b.f.c(uRI).a(this.b).a(this.g).a();
                } catch (URISyntaxException uRISyntaxException) {}
            }
        }
        if (object == null) {
            object = new o(this.a);
        } else {
            n n2 = new n(this.a);
            n2.a((k)object);
            object = n2;
        }
        ((i)object).a(this.c);
        ((i)object).a(uRI);
        if (this.e != null) {
            ((org.apache.a.j.a)object).a(this.e.b());
        }
        ((i)object).a(this.h);
        return object;
    }
}

