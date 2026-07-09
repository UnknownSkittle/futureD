/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b.a.bn;
import com.a.a.c.a;
import com.a.a.k;

final class ba
implements ai {
    ba() {
    }

    @Override
    public final <T> ag<T> a(k clazz, a<T> a2) {
        clazz = a2.getRawType();
        if (!Enum.class.isAssignableFrom(clazz) || clazz == Enum.class) {
            return null;
        }
        if (!clazz.isEnum()) {
            clazz = clazz.getSuperclass();
        }
        return new bn(clazz);
    }
}

