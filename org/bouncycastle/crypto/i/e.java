/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.i;

import java.math.BigInteger;
import org.bouncycastle.crypto.i.f;

public class e
implements org.bouncycastle.b.e {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private f d;

    public e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, f f2) {
        this.a = bigInteger3;
        this.c = bigInteger;
        this.b = bigInteger2;
        this.d = f2;
    }

    public final BigInteger a() {
        return this.c;
    }

    public final BigInteger b() {
        return this.b;
    }

    public final BigInteger c() {
        return this.a;
    }

    public final f d() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        return ((e)object).c.equals(this.c) && ((e)object).b.equals(this.b) && ((e)object).a.equals(this.a);
    }

    public int hashCode() {
        return this.c.hashCode() ^ this.b.hashCode() ^ this.a.hashCode();
    }
}

