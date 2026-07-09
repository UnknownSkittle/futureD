/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.b.a;

public final class cq {
    private static final long[] a = new long[]{3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    public static void a(long[] lArray, long[] lArray2, long[] lArray3) {
        for (int i2 = 0; i2 < 9; ++i2) {
            lArray3[i2] = lArray[i2] ^ lArray2[i2];
        }
    }

    public static void b(long[] lArray, long[] lArray2, long[] lArray3) {
        for (int i2 = 0; i2 < 9; ++i2) {
            int n2 = i2;
            lArray3[n2] = lArray3[n2] ^ (lArray[i2] ^ lArray2[i2]);
        }
    }

    private static void a(long[] lArray, int n2, long[] lArray2, int n3, long[] lArray3, int n4) {
        for (int i2 = 0; i2 < 9; ++i2) {
            int n5 = n4 + i2;
            lArray3[n5] = lArray3[n5] ^ (lArray[n2 + i2] ^ lArray2[n3 + i2]);
        }
    }

    private static void g(long[] lArray, long[] lArray2, long[] lArray3) {
        for (int i2 = 0; i2 < 18; ++i2) {
            lArray3[i2] = lArray[i2] ^ lArray2[i2];
        }
    }

    public static void a(long[] lArray, long[] lArray2) {
        lArray2[0] = lArray[0] ^ 1L;
        for (int i2 = 1; i2 < 9; ++i2) {
            lArray2[i2] = lArray[i2];
        }
    }

    public static long[] a(BigInteger object) {
        if (((BigInteger)object).signum() < 0 || ((BigInteger)object).bitLength() > 576) {
            throw new IllegalArgumentException();
        }
        long[] lArray = new long[9];
        int n2 = 0;
        while (((BigInteger)object).signum() != 0) {
            lArray[n2++] = ((BigInteger)object).longValue();
            object = ((BigInteger)object).shiftRight(64);
        }
        object = lArray;
        cq.a(lArray, 0);
        return object;
    }

    public static void b(long[] lArray, long[] lArray2) {
        if (org.bouncycastle.math.b.a.a(lArray)) {
            throw new IllegalStateException();
        }
        long[] lArray3 = new long[9];
        long[] lArray4 = new long[9];
        long[] lArray5 = new long[9];
        cq.e(lArray, lArray5);
        cq.e(lArray5, lArray3);
        cq.e(lArray3, lArray4);
        cq.c(lArray3, lArray4, lArray3);
        cq.a(lArray3, 2, lArray4);
        cq.c(lArray3, lArray4, lArray3);
        cq.c(lArray3, lArray5, lArray3);
        cq.a(lArray3, 5, lArray4);
        cq.c(lArray3, lArray4, lArray3);
        cq.a(lArray4, 5, lArray4);
        cq.c(lArray3, lArray4, lArray3);
        cq.a(lArray3, 15, lArray4);
        cq.c(lArray3, lArray4, lArray5);
        cq.a(lArray5, 30, lArray3);
        cq.a(lArray3, 30, lArray4);
        cq.c(lArray3, lArray4, lArray3);
        cq.a(lArray3, 60, lArray4);
        cq.c(lArray3, lArray4, lArray3);
        cq.a(lArray4, 60, lArray4);
        cq.c(lArray3, lArray4, lArray3);
        cq.a(lArray3, 180, lArray4);
        cq.c(lArray3, lArray4, lArray3);
        cq.a(lArray4, 180, lArray4);
        cq.c(lArray3, lArray4, lArray3);
        cq.c(lArray3, lArray5, lArray2);
    }

    public static void c(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[18];
        cq.h(lArray, lArray2, lArray4);
        cq.c(lArray4, lArray3);
    }

    public static void d(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[18];
        cq.h(lArray, lArray2, lArray4);
        cq.g(lArray3, lArray4, lArray3);
    }

    public static void e(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[18];
        cq.i(lArray, lArray2, lArray4);
        cq.c(lArray4, lArray3);
    }

    public static void f(long[] lArray, long[] lArray2, long[] lArray3) {
        long[] lArray4 = new long[18];
        cq.i(lArray, lArray2, lArray4);
        cq.g(lArray3, lArray4, lArray3);
    }

    public static long[] a(long[] lArray) {
        long[] lArray2;
        long[] lArray3 = new long[288];
        System.arraycopy(lArray, 0, lArray3, 9, 9);
        int n2 = 0;
        for (int i2 = 7; i2 > 0; --i2) {
            int n3 = n2 += 18;
            long[] lArray4 = lArray3;
            long l2 = 0L;
            int n4 = n2 >>> 1;
            lArray2 = lArray3;
            for (int i3 = 0; i3 < 9; ++i3) {
                long l3 = lArray2[n4 + i3];
                lArray4[n3 + i3] = l3 << 1 | l2 >>> 63;
                l2 = l3;
            }
            cq.a(lArray3, n2);
            int n5 = n2 + 9;
            long[] lArray5 = lArray3;
            int n6 = n2;
            long[] lArray6 = lArray3;
            long[] lArray7 = lArray3;
            for (n3 = 0; n3 < 9; ++n3) {
                lArray5[n5 + n3] = lArray7[n3 + 9] ^ lArray6[n6 + n3];
            }
        }
        long[] lArray8 = lArray3;
        long l4 = 0L;
        lArray2 = lArray3;
        for (int i4 = 0; i4 < 144; ++i4) {
            long l5 = lArray2[i4];
            lArray8[i4 + 144] = l5 << 4 | l4 >>> -4;
            l4 = l5;
        }
        return lArray3;
    }

    public static void c(long[] lArray, long[] lArray2) {
        long l2 = lArray[9];
        long l3 = lArray[17];
        l2 = l2 ^ l3 >>> 59 ^ l3 >>> 57 ^ l3 >>> 54 ^ l3 >>> 49;
        long l4 = lArray[8] ^ l3 << 5 ^ l3 << 7 ^ l3 << 10 ^ l3 << 15;
        for (int i2 = 16; i2 >= 10; --i2) {
            l3 = lArray[i2];
            lArray2[i2 - 8] = l4 ^ l3 >>> 59 ^ l3 >>> 57 ^ l3 >>> 54 ^ l3 >>> 49;
            l4 = lArray[i2 - 9] ^ l3 << 5 ^ l3 << 7 ^ l3 << 10 ^ l3 << 15;
        }
        lArray2[1] = l4 ^ l2 >>> 59 ^ l2 >>> 57 ^ l2 >>> 54 ^ l2 >>> 49;
        l4 = lArray[0] ^ l2 << 5 ^ l2 << 7 ^ l2 << 10 ^ l2 << 15;
        long l5 = lArray2[8];
        long l6 = l5 >>> 59;
        lArray2[0] = l4 ^ l6 ^ l6 << 2 ^ l6 << 5 ^ l6 << 10;
        lArray2[8] = l5 & 0x7FFFFFFFFFFFFFFL;
    }

    private static void a(long[] lArray, int n2) {
        long l2 = lArray[n2 + 8];
        long l3 = l2 >>> 59;
        int n3 = n2;
        long l4 = l3;
        lArray[n3] = lArray[n3] ^ (l4 ^ l4 << 2 ^ l3 << 5 ^ l3 << 10);
        lArray[n2 + 8] = l2 & 0x7FFFFFFFFFFFFFFL;
    }

    public static void d(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[9];
        long[] lArray4 = new long[9];
        int n2 = 0;
        for (int i2 = 0; i2 < 4; ++i2) {
            long l2 = org.bouncycastle.asn1.util.a.a(lArray[n2++]);
            long l3 = org.bouncycastle.asn1.util.a.a(lArray[n2++]);
            lArray3[i2] = l2 & 0xFFFFFFFFL | l3 << 32;
            lArray4[i2] = l2 >>> 32 | l3 & 0xFFFFFFFF00000000L;
        }
        long l4 = org.bouncycastle.asn1.util.a.a(lArray[8]);
        lArray3[4] = l4 & 0xFFFFFFFFL;
        lArray4[4] = l4 >>> 32;
        cq.c(lArray4, a, lArray2);
        cq.a(lArray2, lArray3, lArray2);
    }

    public static void e(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[18];
        cq.g(lArray, lArray3);
        cq.c(lArray3, lArray2);
    }

    public static void f(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[18];
        cq.g(lArray, lArray3);
        cq.g(lArray2, lArray3, lArray2);
    }

    public static void a(long[] lArray, int n2, long[] lArray2) {
        long[] lArray3 = new long[18];
        cq.g(lArray, lArray3);
        cq.c(lArray3, lArray2);
        while (--n2 > 0) {
            cq.g(lArray2, lArray3);
            cq.c(lArray3, lArray2);
        }
    }

    public static int b(long[] lArray) {
        return (int)(lArray[0] ^ lArray[8] >>> 49 ^ lArray[8] >>> 57) & 1;
    }

    private static void h(long[] lArray, long[] lArray2, long[] lArray3) {
        lArray2 = cq.a(lArray2);
        cq.i(lArray, lArray2, lArray3);
    }

    private static void i(long[] lArray, long[] lArray2, long[] lArray3) {
        int n2;
        int n3;
        int n4;
        int n5;
        for (n5 = 56; n5 >= 0; n5 -= 8) {
            for (n4 = 1; n4 < 9; n4 += 2) {
                n3 = (int)(lArray[n4] >>> n5);
                n2 = n3 & 0xF;
                n3 = n3 >>> 4 & 0xF;
                cq.a(lArray2, n2 * 9, lArray2, 9 * (n3 + 16), lArray3, n4 - 1);
            }
            ab.a(16, lArray3, 0L);
        }
        for (n5 = 56; n5 >= 0; n5 -= 8) {
            for (n4 = 0; n4 < 9; n4 += 2) {
                n3 = (int)(lArray[n4] >>> n5);
                n2 = n3 & 0xF;
                n3 = n3 >>> 4 & 0xF;
                cq.a(lArray2, n2 * 9, lArray2, 9 * (n3 + 16), lArray3, n4);
            }
            if (n5 <= 0) continue;
            ab.a(18, lArray3, 0L);
        }
    }

    private static void g(long[] lArray, long[] lArray2) {
        for (int i2 = 0; i2 < 9; ++i2) {
            org.bouncycastle.asn1.util.a.a(lArray[i2], lArray2, i2 << 1);
        }
    }
}

