/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.b.a.aa;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.k;
import java.lang.reflect.Type;
import java.util.Collection;

final class d<E>
extends ag<Collection<E>> {
    private final ag<E> a;
    private final com.a.a.b.ag<? extends Collection<E>> b;

    public d(k k2, Type type, ag<E> ag2, com.a.a.b.ag<? extends Collection<E>> ag3) {
        this.a = new aa<E>(k2, ag2, type);
        this.b = ag3;
    }

    @Override
    public final /* synthetic */ Object read(a object) {
        a a2 = object;
        object = this;
        if (a2.f() == c.i) {
            a2.j();
            return null;
        }
        Collection<E> collection = ((d)object).b.a();
        a2.a();
        while (a2.e()) {
            E e2 = ((d)object).a.read(a2);
            collection.add(e2);
        }
        a2.b();
        return collection;
    }

    @Override
    public final /* synthetic */ void write(com.a.a.d.d object, Object object2) {
        Object object3 = (Collection)object2;
        object2 = object;
        object = this;
        if (object3 == null) {
            ((com.a.a.d.d)object2).f();
            return;
        }
        ((com.a.a.d.d)object2).b();
        object3 = object3.iterator();
        while (object3.hasNext()) {
            Object e2 = object3.next();
            ((d)object).a.write((com.a.a.d.d)object2, e2);
        }
        ((com.a.a.d.d)object2).c();
    }
}

