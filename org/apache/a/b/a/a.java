/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.a;

import java.net.InetAddress;
import java.util.Collection;
import org.apache.a.b.a.b;
import org.apache.a.n;

public class a
implements Cloneable {
    public static final a a = new b().a();
    private final boolean b;
    private final n c;
    private final InetAddress d;
    private final boolean e;
    private final String f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int j;
    private final boolean k;
    private final Collection<String> l;
    private final Collection<String> m;
    private final int n;
    private final int o;
    private final int p;
    private final boolean q;

    protected a() {
        this(false, null, null, false, null, false, false, false, 0, false, null, null, 0, 0, 0, true);
    }

    a(boolean bl2, n n2, InetAddress inetAddress, boolean bl3, String string, boolean bl4, boolean bl5, boolean bl6, int n3, boolean bl7, Collection<String> collection, Collection<String> collection2, int n4, int n5, int n6, boolean bl8) {
        this.b = bl2;
        this.c = n2;
        this.d = inetAddress;
        this.e = bl3;
        this.f = string;
        this.g = bl4;
        this.h = bl5;
        this.i = bl6;
        this.j = n3;
        this.k = bl7;
        this.l = collection;
        this.m = collection2;
        this.n = n4;
        this.o = n5;
        this.p = n6;
        this.q = bl8;
    }

    public final boolean a() {
        return this.b;
    }

    public final n b() {
        return this.c;
    }

    public final InetAddress c() {
        return this.d;
    }

    @Deprecated
    public final boolean d() {
        return this.e;
    }

    public final String e() {
        return this.f;
    }

    public final boolean f() {
        return this.g;
    }

    public final boolean g() {
        return this.h;
    }

    public final boolean h() {
        return this.i;
    }

    public final int i() {
        return this.j;
    }

    public final boolean j() {
        return this.k;
    }

    public final Collection<String> k() {
        return this.l;
    }

    public final Collection<String> l() {
        return this.m;
    }

    public final int m() {
        return this.n;
    }

    public final int n() {
        return this.o;
    }

    public final int o() {
        return this.p;
    }

    public final boolean p() {
        return this.q;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append("expectContinueEnabled=").append(this.b);
        stringBuilder.append(", proxy=").append(this.c);
        stringBuilder.append(", localAddress=").append(this.d);
        stringBuilder.append(", cookieSpec=").append(this.f);
        stringBuilder.append(", redirectsEnabled=").append(this.g);
        stringBuilder.append(", relativeRedirectsAllowed=").append(this.h);
        stringBuilder.append(", maxRedirects=").append(this.j);
        stringBuilder.append(", circularRedirectsAllowed=").append(this.i);
        stringBuilder.append(", authenticationEnabled=").append(this.k);
        stringBuilder.append(", targetPreferredAuthSchemes=").append(this.l);
        stringBuilder.append(", proxyPreferredAuthSchemes=").append(this.m);
        stringBuilder.append(", connectionRequestTimeout=").append(this.n);
        stringBuilder.append(", connectTimeout=").append(this.o);
        stringBuilder.append(", socketTimeout=").append(this.p);
        stringBuilder.append(", contentCompressionEnabled=").append(this.q);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static b a(a a2) {
        return new b().a(a2.b).a(a2.c).a(a2.d).b(a2.e).a(a2.f).c(a2.g).d(a2.h).e(a2.i).a(a2.j).f(a2.k).a(a2.l).b(a2.m).b(a2.n).c(a2.o).d(a2.p).g(a2.q).h(a2.q);
    }
}

