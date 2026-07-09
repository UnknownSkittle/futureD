/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.h;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.h.aa;
import org.bouncycastle.asn1.h.ab;
import org.bouncycastle.asn1.h.ac;
import org.bouncycastle.asn1.h.ad;
import org.bouncycastle.asn1.h.ae;
import org.bouncycastle.asn1.h.af;
import org.bouncycastle.asn1.h.ag;
import org.bouncycastle.asn1.h.ah;
import org.bouncycastle.asn1.h.ai;
import org.bouncycastle.asn1.h.b;
import org.bouncycastle.asn1.h.c;
import org.bouncycastle.asn1.h.d;
import org.bouncycastle.asn1.h.e;
import org.bouncycastle.asn1.h.f;
import org.bouncycastle.asn1.h.g;
import org.bouncycastle.asn1.h.h;
import org.bouncycastle.asn1.h.i;
import org.bouncycastle.asn1.h.j;
import org.bouncycastle.asn1.h.k;
import org.bouncycastle.asn1.h.l;
import org.bouncycastle.asn1.h.m;
import org.bouncycastle.asn1.h.n;
import org.bouncycastle.asn1.h.o;
import org.bouncycastle.asn1.h.p;
import org.bouncycastle.asn1.h.q;
import org.bouncycastle.asn1.h.r;
import org.bouncycastle.asn1.h.s;
import org.bouncycastle.asn1.h.t;
import org.bouncycastle.asn1.h.u;
import org.bouncycastle.asn1.h.v;
import org.bouncycastle.asn1.h.w;
import org.bouncycastle.asn1.h.x;
import org.bouncycastle.asn1.h.y;
import org.bouncycastle.asn1.h.z;

public final class a {
    private static org.bouncycastle.asn1.k.ab a = new b();
    private static org.bouncycastle.asn1.k.ab b = new m();
    private static org.bouncycastle.asn1.k.ab c = new x();
    private static org.bouncycastle.asn1.k.ab d = new ac();
    private static org.bouncycastle.asn1.k.ab e = new ad();
    private static org.bouncycastle.asn1.k.ab f = new ae();
    private static org.bouncycastle.asn1.k.ab g = new af();
    private static org.bouncycastle.asn1.k.ab h = new ag();
    private static org.bouncycastle.asn1.k.ab i = new ah();
    private static org.bouncycastle.asn1.k.ab j = new c();
    private static org.bouncycastle.asn1.k.ab k = new d();
    private static org.bouncycastle.asn1.k.ab l = new e();
    private static org.bouncycastle.asn1.k.ab m = new f();
    private static org.bouncycastle.asn1.k.ab n = new g();
    private static org.bouncycastle.asn1.k.ab o = new h();
    private static org.bouncycastle.asn1.k.ab p = new i();
    private static org.bouncycastle.asn1.k.ab q = new j();
    private static org.bouncycastle.asn1.k.ab r = new k();
    private static org.bouncycastle.asn1.k.ab s = new l();
    private static org.bouncycastle.asn1.k.ab t = new n();
    private static org.bouncycastle.asn1.k.ab u = new o();
    private static org.bouncycastle.asn1.k.ab v = new p();
    private static org.bouncycastle.asn1.k.ab w = new q();
    private static org.bouncycastle.asn1.k.ab x = new r();
    private static org.bouncycastle.asn1.k.ab y = new s();
    private static org.bouncycastle.asn1.k.ab z = new t();
    private static org.bouncycastle.asn1.k.ab A = new u();
    private static org.bouncycastle.asn1.k.ab B = new v();
    private static org.bouncycastle.asn1.k.ab C = new w();
    private static org.bouncycastle.asn1.k.ab D = new y();
    private static org.bouncycastle.asn1.k.ab E = new z();
    private static org.bouncycastle.asn1.k.ab F = new aa();
    private static org.bouncycastle.asn1.k.ab G = new ab();
    private static Hashtable H = new Hashtable();
    private static Hashtable I = new Hashtable();
    private static Hashtable J = new Hashtable();

    private static void a(String string, org.bouncycastle.asn1.n n2, org.bouncycastle.asn1.k.ab ab2) {
        H.put(string, n2);
        J.put(n2, string);
        I.put(n2, ab2);
    }

