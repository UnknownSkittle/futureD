/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ae;
import org.bouncycastle.math.ec.ag;
import org.bouncycastle.math.ec.ah;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.v;

public abstract class af {
    private static final int[] a = new int[]{13, 41, 121, 337, 897, 2305};
    private static final byte[] b = new byte[0];
    private static final int[] c = new int[0];
    private static final p[] d = new p[0];

    public static int[] a(int n2, BigInteger bigInteger) {
        if (n2 == 2) {
            BigInteger bigInteger2 = bigInteger;
            if (bigInteger2.bitLength() >>> 16 != 0) {
                throw new IllegalArgumentException("'k' must have bitlength < 2^16");
            }
            if (bigInteger2.signum() == 0) {
                return c;
            }
            bigInteger = bigInteger2.shiftLeft(1).add(bigInteger2);
            int n3 = bigInteger.bitLength();
            int[] nArray = new int[n3 >> 1];
            bigInteger = bigInteger.xor(bigInteger2);
            --n3;
            int n4 = 0;
            int n5 = 0;
            for (int i2 = 1; i2 < n3; ++i2) {
                if (!bigInteger.testBit(i2)) {
                    ++n5;
                    continue;
                }
                int n6 = bigInteger2.testBit(i2) ? -1 : 1;
                nArray[n4++] = n6 << 16 | n5;
                n5 = 1;
                ++i2;
            }
            nArray[n4++] = 0x10000 | n5;
            if (nArray.length > n4) {
                nArray = af.a(nArray, n4);
            }
            return nArray;
        }
        if (n2 < 2 || n2 > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        }
        if (bigInteger.bitLength() >>> 16 != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return c;
        }
        int[] nArray = new int[bigInteger.bitLength() / n2 + 1];
        int n7 = 1 << n2;
        int n8 = n7 - 1;
        int n9 = n7 >>> 1;
        boolean bl2 = false;
        int n10 = 0;
        int n11 = 0;
        while (n11 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(n11) == bl2) {
                ++n11;
                continue;
            }
            bigInteger = bigInteger.shiftRight(n11);
            int n12 = bigInteger.intValue() & n8;
            if (bl2) {
                ++n12;
            }
            if (bl2 = (n12 & n9) != 0) {
                n12 -= n7;
            }
            n11 = n10 > 0 ? n11 - 1 : n11;
            nArray[n10++] = n12 << 16 | n11;
            n11 = n2;
        }
        if (nArray.length > n10) {
            nArray = af.a(nArray, n10);
        }
        return nArray;
    }

    public static byte[] b(int n2, BigInteger bigInteger) {
        if (n2 == 2) {
            BigInteger bigInteger2 = bigInteger;
            if (bigInteger2.signum() == 0) {
                return b;
            }
            bigInteger = bigInteger2.shiftLeft(1).add(bigInteger2);
            int n3 = bigInteger.bitLength() - 1;
            byte[] byArray = new byte[n3];
            bigInteger = bigInteger.xor(bigInteger2);
            for (int i2 = 1; i2 < n3; ++i2) {
                if (!bigInteger.testBit(i2)) continue;
                byArray[i2 - 1] = (byte)(bigInteger2.testBit(i2) ? -1 : 1);
                ++i2;
            }
            byArray[n3 - 1] = 1;
            return byArray;
        }
        if (n2 < 2 || n2 > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (bigInteger.signum() == 0) {
            return b;
        }
        byte[] byArray = new byte[bigInteger.bitLength() + 1];
        int n4 = 1 << n2;
        int n5 = n4 - 1;
        int n6 = n4 >>> 1;
        boolean bl2 = false;
        int n7 = 0;
        int n8 = 0;
        while (n8 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(n8) == bl2) {
                ++n8;
                continue;
            }
            bigInteger = bigInteger.shiftRight(n8);
            int n9 = bigInteger.intValue() & n5;
            if (bl2) {
                ++n9;
            }
            if (bl2 = (n9 & n6) != 0) {
                n9 -= n4;
            }
            int n10 = n7;
            n7 = n10 + (n10 > 0 ? n8 - 1 : n8);
            byArray[n7++] = (byte)n9;
            n8 = n2;
        }
        if (byArray.length > n7) {
            int n11 = n7;
            byte[] byArray2 = byArray;
            byArray = new byte[n11];
            System.arraycopy(byArray2, 0, byArray, 0, byArray.length);
        }
        return byArray;
    }

    public static ae a(p object) {
        if ((object = ((p)object).c().a((p)object, "bc_wnaf")) instanceof ae) {
            return (ae)object;
        }
        return null;
    }

    public static int a(int n2) {
        int n3;
        int[] nArray = a;
        for (n3 = 0; n3 < 6 && n2 >= nArray[n3]; ++n3) {
        }
        return n3 + 2;
    }

    public static p a(p p2, int n2, v v2) {
        d d2 = p2.c();
        ae ae2 = af.a(p2, n2);
        p2 = v2.a(p2);
        d2.a(p2, "bc_wnaf", new ag(ae2, v2));
        return p2;
    }

    public static ae a(p p2, int n2) {
        d d2 = p2.c();
        return (ae)d2.a(p2, "bc_wnaf", new ah(n2, p2, d2));
    }

    private static int[] a(int[] nArray, int n2) {
        int[] nArray2 = new int[n2];
        System.arraycopy(nArray, 0, nArray2, 0, nArray2.length);
        return nArray2;
    }

    static /* synthetic */ p[] a() {
        return d;
    }

    static /* synthetic */ p[] a(p[] pArray, int n2) {
        p[] pArray2 = new p[n2];
        System.arraycopy(pArray, 0, pArray2, 0, pArray.length);
        return pArray2;
    }
}

