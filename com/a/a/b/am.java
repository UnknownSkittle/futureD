/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.b.aj;
import java.lang.reflect.Method;

final class am
extends aj {
    private /* synthetic */ Method a;

    am(Method method) {
        this.a = method;
    }

    @Override
    public final <T> T a(Class<T> clazz) {
        am.b(clazz);
        return (T)this.a.invoke(null, clazz, Object.class);
    }
}

