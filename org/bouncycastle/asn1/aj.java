/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.util.Enumeration;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.asn1.x;

public final class aj
extends x {
    public aj() {
    }

    public aj(f f2) {
        super(f2);
    }

    public aj(a a2) {
        super(a2);
    }

    public aj(f[] fArray) {
        super(fArray);
    }

    final int e() {
        int n2 = 0;
        Enumeration enumeration = this.b();
        while (enumeration.hasMoreElements()) {
            n2 += ((f)enumeration.nextElement()).h().e();
        }
        return n2 + 2 + 2;
    }

    final void a(r r2) {
        r2.b(49);
        r2.b(128);
        Enumeration enumeration = this.b();
        while (enumeration.hasMoreElements()) {
            r2.a((f)enumeration.nextElement());
        }
        r2.b(0);
        r2.b(0);
    }
}

