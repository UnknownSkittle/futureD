/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.d;

import com.a.a.b.ai;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.a.d.f;

public final class g<I> {
    private final Map<String, I> a = new HashMap<String, I>();

    public static <I> g<I> a() {
        return new g<I>();
    }

    g() {
    }

    public final g<I> a(String string, I i2) {
        ai.a(string, "ID");
        ai.a(i2, "Item");
        this.a.put(string.toLowerCase(Locale.ROOT), i2);
        return this;
    }

    public final f<I> b() {
        return new f<I>(this.a);
    }

    public final String toString() {
        return this.a.toString();
    }
}

