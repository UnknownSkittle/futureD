/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.d;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.f.b;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.d.a.e;
import org.bouncycastle.d.a.h;
import org.bouncycastle.d.c.a.d;

public final class a
implements PrivateKey,
d {
    private final n a;
    private final org.bouncycastle.d.b.d.a b;

    public a(b b2) {
        this.a = h.a(b2.a().b()).a().a();
        this.b = new org.bouncycastle.d.b.d.a(p.a(b2.b()).c());
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof a) {
            object = (a)object;
            return this.a.equals(((a)object).a) && org.bouncycastle.e.a.a(this.b.b(), ((a)object).b.b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 37 * org.bouncycastle.e.a.c(this.b.b());
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public final byte[] getEncoded() {
        try {
            org.bouncycastle.asn1.j.a a2 = new org.bouncycastle.asn1.j.a(e.e, new h(new org.bouncycastle.asn1.j.a(this.a)));
            return new b(a2, new ba(this.b.b())).j();
        } catch (IOException iOException) {
            return null;
        }
    }

    public final String getFormat() {
        return "PKCS#8";
    }
}

