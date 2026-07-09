/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum n {
    a(26113),
    b(26114),
    c(26115),
    d(26121),
    e(26126),
    f(26127),
    g(26128),
    h(26370),
    i(26625),
    j(65535);

    private final int k;
    private static final Map<Integer, n> l;

    private n(int n3) {
        this.k = n3;
    }

    public static n a(int n2) {
        return l.get(n2);
    }

    static {
        HashMap<Integer, n> hashMap = new HashMap<Integer, n>();
        for (n n2 : n.values()) {
            hashMap.put(n2.k, n2);
        }
        l = Collections.unmodifiableMap(hashMap);
    }
}

