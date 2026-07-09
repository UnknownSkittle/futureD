/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.r;
import org.bouncycastle.e.k;

public final class av
extends i {
    public av(byte[] byArray) {
        super(byArray);
    }

    private byte[] k() {
        if (this.a[this.a.length - 1] == 90) {
            if (!this.i()) {
                byte[] byArray = new byte[this.a.length + 4];
                System.arraycopy(this.a, 0, byArray, 0, this.a.length - 1);
                System.arraycopy(k.d("0000Z"), 0, byArray, this.a.length - 1, 5);
                return byArray;
            }
            if (!this.d()) {
                byte[] byArray = new byte[this.a.length + 2];
                System.arraycopy(this.a, 0, byArray, 0, this.a.length - 1);
                System.arraycopy(k.d("00Z"), 0, byArray, this.a.length - 1, 3);
                return byArray;
            }
            if (this.c()) {
                int n2;
                for (n2 = this.a.length - 2; n2 > 0 && this.a[n2] == 48; --n2) {
                }
                if (this.a[n2] == 46) {
                    byte[] byArray = new byte[n2 + 1];
                    System.arraycopy(this.a, 0, byArray, 0, n2);
                    byArray[n2] = 90;
                    return byArray;
                }
                byte[] byArray = new byte[n2 + 2];
                System.arraycopy(this.a, 0, byArray, 0, n2 + 1);
                byArray[n2 + 1] = 90;
                return byArray;
            }
            return this.a;
        }
        return this.a;
    }

    final int e() {
        int n2 = this.k().length;
        return 1 + bz.a(n2) + n2;
    }

    final void a(r r2) {
        r2.a(24, this.k());
    }
}

