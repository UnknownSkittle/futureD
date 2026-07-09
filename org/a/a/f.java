/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import org.a.a.g;
import org.a.b.v;

public final class f {
    public final v a;
    public final int b;
    public final boolean c;
    public final f d;
    public final g e;
    public boolean f = true;
    public boolean g = false;

    public static f a(v v2, int n2, f f2, g g2) {
        return new f(v2, n2, f2, g2, false);
    }

    public static f b(v v2, int n2, f f2, g g2) {
        return new f(v2, n2, f2, g2, true);
    }

    private f(v v2, int n2, f f2, g g2, boolean bl2) {
        this.a = v2;
        this.b = n2;
        this.c = bl2;
        this.d = f2;
        this.e = g2;
    }
}

