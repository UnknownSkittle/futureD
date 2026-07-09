/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.d;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.asn1.j.c;
import org.bouncycastle.asn1.n;
import org.bouncycastle.d.a.e;
import org.bouncycastle.d.a.h;
import org.bouncycastle.d.c.a.d;
import org.bouncycastle.e.a;

public final class b
implements PublicKey,
d {
    private final n a;
    private final org.bouncycastle.d.b.d.b b;

    public b(c c2) {
        this.a = h.a(c2.a().b()).a().a();
        this.b = new org.bouncycastle.d.b.d.b(c2.c().c());
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof b) {
            object = (b)object;
            return this.a.equals(((b)object).a) && org.bouncycastle.e.a.a(this.b.b(), ((b)object).b.b());
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
            return new c(a2, this.b.b()).j();
        } catch (IOException iOException) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }
}

