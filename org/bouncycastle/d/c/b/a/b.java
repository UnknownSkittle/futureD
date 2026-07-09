/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.a;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.asn1.j.a;
import org.bouncycastle.asn1.j.c;
import org.bouncycastle.d.a.e;
import org.bouncycastle.d.c.b.a.g;

public final class b
implements PublicKey,
org.bouncycastle.b.e {
    private org.bouncycastle.d.b.a.c a;

    public b(org.bouncycastle.d.b.a.c c2) {
        this.a = c2;
    }

    public final String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public final String toString() {
        String string = "McEliecePublicKey:\n";
        string = string + " length of the code         : " + this.a.c() + "\n";
        string = string + " error correction capability: " + this.a.d() + "\n";
        return string + " generator matrix           : " + this.a.e().toString();
    }

    public final boolean equals(Object object) {
        if (object == null || !(object instanceof b)) {
            return false;
        }
        object = (b)object;
        return this.a.c() == ((b)object).a.c() && this.a.d() == ((b)object).a.d() && this.a.e().equals(((b)object).a.e());
    }

    public final int hashCode() {
        return 37 * (this.a.c() + 37 * this.a.d()) + this.a.e().hashCode();
    }

    public final byte[] getEncoded() {
        org.bouncycastle.d.a.b b2 = new org.bouncycastle.d.a.b(this.a.c(), this.a.d(), this.a.e(), g.a(this.a.b()));
        a a2 = new a(e.d);
        try {
            return new c(a2, b2).j();
        } catch (IOException iOException) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }
}

