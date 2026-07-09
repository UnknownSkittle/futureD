/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.t;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.y;

public final class am
implements b {
    private boolean a;
    private int b;
    private y c;

    am(boolean bl2, int n2, y y2) {
        this.a = bl2;
        this.b = n2;
        this.c = y2;
    }

    public final u d() {
        return this.c.a(this.a, this.b);
    }

    public final u h() {
        try {
            return this.d();
        } catch (IOException iOException) {
            throw new t(iOException.getMessage());
        }
    }
}

