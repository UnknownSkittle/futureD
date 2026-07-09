/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.d;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.h.ai;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.n;
import org.bouncycastle.e.k;

public final class a {
    private static Hashtable a = new Hashtable();
    private static Hashtable b = new Hashtable();

    private static void a(String string, n n2) {
        a.put(string, n2);
        b.put(n2, string);
    }

    public static aa a(String object) {
        if ((object = (n)a.get(k.b((String)object))) != null) {
            return org.bouncycastle.asn1.h.a.a((n)object);
        }
        return null;
    }

    public static String a(n n2) {
        return (String)b.get(n2);
    }

    public static Enumeration a() {
        return a.keys();
    }

    static {
        org.bouncycastle.asn1.d.a.a("B-571", ai.F);
        org.bouncycastle.asn1.d.a.a("B-409", ai.D);
        org.bouncycastle.asn1.d.a.a("B-283", ai.n);
        org.bouncycastle.asn1.d.a.a("B-233", ai.t);
        org.bouncycastle.asn1.d.a.a("B-163", ai.l);
        org.bouncycastle.asn1.d.a.a("K-571", ai.E);
        org.bouncycastle.asn1.d.a.a("K-409", ai.C);
        org.bouncycastle.asn1.d.a.a("K-283", ai.m);
        org.bouncycastle.asn1.d.a.a("K-233", ai.s);
        org.bouncycastle.asn1.d.a.a("K-163", ai.b);
        org.bouncycastle.asn1.d.a.a("P-521", ai.B);
        org.bouncycastle.asn1.d.a.a("P-384", ai.A);
        org.bouncycastle.asn1.d.a.a("P-256", ai.H);
        org.bouncycastle.asn1.d.a.a("P-224", ai.z);
        org.bouncycastle.asn1.d.a.a("P-192", ai.G);
    }
}

