/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.l;

import java.io.Serializable;

public final class f
implements Serializable {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public f(int n2, int n3, int n4, int n5) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[leased: ");
        stringBuilder.append(this.a);
        stringBuilder.append("; pending: ");
        stringBuilder.append(this.b);
        stringBuilder.append("; available: ");
        stringBuilder.append(this.c);
        stringBuilder.append("; max: ");
        stringBuilder.append(this.d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

