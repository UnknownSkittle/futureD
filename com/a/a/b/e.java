/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.b;
import com.a.a.b.ag;
import com.a.a.b.f;
import com.a.a.b.g;
import com.a.a.b.h;
import com.a.a.b.i;
import com.a.a.b.j;
import com.a.a.b.k;
import com.a.a.b.l;
import com.a.a.b.m;
import com.a.a.b.n;
import com.a.a.b.o;
import com.a.a.b.p;
import com.a.a.b.q;
import com.a.a.b.r;
import com.a.a.b.s;
import com.a.a.c.a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public final class e {
    private final Map<Type, b<?>> a;
    private final com.a.a.b.b.b b = com.a.a.b.b.b.a();

    public e(Map<Type, b<?>> map) {
        this.a = map;
    }

    public final <T> ag<T> a(a<T> object) {
        Type type = ((a)object).getType();
        object = ((a)object).getRawType();
        Object object2 = this.a.get(type);
        if (object2 != null) {
            return new f(this, (b)object2, type);
        }
        object2 = this.a.get(object);
        if (object2 != null) {
            return new l(this, (b)object2, type);
        }
        object2 = this.a((Class<? super T>)object);
        if (object2 != null) {
            return object2;
        }
        Object object3 = object;
        Type type2 = type;
        object2 = this;
        Object object4 = Collection.class.isAssignableFrom((Class<?>)object3) ? (SortedSet.class.isAssignableFrom((Class<?>)object3) ? new n((e)object2) : (EnumSet.class.isAssignableFrom((Class<?>)object3) ? new o((e)object2, type2) : (Set.class.isAssignableFrom((Class<?>)object3) ? new p((e)object2) : (Queue.class.isAssignableFrom((Class<?>)object3) ? new q((e)object2) : new r((e)object2))))) : (Map.class.isAssignableFrom((Class<?>)object3) ? (ConcurrentNavigableMap.class.isAssignableFrom((Class<?>)object3) ? new s((e)object2) : (ConcurrentMap.class.isAssignableFrom((Class<?>)object3) ? new g((e)object2) : (SortedMap.class.isAssignableFrom((Class<?>)object3) ? new h((e)object2) : (type2 instanceof ParameterizedType && !String.class.isAssignableFrom(com.a.a.c.a.get(((ParameterizedType)type2).getActualTypeArguments()[0]).getRawType()) ? new i((e)object2) : new j((e)object2))))) : (object2 = null));
        if (object4 != null) {
            return object2;
        }
        object3 = object;
        type2 = type;
        object2 = this;
        return new k((e)object2, (Class)object3, type2);
    }

    private <T> ag<T> a(Class<? super T> genericDeclaration) {
        try {
            genericDeclaration = genericDeclaration.getDeclaredConstructor(new Class[0]);
            if (!((AccessibleObject)((Object)genericDeclaration)).isAccessible()) {
                this.b.a((AccessibleObject)((Object)genericDeclaration));
            }
            return new m(this, (Constructor)genericDeclaration);
        } catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}

