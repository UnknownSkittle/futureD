/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.b.g;

public abstract class f {
    public byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g g2 = new g(byteArrayOutputStream);
        f f2 = this;
        g g3 = g2;
        f2.a(g3);
        g2.close();
        return byteArrayOutputStream.toByteArray();
    }

    public abstract void a(g var1);

    public static int a(int[] nArray, int[] nArray2, int[] nArray3) {
        long l2 = 0L + (((long)nArray[0] & 0xFFFFFFFFL) + ((long)nArray2[0] & 0xFFFFFFFFL) + ((long)nArray3[0] & 0xFFFFFFFFL));
        nArray3[0] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[1] & 0xFFFFFFFFL) + ((long)nArray2[1] & 0xFFFFFFFFL) + ((long)nArray3[1] & 0xFFFFFFFFL));
        nArray3[1] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[2] & 0xFFFFFFFFL) + ((long)nArray2[2] & 0xFFFFFFFFL) + ((long)nArray3[2] & 0xFFFFFFFFL));
        nArray3[2] = (int)l2;
        l2 = (l2 >>> 32) + (((long)nArray[3] & 0xFFFFFFFFL) + ((long)nArray2[3] & 0xFFFFFFFFL) + ((long)nArray3[3] & 0xFFFFFFFFL));
        nArray3[3] = (int)l2;
        return (int)(l2 >>> 32);
    }

    public static boolean a(int[] nArray, int[] nArray2) {
        for (int i2 = 3; i2 >= 0; --i2) {
            if (nArray[i2] == nArray2[i2]) continue;
            return false;
        }
        return true;
    }

    public static boolean b(int[] nArray, int[] nArray2) {
        for (int i2 = 3; i2 >= 0; --i2) {
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
        for (int i2 = 1; i2 < 4; ++i2) {
            if (nArray[i2] == 0) continue;
            return false;
        }
        return true;
    }

    public static boolean b(int[] nArray) {
        for (int i2 = 0; i2 < 4; ++i2) {
            if (nArray[i2] == 0) continue;
            return false;
        }
        return true;
    }

    public static boolean a(long[] lArray) {
        for (int i2 = 0; i2 < 2; ++i2) {
            if (lArray[i2] == 0L) continue;
            return false;
        }
        return true;
    }

    public static void b(int[] nArray, int[] nArray2, int[] nArray3) {
        long l2 = (long)nArray2[0] & 0xFFFFFFFFL;
        long l3 = (long)nArray2[1] & 0xFFFFFFFFL;
        long l4 = (long)nArray2[2] & 0xFFFFFFFFL;
        long l5 = (long)nArray2[3] & 0xFFFFFFFFL;
        long l6 = (long)nArray[0] & 0xFFFFFFFFL;
        long l7 = 0L + l6 * l2;
        nArray3[0] = (int)l7;
        l7 = (l7 >>> 32) + l6 * l3;
        nArray3[1] = (int)l7;
        l7 = (l7 >>> 32) + l6 * l4;
        nArray3[2] = (int)l7;
        l7 = (l7 >>> 32) + l6 * l5;
        nArray3[3] = (int)l7;
        nArray3[4] = (int)(l7 >>>= 32);
        for (int i2 = 1; i2 < 4; ++i2) {
            long l8 = (long)nArray[i2] & 0xFFFFFFFFL;
            long l9 = 0L + (l8 * l2 + ((long)nArray3[i2] & 0xFFFFFFFFL));
            nArray3[i2] = (int)l9;
            l9 = (l9 >>> 32) + (l8 * l3 + ((long)nArray3[i2 + 1] & 0xFFFFFFFFL));
            nArray3[i2 + 1] = (int)l9;
            l9 = (l9 >>> 32) + (l8 * l4 + ((long)nArray3[i2 + 2] & 0xFFFFFFFFL));
            nArray3[i2 + 2] = (int)l9;
            l9 = (l9 >>> 32) + (l8 * l5 + ((long)nArray3[i2 + 3] & 0xFFFFFFFFL));
            nArray3[i2 + 3] = (int)l9;
            nArray3[i2 + 4] = (int)(l9 >>>= 32);
        }
    }

    public static void c(int[] nArray, int[] nArray2) {
        long l2;
        long l3 = (long)nArray[0] & 0xFFFFFFFFL;
        int n2 = 0;
        int n3 = 3;
        int n4 = 8;
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
        l13 += (l12 += ((l10 += (l9 >>> 32) + l11 * l8) >>> 32) + l11 * l2) >>> 32;
        n5 = (int)l10;
        nArray2[4] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        n5 = (int)(l12 &= 0xFFFFFFFFL);
        nArray2[5] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        n5 = (int)l13;
        nArray2[6] = n5 << 1 | n2;
        n2 = n5 >>> 31;
        n5 = nArray2[7] + (int)(l13 >>> 32);
        nArray2[7] = n5 << 1 | n2;
    }

    public static int c(int[] nArray, int[] nArray2, int[] nArray3) {
        long l2 = 0L + (((long)nArray[0] & 0xFFFFFFFFL) - ((long)nArray2[0] & 0xFFFFFFFFL));
        nArray3[0] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray[1] & 0xFFFFFFFFL) - ((long)nArray2[1] & 0xFFFFFFFFL));
        nArray3[1] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray[2] & 0xFFFFFFFFL) - ((long)nArray2[2] & 0xFFFFFFFFL));
        nArray3[2] = (int)l2;
        l2 = (l2 >> 32) + (((long)nArray[3] & 0xFFFFFFFFL) - ((long)nArray2[3] & 0xFFFFFFFFL));
        nArray3[3] = (int)l2;
        return (int)(l2 >> 32);
    }
}

