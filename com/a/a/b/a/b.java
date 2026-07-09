/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b.a;
import com.a.a.k;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class b
implements ai {
    b() {
    }

    @Override
    public final <T> ag<T> a(k k2, com.a.a.c.a<T> object) {
        if (!((object = ((com.a.a.c.a)object).getType()) instanceof GenericArrayType || object instanceof Class && ((Class)object).isArray())) {
            return null;
        }
        object = a.e((Type)object);
        ag<?> ag2 = k2.a(com.a.a.c.a.get((Type)object));
        return new com.a.a.b.a.a(k2, ag2, a.c((Type)object));
    }
}

