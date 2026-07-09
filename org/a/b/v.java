/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.b;

import org.a.b.q;
import org.a.b.x;

public class v
extends q {
    private String a;

    public v() {
    }

    public v(String string) {
        this.a = string;
    }

    @Override
    public final void a(x x2) {
        x2.a(this);
    }

    public final String a() {
        return this.a;
    }

    public final void a(String string) {
        this.a = string;
    }

    @Override
    protected final String e_() {
        return "literal=" + this.a;
    }
}

