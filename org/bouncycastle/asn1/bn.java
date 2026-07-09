/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;
import org.bouncycastle.e.a;
import org.bouncycastle.e.k;

public final class bn
extends u {
    private final byte[] a;

    bn(byte[] byArray) {
        this.a = byArray;
    }

    public final String b() {
        return k.b(this.a);
    }

    public final String toString() {
        return k.b(this.a);
    }

    final boolean a() {
        return false;
    }

    final int e() {
        return 1 + bz.a(this.a.length) + this.a.length;
    }

    final void a(r r2) {
        r2.a(26, this.a);
    }

    final boolean a(u u2) {
        if (!(u2 instanceof bn)) {
            return false;
        }
        return org.bouncycastle.e.a.a(this.a, ((bn)u2).a);
    }

    public final int hashCode() {
        return org.bouncycastle.e.a.c(this.a);
    }
}

