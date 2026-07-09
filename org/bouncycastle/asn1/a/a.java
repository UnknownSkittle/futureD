/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.a;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.a.b;
import org.bouncycastle.asn1.a.c;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.n;
import org.bouncycastle.e.a.f;
import org.bouncycastle.e.k;
import org.bouncycastle.math.ec.d;

public final class a {
    private static ab a = new b();
    private static Hashtable b = new Hashtable();
    private static Hashtable c = new Hashtable();
    private static Hashtable d = new Hashtable();

    public static aa a(String object) {
        if ((object = (n)b.get(k.c((String)object))) == null) {
            return null;
        }
        return org.bouncycastle.asn1.a.a.a((n)object);
    }

    public static aa a(n object) {
        if ((object = (ab)c.get(object)) == null) {
            return null;
        }
        return ((ab)object).b();
    }

    public static String b(n n2) {
        return (String)d.get(n2);
    }

    public static Enumeration a() {
        return d.elements();
    }

    static /* synthetic */ BigInteger b(String string) {
        return new BigInteger(1, f.a(string));
    }

    static /* synthetic */ d a(d d2) {
        return d2;
    }

    static {
        ab ab2 = a;
        n n2 = org.bouncycastle.asn1.a.c.a;
        String string = "FRP256v1";
        b.put(k.c(string), n2);
        d.put(n2, string);
        c.put(n2, ab2);
    }
}

