/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.a;

import java.math.BigInteger;
import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.v;
import org.bouncycastle.e.a;

public final class m
extends org.bouncycastle.asn1.m {
    private final byte[] a;
    private final byte[] b;

    public m(byte[] byArray, byte[] byArray2) {
        this.a = org.bouncycastle.e.a.d(byArray);
        this.b = org.bouncycastle.e.a.d(byArray2);
    }

    private m(v v2) {
        if (!k.a(v2.a(0)).b().equals(BigInteger.valueOf(0L))) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.a = org.bouncycastle.e.a.d(ba.a(v2.a(1)).c());
        this.b = org.bouncycastle.e.a.d(ba.a(v2.a(2)).c());
    }

    public static m a(Object object) {
        if (object != null) {
            return new m(v.a(object));
        }
        return null;
    }

    public final byte[] a() {
        return org.bouncycastle.e.a.d(this.a);
    }

    public final byte[] b() {
        return org.bouncycastle.e.a.d(this.b);
    }

    public final u h() {
        org.bouncycastle.asn1.util.a a2 = new org.bouncycastle.asn1.util.a();
        a2.a(new k(0L));
        a2.a(new ba(this.a));
        a2.a(new ba(this.b));
        return new be(a2);
    }
}

