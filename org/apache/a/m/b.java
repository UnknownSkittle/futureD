/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.m;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

final class b<E> {
    private final LinkedList<E> a = new LinkedList();
    private final Map<Class<?>, E> b = new HashMap();

    public final b<E> a(E e2) {
        if (e2 == null) {
            return this;
        }
        E e3 = e2;
        b b2 = this;
        E e4 = b2.b.remove(e3.getClass());
        if (e4 != null) {
            b2.a.remove(e4);
        }
        b2.b.put(e3.getClass(), e3);
        this.a.addLast(e2);
        return this;
    }

    public final b<E> a(E ... EArray) {
        if (EArray == null) {
            return this;
        }
        for (E e2 : EArray) {
            this.a(e2);
        }
        return this;
    }

    public final LinkedList<E> a() {
        return new LinkedList<E>(this.a);
    }
}

