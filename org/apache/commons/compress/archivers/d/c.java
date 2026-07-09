/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.d;

public enum c {
    a(0),
    b(1),
    c(2);

    private int d;

    private c(int n3) {
        this.d = n3;
    }

    public static c a(int n2) {
        for (c c2 : org.apache.commons.compress.archivers.d.c.values()) {
            if (c2.d != n2) continue;
            return c2;
        }
        return null;
    }
}

