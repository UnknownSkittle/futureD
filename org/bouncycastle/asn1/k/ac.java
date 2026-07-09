/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.k;

import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.u;
import org.bouncycastle.e.a;
import org.bouncycastle.math.ec.d;

public final class ac
extends m {
    private final p a;
    private d b;
    private org.bouncycastle.math.ec.p c;

    public ac(org.bouncycastle.math.ec.p p2) {
        this(p2, 0);
    }

    private ac(org.bouncycastle.math.ec.p p2, byte by2) {
        this.c = p2.m();
        this.a = new ba(p2.b(false));
    }

    public ac(d d2, byte[] byArray) {
        this.b = d2;
        this.a = new ba(org.bouncycastle.e.a.d(byArray));
    }

    public ac(d d2, p p2) {
        this(d2, p2.c());
    }

    public final synchronized org.bouncycastle.math.ec.p a() {
        if (this.c == null) {
            this.c = this.b.a(this.a.c()).m();
        }
        return this.c;
    }

    public final u h() {
        return this.a;
    }
}

