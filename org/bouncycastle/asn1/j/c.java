/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.j;

import org.bouncycastle.asn1.aq;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.j.a;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.v;

public final class c
extends m {
    private a a;
    private aq b;

    public static c a(Object object) {
        if (object instanceof c) {
            return (c)object;
        }
        if (object != null) {
            return new c(v.a(object));
        }
        return null;
    }

    public c(a a2, f f2) {
        this.b = new aq(f2);
        this.a = a2;
    }

    public c(a a2, byte[] byArray) {
        this.b = new aq(byArray);
        this.a = a2;
    }

    private c(v object) {
        if (((v)object).d() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + ((v)object).d());
        }
        object = ((v)object).c();
        this.a = org.bouncycastle.asn1.j.a.a(object.nextElement());
        this.b = aq.a(object.nextElement());
    }

    public final a a() {
        return this.a;
    }

    public final u b() {
        return u.b(this.b.b());
    }

    public final aq c() {
        return this.b;
    }

    public final u h() {
        org.bouncycastle.asn1.util.a a2 = new org.bouncycastle.asn1.util.a();
        a2.a(this.a);
        a2.a(this.b);
        return new be(a2);
    }
}

