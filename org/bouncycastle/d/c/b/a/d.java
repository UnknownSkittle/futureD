/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.a;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.asn1.j.a;
import org.bouncycastle.asn1.j.c;
import org.bouncycastle.d.a.e;
import org.bouncycastle.d.b.a.f;

public final class d
implements PublicKey {
    private f a;

    public d(f f2) {
        this.a = f2;
    }

    public final String getAlgorithm() {
        return "McEliece";
    }

    public final String toString() {
        String string = "McEliecePublicKey:\n";
        string = string + " length of the code         : " + this.a.b() + "\n";
        string = string + " error correction capability: " + this.a.c() + "\n";
        return string + " generator matrix           : " + this.a.d();
    }

    public final boolean equals(Object object) {
        if (object instanceof d) {
            object = (d)object;
            return this.a.b() == ((d)object).a.b() && this.a.c() == ((d)object).a.c() && this.a.d().equals(((d)object).a.d());
        }
        return false;
    }

    public final int hashCode() {
        return 37 * (this.a.b() + 37 * this.a.c()) + this.a.d().hashCode();
    }

    public final byte[] getEncoded() {
        org.bouncycastle.d.a.d d2 = new org.bouncycastle.d.a.d(this.a.b(), this.a.c(), this.a.d());
        a a2 = new a(e.c);
        try {
            return new c(a2, d2).j();
        } catch (IOException iOException) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }
}

