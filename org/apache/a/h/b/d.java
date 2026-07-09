/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.b;

import com.a.a.b.ai;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.a.j;
import org.apache.a.b.f;

public final class d
implements f {
    private final ConcurrentHashMap<org.apache.a.a.d, j> a = new ConcurrentHashMap();

    @Override
    public final void a(org.apache.a.a.d d2, j j2) {
        ai.a(d2, "Authentication scope");
        this.a.put(d2, j2);
    }

    @Override
    public final j a(org.apache.a.a.d object) {
        ai.a(object, "Authentication scope");
        org.apache.a.a.d d2 = object;
        object = this.a;
        j j2 = (j)object.get(d2);
        if (j2 == null) {
            int n2 = -1;
            org.apache.a.a.d d3 = null;
            for (org.apache.a.a.d d4 : object.keySet()) {
                int n3 = d2.a(d4);
                if (n3 <= n2) continue;
                n2 = n3;
                d3 = d4;
            }
            if (d3 != null) {
                j2 = (j)object.get(d3);
            }
        }
        return j2;
    }

    public final String toString() {
        return this.a.toString();
    }
}

