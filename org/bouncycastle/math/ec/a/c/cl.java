/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.jcajce.provider.c.a;
import org.bouncycastle.math.ec.a.c.ck;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.k;

public final class cl
extends k {
    private long[] f;

    public cl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.f = ck.a(bigInteger);
    }

    public cl() {
        this.f = new long[7];
    }

    private cl(long[] lArray) {
        this.f = lArray;
    }

    public final boolean i() {
        long[] lArray = this.f;
        if (this.f[0] != 1L) {
            return false;
        }
        for (int i2 = 1; i2 < 7; ++i2) {
            if (lArray[i2] == 0L) continue;
            return false;
        }
        return true;
    }

    public final boolean j() {
        return a.a(this.f);
    }

    public final boolean k() {
        return (this.f[0] & 1L) != 0L;
    }

    public final BigInteger a() {
        long[] lArray = this.f;
        byte[] byArray = new byte[56];
        for (int i2 = 0; i2 < 7; ++i2) {
            long l2 = lArray[i2];
            if (l2 == 0L) continue;
            ab.a(l2, byArray, 6 - i2 << 3);
        }
        return new BigInteger(1, byArray);
    }

    public final int b() {
        return 409;
    }

    public final j a(j object) {
        long[] lArray;
        long[] lArray2 = lArray = new long[7];
        long[] lArray3 = ((cl)object).f;
        object = this.f;
        lArray2[0] = (long)(object[0] ^ lArray3[0]);
        lArray2[1] = (long)(object[1] ^ lArray3[1]);
        lArray2[2] = (long)(object[2] ^ lArray3[2]);
        lArray2[3] = (long)(object[3] ^ lArray3[3]);
        lArray2[4] = (long)(object[4] ^ lArray3[4]);
        lArray2[5] = (long)(object[5] ^ lArray3[5]);
        lArray2[6] = (long)(object[6] ^ lArray3[6]);
        return new cl(lArray);
    }

    public final j c() {
        long[] lArray;
        long[] lArray2 = lArray = new long[7];
        long[] lArray3 = this.f;
        lArray2[0] = lArray3[0] ^ 1L;
        lArray2[1] = lArray3[1];
        lArray2[2] = lArray3[2];
        lArray2[3] = lArray3[3];
        lArray2[4] = lArray3[4];
        lArray2[5] = lArray3[5];
        lArray2[6] = lArray3[6];
        return new cl(lArray);
    }

    public final j b(j j2) {
        return this.a(j2);
    }

    public final j c(j j2) {
        long[] lArray = new long[7];
        ck.a(this.f, ((cl)j2).f, lArray);
        return new cl(lArray);
    }

    public final j a(j j2, j j3, j j4) {
        return this.b(j2, j3, j4);
    }

    public final j b(j object, j object2, j object3) {
        long[] lArray = this.f;
        object = ((cl)object).f;
        object2 = ((cl)object2).f;
        object3 = ((cl)object3).f;
        long[] lArray2 = new long[13];
        ck.b(lArray, (long[])object, lArray2);
        ck.b((long[])object2, (long[])object3, lArray2);
        object = new long[7];
        ck.b(lArray2, (long[])object);
        return new cl((long[])object);
    }

    public final j d(j j2) {
        return this.c(j2.f());
    }

    public final j d() {
        return this;
    }

    public final j e() {
        long[] lArray = new long[7];
        ck.c(this.f, lArray);
        return new cl(lArray);
    }

    public final j a(j object, j object2) {
        long[] lArray = this.f;
        object = ((cl)object).f;
        object2 = ((cl)object2).f;
        long[] lArray2 = new long[13];
        ck.d(lArray, lArray2);
        ck.b((long[])object, (long[])object2, lArray2);
        object = new long[7];
        ck.b(lArray2, (long[])object);
        return new cl((long[])object);
    }

    public final j a(int n2) {
        if (n2 <= 0) {
            return this;
        }
        long[] lArray = new long[7];
        ck.a(this.f, n2, lArray);
        return new cl(lArray);
    }

    public final int m() {
        return (int)this.f[0] & 1;
    }

    public final j f() {
        long[] lArray = new long[7];
        ck.a(this.f, lArray);
        return new cl(lArray);
    }

    public final j g() {
        long[] lArray;
        long[] lArray2 = lArray = new long[7];
        long[] lArray3 = this.f;
        long l2 = org.bouncycastle.asn1.util.a.a(this.f[0]);
        long l3 = org.bouncycastle.asn1.util.a.a(lArray3[1]);
        long l4 = l2 & 0xFFFFFFFFL | l3 << 32;
        long l5 = l2 >>> 32 | l3 & 0xFFFFFFFF00000000L;
        l2 = org.bouncycastle.asn1.util.a.a(lArray3[2]);
        l3 = org.bouncycastle.asn1.util.a.a(lArray3[3]);
        long l6 = l2 & 0xFFFFFFFFL | l3 << 32;
        long l7 = l2 >>> 32 | l3 & 0xFFFFFFFF00000000L;
        l2 = org.bouncycastle.asn1.util.a.a(lArray3[4]);
        l3 = org.bouncycastle.asn1.util.a.a(lArray3[5]);
        long l8 = l2 & 0xFFFFFFFFL | l3 << 32;
        long l9 = l2 >>> 32 | l3 & 0xFFFFFFFF00000000L;
        l2 = org.bouncycastle.asn1.util.a.a(lArray3[6]);
        long l10 = l2 & 0xFFFFFFFFL;
        long l11 = l2 >>> 32;
        lArray2[0] = l4 ^ l5 << 44;
        lArray2[1] = l6 ^ l7 << 44 ^ l5 >>> 20;
        lArray2[2] = l8 ^ l9 << 44 ^ l7 >>> 20;
        lArray2[3] = l10 ^ l11 << 44 ^ l9 >>> 20 ^ l5 << 13;
        lArray2[4] = l11 >>> 20 ^ l7 << 13 ^ l5 >>> 51;
        lArray2[5] = l9 << 13 ^ l7 >>> 51;
        lArray2[6] = l11 << 13 ^ l9 >>> 51;
        return new cl(lArray);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof cl)) {
            return false;
        }
        object = (cl)object;
        long[] lArray = ((cl)object).f;
        object = this.f;
        for (int i2 = 6; i2 >= 0; --i2) {
            if (object[i2] == lArray[i2]) continue;
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 0x3E68E7 ^ org.bouncycastle.e.a.a(this.f, 7);
    }
}

