/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.c.a;

import java.io.Serializable;

public class a
implements Serializable,
org.apache.commons.c.a {
    private String a;
    private transient org.b.c.a b;

    a(org.b.c.a a2) {
        this.b = a2;
        this.a = a2.a();
    }

    public final boolean a() {
        return this.b.b();
    }

    public final boolean c() {
        return this.b.c();
    }

    public final boolean d() {
        return this.b.d();
    }

    public final boolean b() {
        return this.b.e();
    }

    public final void a(Object object) {
    }

    public final void a(Object object, Throwable throwable) {
    }

    public final void b(Object object) {
    }

    public final void c(Object object) {
    }

    public final void b(Object object, Throwable throwable) {
    }

    public final void d(Object object) {
    }

    public final void c(Object object, Throwable throwable) {
    }

    static {
        a.class.getName();
    }
}

