/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.a.a;

import java.io.OutputStream;
import org.bouncycastle.a.a.a;
import org.bouncycastle.a.a.d;
import org.bouncycastle.a.a.e;

public class c
extends OutputStream
implements a {
    private boolean b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private e j = new e();
    private boolean[] k = new boolean[256];
    private int l;
    private char[] m = new char[256];
    private char[] n = new char[256];
    private char[] o = new char[18002];
    private char[] p = new char[18002];
    private char[] q = null;
    private int[] r = null;
    private int[] s = null;
    private short[] t;
    private int[] u = null;
    private int v;
    private int[] w = new int[258];
    private int x;
    private int y;
    private int z;
    private boolean A;
    private int B;
    private int C = -1;
    private int D = 0;
    private boolean E = false;
    private int F;
    private int G;
    private int H;
    private OutputStream I;
    private int[] J = new int[]{1, 4, 13, 40, 121, 364, 1093, 3280, 9841, 29524, 88573, 265720, 797161, 2391484};

    private static void b() {
        System.out.println("panic");
    }

    private void c() {
        this.l = 0;
        for (int i2 = 0; i2 < 256; ++i2) {
            if (!this.k[i2]) continue;
            this.m[this.l] = (char)i2;
            this.n[i2] = (char)this.l;
            ++this.l;
        }
    }

    public c(OutputStream outputStream) {
        this(outputStream, 0);
    }

    private c(OutputStream outputStream, byte by2) {
        outputStream.write(66);
        outputStream.write(90);
        OutputStream outputStream2 = outputStream;
        outputStream = this;
        this.I = outputStream2;
        ((c)outputStream).i = 0;
        ((c)outputStream).h = 0;
        ((c)outputStream).g = 0;
        this.x = 50;
        this.e = 9;
        outputStream = this;
        int n2 = 100000 * ((c)outputStream).e;
        ((c)outputStream).q = new char[n2 + 1 + 20];
        ((c)outputStream).r = new int[n2 + 20];
        ((c)outputStream).s = new int[n2];
        ((c)outputStream).u = new int[65537];
        ((c)outputStream).t = new short[2 * n2];
        outputStream = this;
        this.g = 0;
        ((c)outputStream).B = 0;
        super.a(104);
        super.a(48 + ((c)outputStream).e);
        ((c)outputStream).G = 0;
        this.e();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void write(int n2) {
        n2 = (n2 + 256) % 256;
        if (this.C != -1) {
            if (this.C == n2) {
                ++this.D;
                if (this.D <= 254) return;
                this.d();
                this.C = -1;
                this.D = 0;
                return;
            }
            this.d();
            this.D = 1;
            this.C = n2;
            return;
        }
        this.C = n2;
        ++this.D;
    }

    private void d() {
        while (true) {
            if (this.c < this.H) {
                this.k[this.C] = true;
                for (int i2 = 0; i2 < this.D; ++i2) {
                    this.j.a((char)this.C);
                }
                switch (this.D) {
                    case 1: {
                        ++this.c;
                        this.q[this.c + 1] = (char)this.C;
                        return;
                    }
                    case 2: {
                        ++this.c;
                        this.q[this.c + 1] = (char)this.C;
                        ++this.c;
                        this.q[this.c + 1] = (char)this.C;
                        return;
                    }
                    case 3: {
                        ++this.c;
                        this.q[this.c + 1] = (char)this.C;
                        ++this.c;
                        this.q[this.c + 1] = (char)this.C;
                        ++this.c;
                        this.q[this.c + 1] = (char)this.C;
                        return;
                    }
                }
                this.k[this.D - 4] = true;
                ++this.c;
                this.q[this.c + 1] = (char)this.C;
                ++this.c;
                this.q[this.c + 1] = (char)this.C;
                ++this.c;
                this.q[this.c + 1] = (char)this.C;
                ++this.c;
                this.q[this.c + 1] = (char)this.C;
                ++this.c;
                this.q[this.c + 1] = (char)(this.D - 4);
                return;
            }
            this.f();
            this.e();
        }
    }

    protected void finalize() {
        this.close();
        super.finalize();
    }

    public void close() {
        if (this.E) {
            return;
        }
        this.a();
        this.E = true;
        super.close();
        this.I.close();
    }

    public final void a() {
        if (this.b) {
            return;
        }
        if (this.D > 0) {
            this.d();
        }
        this.C = -1;
        this.f();
        this.g();
        this.b = true;
        this.flush();
    }

    public void flush() {
        super.flush();
        this.I.flush();
    }

    private void e() {
        this.j.a = -1;
        this.c = -1;
        for (int i2 = 0; i2 < 256; ++i2) {
            this.k[i2] = false;
        }
        this.H = 100000 * this.e - 20;
    }

    private void f() {
        this.F = ~this.j.a;
        this.G = this.G << 1 | this.G >>> 31;
        this.G ^= this.F;
        this.m();
        this.a(8, 49);
        this.a(8, 65);
        this.a(8, 89);
        this.a(8, 38);
        this.a(8, 83);
        this.a(8, 89);
        c c2 = this;
        c2.b(c2.F);
        if (this.f) {
            this.a(1, 1);
            ++this.B;
        } else {
            this.a(1, 0);
        }
        this.j();
    }

    private void g() {
        this.a(8, 23);
        this.a(8, 114);
        this.a(8, 69);
        this.a(8, 56);
        this.a(8, 80);
        this.a(8, 144);
        c c2 = this;
        c2.b(c2.G);
        this.h();
    }

    private void h() {
        while (this.i > 0) {
            int n2 = this.h >> 24;
            this.I.write(n2);
            this.h <<= 8;
            this.i -= 8;
            ++this.g;
        }
    }

    private void a(int n2, int n3) {
        while (this.i >= 8) {
            int n4 = this.h >> 24;
            this.I.write(n4);
            this.h <<= 8;
            this.i -= 8;
            ++this.g;
        }
        this.h |= n3 << 32 - this.i - n2;
        this.i += n2;
    }

    private void a(int n2) {
        this.a(8, n2);
    }

    private void b(int n2) {
        this.a(8, n2 >>> 24);
        this.a(8, n2 >> 16 & 0xFF);
        this.a(8, n2 >> 8 & 0xFF);
        this.a(8, n2 & 0xFF);
    }

    private void i() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        char[][] cArray = new char[6][258];
        int n12 = 0;
        int n13 = this.l + 2;
        for (n11 = 0; n11 < 6; ++n11) {
            for (n10 = 0; n10 < n13; ++n10) {
                cArray[n11][n10] = 15;
            }
        }
        if (this.v <= 0) {
            org.bouncycastle.a.a.c.b();
        }
        int n14 = this.v < 200 ? 2 : (this.v < 600 ? 3 : (this.v < 1200 ? 4 : (this.v < 2400 ? 5 : 6)));
        int n15 = n14;
        int n16 = this.v;
        int n17 = 0;
        while (n15 > 0) {
            int n18 = n16 / n15;
            n9 = n17 - 1;
            for (n8 = 0; n8 < n18 && n9 < n13 - 1; n8 += this.w[++n9]) {
            }
            if (n9 > n17 && n15 != n14 && n15 != 1 && (n14 - n15) % 2 == 1) {
                n8 -= this.w[n9];
                --n9;
            }
            for (n10 = 0; n10 < n13; ++n10) {
                cArray[n15 - 1][n10] = n10 >= n17 && n10 <= n9 ? 0 : 15;
            }
            --n15;
            n17 = n9 + 1;
            n16 -= n8;
        }
        int[][] nArray = new int[6][258];
        int[] nArray2 = new int[6];
        short[] sArray = new short[6];
        for (int i2 = 0; i2 < 4; ++i2) {
            for (n11 = 0; n11 < n14; ++n11) {
                nArray2[n11] = 0;
            }
            for (n11 = 0; n11 < n14; ++n11) {
                for (int i3 = 0; i3 < n13; ++i3) {
                    nArray[n11][i3] = 0;
                }
            }
            n12 = 0;
            n17 = 0;
            while (n17 < this.v) {
                int n19;
                n9 = n17 + 50 - 1;
                if (n9 >= this.v) {
                    n9 = this.v - 1;
                }
                for (n11 = 0; n11 < n14; ++n11) {
                    sArray[n11] = 0;
                }
                if (n14 == 6) {
                    n7 = 0;
                    n11 = 0;
                    n6 = 0;
                    n5 = 0;
                    n4 = 0;
                    n8 = 0;
                    for (n19 = n17; n19 <= n9; ++n19) {
                        n3 = this.t[n19];
                        n8 = (short)(n8 + cArray[0][n3]);
                        n4 = (short)(n4 + cArray[1][n3]);
                        n5 = (short)(n5 + cArray[2][n3]);
                        n6 = (short)(n6 + cArray[3][n3]);
                        n11 = (short)(n11 + cArray[4][n3]);
                        n7 = (short)(n7 + cArray[5][n3]);
                    }
                    sArray[0] = n8;
                    sArray[1] = n4;
                    sArray[2] = n5;
                    sArray[3] = n6;
                    sArray[4] = n11;
                    sArray[5] = n7;
                } else {
                    for (n19 = n17; n19 <= n9; ++n19) {
                        n8 = this.t[n19];
                        for (n11 = 0; n11 < n14; ++n11) {
                            int n20 = n11;
                            sArray[n20] = (short)(sArray[n20] + cArray[n11][n8]);
                        }
                    }
                }
                n19 = 999999999;
                n8 = -1;
                for (n11 = 0; n11 < n14; ++n11) {
                    if (sArray[n11] >= n19) continue;
                    n19 = sArray[n11];
                    n8 = n11;
                }
                int n21 = n8;
                nArray2[n21] = nArray2[n21] + 1;
                this.o[n12] = (char)n8;
                ++n12;
                for (n19 = n17; n19 <= n9; ++n19) {
                    int[] nArray3 = nArray[n8];
                    short s2 = this.t[n19];
                    nArray3[s2] = nArray3[s2] + 1;
                }
                n17 = n9 + 1;
            }
            block16: for (n11 = 0; n11 < n14; ++n11) {
                n9 = n13;
                int[] nArray4 = nArray[n11];
                char[] cArray2 = cArray[n11];
                int[] nArray5 = new int[260];
                int[] nArray6 = new int[516];
                int[] nArray7 = new int[516];
                for (n3 = 0; n3 < n9; ++n3) {
                    nArray6[n3 + 1] = (nArray4[n3] == 0 ? 1 : nArray4[n3]) << 8;
                }
                block18: while (true) {
                    n5 = n9;
                    n17 = 0;
                    nArray5[0] = 0;
                    nArray6[0] = 0;
                    nArray7[0] = -2;
                    for (n3 = 1; n3 <= n9; ++n3) {
                        nArray7[n3] = -1;
                        nArray5[++n17] = n3;
                        n8 = n17;
                        n4 = nArray5[n8];
                        while (nArray6[n4] < nArray6[nArray5[n8 >> 1]]) {
                            nArray5[n8] = nArray5[n8 >> 1];
                            n8 >>= 1;
                        }
                        nArray5[n8] = n4;
                    }
                    if (n17 >= 260) {
                        org.bouncycastle.a.a.c.b();
                    }
                    while (n17 > 1) {
                        n6 = nArray5[1];
                        nArray5[1] = nArray5[n17];
                        --n17;
                        n8 = 1;
                        n3 = nArray5[1];
                        while ((n4 = n8 << 1) <= n17) {
                            if (n4 < n17 && nArray6[nArray5[n4 + 1]] < nArray6[nArray5[n4]]) {
                                ++n4;
                            }
                            if (nArray6[n3] < nArray6[nArray5[n4]]) break;
                            nArray5[n8] = nArray5[n4];
                            n8 = n4;
                        }
                        nArray5[n8] = n3;
                        n7 = nArray5[1];
                        nArray5[1] = nArray5[n17];
                        --n17;
                        n8 = 1;
                        n3 = nArray5[1];
                        while ((n4 = n8 << 1) <= n17) {
                            if (n4 < n17 && nArray6[nArray5[n4 + 1]] < nArray6[nArray5[n4]]) {
                                ++n4;
                            }
                            if (nArray6[n3] < nArray6[nArray5[n4]]) break;
                            nArray5[n8] = nArray5[n4];
                            n8 = n4;
                        }
                        nArray5[n8] = n3;
                        nArray7[n6] = nArray7[n7] = ++n5;
                        nArray6[n5] = (nArray6[n6] & 0xFFFFFF00) + (nArray6[n7] & 0xFFFFFF00) | 1 + ((nArray6[n6] & 0xFF) > (nArray6[n7] & 0xFF) ? nArray6[n6] & 0xFF : nArray6[n7] & 0xFF);
                        nArray7[n5] = -1;
                        nArray5[++n17] = n5;
                        n8 = n17;
                        n4 = nArray5[n8];
                        while (nArray6[n4] < nArray6[nArray5[n8 >> 1]]) {
                            nArray5[n8] = nArray5[n8 >> 1];
                            n8 >>= 1;
                        }
                        nArray5[n8] = n4;
                    }
                    if (n5 >= 516) {
                        org.bouncycastle.a.a.c.b();
                    }
                    n4 = 0;
                    for (n3 = 1; n3 <= n9; ++n3) {
                        n17 = 0;
                        n8 = n3;
                        while (nArray7[n8] >= 0) {
                            n8 = nArray7[n8];
                            ++n17;
                        }
                        cArray2[n3 - 1] = (char)n17;
                        if (n17 <= 20) continue;
                        n4 = 1;
                    }
                    if (n4 == 0) continue block16;
                    n3 = 1;
                    while (true) {
                        if (n3 >= n9) continue block18;
                        n17 = nArray6[n3] >> 8;
                        n17 = 1 + n17 / 2;
                        nArray6[n3] = n17 << 8;
                        ++n3;
                    }
                    break;
                }
            }
        }
        if (n14 >= 8) {
            org.bouncycastle.a.a.c.b();
        }
        if (n12 >= 32768 || n12 > 18002) {
            org.bouncycastle.a.a.c.b();
        }
        Object object = new char[6];
        int n22 = 0;
        while (n22 < n14) {
            int n23 = n22++;
            object[n23] = (char)n23;
        }
        for (n22 = 0; n22 < n12; ++n22) {
            n4 = this.o[n22];
            n11 = 0;
            n6 = object[0];
            while (n4 != n6) {
                n5 = n6;
                n6 = object[++n11];
                object[n11] = n5;
            }
            object[0] = n6;
            this.p[n22] = (char)n11;
        }
        object = new int[6][258];
        for (n11 = 0; n11 < n14; ++n11) {
            n17 = 32;
            n9 = 0;
            for (int i4 = 0; i4 < n13; ++i4) {
                if (cArray[n11][i4] > n9) {
                    n9 = cArray[n11][i4];
                }
                if (cArray[n11][i4] >= n17) continue;
                n17 = cArray[n11][i4];
            }
            if (n9 > 20) {
                org.bouncycastle.a.a.c.b();
            }
            if (n17 <= 0) {
                org.bouncycastle.a.a.c.b();
            }
            n5 = n13;
            n4 = n9;
            n9 = n17;
            char[] cArray3 = cArray[n11];
            char c2 = object[n11];
            n7 = 0;
            for (n6 = n9; n6 <= n4; ++n6) {
                for (n3 = 0; n3 < n5; ++n3) {
                    if (cArray3[n3] != n6) continue;
                    c2[n3] = n7++;
                }
                n7 <<= 1;
            }
        }
        boolean[] blArray = new boolean[16];
        for (n2 = 0; n2 < 16; ++n2) {
            blArray[n2] = false;
            for (n11 = 0; n11 < 16; ++n11) {
                if (!this.k[(n2 << 4) + n11]) continue;
                blArray[n2] = true;
            }
        }
        for (n2 = 0; n2 < 16; ++n2) {
            if (blArray[n2]) {
                this.a(1, 1);
                continue;
            }
            this.a(1, 0);
        }
        for (n2 = 0; n2 < 16; ++n2) {
            if (!blArray[n2]) continue;
            for (n11 = 0; n11 < 16; ++n11) {
                if (this.k[(n2 << 4) + n11]) {
                    this.a(1, 1);
                    continue;
                }
                this.a(1, 0);
            }
        }
        this.a(3, n14);
        this.a(15, n12);
        for (n2 = 0; n2 < n12; ++n2) {
            for (n11 = 0; n11 < this.p[n2]; ++n11) {
                this.a(1, 1);
            }
            this.a(1, 0);
        }
        for (n11 = 0; n11 < n14; ++n11) {
            int n24 = cArray[n11][0];
            this.a(5, n24);
            for (n2 = 0; n2 < n13; ++n2) {
                while (n24 < cArray[n11][n2]) {
                    this.a(2, 2);
                    ++n24;
                }
                while (n24 > cArray[n11][n2]) {
                    this.a(2, 3);
                    --n24;
                }
                this.a(1, 0);
            }
        }
        n11 = 0;
        n17 = 0;
        while (n17 < this.v) {
            n9 = n17 + 50 - 1;
            if (n9 >= this.v) {
                n9 = this.v - 1;
            }
            for (n2 = n17; n2 <= n9; ++n2) {
                this.a(cArray[this.o[n11]][this.t[n2]], (int)object[this.o[n11]][this.t[n2]]);
            }
            n17 = n9 + 1;
            ++n11;
        }
        if (n11 != n12) {
            org.bouncycastle.a.a.c.b();
        }
    }

    private void j() {
        c c2 = this;
        int n2 = c2.d;
        c2.a(24, n2);
        this.n();
        this.i();
    }

    private void a(int n2, int n3, int n4) {
        int n5 = n3 - n2 + 1;
        if (n5 < 2) {
            return;
        }
        int n6 = 0;
        while (this.J[n6] < n5) {
            ++n6;
        }
        --n6;
        while (n6 >= 0) {
            int n7 = this.J[n6];
            for (n5 = n2 + n7; n5 <= n3; ++n5) {
                int n8 = this.s[n5];
                int n9 = n5;
                do {
                    c c2 = this;
                    if (!c2.b(c2.s[n9 - n7] + n4, n8 + n4)) break;
                    this.s[n9] = this.s[n9 - n7];
                } while ((n9 -= n7) > n2 + n7 - 1);
                this.s[n9] = n8;
                if (++n5 > n3) break;
                n8 = this.s[n5];
                n9 = n5;
                do {
                    c c3 = this;
                    if (!c3.b(c3.s[n9 - n7] + n4, n8 + n4)) break;
                    this.s[n9] = this.s[n9 - n7];
                } while ((n9 -= n7) > n2 + n7 - 1);
                this.s[n9] = n8;
                if (++n5 > n3) break;
                n8 = this.s[n5];
                n9 = n5;
                do {
                    c c4 = this;
                    if (!c4.b(c4.s[n9 - n7] + n4, n8 + n4)) break;
                    this.s[n9] = this.s[n9 - n7];
                } while ((n9 -= n7) > n2 + n7 - 1);
                this.s[n9] = n8;
                if (this.y <= this.z || !this.A) continue;
                return;
            }
            --n6;
        }
    }

    private void b(int n2, int n3, int n4) {
        while (n4 > 0) {
            int n5 = this.s[n2];
            this.s[n2] = this.s[n3];
            this.s[n3] = n5;
            ++n2;
            ++n3;
            --n4;
        }
    }

    private void k() {
        int n2;
        int n3;
        int n4;
        int[] nArray = new int[256];
        int[] nArray2 = new int[256];
        boolean[] blArray = new boolean[256];
        for (n4 = 0; n4 < 20; ++n4) {
            this.q[this.c + n4 + 2] = this.q[n4 % (this.c + 1) + 1];
        }
        for (n4 = 0; n4 <= this.c + 20; ++n4) {
            this.r[n4] = 0;
        }
        this.q[0] = this.q[this.c + 1];
        if (this.c < 4000) {
            n4 = 0;
            while (n4 <= this.c) {
                int n5 = n4++;
                this.s[n5] = n5;
            }
            this.A = false;
            c c2 = this;
            c2.z = 0;
            c2.y = 0;
            this.a(0, this.c, 0);
            return;
        }
        for (n4 = 0; n4 <= 255; ++n4) {
            blArray[n4] = false;
        }
        for (n4 = 0; n4 <= 65536; ++n4) {
            this.u[n4] = 0;
        }
        int n6 = this.q[0];
        for (n4 = 0; n4 <= this.c; ++n4) {
            n3 = this.q[n4 + 1];
            int n7 = (n6 << 8) + n3;
            this.u[n7] = this.u[n7] + 1;
            n6 = n3;
        }
        for (n4 = 1; n4 <= 65536; ++n4) {
            int n8 = n4;
            this.u[n8] = this.u[n8] + this.u[n4 - 1];
        }
        n6 = this.q[1];
        n4 = 0;
        while (n4 < this.c) {
            n3 = this.q[n4 + 2];
            n2 = (n6 << 8) + n3;
            n6 = n3;
            int n9 = n2;
            this.u[n9] = this.u[n9] - 1;
            this.s[this.u[n2]] = n4++;
        }
        int n10 = n2 = (this.q[this.c + 1] << 8) + this.q[1];
        this.u[n10] = this.u[n10] - 1;
        this.s[this.u[n2]] = this.c;
        n4 = 0;
        while (n4 <= 255) {
            int n11 = n4++;
            nArray[n11] = n11;
        }
        int n12 = 1;
        while ((n12 = 3 * n12 + 1) <= 256) {
        }
        do {
            for (n4 = n12 /= 3; n4 <= 255; ++n4) {
                int n13 = nArray[n4];
                n2 = n4;
                while (this.u[nArray[n2 - n12] + 1 << 8] - this.u[nArray[n2 - n12] << 8] > this.u[n13 + 1 << 8] - this.u[n13 << 8]) {
                    nArray[n2] = nArray[n2 - n12];
                    if ((n2 -= n12) > n12 - 1) continue;
                }
                nArray[n2] = n13;
            }
        } while (n12 != 1);
        for (n4 = 0; n4 <= 255; ++n4) {
            int n14;
            int n15;
            n3 = nArray[n4];
            for (n2 = 0; n2 <= 255; ++n2) {
                n6 = (n3 << 8) + n2;
                if ((this.u[n6] & 0x200000) == 0x200000) continue;
                n12 = (this.u[n6 + 1] & 0xFFDFFFFF) - 1;
                int n16 = this.u[n6] & 0xFFDFFFFF;
                if (n12 > n16) {
                    int n17;
                    n15 = n12;
                    n12 = n16;
                    c c3 = this;
                    d[] dArray = new d[1000];
                    for (n17 = 0; n17 < 1000; ++n17) {
                        dArray[n17] = new d(0);
                    }
                    int n18 = 0;
                    dArray[0].a = n12;
                    dArray[0].b = n15;
                    dArray[0].c = 2;
                    ++n18;
                    while (n18 > 0) {
                        int n19;
                        if (n18 >= 1000) {
                            org.bouncycastle.a.a.c.b();
                        }
                        int n20 = dArray[--n18].a;
                        int n21 = dArray[n18].b;
                        int n22 = dArray[n18].c;
                        if (n21 - n20 < 20 || n22 > 10) {
                            c3.a(n20, n21, n22);
                            if (c3.y <= c3.z || !c3.A) continue;
                            break;
                        }
                        n14 = c3.q[c3.s[n20 + n21 >> 1] + n22 + 1];
                        n12 = c3.q[c3.s[n20] + n22 + 1];
                        n15 = c3.q[c3.s[n21] + n22 + 1];
                        if (n12 > n15) {
                            n19 = n12;
                            n12 = n15;
                            n15 = n19;
                        }
                        if (n15 > n14) {
                            n15 = n14;
                        }
                        if (n12 > n15) {
                            n15 = n12;
                        }
                        int n23 = n15;
                        n12 = n14 = n20;
                        n15 = n19 = n21;
                        while (true) {
                            if (n12 <= n15) {
                                n17 = c3.q[c3.s[n12] + n22 + 1] - n23;
                                if (n17 == 0) {
                                    n17 = c3.s[n12];
                                    c3.s[n12] = c3.s[n14];
                                    c3.s[n14] = n17;
                                    ++n14;
                                    ++n12;
                                    continue;
                                }
                                if (n17 <= 0) {
                                    ++n12;
                                    continue;
                                }
                            }
                            while (n12 <= n15) {
                                n17 = c3.q[c3.s[n15] + n22 + 1] - n23;
                                if (n17 == 0) {
                                    n17 = c3.s[n15];
                                    c3.s[n15] = c3.s[n19];
                                    c3.s[n19] = n17;
                                    --n19;
                                    --n15;
                                    continue;
                                }
                                if (n17 < 0) break;
                                --n15;
                            }
                            if (n12 > n15) break;
                            n17 = c3.s[n12];
                            c3.s[n12] = c3.s[n15];
                            c3.s[n15] = n17;
                            ++n12;
                            --n15;
                        }
                        if (n19 < n14) {
                            dArray[n18].a = n20;
                            dArray[n18].b = n21;
                            dArray[n18].c = n22 + 1;
                            ++n18;
                            continue;
                        }
                        n17 = n14 - n20 < n12 - n14 ? n14 - n20 : n12 - n14;
                        c3.b(n20, n12 - n17, n17);
                        n23 = n21 - n19 < n19 - n15 ? n21 - n19 : n19 - n15;
                        c3.b(n12, n21 - n23 + 1, n23);
                        n17 = n20 + n12 - n14 - 1;
                        n23 = n21 - (n19 - n15) + 1;
                        dArray[n18].a = n20;
                        dArray[n18].b = n17;
                        dArray[n18].c = n22;
                        dArray[++n18].a = n17 + 1;
                        dArray[n18].b = n23 - 1;
                        dArray[n18].c = n22 + 1;
                        dArray[++n18].a = n23;
                        dArray[n18].b = n21;
                        dArray[n18].c = n22;
                        ++n18;
                    }
                    if (this.y > this.z && this.A) {
                        return;
                    }
                }
                int n24 = n6;
                this.u[n24] = this.u[n24] | 0x200000;
            }
            blArray[n3] = true;
            if (n4 < 255) {
                int n25 = this.u[n3 << 8] & 0xFFDFFFFF;
                n12 = (this.u[n3 + 1 << 8] & 0xFFDFFFFF) - n25;
                n6 = 0;
                while (n12 >> n6 > 65534) {
                    ++n6;
                }
                for (n2 = 0; n2 < n12; ++n2) {
                    n15 = this.s[n25 + n2];
                    this.r[n15] = n14 = n2 >> n6;
                    if (n15 >= 20) continue;
                    this.r[n15 + this.c + 1] = n14;
                }
                if (n12 - 1 >> n6 > 65535) {
                    org.bouncycastle.a.a.c.b();
                }
            }
            for (n2 = 0; n2 <= 255; ++n2) {
                nArray2[n2] = this.u[(n2 << 8) + n3] & 0xFFDFFFFF;
            }
            for (n2 = this.u[n3 << 8] & 0xFFDFFFFF; n2 < (this.u[n3 + 1 << 8] & 0xFFDFFFFF); ++n2) {
                n6 = this.q[this.s[n2]];
                if (blArray[n6]) continue;
                this.s[nArray2[n6]] = this.s[n2] == 0 ? this.c : this.s[n2] - 1;
                int n26 = n6;
                nArray2[n26] = nArray2[n26] + 1;
            }
            for (n2 = 0; n2 <= 255; ++n2) {
                int n27 = (n2 << 8) + n3;
                this.u[n27] = this.u[n27] | 0x200000;
            }
        }
    }

    private void l() {
        int n2;
        int n3 = 0;
        int n4 = 0;
        for (n2 = 0; n2 < 256; ++n2) {
            this.k[n2] = false;
        }
        for (n2 = 0; n2 <= this.c; ++n2) {
            if (n3 == 0) {
                n3 = (char)a[n4];
                if (++n4 == 512) {
                    n4 = 0;
                }
            }
            int n5 = n2 + 1;
            this.q[n5] = (char)(this.q[n5] ^ (--n3 == 1 ? (char)'\u0001' : '\u0000'));
            int n6 = n2 + 1;
            this.q[n6] = (char)(this.q[n6] & 0xFF);
            this.k[this.q[n2 + 1]] = true;
        }
    }

    private void m() {
        this.z = this.x * this.c;
        this.y = 0;
        this.f = false;
        this.A = true;
        this.k();
        if (this.y > this.z && this.A) {
            this.l();
            c c2 = this;
            c2.y = 0;
            c2.z = 0;
            this.f = true;
            this.A = false;
            this.k();
        }
        this.d = -1;
        for (int i2 = 0; i2 <= this.c; ++i2) {
            if (this.s[i2] != 0) continue;
            this.d = i2;
            break;
        }
        if (this.d == -1) {
            org.bouncycastle.a.a.c.b();
        }
    }

    private boolean b(int n2, int n3) {
        int n4 = this.q[n2 + 1];
        int n5 = this.q[n3 + 1];
        if (n4 != n5) {
            return n4 > n5;
        }
        if ((n4 = this.q[++n2 + 1]) != (n5 = this.q[++n3 + 1])) {
            return n4 > n5;
        }
        if ((n4 = this.q[++n2 + 1]) != (n5 = this.q[++n3 + 1])) {
            return n4 > n5;
        }
        if ((n4 = this.q[++n2 + 1]) != (n5 = this.q[++n3 + 1])) {
            return n4 > n5;
        }
        if ((n4 = this.q[++n2 + 1]) != (n5 = this.q[++n3 + 1])) {
            return n4 > n5;
        }
        if ((n4 = this.q[++n2 + 1]) != (n5 = this.q[++n3 + 1])) {
            return n4 > n5;
        }
        ++n2;
        ++n3;
        int n6 = this.c + 1;
        do {
            if ((n4 = this.q[n2 + 1]) != (n5 = this.q[n3 + 1])) {
                return n4 > n5;
            }
            n4 = this.r[n2];
            n5 = this.r[n3];
            if (n4 != n5) {
                return n4 > n5;
            }
            if ((n4 = this.q[++n2 + 1]) != (n5 = this.q[++n3 + 1])) {
                return n4 > n5;
            }
            n4 = this.r[n2];
            n5 = this.r[n3];
            if (n4 != n5) {
                return n4 > n5;
            }
            if ((n4 = this.q[++n2 + 1]) != (n5 = this.q[++n3 + 1])) {
                return n4 > n5;
            }
            n4 = this.r[n2];
            n5 = this.r[n3];
            if (n4 != n5) {
                return n4 > n5;
            }
            if ((n4 = this.q[++n2 + 1]) != (n5 = this.q[++n3 + 1])) {
                return n4 > n5;
            }
            n4 = this.r[n2];
            n5 = this.r[n3];
            if (n4 != n5) {
                return n4 > n5;
            }
            ++n3;
            if (++n2 > this.c) {
                n2 -= this.c;
                --n2;
            }
            if (n3 > this.c) {
                n3 -= this.c;
                --n3;
            }
            ++this.y;
        } while ((n6 -= 4) >= 0);
        return false;
    }

    private void n() {
        int n2;
        char[] cArray = new char[256];
        this.c();
        int n3 = this.l + 1;
        for (n2 = 0; n2 <= n3; ++n2) {
            this.w[n2] = 0;
        }
        int n4 = 0;
        int n5 = 0;
        n2 = 0;
        while (n2 < this.l) {
            int n6 = n2++;
            cArray[n6] = (char)n6;
        }
        for (n2 = 0; n2 <= this.c; ++n2) {
            char c2 = this.n[this.q[this.s[n2]]];
            int n7 = 0;
            char c3 = cArray[0];
            while (c2 != c3) {
                char c4 = c3;
                c3 = cArray[++n7];
                cArray[n7] = c4;
            }
            cArray[0] = c3;
            if (n7 == 0) {
                ++n5;
                continue;
            }
            if (n5 > 0) {
                --n5;
                while (true) {
                    switch (n5 % 2) {
                        case 0: {
                            this.t[n4] = 0;
                            ++n4;
                            this.w[0] = this.w[0] + 1;
                            break;
                        }
                        case 1: {
                            this.t[n4] = 1;
                            ++n4;
                            this.w[1] = this.w[1] + 1;
                        }
                    }
                    if (n5 < 2) break;
                    n5 = (n5 - 2) / 2;
                }
                n5 = 0;
            }
            this.t[n4] = (short)(n7 + 1);
            ++n4;
            int n8 = n7 + 1;
            this.w[n8] = this.w[n8] + 1;
        }
        if (n5 > 0) {
            --n5;
            while (true) {
                switch (n5 % 2) {
                    case 0: {
                        this.t[n4] = 0;
                        ++n4;
                        this.w[0] = this.w[0] + 1;
                        break;
                    }
                    case 1: {
                        this.t[n4] = 1;
                        ++n4;
                        this.w[1] = this.w[1] + 1;
                    }
                }
                if (n5 < 2) break;
                n5 = (n5 - 2) / 2;
            }
        }
        this.t[n4] = (short)n3;
        int n9 = n3;
        this.w[n9] = this.w[n9] + 1;
        this.v = ++n4;
    }
}

