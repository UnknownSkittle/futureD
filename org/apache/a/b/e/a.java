/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.e;

import org.apache.a.a.c;
import org.apache.a.b.e;
import org.apache.a.b.f;
import org.apache.a.e.a.b;
import org.apache.a.f.k;
import org.apache.a.m.d;

public final class a
extends org.apache.a.m.e {
    public static a a(d d2) {
        if (d2 instanceof a) {
            return (a)d2;
        }
        return new a(d2);
    }

    private a(d d2) {
        super(d2);
    }

    public a() {
    }

    public final org.apache.a.e.a.e a() {
        return this.a("http.route", b.class);
    }

    public final e b() {
        return this.a("http.cookie-store", e.class);
    }

    private <T> org.apache.a.d.c<T> b(String string) {
        return this.a(string, org.apache.a.d.c.class);
    }

    public final org.apache.a.d.c<k> c() {
        return this.b("http.cookiespec-registry");
    }

    public final org.apache.a.d.c<c> d() {
        return this.b("http.authscheme-registry");
    }

    public final f e() {
        return this.a("http.auth.credentials-provider", f.class);
    }

    public final org.apache.a.b.a f() {
        return this.a("http.auth.auth-cache", org.apache.a.b.a.class);
    }

    public final org.apache.a.a.e g() {
        return this.a("http.auth.target-scope", org.apache.a.a.e.class);
    }

    public final org.apache.a.a.e h() {
        return this.a("http.auth.proxy-scope", org.apache.a.a.e.class);
    }

    public final org.apache.a.b.a.a i() {
        org.apache.a.b.a.a a2 = this.a("http.request-config", org.apache.a.b.a.a.class);
        if (a2 != null) {
            return a2;
        }
        return org.apache.a.b.a.a.a;
    }
}

