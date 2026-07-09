/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.k;

import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.u;
import org.bouncycastle.math.ec.b;
import org.bouncycastle.math.ec.j;

public final class ad
extends m {
    private j a;

    public ad(j j2) {
        this.a = j2;
    }

    public final u h() {
        byte[] byArray;
        byte[] byArray2;
        int n2 = (this.a.b() + 7) / 8;
        int n3 = n2;
        if (n3 < (byArray2 = this.a.a().toByteArray()).length) {
            byte[] byArray3 = new byte[n3];
            System.arraycopy(byArray2, byArray2.length - byArray3.length, byArray3, 0, byArray3.length);
            byArray = byArray3;
        } else if (n3 > byArray2.length) {
            byte[] byArray4 = new byte[n3];
            System.arraycopy(byArray2, 0, byArray4, byArray4.length - byArray2.length, byArray2.length);
            byArray = byArray4;
        } else {
            byArray = byArray2;
        }
        byArray2 = byArray;
        return new ba(byArray2);
    }

    static {
        new b();
    }
}

