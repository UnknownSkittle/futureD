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

public final class d
extends m {
    private BigInteger a;
    private BigInteger b;

    public static d a(Object object) {
        if (object != null) {
            return new d(v.a(object));
        }
        return null;
    }

    public d(BigInteger bigInteger, BigInteger bigInteger2) {
        this.a = bigInteger;
        this.b = bigInteger2;
    }

    private d(v object) {
        if (((v)object).d() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + ((v)object).d());
        }
        object = ((v)object).c();
        this.a = k.a(object.nextElement()).c();
        this.b = k.a(object.nextElement()).c();
    }

    public final BigInteger a() {
        return this.a;
    }

    public final BigInteger b() {
        return this.b;
    }

    public final u h() {
        a a2 = new a();
        a2.a(new k(this.a));
        a2.a(new k(this.b));
        return new be(a2);
    }
}

