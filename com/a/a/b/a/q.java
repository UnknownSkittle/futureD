/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.a.b;
import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b.a;
import com.a.a.b.a.g;
import com.a.a.b.a.r;
import com.a.a.b.a.s;
import com.a.a.b.ah;
import com.a.a.b.e;
import com.a.a.b.t;
import com.a.a.j;
import com.a.a.k;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class q
implements ai {
    private final e a;
    private final j b;
    private final t c;
    private final g d;
    private final com.a.a.b.b.b e = com.a.a.b.b.b.a();

    public q(e e2, j j2, t t2, g g2) {
        this.a = e2;
        this.b = j2;
        this.c = t2;
        this.d = g2;
    }

    private boolean a(Field field, boolean bl2) {
        t t2 = this.c;
        return !t2.a(field.getType(), bl2) && !t2.a(field, bl2);
    }

    private List<String> a(Field stringArray) {
        String[] stringArray2 = stringArray.getAnnotation(b.class);
        if (stringArray2 == null) {
            return Collections.singletonList(this.b.a((Field)stringArray));
        }
        stringArray = stringArray2.a();
        if ((stringArray2 = stringArray2.b()).length == 0) {
            return Collections.singletonList(stringArray);
        }
        ArrayList<String> arrayList = new ArrayList<String>(stringArray2.length + 1);
        arrayList.add((String)stringArray);
        stringArray = stringArray2;
        int n2 = stringArray2.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = stringArray[i2];
            arrayList.add(string);
        }
        return arrayList;
    }

    @Override
    public final <T> ag<T> a(k k2, com.a.a.c.a<T> a2) {
        Class<T> clazz = a2.getRawType();
        if (!Object.class.isAssignableFrom(clazz)) {
            return null;
        }
        com.a.a.b.ag<T> ag2 = this.a.a(a2);
        return new s<T>(ag2, this.a(k2, a2, clazz));
    }

    private Map<String, com.a.a.b.a.t> a(k k2, com.a.a.c.a<?> a2, Class<?> clazz) {
        LinkedHashMap<String, com.a.a.b.a.t> linkedHashMap = new LinkedHashMap<String, com.a.a.b.a.t>();
        if (clazz.isInterface()) {
            return linkedHashMap;
        }
        Type type = a2.getType();
        while (clazz != Object.class) {
            for (Field field : clazz.getDeclaredFields()) {
                boolean bl2 = this.a(field, true);
                boolean bl3 = this.a(field, false);
                if (!bl2 && !bl3) continue;
                this.e.a(field);
                Type type2 = com.a.a.b.a.a(a2.getType(), clazz, field.getGenericType());
                List<String> list = this.a(field);
                Object object = null;
                int n2 = list.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    boolean bl4;
                    Object object2 = list.get(i2);
                    if (i2 != 0) {
                        bl2 = false;
                    }
                    boolean bl5 = bl3;
                    boolean bl6 = bl2;
                    com.a.a.c.a<?> a3 = com.a.a.c.a.get(type2);
                    String string = object2;
                    Field field2 = field;
                    k k3 = k2;
                    Object object3 = this;
                    boolean bl7 = ah.a(a3.getRawType());
                    com.a.a.a.a a4 = field2.getAnnotation(com.a.a.a.a.class);
                    ag<?> ag2 = null;
                    if (a4 != null) {
                        ag2 = g.a(((q)object3).a, k3, a3, a4);
                    }
                    boolean bl8 = bl4 = ag2 != null;
                    if (ag2 == null) {
                        ag2 = k3.a(a3);
                    }
                    object3 = new r((q)object3, string, bl6, bl5, field2, bl4, ag2, k3, a3, bl7);
                    object2 = linkedHashMap.put((String)object2, (com.a.a.b.a.t)object3);
                    if (object != null) continue;
                    object = object2;
                }
                if (object == null) continue;
                throw new IllegalArgumentException(type + " declares multiple JSON fields named " + ((com.a.a.b.a.t)object).a);
            }
            Class<?> clazz2 = clazz;
            a2 = com.a.a.c.a.get(com.a.a.b.a.a(a2.getType(), clazz2, clazz2.getGenericSuperclass()));
            clazz = a2.getRawType();
        }
        return linkedHashMap;
    }
}

