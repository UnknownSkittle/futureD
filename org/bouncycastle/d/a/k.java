/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.a;

import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.bj;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.u;
import org.bouncycastle.e.a;

public final class k
extends m {
    private final int a;
    private final byte[] b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;

    public k(int n2, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[] byArray5) {
        this.a = n2;
        this.b = org.bouncycastle.e.a.d(byArray);
        this.c = org.bouncycastle.e.a.d(byArray2);
        this.d = org.bouncycastle.e.a.d(byArray3);
        this.e = org.bouncycastle.e.a.d(byArray4);
        this.f = org.bouncycastle.e.a.d(byArray5);
    }

    public final u h() {
        org.bouncycastle.asn1.util.a a2 = new org.bouncycastle.asn1.util.a();
        a2.a(new org.bouncycastle.asn1.k(0L));
        org.bouncycastle.asn1.util.a a3 = new org.bouncycastle.asn1.util.a();
        a3.a(new org.bouncycastle.asn1.k(this.a));
        a3.a(new ba(this.b));
        a3.a(new ba(this.c));
        a3.a(new ba(this.d));
        a3.a(new ba(this.e));
        a2.a(new be(a3));
        a2.a(new bj(true, 0, new ba(this.f)));
        return new be(a2);
    }
}

