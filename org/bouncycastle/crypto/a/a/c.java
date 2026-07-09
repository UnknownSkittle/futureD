/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.a.a;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.g.a;
import org.bouncycastle.crypto.i.h;
import org.bouncycastle.crypto.j;
import org.bouncycastle.crypto.m;
import org.bouncycastle.e.k;

public final class c {
    private static BigInteger a = BigInteger.valueOf(0L);
    private static BigInteger b = BigInteger.valueOf(1L);

    public static BigInteger a(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger bigInteger2 = a;
        bigInteger = bigInteger.subtract(b);
        return org.bouncycastle.e.c.a(bigInteger2, bigInteger, secureRandom);
    }

    public static BigInteger b(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger bigInteger2 = b;
        bigInteger = bigInteger.subtract(b);
        return org.bouncycastle.e.c.a(bigInteger2, bigInteger, secureRandom);
    }

    public static BigInteger a(char[] cArray) {
        return new BigInteger(k.a(cArray));
    }

    public static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger2.modPow(bigInteger3, bigInteger);
    }

    public static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return bigInteger2.multiply(bigInteger3).multiply(bigInteger4).mod(bigInteger);
    }

    public static BigInteger b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger2.multiply(bigInteger3).mod(bigInteger);
    }

    public static BigInteger c(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger2.modPow(bigInteger3, bigInteger);
    }

    public static BigInteger[] a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, String string, j j2, SecureRandom serializable) {
        BigInteger[] bigIntegerArray = new BigInteger[2];
        BigInteger bigInteger6 = a;
        BigInteger bigInteger7 = bigInteger2.subtract(b);
        serializable = org.bouncycastle.e.c.a(bigInteger6, bigInteger7, (SecureRandom)serializable);
        bigInteger = bigInteger3.modPow((BigInteger)serializable, bigInteger);
        bigInteger3 = c.a(bigInteger3, bigInteger, bigInteger4, string, j2);
        bigIntegerArray[0] = bigInteger;
        bigIntegerArray[1] = ((BigInteger)serializable).subtract(bigInteger5.multiply(bigInteger3)).mod(bigInteger2);
        return bigIntegerArray;
    }

    private static BigInteger a(BigInteger object, BigInteger bigInteger, BigInteger bigInteger2, String string, j j2) {
        j2.c();
        c.a(j2, (BigInteger)object);
        c.a(j2, bigInteger);
        c.a(j2, bigInteger2);
        c.a(j2, string);
        object = new byte[j2.b()];
        j2.a((byte[])object, 0);
        return new BigInteger((byte[])object);
    }

    public static void a(BigInteger bigInteger) {
        if (bigInteger.equals(b)) {
            throw new e("g^x validation failed.  g^x should not be 1.");
        }
    }

    public static void b(BigInteger bigInteger) {
        if (bigInteger.equals(b)) {
            throw new e("ga is equal to 1.  It should not be.  The chances of this happening are on the order of 2^160 for a 160-bit q.  Try again.");
        }
    }

    public static void a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger[] object, String object2, j j2) {
        BigInteger bigInteger5 = object[0];
        object = object[1];
        object2 = c.a(bigInteger3, bigInteger5, bigInteger4, (String)object2, j2);
        if (bigInteger4.compareTo(a) != 1 || bigInteger4.compareTo(bigInteger) != -1 || bigInteger4.modPow(bigInteger2, bigInteger).compareTo(b) != 0 || bigInteger3.modPow((BigInteger)object, bigInteger).multiply(bigInteger4.modPow((BigInteger)object2, bigInteger)).mod(bigInteger).compareTo(bigInteger5) != 0) {
            throw new e("Zero-knowledge proof validation failed");
        }
    }

    public static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6) {
        return bigInteger3.modPow(bigInteger4.multiply(bigInteger5).negate().mod(bigInteger2), bigInteger).multiply(bigInteger6).modPow(bigInteger4, bigInteger);
    }

    public static void a(String string, String string2) {
        if (string.equals(string2)) {
            throw new e("Both participants are using the same participantId (" + string + "). This is not allowed. Each participant must use a unique participantId.");
        }
    }

    public static void b(String string, String string2) {
        if (!string.equals(string2)) {
            throw new e("Received payload from incorrect partner (" + string2 + "). Expected to receive payload from " + string + ".");
        }
    }

    public static void a(Object object, String string) {
        if (object == null) {
            throw new NullPointerException(string + " must not be null");
        }
    }

    public static BigInteger a(String string, String string2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger object, j object2) {
        Object object3 = object2;
        object3.c();
        Object object4 = object;
        object = object3;
        object4 = org.bouncycastle.e.c.a((BigInteger)object4);
        object.a((byte[])object4, 0, ((Object)object4).length);
        org.bouncycastle.e.a.b((byte[])object4);
        object4 = "JPAKE_KC";
        object = object3;
        object4 = k.a((String)object4);
        object.a((byte[])object4, 0, ((Object)object4).length);
        org.bouncycastle.e.a.b((byte[])object4);
        object = new byte[object3.b()];
        object3.a((byte[])object, 0);
        object2 = new a((j)object2);
        object3 = new byte[((a)object2).a()];
        ((a)object2).a(new h((byte[])object));
        c.a((m)object2, "KC_1_U");
        c.a((m)object2, string);
        c.a((m)object2, string2);
        c.a((m)object2, bigInteger);
        c.a((m)object2, bigInteger2);
        c.a((m)object2, bigInteger3);
        c.a((m)object2, bigInteger4);
        ((a)object2).a((byte[])object3);
        org.bouncycastle.e.a.b((byte[])object);
        return new BigInteger((byte[])object3);
    }

    public static void a(String string, String string2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, j j2, BigInteger bigInteger6) {
        if (!c.a(string2, string, bigInteger3, bigInteger4, bigInteger, bigInteger2, bigInteger5, j2).equals(bigInteger6)) {
            throw new e("Partner MacTag validation failed. Therefore, the password, MAC, or digest algorithm of each participant does not match.");
        }
    }

    private static void a(j j2, BigInteger object) {
        object = org.bouncycastle.e.c.a((BigInteger)object);
        j2.a(c.a(((Object)object).length), 0, 4);
        j2.a((byte[])object, 0, ((Object)object).length);
        org.bouncycastle.e.a.b((byte[])object);
    }

    private static void a(j j2, String object) {
        object = k.a((String)object);
        j2.a(c.a(((Object)object).length), 0, 4);
        j2.a((byte[])object, 0, ((Object)object).length);
        org.bouncycastle.e.a.b((byte[])object);
    }

    private static void a(m m2, BigInteger object) {
        Object object2 = object = (Object)org.bouncycastle.e.c.a((BigInteger)object);
        m2.a((byte[])object2, ((Object)object2).length);
        org.bouncycastle.e.a.b((byte[])object);
    }

    private static void a(m m2, String object) {
        Object object2 = object = (Object)k.a((String)object);
        m2.a((byte[])object2, ((Object)object2).length);
        org.bouncycastle.e.a.b((byte[])object);
    }

    private static byte[] a(int n2) {
        return new byte[]{(byte)(n2 >>> 24), (byte)(n2 >>> 16), (byte)(n2 >>> 8), (byte)n2};
    }
}

