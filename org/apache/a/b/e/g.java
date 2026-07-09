/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.e;

import com.a.a.b.ai;
import org.apache.a.ac;
import org.apache.a.b.e.a;
import org.apache.a.k;
import org.apache.a.l;
import org.apache.a.m.d;
import org.apache.a.q;
import org.apache.a.r;
import org.apache.a.v;

public final class g
implements r {
    @Override
    public final void a(q q2, d d2) {
        ai.a(q2, "HTTP request");
        if (!q2.a("Expect") && q2 instanceof l) {
            ac ac2 = q2.g().b();
            k k2 = ((l)q2).b();
            if (k2 != null && k2.getContentLength() != 0L && !ac2.a(v.a) && a.a(d2).i().a()) {
                q2.a("Expect", "100-continue");
            }
        }
    }
}

