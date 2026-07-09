/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.c;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.asn1.ay;
import org.bouncycastle.asn1.f.b;
import org.bouncycastle.asn1.m;
import org.bouncycastle.d.a.e;
import org.bouncycastle.d.a.f;

public final class a
implements PrivateKey {
    private short[][] a;
    private short[] b;
    private short[][] c;
    private short[] d;
    private org.bouncycastle.d.b.c.a[] e;
    private int[] f;

    public a(short[][] sArray, short[] sArray2, short[][] sArray3, short[] sArray4, int[] nArray, org.bouncycastle.d.b.c.a[] aArray) {
        this.a = sArray;
        this.b = sArray2;
        this.c = sArray3;
        this.d = sArray4;
        this.f = nArray;
        this.e = aArray;
    }

    public a(org.bouncycastle.d.c.c.a a2) {
        this(a2.b(), a2.a(), a2.d(), a2.c(), a2.f(), a2.e());
    }

    public final short[][] a() {
        return this.a;
    }

    public final short[] b() {
        return this.b;
    }

    public final short[] c() {
        return this.d;
    }

    public final short[][] d() {
        return this.c;
    }

    public final org.bouncycastle.d.b.c.a[] e() {
        return this.e;
    }

    public final int[] f() {
        return this.f;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        if (object == null || !(object instanceof a)) {
            return false;
        }
        object = (a)object;
        boolean bl3 = bl2 = org.bouncycastle.asn1.util.a.a(this.a, ((a)object).a) && org.bouncycastle.asn1.util.a.a(this.c, ((a)object).c) && org.bouncycastle.asn1.util.a.a(this.b, ((a)object).b) && org.bouncycastle.asn1.util.a.a(this.d, ((a)object).d) && Arrays.equals(this.f, ((a)object).f);
        if (this.e.length != ((a)object).e.length) {
            return false;
        }
        for (int i2 = this.e.length - 1; i2 >= 0; --i2) {
            bl2 &= this.e[i2].equals(((a)object).e[i2]);
        }
        return bl2;
    }

    public final int hashCode() {
        int n2 = ((((this.e.length * 37 + org.bouncycastle.e.a.a(this.a)) * 37 + org.bouncycastle.e.a.a(this.b)) * 37 + org.bouncycastle.e.a.a(this.c)) * 37 + org.bouncycastle.e.a.a(this.d)) * 37 + org.bouncycastle.e.a.a(this.f);
        for (int i2 = this.e.length - 1; i2 >= 0; --i2) {
            n2 = n2 * 37 + this.e[i2].hashCode();
        }
        return n2;
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    public final byte[] getEncoded() {
        m m2 = new f(this.a, this.b, this.c, this.d, this.f, this.e);
        try {
            org.bouncycastle.asn1.j.a a2 = new org.bouncycastle.asn1.j.a(org.bouncycastle.d.a.e.a, ay.a);
            m2 = new b(a2, m2);
        } catch (IOException iOException) {
            return null;
        }
        try {
            return m2.j();
        } catch (IOException iOException) {
            return null;
        }
    }

    public final String getFormat() {
        return "PKCS#8";
    }
}

