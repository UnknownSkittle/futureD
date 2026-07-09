/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.k;

import org.bouncycastle.asn1.aq;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.k.ad;
import org.bouncycastle.asn1.k.af;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.math.ec.b;
import org.bouncycastle.math.ec.d;

public final class z
extends m
implements af {
    private d M;
    private byte[] N;
    private n O = null;

    public z(d object, byte[] byArray) {
        this.M = object;
        this.N = byArray;
        object = this;
        if (b.b(((z)object).M.f())) {
            ((z)object).O = c;
            return;
        }
        if (b.a(((z)object).M.f())) {
            ((z)object).O = d;
            return;
        }
        throw new IllegalArgumentException("This type of ECCurve is not implemented");
    }

    public final u h() {
        a a2 = new a();
        if (this.O.equals(c)) {
            a2.a(new ad(this.M.g()).h());
            a2.a(new ad(this.M.h()).h());
        } else if (this.O.equals(d)) {
            a2.a(new ad(this.M.g()).h());
            a2.a(new ad(this.M.h()).h());
        }
        if (this.N != null) {
            a2.a(new aq(this.N));
        }
        return new be(a2);
    }
}

