/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.b;

import java.io.IOException;
import org.bouncycastle.asn1.j.c;
import org.bouncycastle.d.a.e;
import org.bouncycastle.e.a;

public final class b
implements org.bouncycastle.d.c.a.c {
    private final org.bouncycastle.d.b.b.b a;

    public b(c c2) {
        this.a = new org.bouncycastle.d.b.b.b(c2.c().c());
    }

    public final boolean equals(Object object) {
        if (object == null || !(object instanceof b)) {
            return false;
        }
        object = (b)object;
        return org.bouncycastle.e.a.a(this.a.b(), ((b)object).a.b());
    }

    public final int hashCode() {
        return org.bouncycastle.e.a.c(this.a.b());
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public final byte[] getEncoded() {
        try {
            org.bouncycastle.asn1.j.a a2 = new org.bouncycastle.asn1.j.a(e.f);
            return new c(a2, this.a.b()).j();
        } catch (IOException iOException) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }
}

