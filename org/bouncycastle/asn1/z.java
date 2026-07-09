/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.bj;
import org.bouncycastle.asn1.bs;
import org.bouncycastle.asn1.e;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;

public abstract class z
extends u
implements b {
    int a;
    private boolean d = false;
    boolean b = true;
    f c = null;

    public z(boolean bl2, int n2, f f2) {
        this.b = f2 instanceof e ? true : bl2;
        this.a = n2;
        if (this.b) {
            this.c = f2;
            return;
        }
        f2.h();
        this.c = f2;
    }

    final boolean a(u u2) {
        if (!(u2 instanceof z)) {
            return false;
        }
        u2 = (z)u2;
        if (this.a != ((z)u2).a || this.b != ((z)u2).b) {
            return false;
        }
        return !(this.c == null ? ((z)u2).c != null : !this.c.h().equals(((z)u2).c.h()));
    }

    public int hashCode() {
        int n2 = this.a;
        if (this.c != null) {
            n2 ^= this.c.hashCode();
        }
        return n2;
    }

    public final int b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final u i() {
        if (this.c != null) {
            return this.c.h();
        }
        return null;
    }

    public final u d() {
        return this.h();
    }

    final u f() {
        return new bj(this.b, this.a, this.c);
    }

    final u g() {
        return new bs(this.b, this.a, this.c);
    }

    abstract void a(r var1);

    public String toString() {
        return "[" + this.a + "]" + this.c;
    }
}

