/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum o {
    a(0),
    b(1),
    c(32771),
    d(32772),
    e(32775),
    f(32780),
    g(32781),
    h(32782);

    private final int i;
    private static final Map<Integer, o> j;

    private o(int n3) {
        this.i = n3;
    }

    public static o a(int n2) {
        return j.get(n2);
    }

    static {
        HashMap<Integer, o> hashMap = new HashMap<Integer, o>();
        for (o o2 : o.values()) {
            hashMap.put(o2.i, o2);
        }
        j = Collections.unmodifiableMap(hashMap);
    }
}

