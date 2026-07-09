/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.b;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.crypto.k;
import org.bouncycastle.e.f;

public abstract class c
implements k,
f {
    private byte[] i = new byte[8];
    private int j;
    private long k;
    private long l;
    protected long a;
    protected long b;
    protected long c;
    protected long d;
    protected long e;
    protected long f;
    protected long g;
    protected long h;
    private long[] m = new long[80];
    private int n;
    private static long[] o = new long[]{4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    protected c() {
        this.j = 0;
        this.c();
    }

    protected c(c c2) {
        this.a(c2);
    }

    protected final void a(c c2) {
        System.arraycopy(c2.i, 0, this.i, 0, c2.i.length);
        this.j = c2.j;
        this.k = c2.k;
        this.l = c2.l;
        this.a = c2.a;
        this.b = c2.b;
        this.c = c2.c;
        this.d = c2.d;
        this.e = c2.e;
        this.f = c2.f;
        this.g = c2.g;
        this.h = c2.h;
        System.arraycopy(c2.m, 0, this.m, 0, c2.m.length);
        this.n = c2.n;
    }

    public final void a(byte by2) {
        this.i[this.j++] = by2;
        if (this.j == this.i.length) {
            c c2 = this;
            c2.b(c2.i, 0);
            this.j = 0;
        }
        ++this.k;
    }

    public final void a(byte[] byArray, int n2, int n3) {
        while (this.j != 0 && n3 > 0) {
            this.a(byArray[n2]);
            ++n2;
            --n3;
        }
        while (n3 > this.i.length) {
            this.b(byArray, n2);
            n2 += this.i.length;
            n3 -= this.i.length;
            this.k += (long)this.i.length;
        }
        while (n3 > 0) {
            this.a(byArray[n2]);
            ++n2;
            --n3;
        }
    }

    public final void e() {
        this.f();
        long l2 = this.k << 3;
        long l3 = this.l;
        this.a((byte)-128);
        while (this.j != 0) {
            this.a((byte)0);
        }
        long l4 = l3;
        long l5 = l2;
        c c2 = this;
        if (c2.n > 14) {
            c2.h();
        }
        c2.m[14] = l4;
        c2.m[15] = l5;
        this.h();
    }

    public void c() {
        int n2;
        this.k = 0L;
        this.l = 0L;
        this.j = 0;
        for (n2 = 0; n2 < this.i.length; ++n2) {
            this.i[n2] = 0;
        }
        this.n = 0;
        for (n2 = 0; n2 != this.m.length; ++n2) {
            this.m[n2] = 0L;
        }
    }

    public final int d() {
        return 128;
    }

    private void b(byte[] byArray, int n2) {
        this.m[this.n] = ab.b(byArray, n2);
        if (++this.n == 16) {
            this.h();
        }
    }

    private void f() {
        if (this.k > 0x1FFFFFFFFFFFFFFFL) {
            this.l += this.k >>> 61;
            this.k &= 0x1FFFFFFFFFFFFFFFL;
        }
    }

    private void h() {
        int n2;
        this.f();
        for (int i2 = 16; i2 <= 79; ++i2) {
            this.m[i2] = org.bouncycastle.crypto.b.c.d(this.m[i2 - 2]) + this.m[i2 - 7] + org.bouncycastle.crypto.b.c.c(this.m[i2 - 15]) + this.m[i2 - 16];
        }
        long l2 = this.a;
        long l3 = this.b;
        long l4 = this.c;
        long l5 = this.d;
        long l6 = this.e;
        long l7 = this.f;
        long l8 = this.g;
        long l9 = this.h;
        int n3 = 0;
        for (n2 = 0; n2 < 10; ++n2) {
            long l10 = org.bouncycastle.crypto.b.c.b(l6) + org.bouncycastle.crypto.b.c.a(l6, l7, l8) + o[n3];
            int n4 = n3++;
            l9 += org.bouncycastle.crypto.b.c.a(l2) + org.bouncycastle.crypto.b.c.b(l2, l3, l4);
            long l11 = org.bouncycastle.crypto.b.c.b(l5 += (l9 += l10 + this.m[n4])) + org.bouncycastle.crypto.b.c.a(l5, l6, l7) + o[n3];
            int n5 = n3++;
            l8 += org.bouncycastle.crypto.b.c.a(l9) + org.bouncycastle.crypto.b.c.b(l9, l2, l3);
            long l12 = org.bouncycastle.crypto.b.c.b(l4 += (l8 += l11 + this.m[n5])) + org.bouncycastle.crypto.b.c.a(l4, l5, l6) + o[n3];
            int n6 = n3++;
            l7 += org.bouncycastle.crypto.b.c.a(l8) + org.bouncycastle.crypto.b.c.b(l8, l9, l2);
            long l13 = org.bouncycastle.crypto.b.c.b(l3 += (l7 += l12 + this.m[n6])) + org.bouncycastle.crypto.b.c.a(l3, l4, l5) + o[n3];
            int n7 = n3++;
            l6 += org.bouncycastle.crypto.b.c.a(l7) + org.bouncycastle.crypto.b.c.b(l7, l8, l9);
            long l14 = org.bouncycastle.crypto.b.c.b(l2 += (l6 += l13 + this.m[n7])) + org.bouncycastle.crypto.b.c.a(l2, l3, l4) + o[n3];
            int n8 = n3++;
            l5 += org.bouncycastle.crypto.b.c.a(l6) + org.bouncycastle.crypto.b.c.b(l6, l7, l8);
            long l15 = org.bouncycastle.crypto.b.c.b(l9 += (l5 += l14 + this.m[n8])) + org.bouncycastle.crypto.b.c.a(l9, l2, l3) + o[n3];
            int n9 = n3++;
            l4 += org.bouncycastle.crypto.b.c.a(l5) + org.bouncycastle.crypto.b.c.b(l5, l6, l7);
            long l16 = org.bouncycastle.crypto.b.c.b(l8 += (l4 += l15 + this.m[n9])) + org.bouncycastle.crypto.b.c.a(l8, l9, l2) + o[n3];
            int n10 = n3++;
            l3 += org.bouncycastle.crypto.b.c.a(l4) + org.bouncycastle.crypto.b.c.b(l4, l5, l6);
            l6 += (l2 += org.bouncycastle.crypto.b.c.b(l7 += (l3 += l16 + this.m[n10])) + org.bouncycastle.crypto.b.c.a(l7, l8, l9) + o[n3] + this.m[n3++]);
            l2 += org.bouncycastle.crypto.b.c.a(l3) + org.bouncycastle.crypto.b.c.b(l3, l4, l5);
        }
        this.a += l2;
        this.b += l3;
        this.c += l4;
        this.d += l5;
        this.e += l6;
        this.f += l7;
        this.g += l8;
        this.h += l9;
        this.n = 0;
        for (n2 = 0; n2 < 16; ++n2) {
            this.m[n2] = 0L;
        }
    }

    private static long a(long l2, long l3, long l4) {
        return l2 & l3 ^ (l2 ^ 0xFFFFFFFFFFFFFFFFL) & l4;
    }

    private static long b(long l2, long l3, long l4) {
        return l2 & l3 ^ l2 & l4 ^ l3 & l4;
    }

    private static long a(long l2) {
        return (l2 << 36 | l2 >>> 28) ^ (l2 << 30 | l2 >>> 34) ^ (l2 << 25 | l2 >>> 39);
    }

    private static long b(long l2) {
        return (l2 << 50 | l2 >>> 14) ^ (l2 << 46 | l2 >>> 18) ^ (l2 << 23 | l2 >>> 41);
    }

    private static long c(long l2) {
        return (l2 << 63 | l2 >>> 1) ^ (l2 << 56 | l2 >>> 8) ^ l2 >>> 7;
    }

    private static long d(long l2) {
        return (l2 << 45 | l2 >>> 19) ^ (l2 << 3 | l2 >>> 61) ^ l2 >>> 6;
    }
}

