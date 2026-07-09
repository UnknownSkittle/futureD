/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.b;

import org.a.b.q;
import org.a.b.x;

public class l
extends q {
    private String a;
    private String b;

    public l() {
    }

    public l(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    public final void a(x x2) {
        x2.a(this);
    }

    public final String a() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    @Override
    protected final String e_() {
        return "destination=" + this.a + ", title=" + this.b;
    }
}

