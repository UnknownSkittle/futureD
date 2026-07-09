/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import org.bouncycastle.jcajce.b.b;
import org.bouncycastle.openpgp.b.a.e;
import org.bouncycastle.openpgp.b.a.y;
import org.bouncycastle.openpgp.b.i;
import org.bouncycastle.openpgp.b.j;

public final class d
implements j {
    private y a = new y(new b());
    private org.bouncycastle.openpgp.b.a.j b = new org.bouncycastle.openpgp.b.a.j();

    public final d a(String string) {
        this.a = new y(new org.bouncycastle.jcajce.b.d(string));
        this.b.a(string);
        return this;
    }

    public final i a(int n2, int n3) {
        return new e(this, n2, n3);
    }

    static /* synthetic */ y a(d d2) {
        return d2.a;
    }

    static /* synthetic */ org.bouncycastle.openpgp.b.a.j b(d d2) {
        return d2.b;
    }
}

