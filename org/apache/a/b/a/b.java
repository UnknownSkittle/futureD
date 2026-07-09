/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.a;

import java.net.InetAddress;
import java.util.Collection;
import org.apache.a.b.a.a;
import org.apache.a.n;

public final class b {
    private boolean a;
    private n b;
    private InetAddress c;
    private boolean d = false;
    private String e;
    private boolean f = true;
    private boolean g = true;
    private boolean h;
    private int i = 50;
    private boolean j = true;
    private Collection<String> k;
    private Collection<String> l;
    private int m = -1;
    private int n = -1;
    private int o = -1;
    private boolean p = true;

    b() {
    }

    public final b a(boolean bl2) {
        this.a = bl2;
        return this;
    }

    public final b a(n n2) {
        this.b = n2;
        return this;
    }

    public final b a(InetAddress inetAddress) {
        this.c = inetAddress;
        return this;
    }

    @Deprecated
    public final b b(boolean bl2) {
        this.d = bl2;
        return this;
    }

    public final b a(String string) {
        this.e = string;
        return this;
    }

    public final b c(boolean bl2) {
        this.f = bl2;
        return this;
    }

    public final b d(boolean bl2) {
        this.g = bl2;
        return this;
    }

    public final b e(boolean bl2) {
        this.h = bl2;
        return this;
    }

    public final b a(int n2) {
        this.i = n2;
        return this;
    }

    public final b f(boolean bl2) {
        this.j = bl2;
        return this;
    }

    public final b a(Collection<String> collection) {
        this.k = collection;
        return this;
    }

    public final b b(Collection<String> collection) {
        this.l = collection;
        return this;
    }

    public final b b(int n2) {
        this.m = n2;
        return this;
    }

    public final b c(int n2) {
        this.n = n2;
        return this;
    }

    public final b d(int n2) {
        this.o = n2;
        return this;
    }

    @Deprecated
    public final b g(boolean bl2) {
        this.p = bl2;
        return this;
    }

    public final b h(boolean bl2) {
        this.p = bl2;
        return this;
    }

    public final a a() {
        return new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
    }
}

