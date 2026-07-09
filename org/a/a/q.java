/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import java.util.ArrayList;
import java.util.List;
import org.a.a.c.g;
import org.a.b.m;
import org.a.c.a.a;
import org.a.c.a.b;
import org.a.c.a.f;

public final class q
extends b {
    private final m a = new m();
    private final List<CharSequence> b = new ArrayList<CharSequence>();

    @Override
    public final org.a.b.a b() {
        return this.a;
    }

    @Override
    public final a a(f f2) {
        if (f2.f() >= g.a) {
            return org.a.c.a.a.b(f2.e() + g.a);
        }
        if (f2.g()) {
            return org.a.c.a.a.a(f2.d());
        }
        return null;
    }

    @Override
    public final void a(CharSequence charSequence) {
        this.b.add(charSequence);
    }

    @Override
    public final void c() {
        int n2;
        for (n2 = this.b.size() - 1; n2 >= 0 && g.a(this.b.get(n2)); --n2) {
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < n2 + 1; ++i2) {
            stringBuilder.append(this.b.get(i2));
            stringBuilder.append('\n');
        }
        String string = stringBuilder.toString();
        this.a.a(string);
    }
}

