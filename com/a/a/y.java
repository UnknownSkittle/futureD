/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.aa;
import com.a.a.v;
import com.a.a.x;
import java.util.Map;
import java.util.Set;

public final class y
extends v {
    private final com.a.a.b.y<String, v> a = new com.a.a.b.y();

    public final void a(String string, v v2) {
        if (v2 == null) {
            v2 = x.a;
        }
        this.a.put(string, v2);
    }

    public final void a(String string, String string2) {
        this.a(string, y.a(string2));
    }

    public final void a(String string, Number number) {
        this.a(string, y.a(number));
    }

    private static v a(Object object) {
        if (object == null) {
            return x.a;
        }
        return new aa(object);
    }

    public final Set<Map.Entry<String, v>> h() {
        return this.a.entrySet();
    }

    public final boolean a(String string) {
        return this.a.containsKey(string);
    }

    public final v b(String string) {
        return this.a.get(string);
    }

    public final boolean equals(Object object) {
        return object == this || object instanceof y && ((y)object).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

