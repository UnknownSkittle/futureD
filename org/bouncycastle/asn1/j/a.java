/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.j;

import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.v;

public final class a
extends m {
    private n a;
    private f b;

    public static a a(Object object) {
        if (object instanceof a) {
            return (a)object;
        }
        if (object != null) {
            return new a(v.a(object));
        }
        return null;
    }

    public a(n n2) {
        this.a = n2;
    }

    public a(n n2, f f2) {
        this.a = n2;
        this.b = f2;
    }

    private a(v v2) {
        if (v2.d() <= 0 || v2.d() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + v2.d());
        }
        this.a = n.a(v2.a(0));
        if (v2.d() == 2) {
            this.b = v2.a(1);
            return;
        }
        this.b = null;
    }

    public final n a() {
        return this.a;
    }

    public final f b() {
        return this.b;
    }

    public final u h() {
        org.bouncycastle.asn1.util.a a2 = new org.bouncycastle.asn1.util.a();
        a2.a(this.a);
        if (this.b != null) {
            a2.a(this.b);
        }
        return new be(a2);
    }
}

