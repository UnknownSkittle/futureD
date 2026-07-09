/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.h;

import org.bouncycastle.b.e;
import org.bouncycastle.crypto.c;
import org.bouncycastle.crypto.h.a;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.n;

public final class b
extends c {
    private a e;

    private b(org.bouncycastle.crypto.b b2, a a2) {
        this.d = b2;
        this.e = a2;
        this.a = new byte[b2.a()];
        this.b = 0;
    }

    public b(org.bouncycastle.crypto.b b2) {
        this(b2, new org.bouncycastle.e.a());
    }

    public final void a(boolean bl2, e e2) {
        this.c = bl2;
        this.b();
        this.d.a(bl2, e2);
    }

    public final int b(int n2) {
        int n3 = (n2 += this.b) % this.a.length;
        if (n3 == 0) {
            if (this.c) {
                return n2 + this.a.length;
            }
            return n2;
        }
        return n2 - n3 + this.a.length;
    }

    public final int a(int n2) {
        int n3 = (n2 += this.b) % this.a.length;
        if (n3 == 0) {
            return Math.max(0, n2 - this.a.length);
        }
        return n2 - n3;
    }

    public final int a(byte[] byArray, int n2, int n3, byte[] byArray2) {
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
        return n5;
    }

    public final int a(byte[] byArray) {
        int n2 = this.d.a();
        int n3 = 0;
        if (this.c) {
            if (this.b == n2) {
                if (0 + 2 * n2 > byArray.length) {
                    this.b();
                    throw new n("output buffer too short");
                }
                n3 = this.d.a(this.a, 0, byArray, 0);
                this.b = 0;
            }
            this.e.a(this.a, this.b);
            n3 += this.d.a(this.a, 0, byArray, n3);
            this.b();
        } else {
            if (this.b != n2) {
                this.b();
                throw new i("last block incomplete in decryption");
            }
            n3 = this.d.a(this.a, 0, this.a, 0);
            this.b = 0;
            try {
                System.arraycopy(this.a, 0, byArray, 0, n3 -= this.e.a(this.a));
            } finally {
                this.b();
            }
        }
        return n3;
    }
}

