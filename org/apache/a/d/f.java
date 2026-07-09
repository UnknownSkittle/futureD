/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.d;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.d.c;

public final class f<I>
implements c<I> {
    private final Map<String, I> a;

    f(Map<String, I> map) {
        this.a = new ConcurrentHashMap<String, I>(map);
    }

    @Override
    public final I a(String string) {
        if (string == null) {
            return null;
        }
        return this.a.get(string.toLowerCase(Locale.ROOT));
    }

    public final String toString() {
        return this.a.toString();
    }
}

