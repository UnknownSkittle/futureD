/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ab;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.t;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.y;

public final class ac
implements b {
    private final int a;
    private final y b;

    ac(int n2, y y2) {
        this.a = n2;
        this.b = y2;
    }

    public final u d() {
        return new ab(this.a, this.b.b());
    }

    public final u h() {
        try {
            return this.d();
        } catch (IOException iOException) {
            throw new t(iOException.getMessage(), iOException);
        }
    }
}

