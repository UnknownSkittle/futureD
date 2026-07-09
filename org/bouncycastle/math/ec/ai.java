/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.a;
import org.bouncycastle.math.ec.ab;
import org.bouncycastle.math.ec.aj;
import org.bouncycastle.math.ec.ak;
import org.bouncycastle.math.ec.al;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.r;

public final class ai
extends a {
    protected final p b(p p2, BigInteger object) {
        if (!(p2 instanceof r)) {
            throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
        }
        p2 = (r)p2;
        BigInteger[] bigIntegerArray = (BigInteger[])p2.c();
        int by2 = bigIntegerArray.a();
        byte bigInteger = bigIntegerArray.g().a().byteValue();
        byte by3 = ab.a((int)bigInteger);
        bigIntegerArray = bigIntegerArray.m();
        object = ab.a((BigInteger)object, by2, bigInteger, bigIntegerArray, by3);
        byte by4 = by3;
        byte by5 = bigInteger;
        al[] alArray = by5 == 0 ? ab.a : ab.b;
        BigInteger bigInteger2 = ab.a(by4);
        object = ab.a(by4, (al)object, BigInteger.valueOf(16L), bigInteger2, alArray);
        return ai.a((r)p2, (byte[])object);
    }

    private static r a(r r2, byte[] byArray) {
        r[] rArray = (r[])r2.c();
        byte by2 = rArray.g().a().byteValue();
        rArray = ((ak)rArray.a(r2, "bc_wtnaf", new aj(r2, by2))).a();
        r[] rArray2 = new r[rArray.length];
        for (int i2 = 0; i2 < rArray.length; ++i2) {
            rArray2[i2] = (r)rArray[i2].r();
        }
        r r3 = (r)r2.c().e();
        int n2 = 0;
        for (int i3 = byArray.length - 1; i3 >= 0; --i3) {
            ++n2;
            byte by3 = byArray[i3];
            if (by3 == 0) continue;
            r3 = r3.c(n2);
            n2 = 0;
            r r4 = by3 > 0 ? rArray[by3 >>> 1] : rArray2[-by3 >>> 1];
            r3 = (r)r3.b(r4);
        }
        if (n2 > 0) {
            r3 = r3.c(n2);
        }
        return r3;
    }
}

