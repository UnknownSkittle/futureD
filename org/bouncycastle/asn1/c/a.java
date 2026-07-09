/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.c;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.c.b;
import org.bouncycastle.asn1.c.c;
import org.bouncycastle.asn1.c.d;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.n;
import org.bouncycastle.e.a.f;
import org.bouncycastle.e.k;

public final class a {
    private static ab a = new b();
    private static ab b = new c();
    private static Hashtable c = new Hashtable();
    private static Hashtable d = new Hashtable();
    private static Hashtable e = new Hashtable();

    private static void a(String string, n n2, ab ab2) {
        c.put(k.c(string), n2);
        e.put(n2, string);
        d.put(n2, ab2);
    }

    public static aa a(String object) {
        if ((object = (n)c.get(k.c((String)object))) == null) {
            return null;
        }
        return org.bouncycastle.asn1.c.a.a((n)object);
    }

    public static aa a(n object) {
        if ((object = (ab)d.get(object)) == null) {
            return null;
        }
        return ((ab)object).b();
    }

    public static String b(n n2) {
        return (String)e.get(n2);
    }

    public static Enumeration a() {
        return e.elements();
    }

    static /* synthetic */ BigInteger b(String string) {
        return new BigInteger(1, f.a(string));
    }

    static /* synthetic */ org.bouncycastle.math.ec.d a(org.bouncycastle.math.ec.d d2) {
        return d2;
    }

    static {
        org.bouncycastle.asn1.c.a.a("wapip192v1", org.bouncycastle.asn1.c.d.d, b);
        org.bouncycastle.asn1.c.a.a("sm2p256v1", org.bouncycastle.asn1.c.d.b, a);
    }
}

