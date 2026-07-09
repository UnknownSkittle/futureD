/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.d.a;
import org.apache.a.d.h;
import org.apache.a.n;

final class r {
    private final Map<n, h> a = new ConcurrentHashMap<n, h>();
    private final Map<n, a> b = new ConcurrentHashMap<n, a>();
    private volatile h c;
    private volatile a d;

    r() {
    }

    public final h a() {
        return this.c;
    }

    public final a b() {
        return this.d;
    }

    public final h a(n n2) {
        return this.a.get(n2);
    }

    public final a b(n n2) {
        return this.b.get(n2);
    }
}

