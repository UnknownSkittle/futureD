/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.d;

import com.a.a.b.a.h;
import com.a.a.b.w;
import com.a.a.d.a;

final class b
extends w {
    b() {
    }

    @Override
    public final void a(a a2) {
        if (a2 instanceof h) {
            ((h)a2).o();
            return;
        }
        int n2 = a2.a;
        if (n2 == 0) {
            n2 = a2.r();
        }
        if (n2 == 13) {
            a2.a = 9;
            return;
        }
        if (n2 == 12) {
            a2.a = 8;
            return;
        }
        if (n2 == 14) {
            a2.a = 10;
            return;
        }
        throw new IllegalStateException("Expected a name but was " + (Object)((Object)a2.f()) + a2.s());
    }
}

