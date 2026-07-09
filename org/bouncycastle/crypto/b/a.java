/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.b;

import org.bouncycastle.crypto.k;
import org.bouncycastle.e.f;

public abstract class a
implements k,
f {
    private final byte[] a = new byte[4];
    private int b;
    private long c;

    protected a() {
        this.b = 0;
    }

    protected a(a a2) {
        this.a(a2);
    }

    protected final void a(a a2) {
        System.arraycopy(a2.a, 0, this.a, 0, 4);
        this.b = a2.b;
        this.c = a2.c;
    }

    public final void a(byte by2) {
        this.a[this.b++] = by2;
        if (this.b == 4) {
            a a2 = this;
            a2.b(a2.a, 0);
            this.b = 0;
        }
        ++this.c;
    }

    public final void a(byte[] byArray, int n2, int n3) {
        n3 = Math.max(0, n3);
        int n4 = 0;
        if (this.b != 0) {
            while (n4 < n3) {
                this.a[this.b++] = byArray[n2 + n4++];
                if (this.b != 4) continue;
                a a2 = this;
                a2.b(a2.a, 0);
                this.b = 0;
                break;
            }
        }
        int n5 = (n3 - n4 & 0xFFFFFFFC) + n4;
        while (n4 < n5) {
            this.b(byArray, n2 + n4);
            n4 += 4;
        }
        while (n4 < n3) {
            this.a[this.b++] = byArray[n2 + n4++];
        }
        this.c += (long)n3;
    }

    public final void e() {
        long l2 = this.c << 3;
        this.a((byte)-128);
        while (this.b != 0) {
            this.a((byte)0);
        }
        this.a(l2);
        this.f();
    }

    public void c() {
        this.c = 0L;
        this.b = 0;
        for (int i2 = 0; i2 < 4; ++i2) {
            this.a[i2] = 0;
        }
    }

    public final int d() {
        return 64;
    }

    protected abstract void b(byte[] var1, int var2);

    protected abstract void a(long var1);

    protected abstract void f();
}

