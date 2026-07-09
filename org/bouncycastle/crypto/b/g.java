/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.b;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.crypto.b.a;
import org.bouncycastle.e.f;

public final class g
extends a {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int[] i = new int[64];
    private int j;
    private static int[] k = new int[]{1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    public g() {
        this.c();
    }

    private g(g g2) {
        super(g2);
        this.a(g2);
    }

    private void a(g g2) {
        super.a(g2);
        this.a = g2.a;
        this.b = g2.b;
        this.c = g2.c;
        this.d = g2.d;
        this.e = g2.e;
        this.f = g2.f;
        this.g = g2.g;
        this.h = g2.h;
        System.arraycopy(g2.i, 0, this.i, 0, g2.i.length);
        this.j = g2.j;
    }

    public final String a() {
        return "SHA-256";
    }

    public final int b() {
        return 32;
    }

    protected final void b(byte[] byArray, int n2) {
        int n3;
        this.i[this.j] = n3 = byArray[n2] << 24 | (byArray[++n2] & 0xFF) << 16 | (byArray[++n2] & 0xFF) << 8 | byArray[++n2] & 0xFF;
        if (++this.j == 16) {
            this.f();
        }
    }

    protected final void a(long l2) {
        if (this.j > 14) {
            this.f();
        }
        this.i[14] = (int)(l2 >>> 32);
        this.i[15] = (int)l2;
    }

    public final int a(byte[] byArray, int n2) {
        this.e();
        ab.a(this.a, byArray, n2);
        ab.a(this.b, byArray, n2 + 4);
        ab.a(this.c, byArray, n2 + 8);
        ab.a(this.d, byArray, n2 + 12);
        ab.a(this.e, byArray, n2 + 16);
        ab.a(this.f, byArray, n2 + 20);
        ab.a(this.g, byArray, n2 + 24);
        ab.a(this.h, byArray, n2 + 28);
        this.c();
        return 32;
    }

    public final void c() {
        super.c();
        this.a = 1779033703;
        this.b = -1150833019;
        this.c = 1013904242;
        this.d = -1521486534;
        this.e = 1359893119;
        this.f = -1694144372;
        this.g = 528734635;
        this.h = 1541459225;
        this.j = 0;
        for (int i2 = 0; i2 != this.i.length; ++i2) {
            this.i[i2] = 0;
        }
    }

    protected final void f() {
        int n2;
        int n3;
        for (n3 = 16; n3 <= 63; ++n3) {
            this.i[n3] = org.bouncycastle.crypto.b.g.d(this.i[n3 - 2]) + this.i[n3 - 7] + org.bouncycastle.crypto.b.g.c(this.i[n3 - 15]) + this.i[n3 - 16];
        }
        n3 = this.a;
        int n4 = this.b;
        int n5 = this.c;
        int n6 = this.d;
        int n7 = this.e;
        int n8 = this.f;
        int n9 = this.g;
        int n10 = this.h;
        int n11 = 0;
        for (n2 = 0; n2 < 8; ++n2) {
            n6 += (n10 += org.bouncycastle.crypto.b.g.b(n7) + org.bouncycastle.crypto.b.g.a(n7, n8, n9) + k[n11] + this.i[n11]);
            n10 += org.bouncycastle.crypto.b.g.a(n3) + org.bouncycastle.crypto.b.g.b(n3, n4, n5);
            n5 += (n9 += org.bouncycastle.crypto.b.g.b(n6) + org.bouncycastle.crypto.b.g.a(n6, n7, n8) + k[++n11] + this.i[n11]);
            n9 += org.bouncycastle.crypto.b.g.a(n10) + org.bouncycastle.crypto.b.g.b(n10, n3, n4);
            n4 += (n8 += org.bouncycastle.crypto.b.g.b(n5) + org.bouncycastle.crypto.b.g.a(n5, n6, n7) + k[++n11] + this.i[n11]);
            n8 += org.bouncycastle.crypto.b.g.a(n9) + org.bouncycastle.crypto.b.g.b(n9, n10, n3);
            n3 += (n7 += org.bouncycastle.crypto.b.g.b(n4) + org.bouncycastle.crypto.b.g.a(n4, n5, n6) + k[++n11] + this.i[n11]);
            n7 += org.bouncycastle.crypto.b.g.a(n8) + org.bouncycastle.crypto.b.g.b(n8, n9, n10);
            n10 += (n6 += org.bouncycastle.crypto.b.g.b(n3) + org.bouncycastle.crypto.b.g.a(n3, n4, n5) + k[++n11] + this.i[n11]);
            n6 += org.bouncycastle.crypto.b.g.a(n7) + org.bouncycastle.crypto.b.g.b(n7, n8, n9);
            n9 += (n5 += org.bouncycastle.crypto.b.g.b(n10) + org.bouncycastle.crypto.b.g.a(n10, n3, n4) + k[++n11] + this.i[n11]);
            n5 += org.bouncycastle.crypto.b.g.a(n6) + org.bouncycastle.crypto.b.g.b(n6, n7, n8);
            n8 += (n4 += org.bouncycastle.crypto.b.g.b(n9) + org.bouncycastle.crypto.b.g.a(n9, n10, n3) + k[++n11] + this.i[n11]);
            n4 += org.bouncycastle.crypto.b.g.a(n5) + org.bouncycastle.crypto.b.g.b(n5, n6, n7);
            n7 += (n3 += org.bouncycastle.crypto.b.g.b(n8) + org.bouncycastle.crypto.b.g.a(n8, n9, n10) + k[++n11] + this.i[n11]);
            n3 += org.bouncycastle.crypto.b.g.a(n4) + org.bouncycastle.crypto.b.g.b(n4, n5, n6);
            ++n11;
        }
        this.a += n3;
        this.b += n4;
        this.c += n5;
        this.d += n6;
        this.e += n7;
        this.f += n8;
        this.g += n9;
        this.h += n10;
        this.j = 0;
        for (n2 = 0; n2 < 16; ++n2) {
            this.i[n2] = 0;
        }
    }

    private static int a(int n2, int n3, int n4) {
        return n2 & n3 ^ ~n2 & n4;
    }

    private static int b(int n2, int n3, int n4) {
        return n2 & n3 ^ n2 & n4 ^ n3 & n4;
    }

    private static int a(int n2) {
        return (n2 >>> 2 | n2 << 30) ^ (n2 >>> 13 | n2 << 19) ^ (n2 >>> 22 | n2 << 10);
    }

    private static int b(int n2) {
        return (n2 >>> 6 | n2 << 26) ^ (n2 >>> 11 | n2 << 21) ^ (n2 >>> 25 | n2 << 7);
    }

    private static int c(int n2) {
        return (n2 >>> 7 | n2 << 25) ^ (n2 >>> 18 | n2 << 14) ^ n2 >>> 3;
    }

    private static int d(int n2) {
        return (n2 >>> 17 | n2 << 15) ^ (n2 >>> 19 | n2 << 13) ^ n2 >>> 10;
    }

    public final f g() {
        return new g(this);
    }

    public final void a(f f2) {
        f2 = (g)f2;
        this.a((g)f2);
    }
}

