/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.f;

import java.math.BigInteger;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.asn1.v;

public final class c
extends m {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private BigInteger h;
    private BigInteger i;
    private v j = null;

    public static c a(Object object) {
        if (object instanceof c) {
            return (c)object;
        }
        if (object != null) {
            return new c(v.a(object));
        }
        return null;
    }

    public c(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.a = BigInteger.valueOf(0L);
        this.b = bigInteger;
        this.c = bigInteger2;
        this.d = bigInteger3;
        this.e = bigInteger4;
        this.f = bigInteger5;
        this.g = bigInteger6;
        this.h = bigInteger7;
        this.i = bigInteger8;
    }

    private c(v object) {
        object = ((v)object).c();
        BigInteger bigInteger = ((k)object.nextElement()).b();
        if (bigInteger.intValue() != 0 && bigInteger.intValue() != 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        this.a = bigInteger;
        this.b = ((k)object.nextElement()).b();
        this.c = ((k)object.nextElement()).b();
        this.d = ((k)object.nextElement()).b();
        this.e = ((k)object.nextElement()).b();
        this.f = ((k)object.nextElement()).b();
        this.g = ((k)object.nextElement()).b();
        this.h = ((k)object.nextElement()).b();
        this.i = ((k)object.nextElement()).b();
        if (object.hasMoreElements()) {
            this.j = (v)object.nextElement();
        }
    }

    public final BigInteger a() {
        return this.b;
    }

    public final BigInteger b() {
        return this.c;
    }

    public final BigInteger c() {
        return this.d;
    }

    public final BigInteger d() {
        return this.e;
    }

    public final BigInteger e() {
        return this.f;
    }

    public final BigInteger f() {
        return this.g;
    }

    public final BigInteger g() {
        return this.h;
    }

    public final BigInteger i() {
        return this.i;
    }

    public final u h() {
        a a2 = new a();
        a2.a(new k(this.a));
        a2.a(new k(this.b));
        a2.a(new k(this.c));
        a2.a(new k(this.d));
        a2.a(new k(this.e));
        a2.a(new k(this.f));
        a2.a(new k(this.g));
        a2.a(new k(this.h));
        a2.a(new k(this.i));
        if (this.j != null) {
            a2.a(this.j);
        }
        return new be(a2);
    }
}

