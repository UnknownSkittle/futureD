/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b.a.o;
import com.a.a.b.a.p;
import com.a.a.b.y;
import com.a.a.d.a;
import com.a.a.d.d;
import com.a.a.k;
import java.util.ArrayList;

public final class n
extends ag<Object> {
    public static final ai a = new o();
    private final k b;

    n(k k2) {
        this.b = k2;
    }

    @Override
    public final Object read(a a2) {
        Object object = a2.f();
        switch (p.a[((Enum)object).ordinal()]) {
            case 1: {
                object = new ArrayList();
                a2.a();
                while (a2.e()) {
                    object.add(this.read(a2));
                }
                a2.b();
                return object;
            }
            case 2: {
                object = new y();
                a2.c();
                while (a2.e()) {
                    object.put(a2.g(), this.read(a2));
                }
                a2.d();
                return object;
            }
            case 3: {
                return a2.h();
            }
            case 4: {
                return a2.k();
            }
            case 5: {
                return a2.i();
            }
            case 6: {
                a2.j();
                return null;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public final void write(d d2, Object object) {
        if (object == null) {
            d2.f();
            return;
        }
        ag<?> ag2 = this.b.a(object.getClass());
        if (ag2 instanceof n) {
            d2.d();
            d2.e();
            return;
        }
        ag2.write(d2, object);
    }
}

