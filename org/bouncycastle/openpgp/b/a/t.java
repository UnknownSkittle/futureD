/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.security.SecureRandom;
import org.bouncycastle.jcajce.b.b;
import org.bouncycastle.jcajce.b.d;
import org.bouncycastle.openpgp.b.a.u;
import org.bouncycastle.openpgp.b.a.y;
import org.bouncycastle.openpgp.b.m;
import org.bouncycastle.openpgp.b.n;

public final class t
implements n {
    private y a = new y(new b());
    private SecureRandom b;
    private boolean c;
    private int d;

    public t(int n2) {
        this.d = n2;
        if (n2 == 0) {
            throw new IllegalArgumentException("null cipher specified");
        }
    }

    public final t a(boolean bl2) {
        this.c = bl2;
        return this;
    }

    public final t a(String string) {
        this.a = new y(new d(string));
        return this;
    }

    public final t a(SecureRandom secureRandom) {
        this.b = secureRandom;
        return this;
    }

    public final int a() {
        return this.d;
    }

    public final SecureRandom b() {
        if (this.b == null) {
            this.b = new SecureRandom();
        }
        return this.b;
    }

    public final m a(byte[] byArray) {
        return new u(this, byArray);
    }

    static /* synthetic */ int a(t t2) {
        return t2.d;
    }

    static /* synthetic */ boolean b(t t2) {
        return t2.c;
    }

    static /* synthetic */ y c(t t2) {
        return t2.a;
    }
}

