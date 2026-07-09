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
import org.bouncycastle.asn1.v;
import org.bouncycastle.d.d.a.a;

public final class d
extends m {
    private final int a;
    private final int b;
    private final a c;

    public d(int n2, int n3, a a2) {
        this.a = n2;
        this.b = n3;
        this.c = new a(a2);
    }

    private d(v v2) {
        BigInteger bigInteger = ((k)v2.a(0)).b();
        this.a = bigInteger.intValue();
        bigInteger = ((k)v2.a(1)).b();
        this.b = bigInteger.intValue();
        this.c = new a(((p)v2.a(2)).c());
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final a c() {
        return new a(this.c);
    }

    public final u h() {
        org.bouncycastle.asn1.util.a a2 = new org.bouncycastle.asn1.util.a();
        a2.a(new k(this.a));
        a2.a(new k(this.b));
        a2.a(new ba(this.c.a()));
        return new be(a2);
    }

    public static d a(Object object) {
        if (object != null) {
            return new d(v.a(object));
        }
        return null;
    }
}

