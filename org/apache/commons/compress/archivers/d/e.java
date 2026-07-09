/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.d;

import java.util.Collections;
import java.util.Date;
import java.util.Set;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.d.b;
import org.apache.commons.compress.archivers.d.d;
import org.apache.commons.compress.archivers.d.f;
import org.apache.commons.compress.archivers.d.g;
import org.apache.commons.compress.archivers.d.h;
import org.apache.commons.compress.archivers.d.l;

public final class e
implements a {
    private String a;
    private g b = org.apache.commons.compress.archivers.d.g.b;
    private int c;
    private Set<f> d = Collections.emptySet();
    private long e;
    private long f;
    private long g;
    private int h;
    private int i;
    private final l j = null;
    private final h k = new h();
    private String l;
    private String m;
    private int n;
    private long o;
    private int p;
    private int q;
    private long r;
    private int s;

    protected final void a(String string) {
        this.l = string;
    }

    public final int a() {
        return this.k.c();
    }

    public final void a(long l2) {
        this.o = l2;
    }

    public final d b() {
        return this.k.a();
    }

    public final int c() {
        return this.k.d();
    }

    public final int d() {
        return this.k.e();
    }

    public final boolean a(int n2) {
        return (this.k.a(n2) & 1) == 0;
    }

    public final int hashCode() {
        return this.p;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || !object.getClass().equals(this.getClass())) {
            return false;
        }
        object = (e)object;
        return this.p == ((e)object).p;
    }

    public final String toString() {
        return this.getName();
    }

    static e a(byte[] byArray) {
        e e2 = new e();
        h h2 = e2.k;
        org.apache.commons.compress.archivers.d.h.a(h2, org.apache.commons.compress.archivers.d.d.a((int)org.apache.commons.compress.archivers.d.b.a(byArray, 0, 4)));
        org.apache.commons.compress.archivers.d.h.a(h2, (int)org.apache.commons.compress.archivers.d.b.a(byArray, 12, 4));
        e2.p = org.apache.commons.compress.archivers.d.h.b(h2, (int)org.apache.commons.compress.archivers.d.b.a(byArray, 20, 4));
        int n2 = (int)org.apache.commons.compress.archivers.d.b.a(byArray, 32, 2);
        e2.b = org.apache.commons.compress.archivers.d.g.a(n2 >> 12 & 0xF);
        e e3 = e2;
        e2.c = n2 & 0xFFF;
        e3.d = org.apache.commons.compress.archivers.d.f.a(n2);
        e2.q = (int)org.apache.commons.compress.archivers.d.b.a(byArray, 34, 2);
        e2.e = org.apache.commons.compress.archivers.d.b.a(byArray, 40, 8);
        long l2 = 1000L * (long)((int)org.apache.commons.compress.archivers.d.b.a(byArray, 48, 4)) + (long)((int)org.apache.commons.compress.archivers.d.b.a(byArray, 52, 4) / 1000);
        e2.f = new Date(l2).getTime();
        l2 = 1000L * (long)((int)org.apache.commons.compress.archivers.d.b.a(byArray, 56, 4)) + (long)((int)org.apache.commons.compress.archivers.d.b.a(byArray, 60, 4) / 1000);
        e2.g = new Date(l2).getTime();
        e2.r = l2 = 1000L * (long)((int)org.apache.commons.compress.archivers.d.b.a(byArray, 64, 4)) + (long)((int)org.apache.commons.compress.archivers.d.b.a(byArray, 68, 4) / 1000);
        e2.s = (int)org.apache.commons.compress.archivers.d.b.a(byArray, 140, 4);
        e2.h = (int)org.apache.commons.compress.archivers.d.b.a(byArray, 144, 4);
        e2.i = (int)org.apache.commons.compress.archivers.d.b.a(byArray, 148, 4);
        org.apache.commons.compress.archivers.d.h.c(h2, (int)org.apache.commons.compress.archivers.d.b.a(byArray, 160, 4));
        org.apache.commons.compress.archivers.d.h.a(h2);
        for (n2 = 0; n2 < 512 && n2 < org.apache.commons.compress.archivers.d.h.b(h2); ++n2) {
            if (byArray[n2 + 164] != 0) continue;
            org.apache.commons.compress.archivers.d.h.c(h2);
        }
        System.arraycopy(byArray, 164, org.apache.commons.compress.archivers.d.h.d(h2), 0, 512);
        e2.n = h2.b();
        return e2;
    }

    @Override
    public final String getName() {
        return this.a;
    }

    final String e() {
        return this.m;
    }

    public final void b(String string) {
        this.m = string;
        if (string != null) {
            if (this.f() && !string.endsWith("/")) {
                string = string + "/";
            }
            if (string.startsWith("./")) {
                string = string.substring(2);
            }
        }
        this.a = string;
    }

    public final boolean f() {
        return this.b == org.apache.commons.compress.archivers.d.g.a;
    }

    final long g() {
        return this.e;
    }
}

