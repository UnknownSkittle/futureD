/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.d;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.commons.compress.archivers.d.b;
import org.apache.commons.compress.archivers.d.c;
import org.apache.commons.compress.archivers.d.i;
import org.apache.commons.compress.archivers.d.n;
import org.apache.commons.compress.archivers.d.r;
import org.apache.commons.compress.b.h;

final class o
extends FilterInputStream {
    private byte[] a = new byte[1024];
    private int b = -1;
    private int c = 1024;
    private int d = 1024;
    private boolean e = false;
    private long f = 0L;

    public o(InputStream inputStream) {
        super(inputStream);
    }

    public final void a(int n2, boolean bl2) {
        this.e = bl2;
        this.c = n2 << 10;
        byte[] byArray = this.a;
        this.a = new byte[this.c];
        System.arraycopy(byArray, 0, this.a, 0, 1024);
        o o2 = this;
        o2.a(o2.a, 1024, this.c - 1024);
        this.b = 0;
        this.d = 1024;
    }

    @Override
    public final int available() {
        if (this.d < this.c) {
            return this.c - this.d;
        }
        return this.in.available();
    }

    @Override
    public final int read() {
        throw new IllegalArgumentException("all reads must be multiple of record size (1024 bytes.");
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        if (n3 % 1024 != 0) {
            throw new IllegalArgumentException("all reads must be multiple of record size (1024 bytes.");
        }
        int n4 = 0;
        while (n4 < n3) {
            if (this.d == this.c) {
                try {
                    this.a(true);
                } catch (n n5) {
                    return -1;
                }
            }
            int n6 = this.d + (n3 - n4) <= this.c ? n3 - n4 : this.c - this.d;
            System.arraycopy(this.a, this.d, byArray, n2, n6);
            this.d += n6;
            n4 += n6;
            n2 += n6;
        }
        return n4;
    }

    @Override
    public final long skip(long l2) {
        long l3;
        long l4;
        if (l2 % 1024L != 0L) {
            throw new IllegalArgumentException("all reads must be multiple of record size (1024 bytes.");
        }
        for (l3 = 0L; l3 < l2; l3 += l4) {
            if (this.d == this.c) {
                try {
                    this.a(l2 - l3 < (long)this.c);
                } catch (n n2) {
                    return -1L;
                }
            }
            l4 = (long)this.d + (l2 - l3) <= (long)this.c ? l2 - l3 : (long)this.c - (long)this.d;
            this.d = (int)((long)this.d + l4);
        }
        return l3;
    }

    @Override
    public final void close() {
        if (this.in != null && this.in != System.in) {
            this.in.close();
        }
    }

    public final byte[] a() {
        if (this.d == this.c) {
            try {
                this.a(true);
            } catch (n n2) {
                return null;
            }
        }
        byte[] byArray = new byte[1024];
        System.arraycopy(this.a, this.d, byArray, 0, 1024);
        return byArray;
    }

    public final byte[] b() {
        byte[] byArray = new byte[1024];
        if (-1 == this.read(byArray, 0, 1024)) {
            throw new n();
        }
        return byArray;
    }

    private void a(boolean bl2) {
        if (this.in == null) {
            throw new IOException("input buffer is closed");
        }
        if (!this.e || this.b == -1) {
            o o2 = this;
            o2.a(o2.a, 0, this.c);
            this.f += (long)this.c;
        } else {
            o o3 = this;
            o3.a(o3.a, 0, 4);
            this.f += 4L;
            int n2 = (int)org.apache.commons.compress.archivers.d.b.a(this.a, 0, 4);
            if (!((n2 & 1) == 1)) {
                o o4 = this;
                o4.a(o4.a, 0, this.c);
                this.f += (long)this.c;
            } else {
                int n3 = n2 >> 1 & 7;
                n2 = n2 >> 4 & 0xFFFFFFF;
                byte[] byArray = new byte[n2];
                this.a(byArray, 0, n2);
                this.f += (long)n2;
                if (!bl2) {
                    Arrays.fill(this.a, (byte)0);
                } else {
                    switch (org.apache.commons.compress.archivers.d.c.a(n3 & 3)) {
                        case a: {
                            Inflater inflater = new Inflater();
                            try {
                                inflater.setInput(byArray, 0, byArray.length);
                                if (inflater.inflate(this.a) != this.c) {
                                    throw new n();
                                }
                                break;
                            } catch (DataFormatException dataFormatException) {
                                throw new i("bad data", dataFormatException);
                            } finally {
                                inflater.end();
                            }
                        }
                        case b: {
                            throw new r("BZLIB2");
                        }
                        case c: {
                            throw new r("LZO");
                        }
                        default: {
                            throw new r();
                        }
                    }
                }
            }
        }
        ++this.b;
        this.d = 0;
    }

    private void a(byte[] byArray, int n2, int n3) {
        if (h.a(this.in, byArray, n2, n3) < n3) {
            throw new n();
        }
    }

    public final long c() {
        return this.f;
    }
}

