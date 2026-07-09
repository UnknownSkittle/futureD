/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.c;

import java.security.PublicKey;
import org.bouncycastle.asn1.ay;
import org.bouncycastle.asn1.r;
import org.bouncycastle.d.a.e;
import org.bouncycastle.d.a.g;
import org.bouncycastle.e.a;

public final class b
implements PublicKey {
    private short[][] a;
    private short[][] b;
    private short[] c;
    private int d;

    public b(int n2, short[][] sArray, short[][] sArray2, short[] sArray3) {
        this.d = n2;
        this.a = sArray;
        this.b = sArray2;
        this.c = sArray3;
    }

    public b(org.bouncycastle.d.c.c.b b2) {
        this(b2.a(), b2.b(), b2.c(), b2.d());
    }

    public final int a() {
        return this.d;
    }

    public final short[][] b() {
        return this.a;
    }

    public final short[][] c() {
        short[][] sArrayArray = new short[this.b.length][];
        for (int i2 = 0; i2 != this.b.length; ++i2) {
            sArrayArray[i2] = org.bouncycastle.e.a.b(this.b[i2]);
        }
        return sArrayArray;
    }

    public final short[] d() {
        return org.bouncycastle.e.a.b(this.c);
    }

    public final boolean equals(Object object) {
        if (object == null || !(object instanceof b)) {
            return false;
        }
        object = (b)object;
        return this.d == ((b)object).d && org.bouncycastle.asn1.util.a.a(this.a, ((b)object).a) && org.bouncycastle.asn1.util.a.a(this.b, ((b)object).c()) && org.bouncycastle.asn1.util.a.a(this.c, org.bouncycastle.e.a.b(((b)object).c));
    }

    public final int hashCode() {
        return ((this.d * 37 + org.bouncycastle.e.a.a(this.a)) * 37 + org.bouncycastle.e.a.a(this.b)) * 37 + org.bouncycastle.e.a.a(this.c);
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    public final String getFormat() {
        return "X.509";
    }

    public final byte[] getEncoded() {
        g g2 = new g(this.d, this.a, this.b, this.c);
        return r.a(new org.bouncycastle.asn1.j.a(e.a, ay.a), g2);
    }
}

