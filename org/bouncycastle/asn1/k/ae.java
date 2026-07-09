/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.k;

import java.math.BigInteger;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.k.af;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.util.a;

public final class ae
extends m
implements af {
    private n M;
    private u N;

    public ae(BigInteger bigInteger) {
        this.M = c;
        this.N = new k(bigInteger);
    }

    public ae(int n2, int n3) {
        this(n2, n3, 0, 0);
    }

    public ae(int n2, int n3, int n4, int n5) {
        this.M = d;
        a a2 = new a();
        a2.a(new k(n2));
        if (n4 == 0) {
            if (n5 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            a2.a(e);
            a2.a(new k(n3));
        } else {
            if (n4 <= n3 || n5 <= n4) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            a2.a(f);
            a a3 = new a();
            a3.a(new k(n3));
            a3.a(new k(n4));
            a3.a(new k(n5));
            a2.a(new be(a3));
        }
        this.N = new be(a2);
    }

    public final u h() {
        a a2 = new a();
        a2.a(this.M);
        a2.a(this.N);
        return new be(a2);
    }
}

