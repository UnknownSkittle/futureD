/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import org.bouncycastle.jcajce.b.b;
import org.bouncycastle.openpgp.b.a.g;
import org.bouncycastle.openpgp.b.a.q;
import org.bouncycastle.openpgp.b.a.y;
import org.bouncycastle.openpgp.b.d;

public final class p {
    private y a = new y(new b());
    private org.bouncycastle.openpgp.b.p b;
    private g c = new g();

    public final p a(String string) {
        this.a = new y(new org.bouncycastle.jcajce.b.d(string));
        if (this.c != null) {
            this.c.a(string);
        }
        return this;
    }

    public final d a(char[] cArray) {
        if (this.b == null) {
            this.b = this.c;
        }
        return new q(this, cArray, this.b);
    }

    static /* synthetic */ y a(p p2) {
        return p2.a;
    }
}

