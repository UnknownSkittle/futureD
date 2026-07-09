/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.c;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.d.b;
import org.bouncycastle.asn1.f.a;
import org.bouncycastle.crypto.b.e;
import org.bouncycastle.crypto.b.f;
import org.bouncycastle.crypto.b.g;
import org.bouncycastle.crypto.b.h;
import org.bouncycastle.crypto.b.i;
import org.bouncycastle.crypto.b.j;
import org.bouncycastle.e.k;

public final class d {
    private static Set a = new HashSet();
    private static Set b = new HashSet();
    private static Set c = new HashSet();
    private static Set d = new HashSet();
    private static Set e = new HashSet();
    private static Set f = new HashSet();
    private static Set g = new HashSet();
    private static Set h = new HashSet();
    private static Set i = new HashSet();
    private static Set j = new HashSet();
    private static Set k = new HashSet();
    private static Set l = new HashSet();
    private static Map m = new HashMap();

    public static org.bouncycastle.crypto.j a(String string) {
        if (b.contains(string = org.bouncycastle.e.k.b(string))) {
            return new e();
        }
        if (a.contains(string)) {
            return new org.bouncycastle.crypto.b.d();
        }
        if (c.contains(string)) {
            return new f();
        }
        if (d.contains(string)) {
            return new g();
        }
        if (e.contains(string)) {
            return new h();
        }
        if (f.contains(string)) {
            return new j();
        }
        if (g.contains(string)) {
            return new org.bouncycastle.crypto.b.k(224);
        }
        if (h.contains(string)) {
            return new org.bouncycastle.crypto.b.k(256);
        }
        if (i.contains(string)) {
            return new i(224);
        }
        if (j.contains(string)) {
            return new i(256);
        }
        if (k.contains(string)) {
            return new i(384);
        }
        if (l.contains(string)) {
            return new i(512);
        }
        return null;
    }

    public static boolean a(String string, String string2) {
        return b.contains(string) && b.contains(string2) || c.contains(string) && c.contains(string2) || d.contains(string) && d.contains(string2) || e.contains(string) && e.contains(string2) || f.contains(string) && f.contains(string2) || g.contains(string) && g.contains(string2) || h.contains(string) && h.contains(string2) || i.contains(string) && i.contains(string2) || j.contains(string) && j.contains(string2) || k.contains(string) && k.contains(string2) || l.contains(string) && l.contains(string2) || a.contains(string) && a.contains(string2);
    }

    static {
        a.add("MD5");
        a.add(org.bouncycastle.asn1.f.a.s.b());
        b.add("SHA1");
        b.add("SHA-1");
        b.add(org.bouncycastle.asn1.e.a.a.b());
        c.add("SHA224");
        c.add("SHA-224");
        c.add(org.bouncycastle.asn1.d.b.f.b());
        d.add("SHA256");
        d.add("SHA-256");
        d.add(org.bouncycastle.asn1.d.b.c.b());
        e.add("SHA384");
        e.add("SHA-384");
        e.add(org.bouncycastle.asn1.d.b.d.b());
        f.add("SHA512");
        f.add("SHA-512");
        f.add(org.bouncycastle.asn1.d.b.e.b());
        g.add("SHA512(224)");
        g.add("SHA-512(224)");
        g.add(org.bouncycastle.asn1.d.b.g.b());
        h.add("SHA512(256)");
        h.add("SHA-512(256)");
        h.add(org.bouncycastle.asn1.d.b.h.b());
        i.add("SHA3-224");
        i.add(org.bouncycastle.asn1.d.b.i.b());
        j.add("SHA3-256");
        j.add(org.bouncycastle.asn1.d.b.j.b());
        k.add("SHA3-384");
        k.add(org.bouncycastle.asn1.d.b.k.b());
        l.add("SHA3-512");
        l.add(org.bouncycastle.asn1.d.b.l.b());
        m.put("MD5", org.bouncycastle.asn1.f.a.s);
        m.put(org.bouncycastle.asn1.f.a.s.b(), org.bouncycastle.asn1.f.a.s);
        m.put("SHA1", org.bouncycastle.asn1.e.a.a);
        m.put("SHA-1", org.bouncycastle.asn1.e.a.a);
        m.put(org.bouncycastle.asn1.e.a.a.b(), org.bouncycastle.asn1.e.a.a);
        m.put("SHA224", org.bouncycastle.asn1.d.b.f);
        m.put("SHA-224", org.bouncycastle.asn1.d.b.f);
        m.put(org.bouncycastle.asn1.d.b.f.b(), org.bouncycastle.asn1.d.b.f);
        m.put("SHA256", org.bouncycastle.asn1.d.b.c);
        m.put("SHA-256", org.bouncycastle.asn1.d.b.c);
        m.put(org.bouncycastle.asn1.d.b.c.b(), org.bouncycastle.asn1.d.b.c);
        m.put("SHA384", org.bouncycastle.asn1.d.b.d);
        m.put("SHA-384", org.bouncycastle.asn1.d.b.d);
        m.put(org.bouncycastle.asn1.d.b.d.b(), org.bouncycastle.asn1.d.b.d);
        m.put("SHA512", org.bouncycastle.asn1.d.b.e);
        m.put("SHA-512", org.bouncycastle.asn1.d.b.e);
        m.put(org.bouncycastle.asn1.d.b.e.b(), org.bouncycastle.asn1.d.b.e);
        m.put("SHA512(224)", org.bouncycastle.asn1.d.b.g);
        m.put("SHA-512(224)", org.bouncycastle.asn1.d.b.g);
        m.put(org.bouncycastle.asn1.d.b.g.b(), org.bouncycastle.asn1.d.b.g);
        m.put("SHA512(256)", org.bouncycastle.asn1.d.b.h);
        m.put("SHA-512(256)", org.bouncycastle.asn1.d.b.h);
        m.put(org.bouncycastle.asn1.d.b.h.b(), org.bouncycastle.asn1.d.b.h);
        m.put("SHA3-224", org.bouncycastle.asn1.d.b.i);
        m.put(org.bouncycastle.asn1.d.b.i.b(), org.bouncycastle.asn1.d.b.i);
        m.put("SHA3-256", org.bouncycastle.asn1.d.b.j);
        m.put(org.bouncycastle.asn1.d.b.j.b(), org.bouncycastle.asn1.d.b.j);
        m.put("SHA3-384", org.bouncycastle.asn1.d.b.k);
        m.put(org.bouncycastle.asn1.d.b.k.b(), org.bouncycastle.asn1.d.b.k);
        m.put("SHA3-512", org.bouncycastle.asn1.d.b.l);
        m.put(org.bouncycastle.asn1.d.b.l.b(), org.bouncycastle.asn1.d.b.l);
    }
}

