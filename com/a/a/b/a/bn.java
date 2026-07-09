/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.a.b;
import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import java.util.HashMap;
import java.util.Map;

final class bn<T extends Enum<T>>
extends ag<T> {
    private final Map<String, T> a = new HashMap<String, T>();
    private final Map<T, String> b = new HashMap<T, String>();

    public bn(Class<T> clazz) {
        try {
            for (Enum enum_ : (Enum[])clazz.getEnumConstants()) {
                String string = enum_.name();
                String[] stringArray = clazz.getField(string).getAnnotation(b.class);
                if (stringArray != null) {
                    string = stringArray.a();
                    for (String string2 : stringArray.b()) {
                        this.a.put(string2, enum_);
                    }
                }
                this.a.put(string, enum_);
                this.b.put(enum_, string);
            }
            return;
        } catch (NoSuchFieldException noSuchFieldException) {
            throw new AssertionError((Object)noSuchFieldException);
        }
    }

    @Override
    public final /* synthetic */ Object read(a object) {
        a a2 = object;
        object = this;
        if (a2.f() == c.i) {
            a2.j();
            return null;
        }
        return (Enum)((bn)object).a.get(a2.h());
    }

    @Override
    public final /* synthetic */ void write(d object, Object object2) {
        Enum enum_ = (Enum)object2;
        object2 = object;
        object = this;
        ((d)object2).b(enum_ == null ? null : ((bn)object).b.get(enum_));
    }
}

