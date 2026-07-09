/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.a.a;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.a.a.a;
import org.bouncycastle.a.a.e;

public final class b
extends InputStream
implements a {
    private int b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private e h = new e();
    private boolean[] i = new boolean[256];
    private int j;
    private char[] k = new char[256];
    private char[] l = new char[256];
    private char[] m = new char[18002];
    private char[] n = new char[18002];
    private int[] o = null;
    private char[] p = null;
    private int[] q = new int[256];
    private int[][] r = new int[6][258];
    private int[][] s = new int[6][258];
    private int[][] t = new int[6][258];
    private int[] u = new int[6];
    private InputStream v;
    private boolean w = false;
    private int x = -1;
    private int y = 1;
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J = 0;
    private int K = 0;
    private int L;
    private char M;

    private static void a() {
        System.out.println("CRC Error");
    }

    public b(InputStream inputStream) {
        InputStream inputStream2 = inputStream;
        inputStream = this;
        this.v = inputStream2;
        ((b)inputStream).g = 0;
        ((b)inputStream).f = 0;
        inputStream = this;
        char c2 = (char)((b)inputStream).a(8);
        int n2 = super.a(8);
        if (c2 != 'B' && n2 != 90) {
            throw new IOException("Not a BZIP2 marked stream");
        }
        c2 = (char)super.a(8);
        n2 = (char)super.a(8);
        if (c2 != 'h' || n2 < 49 || n2 > 57) {
            ((b)inputStream).w = true;
        } else {
            InputStream inputStream3 = inputStream;
            ((b)inputStream).d = n2 -= 48;
            if (n2 != 0) {
                ((b)inputStream3).p = new char[n2 *= 100000];
                ((b)inputStream3).o = new int[n2];
            }
            ((b)inputStream).C = 0;
        }
        this.b();
        this.i();
    }

    public final int read() {
        if (this.w) {
            return -1;
        }
        int n2 = this.x;
        switch (this.y) {
            case 1: {
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                b b2 = this;
                if (b2.G != b2.F) {
                    b2.y = 2;
                    b2.E = 1;
                    b2.j();
                    break;
                }
                ++b2.E;
                if (b2.E >= 4) {
                    b2.M = b2.p[b2.I];
                    b2.I = b2.o[b2.I];
                    if (b2.J == 0) {
                        b2.J = a[b2.K];
                        ++b2.K;
                        if (b2.K == 512) {
                            b2.K = 0;
                        }
                    }
                    --b2.J;
                    b2.M = (char)(b2.M ^ (b2.J == 1 ? (char)'\u0001' : '\u0000'));
                    b2.L = 0;
                    b2.y = 4;
                    b2.l();
                    break;
                }
                b2.y = 2;
                b2.j();
                break;
            }
            case 4: {
                this.l();
                break;
            }
            case 5: {
                break;
            }
            case 6: {
                b b3 = this;
                if (b3.G != b3.F) {
                    b3.y = 5;
                    b3.E = 1;
                    b3.k();
                    break;
                }
                ++b3.E;
                if (b3.E >= 4) {
                    b3.M = b3.p[b3.I];
                    b3.I = b3.o[b3.I];
                    b3.y = 7;
                    b3.L = 0;
                    b3.m();
                    break;
                }
                b3.y = 5;
                b3.k();
                break;
            }
            case 7: {
                this.m();
            }
        }
        return n2;
    }

    private void b() {
        char c2 = (char)this.a(8);
        char c3 = (char)this.a(8);
        char c4 = (char)this.a(8);
        char c5 = (char)this.a(8);
        char c6 = (char)this.a(8);
        char c7 = (char)this.a(8);
        if (c2 == '\u0017' && c3 == 'r' && c4 == 'E' && c5 == '8' && c6 == 'P' && c7 == '\u0090') {
            this.d();
            return;
        }
        if (c2 != '1' || c3 != 'A' || c4 != 'Y' || c5 != '&' || c6 != 'S' || c7 != 'Y') {
            org.bouncycastle.a.a.b.a();
            this.w = true;
            return;
        }
        this.z = this.f();
        this.e = this.a(1) == 1;
        this.h();
        this.h.a = -1;
        this.y = 1;
    }

    private void c() {
        this.B = ~this.h.a;
        if (this.z != this.B) {
            org.bouncycastle.a.a.b.a();
        }
        this.C = this.C << 1 | this.C >>> 31;
        this.C ^= this.B;
    }

    private void d() {
        this.A = this.f();
        if (this.A != this.C) {
            org.bouncycastle.a.a.b.a();
        }
        this.e();
        this.w = true;
    }

    private void e() {
        try {
            if (this.v != null && this.v != System.in) {
                this.v.close();
                this.v = null;
            }
            return;
        } catch (IOException iOException) {
            return;
        }
    }

    private int a(int n2) {
        char c2;
        while (this.g < n2) {
            c2 = '\u0000';
            try {
                c2 = (char)this.v.read();
            } catch (IOException iOException) {
                org.bouncycastle.a.a.b.a();
            }
            if (c2 == '\uffffffff') {
                org.bouncycastle.a.a.b.a();
            }
            this.f = this.f << 8 | c2 & 0xFF;
            this.g += 8;
        }
        c2 = (char)(this.f >> this.g - n2 & (1 << n2) - 1);
        this.g -= n2;
        return c2;
    }

    private int f() {
        return (((0 | this.a(8)) << 8 | this.a(8)) << 8 | this.a(8)) << 8 | this.a(8);
    }

    private void g() {
        int n2;
        int n3;
        int n4;
        int n5;
        char[][] cArray = new char[6][258];
        boolean[] blArray = new boolean[16];
        for (n5 = 0; n5 < 16; ++n5) {
            blArray[n5] = this.a(1) == 1;
        }
        for (n5 = 0; n5 < 256; ++n5) {
            this.i[n5] = false;
        }
        for (n5 = 0; n5 < 16; ++n5) {
            if (!blArray[n5]) continue;
            for (n4 = 0; n4 < 16; ++n4) {
                if (this.a(1) != 1) continue;
                this.i[(n5 << 4) + n4] = true;
            }
        }
        b b2 = this;
        this.j = 0;
        for (int i2 = 0; i2 < 256; ++i2) {
            if (!b2.i[i2]) continue;
            b2.k[b2.j] = (char)i2;
            b2.l[i2] = (char)b2.j;
            ++b2.j;
        }
        int n6 = this.j + 2;
        int n7 = this.a(3);
        int n8 = this.a(15);
        for (n3 = 0; n3 < n8; ++n3) {
            n4 = 0;
            while (this.a(1) == 1) {
                ++n4;
            }
            this.n[n3] = (char)n4;
        }
        char[] cArray2 = new char[6];
        for (n2 = 0; n2 < n7; n2 = (int)((char)(n2 + 1))) {
            int n9 = n2;
            cArray2[n9] = n9;
        }
        for (n3 = 0; n3 < n8; ++n3) {
            n4 = cArray2[n2];
            for (n2 = this.n[n3]; n2 > 0; n2 = (int)((char)(n2 - 1))) {
                cArray2[n2] = cArray2[n2 - 1];
            }
            cArray2[0] = n4;
            this.m[n3] = n4;
        }
        for (n4 = 0; n4 < n7; ++n4) {
            int n10 = this.a(5);
            for (n3 = 0; n3 < n6; ++n3) {
                while (this.a(1) == 1) {
                    if (this.a(1) == 0) {
                        ++n10;
                        continue;
                    }
                    --n10;
                }
                cArray[n4][n3] = (char)n10;
            }
        }
        for (n4 = 0; n4 < n7; ++n4) {
            int n11;
            n8 = 32;
            char c2 = '\u0000';
            for (int i3 = 0; i3 < n6; ++i3) {
                if (cArray[n4][i3] > c2) {
                    c2 = cArray[n4][i3];
                }
                if (cArray[n4][i3] >= n8) continue;
                n8 = cArray[n4][i3];
            }
            int n12 = n6;
            char c3 = c2;
            int n13 = n8;
            char[] cArray3 = cArray[n4];
            int[] nArray = this.t[n4];
            int[] nArray2 = this.s[n4];
            int[] nArray3 = this.r[n4];
            int n14 = 0;
            for (n11 = n13; n11 <= c3; ++n11) {
                for (int i4 = 0; i4 < n12; ++i4) {
                    if (cArray3[i4] != n11) continue;
                    nArray[n14] = i4;
                    ++n14;
                }
            }
            for (n11 = 0; n11 < 23; ++n11) {
                nArray2[n11] = 0;
            }
            for (n11 = 0; n11 < n12; ++n11) {
                int n15 = cArray3[n11] + '\u0001';
                nArray2[n15] = nArray2[n15] + 1;
            }
            for (n11 = 1; n11 < 23; ++n11) {
                int n16 = n11;
                nArray2[n16] = nArray2[n16] + nArray2[n11 - 1];
            }
            for (n11 = 0; n11 < 23; ++n11) {
                nArray3[n11] = 0;
            }
            n2 = 0;
            for (n11 = n13; n11 <= c3; ++n11) {
                nArray3[n11] = (n2 += nArray2[n11 + 1] - nArray2[n11]) - 1;
                n2 <<= 1;
            }
            for (n11 = n13 + 1; n11 <= c3; ++n11) {
                nArray2[n11] = (nArray3[n11 - 1] + 1 << 1) - nArray2[n11];
            }
            this.u[n4] = n8;
        }
    }

    private void h() {
        int n2;
        int n3;
        int n4;
        char[] cArray = new char[256];
        int n5 = 100000 * this.d;
        this.c = this.a(24);
        this.g();
        int n6 = this.j + 1;
        int n7 = -1;
        for (n4 = 0; n4 <= 255; ++n4) {
            this.q[n4] = 0;
        }
        n4 = 0;
        while (n4 <= 255) {
            int n8 = n4++;
            cArray[n8] = (char)n8;
        }
        this.b = -1;
        ++n7;
        int n9 = 50;
        --n9;
        int n10 = this.m[0];
        int n11 = this.u[n10];
        int n12 = this.a(n11);
        while (n12 > this.r[n10][n11]) {
            ++n11;
            while (this.g <= 0) {
                n3 = 0;
                try {
                    n3 = this.v.read();
                } catch (IOException iOException) {
                    org.bouncycastle.a.a.b.a();
                }
                if (n3 == -1) {
                    org.bouncycastle.a.a.b.a();
                }
                n2 = n3;
                this.f = this.f << 8 | n2 & 0xFF;
                this.g += 8;
            }
            n4 = this.f >> this.g - 1 & 1;
            --this.g;
            n12 = n12 << 1 | n4;
        }
        n4 = this.t[n10][n12 - this.s[n10][n11]];
        while (n4 != n6) {
            if (n4 == 0 || n4 == 1) {
                n11 = -1;
                n12 = 1;
                do {
                    if (n4 == 0) {
                        n11 += 1 * n12;
                    } else if (n4 == 1) {
                        n11 += 2 * n12;
                    }
                    n12 <<= 1;
                    if (n9 == 0) {
                        ++n7;
                        n9 = 50;
                    }
                    --n9;
                    n4 = this.m[n7];
                    n2 = this.u[n4];
                    n3 = this.a(n2);
                    while (n3 > this.r[n4][n2]) {
                        ++n2;
                        while (this.g <= 0) {
                            n10 = 0;
                            try {
                                n10 = (char)this.v.read();
                            } catch (IOException iOException) {
                                org.bouncycastle.a.a.b.a();
                            }
                            if (n10 == -1) {
                                org.bouncycastle.a.a.b.a();
                            }
                            this.f = this.f << 8 | n10 & 0xFF;
                            this.g += 8;
                        }
                        n10 = this.f >> this.g - 1 & 1;
                        --this.g;
                        n3 = n3 << 1 | n10;
                    }
                } while ((n4 = this.t[n4][n3 - this.s[n4][n2]]) == 0 || n4 == 1);
                int n13 = n10 = this.k[cArray[0]];
                this.q[n13] = this.q[n13] + ++n11;
                while (n11 > 0) {
                    ++this.b;
                    this.p[this.b] = n10;
                    --n11;
                }
                if (this.b < n5) continue;
                org.bouncycastle.a.a.b.a();
                continue;
            }
            ++this.b;
            if (this.b >= n5) {
                org.bouncycastle.a.a.b.a();
            }
            n10 = cArray[n4 - 1];
            char c2 = this.k[n10];
            this.q[c2] = this.q[c2] + 1;
            this.p[this.b] = this.k[n10];
            --n4;
            while (n4 > 3) {
                cArray[n4] = cArray[n4 - 1];
                cArray[n4 - 1] = cArray[n4 - 2];
                cArray[n4 - 2] = cArray[n4 - 3];
                cArray[n4 - 3] = cArray[n4 - 4];
                n4 -= 4;
            }
            while (n4 > 0) {
                cArray[n4] = cArray[n4 - 1];
                --n4;
            }
            cArray[0] = n10;
            if (n9 == 0) {
                ++n7;
                n9 = 50;
            }
            --n9;
            n11 = this.m[n7];
            n12 = this.u[n11];
            n4 = this.a(n12);
            while (n4 > this.r[n11][n12]) {
                ++n12;
                while (this.g <= 0) {
                    n10 = 0;
                    try {
                        n10 = (char)this.v.read();
                    } catch (IOException iOException) {
                        org.bouncycastle.a.a.b.a();
                    }
                    n3 = n10;
                    this.f = this.f << 8 | n3 & 0xFF;
                    this.g += 8;
                }
                n2 = this.f >> this.g - 1 & 1;
                --this.g;
                n4 = n4 << 1 | n2;
            }
            n4 = this.t[n11][n4 - this.s[n11][n12]];
        }
    }

    private void i() {
        int[] nArray = new int[257];
        int[] nArray2 = nArray;
        nArray[0] = 0;
        this.H = 1;
        while (this.H <= 256) {
            nArray2[this.H] = this.q[this.H - 1];
            ++this.H;
        }
        this.H = 1;
        while (this.H <= 256) {
            int n2 = this.H;
            nArray2[n2] = nArray2[n2] + nArray2[this.H - 1];
            ++this.H;
        }
        this.H = 0;
        while (this.H <= this.b) {
            char c2 = this.p[this.H];
            this.o[nArray2[c2]] = this.H++;
            char c3 = c2;
            nArray2[c3] = nArray2[c3] + 1;
        }
        this.I = this.o[this.c];
        this.E = 0;
        this.D = 0;
        this.G = 256;
        if (this.e) {
            this.J = 0;
            this.K = 0;
            this.j();
            return;
        }
        this.k();
    }

    private void j() {
        if (this.D <= this.b) {
            this.F = this.G;
            this.G = this.p[this.I];
            this.I = this.o[this.I];
            if (this.J == 0) {
                this.J = a[this.K];
                ++this.K;
                if (this.K == 512) {
                    this.K = 0;
                }
            }
            --this.J;
            this.G ^= this.J == 1 ? 1 : 0;
            ++this.D;
            this.x = this.G;
            this.y = 3;
            this.h.a(this.G);
            return;
        }
        this.c();
        this.b();
        this.i();
    }

    private void k() {
        if (this.D <= this.b) {
            this.F = this.G;
            this.G = this.p[this.I];
            this.I = this.o[this.I];
            ++this.D;
            this.x = this.G;
            this.y = 6;
            this.h.a(this.G);
            return;
        }
        this.c();
        this.b();
        this.i();
    }

    private void l() {
        if (this.L < this.M) {
            this.x = this.G;
            this.h.a(this.G);
            ++this.L;
            return;
        }
        this.y = 2;
        ++this.D;
        this.E = 0;
        this.j();
    }

    private void m() {
        if (this.L < this.M) {
            this.x = this.G;
            this.h.a(this.G);
            ++this.L;
            return;
        }
        this.y = 5;
        ++this.D;
        this.E = 0;
        this.k();
    }
}

