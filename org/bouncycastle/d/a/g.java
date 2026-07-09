/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.a;

import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.asn1.v;

public final class g
extends m {
    private k a;
    private n b;
    private k c;
    private byte[][] d;
    private byte[][] e;
    private byte[] f;

    private g(v v2) {
        if (v2.a(0) instanceof k) {
            this.a = k.a(v2.a(0));
        } else {
            this.b = n.a(v2.a(0));
        }
        this.c = k.a(v2.a(1));
        v v3 = v.a(v2.a(2));
        this.d = new byte[v3.d()][];
        for (int i2 = 0; i2 < v3.d(); ++i2) {
            this.d[i2] = p.a(v3.a(i2)).c();
        }
        v v4 = (v)v2.a(3);
        this.e = new byte[v4.d()][];
        for (int i3 = 0; i3 < v4.d(); ++i3) {
            this.e[i3] = p.a(v4.a(i3)).c();
        }
        v v5 = (v)v2.a(4);
        this.f = p.a(v5.a(0)).c();
    }

    public g(int n2, short[][] sArray, short[][] sArray2, short[] sArray3) {
        this.a = new k(0L);
        this.c = new k(n2);
        this.d = org.bouncycastle.asn1.util.a.a(sArray);
        this.e = org.bouncycastle.asn1.util.a.a(sArray2);
        this.f = org.bouncycastle.asn1.util.a.a(sArray3);
    }

    public static g a(Object object) {
        if (object != null) {
            return new g(v.a(object));
        }
        return null;
    }

    public final int a() {
        return this.c.b().intValue();
    }

    public final short[][] b() {
        return org.bouncycastle.asn1.util.a.a(this.d);
    }

    public final short[][] c() {
        return org.bouncycastle.asn1.util.a.a(this.e);
    }

    public final short[] d() {
        return org.bouncycastle.asn1.util.a.b(this.f);
    }

    public final u h() {
        a a2 = new a();
        if (this.a != null) {
            a2.a(this.a);
        } else {
            a2.a(this.b);
        }
        a2.a(this.c);
        a a3 = new a();
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            a3.a(new ba(this.d[i2]));
        }
        a2.a(new be(a3));
        a a4 = new a();
        for (int i3 = 0; i3 < this.e.length; ++i3) {
            a4.a(new ba(this.e[i3]));
        }
        a2.a(new be(a4));
        a a5 = new a();
        a5.a(new ba(this.f));
        a2.a(new be(a5));
        return new be(a2);
    }
}

