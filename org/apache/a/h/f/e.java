/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.f;

import com.a.a.b.ai;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.a.a.d;
import org.apache.a.a.p;
import org.apache.a.ab;
import org.apache.a.b.c.j;
import org.apache.a.b.c.l;
import org.apache.a.e.a.b;
import org.apache.a.h.f.a;
import org.apache.a.m;
import org.apache.a.n;
import org.apache.a.r;
import org.apache.a.s;
import org.apache.commons.c.c;

public final class e
implements a {
    private final org.apache.commons.c.a a = org.apache.commons.c.c.b(this.getClass());
    private final a b;
    private final r c;

    public e(a a2, r r2) {
        ai.a(a2, "HTTP client request executor");
        ai.a(r2, "HTTP protocol processor");
        this.b = a2;
        this.c = r2;
    }

    @Override
    public final org.apache.a.b.c.b a(b b2, j j2, org.apache.a.b.e.a a2, org.apache.a.b.c.e e2) {
        Object object;
        Object object2;
        block21: {
            ai.a(b2, "HTTP route");
            ai.a(j2, "HTTP request");
            ai.a(a2, "HTTP context");
            object2 = j2.j();
            object = null;
            if (object2 instanceof l) {
                object = ((l)object2).i();
            } else {
                object2 = object2.g().c();
                try {
                    object = URI.create((String)object2);
                } catch (IllegalArgumentException illegalArgumentException) {
                    if (!this.a.a()) break block21;
                    this.a.a("Unable to parse '" + (String)object2 + "' as a valid URI; request URI and Host header may be inconsistent", illegalArgumentException);
                }
            }
        }
        j2.a((URI)object);
        Object object3 = b2;
        Object object4 = j2;
        object2 = ((j)object4).i();
        if (object2 != null) {
            try {
                ((j)object4).a(org.apache.a.b.f.c.a((URI)object2, (org.apache.a.e.a.e)object3));
            } catch (URISyntaxException uRISyntaxException) {
                throw new ab("Invalid URI: ".concat(String.valueOf(object2)), uRISyntaxException);
            }
        }
        if ((object4 = (n)j2.f().a("http.virtual-host")) != null && ((n)object4).b() == -1) {
            int n2 = b2.a().b();
            if (n2 != -1) {
                object4 = new n(((n)object4).a(), n2, ((n)object4).c());
            }
            if (this.a.a()) {
                this.a.a("Using virtual host".concat(String.valueOf(object4)));
            }
        }
        Object object5 = null;
        if (object4 != null) {
            object5 = object4;
        } else if (object != null && ((URI)object).isAbsolute() && ((URI)object).getHost() != null) {
            object5 = new n(((URI)object).getHost(), ((URI)object).getPort(), ((URI)object).getScheme());
        }
        if (object5 == null) {
            object5 = j2.k();
        }
        if (object5 == null) {
            object5 = b2.a();
        }
        if (object != null && (object = ((URI)object).getUserInfo()) != null) {
            object4 = a2.e();
            if (object4 == null) {
                object3 = object4 = new org.apache.a.h.b.d();
                a2.a("http.auth.credentials-provider", object3);
            }
            object4.a(new d((n)object5), new p((String)object));
        }
        a2.a("http.target_host", object5);
        a2.a("http.route", b2);
        a2.a("http.request", j2);
        this.c.a(j2, (org.apache.a.m.d)a2);
        object = this.b.a(b2, j2, a2, e2);
        try {
            a2.a("http.response", object);
            this.c.a((s)object, (org.apache.a.m.d)a2);
            return object;
        } catch (RuntimeException runtimeException) {
            object.close();
            throw runtimeException;
        } catch (IOException iOException) {
            object.close();
            throw iOException;
        } catch (m m2) {
            object.close();
            throw m2;
        }
    }
}

