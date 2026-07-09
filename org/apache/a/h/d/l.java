/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import java.util.List;
import org.apache.a.d;
import org.apache.a.f.c;
import org.apache.a.f.n;
import org.apache.a.h.d.ab;
import org.apache.a.h.d.ac;
import org.apache.a.h.d.ad;
import org.apache.a.h.d.ae;
import org.apache.a.h.d.af;
import org.apache.a.h.d.ag;
import org.apache.a.h.d.ai;
import org.apache.a.h.d.e;
import org.apache.a.h.d.f;
import org.apache.a.h.d.g;
import org.apache.a.h.d.h;
import org.apache.a.h.d.i;
import org.apache.a.h.d.j;
import org.apache.a.h.d.u;
import org.apache.a.h.d.v;
import org.apache.a.h.d.y;
import org.apache.a.h.d.z;
import org.apache.a.n.b;

public final class l
implements org.apache.a.f.j {
    private final ag a;
    private final z b;
    private final v c;

    l(ag ag2, z z2, v v2) {
        this.a = ag2;
        this.b = z2;
        this.c = v2;
    }

    private l() {
        this.a = new ag(new ai(), new i(), new ae(), new af(), new h(), new j(), new e(), new ac(), new ad());
        this.b = new z(new ab(), new i(), new y(), new h(), new j(), new e());
        this.c = new v(new f(), new i(), new j(), new e(), new g(new String[]{"EEE, dd-MMM-yy HH:mm:ss z"}));
    }

    @Override
    public final List<c> a(org.apache.a.e e2, org.apache.a.f.f f2) {
        Object object;
        com.a.a.b.ai.a(e2, "Header");
        com.a.a.b.ai.a(f2, "Cookie origin");
        org.apache.a.f[] fArray = e2.e();
        boolean bl2 = false;
        boolean bl3 = false;
        org.apache.a.f[] fArray2 = fArray;
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            object = fArray2[i2];
            if (object.a("version") != null) {
                bl2 = true;
            }
            if (object.a("expires") == null) continue;
            bl3 = true;
        }
        if (bl3 || !bl2) {
            org.apache.a.j.v v2;
            b b2;
            if (e2 instanceof d) {
                b2 = ((d)e2).a();
                v2 = new org.apache.a.j.v(((d)e2).b(), b2.length());
            } else {
                object = e2.d();
                if (object == null) {
                    throw new org.apache.a.f.l("Header value is null");
                }
                b2 = new b(((String)object).length());
                b2.a((String)object);
                v2 = new org.apache.a.j.v(0, b2.length());
            }
            fArray = new org.apache.a.f[]{u.a(b2, v2)};
            return this.c.a(fArray, f2);
        }
        if ("Set-Cookie2".equals(e2.c())) {
            return this.a.a(fArray, f2);
        }
        return this.b.a(fArray, f2);
    }

    @Override
    public final void a(c c2, org.apache.a.f.f f2) {
        com.a.a.b.ai.a(c2, "Cookie");
        com.a.a.b.ai.a(f2, "Cookie origin");
        if (c2.h() > 0) {
            if (c2 instanceof n) {
                this.a.a(c2, f2);
                return;
            }
            this.b.a(c2, f2);
            return;
        }
        this.c.a(c2, f2);
    }

    @Override
    public final boolean b(c c2, org.apache.a.f.f f2) {
        com.a.a.b.ai.a(c2, "Cookie");
        com.a.a.b.ai.a(f2, "Cookie origin");
        if (c2.h() > 0) {
            if (c2 instanceof n) {
                return this.a.b(c2, f2);
            }
            return this.b.b(c2, f2);
        }
        return this.c.b(c2, f2);
    }

    @Override
    public final List<org.apache.a.e> a(List<c> list) {
        com.a.a.b.ai.a(list, "List of cookies");
        int n2 = Integer.MAX_VALUE;
        boolean bl2 = true;
        for (c c2 : list) {
            if (!(c2 instanceof n)) {
                bl2 = false;
            }
            if (c2.h() >= n2) continue;
            n2 = c2.h();
        }
        if (n2 > 0) {
            if (bl2) {
                return this.a.a(list);
            }
            return this.b.a(list);
        }
        return this.c.a(list);
    }

    @Override
    public final int a() {
        return this.a.a();
    }

    @Override
    public final org.apache.a.e b() {
        return null;
    }

    public final String toString() {
        return "default";
    }
}

