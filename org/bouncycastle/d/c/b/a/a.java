/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.a;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.d.a.e;
import org.bouncycastle.d.b.a.b;
import org.bouncycastle.d.c.b.a.g;

public final class a
implements PrivateKey {
    private b a;

    public a(b b2) {
        this.a = b2;
    }

    public final String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public final boolean equals(Object object) {
        if (object == null || !(object instanceof a)) {
            return false;
        }
        object = (a)object;
        return this.a.c() == ((a)object).a.c() && this.a.d() == ((a)object).a.d() && this.a.e().equals(((a)object).a.e()) && this.a.f().equals(((a)object).a.f()) && this.a.g().equals(((a)object).a.g()) && this.a.h().equals(((a)object).a.h());
    }

    public final int hashCode() {
        return ((((this.a.d() * 37 + this.a.c()) * 37 + this.a.e().hashCode()) * 37 + this.a.f().hashCode()) * 37 + this.a.g().hashCode()) * 37 + this.a.h().hashCode();
    }

    public final byte[] getEncoded() {
        try {
            org.bouncycastle.d.a.a a2 = new org.bouncycastle.d.a.a(this.a.c(), this.a.d(), this.a.e(), this.a.f(), this.a.g(), g.a(this.a.b()));
            org.bouncycastle.asn1.j.a a3 = new org.bouncycastle.asn1.j.a(e.d);
            return new org.bouncycastle.asn1.f.b(a3, a2).j();
        } catch (IOException iOException) {
            return null;
        }
    }

    public final String getFormat() {
        return "PKCS#8";
    }
}