    public static org.bouncycastle.asn1.k.aa a(String object) {
        if ((object = (org.bouncycastle.asn1.n)H.get(org.bouncycastle.e.k.c((String)object))) == null) {
            return null;
        }
        return org.bouncycastle.asn1.h.a.a((org.bouncycastle.asn1.n)object);
    }

    public static org.bouncycastle.asn1.k.aa a(org.bouncycastle.asn1.n object) {
        if ((object = (org.bouncycastle.asn1.k.ab)I.get(object)) == null) {
            return null;
        }
        return ((org.bouncycastle.asn1.k.ab)object).b();
    }

    public static String b(org.bouncycastle.asn1.n n2) {
        return (String)J.get(n2);
    }

    public static Enumeration a() {
        return J.elements();
    }

    static /* synthetic */ BigInteger b(String string) {
        return new BigInteger(1, org.bouncycastle.e.a.f.a(string));
    }

    static /* synthetic */ org.bouncycastle.math.ec.d a(org.bouncycastle.math.ec.d d2) {
        return d2;
    }

    static /* synthetic */ org.bouncycastle.math.ec.d a(org.bouncycastle.math.ec.d d2, org.bouncycastle.math.ec.b.d d3) {
        return d2.b().a(new org.bouncycastle.math.ec.b.c(d2, d3)).a();
    }

    static {
        org.bouncycastle.asn1.h.a.a("secp112r1", ai.g, a);
        org.bouncycastle.asn1.h.a.a("secp112r2", ai.h, b);
        org.bouncycastle.asn1.h.a.a("secp128r1", ai.u, c);
        org.bouncycastle.asn1.h.a.a("secp128r2", ai.v, d);
        org.bouncycastle.asn1.h.a.a("secp160k1", ai.j, e);
        org.bouncycastle.asn1.h.a.a("secp160r1", ai.i, f);
        org.bouncycastle.asn1.h.a.a("secp160r2", ai.w, g);
        org.bouncycastle.asn1.h.a.a("secp192k1", ai.x, h);
        org.bouncycastle.asn1.h.a.a("secp192r1", ai.G, i);
        org.bouncycastle.asn1.h.a.a("secp224k1", ai.y, j);
        org.bouncycastle.asn1.h.a.a("secp224r1", ai.z, k);
        org.bouncycastle.asn1.h.a.a("secp256k1", ai.k, l);
        org.bouncycastle.asn1.h.a.a("secp256r1", ai.H, m);
        org.bouncycastle.asn1.h.a.a("secp384r1", ai.A, n);
        org.bouncycastle.asn1.h.a.a("secp521r1", ai.B, o);
        org.bouncycastle.asn1.h.a.a("sect113r1", ai.e, p);
        org.bouncycastle.asn1.h.a.a("sect113r2", ai.f, q);
        org.bouncycastle.asn1.h.a.a("sect131r1", ai.o, r);
        org.bouncycastle.asn1.h.a.a("sect131r2", ai.p, s);
        org.bouncycastle.asn1.h.a.a("sect163k1", ai.b, t);
        org.bouncycastle.asn1.h.a.a("sect163r1", ai.c, u);
        org.bouncycastle.asn1.h.a.a("sect163r2", ai.l, v);
        org.bouncycastle.asn1.h.a.a("sect193r1", ai.q, w);
        org.bouncycastle.asn1.h.a.a("sect193r2", ai.r, x);
        org.bouncycastle.asn1.h.a.a("sect233k1", ai.s, y);
        org.bouncycastle.asn1.h.a.a("sect233r1", ai.t, z);
        org.bouncycastle.asn1.h.a.a("sect239k1", ai.d, A);
        org.bouncycastle.asn1.h.a.a("sect283k1", ai.m, B);
        org.bouncycastle.asn1.h.a.a("sect283r1", ai.n, C);
        org.bouncycastle.asn1.h.a.a("sect409k1", ai.C, D);
        org.bouncycastle.asn1.h.a.a("sect409r1", ai.D, E);
        org.bouncycastle.asn1.h.a.a("sect571k1", ai.E, F);
        org.bouncycastle.asn1.h.a.a("sect571r1", ai.F, G);
    }
}

