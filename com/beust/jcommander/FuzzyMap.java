/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.FuzzyMap$IKey;
import com.beust.jcommander.ParameterException;
import com.beust.jcommander.internal.Maps;
import java.util.Iterator;
import java.util.Map;

public class FuzzyMap {
    public static <V> V findInMap(Map<? extends FuzzyMap$IKey, V> map, FuzzyMap$IKey fuzzyMap$IKey, boolean bl2, boolean bl3) {
        if (bl3) {
            return FuzzyMap.findAbbreviatedValue(map, fuzzyMap$IKey, bl2);
        }
        if (bl2) {
            return map.get(fuzzyMap$IKey);
        }
        for (FuzzyMap$IKey fuzzyMap$IKey2 : map.keySet()) {
            if (!fuzzyMap$IKey2.getName().equalsIgnoreCase(fuzzyMap$IKey.getName())) continue;
            return map.get(fuzzyMap$IKey2);
        }
        return null;
    }

    private static <V> V findAbbreviatedValue(Map<? extends FuzzyMap$IKey, V> map, FuzzyMap$IKey fuzzyMap$IKey, boolean bl2) {
        String string = fuzzyMap$IKey.getName();
        Map<String, V> map2 = Maps.newHashMap();
        for (FuzzyMap$IKey fuzzyMap$IKey2 : map.keySet()) {
            String string2 = fuzzyMap$IKey2.getName();
            if (!(bl2 && string2.startsWith(string) || !bl2 && string2.toLowerCase().startsWith(string.toLowerCase()))) continue;
            map2.put(string2, map.get(fuzzyMap$IKey2));
        }
        if (map2.size() > 1) {
            throw new ParameterException("Ambiguous option: " + fuzzyMap$IKey + " matches " + map2.keySet());
        }
        Iterator<FuzzyMap$IKey> iterator = map2.size() == 1 ? map2.values().iterator().next() : null;
        return (V)iterator;
    }
}

