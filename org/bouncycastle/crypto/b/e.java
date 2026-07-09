/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.b;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.crypto.b.a;
import org.bouncycastle.e.f;

public final class e
extends a {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int[] f = new int[80];
    private int g;

    public e() {
        this.c();
    }

    private e(e e2) {
        super(e2);
        this.a(e2);
    }

    private void a(e e2) {
        this.a = e2.a;
        this.b = e2.b;
        this.c = e2.c;
        this.d = e2.d;
        this.e = e2.e;
        System.arraycopy(e2.f, 0, this.f, 0, e2.f.length);
        this.g = e2.g;
    }

    public final String a() {
        return "SHA-1";
    }

    public final int b() {
        return 20;
    }

    protected final void b(byte[] byArray, int n2) {
        int n3;
        this.f[this.g] = n3 = byArray[n2] << 24 | (byArray[++n2] & 0xFF) << 16 | (byArray[++n2] & 0xFF) << 8 | byArray[++n2] & 0xFF;
        if (++this.g == 16) {
            this.f();
        }
    }

    protected final void a(long l2) {
        if (this.g > 14) {
            this.f();
        }
        this.f[14] = (int)(l2 >>> 32);
        this.f[15] = (int)l2;
    }

    public final int a(byte[] byArray, int n2) {
        this.e();
        ab.a(this.a, byArray, n2);
        ab.a(this.b, byArray, n2 + 4);
        ab.a(this.c, byArray, n2 + 8);
        ab.a(this.d, byArray, n2 + 12);
        ab.a(this.e, byArray, n2 + 16);
        this.c();
        return 20;
    }

    public final void c() {
        super.c();
        this.a = 1732584193;
        this.b = -271733879;
        this.c = -1732584194;
        this.d = 271733878;
        this.e = -1009589776;
        this.g = 0;
        for (int i2 = 0; i2 != this.f.length; ++i2) {
            this.f[i2] = 0;
        }
    }

    private static int a(int n2, int n3, int n4) {
        return n2 & n3 | ~n2 & n4;
    }

    private static int b(int n2, int n3, int n4) {
        return n2 & n3 | n2 & n4 | n3 & n4;
    }

    protected final void f() {
        int n2;
        int n3;
        int n4;
        int n5;
        for (n5 = 16; n5 < 80; ++n5) {
            n4 = this.f[n5 - 3] ^ this.f[n5 - 8] ^ this.f[n5 - 14] ^ this.f[n5 - 16];
            this.f[n5] = n4 << 1 | n4 >>> 31;
        }
        n5 = this.a;
        n4 = this.b;
        int n6 = this.c;
        int n7 = this.d;
        int n8 = this.e;
        int n9 = 0;
        for (n3 = 0; n3 < 4; ++n3) {
            n8 += (n5 << 5 | n5 >>> 27) + org.bouncycastle.crypto.b.e.a(n4, n6, n7) + this.f[n9++] + 1518500249;
            n4 = n4 << 30 | n4 >>> 2;
            n7 += (n8 << 5 | n8 >>> 27) + org.bouncycastle.crypto.b.e.a(n5, n4, n6) + this.f[n9++] + 1518500249;
            n5 = n5 << 30 | n5 >>> 2;
            n6 += (n7 << 5 | n7 >>> 27) + org.bouncycastle.crypto.b.e.a(n8, n5, n4) + this.f[n9++] + 1518500249;
            n8 = n8 << 30 | n8 >>> 2;
            n4 += (n6 << 5 | n6 >>> 27) + org.bouncycastle.crypto.b.e.a(n7, n8, n5) + this.f[n9++] + 1518500249;
            n7 = n7 << 30 | n7 >>> 2;
            n5 += (n4 << 5 | n4 >>> 27) + org.bouncycastle.crypto.b.e.a(n6, n7, n8) + this.f[n9++] + 1518500249;
            n6 = n6 << 30 | n6 >>> 2;
        }
        for (n3 = 0; n3 < 4; ++n3) {
            n2 = n7;
            n8 += (n5 << 5 | n5 >>> 27) + (n4 ^ n6 ^ n2) + this.f[n9++] + 1859775393;
            n4 = n4 << 30 | n4 >>> 2;
            n2 = n6;
            n7 += (n8 << 5 | n8 >>> 27) + (n5 ^ n4 ^ n2) + this.f[n9++] + 1859775393;
            n5 = n5 << 30 | n5 >>> 2;
            n2 = n4;
            n6 += (n7 << 5 | n7 >>> 27) + (n8 ^ n5 ^ n2) + this.f[n9++] + 1859775393;
            n8 = n8 << 30 | n8 >>> 2;
            n2 = n5;
            n4 += (n6 << 5 | n6 >>> 27) + (n7 ^ n8 ^ n2) + this.f[n9++] + 1859775393;
            n7 = n7 << 30 | n7 >>> 2;
            n2 = n8;
            n5 += (n4 << 5 | n4 >>> 27) + (n6 ^ n7 ^ n2) + this.f[n9++] + 1859775393;
            n6 = n6 << 30 | n6 >>> 2;
        }
        for (n3 = 0; n3 < 4; ++n3) {
            n8 += (n5 << 5 | n5 >>> 27) + org.bouncycastle.crypto.b.e.b(n4, n6, n7) + this.f[n9++] + -1894007588;
            n4 = n4 << 30 | n4 >>> 2;
            n7 += (n8 << 5 | n8 >>> 27) + org.bouncycastle.crypto.b.e.b(n5, n4, n6) + this.f[n9++] + -1894007588;
            n5 = n5 << 30 | n5 >>> 2;
            n6 += (n7 << 5 | n7 >>> 27) + org.bouncycastle.crypto.b.e.b(n8, n5, n4) + this.f[n9++] + -1894007588;
            n8 = n8 << 30 | n8 >>> 2;
            n4 += (n6 << 5 | n6 >>> 27) + org.bouncycastle.crypto.b.e.b(n7, n8, n5) + this.f[n9++] + -1894007588;
            n7 = n7 << 30 | n7 >>> 2;
            n5 += (n4 << 5 | n4 >>> 27) + org.bouncycastle.crypto.b.e.b(n6, n7, n8) + this.f[n9++] + -1894007588;
            n6 = n6 << 30 | n6 >>> 2;
        }
        for (n3 = 0; n3 <= 3; ++n3) {
            n2 = n7;
            n8 += (n5 << 5 | n5 >>> 27) + (n4 ^ n6 ^ n2) + this.f[n9++] + -899497514;
            n4 = n4 << 30 | n4 >>> 2;
            n2 = n6;
            n7 += (n8 << 5 | n8 >>> 27) + (n5 ^ n4 ^ n2) + this.f[n9++] + -899497514;
            n5 = n5 << 30 | n5 >>> 2;
            n2 = n4;
            n6 += (n7 << 5 | n7 >>> 27) + (n8 ^ n5 ^ n2) + this.f[n9++] + -899497514;
            n8 = n8 << 30 | n8 >>> 2;
            n2 = n5;
            n4 += (n6 << 5 | n6 >>> 27) + (n7 ^ n8 ^ n2) + this.f[n9++] + -899497514;
            n7 = n7 << 30 | n7 >>> 2;
            n2 = n8;
            n5 += (n4 << 5 | n4 >>> 27) + (n6 ^ n7 ^ n2) + this.f[n9++] + -899497514;
            n6 = n6 << 30 | n6 >>> 2;
        }
        this.a += n5;
        this.b += n4;
        this.c += n6;
        this.d += n7;
        this.e += n8;
        this.g = 0;
        for (n3 = 0; n3 < 16; ++n3) {
            this.f[n3] = 0;
        }
    }

    public final f g() {
        return new e(this);
    }

    public final void a(f f2) {
        f2 = (e)f2;
        super.a((a)f2);
        this.a((e)f2);
    }
}

