/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.b;

import java.math.BigInteger;

public final class d {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private BigInteger h;
    private int i;

    private static void a(BigInteger[] bigIntegerArray, String string) {
        if (bigIntegerArray == null || bigIntegerArray.length != 2 || bigIntegerArray[0] == null || bigIntegerArray[1] == null) {
            throw new IllegalArgumentException("'" + string + "' must consist of exactly 2 (non-null) values");
        }
    }

    public d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArray, BigInteger[] bigIntegerArray2, BigInteger bigInteger3, BigInteger bigInteger4, int n2) {
        org.bouncycastle.math.ec.b.d.a(bigIntegerArray, "v1");
        org.bouncycastle.math.ec.b.d.a(bigIntegerArray2, "v2");
        this.a = bigInteger;
        this.b = bigInteger2;
        this.c = bigIntegerArray[0];
        this.d = bigIntegerArray[1];
        this.e = bigIntegerArray2[0];
        this.f = bigIntegerArray2[1];
        this.g = bigInteger3;
        this.h = bigInteger4;
        this.i = n2;
    }

    public final BigInteger a() {
        return this.a;
    }

    public final BigInteger b() {
        return this.c;
    }

    public final BigInteger c() {
        return this.d;
    }

    public final BigInteger d() {
        return this.e;
    }

    public final BigInteger e() {
        return this.f;
    }

    public final BigInteger f() {
        return this.g;
    }

    public final BigInteger g() {
        return this.h;
    }

    public final int h() {
        return this.i;
    }
}

