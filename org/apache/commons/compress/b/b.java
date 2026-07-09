/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.b;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.ByteOrder;
import org.apache.commons.compress.b.g;

public class b
implements Closeable {
    private static final long[] a = new long[64];
    private final g b;
    private final ByteOrder c;
    private long d = 0L;
    private int e = 0;

    public b(InputStream inputStream, ByteOrder byteOrder) {
        this.b = new g(inputStream);
        this.c = byteOrder;
    }

    @Override
    public void close() {
        this.b.close();
    }

    public final long a(int n2) {
        if (n2 < 0 || n2 > 63) {
            throw new IllegalArgumentException("count must not be negative or greater than 63");
        }
        if (this.c(n2)) {
            return -1L;
        }
        if (this.e < n2) {
            long l2;
            int n3 = n2;
            b b2 = this;
            int n4 = n3 - b2.e;
            int n5 = 8 - n4;
            long l3 = b2.b.read();
            if (l3 < 0L) {
                return l3;
            }
            if (b2.c == ByteOrder.LITTLE_ENDIAN) {
                long l4 = l3 & a[n4];
                b2.d |= l4 << b2.e;
                l2 = l3 >>> n4 & a[n5];
            } else {
                b2.d <<= n4;
                long l5 = l3 >>> n5 & a[n4];
                b2.d |= l5;
                l2 = l3 & a[n5];
            }
            long l6 = b2.d & a[n3];
            b2.d = l2;
            b2.e = n5;
            return l6;
        }
        return this.b(n2);
    }

    public final int a() {
        return this.e;
    }

    public final long b() {
        return (long)this.e + 8L * (long)this.b.available();
    }

    public final void c() {
        int n2 = this.e % 8;
        if (n2 > 0) {
            this.b(n2);
        }
    }

    public final long d() {
        return this.b.a();
    }

    private long b(int n2) {
        long l2;
        if (this.c == ByteOrder.LITTLE_ENDIAN) {
            l2 = this.d & a[n2];
            this.d >>>= n2;
        } else {
            l2 = this.d >> this.e - n2 & a[n2];
        }
        this.e -= n2;
        return l2;
    }

    private boolean c(int n2) {
        while (this.e < n2 && this.e < 57) {
            long l2 = this.b.read();
            if (l2 < 0L) {
                return true;
            }
            if (this.c == ByteOrder.LITTLE_ENDIAN) {
                this.d |= l2 << this.e;
            } else {
                this.d <<= 8;
                this.d |= l2;
            }
            this.e += 8;
        }
        return false;
    }

    static {
        for (int i2 = 1; i2 <= 63; ++i2) {
            a[i2] = (a[i2 - 1] << 1) + 1L;
        }
    }
}

