/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.c;

final class x
implements Cloneable {
    private static final short[] b = new short[]{0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};
    static final byte[] a = new byte[]{0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
    private long[] c;

    private x(int n2) {
        this.c = new long[n2];
    }

    private x(long[] lArray) {
        this.c = lArray;
    }

    private x(long[] lArray, int n2) {
        if (n2 == lArray.length) {
            this.c = lArray;
            return;
        }
        this.c = new long[n2];
        System.arraycopy(lArray, 0, this.c, 0, n2);
    }

    public x(BigInteger object) {
        int n2;
        if (object == null || ((BigInteger)object).signum() < 0) {
            throw new IllegalArgumentException("invalid F2m field value");
        }
        if (((BigInteger)object).signum() == 0) {
            this.c = new long[]{0L};
            return;
        }
        byte[] byArray = ((BigInteger)object).toByteArray();
        object = byArray;
        int n3 = byArray.length;
        int n4 = 0;
        if (object[0] == false) {
            --n3;
            n4 = 1;
        }
        int n5 = (n3 + 7) / 8;
        this.c = new long[n5];
        --n5;
        n3 = n3 % 8 + n4;
        long l2 = 0L;
        if (n4 < n3) {
            for (n2 = n4; n2 < n3; ++n2) {
                l2 <<= 8;
                n4 = object[n2] & 0xFF;
                l2 |= (long)n4;
            }
            this.c[n5--] = l2;
        }
        while (n5 >= 0) {
            l2 = 0L;
            for (n4 = 0; n4 < 8; ++n4) {
                l2 <<= 8;
                n3 = object[n2++] & 0xFF;
                l2 |= (long)n3;
            }
            this.c[n5] = l2;
            --n5;
        }
    }

    public final boolean a() {
        long[] lArray = this.c;
        if (this.c[0] != 1L) {
            return false;
        }
        for (int i2 = 1; i2 < lArray.length; ++i2) {
            if (lArray[i2] == 0L) continue;
            return false;
        }
        return true;
    }

    public final boolean b() {
        long[] lArray = this.c;
        for (int i2 = 0; i2 < lArray.length; ++i2) {
            if (lArray[i2] == 0L) continue;
            return false;
        }
        return true;
    }

    private int h() {
        x x2 = this;
        int n2 = x2.c.length;
        long[] lArray = x2.c;
        if ((n2 = Math.min(n2, lArray.length)) <= 0) {
            return 0;
        }
        if (lArray[0] != 0L) {
            while (lArray[--n2] == 0L) {
            }
            return n2 + 1;
        }
        do {
            if (lArray[--n2] == 0L) continue;
            return n2 + 1;
        } while (n2 > 0);
        return 0;
    }

    public final int c() {
        long l2;
        int n2 = this.c.length;
        do {
            if (n2 != 0) continue;
            return 0;
        } while ((l2 = this.c[--n2]) == 0L);
        return (n2 << 6) + x.a(l2);
    }

    private int a(int n2) {
        long l2;
        n2 = n2 + 62 >>> 6;
        do {
            if (n2 != 0) continue;
            return 0;
        } while ((l2 = this.c[--n2]) == 0L);
        return (n2 << 6) + x.a(l2);
    }

    private static int a(long l2) {
        int n2;
        int n3 = (int)(l2 >>> 32);
        if (n3 == 0) {
            n3 = (int)l2;
            n2 = 0;
        } else {
            n2 = 32;
        }
        int n4 = n3 >>> 16;
        n4 = n4 == 0 ? ((n4 = n3 >>> 8) == 0 ? a[n3] : 8 + a[n4]) : ((n3 = n4 >>> 8) == 0 ? 16 + a[n4] : 24 + a[n3]);
        return n2 + n4;
    }

    private long[] b(int n2) {
        long[] lArray = new long[n2];
        System.arraycopy(this.c, 0, lArray, 0, Math.min(this.c.length, n2));
        return lArray;
    }

    public final BigInteger d() {
        int n2;
        int n3 = this.h();
        if (n3 == 0) {
            return org.bouncycastle.math.ec.c.a;
        }
        long l2 = this.c[n3 - 1];
        byte[] byArray = new byte[8];
        int n4 = 0;
        boolean bl2 = false;
        for (int i2 = 7; i2 >= 0; --i2) {
            byte by2 = (byte)(l2 >>> (i2 << 3));
            if (!bl2 && by2 == 0) continue;
            bl2 = true;
            byArray[n4++] = by2;
        }
        byte[] byArray2 = new byte[8 * (n3 - 1) + n4];
        for (n2 = 0; n2 < n4; ++n2) {
            byArray2[n2] = byArray[n2];
        }
        for (n2 = n3 - 2; n2 >= 0; --n2) {
            long l3 = this.c[n2];
            for (n3 = 7; n3 >= 0; --n3) {
                byArray2[n4++] = (byte)(l3 >>> (n3 << 3));
            }
        }
        return new BigInteger(1, byArray2);
    }

    private static long a(long[] lArray, int n2, long[] lArray2, int n3, int n4, int n5) {
        int n6 = 64 - n5;
        long l2 = 0L;
        for (int i2 = 0; i2 < n4; ++i2) {
            long l3 = lArray[n2 + i2];
            lArray2[n3 + i2] = l3 << n5 | l2;
            l2 = l3 >>> n6;
        }
        return l2;
    }

    public final x e() {
        if (this.c.length == 0) {
            return new x(new long[]{1L});
        }
        int n2 = Math.max(1, this.h());
        long[] lArray = this.b(n2);
        long[] lArray2 = lArray;
        lArray[0] = lArray[0] ^ 1L;
        return new x(lArray2);
    }

    private void a(x x2, int n2, int n3) {
        n2 = n2 + 63 >>> 6;
        int n4 = n3 >>> 6;
        if ((n3 &= 0x3F) == 0) {
            x.a(this.c, n4, x2.c, 0, n2);
            return;
        }
        long l2 = x.b(this.c, n4, x2.c, 0, n2, n3);
        if (l2 != 0L) {
            int n5 = n2 + n4;
            this.c[n5] = this.c[n5] ^ l2;
        }
    }

    private static long b(long[] lArray, int n2, long[] lArray2, int n3, int n4, int n5) {
        int n6 = 64 - n5;
        long l2 = 0L;
        for (int i2 = 0; i2 < n4; ++i2) {
            long l3 = lArray2[n3 + i2];
            int n7 = n2 + i2;
            lArray[n7] = lArray[n7] ^ (l3 << n5 | l2);
            l2 = l3 >>> n6;
        }
        return l2;
    }

    private static long c(long[] lArray, int n2, long[] lArray2, int n3, int n4, int n5) {
        int n6 = 64 - n5;
        long l2 = 0L;
        while (--n4 >= 0) {
            long l3 = lArray2[n3 + n4];
            int n7 = n2 + n4;
            lArray[n7] = lArray[n7] ^ (l3 >>> n5 | l2);
            l2 = l3 << n6;
        }
        return l2;
    }

    public final void a(x x2) {
        int n2 = x2.h();
        if (n2 == 0) {
            return;
        }
        int n3 = n2;
        if (n3 > this.c.length) {
            this.c = this.b(n3);
        }
        x.a(this.c, 0, x2.c, 0, n2);
    }

    private static void a(long[] lArray, int n2, long[] lArray2, int n3, int n4) {
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = n2 + i2;
            lArray[n5] = lArray[n5] ^ lArray2[n3 + i2];
        }
    }

    private static void a(long[] lArray, int n2, long[] lArray2, int n3, long[] lArray3, int n4, int n5) {
        for (int i2 = 0; i2 < n5; ++i2) {
            lArray3[n4 + i2] = lArray[n2 + i2] ^ lArray2[n3 + i2];
        }
    }

    private static void b(long[] lArray, int n2, long[] lArray2, int n3, long[] lArray3, int n4, int n5) {
        for (int i2 = 0; i2 < n5; ++i2) {
            int n6 = n2 + i2;
            lArray[n6] = lArray[n6] ^ (lArray2[n3 + i2] ^ lArray3[n4 + i2]);
        }
    }

    private static void a(long[] lArray, int n2, long l2) {
        int n3 = 0 + (n2 >>> 6);
        if ((n2 &= 0x3F) == 0) {
            int n4 = n3;
            lArray[n4] = lArray[n4] ^ l2;
            return;
        }
        int n5 = n3++;
        lArray[n5] = lArray[n5] ^ l2 << n2;
        if ((l2 >>>= 64 - n2) != 0L) {
            int n6 = n3;
            lArray[n6] = lArray[n6] ^ l2;
        }
    }

    public final boolean f() {
        return this.c.length > 0 && (this.c[0] & 1L) != 0L;
    }

    private static boolean a(long[] lArray, int n2) {
        int n3 = n2 >>> 6;
        long l2 = 1L << (n2 &= 0x3F);
        return (lArray[n3] & l2) != 0L;
    }

    private static void b(long[] lArray, int n2) {
        int n3 = n2 >>> 6;
        long l2 = 1L << (n2 &= 0x3F);
        int n4 = n3;
        lArray[n4] = lArray[n4] ^ l2;
    }

    private static void a(long l2, long[] lArray, int n2, long[] lArray2) {
        if ((l2 & 1L) != 0L) {
            x.a(lArray2, 0, lArray, 0, n2);
        }
        int n3 = 1;
        while ((l2 >>>= 1) != 0L) {
            long l3;
            if ((l2 & 1L) != 0L && (l3 = x.b(lArray2, 0, lArray, 0, n2, n3)) != 0L) {
                int n4 = n2;
                lArray2[n4] = lArray2[n4] ^ l3;
            }
            ++n3;
        }
    }

    public final x a(x x2, int n2, int[] nArray) {
        int n3;
        int n4 = this.c();
        if (n4 == 0) {
            return this;
        }
        int n5 = x2.c();
        if (n5 == 0) {
            return x2;
        }
        Object object = this;
        x x3 = x2;
        if (n4 > n5) {
            object = x2;
            x3 = this;
            int n6 = n4;
            n4 = n5;
            n5 = n6;
        }
        int n7 = n4 + 63 >>> 6;
        int n8 = n5 + 63 >>> 6;
        n4 = n4 + n5 + 62 >>> 6;
        if (n7 == 1) {
            long l2 = ((x)object).c[0];
            if (l2 == 1L) {
                return x3;
            }
            long[] lArray = new long[n4];
            x.a(l2, x3.c, n8, lArray);
            return x.a(lArray, n4, n2, nArray);
        }
        int n9 = n5 + 7 + 63 >>> 6;
        int[] nArray2 = new int[16];
        long[] lArray = new long[n9 << 4];
        nArray2[1] = n3 = n9;
        System.arraycopy(x3.c, 0, lArray, n3, n8);
        for (int i2 = 2; i2 < 16; ++i2) {
            nArray2[i2] = n3 += n9;
            if ((i2 & 1) == 0) {
                x.a(lArray, n3 >>> 1, lArray, n3, n9, 1);
                continue;
            }
            x.a(lArray, n9, lArray, n3 - n9, lArray, n3, n9);
        }
        long[] lArray2 = new long[lArray.length];
        x.a(lArray, 0, lArray2, 0, lArray.length, 4);
        object = ((x)object).c;
        long[] lArray3 = new long[n4 << 3];
        block1: for (n3 = 0; n3 < n7; ++n3) {
            reference var15_23 = object[n3];
            int n10 = n3;
            while (true) {
                int n11 = (int)var15_23 & 0xF;
                int n12 = (int)(var15_23 >>>= 4) & 0xF;
                x.b(lArray3, n10, lArray, nArray2[n11], lArray2, nArray2[n12], n9);
                if ((var15_23 >>>= 4) == 0L) continue block1;
                n10 += n4;
            }
        }
        n3 = lArray3.length;
        while ((n3 -= n4) != 0) {
            x.b(lArray3, n3 - n4, lArray3, n3, n4, 8);
        }
        return x.a(lArray3, n4, n2, nArray);
    }

    public final x b(x x2) {
        int n2;
        int n3 = this.c();
        if (n3 == 0) {
            return this;
        }
        int n4 = x2.c();
        if (n4 == 0) {
            return x2;
        }
        Object object = this;
        x x3 = x2;
        if (n3 > n4) {
            object = x2;
            x3 = this;
            int n5 = n3;
            n3 = n4;
            n4 = n5;
        }
        int n6 = n3 + 63 >>> 6;
        int n7 = n4 + 63 >>> 6;
        n3 = n3 + n4 + 62 >>> 6;
        if (n6 == 1) {
            long l2 = ((x)object).c[0];
            if (l2 == 1L) {
                return x3;
            }
            long[] lArray = new long[n3];
            x.a(l2, x3.c, n7, lArray);
            return new x(lArray, n3);
        }
        int n8 = n4 + 7 + 63 >>> 6;
        int[] nArray = new int[16];
        long[] lArray = new long[n8 << 4];
        nArray[1] = n2 = n8;
        System.arraycopy(x3.c, 0, lArray, n2, n7);
        for (int i2 = 2; i2 < 16; ++i2) {
            nArray[i2] = n2 += n8;
            if ((i2 & 1) == 0) {
                x.a(lArray, n2 >>> 1, lArray, n2, n8, 1);
                continue;
            }
            x.a(lArray, n8, lArray, n2 - n8, lArray, n2, n8);
        }
        long[] lArray2 = new long[lArray.length];
        x.a(lArray, 0, lArray2, 0, lArray.length, 4);
        object = ((x)object).c;
        long[] lArray3 = new long[n3 << 3];
        block1: for (n2 = 0; n2 < n6; ++n2) {
            reference var13_21 = object[n2];
            int n9 = n2;
            while (true) {
                int n10 = (int)var13_21 & 0xF;
                int n11 = (int)(var13_21 >>>= 4) & 0xF;
                x.b(lArray3, n9, lArray, nArray[n10], lArray2, nArray[n11], n8);
                if ((var13_21 >>>= 4) == 0L) continue block1;
                n9 += n3;
            }
        }
        n2 = lArray3.length;
        while ((n2 -= n3) != 0) {
            x.b(lArray3, n2 - n3, lArray3, n2, n3, 8);
        }
        return new x(lArray3, n3);
    }

    public final void a(int n2, int[] nArray) {
        long[] lArray = this.c;
        if ((n2 = x.b(this.c, lArray.length, n2, nArray)) < lArray.length) {
            this.c = new long[n2];
            System.arraycopy(lArray, 0, this.c, 0, n2);
        }
    }

    private static x a(long[] lArray, int n2, int n3, int[] nArray) {
        n2 = x.b(lArray, n2, n3, nArray);
        return new x(lArray, n2);
    }

    private static int b(long[] lArray, int n2, int n3, int[] nArray) {
        int n4;
        int n5 = n3 + 63 >>> 6;
        if (n2 < n5) {
            return n2;
        }
        int n6 = Math.min(n2 << 6, (n3 << 1) - 1);
        for (n4 = (n2 << 6) - n6; n4 >= 64; n4 -= 64) {
            --n2;
        }
        int n7 = nArray.length;
        int n8 = nArray[n7 - 1];
        n7 = n7 > 1 ? nArray[n7 - 2] : 0;
        if ((n4 = n4 + Math.min(n6 - (n8 = Math.max(n3, n8 + 64)), n3 - n7) >> 6) > 1) {
            n6 = n2 - n4;
            x.b(lArray, n2, n6, n3, nArray);
            while (n2 > n6) {
                lArray[0 + --n2] = 0L;
            }
            n6 <<= 6;
        }
        if (n6 > n8) {
            x.a(lArray, n2, n8, n3, nArray);
            n6 = n8;
        }
        if (n6 > n3) {
            x.c(lArray, n6, n3, nArray);
        }
        return n5;
    }

    private static void c(long[] lArray, int n2, int n3, int[] nArray) {
        while (--n2 >= n3) {
            if (!x.a(lArray, n2)) continue;
            x.d(lArray, n2, n3, nArray);
        }
    }

    private static void d(long[] lArray, int n2, int n3, int[] nArray) {
        x.b(lArray, n2);
        n2 -= n3;
        n3 = nArray.length;
        while (--n3 >= 0) {
            x.b(lArray, nArray[n3] + n2);
        }
        x.b(lArray, n2);
    }

    private static void a(long[] lArray, int n2, int n3, int n4, int[] nArray) {
        int n5 = n3 >>> 6;
        while (--n2 > n5) {
            long l2 = lArray[n2];
            if (l2 == 0L) continue;
            lArray[n2] = 0L;
            x.a(lArray, n2 << 6, l2, n4, nArray);
        }
        int n6 = n3 & 0x3F;
        long l3 = lArray[n5] >>> n6;
        if (l3 != 0L) {
            int n7 = n5;
            lArray[n7] = lArray[n7] ^ l3 << n6;
            x.a(lArray, n3, l3, n4, nArray);
        }
    }

    private static void a(long[] lArray, int n2, long l2, int n3, int[] nArray) {
        n2 -= n3;
        n3 = nArray.length;
        while (--n3 >= 0) {
            x.a(lArray, n2 + nArray[n3], l2);
        }
        x.a(lArray, n2, l2);
    }

    private static void b(long[] lArray, int n2, int n3, int n4, int[] nArray) {
        n4 = (n3 << 6) - n4;
        int n5 = nArray.length;
        while (--n5 >= 0) {
            x.a(lArray, lArray, n3, n2 - n3, n4 + nArray[n5]);
        }
        x.a(lArray, lArray, n3, n2 - n3, n4);
    }

    private static void a(long[] lArray, long[] lArray2, int n2, int n3, int n4) {
        int n5 = 0 + (n4 >>> 6);
        if ((n4 &= 0x3F) == 0) {
            x.a(lArray, n5, lArray2, n2, n3);
            return;
        }
        long l2 = x.c(lArray, n5 + 1, lArray2, n2, n3, 64 - n4);
        int n6 = n5;
        lArray[n6] = lArray[n6] ^ l2;
    }

    public final x b(int n2, int[] nArray) {
        int n3 = this.h();
        if (n3 == 0) {
            return this;
        }
        long[] lArray = new long[n3 <<= 1];
        int n4 = 0;
        while (n4 < n3) {
            long l2 = this.c[n4 >>> 1];
            lArray[n4++] = x.c((int)l2);
            lArray[n4++] = x.c((int)(l2 >>> 32));
        }
        return new x(lArray, x.b(lArray, lArray.length, n2, nArray));
    }

    public final x a(int n2, int n3, int[] nArray) {
        int n4 = this.h();
        if (n4 == 0) {
            return this;
        }
        long[] lArray = new long[n3 + 63 >>> 6 << 1];
        System.arraycopy(this.c, 0, lArray, 0, n4);
        while (--n2 >= 0) {
            int n5 = n4;
            long[] lArray2 = lArray;
            int n6 = n5 << 1;
            while (--n5 >= 0) {
                long l2 = lArray2[n5];
                lArray2[--n6] = x.c((int)(l2 >>> 32));
                lArray2[--n6] = x.c((int)l2);
            }
            n4 = x.b(lArray, lArray.length, n3, nArray);
        }
        return new x(lArray, n4);
    }

    public final x g() {
        int n2 = this.h();
        if (n2 == 0) {
            return this;
        }
        long[] lArray = new long[n2 <<= 1];
        int n3 = 0;
        while (n3 < n2) {
            long l2 = this.c[n3 >>> 1];
            lArray[n3++] = x.c((int)l2);
            lArray[n3++] = x.c((int)(l2 >>> 32));
        }
        return new x(lArray, lArray.length);
    }

    private static long c(int n2) {
        int n3 = b[n2 & 0xFF] | b[n2 >>> 8 & 0xFF] << 16;
        return ((long)(b[n2 >>> 16 & 0xFF] | b[n2 >>> 24] << 16) & 0xFFFFFFFFL) << 32 | (long)n3 & 0xFFFFFFFFL;
    }

    public final x c(int n2, int[] object) {
        int n3 = this.c();
        if (n3 == 0) {
            throw new IllegalStateException();
        }
        if (n3 == 1) {
            return this;
        }
        Object object2 = (x)this.clone();
        int n4 = n2 + 63 >>> 6;
        x x2 = new x(n4);
        int n5 = n2;
        x.d(x2.c, n5, n5, (int[])object);
        object = new x(n4);
        ((x)object).c[0] = 1L;
        x x4 = new x(n4);
        int[] nArray = new int[]{n3, n2 + 1};
        x[] xArray = new x[]{object2, x2};
        object2 = new int[]{1, 0};
        object = new x[]{object, x4};
        int n6 = 1;
        int n7 = nArray[1];
        Object object3 = object2[1];
        int n8 = n7 - nArray[0];
        while (true) {
            if (n8 < 0) {
                n8 = -n8;
                nArray[n6] = n7;
                object2[n6] = object3;
                n6 = 1 - n6;
                n7 = nArray[n6];
                object3 = object2[n6];
            }
            xArray[n6].a(xArray[1 - n6], nArray[1 - n6], n8);
            int n9 = xArray[n6].a(n7);
            if (n9 == 0) {
                return object[1 - n6];
            }
            reference var10_15 = object2[1 - n6];
            super.a((x)object[1 - n6], (int)var10_15, n8);
            if ((var10_15 += n8) > object3) {
                object3 = var10_15;
            } else if (var10_15 == object3) {
                object3 = super.a((int)object3);
            }
            n8 += n9 - n7;
            n7 = n9;
        }
    }

    public final boolean equals(Object object) {
        if (!(object instanceof x)) {
            return false;
        }
        object = (x)object;
        int n2 = this.h();
        if (super.h() != n2) {
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.c[i2] == ((x)object).c[i2]) continue;
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n2 = this.h();
        int n3 = 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = this.c[i2];
            n3 = (n3 * 31 ^ (int)l2) * 31 ^ (int)(l2 >>> 32);
        }
        return n3;
    }

    public final Object clone() {
        long[] lArray;
        long[] lArray2 = this.c;
        if (this.c == null) {
            lArray = null;
        } else {
            long[] lArray3 = new long[lArray2.length];
            System.arraycopy(lArray2, 0, lArray3, 0, lArray2.length);
            lArray = lArray3;
        }
        return new x(lArray);
    }

    public final String toString() {
        int n2 = this.h();
        if (n2 == 0) {
            return "0";
        }
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.c[--n2]));
        while (--n2 >= 0) {
            String string = Long.toBinaryString(this.c[n2]);
            int n3 = string.length();
            if (n3 < 64) {
                stringBuffer.append("0000000000000000000000000000000000000000000000000000000000000000".substring(n3));
            }
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }
}

