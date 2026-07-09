/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.i;

import java.math.BigInteger;
import org.bouncycastle.crypto.i.l;

public final class m
extends l {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;
    private BigInteger e;
    private BigInteger f;

    public m(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        super(true, bigInteger, bigInteger3);
        this.a = bigInteger2;
        this.b = bigInteger4;
        this.c = bigInteger5;
        this.d = bigInteger6;
        this.e = bigInteger7;
        this.f = bigInteger8;
    }

    public final BigInteger d() {
        return this.a;
    }

    public final BigInteger e() {
        return this.b;
    }

    public final BigInteger f() {
        return this.c;
    }

    public final BigInteger g() {
        return this.d;
    }

    public final BigInteger h() {
        return this.e;
    }

    public final BigInteger i() {
        return this.f;
    }
}

