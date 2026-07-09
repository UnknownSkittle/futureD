/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import org.a.b.o;
import org.a.b.p;
import org.a.b.s;
import org.a.c.a.a;
import org.a.c.a.b;
import org.a.c.a.f;

public final class y
extends b {
    private final p a = new p();
    private int b;
    private boolean c;

    public y(int n2) {
        this.b = n2;
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean a(org.a.b.a a2) {
        if (this.c && (a2 = this.a.a()) instanceof o) {
            ((o)a2).a(false);
        }
        return true;
    }

    @Override
    public final org.a.b.a b() {
        return this.a;
    }

    @Override
    public final a a(f f2) {
        if (f2.g()) {
            if (this.a.j() == null) {
                return null;
            }
            org.a.b.a a2 = f2.h().b();
            this.c = a2 instanceof s || a2 instanceof p;
            return org.a.c.a.a.a(f2.d());
        }
        if (f2.f() >= this.b) {
            return org.a.c.a.a.b(f2.e() + this.b);
        }
        return null;
    }
}

