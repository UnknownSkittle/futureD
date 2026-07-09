/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.b;

import org.bouncycastle.crypto.b.c;
import org.bouncycastle.e.f;
import org.bouncycastle.e.g;

public final class k
extends c {
    private int i;
    private long j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;

    public k(int n2) {
        if (n2 >= 512) {
            throw new IllegalArgumentException("bitLength cannot be >= 512");
        }
        if (n2 % 8 != 0) {
            throw new IllegalArgumentException("bitLength needs to be a multiple of 8");
        }
        if (n2 == 384) {
            throw new IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
        }
        this.i = n2 / 8;
        k k2 = this;
        int n3 = k2.i << 3;
        k k3 = k2;
        k2.a = -3482333909917012819L;
        k3.b = 2216346199247487646L;
        k3.c = -7364697282686394994L;
        k3.d = 65953792586715988L;
        k3.e = -816286391624063116L;
        k3.f = 4512832404995164602L;
        k3.g = -5033199132376557362L;
        k3.h = -124578254951840548L;
        k3.a((byte)83);
        k3.a((byte)72);
        k3.a((byte)65);
        k3.a((byte)45);
        k3.a((byte)53);
        k3.a((byte)49);
        k3.a((byte)50);
        k3.a((byte)47);
        if (n3 > 100) {
            k3.a((byte)(n3 / 100 + 48));
            k3.a((byte)((n3 %= 100) / 10 + 48));
            n3 %= 10;
        } else if (n3 > 10) {
            k3.a((byte)(n3 / 10 + 48));
            n3 %= 10;
        }
        k3.a((byte)(n3 + 48));
        k3.e();
        k3.j = k3.a;
        k3.k = k3.b;
        k3.l = k3.c;
        k3.m = k3.d;
        k3.n = k3.e;
        k3.o = k3.f;
        k3.p = k3.g;
        k3.q = k3.h;
        this.c();
    }

    private k(k k2) {
        super(k2);
        this.i = k2.i;
        this.a((f)k2);
    }

    public final String a() {
        return "SHA-512/" + Integer.toString(this.i << 3);
    }

    public final int b() {
        return this.i;
    }

    public final int a(byte[] byArray, int n2) {
        this.e();
        org.bouncycastle.crypto.b.k.a(this.a, byArray, n2, this.i);
        org.bouncycastle.crypto.b.k.a(this.b, byArray, n2 + 8, this.i - 8);
        org.bouncycastle.crypto.b.k.a(this.c, byArray, n2 + 16, this.i - 16);
        org.bouncycastle.crypto.b.k.a(this.d, byArray, n2 + 24, this.i - 24);
        org.bouncycastle.crypto.b.k.a(this.e, byArray, n2 + 32, this.i - 32);
        org.bouncycastle.crypto.b.k.a(this.f, byArray, n2 + 40, this.i - 40);
        org.bouncycastle.crypto.b.k.a(this.g, byArray, n2 + 48, this.i - 48);
        org.bouncycastle.crypto.b.k.a(this.h, byArray, n2 + 56, this.i - 56);
        this.c();
        return this.i;
    }

    public final void c() {
        super.c();
        this.a = this.j;
        this.b = this.k;
        this.c = this.l;
        this.d = this.m;
        this.e = this.n;
        this.f = this.o;
        this.g = this.p;
        this.h = this.q;
    }

    private static void a(long l2, byte[] byArray, int n2, int n3) {
        if (n3 > 0) {
            org.bouncycastle.crypto.b.k.a((int)(l2 >>> 32), byArray, n2, n3);
            if (n3 > 4) {
                org.bouncycastle.crypto.b.k.a((int)l2, byArray, n2 + 4, n3 - 4);
            }
        }
    }

    private static void a(int n2, byte[] byArray, int n3, int n4) {
        n4 = Math.min(4, n4);
        while (--n4 >= 0) {
            int n5 = 8 * (3 - n4);
            byArray[n3 + n4] = (byte)(n2 >>> n5);
        }
    }

    public final f g() {
        return new k(this);
    }

    public final void a(f f2) {
        f2 = (k)f2;
        if (this.i != ((k)f2).i) {
            throw new g("digestLength inappropriate in other");
        }
        super.a((c)f2);
        this.j = ((k)f2).j;
        this.k = ((k)f2).k;
        this.l = ((k)f2).l;
        this.m = ((k)f2).m;
        this.n = ((k)f2).n;
        this.o = ((k)f2).o;
        this.p = ((k)f2).p;
        this.q = ((k)f2).q;
    }
}

