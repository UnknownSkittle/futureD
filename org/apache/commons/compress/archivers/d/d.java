/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.d;

public enum d {
    f(1),
    a(2),
    b(3),
    c(4),
    d(5),
    e(6);

    private int g;

    private d(int n3) {
        this.g = n3;
    }

    public static d a(int n2) {
        for (d d2 : org.apache.commons.compress.archivers.d.d.values()) {
            if (d2.g != n2) continue;
            return d2;
        }
        return null;
    }
}

