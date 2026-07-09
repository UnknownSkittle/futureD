/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.c.a;

import java.io.Serializable;
import org.apache.commons.c.a;

public final class b
implements Serializable,
a {
    private String a;
    private transient org.b.b b;

    b(org.b.b b2) {
        this.b = b2;
        this.a = b2.a();
    }

    public final boolean a() {
        return this.b.b();
    }

    public final boolean b() {
        return this.b.e();
    }

    public final boolean c() {
        return this.b.c();
    }

    public final boolean d() {
        return this.b.d();
    }

    public final void a(Object object) {
        this.b.a(String.valueOf(object));
    }

    public final void a(Object object, Throwable throwable) {
        this.b.a(String.valueOf(object), throwable);
    }

    public final void b(Object object) {
        this.b.b(String.valueOf(object));
    }

    public final void c(Object object) {
        this.b.c(String.valueOf(object));
    }

    public final void b(Object object, Throwable throwable) {
        this.b.b(String.valueOf(object), throwable);
    }

    public final void d(Object object) {
        this.b.d(String.valueOf(object));
    }

    public final void c(Object object, Throwable throwable) {
        this.b.c(String.valueOf(object), throwable);
    }
}

