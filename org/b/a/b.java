/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.b.a;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public enum b {
    a(40, "ERROR"),
    b(30, "WARN"),
    c(20, "INFO"),
    d(10, "DEBUG"),
    e(0, "TRACE");

    private int f;
    private String g;

    private b(int n3, String string2) {
        this.f = n3;
        this.g = string2;
    }

    public final String toString() {
        return this.g;
    }
}

