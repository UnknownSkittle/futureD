/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import org.a.a.c.g;
import org.a.b.i;
import org.a.c.a.a;
import org.a.c.a.b;
import org.a.c.a.f;

public final class m
extends b {
    private final i a = new i();
    private final String b;

    public m(int n2, String string) {
        this.a.a(n2);
        this.b = string;
    }

    @Override
    public final org.a.b.a b() {
        return this.a;
    }

    @Override
    public final a a(f f2) {
        return null;
    }

    @Override
    public final void a(org.a.c.a a2) {
        a2.a(this.b, this.a);
    }

    private static boolean a(CharSequence charSequence, int n2, char c2) {
        return g.b(charSequence, n2 = g.a(c2, charSequence, n2, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    static /* synthetic */ int a(CharSequence charSequence, int n2) {
        switch (charSequence.charAt(n2)) {
            case '=': {
                if (m.a(charSequence, n2 + 1, '=')) {
                    return 1;
                }
            }
            case '-': {
                if (!m.a(charSequence, n2 + 1, '-')) break;
                return 2;
            }
        }
        return 0;
    }
}

