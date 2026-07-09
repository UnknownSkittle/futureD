/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.b.a;
import com.a.a.b.ai;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class c
implements Serializable,
ParameterizedType {
    private final Type a;
    private final Type b;
    private final Type[] c;

    public c(Type type, Type type2, Type ... typeArray) {
        int n2;
        if (type2 instanceof Class) {
            Class clazz = (Class)type2;
            n2 = Modifier.isStatic(clazz.getModifiers()) || clazz.getEnclosingClass() == null ? 1 : 0;
            ai.a(type != null || n2 != 0);
        }
        this.a = type == null ? null : com.a.a.b.a.b(type);
        this.b = com.a.a.b.a.b(type2);
        this.c = (Type[])typeArray.clone();
        n2 = this.c.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ai.a(this.c[i2]);
            com.a.a.b.a.f(this.c[i2]);
            this.c[i2] = com.a.a.b.a.b(this.c[i2]);
        }
    }

    @Override
    public final Type[] getActualTypeArguments() {
        return (Type[])this.c.clone();
    }

    @Override
    public final Type getRawType() {
        return this.b;
    }

    @Override
    public final Type getOwnerType() {
        return this.a;
    }

    public final boolean equals(Object object) {
        return object instanceof ParameterizedType && com.a.a.b.a.a((Type)this, (ParameterizedType)object);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) ^ this.b.hashCode() ^ com.a.a.b.a.a((Object)this.a);
    }

    public final String toString() {
        int n2 = this.c.length;
        if (n2 == 0) {
            return com.a.a.b.a.d(this.b);
        }
        StringBuilder stringBuilder = new StringBuilder(30 * (n2 + 1));
        stringBuilder.append(com.a.a.b.a.d(this.b)).append("<").append(com.a.a.b.a.d(this.c[0]));
        for (int i2 = 1; i2 < n2; ++i2) {
            stringBuilder.append(", ").append(com.a.a.b.a.d(this.c[i2]));
        }
        return stringBuilder.append(">").toString();
    }
}

