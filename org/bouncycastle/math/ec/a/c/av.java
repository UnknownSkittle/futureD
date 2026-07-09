/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.b.f;
import org.bouncycastle.e.a;
import org.bouncycastle.math.ec.a.c.au;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.k;

public final class av
extends k {
    private long[] f;

    public av(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.f = au.a(bigInteger);
    }

    public av() {
        this.f = new long[2];
    }

    private av(long[] lArray) {
        this.f = lArray;
    }

    public final boolean i() {
        long[] lArray = this.f;
        if (this.f[0] != 1L) {
            return false;
        }
        for (int i2 = 1; i2 < 2; ++i2) {
            if (lArray[1] == 0L) continue;
            return false;
        }
        return true;
    }

    public final boolean j() {
        return org.bouncycastle.b.f.a(this.f);
    }

    public final boolean k() {
        return (this.f[0] & 1L) != 0L;
    }

    public final BigInteger a() {
        long[] lArray = this.f;
        byte[] byArray = new byte[16];
        for (int i2 = 0; i2 < 2; ++i2) {
            long l2 = lArray[i2];
            if (l2 == 0L) continue;
            ab.a(l2, byArray, 1 - i2 << 3);
        }
        return new BigInteger(1, byArray);
    }

    public final int b() {
        return 113;
    }

    public final j a(j object) {
        long[] lArray;
        long[] lArray2 = lArray = new long[2];
        long[] lArray3 = ((av)object).f;
        object = this.f;
        lArray2[0] = (long)(object[0] ^ lArray3[0]);
        lArray2[1] = (long)(object[1] ^ lArray3[1]);
        return new av(lArray);
    }

    public final j c() {
        long[] lArray;
        long[] lArray2 = lArray = new long[2];
        long[] lArray3 = this.f;
        lArray2[0] = lArray3[0] ^ 1L;
        lArray2[1] = lArray3[1];
        return new av(lArray);
    }

    public final j b(j j2) {
        return this.a(j2);
    }

    public final j c(j j2) {
        long[] lArray = new long[2];
        au.a(this.f, ((av)j2).f, lArray);
        return new av(lArray);
    }

    public final j a(j j2, j j3, j j4) {
        return this.b(j2, j3, j4);
    }

    public final j b(j object, j object2, j object3) {
        long[] lArray = this.f;
        object = ((av)object).f;
        object2 = ((av)object2).f;
        object3 = ((av)object3).f;
        long[] lArray2 = new long[4];
        au.b(lArray, (long[])object, lArray2);
        au.b((long[])object2, (long[])object3, lArray2);
        object = new long[2];
        au.b(lArray2, (long[])object);
        return new av((long[])object);
    }

    public final j d(j j2) {
        return this.c(j2.f());
    }

    public final j d() {
        return this;
    }

    public final j e() {
        long[] lArray = new long[2];
        au.c(this.f, lArray);
        return new av(lArray);
    }

    public final j a(j object, j object2) {
        long[] lArray = this.f;
        object = ((av)object).f;
        object2 = ((av)object2).f;
        long[] lArray2 = new long[4];
        au.d(lArray, lArray2);
        au.b((long[])object, (long[])object2, lArray2);
        object = new long[2];
        au.b(lArray2, (long[])object);
        return new av((long[])object);
    }

    public final j a(int n2) {
        if (n2 <= 0) {
            return this;
        }
        long[] lArray = new long[2];
        au.a(this.f, n2, lArray);
        return new av(lArray);
    }

    public final int m() {
        return (int)this.f[0] & 1;
    }

    public final j f() {
        long[] lArray = new long[2];
        au.a(this.f, lArray);
        return new av(lArray);
    }

    public final j g() {
        long[] lArray;
        long[] lArray2 = lArray = new long[2];
        long[] lArray3 = this.f;
        long l2 = org.bouncycastle.asn1.util.a.a(this.f[0]);
        long l3 = org.bouncycastle.asn1.util.a.a(lArray3[1]);
        long l4 = l2 & 0xFFFFFFFFL | l3 << 32;
        long l5 = l2 >>> 32 | l3 & 0xFFFFFFFF00000000L;
        lArray2[0] = l4 ^ l5 << 57 ^ l5 << 5;
        lArray2[1] = l5 >>> 7 ^ l5 >>> 59;
        return new av(lArray);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof av)) {
            return false;
        }
        object = (av)object;
        long[] lArray = ((av)object).f;
        object = this.f;
        for (int i2 = 1; i2 >= 0; --i2) {
            if (object[i2] == lArray[i2]) continue;
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 0x1B971 ^ a.a(this.f, 2);
    }
}

