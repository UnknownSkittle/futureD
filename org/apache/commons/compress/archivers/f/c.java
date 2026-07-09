/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.f;

import java.io.IOException;
import java.math.BigInteger;
import org.apache.commons.compress.archivers.f.d;
import org.apache.commons.compress.archivers.g.as;
import org.apache.commons.compress.archivers.g.at;

public final class c {
    private static as a = at.a(null);
    private static as b = new d();

    public static long a(byte[] object, int n2, int n3) {
        byte by2;
        int n4;
        long l2 = 0L;
        int n5 = n2 + n3;
        if (n3 < 2) {
            throw new IllegalArgumentException("Length " + n3 + " must be at least 2");
        }
        if (object[n4] == 0) {
            return 0L;
        }
        for (n4 = n2; n4 < n5 && object[n4] == 32; ++n4) {
        }
        while (true) {
            by2 = object[n5 - 1];
            if (n4 >= n5 || by2 != 0 && by2 != 32) break;
            --n5;
        }
        while (n4 < n5) {
            by2 = object[n4];
            if (by2 < 48 || by2 > 55) {
                byte by3 = by2;
                int n6 = n4;
                object = new String((byte[])object, n2, n3).replaceAll("\u0000", "{NUL}");
                throw new IllegalArgumentException("Invalid byte " + by3 + " at offset " + (n6 - n2) + " in '" + (String)object + "' len=" + n3);
            }
            l2 = (l2 << 3) + (long)(by2 - 48);
            ++n4;
        }
        return l2;
    }

    public static long b(byte[] byArray, int n2, int n3) {
        boolean bl2;
        if ((byArray[n2] & 0x80) == 0) {
            return c.a(byArray, n2, n3);
        }
        boolean bl3 = bl2 = byArray[n2] == -1;
        if (n3 < 9) {
            if (n3 >= 9) {
                throw new IllegalArgumentException("At offset " + n2 + ", " + n3 + " byte binary number exceeds maximum signed long value");
            }
            long l2 = 0L;
            for (int i2 = 1; i2 < n3; ++i2) {
                l2 = (l2 << 8) + (long)(byArray[n2 + i2] & 0xFF);
            }
            if (bl2) {
                l2 = l2 - 1L ^ (long)Math.pow(2.0, (double)(n3 - 1) * 8.0) - 1L;
            }
            if (bl2) {
                return -l2;
            }
            return l2;
        }
        byte[] byArray2 = new byte[n3 - 1];
        System.arraycopy(byArray, n2 + 1, byArray2, 0, n3 - 1);
        BigInteger bigInteger = new BigInteger(byArray2);
        if (bl2) {
            bigInteger = bigInteger.add(BigInteger.valueOf(-1L)).not();
        }
        if (bigInteger.bitLength() > 63) {
            throw new IllegalArgumentException("At offset " + n2 + ", " + n3 + " byte binary number exceeds maximum signed long value");
        }
        if (bl2) {
            return -bigInteger.longValue();
        }
        return bigInteger.longValue();
    }

    public static boolean a(byte[] byArray, int n2) {
        return byArray[n2] == 1;
    }

    public static String c(byte[] byArray, int n2, int n3) {
        try {
            return c.a(byArray, n2, n3, a);
        } catch (IOException iOException) {
            try {
                return c.a(byArray, n2, n3, b);
            } catch (IOException iOException2) {
                throw new RuntimeException(iOException2);
            }
        }
    }

    public static String a(byte[] byArray, int n2, int n3, as as2) {
        int n4 = 0;
        int n5 = n2;
        while (n4 < n3 && byArray[n5] != 0) {
            ++n4;
            ++n5;
        }
        if (n4 > 0) {
            byte[] byArray2 = new byte[n4];
            System.arraycopy(byArray, n2, byArray2, 0, n4);
            return as2.a(byArray2);
        }
        return "";
    }

    public static boolean a(byte[] byArray) {
        long l2 = c.a(byArray, 148, 8);
        long l3 = 0L;
        long l4 = 0L;
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            int n2 = byArray[i2];
            if (148 <= i2 && i2 < 156) {
                n2 = 32;
            }
            l3 += (long)(0xFF & n2);
            l4 += (long)n2;
        }
        return l2 == l3 || l2 == l4;
    }
}

