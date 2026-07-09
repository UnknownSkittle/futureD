/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.d.a;

import org.a.b.h;
import org.a.b.t;
import org.a.b.v;
import org.a.b.x;

final class b
extends x {
    private final StringBuilder a = new StringBuilder();

    private b() {
    }

    final String a() {
        return this.a.toString();
    }

    @Override
    public final void a(v v2) {
        this.a.append(v2.a());
    }

    @Override
    public final void a(t t2) {
        this.a.append('\n');
    }

    @Override
    public final void a(h h2) {
        this.a.append('\n');
    }

    /* synthetic */ b(byte by2) {
        this();
    }
}

