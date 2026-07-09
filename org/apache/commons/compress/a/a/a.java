/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.a.a;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.apache.commons.compress.a.a.b;
import org.apache.commons.compress.a.a.c;
import org.apache.commons.compress.a.a.d;
import org.apache.commons.compress.b.f;

public final class a
extends org.apache.commons.compress.a.a {
    private int a;
    private int b;
    private int c;
    private boolean d;
    private final c e = new c();
    private int f;
    private org.apache.commons.compress.b.b g;
    private final boolean h;
    private int i = 1;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private char v;
    private b w;

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    private a(InputStream inputStream, byte by2) {
        this.g = new org.apache.commons.compress.b.b(inputStream == System.in ? new f(inputStream) : inputStream, ByteOrder.BIG_ENDIAN);
        this.h = false;
        inputStream = this;
        if (((a)inputStream).g == null) {
            throw new IOException("No InputStream");
        }
        by2 = (byte)((a)inputStream).g.a(8);
        int n2 = (int)((a)inputStream).g.a(8);
        int n3 = (int)((a)inputStream).g.a(8);
        if (by2 != 66 || n2 != 90 || n3 != 104) {
            throw new IOException("Stream is not in the BZip2 format");
        }
        int n4 = (int)((a)inputStream).g.a(8);
        by2 = (byte)n4;
        if (n4 < 49 || by2 > 57) {
            throw new IOException("BZip2 block size is invalid");
        }
        ((a)inputStream).c = by2 - 48;
        ((a)inputStream).m = 0;
        this.b();
    }

    @Override
    public final int read() {
        if (this.g != null) {
            int n2 = this.a();
            this.a(n2 < 0 ? -1 : 1);
            return n2;
        }
        throw new IOException("stream closed");
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        int n4;
        if (n2 < 0) {
            throw new IndexOutOfBoundsException("offs(" + n2 + ") < 0.");
        }
        if (n3 < 0) {
            throw new IndexOutOfBoundsException("len(" + n3 + ") < 0.");
        }
        if (n2 + n3 > byArray.length) {
            throw new IndexOutOfBoundsException("offs(" + n2 + ") + len(" + n3 + ") > dest.length(" + byArray.length + ").");
        }
        if (this.g == null) {
            throw new IOException("stream closed");
        }
        if (n3 == 0) {
            return 0;
        }
        n3 = n2 + n3;
        int n5 = n2;
        while (n5 < n3 && (n4 = this.a()) >= 0) {
            byArray[n5++] = (byte)n4;
            this.a(1);
        }
        if (n5 == n2) {
            return -1;
        }
        return n5 - n2;
    }

    private int a() {
        switch (this.i) {
            case 0: {
                return -1;
            }
            case 1: {
                return this.e();
            }
            case 2: {
                throw new IllegalStateException();
            }
            case 3: {
                return this.h();
            }
            case 4: {
                return this.i();
            }
            case 5: {
                throw new IllegalStateException();
            }
            case 6: {
                return this.j();
            }
            case 7: {
                return this.k();
            }
        }
        throw new IllegalStateException();
    }

    private void b() {
        Closeable closeable = this.g;
        char c2 = (char)org.apache.commons.compress.a.a.a.a(closeable, 8);
        char c3 = (char)org.apache.commons.compress.a.a.a.a(closeable, 8);
        char c4 = (char)org.apache.commons.compress.a.a.a.a(closeable, 8);
        char c5 = (char)org.apache.commons.compress.a.a.a.a(closeable, 8);
        char c6 = (char)org.apache.commons.compress.a.a.a.a(closeable, 8);
        char c7 = (char)org.apache.commons.compress.a.a.a.a(closeable, 8);
        if (c2 == '\u0017' && c3 == 'r' && c4 == 'E' && c5 == '8' && c6 == 'P' && c7 == '\u0090') {
            closeable = this;
            ((a)closeable).k = org.apache.commons.compress.a.a.a.a(((a)closeable).g, 32);
            ((a)closeable).i = 0;
            ((a)closeable).w = null;
            if (((a)closeable).k != ((a)closeable).m) {
                throw new IOException("BZip2 CRC error");
            }
            return;
        }
        if (c2 != '1' || c3 != 'A' || c4 != 'Y' || c5 != '&' || c6 != 'S' || c7 != 'Y') {
            this.i = 0;
            throw new IOException("bad block header");
        }
        this.j = org.apache.commons.compress.a.a.a.a(closeable, 32);
        boolean bl2 = this.d = org.apache.commons.compress.a.a.a.a(closeable, 1) == 1;
        if (this.w == null) {
            this.w = new b(this.c);
        }
        this.d();
        this.e.a();
        this.i = 1;
    }

    private void c() {
        this.l = this.e.b();
        if (this.j != this.l) {
            this.m = this.k << 1 | this.k >>> 31;
            this.m ^= this.j;
            throw new IOException("BZip2 CRC error");
        }
        this.m = this.m << 1 | this.m >>> 31;
        this.m ^= this.l;
    }

    @Override
    public final void close() {
        org.apache.commons.compress.b.b b2 = this.g;
        if (b2 != null) {
            try {
                b2.close();
                return;
            } finally {
                this.w = null;
                this.g = null;
            }
        }
    }

    private static int a(org.apache.commons.compress.b.b b2, int n2) {
        long l2 = b2.a(n2);
        if (l2 < 0L) {
            throw new IOException("unexpected end of stream");
        }
        return (int)l2;
    }

    private static boolean a(org.apache.commons.compress.b.b b2) {
        return org.apache.commons.compress.a.a.a.a(b2, 1) != 0;
    }

    private static void a(int n2, int n3, String string) {
        if (n2 < 0) {
            throw new IOException("Corrupted input, " + string + " value negative");
        }
        if (n2 >= n3) {
            throw new IOException("Corrupted input, " + string + " value too big");
        }
    }

    private void d() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        org.apache.commons.compress.b.b b2 = this.g;
        this.b = org.apache.commons.compress.a.a.a.a(b2, 24);
        a a2 = this;
        Object object = a2.g;
        b b3 = a2.w;
        Object[] objectArray = b3.a;
        byte[] byArray = b3.m;
        byte[] byArray2 = b3.c;
        byte[] byArray3 = b3.d;
        int n7 = 0;
        for (n6 = 0; n6 < 16; ++n6) {
            if (!org.apache.commons.compress.a.a.a.a((org.apache.commons.compress.b.b)object)) continue;
            n7 |= 1 << n6;
        }
        Arrays.fill(objectArray, false);
        for (n6 = 0; n6 < 16; ++n6) {
            if ((n7 & 1 << n6) == 0) continue;
            int n8 = n6 << 4;
            for (n5 = 0; n5 < 16; ++n5) {
                if (!org.apache.commons.compress.a.a.a.a((org.apache.commons.compress.b.b)object)) continue;
                objectArray[n8 + n5] = true;
            }
        }
        a a3 = a2;
        boolean[] blArray = a3.w.a;
        byte[] byArray4 = a3.w.b;
        n5 = 0;
        for (n4 = 0; n4 < 256; ++n4) {
            if (!blArray[n4]) continue;
            byArray4[n5++] = (byte)n4;
        }
        a3.f = n5;
        int n9 = a2.f + 2;
        int n10 = org.apache.commons.compress.a.a.a.a((org.apache.commons.compress.b.b)object, 3);
        n5 = org.apache.commons.compress.a.a.a.a((org.apache.commons.compress.b.b)object, 15);
        org.apache.commons.compress.a.a.a.a(n9, 259, "alphaSize");
        org.apache.commons.compress.a.a.a.a(n10, 7, "nGroups");
        org.apache.commons.compress.a.a.a.a(n5, 18003, "nSelectors");
        for (n3 = 0; n3 < n5; ++n3) {
            n4 = 0;
            while (org.apache.commons.compress.a.a.a.a((org.apache.commons.compress.b.b)object)) {
                ++n4;
            }
            byArray3[n3] = (byte)n4;
        }
        n3 = n10;
        while (--n3 >= 0) {
            int n11 = n3;
            byArray[n11] = (byte)n11;
        }
        for (n3 = 0; n3 < n5; ++n3) {
            org.apache.commons.compress.a.a.a.a(n4, 6, "selectorMtf");
            n2 = byArray[n4];
            for (n4 = byArray3[n3] & 0xFF; n4 > 0; --n4) {
                byArray[n4] = byArray[n4 - 1];
            }
            byArray[0] = n2;
            byArray2[n3] = n2;
        }
        Object object2 = b3.l;
        for (n4 = 0; n4 < n10; ++n4) {
            n2 = org.apache.commons.compress.a.a.a.a((org.apache.commons.compress.b.b)object, 5);
            char[] cArray = object2[n4];
            for (int i2 = 0; i2 < n9; ++i2) {
                while (org.apache.commons.compress.a.a.a.a((org.apache.commons.compress.b.b)object)) {
                    n2 += org.apache.commons.compress.a.a.a.a((org.apache.commons.compress.b.b)object) ? -1 : 1;
                }
                cArray[i2] = (char)n2;
            }
        }
        Object object3 = a2.w;
        Object object4 = ((b)object3).l;
        object2 = ((b)object3).i;
        Object object5 = ((b)object3).f;
        Object object6 = ((b)object3).g;
        object3 = ((b)object3).h;
        for (int i3 = 0; i3 < n10; ++i3) {
            int n12;
            int n13 = 32;
            int n14 = 0;
            Object[] objectArray2 = object4[i3];
            int n15 = n9;
            while (--n15 >= 0) {
                int n16 = objectArray2[n15];
                if (n16 > n14) {
                    n14 = n16;
                }
                if (n16 >= n13) continue;
                n13 = n16;
            }
            int n17 = n9;
            int n18 = n14;
            int n19 = n13;
            char[] cArray = object4[i3];
            Object object7 = object3[i3];
            objectArray2 = object6[i3];
            int[] nArray = object5[i3];
            int n20 = 0;
            for (n12 = n19; n12 <= n18; ++n12) {
                for (int i4 = 0; i4 < n17; ++i4) {
                    if (cArray[i4] != n12) continue;
                    object7[n20++] = i4;
                }
            }
            n12 = 23;
            while (--n12 > 0) {
                objectArray2[n12] = '\u0000';
                nArray[n12] = 0;
            }
            for (n12 = 0; n12 < n17; ++n12) {
                n20 = cArray[n12];
                org.apache.commons.compress.a.a.a.a(n20, 258, "length");
                int n21 = n20 + 1;
                objectArray2[n21] = objectArray2[n21] + '\u0001';
            }
            n20 = objectArray2[0];
            for (n12 = 1; n12 < 23; ++n12) {
                objectArray2[n12] = n20 += objectArray2[n12];
            }
            n20 = 0;
            char c2 = objectArray2[n12];
            for (n12 = n19; n12 <= n18; ++n12) {
                char c3 = objectArray2[n12 + 1];
                c2 = c3;
                nArray[n12] = (n20 += c3 - c2) - 1;
                n20 <<= 1;
            }
            for (n12 = n19 + 1; n12 <= n18; ++n12) {
                objectArray2[n12] = (nArray[n12 - 1] + 1 << 1) - objectArray2[n12];
            }
            object2[i3] = (char[])n13;
        }
        b b4 = this.w;
        object2 = b4;
        byte[] byArray5 = b4.o;
        int[] nArray = object2.e;
        object3 = object2.c;
        object4 = object2.b;
        object5 = object2.k;
        object6 = object2.i;
        int[][] nArray2 = object2.f;
        int[][] nArray3 = object2.g;
        object2 = object2.h;
        int n22 = this.c * 100000;
        int n23 = 256;
        while (--n23 >= 0) {
            int n24 = n23;
            object5[n24] = (int[])((char)n24);
            nArray[n23] = 0;
        }
        n23 = 0;
        int n25 = 49;
        int n26 = this.f + 1;
        a2 = this;
        object = a2.w;
        Object object8 = ((b)object).c[0] & 0xFF;
        org.apache.commons.compress.a.a.a.a(object8, 6, "zt");
        objectArray = ((b)object).f[object8];
        int n27 = ((b)object).i[object8];
        org.apache.commons.compress.a.a.a.a(n27, 258, "zn");
        int n28 = org.apache.commons.compress.a.a.a.a(a2.g, n27);
        while (n28 > objectArray[n27]) {
            org.apache.commons.compress.a.a.a.a(++n27, 258, "zn");
            n28 = n28 << 1 | org.apache.commons.compress.a.a.a.a(a2.g, 1);
        }
        Object object9 = n28 - ((b)object).g[object8][n27];
        org.apache.commons.compress.a.a.a.a(object9, 258, "zvec");
        int n29 = ((b)object).h[object8][object9];
        int n30 = -1;
        object8 = object3[0] & 0xFF;
        org.apache.commons.compress.a.a.a.a(object8, 6, "zt");
        objectArray = nArray3[object8];
        int[] nArray4 = nArray2[object8];
        char[] cArray = object2[object8];
        object8 = object6[object8];
        while (n29 != n26) {
            int n31;
            byte by2;
            Object object10;
            if (n29 == 0 || n29 == 1) {
                object9 = -1;
                object10 = 1;
                while (true) {
                    if (n29 == 0) {
                        object9 += object10;
                    } else {
                        if (n29 != 1) break;
                        object9 += object10 << 1;
                    }
                    if (n25 == 0) {
                        n25 = 49;
                        org.apache.commons.compress.a.a.a.a(++n23, 18002, "groupNo");
                        object8 = object3[n23] & 0xFF;
                        org.apache.commons.compress.a.a.a.a(object8, 6, "zt");
                        objectArray = nArray3[object8];
                        nArray4 = nArray2[object8];
                        cArray = object2[object8];
                        object8 = object6[object8];
                    } else {
                        --n25;
                    }
                    by2 = object8;
                    org.apache.commons.compress.a.a.a.a(by2, 258, "zn");
                    n31 = org.apache.commons.compress.a.a.a.a(b2, by2);
                    while (n31 > nArray4[by2]) {
                        org.apache.commons.compress.a.a.a.a(++by2, 258, "zn");
                        n31 = n31 << 1 | org.apache.commons.compress.a.a.a.a(b2, 1);
                    }
                    n29 = n31 - objectArray[by2];
                    org.apache.commons.compress.a.a.a.a(n29, 258, "zvec");
                    n29 = cArray[n29];
                    object10 <<= 1;
                }
                int[] nArray5 = object5[0];
                object10 = nArray5;
                org.apache.commons.compress.a.a.a.a((int)nArray5, 256, "yy");
                by2 = (byte)object4[object10];
                int n32 = by2 & 0xFF;
                nArray[n32] = nArray[n32] + (object9 + 1);
                n31 = ++n30;
                Arrays.fill(byArray5, n31, (n30 += object9) + 1, by2);
                if (n30 < n22) continue;
                throw new IOException("block overrun while expanding RLE in MTF, " + n30 + " exceeds " + n22);
            }
            if (++n30 >= n22) {
                throw new IOException("block overrun in MTF, " + n30 + " exceeds " + n22);
            }
            org.apache.commons.compress.a.a.a.a(n29, 257, "nextSym");
            int[] nArray6 = object5[n29 - 1];
            object9 = nArray6;
            org.apache.commons.compress.a.a.a.a((int)nArray6, 256, "yy");
            int n33 = object4[object9] & 0xFF;
            nArray[n33] = nArray[n33] + 1;
            byArray5[n30] = (byte)object4[object9];
            if (n29 <= 16) {
                object10 = n29 - 1;
                while (object10 > 0) {
                    object5[object10--] = object5[object10];
                }
            } else {
                System.arraycopy(object5, 0, object5, 1, n29 - 1);
            }
            object5[0] = (int[])object9;
            if (n25 == 0) {
                n25 = 49;
                org.apache.commons.compress.a.a.a.a(++n23, 18002, "groupNo");
                object8 = object3[n23] & 0xFF;
                org.apache.commons.compress.a.a.a.a(object8, 6, "zt");
                objectArray = nArray3[object8];
                nArray4 = nArray2[object8];
                cArray = object2[object8];
                object8 = object6[object8];
            } else {
                --n25;
            }
            object10 = object8;
            org.apache.commons.compress.a.a.a.a(object10, 258, "zn");
            by2 = (byte)org.apache.commons.compress.a.a.a.a(b2, object10);
            while (by2 > nArray4[object10]) {
                org.apache.commons.compress.a.a.a.a(++object10, 258, "zn");
                by2 = (byte)(by2 << 1 | org.apache.commons.compress.a.a.a.a(b2, 1));
            }
            n31 = by2 - objectArray[object10];
            org.apache.commons.compress.a.a.a.a(n31, 258, "zvec");
            n29 = cArray[n31];
        }
        this.a = n30;
    }

    private int e() {
        int n2;
        if (this.i == 0 || this.w == null) {
            return -1;
        }
        int[] nArray = this.w.j;
        int n3 = this.a + 1;
        int[] nArray2 = this.w.a(n3);
        byte[] byArray = this.w.o;
        nArray[0] = 0;
        System.arraycopy(this.w.e, 0, nArray, 1, 256);
        int n4 = nArray[0];
        for (n2 = 1; n2 <= 256; ++n2) {
            nArray[n2] = n4 += nArray[n2];
        }
        n2 = 0;
        n4 = this.a;
        while (n2 <= n4) {
            int n5;
            int n6 = byArray[n2] & 0xFF;
            nArray[n6] = nArray[n6] + 1;
            org.apache.commons.compress.a.a.a.a(n5, n3, "tt index");
            nArray2[n5] = n2++;
        }
        if (this.b < 0 || this.b >= nArray2.length) {
            throw new IOException("stream corrupted");
        }
        this.u = nArray2[this.b];
        this.n = 0;
        this.q = 0;
        this.o = 256;
        if (this.d) {
            this.s = 0;
            this.t = 0;
            return this.f();
        }
        return this.g();
    }

    private int f() {
        if (this.q <= this.a) {
            this.p = this.o;
            int n2 = this.w.o[this.u] & 0xFF;
            org.apache.commons.compress.a.a.a.a(this.u, this.w.n.length, "su_tPos");
            this.u = this.w.n[this.u];
            if (this.s == 0) {
                this.s = org.apache.commons.compress.a.a.d.a(this.t) - 1;
                if (++this.t == 512) {
                    this.t = 0;
                }
            } else {
                --this.s;
            }
            this.o = n2 ^= this.s == 1 ? 1 : 0;
            ++this.q;
            this.i = 3;
            this.e.a(n2);
            return n2;
        }
        this.c();
        this.b();
        return this.e();
    }

    private int g() {
        if (this.q <= this.a) {
            int n2;
            this.p = this.o;
            this.o = n2 = this.w.o[this.u] & 0xFF;
            org.apache.commons.compress.a.a.a.a(this.u, this.w.n.length, "su_tPos");
            this.u = this.w.n[this.u];
            ++this.q;
            this.i = 6;
            this.e.a(n2);
            return n2;
        }
        this.i = 5;
        this.c();
        this.b();
        return this.e();
    }

    private int h() {
        if (this.o != this.p) {
            this.i = 2;
            this.n = 1;
            return this.f();
        }
        if (++this.n >= 4) {
            this.v = (char)(this.w.o[this.u] & 0xFF);
            org.apache.commons.compress.a.a.a.a(this.u, this.w.n.length, "su_tPos");
            this.u = this.w.n[this.u];
            if (this.s == 0) {
                this.s = org.apache.commons.compress.a.a.d.a(this.t) - 1;
                if (++this.t == 512) {
                    this.t = 0;
                }
            } else {
                --this.s;
            }
            this.r = 0;
            this.i = 4;
            if (this.s == 1) {
                this.v = (char)(this.v ^ '\u0001');
            }
            return this.i();
        }
        this.i = 2;
        return this.f();
    }

    private int i() {
        if (this.r < this.v) {
            this.e.a(this.o);
            ++this.r;
            return this.o;
        }
        this.i = 2;
        ++this.q;
        this.n = 0;
        return this.f();
    }

    private int j() {
        if (this.o != this.p) {
            this.n = 1;
            return this.g();
        }
        if (++this.n >= 4) {
            org.apache.commons.compress.a.a.a.a(this.u, this.w.o.length, "su_tPos");
            this.v = (char)(this.w.o[this.u] & 0xFF);
            this.u = this.w.n[this.u];
            this.r = 0;
            return this.k();
        }
        return this.g();
    }

    private int k() {
        if (this.r < this.v) {
            int n2 = this.o;
            this.e.a(n2);
            ++this.r;
            this.i = 7;
            return n2;
        }
        ++this.q;
        this.n = 0;
        return this.g();
    }
}

