/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import org.bouncycastle.asn1.ae;
import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.v;
import org.bouncycastle.asn1.x;
import org.bouncycastle.asn1.z;

public final class al
extends z {
    public al(boolean bl2, int n2, f f2) {
        super(bl2, n2, f2);
    }

    final boolean a() {
        if (this.b) {
            return true;
        }
        return this.c.h().f().a();
    }

    final int e() {
        int n2 = this.c.h().e();
        if (this.b) {
            return bz.b(this.a) + bz.a(n2) + n2;
        }
        return bz.b(this.a) + --n2;
    }

    final void a(r r2) {
        r2.a(160, this.a);
        r2.b(128);
        if (!this.b) {
            Object object;
            if (this.c instanceof p) {
                if (this.c instanceof ae) {
                    object = ((ae)this.c).i();
                } else {
                    object = (p)this.c;
                    object = new ae(((p)object).c()).i();
                }
            } else if (this.c instanceof v) {
                object = ((v)this.c).c();
            } else if (this.c instanceof x) {
                object = ((x)this.c).b();
            } else {
                throw new h("not implemented: " + this.c.getClass().getName());
            }
            while (object.hasMoreElements()) {
                r2.a((f)object.nextElement());
            }
        } else {
            r2.a(this.c);
        }
        r2.b(0);
        r2.b(0);
    }
}

