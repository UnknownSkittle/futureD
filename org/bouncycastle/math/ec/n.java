/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.l;

public final class n
extends l {
    private BigInteger f;
    private BigInteger g;
    private BigInteger h;

    static BigInteger a(BigInteger bigInteger) {
        int n2 = bigInteger.bitLength();
        if (n2 >= 96 && bigInteger.shiftRight(n2 - 64).longValue() == -1L) {
            return b.shiftLeft(n2).subtract(bigInteger);
        }
        return null;
    }

    public n(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = bigInteger;
        this(bigInteger3, n.a(bigInteger3), bigInteger2);
    }

    n(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException("x value invalid in Fp field element");
        }
        this.f = bigInteger;
        this.g = bigInteger2;
        this.h = bigInteger3;
    }

    public final BigInteger a() {
        return this.h;
    }

    public final int b() {
        return this.f.bitLength();
    }

    public final j a(j j2) {
        n n2 = this;
        BigInteger bigInteger = j2.a();
        BigInteger bigInteger2 = n2.h;
        j2 = n2;
        if ((bigInteger2 = bigInteger2.add(bigInteger)).compareTo(((n)j2).f) >= 0) {
            bigInteger2 = bigInteger2.subtract(((n)j2).f);
        }
        return new n(this.f, this.g, bigInteger2);
    }

    public final j c() {
        BigInteger bigInteger = this.h.add(c.b);
        if (bigInteger.compareTo(this.f) == 0) {
            bigInteger = c.a;
        }
        return new n(this.f, this.g, bigInteger);
    }

    public final j b(j j2) {
        n n2 = this;
        BigInteger bigInteger = j2.a();
        BigInteger bigInteger2 = n2.h;
        j2 = n2;
        if ((bigInteger2 = bigInteger2.subtract(bigInteger)).signum() < 0) {
            bigInteger2 = bigInteger2.add(((n)j2).f);
        }
        return new n(this.f, this.g, bigInteger2);
    }

    public final j c(j j2) {
        n n2 = this;
        return new n(this.f, this.g, n2.a(n2.h, j2.a()));
    }

    public final j a(j object, j object2, j object3) {
        BigInteger bigInteger = this.h;
        object = ((j)object).a();
        object2 = ((j)object2).a();
        object3 = ((j)object3).a();
        object = bigInteger.multiply((BigInteger)object);
        object2 = ((BigInteger)object2).multiply((BigInteger)object3);
        return new n(this.f, this.g, this.d(((BigInteger)object).subtract((BigInteger)object2)));
    }

    public final j b(j object, j object2, j object3) {
        BigInteger bigInteger = this.h;
        object = ((j)object).a();
        object2 = ((j)object2).a();
        object3 = ((j)object3).a();
        object = bigInteger.multiply((BigInteger)object);
        object2 = ((BigInteger)object2).multiply((BigInteger)object3);
        return new n(this.f, this.g, this.d(((BigInteger)object).add((BigInteger)object2)));
    }

    public final j d(j j2) {
        n n2 = this;
        return new n(this.f, this.g, n2.a(n2.h, this.c(j2.a())));
    }

    public final j d() {
        if (this.h.signum() == 0) {
            return this;
        }
        return new n(this.f, this.g, this.f.subtract(this.h));
    }

    public final j e() {
        n n2 = this;
        return new n(this.f, this.g, n2.a(n2.h, this.h));
    }

    public final j a(j object, j object2) {
        BigInteger bigInteger = this.h;
        object = ((j)object).a();
        object2 = ((j)object2).a();
        BigInteger bigInteger2 = bigInteger;
        bigInteger = bigInteger2.multiply(bigInteger2);
        object = ((BigInteger)object).multiply((BigInteger)object2);
        return new n(this.f, this.g, this.d(bigInteger.add((BigInteger)object)));
    }

    public final j f() {
        n n2 = this;
        return new n(this.f, this.g, n2.c(n2.h));
    }

    public final j g() {
        if (this.j() || this.i()) {
            return this;
        }
        if (!this.f.testBit(0)) {
            throw new RuntimeException("not done yet");
        }
        if (this.f.testBit(1)) {
            BigInteger bigInteger = this.f.shiftRight(2).add(c.b);
            return this.e(new n(this.f, this.g, this.h.modPow(bigInteger, this.f)));
        }
        if (this.f.testBit(2)) {
            BigInteger bigInteger = this.h.modPow(this.f.shiftRight(3), this.f);
            BigInteger bigInteger2 = this.a(bigInteger, this.h);
            if (this.a(bigInteger2, bigInteger).equals(c.b)) {
                return this.e(new n(this.f, this.g, bigInteger2));
            }
            BigInteger bigInteger3 = c.c.modPow(this.f.shiftRight(2), this.f);
            BigInteger bigInteger4 = this.a(bigInteger2, bigInteger3);
            return this.e(new n(this.f, this.g, bigInteger4));
        }
        Object object = this.f.shiftRight(1);
        if (!this.h.modPow((BigInteger)object, this.f).equals(c.b)) {
            return null;
        }
        Object object2 = this.h;
        n n2 = this;
        BigInteger bigInteger = n2.b(n2.b((BigInteger)object2));
        BigInteger bigInteger5 = ((BigInteger)object).add(c.b);
        BigInteger bigInteger6 = this.f.subtract(c.b);
        Random random = new Random();
        while (true) {
            BigInteger bigInteger7;
            if ((bigInteger7 = new BigInteger(this.f.bitLength(), random)).compareTo(this.f) >= 0) {
                continue;
            }
            BigInteger bigInteger8 = bigInteger7;
            if (!this.d(bigInteger8.multiply(bigInteger8).subtract(bigInteger)).modPow((BigInteger)object, this.f).equals(bigInteger6)) continue;
            Object object3 = this.a(bigInteger7, (BigInteger)object2, bigInteger5);
            bigInteger7 = object3[0];
            Object object4 = object3 = object3[1];
            if (this.a((BigInteger)object4, (BigInteger)object4).equals(bigInteger)) {
                object2 = object3;
                object = this;
                if (((BigInteger)object2).testBit(0)) {
                    object2 = ((n)object).f.subtract((BigInteger)object2);
                }
                return new n(this.f, this.g, ((BigInteger)object2).shiftRight(1));
            }
            if (!bigInteger7.equals(c.b) && !bigInteger7.equals(bigInteger6)) break;
        }
        return null;
    }

    private j e(j j2) {
        if (j2.e().equals(this)) {
            return j2;
        }
        return null;
    }

    private BigInteger[] a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int n2 = bigInteger3.bitLength();
        int n3 = bigInteger3.getLowestSetBit();
        BigInteger bigInteger4 = c.b;
        BigInteger bigInteger5 = c.c;
        BigInteger bigInteger6 = bigInteger;
        BigInteger bigInteger7 = c.b;
        BigInteger bigInteger8 = c.b;
        --n2;
        while (n2 >= n3 + 1) {
            bigInteger7 = this.a(bigInteger7, bigInteger8);
            if (bigInteger3.testBit(n2)) {
                bigInteger8 = this.a(bigInteger7, bigInteger2);
                bigInteger4 = this.a(bigInteger4, bigInteger6);
                bigInteger5 = this.d(bigInteger6.multiply(bigInteger5).subtract(bigInteger.multiply(bigInteger7)));
                BigInteger bigInteger9 = bigInteger6;
                bigInteger6 = this.d(bigInteger9.multiply(bigInteger9).subtract(bigInteger8.shiftLeft(1)));
            } else {
                bigInteger8 = bigInteger7;
                bigInteger4 = this.d(bigInteger4.multiply(bigInteger5).subtract(bigInteger7));
                bigInteger6 = this.d(bigInteger6.multiply(bigInteger5).subtract(bigInteger.multiply(bigInteger7)));
                BigInteger bigInteger10 = bigInteger5;
                bigInteger5 = this.d(bigInteger10.multiply(bigInteger10).subtract(bigInteger7.shiftLeft(1)));
            }
            --n2;
        }
        bigInteger7 = this.a(bigInteger7, bigInteger8);
        bigInteger8 = this.a(bigInteger7, bigInteger2);
        bigInteger4 = this.d(bigInteger4.multiply(bigInteger5).subtract(bigInteger7));
        bigInteger5 = this.d(bigInteger6.multiply(bigInteger5).subtract(bigInteger.multiply(bigInteger7)));
        bigInteger7 = this.a(bigInteger7, bigInteger8);
        for (n2 = 1; n2 <= n3; ++n2) {
            bigInteger4 = this.a(bigInteger4, bigInteger5);
            BigInteger bigInteger11 = bigInteger5;
            bigInteger5 = this.d(bigInteger11.multiply(bigInteger11).subtract(bigInteger7.shiftLeft(1)));
            BigInteger bigInteger12 = bigInteger7;
            bigInteger7 = this.a(bigInteger12, bigInteger12);
        }
        return new BigInteger[]{bigInteger4, bigInteger5};
    }

    private BigInteger b(BigInteger bigInteger) {
        if ((bigInteger = bigInteger.shiftLeft(1)).compareTo(this.f) >= 0) {
            bigInteger = bigInteger.subtract(this.f);
        }
        return bigInteger;
    }

    private BigInteger c(BigInteger object) {
        int n2 = this.f.bitLength();
        int n3 = n2 + 31 >> 5;
        int[] nArray = ab.a(n2, this.f);
        object = ab.a(n2, (BigInteger)object);
        int[] nArray2 = new int[n3];
        ab.a(nArray, (int[])object, nArray2);
        return ab.c(n3, nArray2);
    }

    private BigInteger a(BigInteger bigInteger, BigInteger bigInteger2) {
        return this.d(bigInteger.multiply(bigInteger2));
    }

    private BigInteger d(BigInteger bigInteger) {
        if (this.g != null) {
            boolean bl2 = bigInteger.signum() < 0;
            if (bl2) {
                bigInteger = bigInteger.abs();
            }
            int n2 = this.f.bitLength();
            boolean bl3 = this.g.equals(c.b);
            while (bigInteger.bitLength() > n2 + 1) {
                BigInteger bigInteger2 = bigInteger.shiftRight(n2);
                bigInteger = bigInteger.subtract(bigInteger2.shiftLeft(n2));
                if (!bl3) {
                    bigInteger2 = bigInteger2.multiply(this.g);
                }
                bigInteger = bigInteger2.add(bigInteger);
            }
            while (bigInteger.compareTo(this.f) >= 0) {
                bigInteger = bigInteger.subtract(this.f);
            }
            if (bl2 && bigInteger.signum() != 0) {
                bigInteger = this.f.subtract(bigInteger);
            }
        } else {
            bigInteger = bigInteger.mod(this.f);
        }
        return bigInteger;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof n)) {
            return false;
        }
        object = (n)object;
        return this.f.equals(((n)object).f) && this.h.equals(((n)object).h);
    }

    public final int hashCode() {
        return this.f.hashCode() ^ this.h.hashCode();
    }
}

