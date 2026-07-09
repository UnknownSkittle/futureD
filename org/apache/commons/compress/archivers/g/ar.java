/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.io.Serializable;
import java.math.BigInteger;

public final class ar
implements Serializable {
    private final BigInteger b;
    public static final ar a = new ar(0L);

    public ar(long l2) {
        this(BigInteger.valueOf(l2));
    }

    private ar(BigInteger bigInteger) {
        this.b = bigInteger;
    }

    public ar(byte[] byArray, int n2) {
        this.b = ar.b(byArray, n2);
    }

    public final byte[] a() {
        return ar.a(this.b);
    }

    public final long b() {
        return this.b.longValue();
    }

    public static byte[] a(long l2) {
        return ar.a(BigInteger.valueOf(l2));
    }

    private static byte[] a(BigInteger bigInteger) {
        byte[] byArray = new byte[8];
        long l2 = bigInteger.longValue();
        byArray[0] = (byte)(l2 & 0xFFL);
        byArray[1] = (byte)((l2 & 0xFF00L) >> 8);
        byArray[2] = (byte)((l2 & 0xFF0000L) >> 16);
        byArray[3] = (byte)((l2 & 0xFF000000L) >> 24);
        byArray[4] = (byte)((l2 & 0xFF00000000L) >> 32);
        byArray[5] = (byte)((l2 & 0xFF0000000000L) >> 40);
        byArray[6] = (byte)((l2 & 0xFF000000000000L) >> 48);
        byArray[7] = (byte)((l2 & 0x7F00000000000000L) >> 56);
        if (bigInteger.testBit(63)) {
            byArray[7] = (byte)(byArray[7] | 0xFFFFFF80);
        }
        return byArray;
    }

    public static long a(byte[] byArray, int n2) {
        return ar.b(byArray, n2).longValue();
    }

    private static BigInteger b(byte[] byArray, int n2) {
        BigInteger bigInteger = BigInteger.valueOf(((long)byArray[n2 + 7] << 56 & 0x7F00000000000000L) + ((long)byArray[n2 + 6] << 48 & 0xFF000000000000L) + ((long)byArray[n2 + 5] << 40 & 0xFF0000000000L) + ((long)byArray[n2 + 4] << 32 & 0xFF00000000L) + ((long)byArray[n2 + 3] << 24 & 0xFF000000L) + ((long)byArray[n2 + 2] << 16 & 0xFF0000L) + ((long)byArray[n2 + 1] << 8 & 0xFF00L) + ((long)byArray[n2] & 0xFFL));
        if ((byArray[n2 + 7] & 0xFFFFFF80) == -128) {
            return bigInteger.setBit(63);
        }
        return bigInteger;
    }

    public static long a(byte[] byArray) {
        return ar.a(byArray, 0);
    }

    public static BigInteger b(byte[] byArray) {
        return ar.b(byArray, 0);
    }

    public final boolean equals(Object object) {
        if (object == null || !(object instanceof ar)) {
            return false;
        }
        return this.b.equals(((ar)object).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ZipEightByteInteger value: " + this.b;
    }
}

