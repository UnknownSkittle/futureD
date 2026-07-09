/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.IOException;
import java.io.OutputStream;

public class g
extends OutputStream {
    private OutputStream a;
    private byte[] b;
    private int c;
    private int d;
    private int e;

    public g(OutputStream outputStream) {
        this.a = outputStream;
    }

    public g(OutputStream outputStream, byte by2) {
        this.a = outputStream;
        this.a(8, true, true, 0L);
    }

    public g(OutputStream outputStream, int n2, long l2) {
        this.a = outputStream;
        if (l2 > 0xFFFFFFFFL) {
            this.a(n2, false, true, 0L);
            this.c = 65536;
            this.b = new byte[this.c];
            this.d = 16;
            this.e = 0;
            return;
        }
        this.a(n2, false, false, l2);
    }

    public g(OutputStream outputStream, int n2, long l2, byte by2) {
        this.a = outputStream;
        this.a(n2, false, false, l2);
    }

    public g(OutputStream outputStream, int n2, byte[] byArray) {
        this.a = outputStream;
        this.a(n2, false, true, 0L);
        this.b = byArray;
        int n3 = this.b.length;
        this.d = 0;
        while (n3 != 1) {
            n3 >>>= 1;
            ++this.d;
        }
        if (this.d > 30) {
            throw new IOException("Buffer cannot be greater than 2^30 in length.");
        }
        this.c = 1 << this.d;
        this.e = 0;
    }

    private void a(long l2) {
        if (l2 < 192L) {
            this.a.write((byte)l2);
            return;
        }
        if (l2 <= 8383L) {
            this.a.write((byte)(((l2 -= 192L) >> 8 & 0xFFL) + 192L));
            this.a.write((byte)l2);
            return;
        }
        this.a.write(255);
        this.a.write((byte)(l2 >> 24));
        this.a.write((byte)(l2 >> 16));
        this.a.write((byte)(l2 >> 8));
        this.a.write((byte)l2);
    }

    private void a(int n2, boolean bl2, boolean bl3, long l2) {
        if (this.b != null) {
            this.a(true);
            this.b = null;
        }
        if (bl2) {
            n2 = 0x80 | n2 << 2;
            if (bl3) {
                this.write(n2 | 3);
                return;
            }
            if (l2 <= 255L) {
                this.write(n2);
                this.write((byte)l2);
                return;
            }
            if (l2 <= 65535L) {
                this.write(n2 | 1);
                this.write((byte)(l2 >> 8));
                this.write((byte)l2);
                return;
            }
            this.write(n2 | 2);
            this.write((byte)(l2 >> 24));
            this.write((byte)(l2 >> 16));
            this.write((byte)(l2 >> 8));
            this.write((byte)l2);
            return;
        }
        n2 = 0x80 | (0x40 | n2);
        this.write(n2);
        if (bl3) {
            this.e = 0;
            return;
        }
        this.a(l2);
    }

    private void a(boolean bl2) {
        if (bl2) {
            g g2 = this;
            g2.a(g2.e);
            this.a.write(this.b, 0, this.e);
        } else {
            this.a.write(0xE0 | this.d);
            this.a.write(this.b, 0, this.c);
        }
        this.e = 0;
    }

    public void write(int n2) {
        if (this.b != null) {
            byte by2 = (byte)n2;
            g g2 = this;
            if (g2.e == g2.c) {
                g2.a(false);
            }
            g2.b[g2.e++] = by2;
            return;
        }
        this.a.write(n2);
    }

    public void write(byte[] object, int n2, int n3) {
        if (this.b != null) {
            g g2 = this;
            int n4 = n3;
            n3 = n2;
            byte[] byArray = object;
            object = g2;
            if (g2.e == ((g)object).c) {
                super.a(false);
            }
            if (n4 <= ((g)object).c - ((g)object).e) {
                System.arraycopy(byArray, n3, ((g)object).b, ((g)object).e, n4);
                ((g)object).e += n4;
                return;
            }
            System.arraycopy(byArray, n3, ((g)object).b, ((g)object).e, ((g)object).c - ((g)object).e);
            n3 += ((g)object).c - ((g)object).e;
            n4 -= ((g)object).c - ((g)object).e;
            super.a(false);
            while (n4 > ((g)object).c) {
                System.arraycopy(byArray, n3, ((g)object).b, 0, ((g)object).c);
                n3 += ((g)object).c;
                n4 -= ((g)object).c;
                super.a(false);
            }
            System.arraycopy(byArray, n3, ((g)object).b, 0, n4);
            ((g)object).e += n4;
            return;
        }
        this.a.write((byte[])object, n2, n3);
    }

    final void a(int n2, byte[] byArray, boolean bl2) {
        this.a(n2, bl2, false, byArray.length);
        this.write(byArray);
    }

    public void flush() {
        this.a.flush();
    }

    public final void a() {
        if (this.b != null) {
            this.a(true);
            this.b = null;
        }
    }

    public void close() {
        this.a();
        this.a.flush();
        this.a.close();
    }
}

