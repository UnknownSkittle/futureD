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
import org.bouncycastle.d.d.a.b;
import org.bouncycastle.d.d.a.e;
import org.bouncycastle.d.d.a.f;

public final class c
extends m {
    private int a;
    private int b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;

    public c(int n2, int n3, b b2, f f2, e e2, e e3, org.bouncycastle.d.d.a.a a2) {
        this.a = n2;
        this.b = n3;
        this.c = b2.b();
        this.d = f2.b();
        this.e = a2.a();
        this.f = e2.a();
        this.g = e3.a();
    }

    public static c a(Object object) {
        if (object instanceof c) {
            return (c)object;
        }
        if (object != null) {
            return new c(v.a(object));
        }
        return null;
    }

    private c(v v2) {
        BigInteger bigInteger = ((k)v2.a(0)).b();
        this.a = bigInteger.intValue();
        bigInteger = ((k)v2.a(1)).b();
        this.b = bigInteger.intValue();
        this.c = ((p)v2.a(2)).c();
        this.d = ((p)v2.a(3)).c();
        this.f = ((p)v2.a(4)).c();
        this.g = ((p)v2.a(5)).c();
        this.e = ((p)v2.a(6)).c();
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final b c() {
        return new b(this.c);
    }

    public final f d() {
        return new f(this.c(), this.d);
    }

    public final org.bouncycastle.d.d.a.a e() {
        return new org.bouncycastle.d.d.a.a(this.e);
    }

    public final e f() {
        return new e(this.f);
    }

    public final e g() {
        return new e(this.g);
    }

    public final u h() {
        a a2 = new a();
        a2.a(new k(this.a));
        a2.a(new k(this.b));
        a2.a(new ba(this.c));
        a2.a(new ba(this.d));
        a2.a(new ba(this.f));
        a2.a(new ba(this.g));
        a2.a(new ba(this.e));
        return new be(a2);
    }
}

