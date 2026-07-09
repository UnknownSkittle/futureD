/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.e;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.asn1.j.c;
import org.bouncycastle.asn1.n;
import org.bouncycastle.d.a.i;
import org.bouncycastle.d.a.m;
import org.bouncycastle.d.b.e.ab;
import org.bouncycastle.d.b.e.ac;
import org.bouncycastle.d.b.e.y;
import org.bouncycastle.d.c.b.e.e;
import org.bouncycastle.e.a;

public final class d
implements PublicKey {
    private final ab a;
    private final n b;

    public d(c m2) {
        i i2 = i.a(((c)m2).a().b());
        this.b = i2.b().a();
        m2 = m.a(((c)m2).b());
        this.a = new ac(new y(i2.a(), e.a(this.b))).b(((m)m2).a()).a(((m)m2).b()).a();
    }

    public final String getAlgorithm() {
        return "XMSS";
    }

    public final byte[] getEncoded() {
        try {
            org.bouncycastle.asn1.j.a a2 = new org.bouncycastle.asn1.j.a(org.bouncycastle.d.a.e.g, new i(this.a.e().c(), new org.bouncycastle.asn1.j.a(this.b)));
            return new c(a2, new m(this.a.d(), this.a.c())).j();
        } catch (IOException iOException) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof d) {
            object = (d)object;
            return this.b.equals(((d)object).b) && org.bouncycastle.e.a.a(this.a.b(), ((d)object).a.b());
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + 37 * org.bouncycastle.e.a.c(this.a.b());
    }
}

