/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import org.a.a.a;
import org.a.a.aa;
import org.a.a.c.g;
import org.a.b.s;
import org.a.c.a.b;
import org.a.c.a.f;

public final class z
extends b {
    private final s a = new s();
    private a b = new a();

    @Override
    public final org.a.b.a b() {
        return this.a;
    }

    @Override
    public final org.a.c.a.a a(f f2) {
        if (!f2.g()) {
            return org.a.c.a.a.a(f2.c());
        }
        return null;
    }

    @Override
    public final void a(CharSequence charSequence) {
        this.b.a(charSequence);
    }

    @Override
    public final void c() {
    }

    public final void a(aa aa2) {
        int n2;
        String string = this.b.a();
        boolean bl2 = false;
        while (string.length() > 3 && string.charAt(0) == '[' && (n2 = aa2.a(string)) != 0) {
            string = string.substring(n2);
            bl2 = true;
        }
        if (bl2 && g.a(string)) {
            this.a.l();
            this.b = null;
            return;
        }
        this.b = new a(string);
    }

    @Override
    public final void a(org.a.c.a a2) {
        if (this.b != null) {
            a2.a(this.b.a(), this.a);
        }
    }

    public final String d() {
        return this.b.a();
    }
}

