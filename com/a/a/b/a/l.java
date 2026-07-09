/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b.a;
import com.a.a.b.a.ab;
import com.a.a.b.a.m;
import com.a.a.b.e;
import com.a.a.k;
import java.lang.reflect.Type;
import java.util.Map;

public final class l
implements ai {
    private final e a;
    private boolean b;

    public l(e e2) {
        this.a = e2;
        this.b = false;
    }

    @Override
    public final <T> ag<T> a(k k2, com.a.a.c.a<T> object) {
        Type[] typeArray = ((com.a.a.c.a)object).getType();
        Object object2 = ((com.a.a.c.a)object).getRawType();
        if (!Map.class.isAssignableFrom((Class<?>)object2)) {
            return null;
        }
        object2 = com.a.a.b.a.c((Type)typeArray);
        typeArray = com.a.a.b.a.b((Type)typeArray, object2);
        Object object3 = typeArray[0];
        object2 = k2;
        object2 = object3 == Boolean.TYPE || object3 == Boolean.class ? ab.c : ((k)object2).a(com.a.a.c.a.get((Type)object3));
        object3 = k2.a(com.a.a.c.a.get(typeArray[1]));
        object = this.a.a(object);
        return new m(this, k2, typeArray[0], (ag)object2, typeArray[1], (ag)object3, (com.a.a.b.ag)object);
    }
}

