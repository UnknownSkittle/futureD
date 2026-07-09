/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.b.ag;
import com.a.a.b.e;
import com.a.a.w;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

final class o
implements ag<T> {
    private /* synthetic */ Type a;
    private /* synthetic */ e b;

    o(e e2, Type type) {
        this.b = e2;
        this.a = type;
    }

    @Override
    public final T a() {
        if (this.a instanceof ParameterizedType) {
            Type type = ((ParameterizedType)this.a).getActualTypeArguments()[0];
            if (type instanceof Class) {
                return EnumSet.noneOf((Class)type);
            }
            throw new w("Invalid EnumSet type: " + this.a.toString());
        }
        throw new w("Invalid EnumSet type: " + this.a.toString());
    }
}

