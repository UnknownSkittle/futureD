/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.k;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.math.ec.a;

public abstract class ab {
    private aa a;

    public final synchronized aa b() {
        if (this.a == null) {
            this.a = this.a();
        }
        return this.a;
    }

    protected abstract aa a();

    public static void a(int[] nArray, int[] nArray2, int[] nArray3) {
        int n2 = nArray.length;
        if (ab.b(n2, nArray2)) {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
        if (ab.a(n2, nArray2)) {
            System.arraycopy(nArray2, 0, nArray3, 0, n2);
            return;
        }
        nArray2 = ab.e(n2, nArray2);
        int[] nArray4 = new int[n2];
        int[] nArray5 = nArray4;
        nArray4[0] = 1;
        int n3 = 0;
        if ((nArray2[0] & 1) == 0) {
            n3 = ab.a(nArray, nArray2, n2, nArray5, 0);
        }
        if (ab.a(n2, nArray2)) {
            ab.a(nArray, n3, nArray5, nArray3);
            return;
        }
        int[] nArray6 = ab.e(n2, nArray);
        int[] nArray7 = new int[n2];
        int n4 = 0;
        int n5 = n2;
        while (true) {
            if (nArray2[n5 - 1] == 0 && nArray6[n5 - 1] == 0) {
                --n5;
                continue;
            }
            if (ab.c(n5, nArray2, nArray6)) {
                ab.f(n5, nArray6, nArray2);
                n3 += ab.f(n2, nArray7, nArray5) - n4;
                n3 = ab.a(nArray, nArray2, n5, nArray5, n3);
                if (!ab.a(n5, nArray2)) continue;
                ab.a(nArray, n3, nArray5, nArray3);
                return;
            }
            ab.f(n5, nArray2, nArray6);
            n4 += ab.f(n2, nArray5, nArray7) - n3;
            n4 = ab.a(nArray, nArray6, n5, nArray7, n4);
            if (ab.a(n5, nArray6)) break;
        }
        ab.a(nArray, n4, nArray7, nArray3);
    }

    private static void a(int[] nArray, int n2, int[] nArray2, int[] nArray3) {
        if (n2 < 0) {
            ab.a(nArray.length, nArray2, nArray, nArray3);
            return;
        }
        System.arraycopy(nArray2, 0, nArray3, 0, nArray.length);
    }

    private static int a(int[] nArray, int[] nArray2, int n2, int[] nArray3, int n3) {
        int n4;
        int n5;
        int n6;
        int n7 = nArray.length;
        int n8 = 0;
        while (nArray2[0] == 0) {
            n6 = 0;
            int[] nArray4 = nArray2;
            n5 = n2;
            while (--n5 >= 0) {
                n4 = nArray4[n5];
                nArray4[n5] = n6;
                n6 = n4;
            }
            n8 += 32;
        }
        n4 = nArray2[0];
        int n9 = 0;
        while ((n4 & 1) == 0) {
            n4 >>>= 1;
            ++n9;
        }
        int n10 = n9;
        if (n10 > 0) {
            n5 = 0;
            n6 = n10;
            int[] nArray5 = nArray2;
            n4 = n2;
            while (--n4 >= 0) {
                int n11 = nArray5[n4];
                nArray5[n4] = n11 >>> n6 | n5 << -n6;
                n5 = n11;
            }
            n8 += n10;
        }
        for (n10 = 0; n10 < n8; ++n10) {
            if ((nArray3[0] & 1) != 0) {
                n3 = n3 < 0 ? (n3 += ab.a(n7, nArray, nArray3)) : (n3 += ab.f(n7, nArray, nArray3));
            }
            n6 = n3;
            int[] nArray6 = nArray3;
            n5 = n7;
            while (--n5 >= 0) {
                n4 = nArray6[n5];
                nArray6[n5] = n4 >>> 1 | n6 << 31;
                n6 = n4;
            }
        }
        return n3;
    }

    public static int a(int n2, int[] nArray, int[] nArray2, int[] nArray3) {
        long l2 = 0L;
        for (int i2 = 0; i2 < n2; ++i2) {
            nArray3[i2] = (int)(l2 += ((long)nArray[i2] & 0xFFFFFFFFL) + ((long)nArray2[i2] & 0xFFFFFFFFL));
            l2 >>>= 32;
        }
        return (int)l2;
    }

    public static int a(int n2, int n3, int[] nArray) {
        long l2 = ((long)nArray[0] & 0xFFFFFFFFL) + ((long)n3 & 0xFFFFFFFFL);
        nArray[0] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[1] & 0xFFFFFFFFL) + 1L);
        nArray[1] = (int)l2;
        if (l2 >>> 32 == 0L) {
            return 0;
        }
        return ab.b(n2, nArray, 2);
    }

    public static int b(int n2, int[] nArray, int[] nArray2, int[] nArray3) {
        long l2 = 0L;
        for (int i2 = 0; i2 < n2; ++i2) {
            nArray3[i2] = (int)(l2 += ((long)nArray[i2] & 0xFFFFFFFFL) + ((long)nArray2[i2] & 0xFFFFFFFFL) + ((long)nArray3[i2] & 0xFFFFFFFFL));
            l2 >>>= 32;
        }
        return (int)l2;
    }

    public static int a(int n2, int[] nArray, int[] nArray2) {
        long l2 = 0L;
        for (int i2 = 0; i2 < n2; ++i2) {
            nArray2[i2] = (int)(l2 += ((long)nArray[i2] & 0xFFFFFFFFL) + ((long)nArray2[i2] & 0xFFFFFFFFL));
            l2 >>>= 32;
        }
        return (int)l2;
    }

    public static int a(int n2, int[] nArray, int[] nArray2, int n3) {
        long l2 = 0L;
        for (int i2 = 0; i2 < n2; ++i2) {
            nArray2[n3 + i2] = (int)(l2 += ((long)nArray[i2] & 0xFFFFFFFFL) + ((long)nArray2[n3 + i2] & 0xFFFFFFFFL));
            l2 >>>= 32;
        }
        return (int)l2;
    }

    public static int a(int n2, int n3, int[] nArray, int n4) {
        long l2 = ((long)n3 & 0xFFFFFFFFL) + ((long)nArray[n4] & 0xFFFFFFFFL);
        nArray[n4] = (int)l2;
        if (l2 >>> 32 == 0L) {
            return 0;
        }
        return ab.b(n2, nArray, n4 + 1);
    }

    public static int b(int n2, int n3, int[] nArray) {
        long l2 = ((long)n3 & 0xFFFFFFFFL) + ((long)nArray[0] & 0xFFFFFFFFL);
        nArray[0] = (int)l2;
        if (l2 >>> 32 == 0L) {
            return 0;
        }
        return ab.b(n2, nArray, 1);
    }

    private static int[] e(int n2, int[] nArray) {
        int[] nArray2 = new int[n2];
        System.arraycopy(nArray, 0, nArray2, 0, n2);
        return nArray2;
    }

    public static int a(int n2, int[] nArray, int n3) {
        while (n3 < n2) {
            int n4 = n3++;
            nArray[n4] = nArray[n4] - 1;
            if (nArray[n4] == -1) continue;
            return 0;
        }
        return -1;
    }

    public static boolean b(int n2, int[] nArray, int[] nArray2) {
        --n2;
        while (n2 >= 0) {
            if (nArray[n2] != nArray2[n2]) {
                return false;
            }
            --n2;
        }
        return true;
    }

    public static int[] a(int n2, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > n2) {
            throw new IllegalArgumentException();
        }
        int[] nArray = new int[n2 + 31 >> 5];
        int n3 = 0;
        while (bigInteger.signum() != 0) {
            nArray[n3++] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return nArray;
    }

    public static boolean c(int n2, int[] nArray, int[] nArray2) {
        --n2;
        while (n2 >= 0) {
            int n3 = nArray[n2] ^ Integer.MIN_VALUE;
            int n4 = nArray2[n2] ^ Integer.MIN_VALUE;
            if (n3 < n4) {
                return false;
            }
            if (n3 > n4) {
                return true;
            }
            --n2;
        }
        return true;
    }

    public static int a(int[] nArray) {
        int n2 = 0;
        while (n2 < 16) {
            int n3 = n2++;
            nArray[n3] = nArray[n3] + 1;
            if (nArray[n3] == 0) continue;
            return 0;
        }
        return 1;
    }

    public static int d(int n2, int[] nArray, int[] nArray2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3;
            nArray2[i2] = n3 = nArray[i2] + 1;
            if (n3 == 0) continue;
            while (i2 < n2) {
                nArray2[i2] = nArray[i2];
                ++i2;
            }
            return 0;
        }
        return 1;
    }

    public static int b(int n2, int[] nArray, int n3) {
        while (n3 < n2) {
            int n4 = n3++;
            nArray[n4] = nArray[n4] + 1;
            if (nArray[n4] == 0) continue;
            return 0;
        }
        return 1;
    }

    public static int c(int n2, int[] nArray, int n3) {
        while (n3 < n2) {
            int n4 = n3++;
            nArray[n4] = nArray[n4] + 1;
            if (nArray[n4] == 0) continue;
            return 0;
        }
        return 1;
    }

    public static boolean a(int n2, int[] nArray) {
        if (nArray[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < n2; ++i2) {
            if (nArray[i2] == 0) continue;
            return false;
        }
        return true;
    }

    public static boolean b(int n2, int[] nArray) {
        for (int i2 = 0; i2 < n2; ++i2) {
            if (nArray[i2] == 0) continue;
            return false;
        }
        return true;
    }

    public static int e(int n2, int[] nArray, int[] nArray2) {
        long l2 = 0L;
        long l3 = (long)n2 & 0xFFFFFFFFL;
        n2 = 0;
        do {
            nArray2[n2 + 16] = (int)(l2 += l3 * ((long)nArray[n2] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 16] & 0xFFFFFFFFL));
            l2 >>>= 32;
        } while (++n2 < 16);
        return (int)l2;
    }

    public static int a(int[] nArray, int n2, int[] nArray2) {
        int n3 = 16;
        while (--n3 >= 0) {
            int n4 = nArray[n3 + 16];
            nArray2[n3] = n4 >>> 9 | n2 << -9;
            n2 = n4;
        }
        return n2 << -9;
    }

    public static int a(int n2, int[] nArray, int n3, int[] nArray2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = nArray[i2];
            nArray2[i2] = n4 << 1 | n3 >>> 31;
            n3 = n4;
        }
        return n3 >>> 31;
    }

    public static int b(int[] nArray, int n2, int[] nArray2) {
        for (int i2 = 0; i2 < 8; ++i2) {
            int n3 = nArray[i2 + 8];
            nArray2[i2] = n3 << 1 | n2 >>> 31;
            n2 = n3;
        }
        return n2 >>> 31;
    }

    public static int d(int n2, int[] nArray, int n3) {
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = nArray[i2];
            nArray[i2] = n4 << 2 | n3 >>> -2;
            n3 = n4;
        }
        return n3 >>> -2;
    }

    public static long a(int n2, long[] lArray, long l2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            long l3 = lArray[i2];
            lArray[i2] = l3 << 8 | l2 >>> -8;
            l2 = l3;
        }
        return l2 >>> -8;
    }

    public static int b(int n2, int[] nArray, int n3, int[] nArray2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = nArray[i2];
            nArray2[i2] = n4 << 3 | n3 >>> -3;
            n3 = n4;
        }
        return n3 >>> -3;
    }

    public static int c(int n2, int[] nArray, int[] nArray2, int[] nArray3) {
        long l2 = 0L;
        for (int i2 = 0; i2 < n2; ++i2) {
            nArray3[i2] = (int)(l2 += ((long)nArray[i2] & 0xFFFFFFFFL) - ((long)nArray2[i2] & 0xFFFFFFFFL));
            l2 >>= 32;
        }
        return (int)l2;
    }

    public static int c(int n2, int n3, int[] nArray) {
        long l2 = ((long)nArray[0] & 0xFFFFFFFFL) - ((long)n3 & 0xFFFFFFFFL);
        nArray[0] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray[1] & 0xFFFFFFFFL) - 1L);
        nArray[1] = (int)l2;
        if (l2 >> 32 == 0L) {
            return 0;
        }
        return ab.a(n2, nArray, 2);
    }

    public static int f(int n2, int[] nArray, int[] nArray2) {
        long l2 = 0L;
        for (int i2 = 0; i2 < n2; ++i2) {
            nArray2[i2] = (int)(l2 += ((long)nArray2[i2] & 0xFFFFFFFFL) - ((long)nArray[i2] & 0xFFFFFFFFL));
            l2 >>= 32;
        }
        return (int)l2;
    }

    public static int b(int n2, int[] nArray, int[] nArray2, int n3) {
        long l2 = 0L;
        for (int i2 = 0; i2 < n2; ++i2) {
            nArray2[n3 + i2] = (int)(l2 += ((long)nArray2[n3 + i2] & 0xFFFFFFFFL) - ((long)nArray[i2] & 0xFFFFFFFFL));
            l2 >>= 32;
        }
        return (int)l2;
    }

    public static BigInteger c(int n2, int[] nArray) {
        byte[] byArray = new byte[n2 << 2];
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = nArray[i2];
            if (n3 == 0) continue;
            ab.a(n3, byArray, n2 - 1 - i2 << 2);
        }
        return new BigInteger(1, byArray);
    }

    public static void d(int n2, int[] nArray) {
        for (int i2 = 0; i2 < n2; ++i2) {
            nArray[i2] = 0;
        }
    }

    public static boolean a(long[] lArray) {
        for (int i2 = 0; i2 < 5; ++i2) {
            if (lArray[i2] == 0L) continue;
            return false;
        }
        return true;
    }

    public static void b(int[] nArray, int[] nArray2, int[] nArray3) {
        org.bouncycastle.math.ec.a.d(nArray, nArray2, nArray3);
        int n2 = 12;
        int[] nArray4 = nArray3;
        int[] nArray5 = nArray2;
        int[] nArray6 = nArray;
        long l2 = (long)nArray5[6] & 0xFFFFFFFFL;
        long l3 = (long)nArray5[7] & 0xFFFFFFFFL;
        long l4 = (long)nArray5[8] & 0xFFFFFFFFL;
        long l5 = (long)nArray5[9] & 0xFFFFFFFFL;
        long l6 = (long)nArray5[10] & 0xFFFFFFFFL;
        long l7 = (long)nArray5[11] & 0xFFFFFFFFL;
        long l8 = (long)nArray6[6] & 0xFFFFFFFFL;
        long l9 = 0L + l8 * l2;
        nArray4[12] = (int)l9;
        l9 = (l9 >>> 32) + l8 * l3;
        nArray4[13] = (int)l9;
        l9 = (l9 >>> 32) + l8 * l4;
        nArray4[14] = (int)l9;
        l9 = (l9 >>> 32) + l8 * l5;
        nArray4[15] = (int)l9;
        l9 = (l9 >>> 32) + l8 * l6;
        nArray4[16] = (int)l9;
        l9 = (l9 >>> 32) + l8 * l7;
        nArray4[17] = (int)l9;
        nArray4[18] = (int)(l9 >>>= 32);
        for (int i2 = 1; i2 < 6; ++i2) {
            long l10 = (long)nArray6[i2 + 6] & 0xFFFFFFFFL;
            long l11 = 0L + (l10 * l2 + ((long)nArray4[++n2] & 0xFFFFFFFFL));
            nArray4[n2] = (int)l11;
            l11 = (l11 >>> 32) + (l10 * l3 + ((long)nArray4[n2 + 1] & 0xFFFFFFFFL));
            nArray4[n2 + 1] = (int)l11;
            l11 = (l11 >>> 32) + (l10 * l4 + ((long)nArray4[n2 + 2] & 0xFFFFFFFFL));
            nArray4[n2 + 2] = (int)l11;
            l11 = (l11 >>> 32) + (l10 * l5 + ((long)nArray4[n2 + 3] & 0xFFFFFFFFL));
            nArray4[n2 + 3] = (int)l11;
            l11 = (l11 >>> 32) + (l10 * l6 + ((long)nArray4[n2 + 4] & 0xFFFFFFFFL));
            nArray4[n2 + 4] = (int)l11;
            l11 = (l11 >>> 32) + (l10 * l7 + ((long)nArray4[n2 + 5] & 0xFFFFFFFFL));
            nArray4[n2 + 5] = (int)l11;
            nArray4[n2 + 6] = (int)(l11 >>>= 32);
        }
        int n3 = org.bouncycastle.math.ec.a.a(nArray3, nArray3);
        int n4 = n3 + org.bouncycastle.math.ec.a.a(nArray3, 0, nArray3, 6, 0);
        n3 += org.bouncycastle.math.ec.a.a(nArray3, 18, nArray3, 12, n4);
        int[] nArray7 = new int[6];
        nArray4 = new int[6];
        boolean bl2 = org.bouncycastle.math.ec.a.c(nArray, nArray, nArray7) != org.bouncycastle.math.ec.a.c(nArray2, nArray2, nArray4);
        nArray2 = new int[12];
        org.bouncycastle.math.ec.a.d(nArray7, nArray4, nArray2);
        ab.a(24, n3 += bl2 ? ab.a(12, nArray2, nArray3, 6) : ab.b(12, nArray2, nArray3, 6), nArray3, 18);
    }

    public static void a(int[] nArray, int[] nArray2) {
        long l2;
        org.bouncycastle.math.ec.a.d(nArray, nArray2);
        int[] nArray3 = nArray2;
        int[] nArray4 = nArray;
        long l3 = (long)nArray[6] & 0xFFFFFFFFL;
        int n2 = 0;
        int n3 = 5;
        int n4 = 12;
        do {
            long l4 = (long)nArray4[6 + n3--] & 0xFFFFFFFFL;
            l2 = l4 * l4;
            nArray3[12 + --n4] = n2 << 31 | (int)(l2 >>> 33);
            nArray3[12 + --n4] = (int)(l2 >>> 1);
            n2 = (int)l2;
        } while (n3 > 0);
        long l5 = l3;
        long l6 = l5 * l5;
        long l7 = (long)(n2 << 31) & 0xFFFFFFFFL | l6 >>> 33;
        nArray3[12] = (int)l6;
        n2 = (int)(l6 >>> 32) & 1;
        long l8 = (long)nArray4[7] & 0xFFFFFFFFL;
        l6 = (long)nArray3[14] & 0xFFFFFFFFL;
        int n5 = (int)(l7 += l8 * l3);
        nArray3[13] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        l6 += l7 >>> 32;
        l2 = (long)nArray4[8] & 0xFFFFFFFFL;
        long l9 = (long)nArray3[15] & 0xFFFFFFFFL;
        long l10 = (long)nArray3[16] & 0xFFFFFFFFL;
        n5 = (int)(l6 += l2 * l3);
        nArray3[14] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        l9 &= 0xFFFFFFFFL;
        long l11 = (long)nArray4[9] & 0xFFFFFFFFL;
        long l12 = ((long)nArray3[17] & 0xFFFFFFFFL) + ((l10 += (l9 += (l6 >>> 32) + l2 * l8) >>> 32) >>> 32);
        l10 &= 0xFFFFFFFFL;
        long l13 = ((long)nArray3[18] & 0xFFFFFFFFL) + (l12 >>> 32);
        l12 &= 0xFFFFFFFFL;
        n5 = (int)(l9 += l11 * l3);
        nArray3[15] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        l10 &= 0xFFFFFFFFL;
        l12 &= 0xFFFFFFFFL;
        long l14 = (long)nArray4[10] & 0xFFFFFFFFL;
        long l15 = ((long)nArray3[19] & 0xFFFFFFFFL) + ((l13 += (l12 += ((l10 += (l9 >>> 32) + l11 * l8) >>> 32) + l11 * l2) >>> 32) >>> 32);
        l13 &= 0xFFFFFFFFL;
        long l16 = ((long)nArray3[20] & 0xFFFFFFFFL) + (l15 >>> 32);
        l15 &= 0xFFFFFFFFL;
        n5 = (int)(l10 += l14 * l3);
        nArray3[16] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        l12 &= 0xFFFFFFFFL;
        l13 &= 0xFFFFFFFFL;
        l15 &= 0xFFFFFFFFL;
        long l17 = (long)nArray4[11] & 0xFFFFFFFFL;
        long l18 = ((long)nArray3[21] & 0xFFFFFFFFL) + ((l16 += (l15 += ((l13 += ((l12 += (l10 >>> 32) + l14 * l8) >>> 32) + l14 * l2) >>> 32) + l14 * l11) >>> 32) >>> 32);
        l16 &= 0xFFFFFFFFL;
        long l19 = ((long)nArray3[22] & 0xFFFFFFFFL) + (l18 >>> 32);
        l18 &= 0xFFFFFFFFL;
        n5 = (int)(l12 += l17 * l3);
        nArray3[17] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        l19 += (l18 += ((l16 += ((l15 += ((l13 += (l12 >>> 32) + l17 * l8) >>> 32) + l17 * l2) >>> 32) + l17 * l11) >>> 32) + l17 * l14) >>> 32;
        n5 = (int)l13;
        nArray3[18] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        n5 = (int)l15;
        nArray3[19] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        n5 = (int)l16;
        nArray3[20] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        n5 = (int)l18;
        nArray3[21] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        n5 = (int)l19;
        nArray3[22] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        n5 = nArray3[23] + (int)(l19 >>> 32);
        nArray3[23] = n5 << 1 | n2;
        int n6 = org.bouncycastle.math.ec.a.a(nArray2, nArray2);
        int n7 = n6 + org.bouncycastle.math.ec.a.a(nArray2, 0, nArray2, 6, 0);
        n6 += org.bouncycastle.math.ec.a.a(nArray2, 18, nArray2, 12, n7);
        int[] nArray5 = new int[6];
        org.bouncycastle.math.ec.a.c(nArray, nArray, nArray5);
        nArray = new int[12];
        org.bouncycastle.math.ec.a.d(nArray5, nArray);
        ab.a(24, n6 += ab.b(12, nArray, nArray2, 6), nArray2, 18);
    }

    public static int a(byte[] byArray, int n2) {
        return byArray[n2] << 24 | (byArray[++n2] & 0xFF) << 16 | (byArray[++n2] & 0xFF) << 8 | byArray[++n2] & 0xFF;
    }

    public static void a(int n2, byte[] byArray, int n3) {
        byArray[n3] = (byte)(n2 >>> 24);
        byArray[++n3] = (byte)(n2 >>> 16);
        byArray[++n3] = (byte)(n2 >>> 8);
        byArray[++n3] = (byte)n2;
    }

    public static long b(byte[] byArray, int n2) {
        int n3 = ab.a(byArray, n2);
        int n4 = ab.a(byArray, n2 + 4);
        return ((long)n3 & 0xFFFFFFFFL) << 32 | (long)n4 & 0xFFFFFFFFL;
    }

    public static void a(long l2, byte[] byArray, int n2) {
        ab.a((int)(l2 >>> 32), byArray, n2);
        ab.a((int)l2, byArray, n2 + 4);
    }

    private static int d(byte[] byArray, int n2) {
        return byArray[n2] & 0xFF | (byArray[++n2] & 0xFF) << 8 | (byArray[++n2] & 0xFF) << 16 | byArray[++n2] << 24;
    }

    private static void b(int n2, byte[] byArray, int n3) {
        byArray[n3] = (byte)n2;
        byArray[++n3] = (byte)(n2 >>> 8);
        byArray[++n3] = (byte)(n2 >>> 16);
        byArray[++n3] = (byte)(n2 >>> 24);
    }

    public static long c(byte[] byArray, int n2) {
        int n3 = ab.d(byArray, n2);
        return ((long)ab.d(byArray, n2 + 4) & 0xFFFFFFFFL) << 32 | (long)n3 & 0xFFFFFFFFL;
    }

    public static void a(long[] lArray, int n2, byte[] byArray, int n3) {
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = n3;
            byte[] byArray2 = byArray;
            long l2 = lArray[i2];
            ab.b((int)l2, byArray2, n4);
            ab.b((int)(l2 >>> 32), byArray2, n4 + 4);
            n3 += 8;
        }
    }
}

