/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.a;

import com.a.a.r;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.a.a.a;
import org.apache.a.a.b;
import org.apache.a.a.j;
import org.apache.a.a.m;
import org.apache.a.e;
import org.apache.a.h.b.f;
import org.apache.a.m.d;
import org.apache.a.n;
import org.apache.a.q;
import org.apache.a.s;
import org.apache.commons.c.c;

public final class i {
    private final org.apache.commons.c.a a = c.b(this.getClass());

    private i() {
    }

    public i(byte by2) {
        this();
    }

    public final boolean a(n n2, s s2, org.apache.a.b.b b2, org.apache.a.a.e e2, d d2) {
        if (b2.a(n2, s2, d2)) {
            this.a.a("Authentication required");
            if (e2.b() == org.apache.a.a.a.e) {
                b2.b(n2, e2.c(), d2);
            }
            return true;
        }
        switch (e2.b()) {
            case b: 
            case c: {
                this.a.a("Authentication succeeded");
                e2.a(org.apache.a.a.a.e);
                b2.a(n2, e2.c(), d2);
                break;
            }
            case e: {
                break;
            }
            default: {
                e2.a(org.apache.a.a.a.a);
            }
        }
        return false;
    }

    public final boolean b(n n2, s s2, org.apache.a.b.b b2, org.apache.a.a.e e2, d d2) {
        try {
            Object object;
            Map<String, e> map;
            if (this.a.a()) {
                this.a.a(n2.e() + " requested authentication");
            }
            if ((map = b2.b(n2, s2, d2)).isEmpty()) {
                this.a.a("Response contains no authentication challenges");
                return false;
            }
            b b3 = e2.c();
            switch (e2.b()) {
                case d: {
                    return false;
                }
                case e: {
                    e2.a();
                    break;
                }
                case b: 
                case c: {
                    if (b3 == null) {
                        this.a.a("Auth scheme is null");
                        b2.b(n2, (b)null, d2);
                        e2.a();
                        e2.a(org.apache.a.a.a.d);
                        return false;
                    }
                }
                case a: {
                    if (b3 == null) break;
                    object = b3.a();
                    if ((object = map.get(((String)object).toLowerCase(Locale.ROOT))) != null) {
                        this.a.a("Authorization challenge processed");
                        b3.a((e)object);
                        if (b3.d()) {
                            this.a.a("Authentication failed");
                            b2.b(n2, e2.c(), d2);
                            e2.a();
                            e2.a(org.apache.a.a.a.d);
                            return false;
                        }
                        e2.a(org.apache.a.a.a.c);
                        return true;
                    }
                    e2.a();
                }
            }
            object = b2.a(map, n2, s2, d2);
            if (object != null && !object.isEmpty()) {
                if (this.a.a()) {
                    this.a.a("Selected authentication options: ".concat(String.valueOf(object)));
                }
                e2.a(org.apache.a.a.a.b);
                e2.a((Queue<f>)object);
                return true;
            }
            return false;
        } catch (m m2) {
            if (this.a.d()) {
                this.a.c("Malformed challenge: " + m2.getMessage());
            }
            e2.a();
            return false;
        }
    }

    public final void a(q q2, org.apache.a.a.e e2, d d2) {
        block13: {
            Object object;
            b b2 = e2.c();
            Object object2 = e2.d();
            switch (e2.b()) {
                case d: {
                    return;
                }
                case e: {
                    r.a(b2, "Auth scheme");
                    if (!b2.c()) break;
                    return;
                }
                case b: {
                    object = e2.e();
                    if (object != null) {
                        while (!object.isEmpty()) {
                            object2 = object.remove();
                            b2 = ((f)object2).a();
                            object2 = ((f)object2).b();
                            e2.a(b2, (j)object2);
                            if (this.a.a()) {
                                this.a.a("Generating response to an authentication challenge using " + b2.a() + " scheme");
                            }
                            try {
                                object2 = i.a(b2, (j)object2, q2, d2);
                                q2.a((e)object2);
                                return;
                            } catch (org.apache.a.a.f f2) {
                                if (!this.a.d()) continue;
                                this.a.c(b2 + " authentication error: " + f2.getMessage());
                            }
                        }
                        return;
                    }
                    r.a(b2, "Auth scheme");
                }
            }
            if (b2 != null) {
                try {
                    object = i.a(b2, (j)object2, q2, d2);
                    q2.a((e)object);
                    return;
                } catch (org.apache.a.a.f f3) {
                    if (!this.a.b()) break block13;
                    this.a.d(b2 + " authentication error: " + f3.getMessage());
                }
            }
        }
    }

    private static e a(b b2, j j2, q q2, d d2) {
        if (b2 instanceof org.apache.a.a.i) {
            return ((org.apache.a.a.i)b2).a(j2, q2, d2);
        }
        return b2.a(j2, q2);
    }
}

