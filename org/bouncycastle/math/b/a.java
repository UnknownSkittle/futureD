/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.b;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.b.i;

public abstract class a {
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
        l2 = (l2 >>> 32) + (((long)nArray[6] & 0xFFFFFFFFL) + ((long)nArray2[6] & 0xFFFFFFFFL));
        nArray3[6] = (int)l2;
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
        l2 = (l2 >>> 32) + (((long)nArray[6] & 0xFFFFFFFFL) + ((long)nArray2[6] & 0xFFFFFFFFL) + ((long)nArray3[6] & 0xFFFFFFFFL));
        nArray3[6] = (int)l2;
        return (int)(l2 >>> 32);
    }

    public static void a(int[] nArray, int[] nArray2) {
        nArray2[0] = nArray[0];
        nArray2[1] = nArray[1];
        nArray2[2] = nArray[2];
        nArray2[3] = nArray[3];
        nArray2[4] = nArray[4];
        nArray2[5] = nArray[5];
        nArray2[6] = nArray[6];
    }

    public static boolean b(int[] nArray, int[] nArray2) {
        for (int i2 = 6; i2 >= 0; --i2) {
            if (nArray[i2] == nArray2[i2]) continue;
            return false;
        }
        return true;
    }

    public static int[] a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] nArray = new int[7];
        int n2 = 0;
        while (bigInteger.signum() != 0) {
            nArray[n2++] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return nArray;
    }

    public static boolean c(int[] nArray, int[] nArray2) {
        for (int i2 = 6; i2 >= 0; --i2) {
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
        for (int i2 = 1; i2 < 7; ++i2) {
            if (nArray[i2] == 0) continue;
            return false;
        }
        return true;
    }

    public static boolean b(int[] nArray) {
        for (int i2 = 0; i2 < 7; ++i2) {
            if (nArray[i2] == 0) continue;
            return false;
        }
        return true;
    }

    public static void c(int[] nArray, int[] nArray2, int[] nArray3) {
        long l2 = (long)nArray2[0] & 0xFFFFFFFFL;
        long l3 = (long)nArray2[1] & 0xFFFFFFFFL;
        long l4 = (long)nArray2[2] & 0xFFFFFFFFL;
        long l5 = (long)nArray2[3] & 0xFFFFFFFFL;
        long l6 = (long)nArray2[4] & 0xFFFFFFFFL;
        long l7 = (long)nArray2[5] & 0xFFFFFFFFL;
        long l8 = (long)nArray2[6] & 0xFFFFFFFFL;
        long l9 = (long)nArray[0] & 0xFFFFFFFFL;
        long l10 = 0L + l9 * l2;
        nArray3[0] = (int)l10;
        l10 = (l10 >>> 32) + l9 * l3;
        nArray3[1] = (int)l10;
        l10 = (l10 >>> 32) + l9 * l4;
        nArray3[2] = (int)l10;
        l10 = (l10 >>> 32) + l9 * l5;
        nArray3[3] = (int)l10;
        l10 = (l10 >>> 32) + l9 * l6;
        nArray3[4] = (int)l10;
        l10 = (l10 >>> 32) + l9 * l7;
        nArray3[5] = (int)l10;
        l10 = (l10 >>> 32) + l9 * l8;
        nArray3[6] = (int)l10;
        nArray3[7] = (int)(l10 >>>= 32);
        for (int i2 = 1; i2 < 7; ++i2) {
            long l11 = (long)nArray[i2] & 0xFFFFFFFFL;
            long l12 = 0L + (l11 * l2 + ((long)nArray3[i2] & 0xFFFFFFFFL));
            nArray3[i2] = (int)l12;
            l12 = (l12 >>> 32) + (l11 * l3 + ((long)nArray3[i2 + 1] & 0xFFFFFFFFL));
            nArray3[i2 + 1] = (int)l12;
            l12 = (l12 >>> 32) + (l11 * l4 + ((long)nArray3[i2 + 2] & 0xFFFFFFFFL));
            nArray3[i2 + 2] = (int)l12;
            l12 = (l12 >>> 32) + (l11 * l5 + ((long)nArray3[i2 + 3] & 0xFFFFFFFFL));
            nArray3[i2 + 3] = (int)l12;
            l12 = (l12 >>> 32) + (l11 * l6 + ((long)nArray3[i2 + 4] & 0xFFFFFFFFL));
            nArray3[i2 + 4] = (int)l12;
            l12 = (l12 >>> 32) + (l11 * l7 + ((long)nArray3[i2 + 5] & 0xFFFFFFFFL));
            nArray3[i2 + 5] = (int)l12;
            l12 = (l12 >>> 32) + (l11 * l8 + ((long)nArray3[i2 + 6] & 0xFFFFFFFFL));
            nArray3[i2 + 6] = (int)l12;
            nArray3[i2 + 7] = (int)(l12 >>>= 32);
        }
    }

    public static int d(int[] nArray, int[] nArray2, int[] nArray3) {
        long l2 = (long)nArray2[0] & 0xFFFFFFFFL;
        long l3 = (long)nArray2[1] & 0xFFFFFFFFL;
        long l4 = (long)nArray2[2] & 0xFFFFFFFFL;
        long l5 = (long)nArray2[3] & 0xFFFFFFFFL;
        long l6 = (long)nArray2[4] & 0xFFFFFFFFL;
        long l7 = (long)nArray2[5] & 0xFFFFFFFFL;
        long l8 = (long)nArray2[6] & 0xFFFFFFFFL;
        long l9 = 0L;
        for (int i2 = 0; i2 < 7; ++i2) {
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
            l11 = (l11 >>> 32) + (l10 * l8 + ((long)nArray3[i2 + 6] & 0xFFFFFFFFL));
            nArray3[i2 + 6] = (int)l11;
            l11 = (l11 >>> 32) + (l9 + ((long)nArray3[i2 + 7] & 0xFFFFFFFFL));
            nArray3[i2 + 7] = (int)l11;
            l9 = l11 >>> 32;
        }
        return (int)l9;
    }

    public static long e(int[] nArray, int[] nArray2, int[] nArray3) {
        long l2 = (long)nArray[7] & 0xFFFFFFFFL;
        long l3 = 0L + (6803L * l2 + ((long)nArray2[0] & 0xFFFFFFFFL));
        nArray3[0] = (int)l3;
        l3 >>>= 32;
        long l4 = (long)nArray[8] & 0xFFFFFFFFL;
        nArray3[1] = (int)(l3 += 6803L * l4 + l2 + ((long)nArray2[1] & 0xFFFFFFFFL));
        l3 >>>= 32;
        long l5 = (long)nArray[9] & 0xFFFFFFFFL;
        nArray3[2] = (int)(l3 += 6803L * l5 + l4 + ((long)nArray2[2] & 0xFFFFFFFFL));
        l3 >>>= 32;
        long l6 = (long)nArray[10] & 0xFFFFFFFFL;
        nArray3[3] = (int)(l3 += 6803L * l6 + l5 + ((long)nArray2[3] & 0xFFFFFFFFL));
        l3 >>>= 32;
        long l7 = (long)nArray[11] & 0xFFFFFFFFL;
        nArray3[4] = (int)(l3 += 6803L * l7 + l6 + ((long)nArray2[4] & 0xFFFFFFFFL));
        l3 >>>= 32;
        long l8 = (long)nArray[12] & 0xFFFFFFFFL;
        nArray3[5] = (int)(l3 += 6803L * l8 + l7 + ((long)nArray2[5] & 0xFFFFFFFFL));
        l3 >>>= 32;
        long l9 = (long)nArray[13] & 0xFFFFFFFFL;
        nArray3[6] = (int)(l3 += 6803L * l9 + l8 + ((long)nArray2[6] & 0xFFFFFFFFL));
        return (l3 >>> 32) + l9;
    }

    public static int a(long l2, int[] nArray) {
        long l3 = l2 & 0xFFFFFFFFL;
        long l4 = 0L + (6803L * l3 + ((long)nArray[0] & 0xFFFFFFFFL));
        nArray[0] = (int)l4;
        l4 >>>= 32;
        long l5 = l2 >>> 32;
        nArray[1] = (int)(l4 += 6803L * l5 + l3 + ((long)nArray[1] & 0xFFFFFFFFL));
        l4 = (l4 >>> 32) + (l5 + ((long)nArray[2] & 0xFFFFFFFFL));
        nArray[2] = (int)l4;
        l4 = (l4 >>> 32) + ((long)nArray[3] & 0xFFFFFFFFL);
        nArray[3] = (int)l4;
        if (l4 >>> 32 == 0L) {
            return 0;
        }
        return ab.c(7, nArray, 4);
    }

    public static void d(int[] nArray, int[] nArray2) {
        long l2;
        long l3 = (long)nArray[0] & 0xFFFFFFFFL;
        int n2 = 0;
        int n3 = 6;
        int n4 = 14;
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
        l13 &= 0xFFFFFFFFL;
        l15 &= 0xFFFFFFFFL;
        l16 &= 0xFFFFFFFFL;
        l18 &= 0xFFFFFFFFL;
        long l20 = (long)nArray[6] & 0xFFFFFFFFL;
        long l21 = ((long)nArray2[11] & 0xFFFFFFFFL) + ((l19 += (l18 += ((l16 += ((l15 += ((l13 += (l12 >>> 32) + l17 * l8) >>> 32) + l17 * l2) >>> 32) + l17 * l11) >>> 32) + l17 * l14) >>> 32) >>> 32);
        l19 &= 0xFFFFFFFFL;
        long l22 = ((long)nArray2[12] & 0xFFFFFFFFL) + (l21 >>> 32);
        l21 &= 0xFFFFFFFFL;
        n5 = (int)(l13 += l20 * l3);
        nArray2[6] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        l22 += (l21 += ((l19 += ((l18 += ((l16 += ((l15 += (l13 >>> 32) + l20 * l8) >>> 32) + l20 * l2) >>> 32) + l20 * l11) >>> 32) + l20 * l14) >>> 32) + l20 * l17) >>> 32;
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
        n5 = (int)l21;
        nArray2[11] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        n5 = (int)l22;
        nArray2[12] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        n5 = nArray2[13] + (int)(l22 >>> 32);
        nArray2[13] = n5 << 1 | n2;
    }

    public static int f(int[] nArray, int[] nArray2, int[] nArray3) {
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
        l2 = (l2 >> 32) + (((long)nArray[6] & 0xFFFFFFFFL) - ((long)nArray2[6] & 0xFFFFFFFFL));
        nArray3[6] = (int)l2;
        return (int)(l2 >> 32);
    }

    public static BigInteger c(int[] nArray) {
        byte[] byArray = new byte[28];
        for (int i2 = 0; i2 < 7; ++i2) {
            int n2 = nArray[i2];
            if (n2 == 0) continue;
            ab.a(n2, byArray, 6 - i2 << 2);
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
        nArray[6] = 0;
    }

    public static boolean a(long[] lArray) {
        for (int i2 = 0; i2 < 9; ++i2) {
            if (lArray[i2] == 0L) continue;
            return false;
        }
        return true;
    }

    public abstract i a(int var1, byte[] var2);
}

