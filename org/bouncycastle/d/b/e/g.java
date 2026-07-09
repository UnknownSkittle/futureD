/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.crypto.j;
import org.bouncycastle.crypto.p;
import org.bouncycastle.d.b.e.ad;

final class g {
    private final j a;
    private final int b;

    protected g(j j2, int n2) {
        if (j2 == null) {
            throw new NullPointerException("digest == null");
        }
        this.a = j2;
        this.b = n2;
    }

    private byte[] a(int n2, byte[] byArray, byte[] byArray2) {
        byte[] byArray3 = ad.a((long)n2, this.b);
        this.a.a(byArray3, 0, byArray3.length);
        this.a.a(byArray, 0, byArray.length);
        this.a.a(byArray2, 0, byArray2.length);
        byArray3 = new byte[this.b];
        if (this.a instanceof p) {
            ((p)this.a).b(byArray3, 0, this.b);
        } else {
            this.a.a(byArray3, 0);
        }
        return byArray3;
    }

    protected final byte[] a(byte[] byArray, byte[] byArray2) {
        if (byArray.length != this.b) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (byArray2.length != this.b) {
            throw new IllegalArgumentException("wrong in length");
        }
        return this.a(0, byArray, byArray2);
    }

    protected final byte[] b(byte[] byArray, byte[] byArray2) {
        if (byArray.length != this.b) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (byArray2.length != 2 * this.b) {
            throw new IllegalArgumentException("wrong in length");
        }
        return this.a(1, byArray, byArray2);
    }

    protected final byte[] c(byte[] byArray, byte[] byArray2) {
        if (byArray.length != this.b) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (byArray2.length != 32) {
            throw new IllegalArgumentException("wrong address length");
        }
        return this.a(3, byArray, byArray2);
    }
}

