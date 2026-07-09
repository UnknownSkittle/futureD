/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.e;

import com.a.a.b.ai;
import java.util.Collection;
import org.apache.a.e;
import org.apache.a.m.d;
import org.apache.a.q;
import org.apache.a.r;

public final class f
implements r {
    private final Collection<? extends e> a = null;

    @Override
    public final void a(q q2, d object) {
        ai.a(q2, "HTTP request");
        if (q2.g().a().equalsIgnoreCase("CONNECT")) {
            return;
        }
        object = (Collection)q2.f().a("http.default-headers");
        if (object == null) {
            object = null;
        }
        if (object != null) {
            object = object.iterator();
            while (object.hasNext()) {
                e e2 = (e)object.next();
                q2.a(e2);
            }
        }
    }
}

