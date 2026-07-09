/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.a;

import java.math.BigInteger;
import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.asn1.v;

public final class b
extends m {
    private final int a;
    private final int b;
    private final org.bouncycastle.d.d.a.a c;
    private final org.bouncycastle.asn1.j.a d;

    public b(int n2, int n3, org.bouncycastle.d.d.a.a a2, org.bouncycastle.asn1.j.a a3) {
        this.a = n2;
        this.b = n3;
        this.c = new org.bouncycastle.d.d.a.a(a2.a());
        this.d = a3;
    }

    private b(v v2) {
        BigInteger bigInteger = ((k)v2.a(0)).b();
        this.a = bigInteger.intValue();
        bigInteger = ((k)v2.a(1)).b();
        this.b = bigInteger.intValue();
        this.c = new org.bouncycastle.d.d.a.a(((p)v2.a(2)).c());
        this.d = org.bouncycastle.asn1.j.a.a(v2.a(3));
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final org.bouncycastle.d.d.a.a c() {
        return this.c;
    }

    public final org.bouncycastle.asn1.j.a d() {
        return this.d;
    }

    public final u h() {
        a a2 = new a();
        a2.a(new k(this.a));
        a2.a(new k(this.b));
        a2.a(new ba(this.c.a()));
        a2.a(this.d);
        return new be(a2);
    }

    public static b a(Object object) {
        if (object != null) {
            return new b(v.a(object));
        }
        return null;
    }
}

