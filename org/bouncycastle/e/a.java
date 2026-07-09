/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.e;

import java.math.BigInteger;
import org.bouncycastle.crypto.l;

public final class a
implements org.bouncycastle.crypto.h.a {
    public static boolean a(byte[] byArray, byte[] byArray2) {
        if (byArray == byArray2) {
            return true;
        }
        if (byArray == null || byArray2 == null) {
            return false;
        }
        if (byArray.length != byArray2.length) {
            return false;
        }
        for (int i2 = 0; i2 != byArray.length; ++i2) {
            if (byArray[i2] == byArray2[i2]) continue;
            return false;
        }
        return true;
    }

    public static boolean b(byte[] byArray, byte[] byArray2) {
        if (byArray == byArray2) {
            return true;
        }
        if (byArray == null || byArray2 == null) {
            return false;
        }
        if (byArray.length != byArray2.length) {
            return !a.b(byArray, byArray);
        }
        int n2 = 0;
        for (int i2 = 0; i2 != byArray.length; ++i2) {
            n2 |= byArray[i2] ^ byArray2[i2];
        }
        return n2 == 0;
    }

    public static boolean a(int[] nArray, int[] nArray2) {
        if (nArray == nArray2) {
            return true;
        }
        if (nArray == null || nArray2 == null) {
            return false;
        }
        if (nArray.length != nArray2.length) {
            return false;
        }
        for (int i2 = 0; i2 != nArray.length; ++i2) {
            if (nArray[i2] == nArray2[i2]) continue;
            return false;
        }
        return true;
    }

    public static void b(byte[] byArray) {
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            byArray[i2] = 0;
        }
    }

    public static void a(char[] cArray) {
        for (int i2 = 0; i2 < cArray.length; ++i2) {
            cArray[i2] = '\u0000';
        }
    }

    public static int c(byte[] byArray) {
        if (byArray == null) {
            return 0;
        }
        int n2 = byArray.length;
        int n3 = n2 + 1;
        while (--n2 >= 0) {
            n3 = n3 * 257 ^ byArray[n2];
        }
        return n3;
    }

    public static int a(int[] nArray) {
        if (nArray == null) {
            return 0;
        }
        int n2 = nArray.length;
        int n3 = n2 + 1;
        while (--n2 >= 0) {
            n3 = n3 * 257 ^ nArray[n2];
        }
        return n3;
    }

    public static int a(int[] nArray, int n2) {
        if (nArray == null) {
            return 0;
        }
        int n3 = n2;
        n2 = n3 + 1;
        while (--n3 >= 0) {
            n2 = n2 * 257 ^ nArray[n3];
        }
        return n2;
    }

    public static int a(long[] lArray, int n2) {
        if (lArray == null) {
            return 0;
        }
        int n3 = n2;
        n2 = n3 + 1;
        while (--n3 >= 0) {
            long l2 = lArray[n3];
            n2 = (n2 * 257 ^ (int)l2) * 257 ^ (int)(l2 >>> 32);
        }
        return n2;
    }

    public static int a(short[][][] sArray) {
        int n2 = 0;
        for (int i2 = 0; i2 != sArray.length; ++i2) {
            n2 = n2 * 257 + a.a(sArray[i2]);
        }
        return n2;
    }

    public static int a(short[][] sArray) {
        int n2 = 0;
        for (int i2 = 0; i2 != sArray.length; ++i2) {
            n2 = n2 * 257 + a.a(sArray[i2]);
        }
        return n2;
    }

    public static int a(short[] sArray) {
        if (sArray == null) {
            return 0;
        }
        int n2 = sArray.length;
        int n3 = n2 + 1;
        while (--n2 >= 0) {
            n3 = n3 * 257 ^ sArray[n2] & 0xFF;
        }
        return n3;
    }

    public static byte[] d(byte[] byArray) {
        if (byArray == null) {
            return null;
        }
        byte[] byArray2 = new byte[byArray.length];
        System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
        return byArray2;
    }

    public static int[] b(int[] nArray) {
        if (nArray == null) {
            return null;
        }
        int[] nArray2 = new int[nArray.length];
        System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
        return nArray2;
    }

    public static short[] b(short[] sArray) {
        if (sArray == null) {
            return null;
        }
        short[] sArray2 = new short[sArray.length];
        System.arraycopy(sArray, 0, sArray2, 0, sArray.length);
        return sArray2;
    }

    public static BigInteger[] a(BigInteger[] bigIntegerArray, int n2) {
        BigInteger[] bigIntegerArray2 = new BigInteger[n2];
        if (n2 < bigIntegerArray.length) {
            System.arraycopy(bigIntegerArray, 0, bigIntegerArray2, 0, n2);
        } else {
            System.arraycopy(bigIntegerArray, 0, bigIntegerArray2, 0, bigIntegerArray.length);
        }
        return bigIntegerArray2;
    }

    public static byte[] b(byte[] object, int n2) {
        int n3 = n2;
        if (n3 < 0) {
            StringBuffer stringBuffer = new StringBuffer(0);
            object = stringBuffer;
            stringBuffer.append(" > ").append(n2);
            throw new IllegalArgumentException(((StringBuffer)object).toString());
        }
        byte[] byArray = new byte[n3];
        if (((byte[])object).length < n3) {
            System.arraycopy(object, 0, byArray, 0, ((byte[])object).length);
        } else {
            System.arraycopy(object, 0, byArray, 0, n3);
        }
        return byArray;
    }

    public static byte[] c(byte[] byArray, byte[] byArray2) {
        if (byArray != null && byArray2 != null) {
            byte[] byArray3 = new byte[byArray.length + byArray2.length];
            System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
            System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
            return byArray3;
        }
        if (byArray2 != null) {
            return a.d(byArray2);
        }
        return a.d(byArray);
    }

    public final int a(byte[] byArray, int n2) {
        byte by2 = (byte)(byArray.length - n2);
        while (n2 < byArray.length) {
            byArray[n2] = by2;
            ++n2;
        }
        return by2;
    }

    public final int a(byte[] byArray) {
        int n2 = byArray[byArray.length - 1] & 0xFF;
        byte by2 = (byte)n2;
        boolean bl2 = n2 > byArray.length | n2 == 0;
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            bl2 |= byArray.length - i2 <= n2 & byArray[i2] != by2;
        }
        if (bl2) {
            throw new l("pad block corrupted");
        }
        return n2;
    }
}

