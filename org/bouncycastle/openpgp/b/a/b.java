/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Signature;
import org.bouncycastle.jcajce.b.d;
import org.bouncycastle.openpgp.aa;
import org.bouncycastle.openpgp.b.a.c;
import org.bouncycastle.openpgp.b.a.g;
import org.bouncycastle.openpgp.b.a.j;
import org.bouncycastle.openpgp.b.a.l;
import org.bouncycastle.openpgp.b.a.y;
import org.bouncycastle.openpgp.b.f;
import org.bouncycastle.openpgp.b.o;
import org.bouncycastle.openpgp.m;

public final class b
implements org.bouncycastle.openpgp.b.g {
    private y a = new y(new org.bouncycastle.jcajce.b.b());
    private g b = new g();
    private j c = new j();
    private int d;
    private int e;

    public b(int n2, int n3) {
        this.e = n2;
        this.d = n3;
    }

    public final b a(String string) {
        this.a = new y(new d(string));
        this.c.a(string);
        this.b.a(string);
        return this;
    }

    public final f a(int n2, aa aa2) {
        if (aa2 instanceof l) {
            return this.a(n2, aa2.a(), ((l)aa2).d());
        }
        return this.a(n2, aa2.a(), this.c.a(aa2));
    }

    private f a(int n2, long l2, PrivateKey privateKey) {
        o o2 = this.b.a(this.d);
        Signature signature = this.a.a(this.e, this.d);
        try {
            signature.initSign(privateKey);
        } catch (InvalidKeyException invalidKeyException) {
            throw new m("invalid key.", invalidKeyException);
        }
        return new c(this, n2, l2, signature, o2);
    }

    static /* synthetic */ int a(b b2) {
        return b2.d;
    }

    static /* synthetic */ int b(b b2) {
        return b2.e;
    }
}

