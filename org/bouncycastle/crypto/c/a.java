/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.h.ai;
import org.bouncycastle.crypto.c.aa;
import org.bouncycastle.crypto.c.ab;
import org.bouncycastle.crypto.c.ac;
import org.bouncycastle.crypto.c.ad;
import org.bouncycastle.crypto.c.ae;
import org.bouncycastle.crypto.c.af;
import org.bouncycastle.crypto.c.ag;
import org.bouncycastle.crypto.c.b;
import org.bouncycastle.crypto.c.c;
import org.bouncycastle.crypto.c.d;
import org.bouncycastle.crypto.c.e;
import org.bouncycastle.crypto.c.f;
import org.bouncycastle.crypto.c.g;
import org.bouncycastle.crypto.c.h;
import org.bouncycastle.crypto.c.i;
import org.bouncycastle.crypto.c.j;
import org.bouncycastle.crypto.c.k;
import org.bouncycastle.crypto.c.l;
import org.bouncycastle.crypto.c.m;
import org.bouncycastle.crypto.c.n;
import org.bouncycastle.crypto.c.o;
import org.bouncycastle.crypto.c.p;
import org.bouncycastle.crypto.c.q;
import org.bouncycastle.crypto.c.r;
import org.bouncycastle.crypto.c.s;
import org.bouncycastle.crypto.c.t;
import org.bouncycastle.crypto.c.u;
import org.bouncycastle.crypto.c.v;
import org.bouncycastle.crypto.c.w;
import org.bouncycastle.crypto.c.x;
import org.bouncycastle.crypto.c.y;
import org.bouncycastle.crypto.c.z;

public final class a {
    private static org.bouncycastle.asn1.k.ab a = new b();
    private static org.bouncycastle.asn1.k.ab b = new m();
    private static org.bouncycastle.asn1.k.ab c = new x();
    private static org.bouncycastle.asn1.k.ab d = new ab();
    private static org.bouncycastle.asn1.k.ab e = new ac();
    private static org.bouncycastle.asn1.k.ab f = new ad();
    private static org.bouncycastle.asn1.k.ab g = new ae();
    private static org.bouncycastle.asn1.k.ab h = new af();
    private static org.bouncycastle.asn1.k.ab i = new ag();
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
    private static Hashtable G = new Hashtable();
    private static Hashtable H = new Hashtable();
    private static Hashtable I = new Hashtable();
    private static Hashtable J = new Hashtable();
    private static Vector K = new Vector();

    private static void a(String string, org.bouncycastle.asn1.n n2, org.bouncycastle.asn1.k.ab ab2) {
        K.addElement(string);
        J.put(n2, string);
        I.put(n2, ab2);
        string = org.bouncycastle.e.k.c(string);
        H.put(string, n2);
        G.put(string, ab2);
    }

    private static void a(String string, org.bouncycastle.asn1.n n2) {
        Object v2 = I.get(n2);
        if (v2 == null) {
            throw new IllegalStateException();
        }
        string = org.bouncycastle.e.k.c(string);
        H.put(string, n2);
        G.put(string, v2);
    }

    public static org.bouncycastle.asn1.k.aa a(String object) {
        if ((object = (org.bouncycastle.asn1.k.ab)G.get(org.bouncycastle.e.k.c((String)object))) == null) {
            return null;
        }
        return ((org.bouncycastle.asn1.k.ab)object).b();
    }

    public static Enumeration a() {
        return K.elements();
    }

    static /* synthetic */ org.bouncycastle.math.ec.d a(org.bouncycastle.math.ec.d d2) {
        return d2;
    }

    static /* synthetic */ org.bouncycastle.math.ec.d a(org.bouncycastle.math.ec.d d2, org.bouncycastle.math.ec.b.d d3) {
        return d2.b().a(new org.bouncycastle.math.ec.b.c(d2, d3)).a();
    }

