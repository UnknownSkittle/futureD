/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.b.aj;
import java.lang.reflect.Method;

final class al
extends aj {
    private /* synthetic */ Method a;
    private /* synthetic */ int b;

    al(Method method, int n2) {
        this.a = method;
        this.b = n2;
    }

    @Override
    public final <T> T a(Class<T> clazz) {
        al.b(clazz);
        return (T)this.a.invoke(null, clazz, this.b);
    }
}

