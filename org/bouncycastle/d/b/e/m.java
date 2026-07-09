/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.d.b.e.ad;
import org.bouncycastle.d.b.e.g;
import org.bouncycastle.d.b.e.k;
import org.bouncycastle.d.b.e.l;
import org.bouncycastle.d.b.e.o;
import org.bouncycastle.d.b.e.p;
import org.bouncycastle.d.b.e.x;

final class m {
    private final x a;
    private final g b;
    private byte[] c;
    private byte[] d;

    protected m(x x2) {
        this.a = x2;
        int n2 = x2.b();
        this.b = new g(x2.a(), n2);
        this.c = new byte[n2];
        this.d = new byte[n2];
    }

    final void a(byte[] byArray, byte[] byArray2) {
        if (byArray == null) {
            throw new NullPointerException("secretKeySeed == null");
        }
        if (byArray.length != this.a.b()) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (byArray2 == null) {
            throw new NullPointerException("publicSeed == null");
        }
        if (byArray2.length != this.a.b()) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.c = byArray;
        this.d = byArray2;
    }

    private byte[] a(byte[] byArray, int n2, int n3, k object) {
        int n4 = this.a.b();
        if (byArray == null) {
            throw new NullPointerException("startHash == null");
        }
        if (byArray.length != n4) {
            throw new IllegalArgumentException("startHash needs to be " + n4 + "bytes");
        }
        if (object == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (((k)object).a() == null) {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
        if (n2 + n3 > 15) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (n3 == 0) {
            return byArray;
        }
        byArray = this.a(byArray, n2, n3 - 1, (k)object);
        object = (k)((l)((l)((l)new l().d(((p)object).e())).a(((p)object).f())).a(((k)object).b()).b(((k)object).c()).c(n2 + n3 - 1).e(0)).a();
        byte[] byArray2 = this.b.c(this.d, ((k)object).a());
        object = (k)((l)((l)((l)new l().d(((p)object).e())).a(((p)object).f())).a(((k)object).b()).b(((k)object).c()).c(((k)object).d()).e(1)).a();
        byte[] byArray3 = this.b.c(this.d, ((k)object).a());
        object = new byte[n4];
        for (int i2 = 0; i2 < n4; ++i2) {
            object[i2] = (byte)(byArray[i2] ^ byArray3[i2]);
        }
        return this.b.a(byArray2, (byte[])object);
    }

    protected final byte[] a(byte[] byArray, k k2) {
        k2 = (k)((l)((l)new l().d(k2.e())).a(k2.f())).a(k2.b()).a();
        return this.b.c(byArray, k2.a());
    }

    protected final x a() {
        return this.a;
    }

    protected final g b() {
        return this.b;
    }

    protected final byte[] c() {
        return ad.a(this.d);
    }

    protected final o a(k k2) {
        if (k2 == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        byte[][] byArrayArray = new byte[this.a.c()][];
        for (int i2 = 0; i2 < this.a.c(); ++i2) {
            k2 = (k)((l)((l)((l)new l().d(k2.e())).a(k2.f())).a(k2.b()).b(i2).c(k2.d()).e(k2.g())).a();
            int n2 = i2;
            m m2 = this;
            if (n2 < 0 || n2 >= m2.a.c()) {
                throw new IllegalArgumentException("index out of bounds");
            }
            byArrayArray[i2] = m2.a(m2.b.c(m2.c, ad.a((long)n2, 32)), 0, 15, k2);
        }
        return new o(this.a, byArrayArray);
    }
}

