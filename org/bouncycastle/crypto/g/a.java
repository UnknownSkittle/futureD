/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.g;

import java.util.Hashtable;
import org.bouncycastle.b.e;
import org.bouncycastle.crypto.i.h;
import org.bouncycastle.crypto.j;
import org.bouncycastle.crypto.k;
import org.bouncycastle.crypto.m;
import org.bouncycastle.e.f;

public final class a
implements m {
    private j a;
    private int b;
    private int c;
    private f d;
    private f e;
    private byte[] f;
    private byte[] g;
    private static Hashtable h = new Hashtable<String, Integer>();

    public a(j j2) {
        int n2;
        if (j2 instanceof k) {
            n2 = ((k)j2).d();
        } else {
            Integer n3 = (Integer)h.get(j2.a());
            if (n3 == null) {
                throw new IllegalArgumentException("unknown digest passed: " + j2.a());
            }
            n2 = n3;
        }
        this(j2, n2);
    }

    private a(j j2, int n2) {
        this.a = j2;
        this.b = j2.b();
        this.c = n2;
        this.f = new byte[this.c];
        this.g = new byte[this.c + this.b];
    }

    public final void a(e object) {
        this.a.c();
        byte[] byArray = ((h)object).a();
        object = byArray;
        int n2 = byArray.length;
        if (n2 > this.c) {
            this.a.a((byte[])object, 0, n2);
            this.a.a(this.f, 0);
            n2 = this.b;
        } else {
            System.arraycopy(object, 0, this.f, 0, n2);
        }
        for (int i2 = n2; i2 < this.f.length; ++i2) {
            this.f[i2] = 0;
        }
        System.arraycopy(this.f, 0, this.g, 0, this.c);
        org.bouncycastle.crypto.g.a.a(this.f, this.c, (byte)54);
        org.bouncycastle.crypto.g.a.a(this.g, this.c, (byte)92);
        if (this.a instanceof f) {
            this.e = ((f)((Object)this.a)).g();
            ((j)((Object)this.e)).a(this.g, 0, this.c);
        }
        this.a.a(this.f, 0, this.f.length);
        if (this.a instanceof f) {
            this.d = ((f)((Object)this.a)).g();
        }
    }

    public final int a() {
        return this.b;
    }

    public final void a(byte[] byArray, int n2) {
        this.a.a(byArray, 0, n2);
    }

    public final int a(byte[] byArray) {
        this.a.a(this.g, this.c);
        if (this.e != null) {
            ((f)((Object)this.a)).a(this.e);
            this.a.a(this.g, this.c, this.a.b());
        } else {
            this.a.a(this.g, 0, this.g.length);
        }
        int n2 = this.a.a(byArray, 0);
        for (int i2 = this.c; i2 < this.g.length; ++i2) {
            this.g[i2] = 0;
        }
        if (this.d != null) {
            ((f)((Object)this.a)).a(this.d);
        } else {
            this.a.a(this.f, 0, this.f.length);
        }
        return n2;
    }

    private static void a(byte[] byArray, int n2, byte by2) {
        int n3 = 0;
        while (n3 < n2) {
            int n4 = n3++;
            byArray[n4] = (byte)(byArray[n4] ^ by2);
        }
    }

    static {
        h.put("GOST3411", 32);
        h.put("MD2", 16);
        h.put("MD4", 64);
        h.put("MD5", 64);
        h.put("RIPEMD128", 64);
        h.put("RIPEMD160", 64);
        h.put("SHA-1", 64);
        h.put("SHA-224", 64);
        h.put("SHA-256", 64);
        h.put("SHA-384", 128);
        h.put("SHA-512", 128);
        h.put("Tiger", 64);
        h.put("Whirlpool", 64);
    }
}

