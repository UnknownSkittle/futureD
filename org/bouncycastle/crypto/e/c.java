/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.e;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.b.e;
import org.bouncycastle.crypto.a;
import org.bouncycastle.crypto.e.d;
import org.bouncycastle.crypto.g;
import org.bouncycastle.crypto.i.j;
import org.bouncycastle.crypto.i.l;
import org.bouncycastle.crypto.i.m;

public final class c
implements a {
    private static final BigInteger a = BigInteger.valueOf(1L);
    private d b = new d();
    private l c;
    private SecureRandom d;

    public final void a(boolean bl2, e e2) {
        this.b.a(bl2, e2);
        if (e2 instanceof j) {
            j j2 = (j)e2;
            this.c = (l)j2.b();
            this.d = j2.a();
            return;
        }
        this.c = (l)e2;
        this.d = g.a();
    }

    public final int a() {
        return this.b.a();
    }

    public final int b() {
        return this.b.b();
    }

    public final byte[] a(byte[] object, int n2, int n3) {
        Object object2;
        if (this.c == null) {
            throw new IllegalStateException("RSA engine not initialised");
        }
        object = this.b.a((byte[])object, n2, n3);
        if (this.c instanceof m) {
            object2 = (m)this.c;
            BigInteger bigInteger = ((m)object2).d();
            if (bigInteger != null) {
                BigInteger bigInteger2 = ((l)object2).b();
                object2 = org.bouncycastle.e.c.a(a, bigInteger2.subtract(a), this.d);
                BigInteger bigInteger3 = ((BigInteger)object2).modPow(bigInteger, bigInteger2).multiply((BigInteger)object).mod(bigInteger2);
                bigInteger3 = this.b.b(bigInteger3);
                object2 = ((BigInteger)object2).modInverse(bigInteger2);
                if (!((BigInteger)object).equals(((BigInteger)(object2 = bigInteger3.multiply((BigInteger)object2).mod(bigInteger2))).modPow(bigInteger, bigInteger2))) {
                    throw new IllegalStateException("RSA engine faulty decryption/signing detected");
                }
            } else {
                object2 = this.b.b((BigInteger)object);
            }
        } else {
            object2 = this.b.b((BigInteger)object);
        }
        return this.b.a((BigInteger)object2);
    }
}

