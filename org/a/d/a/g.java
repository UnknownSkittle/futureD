/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.d.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.a.b.q;
import org.a.c.b;
import org.a.d.a;
import org.a.d.a.c;
import org.a.d.a.d;
import org.a.d.a.e;
import org.a.d.a.h;

final class g
implements c {
    private final h a;
    private final List<b> b;
    private final org.a.a.b.a c = new org.a.a.b.a();
    private /* synthetic */ e d;

    private g(e e2, h object) {
        this.d = e2;
        this.a = object;
        this.b = new ArrayList<b>(e.a(e2).size());
        for (Object object2 : e.a(e2)) {
            this.b.add(object2.b());
        }
        for (int i2 = e.b(e2).size() - 1; i2 >= 0; --i2) {
            Object object2;
            object2 = ((d)e.b(e2).get(i2)).a(this);
            this.c.a((a)object2);
        }
    }

    @Override
    public final String a(String string) {
        return string;
    }

    @Override
    public final Map<String, String> a(Map<String, String> map) {
        map = new LinkedHashMap<String, String>(map);
        this.c();
        return map;
    }

    @Override
    public final h a() {
        return this.a;
    }

    @Override
    public final String b() {
        return e.c(this.d);
    }

    @Override
    public final void a(q q2) {
        this.c.a(q2);
    }

    private void c() {
        Iterator<b> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }

    /* synthetic */ g(e e2, h h2, byte by2) {
        this(e2, h2);
    }
}

