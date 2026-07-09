/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.b;

import com.a.a.b.ai;
import com.a.a.r;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import org.apache.a.ab;
import org.apache.a.b.c.f;
import org.apache.a.b.c.g;
import org.apache.a.b.c.l;
import org.apache.a.b.c.m;
import org.apache.a.h.b.p;
import org.apache.a.m.d;
import org.apache.a.n;
import org.apache.a.q;
import org.apache.a.s;
import org.apache.commons.c.a;
import org.apache.commons.c.c;

public final class j
implements org.apache.a.b.j {
    private final a b = org.apache.commons.c.c.b(this.getClass());
    public static final j a = new j();
    private static final String[] c = new String[]{"GET", "HEAD"};

    @Override
    public final boolean a(q object, s object2) {
        ai.a(object, "HTTP request");
        ai.a(object2, "HTTP response");
        int n2 = object2.a().b();
        object = object.g().a();
        object2 = object2.c("location");
        switch (n2) {
            case 302: {
                return j.b((String)object) && object2 != null;
            }
            case 301: 
            case 307: {
                return j.b((String)object);
            }
            case 303: {
                return true;
            }
        }
        return false;
    }

    private URI b(q q2, s object, d d2) {
        Object object2;
        ai.a(q2, "HTTP request");
        ai.a(object, "HTTP response");
        ai.a(d2, "HTTP context");
        org.apache.a.b.e.a a2 = org.apache.a.b.e.a.a(d2);
        Object object3 = object.c("location");
        if (object3 == null) {
            throw new ab("Received redirect response " + object.a() + " but no location header");
        }
        object = object3.d();
        if (this.b.a()) {
            this.b.a("Redirect requested to location '" + (String)object + "'");
        }
        object3 = a2.i();
        object = j.a((String)object);
        try {
            if (!((URI)object).isAbsolute()) {
                if (!((org.apache.a.b.a.a)object3).g()) {
                    throw new ab("Relative redirect location '" + object + "' not allowed");
                }
                object2 = a2.k();
                r.a(object2, "Target host");
                object = org.apache.a.b.f.c.a(org.apache.a.b.f.c.a(new URI(q2.g().c()), (n)object2, false), (URI)object);
            }
        } catch (URISyntaxException uRISyntaxException) {
            throw new ab(uRISyntaxException.getMessage(), uRISyntaxException);
        }
        object2 = (p)a2.a("http.protocol.redirect-locations");
        if (object2 == null) {
            object2 = new p();
            d2.a("http.protocol.redirect-locations", object2);
        }
        if (!((org.apache.a.b.a.a)object3).h() && ((p)object2).a((URI)object)) {
            throw new org.apache.a.b.c("Circular redirect to '" + object + "'");
        }
        ((p)object2).b((URI)object);
        return object;
    }

    private static URI a(String string) {
        try {
            org.apache.a.b.f.c c2 = new org.apache.a.b.f.c(new URI(string).normalize());
            String string2 = c2.b();
            if (string2 != null) {
                c2.a(string2.toLowerCase(Locale.ROOT));
            }
            if (ai.a((CharSequence)c2.c())) {
                c2.b("/");
            }
            return c2.a();
        } catch (URISyntaxException uRISyntaxException) {
            throw new ab("Invalid redirect URI: ".concat(String.valueOf(string)), uRISyntaxException);
        }
    }

    private static boolean b(String string) {
        String[] stringArray = c;
        for (int i2 = 0; i2 < 2; ++i2) {
            if (!stringArray[i2].equalsIgnoreCase(string)) continue;
            return true;
        }
        return false;
    }

    @Override
    public final l a(q q2, s s2, d object) {
        object = this.b(q2, s2, (d)object);
        String string = q2.g().a();
        if (string.equalsIgnoreCase("HEAD")) {
            return new g((URI)object);
        }
        if (string.equalsIgnoreCase("GET")) {
            return new f((URI)object);
        }
        if (s2.a().b() == 307) {
            return m.a(q2).a((URI)object).a();
        }
        return new f((URI)object);
    }
}

