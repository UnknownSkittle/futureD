/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.aa;
import org.bouncycastle.math.ec.al;
import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.r;

final class ab {
    private static final BigInteger c = org.bouncycastle.math.ec.c.b.negate();
    private static final BigInteger d = org.bouncycastle.math.ec.c.c.negate();
    private static final BigInteger e = org.bouncycastle.math.ec.c.d.negate();
    public static final al[] a;
    private static byte[][] f;
    public static final al[] b;
    private static byte[][] g;

    private static aa a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte by2, int n2) {
        int n3 = (n2 + 5) / 2 + 10;
        bigInteger = bigInteger.shiftRight(n2 - n3 - 2 + by2);
        bigInteger = bigInteger2.multiply(bigInteger);
        bigInteger2 = bigInteger.shiftRight(n2);
        bigInteger2 = bigInteger3.multiply(bigInteger2);
        bigInteger = bigInteger.add(bigInteger2);
        bigInteger2 = bigInteger.shiftRight(n3 - 10);
        if (bigInteger.testBit(n3 - 10 - 1)) {
            bigInteger2 = bigInteger2.add(org.bouncycastle.math.ec.c.b);
        }
        return new aa(bigInteger2, 10);
    }

    public static byte a(int n2) {
        return (byte)(n2 == 0 ? -1 : 1);
    }

    private static BigInteger[] a(byte by2, int n2, boolean bl2) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (by2 != 1 && by2 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        if (bl2) {
            bigInteger2 = org.bouncycastle.math.ec.c.c;
            bigInteger = BigInteger.valueOf(by2);
        } else {
            bigInteger2 = org.bouncycastle.math.ec.c.a;
            bigInteger = org.bouncycastle.math.ec.c.b;
        }
        for (int i2 = 1; i2 < n2; ++i2) {
            BigInteger bigInteger3 = by2 == 1 ? bigInteger : bigInteger.negate();
            bigInteger3 = bigInteger3.subtract(bigInteger2.shiftLeft(1));
            bigInteger2 = bigInteger;
            bigInteger = bigInteger3;
        }
        return new BigInteger[]{bigInteger2, bigInteger};
    }

    public static BigInteger a(byte by2) {
        if (by2 == 1) {
            return BigInteger.valueOf(6L);
        }
        return BigInteger.valueOf(10L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static BigInteger[] a(e object) {
        int n2;
        if (!((e)object).n()) {
            throw new IllegalArgumentException("si is defined for Koblitz curves only");
        }
        int n3 = ((d)object).a();
        int n4 = ((d)object).g().a().intValue();
        byte by2 = ab.a(n4);
        if ((object = ((d)object).j()) == null) throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
        if (((BigInteger)object).equals(org.bouncycastle.math.ec.c.c)) {
            n2 = 1;
        } else {
            if (!((BigInteger)object).equals(org.bouncycastle.math.ec.c.e)) throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
            n2 = 2;
        }
        int n5 = n2;
        n3 = n3 + 3 - n4;
        BigInteger[] bigIntegerArray = ab.a(by2, n3, false);
        if (by2 == 1) {
            bigIntegerArray[0] = bigIntegerArray[0].negate();
            bigIntegerArray[1] = bigIntegerArray[1].negate();
        }
        BigInteger bigInteger = org.bouncycastle.math.ec.c.b.add(bigIntegerArray[1]).shiftRight(n5);
        BigInteger bigInteger2 = org.bouncycastle.math.ec.c.b.add(bigIntegerArray[0]).shiftRight(n5).negate();
        return new BigInteger[]{bigInteger, bigInteger2};
    }

    public static al a(BigInteger bigInteger, int n2, byte by2, BigInteger[] bigIntegerArray, byte by3) {
        BigInteger bigInteger2 = by3 == 1 ? bigIntegerArray[0].add(bigIntegerArray[1]) : bigIntegerArray[0].subtract(bigIntegerArray[1]);
        BigInteger bigInteger3 = ab.a(by3, n2, true)[1];
        Object object = ab.a(bigInteger, bigIntegerArray[0], bigInteger3, by2, n2);
        Object object2 = ab.a(bigInteger, bigIntegerArray[1], bigInteger3, by2, n2);
        aa aa2 = object2;
        object2 = object;
        int n3 = ((aa)object2).b();
        if (aa2.b() != n3) {
            throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
        }
        if (by3 != 1 && by3 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger bigInteger4 = ((aa)object2).a();
        object = aa2.a();
        object2 = ((aa)object2).a(bigInteger4);
        aa2 = aa2.a((BigInteger)object);
        aa aa3 = object2;
        aa aa4 = aa3.a(aa3);
        aa4 = by3 == 1 ? aa4.a(aa2) : aa4.b(aa2);
        aa aa5 = aa2;
        aa aa6 = aa5.a(aa5).a(aa2);
        aa2 = aa6.a(aa2);
        if (by3 == 1) {
            aa6 = ((aa)object2).b(aa6);
            object2 = ((aa)object2).a(aa2);
        } else {
            aa6 = ((aa)object2).a(aa6);
            object2 = ((aa)object2).b(aa2);
        }
        int n4 = 0;
        byte by4 = 0;
        if (aa4.b(org.bouncycastle.math.ec.c.b) >= 0) {
            if (aa6.b(c) < 0) {
                by4 = by3;
            } else {
                n4 = 1;
            }
        } else if (((aa)object2).b(org.bouncycastle.math.ec.c.c) >= 0) {
            by4 = by3;
        }
        if (aa4.b(c) < 0) {
            if (aa6.b(org.bouncycastle.math.ec.c.b) >= 0) {
                by4 = -by3;
            } else {
                n4 = -1;
            }
        } else if (((aa)object2).b(d) < 0) {
            by4 = -by3;
        }
        object2 = bigInteger4.add(BigInteger.valueOf(n4));
        BigInteger bigInteger5 = ((BigInteger)object).add(BigInteger.valueOf(by4));
        object2 = new al((BigInteger)object2, bigInteger5);
        bigInteger = bigInteger.subtract(bigInteger2.multiply(((al)object2).a)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArray[1]).multiply(((al)object2).b));
        object2 = bigIntegerArray[1].multiply(((al)object2).a).subtract(bigIntegerArray[0].multiply(((al)object2).b));
        return new al(bigInteger, (BigInteger)object2);
    }

    public static byte[] a(byte by2, al object, BigInteger bigInteger, BigInteger bigInteger2, al[] alArray) {
        BigInteger bigInteger3;
        if (by2 != 1 && by2 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        Object object2 = object;
        byte by3 = by2;
        BigInteger bigInteger4 = ((al)object2).a.multiply(((al)object2).a);
        BigInteger bigInteger5 = ((al)object2).a.multiply(((al)object2).b);
        object2 = ((al)object2).b.multiply(((al)object2).b).shiftLeft(1);
        if (by3 == 1) {
            bigInteger3 = bigInteger4.add(bigInteger5).add((BigInteger)object2);
        } else if (by3 == -1) {
            bigInteger3 = bigInteger4.subtract(bigInteger5).add((BigInteger)object2);
        } else {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int n2 = bigInteger3.bitLength();
        byte[] byArray = new byte[n2 > 30 ? n2 + 4 + 4 : 38];
        object2 = bigInteger.shiftRight(1);
        bigInteger4 = ((al)object).a;
        object = ((al)object).b;
        int n3 = 0;
        while (!bigInteger4.equals(org.bouncycastle.math.ec.c.a) || !((BigInteger)object).equals(org.bouncycastle.math.ec.c.a)) {
            BigInteger bigInteger6;
            if (bigInteger4.testBit(0)) {
                bigInteger6 = bigInteger4.add(((BigInteger)object).multiply(bigInteger2)).mod(bigInteger);
                byte by4 = bigInteger6.compareTo((BigInteger)object2) >= 0 ? (byte)bigInteger6.subtract(bigInteger).intValue() : (byte)bigInteger6.intValue();
                byArray[n3] = by4;
                boolean bl2 = true;
                if (by4 < 0) {
                    bl2 = false;
                    by4 = -by4;
                }
                if (bl2) {
                    bigInteger4 = bigInteger4.subtract(alArray[by4].a);
                    object = ((BigInteger)object).subtract(alArray[by4].b);
                } else {
                    bigInteger4 = bigInteger4.add(alArray[by4].a);
                    object = ((BigInteger)object).add(alArray[by4].b);
                }
            } else {
                byArray[n3] = 0;
            }
            bigInteger6 = bigInteger4;
            bigInteger4 = by2 == 1 ? ((BigInteger)object).add(bigInteger4.shiftRight(1)) : ((BigInteger)object).subtract(bigInteger4.shiftRight(1));
            object = bigInteger6.shiftRight(1).negate();
            ++n3;
        }
        return byArray;
    }

    public static r[] a(r r2, byte by2) {
        byte[][] byArray = by2 == 0 ? f : g;
        p[] pArray = new r[4];
        p[] pArray2 = pArray;
        pArray[0] = r2;
        for (int i2 = 3; i2 < 8; i2 += 2) {
            byte[] byArray2 = byArray[i2];
            r r3 = r2;
            r r4 = (r)r3.c().e();
            r r5 = (r)r3.r();
            int n2 = 0;
            for (int i3 = byArray2.length - 1; i3 >= 0; --i3) {
                ++n2;
                byte by3 = byArray2[i3];
                if (by3 == 0) continue;
                r4 = r4.c(n2);
                n2 = 0;
                r r6 = by3 > 0 ? r3 : r5;
                r4 = (r)r4.b(r6);
            }
            if (n2 > 0) {
                r4 = r4.c(n2);
            }
            pArray2[i2 >>> 1] = r4;
        }
        r2.c().a(pArray2);
        return pArray2;
    }

    static {
        al[] alArray = new al[9];
        alArray[0] = null;
        alArray[1] = new al(org.bouncycastle.math.ec.c.b, org.bouncycastle.math.ec.c.a);
        alArray[2] = null;
        alArray[3] = new al(e, c);
        alArray[4] = null;
        BigInteger bigInteger = c;
        alArray[5] = new al(bigInteger, bigInteger);
        alArray[6] = null;
        alArray[7] = new al(org.bouncycastle.math.ec.c.b, c);
        alArray[8] = null;
        a = alArray;
        f = new byte[][]{null, {1}, null, {-1, 0, 1}, null, {1, 0, 1}, null, {-1, 0, 0, 1}};
        al[] alArray2 = new al[9];
        alArray2[0] = null;
        alArray2[1] = new al(org.bouncycastle.math.ec.c.b, org.bouncycastle.math.ec.c.a);
        alArray2[2] = null;
        alArray2[3] = new al(e, org.bouncycastle.math.ec.c.b);
        alArray2[4] = null;
        alArray2[5] = new al(c, org.bouncycastle.math.ec.c.b);
        alArray2[6] = null;
        BigInteger bigInteger2 = org.bouncycastle.math.ec.c.b;
        alArray2[7] = new al(bigInteger2, bigInteger2);
        alArray2[8] = null;
        b = alArray2;
        g = new byte[][]{null, {1}, null, {-1, 0, 1}, null, {1, 0, 1}, null, {-1, 0, 0, -1}};
    }
}

