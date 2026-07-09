/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.b.f;
import org.bouncycastle.openpgp.h;

public final class b {
    static final int[] a = new int[]{-1, -1, -1, -3};
    private static int[] b = new int[]{1, 0, 0, 4, -2, -1, 3, -4};
    private static final int[] c = new int[]{-1, -1, -1, -5, 1, 0, -4, 3};

    public static void a(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4 = nArray3;
        long l2 = 0L + (((long)nArray[0] & 0xFFFFFFFFL) + ((long)nArray2[0] & 0xFFFFFFFFL));
        nArray4[0] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[1] & 0xFFFFFFFFL) + ((long)nArray2[1] & 0xFFFFFFFFL));
        nArray4[1] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[2] & 0xFFFFFFFFL) + ((long)nArray2[2] & 0xFFFFFFFFL));
        nArray4[2] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[3] & 0xFFFFFFFFL) + ((long)nArray2[3] & 0xFFFFFFFFL));
        nArray4[3] = (int)l2;
        if ((int)(l2 >>> 32) != 0 || nArray3[3] >>> 1 >= 0x7FFFFFFE && f.b(nArray3, a)) {
            org.bouncycastle.math.ec.a.c.b.a(nArray3);
        }
    }

    public static void a(int[] nArray, int[] nArray2) {
        if (ab.d(4, nArray, nArray2) != 0 || nArray2[3] >>> 1 >= 0x7FFFFFFE && f.b(nArray2, a)) {
            org.bouncycastle.math.ec.a.c.b.a(nArray2);
        }
    }

    public static int[] a(BigInteger object) {
        Object object2 = object;
        if (((BigInteger)object2).signum() < 0 || ((BigInteger)object2).bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        Object object3 = new int[4];
        int n2 = 0;
        while (((BigInteger)object2).signum() != 0) {
            object3[n2++] = ((BigInteger)object2).intValue();
            object2 = ((BigInteger)object2).shiftRight(32);
        }
        object = object3;
        if (object3[3] >>> 1 >= 0x7FFFFFFE && f.b((int[])object, a)) {
            object3 = object;
            object2 = a;
            long l2 = 0L + (((long)object3[0] & 0xFFFFFFFFL) - ((long)object2[0] & 0xFFFFFFFFL));
            object3[0] = (int)l2;
            l2 = (l2 >> 32) + (((long)object3[1] & 0xFFFFFFFFL) - ((long)object2[1] & 0xFFFFFFFFL));
            object3[1] = (int)l2;
            l2 = (l2 >> 32) + (((long)object3[2] & 0xFFFFFFFFL) - ((long)object2[2] & 0xFFFFFFFFL));
            object3[2] = (int)l2;
            l2 = (l2 >> 32) + (((long)object3[3] & 0xFFFFFFFFL) - ((long)object2[3] & 0xFFFFFFFFL));
            object3[3] = (int)l2;
        }
        return object;
    }

    public static void b(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4 = new int[8];
        f.b(nArray, nArray2, nArray4);
        org.bouncycastle.math.ec.a.c.b.c(nArray4, nArray3);
    }

    public static void c(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4 = nArray3;
        long l2 = (long)nArray2[0] & 0xFFFFFFFFL;
        long l3 = (long)nArray2[1] & 0xFFFFFFFFL;
        long l4 = (long)nArray2[2] & 0xFFFFFFFFL;
        long l5 = (long)nArray2[3] & 0xFFFFFFFFL;
        long l6 = 0L;
        for (int i2 = 0; i2 < 4; ++i2) {
            long l7 = (long)nArray[i2] & 0xFFFFFFFFL;
            long l8 = 0L + (l7 * l2 + ((long)nArray4[i2] & 0xFFFFFFFFL));
            nArray4[i2] = (int)l8;
            l8 = (l8 >>> 32) + (l7 * l3 + ((long)nArray4[i2 + 1] & 0xFFFFFFFFL));
            nArray4[i2 + 1] = (int)l8;
            l8 = (l8 >>> 32) + (l7 * l4 + ((long)nArray4[i2 + 2] & 0xFFFFFFFFL));
            nArray4[i2 + 2] = (int)l8;
            l8 = (l8 >>> 32) + (l7 * l5 + ((long)nArray4[i2 + 3] & 0xFFFFFFFFL));
            nArray4[i2 + 3] = (int)l8;
            l8 = (l8 >>> 32) + (l6 + ((long)nArray4[i2 + 4] & 0xFFFFFFFFL));
            nArray4[i2 + 4] = (int)l8;
            l6 = l8 >>> 32;
        }
        if ((int)l6 != 0 || nArray3[7] >>> 1 >= 0x7FFFFFFE && h.d(nArray3, b)) {
            ab.a(8, c, nArray3);
        }
    }

    public static void b(int[] nArray, int[] nArray2) {
        if (f.b(nArray)) {
            nArray = nArray2;
            nArray2[0] = 0;
            nArray[1] = 0;
            nArray[2] = 0;
            nArray[3] = 0;
            return;
        }
        f.c(a, nArray, nArray2);
    }

    public static void c(int[] nArray, int[] nArray2) {
        long l2 = (long)nArray[0] & 0xFFFFFFFFL;
        long l3 = (long)nArray[1] & 0xFFFFFFFFL;
        long l4 = (long)nArray[2] & 0xFFFFFFFFL;
        long l5 = (long)nArray[3] & 0xFFFFFFFFL;
        long l6 = (long)nArray[4] & 0xFFFFFFFFL;
        long l7 = (long)nArray[5] & 0xFFFFFFFFL;
        long l8 = (long)nArray[6] & 0xFFFFFFFFL;
        long l9 = (long)nArray[7] & 0xFFFFFFFFL;
        l5 += l9;
        l4 += (l8 += l9 << 1);
        l3 += (l7 += l8 << 1);
        l5 += l6 << 1;
        nArray2[0] = (int)(l2 += (l6 += l7 << 1));
        nArray2[1] = (int)(l3 += l2 >>> 32);
        nArray2[2] = (int)(l4 += l3 >>> 32);
        nArray2[3] = (int)(l5 += l4 >>> 32);
        org.bouncycastle.math.ec.a.c.b.a((int)(l5 >>> 32), nArray2);
    }

    public static void a(int n2, int[] nArray) {
        while (n2 != 0) {
            long l2 = (long)n2 & 0xFFFFFFFFL;
            long l3 = ((long)nArray[0] & 0xFFFFFFFFL) + l2;
            nArray[0] = (int)l3;
            if ((l3 >>= 32) != 0L) {
                nArray[1] = (int)(l3 += (long)nArray[1] & 0xFFFFFFFFL);
                l3 = (l3 >> 32) + ((long)nArray[2] & 0xFFFFFFFFL);
                nArray[2] = (int)l3;
                l3 >>= 32;
            }
            nArray[3] = (int)(l3 += ((long)nArray[3] & 0xFFFFFFFFL) + (l2 << 1));
            n2 = (int)(l3 >> 32);
        }
    }

    public static void d(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[8];
        f.c(nArray, nArray3);
        org.bouncycastle.math.ec.a.c.b.c(nArray3, nArray2);
    }

    public static void a(int[] nArray, int n2, int[] nArray2) {
        int[] nArray3 = new int[8];
        f.c(nArray, nArray3);
        org.bouncycastle.math.ec.a.c.b.c(nArray3, nArray2);
        while (--n2 > 0) {
            f.c(nArray2, nArray3);
            org.bouncycastle.math.ec.a.c.b.c(nArray3, nArray2);
        }
    }

    public static void d(int[] nArray, int[] nArray2, int[] nArray3) {
        if (f.c(nArray, nArray2, nArray3) != 0) {
            nArray = nArray3;
            long l2 = ((long)nArray3[0] & 0xFFFFFFFFL) - 1L;
            nArray[0] = (int)l2;
            if ((l2 >>= 32) != 0L) {
                nArray[1] = (int)(l2 += (long)nArray[1] & 0xFFFFFFFFL);
                l2 = (l2 >> 32) + ((long)nArray[2] & 0xFFFFFFFFL);
                nArray[2] = (int)l2;
                l2 >>= 32;
            }
            nArray[3] = (int)(l2 += ((long)nArray[3] & 0xFFFFFFFFL) - 2L);
        }
    }

    public static void e(int[] nArray, int[] nArray2) {
        if (ab.a(4, nArray, 0, nArray2) != 0 || nArray2[3] >>> 1 >= 0x7FFFFFFE && f.b(nArray2, a)) {
            org.bouncycastle.math.ec.a.c.b.a(nArray2);
        }
    }

    private static void a(int[] nArray) {
        long l2 = ((long)nArray[0] & 0xFFFFFFFFL) + 1L;
        nArray[0] = (int)l2;
        if ((l2 >>= 32) != 0L) {
            nArray[1] = (int)(l2 += (long)nArray[1] & 0xFFFFFFFFL);
            l2 = (l2 >> 32) + ((long)nArray[2] & 0xFFFFFFFFL);
            nArray[2] = (int)l2;
            l2 >>= 32;
        }
        nArray[3] = (int)(l2 += ((long)nArray[3] & 0xFFFFFFFFL) + 2L);
    }
}

