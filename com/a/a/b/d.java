/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.b.a;
import com.a.a.b.ai;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

final class d
implements Serializable,
WildcardType {
    private final Type a;
    private final Type b;

    public d(Type[] typeArray, Type[] typeArray2) {
        ai.a(typeArray2.length <= 1);
        ai.a(typeArray.length == 1);
        if (typeArray2.length == 1) {
            ai.a(typeArray2[0]);
            com.a.a.b.a.f(typeArray2[0]);
            ai.a(typeArray[0] == Object.class);
            this.b = com.a.a.b.a.b(typeArray2[0]);
            this.a = Object.class;
            return;
        }
        ai.a(typeArray[0]);
        com.a.a.b.a.f(typeArray[0]);
        this.b = null;
        this.a = com.a.a.b.a.b(typeArray[0]);
    }

    @Override
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    @Override
    public final Type[] getLowerBounds() {
        if (this.b != null) {
            return new Type[]{this.b};
        }
        return com.a.a.b.a.a;
    }

    public final boolean equals(Object object) {
        return object instanceof WildcardType && com.a.a.b.a.a((Type)this, (WildcardType)object);
    }

    public final int hashCode() {
        return (this.b != null ? 31 + this.b.hashCode() : 1) ^ 31 + this.a.hashCode();
    }

    public final String toString() {
        if (this.b != null) {
            return "? super " + com.a.a.b.a.d(this.b);
        }
        if (this.a == Object.class) {
            return "?";
        }
        return "? extends " + com.a.a.b.a.d(this.a);
    }
}

