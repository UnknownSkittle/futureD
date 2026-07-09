/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.b.aj;
import java.lang.reflect.Method;

final class ak
extends aj {
    private /* synthetic */ Method a;
    private /* synthetic */ Object b;

    ak(Method method, Object object) {
        this.a = method;
        this.b = object;
    }

    @Override
    public final <T> T a(Class<T> clazz) {
        ak.b(clazz);
        return (T)this.a.invoke(this.b, clazz);
    }
}

