/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.b.a;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class b
implements Serializable,
GenericArrayType {
    private final Type a;

    public b(Type type) {
        this.a = com.a.a.b.a.b(type);
    }

    @Override
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final boolean equals(Object object) {
        return object instanceof GenericArrayType && com.a.a.b.a.a((Type)this, (GenericArrayType)object);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.a.a.b.a.d(this.a) + "[]";
    }
}

