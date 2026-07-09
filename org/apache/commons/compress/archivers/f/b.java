/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.f;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.c;
import org.apache.commons.compress.archivers.g.as;
import org.apache.commons.compress.archivers.g.at;
import org.apache.commons.compress.b.h;

public final class b
extends c {
    private final byte[] a = new byte[256];
    private final int b;
    private final int c;
    private boolean d;
    private long e;
    private long f;
    private final InputStream g;
    private org.apache.commons.compress.archivers.f.a h;
    private final as i;
    private String j;
    private Map<String, String> k = new HashMap<String, String>();

    public b(InputStream inputStream) {
        this(inputStream, 0);
    }

    public b(InputStream inputStream, String string) {
        this(inputStream, string, 0);
    }

    private b(InputStream inputStream, byte by2) {
        this(inputStream, null, 0);
    }

    private b(InputStream inputStream, String string, byte by2) {
        this.g = inputStream;
        this.d = false;
        this.j = string;
        this.i = at.a(string);
        this.b = 512;
        this.c = 10240;
    }

    @Override
    public final void close() {
        this.g.close();
    }

    @Override
    public final int available() {
        if (this.h()) {
            return 0;
        }
        if (this.e - this.f > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)(this.e - this.f);
    }

    @Override
    public final long skip(long l2) {
        if (l2 <= 0L || this.h()) {
            return 0L;
        }
        long l3 = this.e - this.f;
        long l4 = org.apache.commons.compress.b.h.a(this.g, Math.min(l2, l3));
        this.a(l4);
        this.f += l4;
        return l4;
    }

    @Override
    public final boolean markSupported() {
        return false;
    }

    @Override
    public final void mark(int n2) {
    }

    @Override
    public final synchronized void reset() {
    }

    public final org.apache.commons.compress.archivers.f.a c() {
        Object object;
        if (this.d) {
            return null;
        }
        if (this.h != null) {
            org.apache.commons.compress.b.h.a((InputStream)this, Long.MAX_VALUE);
            b b2 = this;
            object = b2;
            if (!b2.h() && object.e > 0L && object.e % 512L != 0L) {
                long l2 = (object.e / 512L + 1L << 9) - object.e;
                long l3 = org.apache.commons.compress.b.h.a(object.g, l2);
                object.a(l3);
            }
        }
        if ((object = this.e()) == null) {
            this.h = null;
            return null;
        }
        try {
            this.h = new org.apache.commons.compress.archivers.f.a((byte[])object, this.i);
        } catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException("Error detected parsing the header", illegalArgumentException);
        }
        this.f = 0L;
        this.e = this.h.b();
        if (this.h.e()) {
            object = this.d();
            if (object == null) {
                return null;
            }
            this.h.b(this.i.a((byte[])object));
        }
        if (this.h.f()) {
            object = this.d();
            if (object == null) {
                return null;
            }
            this.h.a(this.i.a((byte[])object));
        }
        if (this.h.h()) {
            b b3 = this;
            object = b3;
            b3.k = b3.a(b3);
            object.a();
        }
        if (this.h.g()) {
            b b4 = this;
            object = b4;
            Map<String, String> map = b4.a(b4);
            object.a();
            super.a(map);
        } else if (!this.k.isEmpty()) {
            b b5 = this;
            b5.a(b5.k);
        }
        if (this.h.d()) {
            this.g();
        }
        this.e = this.h.b();
        return this.h;
    }

    private byte[] d() {
        int n2;
        Object object = new ByteArrayOutputStream();
        while (true) {
            b b2 = this;
            n2 = b2.read(b2.a);
            if (n2 < 0) break;
            ((ByteArrayOutputStream)object).write(this.a, 0, n2);
        }
        this.a();
        if (this.h == null) {
            return null;
        }
        object = ((ByteArrayOutputStream)object).toByteArray();
        for (n2 = (v9644729).length; n2 > 0 && object[n2 - 1] == false; --n2) {
        }
        if (n2 != ((Object)object).length) {
            byte[] byArray = new byte[n2];
            System.arraycopy(object, 0, byArray, 0, n2);
            object = byArray;
        }
        return object;
    }

    private byte[] e() {
        byte[] byArray = this.f();
        this.d = org.apache.commons.compress.archivers.f.b.a(byArray);
        if (this.d && byArray != null) {
            this.i();
            this.j();
            byArray = null;
        }
        return byArray;
    }

    private static boolean a(byte[] byArray) {
        return byArray == null || org.apache.commons.compress.b.a.b(byArray);
    }

    private byte[] f() {
        byte[] byArray = new byte[512];
        int n2 = org.apache.commons.compress.b.h.a(this.g, byArray);
        this.a(n2);
        if (n2 != 512) {
            return null;
        }
        return byArray;
    }

    private Map<String, String> a(InputStream inputStream) {
        int n2;
        HashMap<String, String> hashMap = new HashMap<String, String>(this.k);
        block0: do {
            int n3 = 0;
            int n4 = 0;
            while ((n2 = inputStream.read()) != -1) {
                ++n4;
                if (n2 == 10) continue block0;
                if (n2 == 32) {
                    Object object = new ByteArrayOutputStream();
                    while ((n2 = inputStream.read()) != -1) {
                        ++n4;
                        if (n2 == 61) {
                            object = ((ByteArrayOutputStream)object).toString("UTF-8");
                            if ((n3 -= n4) == 1) {
                                hashMap.remove(object);
                                continue block0;
                            }
                            byte[] byArray = new byte[n3];
                            int n5 = org.apache.commons.compress.b.h.a(inputStream, byArray);
                            if (n5 != n3) {
                                throw new IOException("Failed to read Paxheader. Expected " + n3 + " bytes, read " + n5);
                            }
                            String string = new String(byArray, 0, n3 - 1, "UTF-8");
                            hashMap.put((String)object, string);
                            continue block0;
                        }
                        ((ByteArrayOutputStream)object).write((byte)n2);
                    }
                    continue block0;
                }
                n3 = n3 * 10 + (n2 - 48);
            }
        } while (n2 != -1);
        return hashMap;
    }

    private void a(Map<String, String> map) {
        this.h.a(map);
    }

    private void g() {
        if (this.h.c()) {
            byte[] byArray;
            do {
                if ((byArray = this.e()) != null) continue;
                this.h = null;
                return;
            } while (new org.apache.commons.compress.b.a(byArray).a());
        }
    }

    private boolean h() {
        return this.h != null && this.h.i();
    }

    @Override
    public final a a() {
        return this.c();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void i() {
        boolean bl2 = this.g.markSupported();
        if (bl2) {
            this.g.mark(512);
        }
        try {
            if (org.apache.commons.compress.archivers.f.b.a(this.f())) return;
            boolean bl3 = true;
            boolean bl4 = bl3;
            if (!bl4) return;
            if (!bl2) return;
        } catch (Throwable throwable) {
            if (!bl2) throw throwable;
            this.b(512L);
            this.g.reset();
            throw throwable;
        }
        this.b(512L);
        this.g.reset();
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        if (this.d || this.h() || this.f >= this.e) {
            return -1;
        }
        if (this.h == null) {
            throw new IllegalStateException("No current tar entry");
        }
        int n4 = this.g.read(byArray, n2, n3 = Math.min(n3, this.available()));
        if (n4 == -1) {
            if (n3 > 0) {
                throw new IOException("Truncated TAR archive");
            }
            this.d = true;
        } else {
            this.a(n4);
            this.f += (long)n4;
        }
        return n4;
    }

    @Override
    public final boolean a(a a2) {
        if (a2 instanceof org.apache.commons.compress.archivers.f.a) {
            return !((org.apache.commons.compress.archivers.f.a)a2).j();
        }
        return false;
    }

    private void j() {
        long l2 = this.b() % 10240L;
        if (l2 > 0L) {
            long l3 = org.apache.commons.compress.b.h.a(this.g, 10240L - l2);
            this.a(l3);
        }
    }

    public static boolean a(byte[] byArray, int n2) {
        if (n2 < 265) {
            return false;
        }
        if (org.apache.commons.compress.b.a.a("ustar\u0000", byArray, 257, 6) && org.apache.commons.compress.b.a.a("00", byArray, 263, 2)) {
            return true;
        }
        if (org.apache.commons.compress.b.a.a("ustar ", byArray, 257, 6) && (org.apache.commons.compress.b.a.a(" \u0000", byArray, 263, 2) || org.apache.commons.compress.b.a.a("0\u0000", byArray, 263, 2))) {
            return true;
        }
        return org.apache.commons.compress.b.a.a("ustar\u0000", byArray, 257, 6) && org.apache.commons.compress.b.a.a("\u0000\u0000", byArray, 263, 2);
    }
}

