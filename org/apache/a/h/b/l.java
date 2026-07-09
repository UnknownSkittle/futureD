/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.b;

import com.a.a.b.ai;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import org.apache.a.b;
import org.apache.a.b.a.a;
import org.apache.a.e.d.f;
import org.apache.a.h.a.ac;
import org.apache.a.h.a.z;
import org.apache.a.h.b.c;
import org.apache.a.h.b.d;
import org.apache.a.h.b.e;
import org.apache.a.h.b.g;
import org.apache.a.h.b.h;
import org.apache.a.h.b.i;
import org.apache.a.h.b.j;
import org.apache.a.h.b.k;
import org.apache.a.h.b.m;
import org.apache.a.h.b.n;
import org.apache.a.h.b.o;
import org.apache.a.h.b.r;
import org.apache.a.h.c.p;
import org.apache.a.h.d.al;
import org.apache.a.h.d.ao;
import org.apache.a.h.d.q;
import org.apache.a.h.d.w;

public final class l {
    private org.apache.a.e.h a;
    private org.apache.a.b.f b;
    private String c;
    private org.apache.a.n d;
    private int e = 0;
    private int f = 0;
    private long g = -1L;
    private TimeUnit h = TimeUnit.MILLISECONDS;

    public static l a() {
        return new l();
    }

    protected l() {
    }

    public final l a(org.apache.a.e.h h2) {
        this.a = h2;
        return this;
    }

    public final l a(String string) {
        this.c = string;
        return this;
    }

    public final l a(org.apache.a.n n2) {
        this.d = n2;
        return this;
    }

    public final l a(org.apache.a.b.f f2) {
        this.b = f2;
        return this;
    }

    public final e b() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        Object object9 = org.apache.a.e.d.f.a();
        Object object10 = new org.apache.a.m.g(0);
        org.apache.a.e.h h2 = this.a;
        if (h2 == null) {
            object8 = new org.apache.a.e.c.d((org.apache.a.e.d.e)object9);
            object7 = new org.apache.a.e.c.g(ai.a(), (HostnameVerifier)object8);
            h2 = new p(org.apache.a.d.g.a().a("http", org.apache.a.e.b.c.b()).a("https", (org.apache.a.e.b.c)object7).b(), this.g, this.h != null ? this.h : TimeUnit.MILLISECONDS);
        }
        object7 = org.apache.a.h.b.g.a;
        org.apache.a.d.f<org.apache.a.a.c> f2 = org.apache.a.h.b.h.a;
        Object object11 = r.a;
        object8 = o.a;
        Object object12 = k.a;
        Object object13 = this.c;
        if (object13 == null && object13 == null) {
            object6 = this.getClass();
            object5 = "org.apache.http.client";
            object4 = "Apache-HttpClient";
            object3 = org.apache.a.n.c.a((String)object5, ((Class)object6).getClassLoader());
            object2 = object3 != null ? ((org.apache.a.n.c)object3).a() : "UNAVAILABLE";
            object = System.getProperty("java.version");
            object13 = String.format("%s/%s (Java/%s)", object4, object2, object);
        }
        org.apache.a.m.g g2 = object10;
        Object object14 = object7;
        object7 = object12;
        object10 = object8;
        object = object11;
        object2 = new org.apache.a.m.h(new org.apache.a.r[]{new org.apache.a.m.j(), new org.apache.a.m.k((String)object13)}, 0);
        object3 = f2;
        object6 = object14;
        object5 = h2;
        object4 = g2;
        object10 = new org.apache.a.h.f.d((org.apache.a.m.g)object4, (org.apache.a.e.h)object5, (b)object6, (org.apache.a.e.b)object3, (org.apache.a.r)object2, (org.apache.a.b.b)object, (org.apache.a.b.b)object10, (org.apache.a.b.k)object7);
        object7 = org.apache.a.m.f.a();
        ((org.apache.a.m.f)object7).a(new org.apache.a.b.e.f(), new org.apache.a.m.i(), new org.apache.a.m.j(), new org.apache.a.b.e.e(), new org.apache.a.m.k((String)object13), new org.apache.a.b.e.g());
        ((org.apache.a.m.f)object7).a((org.apache.a.r)new org.apache.a.b.e.c());
        ((org.apache.a.m.f)object7).a((org.apache.a.r)new org.apache.a.b.e.b(0));
        ((org.apache.a.m.f)object7).a((org.apache.a.r)new org.apache.a.b.e.d());
        ((org.apache.a.m.f)object7).a(new org.apache.a.b.e.k());
        ((org.apache.a.m.f)object7).a(new org.apache.a.b.e.h('\u0000'));
        object7 = ((org.apache.a.m.f)object7).b();
        object10 = new org.apache.a.h.f.e((org.apache.a.h.f.a)object10, (org.apache.a.r)object7);
        object7 = i.a;
        object10 = new org.apache.a.h.f.j((org.apache.a.h.f.a)object10, (org.apache.a.b.g)object7);
        object7 = org.apache.a.h.c.k.a;
        object7 = this.d != null ? new org.apache.a.h.c.i(this.d, (org.apache.a.e.m)object7) : new org.apache.a.h.c.j((org.apache.a.e.m)object7);
        f2 = j.a;
        object10 = new org.apache.a.h.f.f((org.apache.a.h.f.a)object10, (org.apache.a.e.a.d)object7, (org.apache.a.b.j)((Object)f2));
        f2 = org.apache.a.d.g.a().a("Basic", new org.apache.a.h.a.c(0)).a("Digest", (org.apache.a.h.a.c)((Object)new org.apache.a.h.a.e(0))).a("NTLM", (org.apache.a.h.a.c)((Object)new z())).a("Negotiate", (org.apache.a.h.a.c)((Object)new ac(0))).a("Kerberos", (org.apache.a.h.a.c)((Object)new org.apache.a.h.a.m(0))).b();
        object5 = object9;
        object6 = new org.apache.a.h.d.m((org.apache.a.e.d.e)object5);
        object3 = new al(ao.b, (org.apache.a.e.d.e)object5);
        object2 = new al(ao.a, (org.apache.a.e.d.e)object5);
        object11 = org.apache.a.d.g.a().a("default", object6).a("best-match", object6).a("compatibility", object6).a("standard", object3).a("standard-strict", object2).a("netscape", new w(0)).a("ignoreCookies", new q()).b();
        object9 = new c();
        object8 = this.b;
        if (object8 == null) {
            object8 = new d();
        }
        object12 = new ArrayList(1);
        object13 = h2;
        object12.add(new m(this, (org.apache.a.e.h)object13));
        return new n((org.apache.a.h.f.a)object10, h2, (org.apache.a.e.a.d)object7, (org.apache.a.d.c<org.apache.a.f.k>)object11, f2, (org.apache.a.b.e)object9, (org.apache.a.b.f)object8, org.apache.a.b.a.a.a, (List<Closeable>)object12);
    }
}

