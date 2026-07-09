/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b.a;
import com.a.a.b.a.d;
import com.a.a.b.e;
import com.a.a.k;
import java.lang.reflect.Type;
import java.util.Collection;

public final class c
implements ai {
    private final e a;

    public c(e e2) {
        this.a = e2;
    }

    @Override
    public final <T> ag<T> a(k k2, com.a.a.c.a<T> object) {
        Type type = ((com.a.a.c.a)object).getType();
        Class<T> clazz = ((com.a.a.c.a)object).getRawType();
        if (!Collection.class.isAssignableFrom(clazz)) {
            return null;
        }
        type = com.a.a.b.a.a(type, clazz);
        clazz = k2.a(com.a.a.c.a.get(type));
        object = this.a.a(object);
        return new d(k2, type, clazz, object);
    }
}

