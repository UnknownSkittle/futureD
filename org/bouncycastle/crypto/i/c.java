/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.i;

import java.math.BigInteger;
import org.bouncycastle.b.e;
import org.bouncycastle.crypto.i.d;

public class c
implements e {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;
    private int e;
    private int f;
    private d g;

    public c(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int n2, d d2) {
        if (n2 > bigInteger.bitLength()) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.a = bigInteger2;
        this.b = bigInteger;
        this.c = bigInteger3;
        this.e = n2;
        this.f = 0;
        this.d = null;
        this.g = d2;
    }

    public boolean equals(Object object) {
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        if (this.c != null ? !this.c.equals(((c)object).c) : ((c)object).c != null) {
            return false;
        }
        return ((c)object).b.equals(this.b) && ((c)object).a.equals(this.a);
    }

    public int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode() ^ (this.c != null ? this.c.hashCode() : 0);
    }
}

