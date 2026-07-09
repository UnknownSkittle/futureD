/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.c;
import org.bouncycastle.asn1.r;

public final class bo
extends c {
    public bo(byte[] byArray, int n2) {
        super(byArray, n2);
    }

    final boolean a() {
        return false;
    }

    final int e() {
        return 1 + bz.a(this.a.length + 1) + this.a.length + 1;
    }

    final void a(r r2) {
        byte[] byArray = this.a;
        byte[] byArray2 = new byte[this.a.length + 1];
        byte[] byArray3 = byArray2;
        byArray2[0] = (byte)this.d();
        System.arraycopy(byArray, 0, byArray3, 1, byArray3.length - 1);
        r2.a(3, byArray3);
    }
}

