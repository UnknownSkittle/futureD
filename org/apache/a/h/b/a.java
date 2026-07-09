/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.b;

import com.a.a.b.ai;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.a.a.j;
import org.apache.a.a.m;
import org.apache.a.d;
import org.apache.a.e;
import org.apache.a.h.b.b;
import org.apache.a.h.b.f;
import org.apache.a.n;
import org.apache.a.s;
import org.apache.commons.c.c;

abstract class a
implements org.apache.a.b.b {
    private final org.apache.commons.c.a a = org.apache.commons.c.c.b(this.getClass());
    private static final List<String> b = Collections.unmodifiableList(Arrays.asList("Negotiate", "Kerberos", "NTLM", "Digest", "Basic"));
    private final int c;
    private final String d;

    a(int n2, String string) {
        this.c = n2;
        this.d = string;
    }

    @Override
    public boolean a(n n2, s s2, org.apache.a.m.d d2) {
        ai.a(s2, "HTTP response");
        return s2.a().b() == this.c;
    }

    @Override
    public Map<String, e> b(n eArray, s object, org.apache.a.m.d d2) {
        ai.a(object, "HTTP response");
        eArray = object.b(this.d);
        object = new HashMap(eArray.length);
        for (e e2 : eArray) {
            int n2;
            CharSequence charSequence;
            if (e2 instanceof d) {
                charSequence = ((d)e2).a();
                n2 = ((d)e2).b();
            } else {
                String string = e2.d();
                if (string == null) {
                    throw new m("Header value is null");
                }
                charSequence = new org.apache.a.n.b(string.length());
                ((org.apache.a.n.b)charSequence).a(string);
                n2 = 0;
            }
            while (n2 < ((org.apache.a.n.b)charSequence).length() && org.apache.a.m.c.a(((org.apache.a.n.b)charSequence).charAt(n2))) {
                ++n2;
            }
            int n3 = n2;
            while (n2 < ((org.apache.a.n.b)charSequence).length() && !org.apache.a.m.c.a(((org.apache.a.n.b)charSequence).charAt(n2))) {
                ++n2;
            }
            charSequence = ((org.apache.a.n.b)charSequence).a(n3, n2);
            object.put(((String)charSequence).toLowerCase(Locale.ROOT), e2);
        }
        return object;
    }

    abstract Collection<String> a(org.apache.a.b.a.a var1);

    @Override
    public Queue<f> a(Map<String, e> map, n n2, s object, org.apache.a.m.d object2) {
        ai.a(map, "Map of auth challenges");
        ai.a(n2, "Host");
        ai.a(object, "HTTP response");
        ai.a(object2, "HTTP context");
        object = org.apache.a.b.e.a.a((org.apache.a.m.d)object2);
        object2 = new LinkedList();
        org.apache.a.d.c<org.apache.a.a.c> c2 = ((org.apache.a.b.e.a)object).d();
        if (c2 == null) {
            this.a.a("Auth scheme registry not set in the context");
            return object2;
        }
        org.apache.a.b.f f2 = ((org.apache.a.b.e.a)object).e();
        if (f2 == null) {
            this.a.a("Credentials provider not set in the context");
            return object2;
        }
        object = ((org.apache.a.b.e.a)object).i();
        if ((object = this.a((org.apache.a.b.a.a)object)) == null) {
            object = b;
        }
        if (this.a.a()) {
            this.a.a("Authentication schemes in the order of preference: ".concat(String.valueOf(object)));
        }
        object = object.iterator();
        while (object.hasNext()) {
            Object object3 = (String)object.next();
            Object object4 = map.get(((String)object3).toLowerCase(Locale.ROOT));
            if (object4 != null) {
                org.apache.a.a.c c3 = c2.a((String)object3);
                if (c3 == null) {
                    if (!this.a.d()) continue;
                    this.a.c("Authentication scheme " + (String)object3 + " not supported");
                    continue;
                }
                object3 = c3.a();
                object3.a((e)object4);
                object4 = new org.apache.a.a.d(n2.a(), n2.b(), object3.b(), object3.a());
                if ((object4 = f2.a((org.apache.a.a.d)object4)) == null) continue;
                object2.add(new f((org.apache.a.a.b)object3, (j)object4));
                continue;
            }
            if (!this.a.a()) continue;
            this.a.a("Challenge for " + (String)object3 + " authentication scheme not available");
        }
        return object2;
    }

    @Override
    public void a(n n2, org.apache.a.a.b b2, org.apache.a.m.d object) {
        ai.a(n2, "Host");
        ai.a(b2, "Auth scheme");
        ai.a(object, "HTTP context");
        object = org.apache.a.b.e.a.a((org.apache.a.m.d)object);
        Object object2 = b2;
        if (object2 == null || !object2.d() ? false : ((String)(object2 = object2.a())).equalsIgnoreCase("Basic") || ((String)object2).equalsIgnoreCase("Digest")) {
            object2 = ((org.apache.a.b.e.a)object).f();
            if (object2 == null) {
                object2 = new b(0);
                org.apache.a.m.d d2 = object;
                object = object2;
                ((org.apache.a.m.e)d2).a("http.auth.auth-cache", object);
            }
            if (this.a.a()) {
                this.a.a("Caching '" + b2.a() + "' auth scheme for " + n2);
            }
            object2.a(n2, b2);
        }
    }

    @Override
    public void b(n n2, org.apache.a.a.b object, org.apache.a.m.d d2) {
        ai.a(n2, "Host");
        ai.a(d2, "HTTP context");
        object = org.apache.a.b.e.a.a(d2).f();
        if (object != null) {
            if (this.a.a()) {
                this.a.a("Clearing cached auth scheme for ".concat(String.valueOf(n2)));
            }
            object.b(n2);
        }
    }
}

