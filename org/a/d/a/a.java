/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.d.a;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.a.b.d;
import org.a.b.e;
import org.a.b.f;
import org.a.b.g;
import org.a.b.i;
import org.a.b.j;
import org.a.b.k;
import org.a.b.l;
import org.a.b.m;
import org.a.b.n;
import org.a.b.o;
import org.a.b.p;
import org.a.b.q;
import org.a.b.r;
import org.a.b.s;
import org.a.b.t;
import org.a.b.u;
import org.a.b.v;
import org.a.b.w;
import org.a.b.x;
import org.a.d.a.b;
import org.a.d.a.c;
import org.a.d.a.h;

public final class a
extends x
implements org.a.d.a {
    private c a;
    private final h b;

    public a(c c2) {
        this.a = c2;
        this.b = c2.a();
    }

    @Override
    public final Set<Class<? extends q>> a() {
        return new HashSet<Class<? extends q>>(Arrays.asList(e.class, i.class, s.class, org.a.b.b.class, org.a.b.c.class, g.class, j.class, w.class, m.class, n.class, p.class, r.class, l.class, f.class, u.class, v.class, d.class, k.class, t.class, org.a.b.h.class));
    }

    @Override
    public final void b(q q2) {
        q2.a(this);
    }

    @Override
    public final void a(e e2) {
        this.a((q)e2);
    }

    @Override
    public final void a(i i2) {
        String string = "h" + i2.c();
        this.b.a();
        this.b.a(string, this.a(Collections.emptyMap()));
        this.a((q)i2);
        this.b.c("/".concat(String.valueOf(string)));
        this.b.a();
    }

    @Override
    public final void a(s s2) {
        q q2 = s2.a();
        boolean bl2 = q2 != null && (q2 = ((q)q2).b()) != null && q2 instanceof o ? ((o)q2).e() : false;
        if (!bl2) {
            this.b.a();
            this.b.a("p", this.a(Collections.emptyMap()));
        }
        this.a((q)s2);
        if (!bl2) {
            this.b.c("/p");
            this.b.a();
        }
    }

    @Override
    public final void a(org.a.b.b b2) {
        this.b.a();
        this.b.a("blockquote", this.a(Collections.emptyMap()));
        this.b.a();
        this.a((q)b2);
        this.b.a();
        this.b.c("/blockquote");
        this.b.a();
    }

    @Override
    public final void a(org.a.b.c c2) {
        this.a(c2, "ul", this.a(Collections.emptyMap()));
    }

    @Override
    public final void a(g object) {
        String string = ((g)object).g();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        if ((object = ((g)object).f()) != null && !((String)object).isEmpty()) {
            int n2 = ((String)object).indexOf(" ");
            if (n2 != -1) {
                object = ((String)object).substring(0, n2);
            }
            linkedHashMap.put("class", "language-".concat(String.valueOf(object)));
        }
        this.a(string, linkedHashMap);
    }

    @Override
    public final void a(j j2) {
        this.b.a();
        this.b.a(j2.c());
        this.b.a();
    }

    @Override
    public final void a(w w2) {
        this.b.a();
        this.b.a("hr", this.a(Collections.emptyMap()), true);
        this.b.a();
    }

    @Override
    public final void a(m m2) {
        this.a(m2.c(), Collections.emptyMap());
    }

    @Override
    public final void a(n n2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        String string = this.a.a(n2.a());
        linkedHashMap.put("href", string);
        if (n2.c() != null) {
            linkedHashMap.put("title", n2.c());
        }
        this.b.a("a", this.a(linkedHashMap));
        this.a((q)n2);
        this.b.c("/a");
    }

    @Override
    public final void a(p p2) {
        this.b.a("li", this.a(Collections.emptyMap()));
        this.a((q)p2);
        this.b.c("/li");
        this.b.a();
    }

    @Override
    public final void a(r r2) {
        int n2 = r2.c();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        if (n2 != 1) {
            linkedHashMap.put("start", String.valueOf(n2));
        }
        this.a(r2, "ol", this.a(linkedHashMap));
    }

    @Override
    public final void a(l l2) {
        String string = this.a.a(l2.a());
        Object object = new b(0);
        b b2 = object;
        Object object2 = l2;
        b2.a((l)object2);
        object = ((b)object).a();
        object2 = new LinkedHashMap<String, String>();
        object2.put("src", string);
        object2.put("alt", object);
        if (l2.c() != null) {
            object2.put("title", l2.c());
        }
        this.b.a("img", this.a((Map<String, String>)object2), true);
    }

    @Override
    public final void a(f f2) {
        this.b.a("em", this.a(Collections.emptyMap()));
        this.a((q)f2);
        this.b.c("/em");
    }

    @Override
    public final void a(u u2) {
        this.b.a("strong", this.a(Collections.emptyMap()));
        this.a((q)u2);
        this.b.c("/strong");
    }

    @Override
    public final void a(v v2) {
        this.b.b(v2.a());
    }

    @Override
    public final void a(d d2) {
        this.b.a("code", this.a(Collections.emptyMap()));
        this.b.b(d2.a());
        this.b.c("/code");
    }

    @Override
    public final void a(k k2) {
        this.b.a(k2.a());
    }

    @Override
    public final void a(t t2) {
        this.b.a(this.a.b());
    }

    @Override
    public final void a(org.a.b.h h2) {
        this.b.a("br", this.a(Collections.emptyMap()), true);
        this.b.a();
    }

    @Override
    protected final void a(q q2) {
        q2 = q2.j();
        while (q2 != null) {
            q q3 = q2.h();
            this.a.a(q2);
            q2 = q3;
        }
    }

    private void a(String string, Map<String, String> map) {
        this.b.a();
        this.b.a("pre", this.a(Collections.emptyMap()));
        this.b.a("code", this.a(map));
        this.b.b(string);
        this.b.c("/code");
        this.b.c("/pre");
        this.b.a();
    }

    private void a(o o2, String string, Map<String, String> map) {
        this.b.a();
        this.b.a(string, map);
        this.b.a();
        this.a(o2);
        this.b.a();
        this.b.c("/".concat(String.valueOf(string)));
        this.b.a();
    }

    private Map<String, String> a(Map<String, String> map) {
        return this.a.a(map);
    }
}

