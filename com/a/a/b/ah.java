/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.b.ai;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ah {
    private static final Map<Class<?>, Class<?>> a;

    private static void a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> clazz, Class<?> clazz2) {
        map.put(clazz, clazz2);
        map2.put(clazz2, clazz);
    }

    public static boolean a(Type type) {
        return a.containsKey(type);
    }

    public static <T> Class<T> a(Class<T> clazz) {
        Class<?> clazz2 = a.get(ai.a(clazz));
        if (clazz2 == null) {
            return clazz;
        }
        return clazz2;
    }

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        ah.a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        ah.a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        ah.a(hashMap, hashMap2, Character.TYPE, Character.class);
        ah.a(hashMap, hashMap2, Double.TYPE, Double.class);
        ah.a(hashMap, hashMap2, Float.TYPE, Float.class);
        ah.a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        ah.a(hashMap, hashMap2, Long.TYPE, Long.class);
        ah.a(hashMap, hashMap2, Short.TYPE, Short.class);
        ah.a(hashMap, hashMap2, Void.TYPE, Void.class);
        a = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }
}

