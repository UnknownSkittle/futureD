/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.util.Enumeration;
import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.asn1.v;

public final class bq
extends v {
    private int b = -1;

    public bq() {
    }

    public bq(a a2) {
        super(a2);
    }

    private int i() {
        if (this.b < 0) {
            int n2 = 0;
            Enumeration enumeration = this.c();
            while (enumeration.hasMoreElements()) {
                Object e2 = enumeration.nextElement();
                n2 += ((f)e2).h().g().e();
            }
            this.b = n2;
        }
        return this.b;
    }

    final int e() {
        int n2 = this.i();
        return 1 + bz.a(n2) + n2;
    }

    final void a(r object) {
        r r2 = ((r)object).b();
        int n2 = this.i();
        ((r)object).b(48);
        ((r)object).a(n2);
        object = this.c();
        while (object.hasMoreElements()) {
            Object e2 = object.nextElement();
            r2.a((f)e2);
        }
    }
}

