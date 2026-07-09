/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import org.apache.a.f.b;
import org.apache.a.f.c;
import org.apache.a.f.f;
import org.apache.a.f.m;
import org.apache.a.h.d.a;

public final class j
extends a
implements b {
    @Override
    public final void a(m m2, String string) {
        ai.a(m2, "Cookie");
        m2.i();
    }

    @Override
    public final boolean b(c c2, f f2) {
        ai.a(c2, "Cookie");
        ai.a(f2, "Cookie origin");
        return !c2.g() || f2.d();
    }

    @Override
    public final String a() {
        return "secure";
    }
}

