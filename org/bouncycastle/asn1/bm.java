/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;
import org.bouncycastle.e.a;
import org.bouncycastle.e.k;

public final class bm
extends u {
    private final byte[] a;

    public bm(byte[] byArray) {
        this.a = org.bouncycastle.e.a.d(byArray);
    }

    final boolean a() {
        return false;
    }

    final int e() {
        return 1 + bz.a(this.a.length) + this.a.length;
    }

    final void a(r r2) {
        r2.a(21, this.a);
    }

    public final int hashCode() {
        return org.bouncycastle.e.a.c(this.a);
    }

    final boolean a(u u2) {
        if (!(u2 instanceof bm)) {
            return false;
        }
        u2 = (bm)u2;
        return org.bouncycastle.e.a.a(this.a, ((bm)u2).a);
    }

    public final String b() {
        return k.b(this.a);
    }
}

