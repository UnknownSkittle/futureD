/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.c;

public final class a
implements org.apache.commons.compress.archivers.a {
    private final short a;
    private final int b;
    private final int c;
    private long d = 0L;
    private long e = 0L;
    private long f = 0L;
    private long g = 0L;
    private long h = 0L;
    private long i = 0L;
    private long j = 0L;
    private long k = 0L;
    private String l;
    private long m = 0L;
    private long n = 0L;
    private long o = 0L;
    private long p = 0L;

    public a(short s2) {
        switch (s2) {
            case 1: {
                this.b = 110;
                this.c = 4;
                break;
            }
            case 2: {
                this.b = 110;
                this.c = 4;
                break;
            }
            case 4: {
                this.b = 76;
                this.c = 0;
                break;
            }
            case 8: {
                this.b = 26;
                this.c = 2;
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown header type");
            }
        }
        this.a = s2;
    }

    private void e() {
        if ((this.a & 3) == 0) {
            throw new UnsupportedOperationException();
        }
    }

    private void f() {
        if ((this.a & 0xC) == 0) {
            throw new UnsupportedOperationException();
        }
    }

    public final long a() {
        this.e();
        return this.d & 0xFFFFFFFFL;
    }

    public final long b() {
        return this.e;
    }

    public final short c() {
        return this.a;
    }

    public final int a(long l2) {
        int n2;
        if (this.c == 0) {
            return 0;
        }
        int n3 = this.b + 1;
        if (this.l != null) {
            n3 = (int)((long)n3 + l2);
        }
        if ((n2 = n3 % this.c) > 0) {
            return this.c - n2;
        }
        return 0;
    }

    public final int d() {
        if (this.c == 0) {
            return 0;
        }
        int n2 = (int)(this.e % (long)this.c);
        if (n2 > 0) {
            return this.c - n2;
        }
        return 0;
    }

    @Override
    public final String getName() {
        return this.l;
    }

    public final void b(long l2) {
        this.e();
        this.d = l2 & 0xFFFFFFFFL;
    }

    public final void c(long l2) {
        this.f();
        this.i = l2;
    }

    public final void d(long l2) {
        this.e();
        this.h = l2;
    }

    public final void e(long l2) {
        this.e();
        this.i = l2;
    }

    public final void f(long l2) {
        if (l2 < 0L || l2 > 0xFFFFFFFFL) {
            throw new IllegalArgumentException("invalid entry size <" + l2 + ">");
        }
        this.e = l2;
    }

    public final void g(long l2) {
        this.f = l2;
    }

    public final void h(long l2) {
        this.g = l2;
    }

    public final void i(long l2) {
        long l3 = l2 & 0xF000L;
        switch ((int)l3) {
            case 4096: 
            case 8192: 
            case 16384: 
            case 24576: 
            case 32768: 
            case 36864: 
            case 40960: 
            case 49152: {
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown mode. Full: " + Long.toHexString(l2) + " Masked: " + Long.toHexString(l3));
            }
        }
        this.j = l2;
    }

    public final void a(String string) {
        this.l = string;
    }

    public final void j(long l2) {
        this.m = l2;
    }

    public final void k(long l2) {
        this.f();
        this.o = l2;
    }

    public final void l(long l2) {
        this.e();
        this.n = l2;
    }

    public final void m(long l2) {
        this.e();
        this.o = l2;
    }

    public final void n(long l2) {
        this.k = l2;
    }

    public final void o(long l2) {
        this.p = l2;
    }

    public final int hashCode() {
        return 31 + (this.l == null ? 0 : this.l.hashCode());
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        object = (a)object;
        if (this.l == null) {
            return ((a)object).l == null;
        }
        return this.l.equals(((a)object).l);
    }

    static long a(byte[] byArray, boolean bl2) {
        if (byArray.length % 2 != 0) {
            throw new UnsupportedOperationException();
        }
        byte[] byArray2 = new byte[byArray.length];
        System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
        if (!bl2) {
            for (int i2 = 0; i2 < byArray2.length; ++i2) {
                byte by2 = byArray2[i2];
                byArray2[i2++] = byArray2[i2];
                byArray2[i2] = by2;
            }
        }
        long l2 = byArray2[0] & 0xFF;
        for (int i3 = 1; i3 < byArray2.length; ++i3) {
            l2 = l2 << 8 | (long)(byArray2[i3] & 0xFF);
        }
        return l2;
    }
}

