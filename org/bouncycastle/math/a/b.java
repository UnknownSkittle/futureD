/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.a;

import java.math.BigInteger;
import org.bouncycastle.math.a.a;
import org.bouncycastle.math.a.c;
import org.bouncycastle.math.a.d;
import org.bouncycastle.math.a.f;
import org.bouncycastle.math.a.g;

public abstract class b {
    private static a a = new g(BigInteger.valueOf(2L));
    private static a b = new g(BigInteger.valueOf(3L));

    public static f a(int[] nArray) {
        if (nArray[0] != 0) {
            throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int i2 = 1; i2 < nArray.length; ++i2) {
            if (nArray[i2] > nArray[i2 - 1]) continue;
            throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
        }
        return new d(a, new c(nArray));
    }

    public static a a(BigInteger bigInteger) {
        int n2 = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || n2 < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (n2 < 3) {
            switch (bigInteger.intValue()) {
                case 2: {
                    return a;
                }
                case 3: {
                    return b;
                }
            }
        }
        return new g(bigInteger);
    }
}

