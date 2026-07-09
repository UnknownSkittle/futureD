/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a.b;

import java.util.HashMap;
import java.util.Map;
import org.a.b.q;

public final class a {
    private final Map<Class<? extends q>, org.a.d.a> a = new HashMap<Class<? extends q>, org.a.d.a>(32);

    public final void a(org.a.d.a a2) {
        for (Class<? extends q> clazz : a2.a()) {
            this.a.put(clazz, a2);
        }
    }

    public final void a(q q2) {
        org.a.d.a a2 = this.a.get(q2.getClass());
        if (a2 != null) {
            a2.b(q2);
        }
    }
}

