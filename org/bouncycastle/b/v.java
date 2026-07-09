/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.math.BigInteger;
import org.bouncycastle.b.c;
import org.bouncycastle.b.f;
import org.bouncycastle.b.g;

public final class v
extends f {
    BigInteger a = null;

    public v(c c2) {
        byte[] byArray = new byte[((c2.read() << 8 | c2.read()) + 7) / 8];
        c2.a(byArray);
        this.a = new BigInteger(1, byArray);
    }

    public v(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0) {
            throw new IllegalArgumentException("value must not be null, or negative");
        }
        this.a = bigInteger;
    }

    public final BigInteger b() {
        return this.a;
    }

    public final void a(g g2) {
        int n2 = this.a.bitLength();
        g2.write(n2 >> 8);
        g2.write(n2);
        byte[] byArray = this.a.toByteArray();
        if (byArray[0] == 0) {
            g2.write(byArray, 1, byArray.length - 1);
            return;
        }
        g2.write(byArray, 0, byArray.length);
    }
}

