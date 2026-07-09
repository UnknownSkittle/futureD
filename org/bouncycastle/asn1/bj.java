/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.z;

public final class bj
extends z {
    public bj(boolean bl2, int n2, f f2) {
        super(bl2, n2, f2);
    }

    final boolean a() {
        if (this.b) {
            return true;
        }
        return this.c.h().f().a();
    }

    final int e() {
        int n2 = this.c.h().f().e();
        if (this.b) {
            return bz.b(this.a) + bz.a(n2) + n2;
        }
        return bz.b(this.a) + --n2;
    }

    final void a(r r2) {
        u u2 = this.c.h().f();
        if (this.b) {
            r2.a(160, this.a);
            r2.a(u2.e());
            r2.a((f)u2);
            return;
        }
        int n2 = u2.a() ? 160 : 128;
        r2.a(n2, this.a);
        r2.a(u2);
    }
}

