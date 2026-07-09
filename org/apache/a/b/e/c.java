/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.e;

import com.a.a.b.ai;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.a.b.c.l;
import org.apache.a.b.e.a;
import org.apache.a.e;
import org.apache.a.f.f;
import org.apache.a.f.k;
import org.apache.a.m.d;
import org.apache.a.n;
import org.apache.a.q;
import org.apache.a.r;

public final class c
implements r {
    private final org.apache.commons.c.a a = org.apache.commons.c.c.b(this.getClass());

    @Override
    public final void a(q q2, d d2) {
        Object object;
        ai.a(q2, "HTTP request");
        ai.a(d2, "HTTP context");
        if (q2.g().a().equalsIgnoreCase("CONNECT")) {
            return;
        }
        Object object2 = org.apache.a.b.e.a.a(d2);
        Object object3 = ((a)object2).b();
        if (object3 == null) {
            this.a.a("Cookie store not specified in HTTP context");
            return;
        }
        org.apache.a.d.c<k> c2 = ((a)object2).c();
        if (c2 == null) {
            this.a.a("CookieSpec registry not specified in HTTP context");
            return;
        }
        n n2 = ((org.apache.a.m.e)object2).k();
        if (n2 == null) {
            this.a.a("Target host not set in the context");
            return;
        }
        Object object4 = ((a)object2).a();
        if (object4 == null) {
            this.a.a("Connection route not set in the context");
            return;
        }
        if ((object2 = ((a)object2).i().e()) == null) {
            object2 = "default";
        }
        if (this.a.a()) {
            this.a.a("CookieSpec selected: ".concat(String.valueOf(object2)));
        }
        Object object5 = null;
        if (q2 instanceof l) {
            object5 = ((l)q2).i();
        } else {
            try {
                object5 = new URI(q2.g().c());
            } catch (URISyntaxException uRISyntaxException) {}
        }
        object5 = object5 != null ? ((URI)object5).getPath() : null;
        String string = n2.a();
        int n3 = n2.b();
        if (n3 < 0) {
            n3 = object4.a().b();
        }
        f f2 = new f(string, n3 >= 0 ? n3 : 0, (String)(!ai.a((CharSequence)object5) ? object5 : "/"), object4.h());
        if ((c2 = c2.a((String)object2)) == null) {
            if (this.a.a()) {
                this.a.a("Unsupported cookie policy: ".concat(String.valueOf(object2)));
            }
            return;
        }
        object2 = c2.a();
        c2 = object3.a();
        object4 = new ArrayList();
        object5 = new Date();
        boolean bl2 = false;
        c2 = c2.iterator();
        while (c2.hasNext()) {
            object = (org.apache.a.f.c)c2.next();
            if (!object.a((Date)object5)) {
                if (!object2.b((org.apache.a.f.c)object, f2)) continue;
                if (this.a.a()) {
                    this.a.a("Cookie " + object + " match " + f2);
                }
                object4.add(object);
                continue;
            }
            if (this.a.a()) {
                this.a.a("Cookie " + object + " expired");
            }
            bl2 = true;
        }
        if (bl2) {
            object3.a((Date)object5);
        }
        if (!object4.isEmpty()) {
            object = object2.a((List<org.apache.a.f.c>)object4).iterator();
            while (object.hasNext()) {
                object3 = (e)object.next();
                q2.a((e)object3);
            }
        }
        if (object2.a() > 0 && (object = object2.b()) != null) {
            q2.a((e)object);
        }
        d2.a("http.cookie-spec", object2);
        d2.a("http.cookie-origin", f2);
    }
}

