/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b.a.aa;
import com.a.a.b.a.b;
import com.a.a.d.c;
import com.a.a.d.d;
import com.a.a.k;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class a<E>
extends ag<Object> {
    public static final ai a = new b();
    private final Class<E> b;
    private final ag<E> c;

    public a(k k2, ag<E> ag2, Class<E> clazz) {
        this.c = new aa<E>(k2, ag2, clazz);
        this.b = clazz;
    }

    @Override
    public final Object read(com.a.a.d.a object) {
        if (((com.a.a.d.a)object).f() == com.a.a.d.c.i) {
            ((com.a.a.d.a)object).j();
            return null;
        }
        ArrayList<E> arrayList = new ArrayList<E>();
        ((com.a.a.d.a)object).a();
        while (((com.a.a.d.a)object).e()) {
            E e2 = this.c.read((com.a.a.d.a)object);
            arrayList.add(e2);
        }
        ((com.a.a.d.a)object).b();
        int n2 = arrayList.size();
        object = Array.newInstance(this.b, n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            Array.set(object, i2, arrayList.get(i2));
        }
        return object;
    }

    @Override
    public final void write(d d2, Object object) {
        if (object == null) {
            d2.f();
            return;
        }
        d2.b();
        int n2 = Array.getLength(object);
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object2 = Array.get(object, i2);
            this.c.write(d2, object2);
        }
        d2.c();
    }
}

