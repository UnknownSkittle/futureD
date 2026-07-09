/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.f;

import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.bj;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.asn1.v;
import org.bouncycastle.asn1.x;
import org.bouncycastle.asn1.z;

public final class b
extends m {
    private p a;
    private org.bouncycastle.asn1.j.a b;
    private x c;

    public static b a(Object object) {
        if (object instanceof b) {
            return (b)object;
        }
        if (object != null) {
            return new b(v.a(object));
        }
        return null;
    }

    public b(org.bouncycastle.asn1.j.a a2, f f2) {
        this(a2, f2, 0);
    }

    private b(org.bouncycastle.asn1.j.a a2, f f2, byte by2) {
        this.a = new ba(f2.h().a("DER"));
        this.b = a2;
        this.c = null;
    }

    private b(v object) {
        object = ((v)object).c();
        if (((k)object.nextElement()).b().intValue() != 0) {
            throw new IllegalArgumentException("wrong version for private key info");
        }
        this.b = org.bouncycastle.asn1.j.a.a(object.nextElement());
        this.a = p.a(object.nextElement());
        if (object.hasMoreElements()) {
            this.c = x.a((z)object.nextElement());
        }
    }

    public final org.bouncycastle.asn1.j.a a() {
        return this.b;
    }

    public final f b() {
        return u.b(this.a.c());
    }

    public final u h() {
        a a2 = new a();
        a2.a(new k(0L));
        a2.a(this.b);
        a2.a(this.a);
        if (this.c != null) {
            a2.a(new bj(false, 0, this.c));
        }
        return new be(a2);
    }
}

