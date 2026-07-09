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

public final class j
extends m {
    private final k a;
    private final int b;
    private final int c;
    private final a d;

    public j(int n2, int n3, a a2) {
        this.a = new k(0L);
        this.b = n2;
        this.c = n3;
        this.d = a2;
    }

    private j(v v2) {
        this.a = k.a(v2.a(0));
        this.b = k.a(v2.a(1)).b().intValue();
        this.c = k.a(v2.a(2)).b().intValue();
        this.d = org.bouncycastle.asn1.j.a.a(v2.a(3));
    }

    public static j a(Object object) {
        if (object instanceof j) {
            return (j)object;
        }
        if (object != null) {
            return new j(v.a(object));
        }
        return null;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final a c() {
        return this.d;
    }

    public final u h() {
        org.bouncycastle.asn1.util.a a2 = new org.bouncycastle.asn1.util.a();
        a2.a(this.a);
        a2.a(new k(this.b));
        a2.a(new k(this.c));
        a2.a(this.d);
        return new be(a2);
    }
}

