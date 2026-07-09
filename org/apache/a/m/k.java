/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.m;

import com.a.a.b.ai;
import org.apache.a.k.c;
import org.apache.a.m.d;
import org.apache.a.q;
import org.apache.a.r;

public final class k
implements r {
    private final String a;

    public k(String string) {
        this.a = string;
    }

    public k() {
        this(null);
    }

    @Override
    public final void a(q q2, d object) {
        ai.a(q2, "HTTP request");
        if (!q2.a("User-Agent")) {
            object = null;
            c c2 = q2.f();
            if (c2 != null) {
                object = (String)c2.a("http.useragent");
            }
            if (object == null) {
                object = this.a;
            }
            if (object != null) {
                q2.a("User-Agent", (String)object);
            }
        }
    }
}

