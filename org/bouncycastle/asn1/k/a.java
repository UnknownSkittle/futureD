/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.k;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.af;
import org.bouncycastle.asn1.k.b;
import org.bouncycastle.asn1.k.c;
import org.bouncycastle.asn1.k.d;
import org.bouncycastle.asn1.k.e;
import org.bouncycastle.asn1.k.f;
import org.bouncycastle.asn1.k.g;
import org.bouncycastle.asn1.k.h;
import org.bouncycastle.asn1.k.i;
import org.bouncycastle.asn1.k.j;
import org.bouncycastle.asn1.k.k;
import org.bouncycastle.asn1.k.l;
import org.bouncycastle.asn1.k.m;
import org.bouncycastle.asn1.k.o;
import org.bouncycastle.asn1.k.p;
import org.bouncycastle.asn1.k.q;
import org.bouncycastle.asn1.k.r;
import org.bouncycastle.asn1.k.s;
import org.bouncycastle.asn1.k.t;
import org.bouncycastle.asn1.k.u;
import org.bouncycastle.asn1.k.v;
import org.bouncycastle.asn1.k.w;
import org.bouncycastle.asn1.k.x;
import org.bouncycastle.asn1.n;

public final class a {
    private static ab a = new b();
    private static ab b = new m();
    private static ab c = new r();
    private static ab d = new s();
    private static ab e = new t();
    private static ab f = new u();
    private static ab g = new v();
    private static ab h = new w();
    private static ab i = new x();
    private static ab j = new c();
    private static ab k = new d();
    private static ab l = new e();
    private static ab m = new f();
    private static ab n = new g();
    private static ab o = new h();
    private static ab p = new i();
    private static ab q = new j();
    private static ab r = new k();
    private static ab s = new l();
    private static ab t = new org.bouncycastle.asn1.k.n();
    private static ab u = new o();
    private static ab v = new p();
    private static ab w = new q();
    private static Hashtable x = new Hashtable();
    private static Hashtable y = new Hashtable();
    private static Hashtable z = new Hashtable();

    private static void a(String string, n n2, ab ab2) {
        x.put(string, n2);
        z.put(n2, string);
        y.put(n2, ab2);
    }

    public static aa a(String object) {
        if ((object = (n)x.get(org.bouncycastle.e.k.c((String)object))) != null) {
            return org.bouncycastle.asn1.k.a.a((n)object);
        }
        return null;
    }

    public static aa a(n object) {
        if ((object = (ab)y.get(object)) != null) {
            return ((ab)object).b();
        }
        return null;
    }

    public static String b(n n2) {
        return (String)z.get(n2);
    }

    public static Enumeration a() {
        return x.keys();
    }

    static {
        org.bouncycastle.asn1.k.a.a("prime192v1", af.B, a);
        org.bouncycastle.asn1.k.a.a("prime192v2", af.C, b);
        org.bouncycastle.asn1.k.a.a("prime192v3", af.D, c);
        org.bouncycastle.asn1.k.a.a("prime239v1", af.E, d);
        org.bouncycastle.asn1.k.a.a("prime239v2", af.F, e);
        org.bouncycastle.asn1.k.a.a("prime239v3", af.G, f);
        org.bouncycastle.asn1.k.a.a("prime256v1", af.H, g);
        org.bouncycastle.asn1.k.a.a("c2pnb163v1", af.k, h);
        org.bouncycastle.asn1.k.a.a("c2pnb163v2", af.l, i);
        org.bouncycastle.asn1.k.a.a("c2pnb163v3", af.m, j);
        org.bouncycastle.asn1.k.a.a("c2pnb176w1", af.n, k);
        org.bouncycastle.asn1.k.a.a("c2tnb191v1", af.o, l);
        org.bouncycastle.asn1.k.a.a("c2tnb191v2", af.p, m);
        org.bouncycastle.asn1.k.a.a("c2tnb191v3", af.q, n);
        org.bouncycastle.asn1.k.a.a("c2pnb208w1", af.r, o);
        org.bouncycastle.asn1.k.a.a("c2tnb239v1", af.s, p);
        org.bouncycastle.asn1.k.a.a("c2tnb239v2", af.t, q);
        org.bouncycastle.asn1.k.a.a("c2tnb239v3", af.u, r);
        org.bouncycastle.asn1.k.a.a("c2pnb272w1", af.v, s);
        org.bouncycastle.asn1.k.a.a("c2pnb304w1", af.w, t);
        org.bouncycastle.asn1.k.a.a("c2tnb359v1", af.x, u);
        org.bouncycastle.asn1.k.a.a("c2pnb368w1", af.y, v);
        org.bouncycastle.asn1.k.a.a("c2tnb431r1", af.z, w);
    }
}

