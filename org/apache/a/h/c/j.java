/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import com.a.a.b.ai;
import java.net.InetAddress;
import org.apache.a.ab;
import org.apache.a.b.a.a;
import org.apache.a.e.a.b;
import org.apache.a.e.a.d;
import org.apache.a.h.c.k;
import org.apache.a.m;
import org.apache.a.n;
import org.apache.a.q;

public class j
implements d {
    private final org.apache.a.e.m a;

    public j(org.apache.a.e.m m2) {
        this.a = m2 != null ? m2 : k.a;
    }

    @Override
    public final b a(n n2, q object, org.apache.a.m.d object2) {
        ai.a(object, "Request");
        if (n2 == null) {
            throw new ab("Target host is not specified");
        }
        object = org.apache.a.b.e.a.a((org.apache.a.m.d)object2).i();
        object2 = ((a)object).c();
        if ((object = ((a)object).b()) == null) {
            object = this.a();
        }
        if (n2.b() <= 0) {
            try {
                n2 = new n(n2.a(), this.a.a(n2), n2.c());
            } catch (org.apache.a.e.n n3) {
                throw new m(n3.getMessage());
            }
        }
        boolean bl2 = n2.c().equalsIgnoreCase("https");
        if (object == null) {
            return new b(n2, (InetAddress)object2, bl2);
        }
        return new b(n2, (InetAddress)object2, (n)object, bl2);
    }

    protected n a() {
        return null;
    }
}

