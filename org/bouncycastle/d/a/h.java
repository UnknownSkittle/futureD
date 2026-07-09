/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.a;

import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.j.a;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.v;

public final class h
extends m {
    private final k a;
    private final a b;

    public h(a a2) {
        this.a = new k(0L);
        this.b = a2;
    }

    private h(v v2) {
        this.a = k.a(v2.a(0));
        this.b = org.bouncycastle.asn1.j.a.a(v2.a(1));
    }

    public static final h a(Object object) {
        if (object instanceof h) {
            return (h)object;
        }
        if (object != null) {
            return new h(v.a(object));
        }
        return null;
    }

    public final a a() {
        return this.b;
    }

    public final u h() {
        org.bouncycastle.asn1.util.a a2 = new org.bouncycastle.asn1.util.a();
        a2.a(this.a);
        a2.a(this.b);
        return new be(a2);
    }
}

