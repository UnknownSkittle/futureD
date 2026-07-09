/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.aa;
import com.a.a.ag;
import com.a.a.b.x;
import com.a.a.d.a;
import com.a.a.d.d;
import com.a.a.s;
import com.a.a.v;
import com.a.a.y;
import java.util.Map;

final class ay
extends ag<v> {
    ay() {
    }

    private v a(a object) {
        switch (((a)object).f()) {
            case f: {
                return new aa(((a)object).h());
            }
            case g: {
                object = ((a)object).h();
                return new aa(new x((String)object));
            }
            case h: {
                return new aa(((a)object).i());
            }
            case i: {
                ((a)object).j();
                return com.a.a.x.a;
            }
            case a: {
                s s2 = new s();
                ((a)object).a();
                while (((a)object).e()) {
                    s2.a(this.a((a)object));
                }
                ((a)object).b();
                return s2;
            }
            case c: {
                y y2 = new y();
                ((a)object).c();
                while (((a)object).e()) {
                    y2.a(((a)object).g(), this.a((a)object));
                }
                ((a)object).d();
                return y2;
            }
        }
        throw new IllegalArgumentException();
    }

    private void a(d d2, v iterator) {
        if (iterator == null || iterator instanceof com.a.a.x) {
            d2.f();
            return;
        }
        if (iterator instanceof aa) {
            if (!(iterator instanceof aa)) {
                throw new IllegalStateException("Not a JSON Primitive: ".concat(String.valueOf(iterator)));
            }
            iterator = (aa)((Object)iterator);
            if (((aa)((Object)iterator)).i()) {
                d2.a(((aa)((Object)iterator)).a());
                return;
            }
            if (((aa)((Object)iterator)).h()) {
                d2.a(((aa)((Object)iterator)).f());
                return;
            }
            d2.b(((aa)((Object)iterator)).b());
            return;
        }
        if (iterator instanceof s) {
            d2.b();
            if (!(iterator instanceof s)) {
                throw new IllegalStateException("Not a JSON Array: ".concat(String.valueOf(iterator)));
            }
            for (v v2 : (s)((Object)iterator)) {
                this.a(d2, v2);
            }
            d2.c();
            return;
        }
        if (iterator instanceof y) {
            d2.d();
            for (Map.Entry<String, v> entry : ((v)((Object)iterator)).g().h()) {
                d2.a(entry.getKey());
                this.a(d2, entry.getValue());
            }
            d2.e();
            return;
        }
        throw new IllegalArgumentException("Couldn't write " + iterator.getClass());
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        return this.a(a2);
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        this.a(d2, (v)object);
    }
}

