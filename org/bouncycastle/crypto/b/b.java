/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.b;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.crypto.k;
import org.bouncycastle.e.a;

public class b
implements k {
    private static long[] c = new long[]{1L, 32898L, -9223372036854742902L, -9223372034707259392L, 32907L, 0x80000001L, -9223372034707259263L, -9223372036854743031L, 138L, 136L, 0x80008009L, 0x8000000AL, 0x8000808BL, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778L, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 0x80000001L, -9223372034707259384L};
    private long[] d = new long[25];
    private byte[] e = new byte[192];
    private int f;
    private int g;
    protected int a;
    protected boolean b;

    public b(int n2) {
        this.a(n2);
    }

    public String a() {
        return "Keccak-" + this.a;
    }

    public final int b() {
        return this.a / 8;
    }

    public final void a(byte by2) {
        this.b(new byte[]{by2}, 0, 1);
    }

    public final void a(byte[] byArray, int n2, int n3) {
        this.b(byArray, n2, n3);
    }

    public int a(byte[] byArray, int n2) {
        this.a(byArray, n2, (long)this.a);
        this.c();
        return this.a / 8;
    }

    public final void c() {
        b b2 = this;
        b2.a(b2.a);
    }

    public final int d() {
        return this.f / 8;
    }

    private void a(int n2) {
        switch (n2) {
            case 128: 
            case 224: 
            case 256: 
            case 288: 
            case 384: 
            case 512: {
                this.b(1600 - (n2 << 1));
                return;
            }
        }
        throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
    }

    private void b(int n2) {
        if (n2 <= 0 || n2 >= 1600 || n2 % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.f = n2;
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            this.d[i2] = 0L;
        }
        org.bouncycastle.e.a.b(this.e);
        this.g = 0;
        this.b = false;
        this.a = (1600 - n2) / 2;
    }

    private void b(byte[] byArray, int n2, int n3) {
        if (this.g % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.b) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        int n4 = this.g >> 3;
        int n5 = this.f >> 3;
        int n6 = 0;
        while (n6 < n3) {
            if (n4 == 0 && n6 <= n3 - n5) {
                do {
                    this.b(byArray, n2 + n6);
                } while ((n6 += n5) <= n3 - n5);
                continue;
            }
            int n7 = Math.min(n5 - n4, n3 - n6);
            System.arraycopy(byArray, n2 + n6, this.e, n4, n7);
            n6 += n7;
            if ((n4 += n7) != n5) continue;
            b b2 = this;
            b2.b(b2.e, 0);
            n4 = 0;
        }
        this.g = n4 << 3;
    }

    protected final void a(int n2, int n3) {
        if (n3 <= 0 || n3 > 7) {
            throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
        }
        if (this.g % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.b) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        int n4 = (1 << n3) - 1;
        this.e[this.g >> 3] = (byte)(n2 & n4);
        this.g += n3;
    }

    private void e() {
        int n2 = this.g >> 3;
        this.e[n2] = (byte)(this.e[n2] | (byte)(1L << (this.g & 7)));
        if (++this.g == this.f) {
            b b2 = this;
            b2.b(b2.e, 0);
            this.g = 0;
        }
        int n3 = this.g >> 6;
        int n4 = this.g & 0x3F;
        int n5 = 0;
        int n6 = 0;
        while (n6 < n3) {
            int n7 = n6++;
            this.d[n7] = this.d[n7] ^ ab.c(this.e, n5);
            n5 += 8;
        }
        if (n4 > 0) {
            long l2 = (1L << n4) - 1L;
            int n8 = n3;
            this.d[n8] = this.d[n8] ^ ab.c(this.e, n5) & l2;
        }
        int n9 = this.f - 1 >> 6;
        this.d[n9] = this.d[n9] ^ Long.MIN_VALUE;
        this.g();
        this.f();
        this.g = this.f;
        this.b = true;
    }

    protected final void a(byte[] byArray, int n2, long l2) {
        int n3;
        if (!this.b) {
            this.e();
        }
        if (l2 % 8L != 0L) {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        for (long i2 = 0L; i2 < l2; i2 += (long)n3) {
            if (this.g == 0) {
                this.g();
                this.f();
                this.g = this.f;
            }
            n3 = (int)Math.min((long)this.g, l2 - i2);
            System.arraycopy(this.e, (this.f - this.g) / 8, byArray, n2 + (int)(i2 / 8L), n3 / 8);
            this.g -= n3;
        }
    }

    private void b(byte[] byArray, int n2) {
        int n3 = this.f >> 6;
        int n4 = 0;
        while (n4 < n3) {
            int n5 = n4++;
            this.d[n5] = this.d[n5] ^ ab.c(byArray, n2);
            n2 += 8;
        }
        this.g();
    }

    private void f() {
        ab.a(this.d, this.f >> 6, this.e, 0);
    }

    private void g() {
        long[] lArray = this.d;
        long l2 = this.d[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = lArray[3];
        long l6 = lArray[4];
        long l7 = lArray[5];
        long l8 = lArray[6];
        long l9 = lArray[7];
        long l10 = lArray[8];
        long l11 = lArray[9];
        long l12 = lArray[10];
        long l13 = lArray[11];
        long l14 = lArray[12];
        long l15 = lArray[13];
        long l16 = lArray[14];
        long l17 = lArray[15];
        long l18 = lArray[16];
        long l19 = lArray[17];
        long l20 = lArray[18];
        long l21 = lArray[19];
        long l22 = lArray[20];
        long l23 = lArray[21];
        long l24 = lArray[22];
        long l25 = lArray[23];
        long l26 = lArray[24];
        for (int i2 = 0; i2 < 24; ++i2) {
            long l27 = l2 ^ l7 ^ l12 ^ l17 ^ l22;
            long l28 = l3 ^ l8 ^ l13 ^ l18 ^ l23;
            long l29 = l4 ^ l9 ^ l14 ^ l19 ^ l24;
            long l30 = l5 ^ l10 ^ l15 ^ l20 ^ l25;
            long l31 = l6 ^ l11 ^ l16 ^ l21 ^ l26;
            long l32 = (l28 << 1 | l28 >>> -1) ^ l31;
            long l33 = (l29 << 1 | l29 >>> -1) ^ l27;
            long l34 = (l30 << 1 | l30 >>> -1) ^ l28;
            long l35 = (l31 << 1 | l31 >>> -1) ^ l29;
            long l36 = (l27 << 1 | l27 >>> -1) ^ l30;
            l2 ^= l32;
            l7 ^= l32;
            l12 ^= l32;
            l17 ^= l32;
            l22 ^= l32;
            l3 ^= l33;
            l8 ^= l33;
            l13 ^= l33;
            l18 ^= l33;
            l23 ^= l33;
            l4 ^= l34;
            l9 ^= l34;
            l14 ^= l34;
            l19 ^= l34;
            l24 ^= l34;
            l5 ^= l35;
            l10 ^= l35;
            l15 ^= l35;
            l20 ^= l35;
            l25 ^= l35;
            l6 ^= l36;
            l11 ^= l36;
            l16 ^= l36;
            l21 ^= l36;
            l26 ^= l36;
            l28 = l3 << 1 | l3 >>> 63;
            l3 = l8 << 44 | l8 >>> 20;
            l8 = l11 << 20 | l11 >>> 44;
            l11 = l24 << 61 | l24 >>> 3;
            l24 = l16 << 39 | l16 >>> 25;
            l16 = l22 << 18 | l22 >>> 46;
            l22 = l4 << 62 | l4 >>> 2;
            l4 = l14 << 43 | l14 >>> 21;
            l14 = l15 << 25 | l15 >>> 39;
            l15 = l21 << 8 | l21 >>> 56;
            l21 = l25 << 56 | l25 >>> 8;
            l25 = l17 << 41 | l17 >>> 23;
            l17 = l6 << 27 | l6 >>> 37;
            l6 = l26 << 14 | l26 >>> 50;
            l26 = l23 << 2 | l23 >>> 62;
            l23 = l10 << 55 | l10 >>> 9;
            l10 = l18 << 45 | l18 >>> 19;
            l18 = l7 << 36 | l7 >>> 28;
            l7 = l5 << 28 | l5 >>> 36;
            l5 = l20 << 21 | l20 >>> 43;
            l20 = l19 << 15 | l19 >>> 49;
            l19 = l13 << 10 | l13 >>> 54;
            l13 = l9 << 6 | l9 >>> 58;
            l9 = l12 << 3 | l12 >>> 61;
            l12 = l28;
            l27 = l2 ^ (l3 ^ 0xFFFFFFFFFFFFFFFFL) & l4;
            l28 = l3 ^ (l4 ^ 0xFFFFFFFFFFFFFFFFL) & l5;
            l4 ^= (l5 ^ 0xFFFFFFFFFFFFFFFFL) & l6;
            l5 ^= (l6 ^ 0xFFFFFFFFFFFFFFFFL) & l2;
            l6 ^= (l2 ^ 0xFFFFFFFFFFFFFFFFL) & l3;
            l2 = l27;
            l3 = l28;
            l27 = l7 ^ (l8 ^ 0xFFFFFFFFFFFFFFFFL) & l9;
            l28 = l8 ^ (l9 ^ 0xFFFFFFFFFFFFFFFFL) & l10;
            l9 ^= (l10 ^ 0xFFFFFFFFFFFFFFFFL) & l11;
            l10 ^= (l11 ^ 0xFFFFFFFFFFFFFFFFL) & l7;
            l11 ^= (l7 ^ 0xFFFFFFFFFFFFFFFFL) & l8;
            l7 = l27;
            l8 = l28;
            l27 = l12 ^ (l13 ^ 0xFFFFFFFFFFFFFFFFL) & l14;
            l28 = l13 ^ (l14 ^ 0xFFFFFFFFFFFFFFFFL) & l15;
            l14 ^= (l15 ^ 0xFFFFFFFFFFFFFFFFL) & l16;
            l15 ^= (l16 ^ 0xFFFFFFFFFFFFFFFFL) & l12;
            l16 ^= (l12 ^ 0xFFFFFFFFFFFFFFFFL) & l13;
            l12 = l27;
            l13 = l28;
            l27 = l17 ^ (l18 ^ 0xFFFFFFFFFFFFFFFFL) & l19;
            l28 = l18 ^ (l19 ^ 0xFFFFFFFFFFFFFFFFL) & l20;
            l19 ^= (l20 ^ 0xFFFFFFFFFFFFFFFFL) & l21;
            l20 ^= (l21 ^ 0xFFFFFFFFFFFFFFFFL) & l17;
            l21 ^= (l17 ^ 0xFFFFFFFFFFFFFFFFL) & l18;
            l17 = l27;
            l18 = l28;
            l27 = l22 ^ (l23 ^ 0xFFFFFFFFFFFFFFFFL) & l24;
            l28 = l23 ^ (l24 ^ 0xFFFFFFFFFFFFFFFFL) & l25;
            l24 ^= (l25 ^ 0xFFFFFFFFFFFFFFFFL) & l26;
            l25 ^= (l26 ^ 0xFFFFFFFFFFFFFFFFL) & l22;
            l26 ^= (l22 ^ 0xFFFFFFFFFFFFFFFFL) & l23;
            l22 = l27;
            l23 = l28;
            l2 ^= c[i2];
        }
        lArray[0] = l2;
        lArray[1] = l3;
        lArray[2] = l4;
        lArray[3] = l5;
        lArray[4] = l6;
        lArray[5] = l7;
        lArray[6] = l8;
        lArray[7] = l9;
        lArray[8] = l10;
        lArray[9] = l11;
        lArray[10] = l12;
        lArray[11] = l13;
        lArray[12] = l14;
        lArray[13] = l15;
        lArray[14] = l16;
        lArray[15] = l17;
        lArray[16] = l18;
        lArray[17] = l19;
        lArray[18] = l20;
        lArray[19] = l21;
        lArray[20] = l22;
        lArray[21] = l23;
        lArray[22] = l24;
        lArray[23] = l25;
        lArray[24] = l26;
    }
}

