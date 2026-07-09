/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import java.util.Arrays;

public enum z {
    a(new byte[]{0}),
    b(new byte[]{3, 1, 1}),
    c(new byte[]{33}),
    d(new byte[]{4, 1, 8}),
    e(new byte[]{4, 1, 9}),
    f(new byte[]{4, 2, 2}),
    g(new byte[]{6, -15, 7, 1}),
    h(new byte[]{3, 3, 1, 3}),
    i(new byte[]{3, 3, 2, 5}),
    j(new byte[]{3, 3, 4, 1}),
    k(new byte[]{3, 3, 5, 1}),
    l(new byte[]{3, 3, 7, 1}),
    m(new byte[]{3, 3, 8, 5}),
    n(new byte[]{3});

    private final byte[] o;

    private z(byte[] byArray) {
        this.o = byArray;
    }

    static z a(byte[] byArray) {
        for (z z2 : (z[])z.class.getEnumConstants()) {
            if (!Arrays.equals(z2.o, byArray)) continue;
            return z2;
        }
        return null;
    }
}

