/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum aw {
    a(0),
    b(1),
    g(2),
    h(3),
    i(4),
    j(5),
    c(6),
    k(7),
    d(8),
    e(9),
    l(10),
    f(12),
    m(14),
    n(95),
    o(96),
    p(97),
    q(98),
    r(99),
    s;

    private final int t;
    private static final Map<Integer, aw> u;

    private aw() {
        this(-1);
    }

    private aw(int n3) {
        this.t = n3;
    }

    public final int a() {
        return this.t;
    }

    public static aw a(int n2) {
        return u.get(n2);
    }

    static {
        HashMap<Integer, aw> hashMap = new HashMap<Integer, aw>();
        for (aw aw2 : aw.values()) {
            hashMap.put(aw2.t, aw2);
        }
        u = Collections.unmodifiableMap(hashMap);
    }
}

