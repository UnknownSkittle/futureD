/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.a;

import java.math.BigInteger;
import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.bj;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.asn1.v;
import org.bouncycastle.asn1.z;

public final class l
extends m {
    private final int a;
    private final byte[] b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;

    public l(int n2, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[] byArray5) {
        this.a = n2;
        this.b = org.bouncycastle.e.a.d(byArray);
        this.c = org.bouncycastle.e.a.d(byArray2);
        this.d = org.bouncycastle.e.a.d(byArray3);
        this.e = org.bouncycastle.e.a.d(byArray4);
        this.f = org.bouncycastle.e.a.d(byArray5);
    }

    private l(v f2) {
        if (!k.a(((v)f2).a(0)).b().equals(BigInteger.valueOf(0L))) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        if (((v)f2).d() != 2 && ((v)f2).d() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        v v2 = v.a(((v)f2).a(1));
        this.a = k.a(v2.a(0)).b().intValue();
        this.b = org.bouncycastle.e.a.d(ba.a(v2.a(1)).c());
        this.c = org.bouncycastle.e.a.d(ba.a(v2.a(2)).c());
        this.d = org.bouncycastle.e.a.d(ba.a(v2.a(3)).c());
        this.e = org.bouncycastle.e.a.d(ba.a(v2.a(4)).c());
        if (((v)f2).d() == 3) {
            if ((f2 = ((v)f2).a(2)) != null && !(f2 instanceof z)) {
                throw new IllegalArgumentException("unknown object in getInstance: " + f2.getClass().getName());
            }
            this.f = org.bouncycastle.e.a.d(ba.a((z)f2).c());
            return;
        }
        this.f = null;
    }

    public static l a(Object object) {
        if (object instanceof l) {
            return (l)object;
        }
        if (object != null) {
            return new l(v.a(object));
        }
        return null;
    }

    public final int a() {
        return this.a;
    }

    public final byte[] b() {
        return org.bouncycastle.e.a.d(this.b);
    }

    public final byte[] c() {
        return org.bouncycastle.e.a.d(this.c);
    }

    public final byte[] d() {
        return org.bouncycastle.e.a.d(this.d);
    }

    public final byte[] e() {
        return org.bouncycastle.e.a.d(this.e);
    }

    public final byte[] f() {
        return org.bouncycastle.e.a.d(this.f);
    }

    public final u h() {
        a a2 = new a();
        a2.a(new k(0L));
        a a3 = new a();
        a3.a(new k(this.a));
        a3.a(new ba(this.b));
        a3.a(new ba(this.c));
        a3.a(new ba(this.d));
        a3.a(new ba(this.e));
        a2.a(new be(a3));
        a2.a(new bj(true, 0, new ba(this.f)));
        return new be(a2);
    }
}

