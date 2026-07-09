/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import org.apache.a.e;
import org.apache.a.h;
import org.apache.a.j.b;
import org.apache.a.j.r;
import org.apache.a.k.c;
import org.apache.a.p;

public abstract class a
implements p {
    protected r a = new r();
    @Deprecated
    protected c b = null;

    @Deprecated
    private a() {
    }

    protected a(byte by2) {
        this();
    }

    @Override
    public final boolean a(String string) {
        return this.a.c(string);
    }

    @Override
    public final e[] b(String string) {
        return this.a.a(string);
    }

    @Override
    public final e c(String string) {
        return this.a.b(string);
    }

    @Override
    public final e[] d() {
        return this.a.b();
    }

    @Override
    public final void a(e e2) {
        this.a.a(e2);
    }

    @Override
    public final void a(String string, String string2) {
        ai.a(string, "Header name");
        this.a.a(new b(string, string2));
    }

    @Override
    public final void b(String string, String string2) {
        ai.a(string, "Header name");
        this.a.b(new b(string, string2));
    }

    @Override
    public final void a(e[] eArray) {
        this.a.a(eArray);
    }

    @Override
    public final void d(String string) {
        if (string == null) {
            return;
        }
        h h2 = this.a.c();
        while (h2.hasNext()) {
            e e2 = h2.a();
            if (!string.equalsIgnoreCase(e2.c())) continue;
            h2.remove();
        }
    }

    @Override
    public final h e() {
        return this.a.c();
    }

    @Override
    public final h e(String string) {
        return this.a.d(string);
    }

    @Override
    @Deprecated
    public c f() {
        if (this.b == null) {
            this.b = new org.apache.a.k.b();
        }
        return this.b;
    }
}

