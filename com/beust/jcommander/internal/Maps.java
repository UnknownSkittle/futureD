/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.internal;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {
    public static <K, V> Map<K, V> newHashMap() {
        return new HashMap();
    }

    public static <K, V> Map<K, V> newLinkedHashMap() {
        return new LinkedHashMap();
    }

    public static <T> Map<T, T> newHashMap(T ... TArray) {
        Map<T, T> map = Maps.newHashMap();
        for (int i2 = 0; i2 < TArray.length; i2 += 2) {
            map.put(TArray[i2], TArray[i2 + 1]);
        }
        return map;
    }
}

