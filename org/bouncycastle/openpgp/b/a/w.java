/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import org.bouncycastle.openpgp.aa;
import org.bouncycastle.openpgp.b.a.v;
import org.bouncycastle.openpgp.b.k;
import org.bouncycastle.openpgp.b.r;

final class w
implements r {
    private /* synthetic */ aa a;
    private /* synthetic */ v b;

    w(v v2, aa aa2) {
        this.b = v2;
        this.a = aa2;
    }

    public final byte[] a(int n2, byte[][] byArray) {
        if (n2 == 18) {
            return v.a(this.b, v.b(this.b), this.a, byArray);
        }
        v v2 = this.b;
        return v.a(v2, n2, v.b(v2).a(this.a), byArray);
    }

    public final k a(boolean bl2, int n2, byte[] byArray) {
        return v.a(this.b).a(bl2, n2, byArray);
    }
}

