/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import org.bouncycastle.jcajce.b.d;
import org.bouncycastle.openpgp.b.a.n;
import org.bouncycastle.openpgp.b.a.y;
import org.bouncycastle.openpgp.b.b;
import org.bouncycastle.openpgp.b.p;

public final class m {
    private y a = new y(new org.bouncycastle.jcajce.b.b());
    private p b;

    public m(p p2) {
        this.b = p2;
    }

    public final m a(String string) {
        this.a = new y(new d(string));
        return this;
    }

    public final b a(char[] cArray) {
        return new n(this, cArray, this.b);
    }

    static /* synthetic */ y a(m m2) {
        return m2.a;
    }
}

