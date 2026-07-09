/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.b.e;
import org.bouncycastle.d.b.e.ad;
import org.bouncycastle.d.b.e.f;
import org.bouncycastle.d.b.e.h;
import org.bouncycastle.d.b.e.i;
import org.bouncycastle.d.b.e.j;
import org.bouncycastle.d.b.e.m;
import org.bouncycastle.d.b.e.n;
import org.bouncycastle.d.b.e.o;
import org.bouncycastle.d.b.e.p;
import org.bouncycastle.d.b.e.w;

final class x {
    private final e a;
    private final org.bouncycastle.crypto.j b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    static w a(m m2, o object, i i2) {
        int n2;
        if (object == null) {
            throw new NullPointerException("publicKey == null");
        }
        if (i2 == null) {
            throw new NullPointerException("address == null");
        }
        int n3 = m2.a().e;
        byte[][] byArray = ((o)object).a();
        object = byArray;
        w[] wArray = new w[byArray.length];
        for (n2 = 0; n2 < ((Object)object).length; ++n2) {
            wArray[n2] = new w(0, (byte[])object[n2]);
        }
        i2 = (i)((j)((j)((j)new j().d(i2.e())).a(i2.f())).a(i2.b()).b(0).c(i2.d()).e(i2.g())).a();
        while (n3 > 1) {
            for (n2 = 0; n2 < n3 / 2; ++n2) {
                i2 = (i)((j)((j)((j)new j().d(i2.e())).a(i2.f())).a(i2.b()).b(i2.c()).c(n2).e(i2.g())).a();
                wArray[n2] = x.a(m2, wArray[2 * n2], wArray[2 * n2 + 1], i2);
            }
            if (n3 % 2 == 1) {
                wArray[n3 / 2] = wArray[n3 - 1];
            }
            n3 = (int)Math.ceil((double)n3 / 2.0);
            i2 = (i)((j)((j)((j)new j().d(i2.e())).a(i2.f())).a(i2.b()).b(i2.c() + 1).c(i2.d()).e(i2.g())).a();
        }
        return wArray[0];
    }

    static w a(m m2, w w2, w w3, p object) {
        int n2;
        Object object2;
        Object object3;
        if (w2 == null) {
            throw new NullPointerException("left == null");
        }
        if (w3 == null) {
            throw new NullPointerException("right == null");
        }
        if (w2.a() != w3.a()) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        if (object == null) {
            throw new NullPointerException("address == null");
        }
        byte[] byArray = m2.c();
        if (object instanceof i) {
            object3 = (i)object;
            object = (i)((j)((j)((j)new j().d(((p)object3).e())).a(((p)object3).f())).a(((i)object3).b()).b(((i)object3).c()).c(((i)object3).d()).e(0)).a();
        } else if (object instanceof f) {
            object3 = (f)object;
            object = (f)((h)((h)((h)new h().d(((p)object3).e())).a(((p)object3).f())).a(((f)object3).b()).b(((f)object3).c()).e(0)).a();
        }
        object3 = m2.b().c(byArray, ((p)object).a());
        if (object instanceof i) {
            object2 = (i)object;
            object = (i)((j)((j)((j)new j().d(((p)object2).e())).a(((p)object2).f())).a(((i)object2).b()).b(((i)object2).c()).c(((i)object2).d()).e(1)).a();
        } else if (object instanceof f) {
            object2 = (f)object;
            object = (f)((h)((h)((h)new h().d(((p)object2).e())).a(((p)object2).f())).a(((f)object2).b()).b(((f)object2).c()).e(1)).a();
        }
        object2 = m2.b().c(byArray, ((p)object).a());
        if (object instanceof i) {
            object = (i)object;
            object = (i)((j)((j)((j)new j().d(((p)object).e())).a(((p)object).f())).a(((i)object).b()).b(((i)object).c()).c(((i)object).d()).e(2)).a();
        } else if (object instanceof f) {
            object = (f)object;
            object = (f)((h)((h)((h)new h().d(((p)object).e())).a(((p)object).f())).a(((f)object).b()).b(((f)object).c()).e(2)).a();
        }
        object = m2.b().c(byArray, ((p)object).a());
        int n3 = m2.a().c;
        byte[] byArray2 = new byte[2 * n3];
        for (n2 = 0; n2 < n3; ++n2) {
            byArray2[n2] = (byte)(w2.b()[n2] ^ object2[n2]);
        }
        for (n2 = 0; n2 < n3; ++n2) {
            byArray2[n2 + n3] = (byte)(w3.b()[n2] ^ object[n2]);
        }
        byte[] byArray3 = m2.b().b((byte[])object3, byArray2);
        return new w(w2.a(), byArray3);
    }

    protected x(org.bouncycastle.crypto.j j2) {
        if (j2 == null) {
            throw new NullPointerException("digest == null");
        }
        this.b = j2;
        org.bouncycastle.crypto.j j3 = j2;
        if (j3 == null) {
            throw new NullPointerException("digest == null");
        }
        String string = j3.a();
        this.c = string.equals("SHAKE128") ? 32 : (string.equals("SHAKE256") ? 64 : j3.b());
        this.d = 16;
        this.f = (int)Math.ceil((double)(8 * this.c) / (double)ad.a(16));
        this.g = ad.a(this.f * 15) / ad.a(16) + 1;
        this.e = this.f + this.g;
        this.a = n.a(j2.a(), this.c, this.e);
        if (this.a == null) {
            throw new IllegalArgumentException("cannot find OID for digest algorithm: " + j2.a());
        }
    }

    protected final org.bouncycastle.crypto.j a() {
        return this.b;
    }

    protected final int b() {
        return this.c;
    }

    protected final int c() {
        return this.e;
    }
}

