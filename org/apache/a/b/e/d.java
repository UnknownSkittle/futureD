/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.e;

import com.a.a.b.ai;
import org.apache.a.a.b;
import org.apache.a.a.j;
import org.apache.a.b.e.a;
import org.apache.a.b.f;
import org.apache.a.m.e;
import org.apache.a.n;
import org.apache.a.q;
import org.apache.a.r;
import org.apache.commons.c.c;

public final class d
implements r {
    private final org.apache.commons.c.a a = c.b(this.getClass());

    @Override
    public final void a(q object, org.apache.a.m.d object2) {
        Object object3;
        org.apache.a.a.e e2;
        ai.a(object, "HTTP request");
        ai.a(object2, "HTTP context");
        object = org.apache.a.b.e.a.a((org.apache.a.m.d)object2);
        object2 = ((a)object).f();
        if (object2 == null) {
            this.a.a("Auth cache not set in the context");
            return;
        }
        f f2 = ((a)object).e();
        if (f2 == null) {
            this.a.a("Credentials provider not set in the context");
            return;
        }
        org.apache.a.e.a.e e3 = ((a)object).a();
        if (e3 == null) {
            this.a.a("Route info not set in the context");
            return;
        }
        n n2 = ((e)object).k();
        if (n2 == null) {
            this.a.a("Target host not set in the context");
            return;
        }
        if (n2.b() < 0) {
            n2 = new n(n2.a(), e3.a().b(), n2.c());
        }
        if ((e2 = ((a)object).g()) != null && e2.b() == org.apache.a.a.a.a && (object3 = object2.a(n2)) != null) {
            this.a(n2, (b)object3, e2, f2);
        }
        object3 = e3.e();
        object = ((a)object).h();
        if (object3 != null && object != null && ((org.apache.a.a.e)object).b() == org.apache.a.a.a.a && (object2 = object2.a((n)object3)) != null) {
            this.a((n)object3, (b)object2, (org.apache.a.a.e)object, f2);
        }
    }

    private void a(n object, b b2, org.apache.a.a.e e2, f f2) {
        String string = b2.a();
        if (this.a.a()) {
            this.a.a("Re-using cached '" + string + "' auth scheme for " + object);
        }
        object = new org.apache.a.a.d((n)object, org.apache.a.a.d.a, string);
        if ((object = f2.a((org.apache.a.a.d)object)) != null) {
            if ("BASIC".equalsIgnoreCase(b2.a())) {
                e2.a(org.apache.a.a.a.b);
            } else {
                e2.a(org.apache.a.a.a.e);
            }
            e2.a(b2, (j)object);
            return;
        }
        this.a.a("No credentials for preemptive authentication");
    }
}

