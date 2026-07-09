/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.f;

import com.a.a.b.ai;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import org.apache.a.ab;
import org.apache.a.b.c.e;
import org.apache.a.b.c.j;
import org.apache.a.b.i;
import org.apache.a.e.a.b;
import org.apache.a.e.a.d;
import org.apache.a.h.f.a;
import org.apache.a.h.f.h;
import org.apache.a.l;
import org.apache.a.m;
import org.apache.a.n;
import org.apache.commons.c.c;

public final class f
implements a {
    private final org.apache.commons.c.a a = org.apache.commons.c.c.b(this.getClass());
    private final a b;
    private final org.apache.a.b.j c;
    private final d d;

    public f(a a2, d d2, org.apache.a.b.j j2) {
        ai.a(a2, "HTTP client request executor");
        ai.a(d2, "HTTP route planner");
        ai.a(j2, "HTTP redirect strategy");
        this.b = a2;
        this.d = d2;
        this.c = j2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final org.apache.a.b.c.b a(b object, j j2, org.apache.a.b.e.a a2, e e2) {
        ai.a(object, "HTTP route");
        ai.a(j2, "HTTP request");
        ai.a(a2, "HTTP context");
        Object object2 = a2.a("http.protocol.redirect-locations", List.class);
        if (object2 != null) {
            object2.clear();
        }
        int n2 = ((org.apache.a.b.a.a)(object2 = a2.i())).i() > 0 ? ((org.apache.a.b.a.a)object2).i() : 50;
        org.apache.a.b.c.l l2 = j2;
        int n3 = 0;
        while (true) {
            org.apache.a.b.c.b b2 = this.b.a((b)object, (j)l2, a2, e2);
            try {
                n n4;
                Object object3;
                if (!((org.apache.a.b.a.a)object2).f()) return b2;
                if (!this.c.a(((j)l2).j(), b2)) return b2;
                if (n3 >= n2) {
                    throw new i("Maximum redirects (" + n2 + ") exceeded");
                }
                ++n3;
                if (!(l2 = this.c.a(((j)l2).j(), b2, a2)).e().hasNext()) {
                    object3 = j2.j();
                    l2.a(object3.d());
                }
                if ((l2 = j.a(l2)) instanceof l) {
                    h.a((l)((Object)l2));
                }
                if ((n4 = org.apache.a.b.f.c.a((URI)(object3 = ((j)l2).i()))) == null) {
                    throw new ab("Redirect URI does not specify a valid host name: ".concat(String.valueOf(object3)));
                }
                if (!((b)object).a().equals(n4)) {
                    org.apache.a.a.b b3;
                    object = a2.g();
                    if (object != null) {
                        this.a.a("Resetting target auth state");
                        ((org.apache.a.a.e)object).a();
                    }
                    if ((object = a2.h()) != null && (b3 = ((org.apache.a.a.e)object).c()) != null && b3.c()) {
                        this.a.a("Resetting proxy auth state");
                        ((org.apache.a.a.e)object).a();
                    }
                }
                object = this.d.a(n4, l2, a2);
                if (this.a.a()) {
                    this.a.a("Redirecting to '" + object3 + "' via " + object);
                }
                ai.a(b2.b());
                b2.close();
            } catch (RuntimeException runtimeException) {
                b2.close();
                throw runtimeException;
            } catch (IOException iOException) {
                b2.close();
                throw iOException;
            } catch (m m2) {
                try {
                    ai.a(b2.b());
                    throw m2;
                } catch (IOException iOException) {
                    this.a.a("I/O error while releasing connection", iOException);
                    throw m2;
                } finally {
                    b2.close();
                }
            }
        }
    }
}

