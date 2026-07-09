/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.b.a.s;
import com.a.a.d.a;
import com.a.a.d.d;
import com.a.a.k;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class aa<T>
extends ag<T> {
    private final k a;
    private final ag<T> b;
    private final Type c;

    aa(k k2, ag<T> ag2, Type type) {
        this.a = k2;
        this.b = ag2;
        this.c = type;
    }

    @Override
    public final T read(a a2) {
        return this.b.read(a2);
    }

    @Override
    public final void write(d d2, T t2) {
        ag<Object> ag2 = this.b;
        T t3 = t2;
        Class<?> clazz = this.c;
        if (t3 != null && (clazz == Object.class || clazz instanceof TypeVariable || clazz instanceof Class)) {
            clazz = t3.getClass();
        }
        if (clazz != this.c && (ag2 = this.a.a(com.a.a.c.a.get(clazz))) instanceof s && !(this.b instanceof s)) {
            ag2 = this.b;
        }
        ag2.write(d2, t2);
    }
}

