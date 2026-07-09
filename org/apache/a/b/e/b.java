/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.e;

import org.apache.a.b.e.a;
import org.apache.a.m.d;
import org.apache.a.q;
import org.apache.a.r;

public final class b
implements r {
    private final String a;

    private b() {
        this.a = "gzip,deflate";
    }

    public b(byte by2) {
        this();
    }

    @Override
    public final void a(q q2, d object) {
        object = org.apache.a.b.e.a.a((d)object).i();
        if (!q2.a("Accept-Encoding") && ((org.apache.a.b.a.a)object).p()) {
            q2.a("Accept-Encoding", this.a);
        }
    }
}

