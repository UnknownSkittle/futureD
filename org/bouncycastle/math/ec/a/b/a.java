/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.b;

import java.math.BigInteger;
import org.bouncycastle.math.ec.a.b.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.f;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class a
extends f {
    public static final BigInteger h = new BigInteger(1, org.bouncycastle.e.a.f.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));
    private org.bouncycastle.math.ec.a.b.d i = new org.bouncycastle.math.ec.a.b.d(this);

    public a() {
        super(h);
        this.a = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC")));
        this.b = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93")));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"));
        this.d = BigInteger.valueOf(1L);
        this.e = 2;
    }

    protected final d c() {
        return new a();
    }

    public final boolean a(int n2) {
        switch (n2) {
            case 2: {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        return h.bitLength();
    }

    public final j a(BigInteger bigInteger) {
        return new c(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new org.bouncycastle.math.ec.a.b.d((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new org.bouncycastle.math.ec.a.b.d(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.i;
    }
}

