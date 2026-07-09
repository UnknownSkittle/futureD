/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.bj;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.asn1.z;

public final class ar
extends u {
    private n a;
    private k b;
    private u c;
    private int d;
    private u e;

    public ar(a object) {
        int n2 = 0;
        u u2 = ar.a((a)object, 0);
        if (u2 instanceof n) {
            this.a = (n)u2;
            ++n2;
            u2 = ar.a((a)object, 1);
        }
        if (u2 instanceof k) {
            this.b = (k)u2;
            u2 = ar.a((a)object, ++n2);
        }
        if (!(u2 instanceof z)) {
            this.c = u2;
            u2 = ar.a((a)object, ++n2);
        }
        if (((a)object).a() != n2 + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(u2 instanceof z)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        object = (z)u2;
        int n3 = ((z)object).a;
        ar ar2 = this;
        if (n3 < 0 || n3 > 2) {
            throw new IllegalArgumentException("invalid encoding value: ".concat(String.valueOf(n3)));
        }
        ar2.d = n3;
        this.e = ((z)object).i();
    }

    private static u a(a a2, int n2) {
        if (a2.a() <= n2) {
            throw new IllegalArgumentException("too few objects in input vector");
        }
        return a2.a(n2).h();
    }

    public final int hashCode() {
        int n2 = 0;
        if (this.a != null) {
            n2 = this.a.hashCode();
        }
        if (this.b != null) {
            n2 ^= this.b.hashCode();
        }
        if (this.c != null) {
            n2 ^= this.c.hashCode();
        }
        return n2 ^ this.e.hashCode();
    }

    final boolean a() {
        return true;
    }

    final int e() {
        return this.j().length;
    }

    final void a(r r2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this.a != null) {
            byteArrayOutputStream.write(this.a.a("DER"));
        }
        if (this.b != null) {
            byteArrayOutputStream.write(this.b.a("DER"));
        }
        if (this.c != null) {
            byteArrayOutputStream.write(this.c.a("DER"));
        }
        bj bj2 = new bj(true, this.d, this.e);
        byteArrayOutputStream.write(bj2.a("DER"));
        r2.a(32, 8, byteArrayOutputStream.toByteArray());
    }

    final boolean a(u u2) {
        if (!(u2 instanceof ar)) {
            return false;
        }
        if (this == u2) {
            return true;
        }
        u2 = (ar)u2;
        if (!(this.a == null || ((ar)u2).a != null && ((ar)u2).a.equals(this.a))) {
            return false;
        }
        if (!(this.b == null || ((ar)u2).b != null && ((ar)u2).b.equals(this.b))) {
            return false;
        }
        if (!(this.c == null || ((ar)u2).c != null && ((ar)u2).c.equals(this.c))) {
            return false;
        }
        return this.e.equals(((ar)u2).e);
    }

    public final u b() {
        return this.c;
    }

    public final n c() {
        return this.a;
    }

    public final int d() {
        return this.d;
    }

    public final u i() {
        return this.e;
    }

    public final k k() {
        return this.b;
    }
}

