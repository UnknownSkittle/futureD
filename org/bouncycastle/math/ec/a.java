/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.ec.o;
import org.bouncycastle.math.ec.p;

public abstract class a
implements o {
    public final p a(p p2, BigInteger bigInteger) {
        int n2 = bigInteger.signum();
        if (n2 == 0 || p2.n()) {
            return p2.c().e();
        }
        p2 = this.b(p2, bigInteger.abs());
        p2 = n2 > 0 ? p2 : p2.r();
        if (!p2.a(false)) {
            throw new IllegalStateException("Invalid result");
        }
        return p2;
    }

    protected abstract p b(p var1, BigInteger var2);

    public static int a(int[] nArray, int[] nArray2, int[] nArray3) {
        long l2 = 0L + (((long)nArray[0] & 0xFFFFFFFFL) + ((long)nArray2[0] & 0xFFFFFFFFL));
        nArray3[0] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[1] & 0xFFFFFFFFL) + ((long)nArray2[1] & 0xFFFFFFFFL));
        nArray3[1] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[2] & 0xFFFFFFFFL) + ((long)nArray2[2] & 0xFFFFFFFFL));
        nArray3[2] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[3] & 0xFFFFFFFFL) + ((long)nArray2[3] & 0xFFFFFFFFL));
        nArray3[3] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[4] & 0xFFFFFFFFL) + ((long)nArray2[4] & 0xFFFFFFFFL));
        nArray3[4] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[5] & 0xFFFFFFFFL) + ((long)nArray2[5] & 0xFFFFFFFFL));
        nArray3[5] = (int)l2;
        return (int)(l2 >>> 32);
    }

    public static int b(int[] nArray, int[] nArray2, int[] nArray3) {
        long l2 = 0L + (((long)nArray[0] & 0xFFFFFFFFL) + ((long)nArray2[0] & 0xFFFFFFFFL) + ((long)nArray3[0] & 0xFFFFFFFFL));
        nArray3[0] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[1] & 0xFFFFFFFFL) + ((long)nArray2[1] & 0xFFFFFFFFL) + ((long)nArray3[1] & 0xFFFFFFFFL));
        nArray3[1] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[2] & 0xFFFFFFFFL) + ((long)nArray2[2] & 0xFFFFFFFFL) + ((long)nArray3[2] & 0xFFFFFFFFL));
        nArray3[2] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[3] & 0xFFFFFFFFL) + ((long)nArray2[3] & 0xFFFFFFFFL) + ((long)nArray3[3] & 0xFFFFFFFFL));
        nArray3[3] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[4] & 0xFFFFFFFFL) + ((long)nArray2[4] & 0xFFFFFFFFL) + ((long)nArray3[4] & 0xFFFFFFFFL));
        nArray3[4] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[5] & 0xFFFFFFFFL) + ((long)nArray2[5] & 0xFFFFFFFFL) + ((long)nArray3[5] & 0xFFFFFFFFL));
        nArray3[5] = (int)l2;
        return (int)(l2 >>> 32);
    }

    public static int a(int[] nArray, int n2, int[] nArray2, int n3, int n4) {
        long l2 = ((long)n4 & 0xFFFFFFFFL) + (((long)nArray[n2] & 0xFFFFFFFFL) + ((long)nArray2[n3] & 0xFFFFFFFFL));
        nArray2[n3] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[n2 + 1] & 0xFFFFFFFFL) + ((long)nArray2[n3 + 1] & 0xFFFFFFFFL));
        nArray2[n3 + 1] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[n2 + 2] & 0xFFFFFFFFL) + ((long)nArray2[n3 + 2] & 0xFFFFFFFFL));
        nArray2[n3 + 2] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[n2 + 3] & 0xFFFFFFFFL) + ((long)nArray2[n3 + 3] & 0xFFFFFFFFL));
        nArray2[n3 + 3] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[n2 + 4] & 0xFFFFFFFFL) + ((long)nArray2[n3 + 4] & 0xFFFFFFFFL));
        nArray2[n3 + 4] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[n2 + 5] & 0xFFFFFFFFL) + ((long)nArray2[n3 + 5] & 0xFFFFFFFFL));
        nArray2[n3 + 5] = (int)l2;
        return (int)(l2 >>> 32);
    }

    public static int a(int[] nArray, int[] nArray2) {
        long l2 = 0L + (((long)nArray[6] & 0xFFFFFFFFL) + ((long)nArray2[12] & 0xFFFFFFFFL));
        nArray[6] = (int)l2;
        nArray2[12] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[7] & 0xFFFFFFFFL) + ((long)nArray2[13] & 0xFFFFFFFFL));
        nArray[7] = (int)l2;
        nArray2[13] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[8] & 0xFFFFFFFFL) + ((long)nArray2[14] & 0xFFFFFFFFL));
        nArray[8] = (int)l2;
        nArray2[14] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[9] & 0xFFFFFFFFL) + ((long)nArray2[15] & 0xFFFFFFFFL));
        nArray[9] = (int)l2;
        nArray2[15] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[10] & 0xFFFFFFFFL) + ((long)nArray2[16] & 0xFFFFFFFFL));
        nArray[10] = (int)l2;
        nArray2[16] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[11] & 0xFFFFFFFFL) + ((long)nArray2[17] & 0xFFFFFFFFL));
        nArray[11] = (int)l2;
        nArray2[17] = (int)l2;
        return (int)(l2 >>> 32);
    }

    public static boolean c(int[] nArray, int[] nArray2, int[] nArray3) {
        boolean bl2;
        boolean bl3;
        block4: {
            int[] nArray4 = nArray2;
            int[] nArray5 = nArray;
            for (int i2 = 5; i2 >= 0; --i2) {
                int n2 = nArray5[i2 + 6] ^ Integer.MIN_VALUE;
                int n3 = nArray4[i2] ^ Integer.MIN_VALUE;
                if (n2 < n3) {
                    bl3 = false;
                    break block4;
                }
                if (n2 > n3) break;
            }
            bl3 = bl2 = true;
        }
        if (bl3) {
            a.a(nArray, 6, nArray2, 0, nArray3);
        } else {
            a.a(nArray2, 0, nArray, 6, nArray3);
        }
        return bl2;
    }

    public static boolean b(int[] nArray, int[] nArray2) {
        for (int i2 = 5; i2 >= 0; --i2) {
            if (nArray[i2] == nArray2[i2]) continue;
            return false;
        }
        return true;
    }

    public static boolean a(long[] lArray, long[] lArray2) {
        for (int i2 = 2; i2 >= 0; --i2) {
            if (lArray[i2] == lArray2[i2]) continue;
            return false;
        }
        return true;
    }

    public static int[] a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] nArray = new int[6];
        int n2 = 0;
        while (bigInteger.signum() != 0) {
            nArray[n2++] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return nArray;
    }

    public static long[] b(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] lArray = new long[3];
        int n2 = 0;
        while (bigInteger.signum() != 0) {
            lArray[n2++] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return lArray;
    }

    public static boolean c(int[] nArray, int[] nArray2) {
        for (int i2 = 5; i2 >= 0; --i2) {
            int n2 = nArray[i2] ^ Integer.MIN_VALUE;
            int n3 = nArray2[i2] ^ Integer.MIN_VALUE;
            if (n2 < n3) {
                return false;
            }
            if (n2 <= n3) continue;
            return true;
        }
        return true;
    }

    public static boolean a(int[] nArray) {
        if (nArray[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < 6; ++i2) {
            if (nArray[i2] == 0) continue;
            return false;
        }
        return true;
    }

    public static boolean a(long[] lArray) {
        if (lArray[0] != 1L) {
            return false;
        }
        for (int i2 = 1; i2 < 3; ++i2) {
            if (lArray[i2] == 0L) continue;
            return false;
        }
        return true;
    }

    public static boolean b(int[] nArray) {
        for (int i2 = 0; i2 < 6; ++i2) {
            if (nArray[i2] == 0) continue;
            return false;
        }
        return true;
    }

    public static boolean b(long[] lArray) {
        for (int i2 = 0; i2 < 3; ++i2) {
            if (lArray[i2] == 0L) continue;
            return false;
        }
        return true;
    }

    public static void d(int[] nArray, int[] nArray2, int[] nArray3) {
        long l2 = (long)nArray2[0] & 0xFFFFFFFFL;
        long l3 = (long)nArray2[1] & 0xFFFFFFFFL;
        long l4 = (long)nArray2[2] & 0xFFFFFFFFL;
        long l5 = (long)nArray2[3] & 0xFFFFFFFFL;
        long l6 = (long)nArray2[4] & 0xFFFFFFFFL;
        long l7 = (long)nArray2[5] & 0xFFFFFFFFL;
        long l8 = (long)nArray[0] & 0xFFFFFFFFL;
        long l9 = 0L + l8 * l2;
        nArray3[0] = (int)l9;
        l9 = (l9 >>> 32) + l8 * l3;
        nArray3[1] = (int)l9;
        l9 = (l9 >>> 32) + l8 * l4;
        nArray3[2] = (int)l9;
        l9 = (l9 >>> 32) + l8 * l5;
        nArray3[3] = (int)l9;
        l9 = (l9 >>> 32) + l8 * l6;
        nArray3[4] = (int)l9;
        l9 = (l9 >>> 32) + l8 * l7;
        nArray3[5] = (int)l9;
        nArray3[6] = (int)(l9 >>>= 32);
        for (int i2 = 1; i2 < 6; ++i2) {
            long l10 = (long)nArray[i2] & 0xFFFFFFFFL;
            long l11 = 0L + (l10 * l2 + ((long)nArray3[i2] & 0xFFFFFFFFL));
            nArray3[i2] = (int)l11;
            l11 = (l11 >>> 32) + (l10 * l3 + ((long)nArray3[i2 + 1] & 0xFFFFFFFFL));
            nArray3[i2 + 1] = (int)l11;
            l11 = (l11 >>> 32) + (l10 * l4 + ((long)nArray3[i2 + 2] & 0xFFFFFFFFL));
            nArray3[i2 + 2] = (int)l11;
            l11 = (l11 >>> 32) + (l10 * l5 + ((long)nArray3[i2 + 3] & 0xFFFFFFFFL));
            nArray3[i2 + 3] = (int)l11;
            l11 = (l11 >>> 32) + (l10 * l6 + ((long)nArray3[i2 + 4] & 0xFFFFFFFFL));
            nArray3[i2 + 4] = (int)l11;
            l11 = (l11 >>> 32) + (l10 * l7 + ((long)nArray3[i2 + 5] & 0xFFFFFFFFL));
            nArray3[i2 + 5] = (int)l11;
            nArray3[i2 + 6] = (int)(l11 >>>= 32);
        }
    }

    public static int e(int[] nArray, int[] nArray2, int[] nArray3) {
        long l2 = (long)nArray2[0] & 0xFFFFFFFFL;
        long l3 = (long)nArray2[1] & 0xFFFFFFFFL;
        long l4 = (long)nArray2[2] & 0xFFFFFFFFL;
        long l5 = (long)nArray2[3] & 0xFFFFFFFFL;
        long l6 = (long)nArray2[4] & 0xFFFFFFFFL;
        long l7 = (long)nArray2[5] & 0xFFFFFFFFL;
        long l8 = 0L;
        for (int i2 = 0; i2 < 6; ++i2) {
            long l9 = (long)nArray[i2] & 0xFFFFFFFFL;
            long l10 = 0L + (l9 * l2 + ((long)nArray3[i2] & 0xFFFFFFFFL));
            nArray3[i2] = (int)l10;
            l10 = (l10 >>> 32) + (l9 * l3 + ((long)nArray3[i2 + 1] & 0xFFFFFFFFL));
            nArray3[i2 + 1] = (int)l10;
            l10 = (l10 >>> 32) + (l9 * l4 + ((long)nArray3[i2 + 2] & 0xFFFFFFFFL));
            nArray3[i2 + 2] = (int)l10;
            l10 = (l10 >>> 32) + (l9 * l5 + ((long)nArray3[i2 + 3] & 0xFFFFFFFFL));
            nArray3[i2 + 3] = (int)l10;
            l10 = (l10 >>> 32) + (l9 * l6 + ((long)nArray3[i2 + 4] & 0xFFFFFFFFL));
            nArray3[i2 + 4] = (int)l10;
            l10 = (l10 >>> 32) + (l9 * l7 + ((long)nArray3[i2 + 5] & 0xFFFFFFFFL));
            nArray3[i2 + 5] = (int)l10;
            l10 = (l10 >>> 32) + (l8 + ((long)nArray3[i2 + 6] & 0xFFFFFFFFL));
            nArray3[i2 + 6] = (int)l10;
            l8 = l10 >>> 32;
        }
        return (int)l8;
    }

    public static long f(int[] nArray, int[] nArray2, int[] nArray3) {
        long l2 = (long)nArray[6] & 0xFFFFFFFFL;
        long l3 = 0L + (4553L * l2 + ((long)nArray2[0] & 0xFFFFFFFFL));
        nArray3[0] = (int)l3;
        l3 >>>= 32;
        long l4 = (long)nArray[7] & 0xFFFFFFFFL;
        nArray3[1] = (int)(l3 += 4553L * l4 + l2 + ((long)nArray2[1] & 0xFFFFFFFFL));
        l3 >>>= 32;
        long l5 = (long)nArray[8] & 0xFFFFFFFFL;
        nArray3[2] = (int)(l3 += 4553L * l5 + l4 + ((long)nArray2[2] & 0xFFFFFFFFL));
        l3 >>>= 32;
        long l6 = (long)nArray[9] & 0xFFFFFFFFL;
        nArray3[3] = (int)(l3 += 4553L * l6 + l5 + ((long)nArray2[3] & 0xFFFFFFFFL));
        l3 >>>= 32;
        long l7 = (long)nArray[10] & 0xFFFFFFFFL;
        nArray3[4] = (int)(l3 += 4553L * l7 + l6 + ((long)nArray2[4] & 0xFFFFFFFFL));
        l3 >>>= 32;
        long l8 = (long)nArray[11] & 0xFFFFFFFFL;
        nArray3[5] = (int)(l3 += 4553L * l8 + l7 + ((long)nArray2[5] & 0xFFFFFFFFL));
        return (l3 >>> 32) + l8;
    }

    public static int a(long l2, int[] nArray) {
        long l3 = l2 & 0xFFFFFFFFL;
        long l4 = 0L + (4553L * l3 + ((long)nArray[0] & 0xFFFFFFFFL));
        nArray[0] = (int)l4;
        l4 >>>= 32;
        long l5 = l2 >>> 32;
        nArray[1] = (int)(l4 += 4553L * l5 + l3 + ((long)nArray[1] & 0xFFFFFFFFL));
        l4 = (l4 >>> 32) + (l5 + ((long)nArray[2] & 0xFFFFFFFFL));
        nArray[2] = (int)l4;
        l4 = (l4 >>> 32) + ((long)nArray[3] & 0xFFFFFFFFL);
        nArray[3] = (int)l4;
        if (l4 >>> 32 == 0L) {
            return 0;
        }
        return ab.c(6, nArray, 4);
    }

    public static void d(int[] nArray, int[] nArray2) {
        long l2;
        long l3 = (long)nArray[0] & 0xFFFFFFFFL;
        int n2 = 0;
        int n3 = 5;
        int n4 = 12;
        do {
            long l4 = (long)nArray[n3--] & 0xFFFFFFFFL;
            l2 = l4 * l4;
            nArray2[--n4] = n2 << 31 | (int)(l2 >>> 33);
            nArray2[--n4] = (int)(l2 >>> 1);
            n2 = (int)l2;
        } while (n3 > 0);
        long l5 = l3;
        long l6 = l5 * l5;
        long l7 = (long)(n2 << 31) & 0xFFFFFFFFL | l6 >>> 33;
        nArray2[0] = (int)l6;
        n2 = (int)(l6 >>> 32) & 1;
        long l8 = (long)nArray[1] & 0xFFFFFFFFL;
        l6 = (long)nArray2[2] & 0xFFFFFFFFL;
        int n5 = (int)(l7 += l8 * l3);
        nArray2[1] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        l6 += l7 >>> 32;
        l2 = (long)nArray[2] & 0xFFFFFFFFL;
        long l9 = (long)nArray2[3] & 0xFFFFFFFFL;
        long l10 = (long)nArray2[4] & 0xFFFFFFFFL;
        n5 = (int)(l6 += l2 * l3);
        nArray2[2] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        l9 &= 0xFFFFFFFFL;
        long l11 = (long)nArray[3] & 0xFFFFFFFFL;
        long l12 = ((long)nArray2[5] & 0xFFFFFFFFL) + ((l10 += (l9 += (l6 >>> 32) + l2 * l8) >>> 32) >>> 32);
        l10 &= 0xFFFFFFFFL;
        long l13 = ((long)nArray2[6] & 0xFFFFFFFFL) + (l12 >>> 32);
        l12 &= 0xFFFFFFFFL;
        n5 = (int)(l9 += l11 * l3);
        nArray2[3] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        l10 &= 0xFFFFFFFFL;
        l12 &= 0xFFFFFFFFL;
        long l14 = (long)nArray[4] & 0xFFFFFFFFL;
        long l15 = ((long)nArray2[7] & 0xFFFFFFFFL) + ((l13 += (l12 += ((l10 += (l9 >>> 32) + l11 * l8) >>> 32) + l11 * l2) >>> 32) >>> 32);
        l13 &= 0xFFFFFFFFL;
        long l16 = ((long)nArray2[8] & 0xFFFFFFFFL) + (l15 >>> 32);
        l15 &= 0xFFFFFFFFL;
        n5 = (int)(l10 += l14 * l3);
        nArray2[4] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        l12 &= 0xFFFFFFFFL;
        l13 &= 0xFFFFFFFFL;
        l15 &= 0xFFFFFFFFL;
        long l17 = (long)nArray[5] & 0xFFFFFFFFL;
        long l18 = ((long)nArray2[9] & 0xFFFFFFFFL) + ((l16 += (l15 += ((l13 += ((l12 += (l10 >>> 32) + l14 * l8) >>> 32) + l14 * l2) >>> 32) + l14 * l11) >>> 32) >>> 32);
        l16 &= 0xFFFFFFFFL;
        long l19 = ((long)nArray2[10] & 0xFFFFFFFFL) + (l18 >>> 32);
        l18 &= 0xFFFFFFFFL;
        n5 = (int)(l12 += l17 * l3);
        nArray2[5] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        l19 += (l18 += ((l16 += ((l15 += ((l13 += (l12 >>> 32) + l17 * l8) >>> 32) + l17 * l2) >>> 32) + l17 * l11) >>> 32) + l17 * l14) >>> 32;
        n5 = (int)l13;
        nArray2[6] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        n5 = (int)l15;
        nArray2[7] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        n5 = (int)l16;
        nArray2[8] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        n5 = (int)l18;
        nArray2[9] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        n5 = (int)l19;
        nArray2[10] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        n5 = nArray2[11] + (int)(l19 >>> 32);
        nArray2[11] = n5 << 1 | n2;
    }

    public static int g(int[] nArray, int[] nArray2, int[] nArray3) {
        long l2 = 0L + (((long)nArray[0] & 0xFFFFFFFFL) - ((long)nArray2[0] & 0xFFFFFFFFL));
        nArray3[0] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray[1] & 0xFFFFFFFFL) - ((long)nArray2[1] & 0xFFFFFFFFL));
        nArray3[1] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray[2] & 0xFFFFFFFFL) - ((long)nArray2[2] & 0xFFFFFFFFL));
        nArray3[2] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray[3] & 0xFFFFFFFFL) - ((long)nArray2[3] & 0xFFFFFFFFL));
        nArray3[3] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray[4] & 0xFFFFFFFFL) - ((long)nArray2[4] & 0xFFFFFFFFL));
        nArray3[4] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray[5] & 0xFFFFFFFFL) - ((long)nArray2[5] & 0xFFFFFFFFL));
        nArray3[5] = (int)l2;
        return (int)(l2 >> 32);
    }

    private static int a(int[] nArray, int n2, int[] nArray2, int n3, int[] nArray3) {
        long l2 = 0L + (((long)nArray[n2] & 0xFFFFFFFFL) - ((long)nArray2[n3] & 0xFFFFFFFFL));
        nArray3[0] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray[n2 + 1] & 0xFFFFFFFFL) - ((long)nArray2[n3 + 1] & 0xFFFFFFFFL));
        nArray3[1] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray[n2 + 2] & 0xFFFFFFFFL) - ((long)nArray2[n3 + 2] & 0xFFFFFFFFL));
        nArray3[2] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray[n2 + 3] & 0xFFFFFFFFL) - ((long)nArray2[n3 + 3] & 0xFFFFFFFFL));
        nArray3[3] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray[n2 + 4] & 0xFFFFFFFFL) - ((long)nArray2[n3 + 4] & 0xFFFFFFFFL));
        nArray3[4] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray[n2 + 5] & 0xFFFFFFFFL) - ((long)nArray2[n3 + 5] & 0xFFFFFFFFL));
        nArray3[5] = (int)l2;
        return (int)(l2 >> 32);
    }

    public static int e(int[] nArray, int[] nArray2) {
        long l2 = 0L + (((long)nArray2[0] & 0xFFFFFFFFL) - ((long)nArray[0] & 0xFFFFFFFFL));
        nArray2[0] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray2[1] & 0xFFFFFFFFL) - ((long)nArray[1] & 0xFFFFFFFFL));
        nArray2[1] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray2[2] & 0xFFFFFFFFL) - ((long)nArray[2] & 0xFFFFFFFFL));
        nArray2[2] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray2[3] & 0xFFFFFFFFL) - ((long)nArray[3] & 0xFFFFFFFFL));
        nArray2[3] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray2[4] & 0xFFFFFFFFL) - ((long)nArray[4] & 0xFFFFFFFFL));
        nArray2[4] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray2[5] & 0xFFFFFFFFL) - ((long)nArray[5] & 0xFFFFFFFFL));
        nArray2[5] = (int)l2;
        return (int)(l2 >> 32);
    }

    public static BigInteger c(int[] nArray) {
        byte[] byArray = new byte[24];
        for (int i2 = 0; i2 < 6; ++i2) {
            int n2 = nArray[i2];
            if (n2 == 0) continue;
            ab.a(n2, byArray, 5 - i2 << 2);
        }
        return new BigInteger(1, byArray);
    }

    public static BigInteger c(long[] lArray) {
        byte[] byArray = new byte[24];
        for (int i2 = 0; i2 < 3; ++i2) {
            long l2 = lArray[i2];
            if (l2 == 0L) continue;
            ab.a(l2, byArray, 2 - i2 << 3);
        }
        return new BigInteger(1, byArray);
    }

    public static void d(int[] nArray) {
        nArray[0] = 0;
        nArray[1] = 0;
        nArray[2] = 0;
        nArray[3] = 0;
        nArray[4] = 0;
        nArray[5] = 0;
    }
}

