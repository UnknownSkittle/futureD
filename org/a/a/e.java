/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import org.a.c.a.b;
import org.a.c.a.d;

public final class e
extends d {
    private final b[] a;
    private int b = -1;
    private int c = -1;
    private boolean d = false;

    public e(b ... bArray) {
        this.a = bArray;
    }

    public final b[] a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    @Override
    public final d a(int n2) {
        this.b = n2;
        return this;
    }

    @Override
    public final d b(int n2) {
        this.c = n2;
        return this;
    }

    @Override
    public final d e() {
        this.d = true;
        return this;
    }
}

