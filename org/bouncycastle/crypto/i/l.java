/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.i;

import java.math.BigInteger;
import org.bouncycastle.crypto.i.a;

public class l
extends a {
    private static final BigInteger a = BigInteger.valueOf(1L);
    private BigInteger b;
    private BigInteger c;

    public l(boolean bl2, BigInteger bigInteger, BigInteger bigInteger2) {
        super(bl2);
        if (!bl2 && (bigInteger2.intValue() & 1) == 0) {
            throw new IllegalArgumentException("RSA publicExponent is even");
        }
        BigInteger bigInteger3 = bigInteger;
        if ((bigInteger3.intValue() & 1) == 0) {
            throw new IllegalArgumentException("RSA modulus is even");
        }
        if (!bigInteger3.gcd(new BigInteger("1451887755777639901511587432083070202422614380984889313550570919659315177065956574359078912654149167643992684236991305777574330831666511589145701059710742276692757882915756220901998212975756543223550490431013061082131040808010565293748926901442915057819663730454818359472391642885328171302299245556663073719855")).equals(a)) {
            throw new IllegalArgumentException("RSA modulus has a small prime factor");
        }
        this.b = bigInteger3;
        this.c = bigInteger2;
    }

    public final BigInteger b() {
        return this.b;
    }

    public final BigInteger c() {
        return this.c;
    }
}

