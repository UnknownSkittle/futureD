/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.util.Enumeration;
import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.asn1.x;

public final class bg
extends x {
    private int a = -1;

    public bg() {
    }

    bg(a a2) {
        super(a2);
    }

    private int c() {
        if (this.a < 0) {
            int n2 = 0;
            Enumeration enumeration = this.b();
            while (enumeration.hasMoreElements()) {
                Object e2 = enumeration.nextElement();
                n2 += ((f)e2).h().f().e();
            }
            this.a = n2;
        }
        return this.a;
    }

    final int e() {
        int n2 = this.c();
        return 1 + bz.a(n2) + n2;
    }

    final void a(r object) {
        r r2 = ((r)object).a();
        int n2 = this.c();
        ((r)object).b(49);
        ((r)object).a(n2);
        object = this.b();
        while (object.hasMoreElements()) {
            Object e2 = object.nextElement();
            r2.a((f)e2);
        }
    }
}

