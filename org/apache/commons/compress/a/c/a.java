/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.a.c;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import org.apache.commons.compress.b.b;

public abstract class a
extends org.apache.commons.compress.a.a {
    private final byte[] a = new byte[1];
    private b b;
    private int c = -1;
    private int d = 9;
    private byte e;
    private int f = -1;
    private int g;
    private int[] h;
    private byte[] i;
    private byte[] j;
    private int k;

    protected a(InputStream inputStream, ByteOrder byteOrder) {
        this.b = new b(inputStream, byteOrder);
    }

    @Override
    public void close() {
        this.b.close();
    }

    @Override
    public int read() {
        a a2 = this;
        int n2 = a2.read(a2.a);
        if (n2 < 0) {
            return n2;
        }
        return 0xFF & this.a[0];
    }

    @Override
    public int read(byte[] byArray, int n2, int n3) {
        int n4 = this.a(byArray, n2, n3);
        while (n3 - n4 > 0) {
            int n5 = this.a();
            if (n5 < 0) {
                if (n4 > 0) {
                    this.a(n4);
                    return n4;
                }
                return n5;
            }
            n4 += this.a(byArray, n2 + n4, n3 - n4);
        }
        this.a(n4);
        return n4;
    }

    protected abstract int a();

    protected abstract int a(int var1, byte var2);

    protected final void b() {
        this.c = 256;
    }

    protected final void c() {
        this.h = new int[8192];
        this.i = new byte[8192];
        this.j = new byte[8192];
        this.k = 8192;
        int n2 = 0;
        while (n2 < 256) {
            this.h[n2] = -1;
            int n3 = n2++;
            this.i[n3] = (byte)n3;
        }
    }

    protected final int d() {
        if (this.d > 31) {
            throw new IllegalArgumentException("code size must not be bigger than 31");
        }
        return (int)this.b.a(this.d);
    }

    protected final int b(int n2, byte by2) {
        if (this.g < 8192) {
            this.h[this.g] = n2;
            this.i[this.g] = by2;
            return this.g++;
        }
        return -1;
    }

    protected final int e() {
        if (this.f == -1) {
            throw new IOException("The first code can't be a reference to its preceding code");
        }
        a a2 = this;
        return a2.a(a2.f, this.e);
    }

    protected final int a(int n2, boolean bl2) {
        int n3 = n2;
        while (n3 >= 0) {
            this.j[--this.k] = this.i[n3];
            n3 = this.h[n3];
        }
        if (this.f != -1 && !bl2) {
            a a2 = this;
            a2.a(a2.f, this.j[this.k]);
        }
        this.f = n2;
        this.e = this.j[this.k];
        return this.k;
    }

    private int a(byte[] byArray, int n2, int n3) {
        int n4 = this.j.length - this.k;
        if (n4 > 0) {
            n3 = Math.min(n4, n3);
            System.arraycopy(this.j, this.k, byArray, n2, n3);
            this.k += n3;
            return n3;
        }
        return 0;
    }

    protected final int f() {
        return this.d;
    }

    protected final void g() {
        ++this.d;
    }

    protected final int b(int n2) {
        return this.h[n2];
    }

    protected final void c(int n2) {
        this.h[n2] = -1;
    }

    protected final int h() {
        return this.h.length;
    }

    protected final int i() {
        return this.c;
    }

    protected final int j() {
        return this.g;
    }

    protected final void d(int n2) {
        this.g = n2;
    }
}

