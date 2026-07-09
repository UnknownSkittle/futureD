/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.i;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.i.b;
import org.bouncycastle.asn1.i.c;
import org.bouncycastle.asn1.i.d;
import org.bouncycastle.asn1.i.e;
import org.bouncycastle.asn1.i.f;
import org.bouncycastle.asn1.i.g;
import org.bouncycastle.asn1.i.h;
import org.bouncycastle.asn1.i.i;
import org.bouncycastle.asn1.i.j;
import org.bouncycastle.asn1.i.k;
import org.bouncycastle.asn1.i.l;
import org.bouncycastle.asn1.i.m;
import org.bouncycastle.asn1.i.n;
import org.bouncycastle.asn1.i.o;
import org.bouncycastle.asn1.i.p;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;

public final class a {
    private static ab a = new b();
    private static ab b = new h();
    private static ab c = new i();
    private static ab d = new j();
    private static ab e = new k();
    private static ab f = new l();
    private static ab g = new m();
    private static ab h = new n();
    private static ab i = new o();
    private static ab j = new c();
    private static ab k = new d();
    private static ab l = new e();
    private static ab m = new f();
    private static ab n = new g();
    private static Hashtable o = new Hashtable();
    private static Hashtable p = new Hashtable();
    private static Hashtable q = new Hashtable();

    private static void a(String string, org.bouncycastle.asn1.n n2, ab ab2) {
        o.put(org.bouncycastle.e.k.c(string), n2);
        q.put(n2, string);
        p.put(n2, ab2);
    }

    public static aa a(String object) {
        if ((object = (org.bouncycastle.asn1.n)o.get(org.bouncycastle.e.k.c((String)object))) != null) {
            return org.bouncycastle.asn1.i.a.a((org.bouncycastle.asn1.n)object);
        }
        return null;
    }

    public static aa a(org.bouncycastle.asn1.n object) {
        if ((object = (ab)p.get(object)) != null) {
            return ((ab)object).b();
        }
        return null;
    }

    public static String b(org.bouncycastle.asn1.n n2) {
        return (String)q.get(n2);
    }

    public static Enumeration a() {
        return q.elements();
    }

    static /* synthetic */ org.bouncycastle.math.ec.d a(org.bouncycastle.math.ec.d d2) {
        return d2;
    }

    static {
        org.bouncycastle.asn1.i.a.a("brainpoolP160r1", org.bouncycastle.asn1.i.p.h, a);
        org.bouncycastle.asn1.i.a.a("brainpoolP160t1", org.bouncycastle.asn1.i.p.i, b);
        org.bouncycastle.asn1.i.a.a("brainpoolP192r1", org.bouncycastle.asn1.i.p.j, c);
        org.bouncycastle.asn1.i.a.a("brainpoolP192t1", org.bouncycastle.asn1.i.p.k, d);
        org.bouncycastle.asn1.i.a.a("brainpoolP224r1", org.bouncycastle.asn1.i.p.l, e);
        org.bouncycastle.asn1.i.a.a("brainpoolP224t1", org.bouncycastle.asn1.i.p.m, f);
        org.bouncycastle.asn1.i.a.a("brainpoolP256r1", org.bouncycastle.asn1.i.p.n, g);
        org.bouncycastle.asn1.i.a.a("brainpoolP256t1", org.bouncycastle.asn1.i.p.o, h);
        org.bouncycastle.asn1.i.a.a("brainpoolP320r1", org.bouncycastle.asn1.i.p.p, i);
        org.bouncycastle.asn1.i.a.a("brainpoolP320t1", org.bouncycastle.asn1.i.p.q, j);
        org.bouncycastle.asn1.i.a.a("brainpoolP384r1", org.bouncycastle.asn1.i.p.r, k);
        org.bouncycastle.asn1.i.a.a("brainpoolP384t1", org.bouncycastle.asn1.i.p.s, l);
        org.bouncycastle.asn1.i.a.a("brainpoolP512r1", org.bouncycastle.asn1.i.p.t, m);
        org.bouncycastle.asn1.i.a.a("brainpoolP512t1", org.bouncycastle.asn1.i.p.u, n);
    }
}

