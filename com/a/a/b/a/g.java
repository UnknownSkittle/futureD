/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ab;
import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b.a.y;
import com.a.a.b.e;
import com.a.a.c.a;
import com.a.a.k;
import com.a.a.u;

public final class g
implements ai {
    private final e a;

    public g(e e2) {
        this.a = e2;
    }

    @Override
    public final <T> ag<T> a(k k2, a<T> a2) {
        com.a.a.a.a a3 = a2.getRawType().getAnnotation(com.a.a.a.a.class);
        if (a3 == null) {
            return null;
        }
        return g.a(this.a, k2, a2, a3);
    }

    static ag<?> a(e y2, k k2, a<?> a2, com.a.a.a.a a3) {
        if ((y2 = ((e)((Object)y2)).a(com.a.a.c.a.get(a3.a())).a()) instanceof ag) {
            y2 = y2;
        } else if (y2 instanceof ai) {
            y2 = ((ai)((Object)y2)).a(k2, a2);
        } else if (y2 instanceof ab || y2 instanceof u) {
            ab ab2 = y2 instanceof ab ? (ab)((Object)y2) : null;
            y2 = y2 instanceof u ? (u)((Object)y2) : null;
            y2 = new y(ab2, (u<?>)((Object)y2), k2, a2);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + y2.getClass().getName() + " as a @JsonAdapter for " + a2.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if (y2 != null && a3.b()) {
            y2 = y2.nullSafe();
        }
        return y2;
    }
}

