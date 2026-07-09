/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.bg;
import org.bouncycastle.asn1.t;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.y;

public final class bh
implements b {
    private y a;

    bh(y y2) {
        this.a = y2;
    }

    public final u d() {
        return new bg(this.a.b());
    }

    public final u h() {
        try {
            return this.d();
        } catch (IOException iOException) {
            throw new t(iOException.getMessage(), iOException);
        }
    }
}

