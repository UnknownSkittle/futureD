/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.e;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.asn1.j.c;
import org.bouncycastle.asn1.n;
import org.bouncycastle.d.a.j;
import org.bouncycastle.d.a.m;
import org.bouncycastle.d.b.e.r;
import org.bouncycastle.d.b.e.u;
import org.bouncycastle.d.b.e.v;
import org.bouncycastle.d.c.b.e.e;
import org.bouncycastle.e.a;

public final class b
implements PublicKey {
    private final n a;
    private final u b;

    public b(c m2) {
        j j2 = j.a(((c)m2).a().b());
        this.a = j2.c().a();
        m2 = m.a(((c)m2).b());
        this.b = new v(new r(j2.a(), j2.b(), e.a(this.a))).b(((m)m2).a()).a(((m)m2).b()).a();
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
        return "XMSSMT";
    }

    public final byte[] getEncoded() {
        try {
            org.bouncycastle.asn1.j.a a2 = new org.bouncycastle.asn1.j.a(org.bouncycastle.d.a.e.h, new j(this.b.e().a(), this.b.e().b(), new org.bouncycastle.asn1.j.a(this.a)));
            return new c(a2, new m(this.b.d(), this.b.c())).j();
        } catch (IOException iOException) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }
}

