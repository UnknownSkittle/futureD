/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.e;

import com.a.a.b.ai;
import org.apache.a.b.e.a;
import org.apache.a.m.d;
import org.apache.a.q;
import org.apache.a.r;
import org.apache.commons.c.c;

public final class e
implements r {
    private final org.apache.commons.c.a a = c.b(this.getClass());

    @Override
    public final void a(q q2, d object) {
        ai.a(q2, "HTTP request");
        if (q2.g().a().equalsIgnoreCase("CONNECT")) {
            q2.b("Proxy-Connection", "Keep-Alive");
            return;
        }
        if ((object = org.apache.a.b.e.a.a((d)object).a()) == null) {
            this.a.a("Connection route not set in the context");
            return;
        }
        if ((object.d() == 1 || object.f()) && !q2.a("Connection")) {
            q2.a("Connection", "Keep-Alive");
        }
        if (object.d() == 2 && !object.f() && !q2.a("Proxy-Connection")) {
            q2.a("Proxy-Connection", "Keep-Alive");
        }
    }
}

