/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.k;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.k.a;
import org.apache.a.k.c;

@Deprecated
public final class b
extends a
implements Serializable,
Cloneable {
    private final Map<String, Object> a = new ConcurrentHashMap<String, Object>();

    @Override
    public final Object a(String string) {
        return this.a.get(string);
    }

    @Override
    public final c a(String string, Object object) {
        if (string == null) {
            return this;
        }
        if (object != null) {
            this.a.put(string, object);
        } else {
            this.a.remove(string);
        }
        return this;
    }

    @Override
    public final c b() {
        try {
            return (c)this.clone();
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new UnsupportedOperationException("Cloning not supported");
        }
    }

    public final Object clone() {
        b b2;
        b b3 = b2 = (b)super.clone();
        for (Map.Entry<String, Object> entry : this.a.entrySet()) {
            b3.a(entry.getKey(), entry.getValue());
        }
        return b2;
    }

    @Override
    public final Set<String> a() {
        return new HashSet<String>(this.a.keySet());
    }
}

