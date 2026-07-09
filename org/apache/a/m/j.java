/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.m;

import com.a.a.b.ai;
import java.net.InetAddress;
import org.apache.a.ab;
import org.apache.a.ac;
import org.apache.a.m.d;
import org.apache.a.m.e;
import org.apache.a.n;
import org.apache.a.o;
import org.apache.a.q;
import org.apache.a.r;
import org.apache.a.v;

public final class j
implements r {
    @Override
    public final void a(q q2, d object) {
        ai.a(q2, "HTTP request");
        ai.a(object, "HTTP context");
        object = object instanceof e ? (e)object : new e((d)object);
        ac ac2 = q2.g().b();
        if (q2.g().a().equalsIgnoreCase("CONNECT") && ac2.a(v.a)) {
            return;
        }
        if (!q2.a("Host")) {
            n n2 = ((e)object).k();
            if (n2 == null) {
                if ((object = ((e)object).j()) instanceof o) {
                    InetAddress inetAddress = ((o)object).f();
                    int n3 = ((o)object).g();
                    if (inetAddress != null) {
                        n2 = new n(inetAddress.getHostName(), n3);
                    }
                }
                if (n2 == null) {
                    if (ac2.a(v.a)) {
                        return;
                    }
                    throw new ab("Target host missing");
                }
            }
            q2.a("Host", n2.e());
        }
    }
}

