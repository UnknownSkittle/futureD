/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.c;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.c;
import org.apache.commons.compress.archivers.g.as;
import org.apache.commons.compress.archivers.g.at;
import org.apache.commons.compress.b.h;

public final class b
extends c {
    private boolean a = false;
    private org.apache.commons.compress.archivers.c.a b;
    private long c = 0L;
    private boolean d = false;
    private final byte[] e = new byte[4096];
    private long f = 0L;
    private final InputStream g;
    private final byte[] h = new byte[2];
    private final byte[] i = new byte[4];
    private final byte[] j = new byte[6];
    private final int k;
    private final as l;
    private String m;

    public b(InputStream inputStream) {
        this(inputStream, "US-ASCII", 0);
    }

    public b(InputStream inputStream, String string) {
        this(inputStream, string, 0);
    }

    private b(InputStream inputStream, String string, byte by2) {
        this.g = inputStream;
        this.k = 512;
        this.m = string;
        this.l = at.a(string);
    }

    @Override
    public final int available() {
        this.c();
        if (this.d) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void close() {
        if (!this.a) {
            this.g.close();
            this.a = true;
        }
    }

    private void c() {
        if (this.a) {
            throw new IOException("Stream closed");
        }
    }

    private void b(int n2) {
        if (n2 > 0) {
            b b2 = this;
            b2.a(b2.i, 0, n2);
        }
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        this.c();
        if (n2 < 0 || n3 < 0 || n2 > byArray.length - n3) {
            throw new IndexOutOfBoundsException();
        }
        if (n3 == 0) {
            return 0;
        }
        if (this.b == null || this.d) {
            return -1;
        }
        if (this.c == this.b.b()) {
            b b2 = this;
            b2.b(b2.b.d());
            this.d = true;
            if (this.b.c() == 2 && this.f != this.b.a()) {
                throw new IOException("CRC Error. Occured at byte: " + this.b());
            }
            return -1;
        }
        if ((n3 = (int)Math.min((long)n3, this.b.b() - this.c)) < 0) {
            return -1;
        }
        n2 = this.a(byArray, n2, n3);
        if (this.b.c() == 2) {
            for (n3 = 0; n3 < n2; ++n3) {
                this.f += (long)(byArray[n3] & 0xFF);
                this.f &= 0xFFFFFFFFL;
            }
        }
        if (n2 > 0) {
            this.c += (long)n2;
        }
        return n2;
    }

    private final int a(byte[] byArray, int n2, int n3) {
        int n4 = org.apache.commons.compress.b.h.a(this.g, byArray, n2, n3);
        this.a(n4);
        if (n4 < n3) {
            throw new EOFException();
        }
        return n4;
    }

    private long a(int n2, boolean bl2) {
        byte[] byArray = new byte[n2];
        this.a(byArray, 0, byArray.length);
        return org.apache.commons.compress.archivers.c.a.a(byArray, bl2);
    }

    private long a(int n2, int n3) {
        byte[] byArray = new byte[n2];
        this.a(byArray, 0, byArray.length);
        return Long.parseLong(org.apache.commons.compress.b.a.a(byArray), n3);
    }

    private org.apache.commons.compress.archivers.c.a a(boolean bl2) {
        org.apache.commons.compress.archivers.c.a a2 = bl2 ? new org.apache.commons.compress.archivers.c.a(2) : new org.apache.commons.compress.archivers.c.a(1);
        a2.h(this.a(8, 16));
        long l2 = this.a(8, 16);
        if ((l2 & 0xF000L) != 0L) {
            a2.i(l2);
        }
        a2.o(this.a(8, 16));
        a2.g(this.a(8, 16));
        a2.j(this.a(8, 16));
        a2.n(this.a(8, 16));
        a2.f(this.a(8, 16));
        a2.d(this.a(8, 16));
        a2.e(this.a(8, 16));
        a2.l(this.a(8, 16));
        a2.m(this.a(8, 16));
        long l3 = this.a(8, 16);
        a2.b(this.a(8, 16));
        String string = this.c((int)l3);
        a2.a(string);
        if ((l2 & 0xF000L) == 0L && !string.equals("TRAILER!!!")) {
            throw new IOException("Mode 0 only allowed in the trailer. Found entry name: " + org.apache.commons.compress.b.a.b(string) + " Occured at byte: " + this.b());
        }
        this.b(a2.a(l3 - 1L));
        return a2;
    }

    private org.apache.commons.compress.archivers.c.a b(boolean bl2) {
        org.apache.commons.compress.archivers.c.a a2 = new org.apache.commons.compress.archivers.c.a(8);
        a2.c(this.a(2, bl2));
        a2.h(this.a(2, bl2));
        long l2 = this.a(2, bl2);
        if ((l2 & 0xF000L) != 0L) {
            a2.i(l2);
        }
        a2.o(this.a(2, bl2));
        a2.g(this.a(2, bl2));
        a2.j(this.a(2, bl2));
        a2.k(this.a(2, bl2));
        a2.n(this.a(4, bl2));
        long l3 = this.a(2, bl2);
        a2.f(this.a(4, bl2));
        String string = this.c((int)l3);
        a2.a(string);
        if ((l2 & 0xF000L) == 0L && !string.equals("TRAILER!!!")) {
            throw new IOException("Mode 0 only allowed in the trailer. Found entry: " + org.apache.commons.compress.b.a.b(string) + "Occured at byte: " + this.b());
        }
        this.b(a2.a(l3 - 1L));
        return a2;
    }

    private String c(int n2) {
        byte[] byArray = new byte[n2 - 1];
        this.a(byArray, 0, byArray.length);
        this.g.read();
        return this.l.a(byArray);
    }

    @Override
    public final long skip(long l2) {
        int n2;
        int n3;
        if (l2 < 0L) {
            throw new IllegalArgumentException("negative skip length");
        }
        this.c();
        int n4 = (int)Math.min(l2, Integer.MAX_VALUE);
        for (n2 = 0; n2 < n4; n2 += n3) {
            n3 = n4 - n2;
            if (n3 > 4096) {
                n3 = 4096;
            }
            b b2 = this;
            if ((n3 = b2.read(b2.e, 0, n3)) != -1) continue;
            this.d = true;
            break;
        }
        return n2;
    }

    @Override
    public final a a() {
        Object object;
        b b2 = this;
        b2.c();
        if (b2.b != null) {
            object = b2;
            while (((b)object).skip(Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            }
        }
        b b3 = b2;
        b3.a(b3.h, 0, 2);
        if (org.apache.commons.compress.archivers.c.a.a(b2.h, false) == 29127L) {
            b2.b = b2.b(false);
        } else if (org.apache.commons.compress.archivers.c.a.a(b2.h, true) == 29127L) {
            b2.b = b2.b(true);
        } else {
            System.arraycopy(b2.h, 0, b2.j, 0, 2);
            b b4 = b2;
            b4.a(b4.j, 2, 4);
            switch (object = org.apache.commons.compress.b.a.a(b2.j)) {
                case "070701": {
                    b2.b = b2.a(false);
                    break;
                }
                case "070702": {
                    b2.b = b2.a(true);
                    break;
                }
                case "070707": {
                    object = b2;
                    Object object2 = new org.apache.commons.compress.archivers.c.a(4);
                    ((org.apache.commons.compress.archivers.c.a)object2).c(super.a(6, 8));
                    ((org.apache.commons.compress.archivers.c.a)object2).h(super.a(6, 8));
                    long l2 = super.a(6, 8);
                    if ((l2 & 0xF000L) != 0L) {
                        ((org.apache.commons.compress.archivers.c.a)object2).i(l2);
                    }
                    ((org.apache.commons.compress.archivers.c.a)object2).o(super.a(6, 8));
                    ((org.apache.commons.compress.archivers.c.a)object2).g(super.a(6, 8));
                    ((org.apache.commons.compress.archivers.c.a)object2).j(super.a(6, 8));
                    ((org.apache.commons.compress.archivers.c.a)object2).k(super.a(6, 8));
                    ((org.apache.commons.compress.archivers.c.a)object2).n(super.a(11, 8));
                    long l3 = super.a(6, 8);
                    ((org.apache.commons.compress.archivers.c.a)object2).f(super.a(11, 8));
                    String string = super.c((int)l3);
                    ((org.apache.commons.compress.archivers.c.a)object2).a(string);
                    if ((l2 & 0xF000L) == 0L && !string.equals("TRAILER!!!")) {
                        throw new IOException("Mode 0 only allowed in the trailer. Found entry: " + org.apache.commons.compress.b.a.b(string) + " Occured at byte: " + ((c)object).b());
                    }
                    b2.b = object2;
                    break;
                }
                default: {
                    throw new IOException("Unknown magic [" + (String)object + "]. Occured at byte: " + b2.b());
                }
            }
        }
        b2.c = 0L;
        b2.d = false;
        b2.f = 0L;
        if (b2.b.getName().equals("TRAILER!!!")) {
            b2.d = true;
            b2.d();
            return null;
        }
        return b2.b;
    }

    private void d() {
        long l2;
        long l3;
        long l4 = this.b() % 512L;
        long l5 = l3 = l4 == 0L ? 0L : 512L - l4;
        while (l5 > 0L && (l2 = this.skip(512L - l4)) > 0L) {
            l5 = l3 - l2;
        }
    }

    public static boolean a(byte[] byArray, int n2) {
        if (n2 < 6) {
            return false;
        }
        if (byArray[0] == 113 && (byArray[1] & 0xFF) == 199) {
            return true;
        }
        if (byArray[1] == 113 && (byArray[0] & 0xFF) == 199) {
            return true;
        }
        if (byArray[0] != 48) {
            return false;
        }
        if (byArray[1] != 55) {
            return false;
        }
        if (byArray[2] != 48) {
            return false;
        }
        if (byArray[3] != 55) {
            return false;
        }
        if (byArray[4] != 48) {
            return false;
        }
        if (byArray[5] == 49) {
            return true;
        }
        if (byArray[5] == 50) {
            return true;
        }
        return byArray[5] == 55;
    }
}

