/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.a;

import com.a.a.b.ai;
import java.nio.charset.Charset;
import org.apache.a.a.j;
import org.apache.a.c;
import org.apache.a.e;
import org.apache.a.h.a.aa;
import org.apache.a.m.d;
import org.apache.a.q;
import org.apache.commons.a.a.a;

public final class b
extends aa {
    private boolean a = false;

    public b(Charset charset) {
        super(charset);
    }

    public b() {
        this(c.b);
    }

    @Override
    public final String a() {
        return "basic";
    }

    @Override
    public final void a(e e2) {
        super.a(e2);
        this.a = true;
    }

    @Override
    public final boolean d() {
        return this.a;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    @Deprecated
    public final e a(j j2, q q2) {
        return this.a(j2, q2, new org.apache.a.m.a());
    }

    @Override
    public final e a(j object, q object2, d object3) {
        ai.a(object, "Credentials");
        ai.a(object2, "HTTP request");
        object3 = new StringBuilder();
        ((StringBuilder)object3).append(object.a().getName());
        ((StringBuilder)object3).append(":");
        ((StringBuilder)object3).append(object.b() == null ? "null" : object.b());
        object = new a(0).c(ai.a(((StringBuilder)object3).toString(), this.a((q)object2)));
        object2 = new org.apache.a.n.b(32);
        if (this.e()) {
            ((org.apache.a.n.b)object2).a("Proxy-Authorization");
        } else {
            ((org.apache.a.n.b)object2).a("Authorization");
        }
        ((org.apache.a.n.b)object2).a(": Basic ");
        ((org.apache.a.n.b)object2).a((byte[])object, 0, ((Object)object).length);
        return new org.apache.a.j.q((org.apache.a.n.b)object2);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BASIC [complete=").append(this.a).append("]");
        return stringBuilder.toString();
    }
}

