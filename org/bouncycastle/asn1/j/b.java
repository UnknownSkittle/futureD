/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.j;

import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.j.a;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.u;

public final class b
extends m {
    private byte[] a;
    private a b;

    public b(a a2, byte[] byArray) {
        this.a = org.bouncycastle.e.a.d(byArray);
        this.b = a2;
    }

    public final u h() {
        org.bouncycastle.asn1.util.a a2 = new org.bouncycastle.asn1.util.a();
        a2.a(this.b);
        a2.a(new ba(this.a));
        return new be(a2);
    }
}

