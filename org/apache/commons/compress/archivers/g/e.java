/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

final class e {
    private final int a;
    private final byte[] b = new byte[32768];
    private int c;
    private int d;

    e() {
        this.a = 32768;
    }

    public final boolean a() {
        return this.c != this.d;
    }

    public final void a(int n2) {
        this.b[this.d] = (byte)n2;
        this.d = (this.d + 1) % 32768;
    }

    public final int b() {
        if (this.a()) {
            byte by2 = this.b[this.c];
            this.c = (this.c + 1) % 32768;
            return by2 & 0xFF;
        }
        return -1;
    }

    public final void a(int n2, int n3) {
        n3 = n2 + n3;
        for (n2 = this.d - n2; n2 < n3; ++n2) {
            this.b[this.d] = this.b[(n2 + 32768) % 32768];
            this.d = (this.d + 1) % 32768;
        }
    }
}

