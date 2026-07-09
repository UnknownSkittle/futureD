/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.a;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.f.b;
import org.bouncycastle.asn1.j.a;
import org.bouncycastle.asn1.m;
import org.bouncycastle.d.a.e;

public final class c
implements PrivateKey,
org.bouncycastle.b.e {
    private org.bouncycastle.d.b.a.e a;

    public c(org.bouncycastle.d.b.a.e e2) {
        this.a = e2;
    }

    public final String getAlgorithm() {
        return "McEliece";
    }

    public final boolean equals(Object object) {
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        return this.a.b() == ((c)object).a.b() && this.a.c() == ((c)object).a.c() && this.a.d().equals(((c)object).a.d()) && this.a.e().equals(((c)object).a.e()) && this.a.f().equals(((c)object).a.f()) && this.a.g().equals(((c)object).a.g()) && this.a.h().equals(((c)object).a.h());
    }

    public final int hashCode() {
        return (((((this.a.c() * 37 + this.a.b()) * 37 + this.a.d().hashCode()) * 37 + this.a.e().hashCode()) * 37 + this.a.g().hashCode()) * 37 + this.a.h().hashCode()) * 37 + this.a.f().hashCode();
    }

    public final byte[] getEncoded() {
        m m2 = new org.bouncycastle.d.a.c(this.a.b(), this.a.c(), this.a.d(), this.a.e(), this.a.g(), this.a.h(), this.a.f());
        try {
            a a2 = new a(e.c);
            m2 = new b(a2, m2);
        } catch (IOException iOException) {
            return null;
        }
        try {
            return m2.j();
        } catch (IOException iOException) {
            return null;
        }
    }

    public final String getFormat() {
        return "PKCS#8";
    }
}

