/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.a.b;

final class e {
    private final byte[] a = new byte[65536];
    private final int b;
    private int c;
    private boolean d;

    private e() {
        this(0);
    }

    private e(byte by2) {
        this.b = 65535;
    }

    final byte a(byte by2) {
        this.a[this.c] = by2;
        this.c = this.a(this.c);
        return by2;
    }

    final void a(byte[] byArray, int n2, int n3) {
        for (int i2 = n2; i2 < n2 + n3; ++i2) {
            this.a(byArray[i2]);
        }
    }

    final void a(int n2, int n3, byte[] byArray) {
        if (n2 > 65536) {
            throw new IllegalStateException("Illegal distance parameter: ".concat(String.valueOf(n2)));
        }
        int n4 = this.c - n2 & 0xFFFF;
        if (!this.d && n4 >= this.c) {
            throw new IllegalStateException("Attempt to read beyond memory: dist=".concat(String.valueOf(n2)));
        }
        for (n2 = 0; n2 < n3; ++n2) {
            e e2 = this;
            byArray[n2] = e2.a(e2.a[n4]);
            n4 = this.a(n4);
        }
    }

    private int a(int n2) {
        int n3 = n2 + 1 & 0xFFFF;
        if (!this.d && n3 < n2) {
            this.d = true;
        }
        return n3;
    }

    /* synthetic */ e(char c2) {
        this();
    }
}

