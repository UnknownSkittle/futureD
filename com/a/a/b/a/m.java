/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ac;
import com.a.a.ag;
import com.a.a.b.a.aa;
import com.a.a.b.a.l;
import com.a.a.b.w;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import com.a.a.k;
import java.lang.reflect.Type;
import java.util.Map;

final class m<K, V>
extends ag<Map<K, V>> {
    private final ag<K> a;
    private final ag<V> b;
    private final com.a.a.b.ag<? extends Map<K, V>> c;
    private /* synthetic */ l d;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public m(l l2, k k2, Type type, ag ag2, Type type2, ag ag3, com.a.a.b.ag ag4) {
        this.d = l2;
        this.a = new aa<K>(k2, ag2, type);
        this.b = new aa<V>(k2, ag3, type2);
        this.c = ag4;
    }

    @Override
    public final /* synthetic */ Object read(a object) {
        a a2 = object;
        object = this;
        c c2 = a2.f();
        if (c2 == com.a.a.d.c.i) {
            a2.j();
            return null;
        }
        Map<c, V> map = ((m)object).c.a();
        if (c2 == com.a.a.d.c.a) {
            a2.a();
            while (a2.e()) {
                a2.a();
                c2 = ((m)object).a.read(a2);
                V v2 = ((m)object).b.read(a2);
                if (map.put(c2, v2) != null) {
                    throw new ac("duplicate key: ".concat(String.valueOf((Object)c2)));
                }
                a2.b();
            }
            a2.b();
        } else {
            a2.c();
            while (a2.e()) {
                V v3;
                w.a.a(a2);
                c2 = ((m)object).a.read(a2);
                if (map.put(c2, v3 = ((m)object).b.read(a2)) == null) continue;
                throw new ac("duplicate key: ".concat(String.valueOf((Object)c2)));
            }
            a2.d();
        }
        return map;
    }

    @Override
    public final /* synthetic */ void write(d object, Object object2) {
        Map map = (Map)object2;
        object2 = object;
        object = this;
        if (map == null) {
            ((d)object2).f();
            return;
        }
        ((d)object2).d();
        for (Map.Entry entry : map.entrySet()) {
            ((d)object2).a(String.valueOf(entry.getKey()));
            ((m)object).b.write((d)object2, entry.getValue());
        }
        ((d)object2).e();
    }
}

