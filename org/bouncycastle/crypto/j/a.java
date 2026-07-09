/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.j;

import java.security.SecureRandom;
import org.bouncycastle.b.e;
import org.bouncycastle.crypto.g;
import org.bouncycastle.crypto.i.k;
import org.bouncycastle.crypto.i.l;
import org.bouncycastle.crypto.j;

public final class a {
    private j a;
    private j b;
    private org.bouncycastle.crypto.a c;
    private SecureRandom d;
    private int e;
    private int f;
    private boolean g;
    private int h;
    private int i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte m;

    public a(org.bouncycastle.crypto.a a2, j j2, j j3, int n2, byte by2) {
        this.c = a2;
        this.a = j2;
        this.b = j3;
        this.e = j2.b();
        this.f = j3.b();
        this.g = false;
        this.h = n2;
        this.j = new byte[n2];
        this.k = new byte[n2 + 8 + this.e];
        this.m = by2;
    }

    public final void a(boolean bl2, e e2) {
        e e3;
        e e4;
        if (e2 instanceof org.bouncycastle.crypto.i.j) {
            e4 = (org.bouncycastle.crypto.i.j)e2;
            e3 = ((org.bouncycastle.crypto.i.j)e4).b();
            this.d = ((org.bouncycastle.crypto.i.j)e4).a();
        } else {
            e3 = e2;
            if (bl2) {
                this.d = org.bouncycastle.crypto.g.a();
            }
        }
        if (e3 instanceof k) {
            e4 = null;
            this.c.a(bl2, e2);
        } else {
            e4 = (l)e3;
            this.c.a(bl2, e3);
        }
        this.i = ((l)e4).b().bitLength() - 1;
        if (this.i < 8 * this.e + 8 * this.h + 9) {
            throw new IllegalArgumentException("key too small for specified hash and salt lengths");
        }
        this.l = new byte[(this.i + 7) / 8];
        this.a.c();
    }

    private static void b(byte[] byArray) {
        for (int i2 = 0; i2 != byArray.length; ++i2) {
            byArray[i2] = 0;
        }
    }

    public final void a(byte by2) {
        this.a.a(by2);
    }

    public final void a(byte[] byArray, int n2, int n3) {
        this.a.a(byArray, n2, n3);
    }

    public final byte[] a() {
        this.a.a(this.k, this.k.length - this.e - this.h);
        if (this.h != 0) {
            this.d.nextBytes(this.j);
            System.arraycopy(this.j, 0, this.k, this.k.length - this.h, this.h);
        }
        byte[] byArray = new byte[this.e];
        this.a.a(this.k, 0, this.k.length);
        this.a.a(byArray, 0);
        this.l[this.l.length - this.h - 1 - this.e - 1] = 1;
        System.arraycopy(this.j, 0, this.l, this.l.length - this.h - this.e - 1, this.h);
        byte[] byArray2 = this.a(byArray, 0, byArray.length, this.l.length - this.e - 1);
        for (int i2 = 0; i2 != byArray2.length; ++i2) {
            int n2 = i2;
            this.l[n2] = (byte)(this.l[n2] ^ byArray2[i2]);
        }
        this.l[0] = (byte)(this.l[0] & 255 >> (this.l.length << 3) - this.i);
        System.arraycopy(byArray, 0, this.l, this.l.length - this.e - 1, this.e);
        this.l[this.l.length - 1] = this.m;
        byte[] byArray3 = this.c.a(this.l, 0, this.l.length);
        org.bouncycastle.crypto.j.a.b(this.l);
        return byArray3;
    }

    public final boolean a(byte[] byArray) {
        int n2;
        this.a.a(this.k, this.k.length - this.e - this.h);
        try {
            byArray = this.c.a(byArray, 0, byArray.length);
            System.arraycopy(byArray, 0, this.l, this.l.length - byArray.length, byArray.length);
        } catch (Exception exception) {
            return false;
        }
        if (this.l[this.l.length - 1] != this.m) {
            org.bouncycastle.crypto.j.a.b(this.l);
            return false;
        }
        a a2 = this;
        byArray = a2.a(a2.l, this.l.length - this.e - 1, this.e, this.l.length - this.e - 1);
        for (n2 = 0; n2 != byArray.length; ++n2) {
            int n3 = n2;
            this.l[n3] = (byte)(this.l[n3] ^ byArray[n2]);
        }
        this.l[0] = (byte)(this.l[0] & 255 >> (this.l.length << 3) - this.i);
        for (n2 = 0; n2 != this.l.length - this.e - this.h - 2; ++n2) {
            if (this.l[n2] == 0) continue;
            org.bouncycastle.crypto.j.a.b(this.l);
            return false;
        }
        if (this.l[this.l.length - this.e - this.h - 2] != 1) {
            org.bouncycastle.crypto.j.a.b(this.l);
            return false;
        }
        System.arraycopy(this.l, this.l.length - this.h - this.e - 1, this.k, this.k.length - this.h, this.h);
        this.a.a(this.k, 0, this.k.length);
        this.a.a(this.k, this.k.length - this.e);
        n2 = this.l.length - this.e - 1;
        for (int i2 = this.k.length - this.e; i2 != this.k.length; ++i2) {
            if ((this.l[n2] ^ this.k[i2]) != 0) {
                org.bouncycastle.crypto.j.a.b(this.k);
                org.bouncycastle.crypto.j.a.b(this.l);
                return false;
            }
            ++n2;
        }
        org.bouncycastle.crypto.j.a.b(this.k);
        org.bouncycastle.crypto.j.a.b(this.l);
        return true;
    }

    private static void a(int n2, byte[] byArray) {
        byArray[0] = (byte)(n2 >>> 24);
        byArray[1] = (byte)(n2 >>> 16);
        byArray[2] = (byte)(n2 >>> 8);
        byArray[3] = (byte)n2;
    }

    private byte[] a(byte[] byArray, int n2, int n3, int n4) {
        int n5;
        byte[] byArray2 = new byte[n4];
        byte[] byArray3 = new byte[this.f];
        byte[] byArray4 = new byte[4];
        this.b.c();
        for (n5 = 0; n5 < n4 / this.f; ++n5) {
            org.bouncycastle.crypto.j.a.a(n5, byArray4);
            this.b.a(byArray, n2, n3);
            this.b.a(byArray4, 0, 4);
            this.b.a(byArray3, 0);
            System.arraycopy(byArray3, 0, byArray2, n5 * this.f, this.f);
        }
        if (n5 * this.f < n4) {
            org.bouncycastle.crypto.j.a.a(n5, byArray4);
            this.b.a(byArray, n2, n3);
            this.b.a(byArray4, 0, 4);
            this.b.a(byArray3, 0);
            System.arraycopy(byArray3, 0, byArray2, n5 * this.f, byArray2.length - n5 * this.f);
        }
        return byArray2;
    }
}

