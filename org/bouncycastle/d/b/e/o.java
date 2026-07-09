/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.d.b.e.ad;
import org.bouncycastle.d.b.e.x;

final class o {
    private final byte[][] a;

    protected o(x x2, byte[][] byArray) {
        if (x2 == null) {
            throw new NullPointerException("params == null");
        }
        if (ad.b(byArray)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (byArray.length != x2.c()) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            if (byArray[i2].length == x2.b()) continue;
            throw new IllegalArgumentException("wrong publicKey format");
        }
        this.a = ad.a(byArray);
    }

    protected final byte[][] a() {
        return ad.a(this.a);
    }
}

