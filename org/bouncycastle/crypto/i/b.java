/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.i;

import org.bouncycastle.crypto.i.h;

public final class b
extends h {
    private static byte[] a = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 31, 31, 31, 31, 14, 14, 14, 14, -32, -32, -32, -32, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, 31, -32, 31, -32, 14, -15, 14, -15, 1, -32, 1, -32, 1, -15, 1, -15, 31, -2, 31, -2, 14, -2, 14, -2, 1, 31, 1, 31, 1, 14, 1, 14, -32, -2, -32, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, -32, 31, -32, 31, -15, 14, -15, 14, -32, 1, -32, 1, -15, 1, -15, 1, -2, 31, -2, 31, -2, 14, -2, 14, 31, 1, 31, 1, 14, 1, 14, 1, -2, -32, -2, -32, -2, -15, -2, -15};

    public static boolean a(byte[] byArray, int n2) {
        if (byArray.length - n2 < 8) {
            throw new IllegalArgumentException("key material too short.");
        }
        block0: for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 8; ++i3) {
                if (byArray[i3 + n2] != a[(i2 << 3) + i3]) continue block0;
            }
            return true;
        }
        return false;
    }

    public static void a(byte[] byArray) {
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            byte by2 = byArray[i2];
            byArray[i2] = (byte)(by2 & 0xFE | (by2 >> 1 ^ by2 >> 2 ^ by2 >> 3 ^ by2 >> 4 ^ by2 >> 5 ^ by2 >> 6 ^ by2 >> 7 ^ 1) & 1);
        }
    }

    public static boolean b(byte[] byArray, int n2) {
        for (int i2 = 0; i2 < n2; i2 += 8) {
            if (!b.a(byArray, i2)) continue;
            return true;
        }
        return false;
    }

    public static boolean b(byte[] byArray) {
        if (byArray.length == 16) {
            boolean bl2 = false;
            for (int i2 = 0; i2 != 8; ++i2) {
                if (byArray[i2] == byArray[i2 + 8]) continue;
                bl2 = true;
            }
            return bl2;
        }
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        for (int i3 = 0; i3 != 8; ++i3) {
            bl3 |= byArray[i3] != byArray[i3 + 8];
            bl4 |= byArray[i3] != byArray[i3 + 16];
            bl5 |= byArray[i3 + 8] != byArray[i3 + 16];
        }
        return bl3 && bl4 && bl5;
    }
}

