/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.k;

import java.math.BigInteger;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.asn1.k.ae;
import org.bouncycastle.asn1.k.af;
import org.bouncycastle.asn1.k.z;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.math.a.f;
import org.bouncycastle.math.ec.b;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.p;

public class aa
extends m
implements af {
    private static final BigInteger M = BigInteger.valueOf(1L);
    private ae N;
    private d O;
    private ac P;
    private BigInteger Q;
    private BigInteger R;
    private byte[] S;

    public aa(d d2, ac ac2, BigInteger bigInteger, BigInteger bigInteger2) {
        this(d2, ac2, bigInteger, bigInteger2, null);
    }

    public aa(d d2, p p2, BigInteger bigInteger, BigInteger bigInteger2, byte[] byArray) {
        this(d2, new ac(p2), bigInteger, bigInteger2, byArray);
    }

    public aa(d object, ac ac2, BigInteger bigInteger, BigInteger bigInteger2, byte[] byArray) {
        this.O = object;
        this.P = ac2;
        this.Q = bigInteger;
        this.R = bigInteger2;
        this.S = byArray;
        if (b.b(((d)object).f())) {
            this.N = new ae(((d)object).f().a());
            return;
        }
        if (b.a(((d)object).f())) {
            int[] nArray = ((f)((d)object).f()).c().b();
            object = nArray;
            if (nArray.length == 3) {
                this.N = new ae((int)object[2], (int)object[1]);
                return;
            }
            if (((Object)object).length == 5) {
                this.N = new ae((int)object[4], (int)object[1], (int)object[2], (int)object[3]);
                return;
            }
            throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
        }
        throw new IllegalArgumentException("'curve' is of an unsupported type");
    }

    public final d a() {
        return this.O;
    }

    public final p b() {
        return this.P.a();
    }

    public final BigInteger c() {
        return this.Q;
    }

    public final u h() {
        a a2 = new a();
        a2.a(new k(M));
        a2.a(this.N);
        a2.a(new z(this.O, this.S));
        a2.a(this.P);
        a2.a(new k(this.Q));
        if (this.R != null) {
            a2.a(new k(this.R));
        }
        return new be(a2);
    }
}

