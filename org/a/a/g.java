/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import org.a.b.v;
import org.a.c.b.b;

public final class g
implements b {
    public final v a;
    public final char b;
    public final boolean c;
    public final boolean d;
    public g e;
    public g f;
    public int g = 1;
    public int h = 1;

    public g(v v2, char c2, boolean bl2, boolean bl3, g g2) {
        this.a = v2;
        this.b = c2;
        this.c = bl2;
        this.d = bl3;
        this.e = g2;
    }

    @Override
    public final boolean a() {
        return this.c;
    }

    @Override
    public final boolean b() {
        return this.d;
    }

    @Override
    public final int c() {
        return this.g;
    }

    @Override
    public final int d() {
        return this.h;
    }
}