    static {
        org.bouncycastle.asn1.k.ab ab2 = a;
        String string = "curve25519";
        K.addElement(string);
        string = org.bouncycastle.e.k.c(string);
        G.put(string, ab2);
        org.bouncycastle.crypto.c.a.a("secp128r1", ai.u, b);
        org.bouncycastle.crypto.c.a.a("secp160k1", ai.j, c);
        org.bouncycastle.crypto.c.a.a("secp160r1", ai.i, d);
        org.bouncycastle.crypto.c.a.a("secp160r2", ai.w, e);
        org.bouncycastle.crypto.c.a.a("secp192k1", ai.x, f);
        org.bouncycastle.crypto.c.a.a("secp192r1", ai.G, g);
        org.bouncycastle.crypto.c.a.a("secp224k1", ai.y, h);
        org.bouncycastle.crypto.c.a.a("secp224r1", ai.z, i);
        org.bouncycastle.crypto.c.a.a("secp256k1", ai.k, j);
        org.bouncycastle.crypto.c.a.a("secp256r1", ai.H, k);
        org.bouncycastle.crypto.c.a.a("secp384r1", ai.A, l);
        org.bouncycastle.crypto.c.a.a("secp521r1", ai.B, m);
        org.bouncycastle.crypto.c.a.a("sect113r1", ai.e, n);
        org.bouncycastle.crypto.c.a.a("sect113r2", ai.f, o);
        org.bouncycastle.crypto.c.a.a("sect131r1", ai.o, p);
        org.bouncycastle.crypto.c.a.a("sect131r2", ai.p, q);
        org.bouncycastle.crypto.c.a.a("sect163k1", ai.b, r);
        org.bouncycastle.crypto.c.a.a("sect163r1", ai.c, s);
        org.bouncycastle.crypto.c.a.a("sect163r2", ai.l, t);
        org.bouncycastle.crypto.c.a.a("sect193r1", ai.q, u);
        org.bouncycastle.crypto.c.a.a("sect193r2", ai.r, v);
        org.bouncycastle.crypto.c.a.a("sect233k1", ai.s, w);
        org.bouncycastle.crypto.c.a.a("sect233r1", ai.t, x);
        org.bouncycastle.crypto.c.a.a("sect239k1", ai.d, y);
        org.bouncycastle.crypto.c.a.a("sect283k1", ai.m, z);
        org.bouncycastle.crypto.c.a.a("sect283r1", ai.n, A);
        org.bouncycastle.crypto.c.a.a("sect409k1", ai.C, B);
        org.bouncycastle.crypto.c.a.a("sect409r1", ai.D, C);
        org.bouncycastle.crypto.c.a.a("sect571k1", ai.E, D);
        org.bouncycastle.crypto.c.a.a("sect571r1", ai.F, E);
        org.bouncycastle.crypto.c.a.a("sm2p256v1", org.bouncycastle.asn1.c.d.b, F);
        org.bouncycastle.crypto.c.a.a("B-163", ai.l);
        org.bouncycastle.crypto.c.a.a("B-233", ai.t);
        org.bouncycastle.crypto.c.a.a("B-283", ai.n);
        org.bouncycastle.crypto.c.a.a("B-409", ai.D);
        org.bouncycastle.crypto.c.a.a("B-571", ai.F);
        org.bouncycastle.crypto.c.a.a("K-163", ai.b);
        org.bouncycastle.crypto.c.a.a("K-233", ai.s);
        org.bouncycastle.crypto.c.a.a("K-283", ai.m);
        org.bouncycastle.crypto.c.a.a("K-409", ai.C);
        org.bouncycastle.crypto.c.a.a("K-571", ai.E);
        org.bouncycastle.crypto.c.a.a("P-192", ai.G);
        org.bouncycastle.crypto.c.a.a("P-224", ai.z);
        org.bouncycastle.crypto.c.a.a("P-256", ai.H);
        org.bouncycastle.crypto.c.a.a("P-384", ai.A);
        org.bouncycastle.crypto.c.a.a("P-521", ai.B);
    }
}

