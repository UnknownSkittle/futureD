/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.a;

import java.math.BigInteger;
import org.bouncycastle.math.a.a;
import org.bouncycastle.math.a.e;
import org.bouncycastle.math.a.f;

final class d
implements f {
    private a a;
    private e b;

    d(a a2, e e2) {
        this.a = a2;
        this.b = e2;
    }

    public final BigInteger a() {
        return this.a.a();
    }

    public final int b() {
        return this.a.b() * this.b.a();
    }

    public final e c() {
        return this.b;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d)) {
            return false;
        }
        object = (d)object;
        return this.a.equals(((d)object).a) && this.b.equals(((d)object).b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Integer.rotateLeft(this.b.hashCode(), 16);
    }
}

