/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.b.ag;
import com.a.a.b.aj;
import com.a.a.b.e;
import java.lang.reflect.Type;

final class k
implements ag<T> {
    private final aj a = aj.a();
    private /* synthetic */ Class b;
    private /* synthetic */ Type c;
    private /* synthetic */ e d;

    k(e e2, Class clazz, Type type) {
        this.d = e2;
        this.b = clazz;
        this.c = type;
    }

    @Override
    public final T a() {
        try {
            return this.a.a(this.b);
        } catch (Exception exception) {
            throw new RuntimeException("Unable to invoke no-args constructor for " + this.c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", exception);
        }
    }
}

