/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.e;

import java.math.BigInteger;
import java.security.SecureRandom;

public final class c {
    private static final BigInteger a = BigInteger.valueOf(0L);

    public static byte[] a(BigInteger object) {
        byte[] byArray = ((BigInteger)object).toByteArray();
        object = byArray;
        if (byArray[0] == 0) {
            byte[] byArray2 = new byte[((Object)object).length - 1];
            System.arraycopy(object, 1, byArray2, 0, byArray2.length);
            return byArray2;
        }
        return object;
    }

    public static byte[] a(int n2, BigInteger object) {
        byte[] byArray = ((BigInteger)object).toByteArray();
        object = byArray;
        if (byArray.length == n2) {
            return object;
        }
        int n3 = object[0] == false ? 1 : 0;
        int n4 = ((Object)object).length - n3;
        if (n4 > n2) {
            throw new IllegalArgumentException("standard length exceeded for value");
        }
        byte[] byArray2 = new byte[n2];
        System.arraycopy(object, n3, byArray2, byArray2.length - n4, n4);
        return byArray2;
    }

    public static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        int n2 = bigInteger.compareTo(bigInteger2);
        if (n2 >= 0) {
            if (n2 > 0) {
                throw new IllegalArgumentException("'min' may not be greater than 'max'");
            }
            return bigInteger;
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            return c.a(a, bigInteger2.subtract(bigInteger), secureRandom).add(bigInteger);
        }
        for (n2 = 0; n2 < 1000; ++n2) {
            BigInteger bigInteger3 = new BigInteger(bigInteger2.bitLength(), secureRandom);
            if (bigInteger3.compareTo(bigInteger) < 0 || bigInteger3.compareTo(bigInteger2) > 0) continue;
            return bigInteger3;
        }
        return new BigInteger(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom).add(bigInteger);
    }

    public static BigInteger a(byte[] byArray, int n2, int n3) {
        byte[] byArray2 = byArray;
        if (n2 != 0 || n3 != byArray.length) {
            byArray2 = new byte[n3];
            System.arraycopy(byArray, n2, byArray2, 0, n3);
        }
        return new BigInteger(1, byArray2);
    }
}

