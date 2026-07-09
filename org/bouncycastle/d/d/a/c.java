/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.d.a;

import java.math.BigInteger;

public final class c {
    public static int a(int n2) {
        if (n2 == 0) {
            return 1;
        }
        if (n2 < 0) {
            n2 = -n2;
        }
        int n3 = 0;
        while (n2 > 0) {
            ++n3;
            n2 >>>= 8;
        }
        return n3;
    }

    static {
        BigInteger.valueOf(0L);
        BigInteger.valueOf(1L);
        BigInteger.valueOf(2L);
        BigInteger.valueOf(4L);
    }
}

