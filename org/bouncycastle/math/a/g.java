/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.a;

import java.math.BigInteger;
import org.bouncycastle.math.a.a;

final class g
implements a {
    private BigInteger a;

    g(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    public final BigInteger a() {
        return this.a;
    }

    public final int b() {
        return 1;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof g)) {
            return false;
        }
        object = (g)object;
        return this.a.equals(((g)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

