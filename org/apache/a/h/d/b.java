/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.f.d;
import org.apache.a.f.j;

public abstract class b
implements j {
    private final Map<String, d> a;

    public b() {
        this.a = new ConcurrentHashMap<String, d>(10);
    }

    protected b(org.apache.a.f.b ... bArray) {
        this.a = new ConcurrentHashMap<String, d>(bArray.length);
        for (org.apache.a.f.b b2 : bArray) {
            this.a.put(b2.a(), b2);
        }
    }

    protected final d a(String string) {
        return this.a.get(string);
    }

    protected final Collection<d> c() {
        return this.a.values();
    }
}

