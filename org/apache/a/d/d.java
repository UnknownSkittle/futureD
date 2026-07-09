/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.d;

import org.apache.a.d.e;

public final class d
implements Cloneable {
    public static final d a = new e().a();
    private final int b;
    private final int c;

    d(int n2, int n3) {
        this.b = n2;
        this.c = n3;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[maxLineLength=").append(this.b).append(", maxHeaderCount=").append(this.c).append("]");
        return stringBuilder.toString();
    }
}

