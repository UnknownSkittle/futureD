/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.f;

import org.apache.a.ac;
import org.apache.a.af;
import org.apache.a.e;
import org.apache.a.h;
import org.apache.a.h.f.b;
import org.apache.a.h.f.i;
import org.apache.a.k;
import org.apache.a.s;

final class c
implements org.apache.a.b.c.b {
    private final s a;
    private final b b;

    public c(s s2, b b2) {
        this.a = s2;
        this.b = b2;
        k k2 = s2.b();
        if (k2 != null && k2.isStreaming() && b2 != null) {
            s2.a(new i(k2, b2));
        }
    }

    @Override
    public final void close() {
        if (this.b != null) {
            this.b.close();
        }
    }

    @Override
    public final af a() {
        return this.a.a();
    }

    @Override
    public final k b() {
        return this.a.b();
    }

    @Override
    public final void a(k k2) {
        this.a.a(k2);
    }

    @Override
    public final ac c() {
        return this.a.c();
    }

    @Override
    public final boolean a(String string) {
        return this.a.a(string);
    }

    @Override
    public final e[] b(String string) {
        return this.a.b(string);
    }

    @Override
    public final e c(String string) {
        return this.a.c(string);
    }

    @Override
    public final e[] d() {
        return this.a.d();
    }

    @Override
    public final void a(e e2) {
        this.a.a(e2);
    }

    @Override
    public final void a(String string, String string2) {
        this.a.a(string, string2);
    }

    @Override
    public final void b(String string, String string2) {
        this.a.b(string, string2);
    }

    @Override
    public final void a(e[] eArray) {
        this.a.a(eArray);
    }

    @Override
    public final void d(String string) {
        this.a.d(string);
    }

    @Override
    public final h e() {
        return this.a.e();
    }

    @Override
    public final h e(String string) {
        return this.a.e(string);
    }

    @Override
    @Deprecated
    public final org.apache.a.k.c f() {
        return this.a.f();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HttpResponseProxy{");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

