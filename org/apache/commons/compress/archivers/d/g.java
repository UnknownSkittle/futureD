/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.d;

public enum g {
    c(14),
    d(12),
    e(10),
    f(8),
    g(6),
    a(4),
    h(2),
    i(1),
    b(15);

    private int j;

    private g(int n3) {
        this.j = n3;
    }

    public static g a(int n2) {
        g g2 = b;
        for (g g3 : org.apache.commons.compress.archivers.d.g.values()) {
            if (n2 != g3.j) continue;
            g2 = g3;
        }
        return g2;
    }
}

