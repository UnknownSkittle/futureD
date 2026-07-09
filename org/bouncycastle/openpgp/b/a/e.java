/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.security.InvalidKeyException;
import java.security.Signature;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.b.a.d;
import org.bouncycastle.openpgp.b.a.f;
import org.bouncycastle.openpgp.b.h;
import org.bouncycastle.openpgp.b.i;
import org.bouncycastle.openpgp.m;

final class e
implements i {
    private int a;
    private int b;
    private /* synthetic */ d c;

    public e(d d2, int n2, int n3) {
        this.c = d2;
        this.b = n2;
        this.a = n3;
    }

    public final h a(ab ab2) {
        Signature signature = d.a(this.c).a(this.b, this.a);
        try {
            signature.initVerify(d.b(this.c).a(ab2));
        } catch (InvalidKeyException invalidKeyException) {
            throw new m("invalid key.", invalidKeyException);
        }
        return new f(this, ab2, signature);
    }
}

