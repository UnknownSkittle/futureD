/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import org.a.a.c.g;
import org.a.c.a.a;
import org.a.c.a.b;
import org.a.c.a.f;

public final class c
extends b {
    private final org.a.b.b a = new org.a.b.b();

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean a(org.a.b.a a2) {
        return true;
    }

    @Override
    public final a a(f f2) {
        int n2 = f2.d();
        if (c.b(f2, n2)) {
            int n3 = f2.e() + f2.f() + 1;
            if (g.b(f2.b(), n2 + 1)) {
                ++n3;
            }
            return org.a.c.a.a.b(n3);
        }
        return null;
    }

    private static boolean b(f f2, int n2) {
        CharSequence charSequence = f2.b();
        return f2.f() < g.a && n2 < charSequence.length() && charSequence.charAt(n2) == '>';
    }

    static /* synthetic */ boolean a(f f2, int n2) {
        return c.b(f2, n2);
    }
}

