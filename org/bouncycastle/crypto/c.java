/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto;

import org.bouncycastle.b.e;
import org.bouncycastle.crypto.b;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.n;

public class c {
    protected byte[] a;
    protected int b;
    protected boolean c;
    protected b d;

    protected c() {
    }

    public void a(boolean bl2, e e2) {
        this.c = bl2;
        this.b();
        this.d.a(bl2, e2);
    }

    public final int a() {
        return this.d.a();
    }

    public int a(int n2) {
        int n3 = (n2 += this.b) % this.a.length;
        return n2 - n3;
    }

    public int b(int n2) {
        return n2 + this.b;
    }

    public int a(byte[] byArray, int n2, int n3, byte[] byArray2) {
        if (n3 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int n4 = this.a();
        int n5 = this.a(n3);
        if (n5 > 0 && n5 > byArray2.length) {
            throw new n("output buffer too short");
        }
        n5 = 0;
        int n6 = this.a.length - this.b;
        if (n3 > n6) {
            System.arraycopy(byArray, 0, this.a, this.b, n6);
            n5 = 0 + this.d.a(this.a, 0, byArray2, 0);
            this.b = 0;
            n3 -= n6;
            n2 = n6;
            while (n3 > this.a.length) {
                n5 += this.d.a(byArray, n2, byArray2, n5);
                n3 -= n4;
                n2 += n4;
            }
        }
        System.arraycopy(byArray, n2, this.a, this.b, n3);
        this.b += n3;
        if (this.b == this.a.length) {
            n5 += this.d.a(this.a, 0, byArray2, n5);
            this.b = 0;
        }
        return n5;
    }

    public int a(byte[] byArray) {
        try {
            if (0 + this.b > byArray.length) {
                throw new n("output buffer too short for doFinal()");
            }
            if (this.b != 0) {
                throw new i("data not block size aligned");
            }
            return 0;
        } finally {
            this.b();
        }
    }

    public final void b() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = 0;
        }
        this.b = 0;
        this.d.b();
    }
}

