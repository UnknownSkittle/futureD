/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.w;
import org.bouncycastle.asn1.y;

public final class bf
implements w {
    private y a;

    bf(y y2) {
        this.a = y2;
    }

    public final u d() {
        return new be(this.a.b());
    }

    public final u h() {
        try {
            return this.d();
        } catch (IOException iOException) {
            throw new IllegalStateException(iOException.getMessage());
        }
    }
}

