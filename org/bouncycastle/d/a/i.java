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

public final class i
extends m {
    private final k a;
    private final int b;
    private final a c;

    public i(int n2, a a2) {
        this.a = new k(0L);
        this.b = n2;
        this.c = a2;
    }

    private i(v v2) {
        this.a = k.a(v2.a(0));
        this.b = k.a(v2.a(1)).b().intValue();
        this.c = org.bouncycastle.asn1.j.a.a(v2.a(2));
    }

    public static i a(Object object) {
        if (object instanceof i) {
            return (i)object;
        }
        if (object != null) {
            return new i(v.a(object));
        }
        return null;
    }

    public final int a() {
        return this.b;
    }

    public final a b() {
        return this.c;
    }

    public final u h() {
        org.bouncycastle.asn1.util.a a2 = new org.bouncycastle.asn1.util.a();
        a2.a(this.a);
        a2.a(new k(this.b));
        a2.a(this.c);
        return new be(a2);
    }
}

