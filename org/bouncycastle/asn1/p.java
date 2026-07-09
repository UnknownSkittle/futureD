/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.z;
import org.bouncycastle.e.a;
import org.bouncycastle.e.k;

public abstract class p
extends u
implements q {
    byte[] a;

    public static p a(z z2) {
        return p.a(z2.i());
    }

    public static p a(Object object) {
        u u2;
        if (object == null || object instanceof p) {
            return (p)object;
        }
        if (object instanceof byte[]) {
            try {
                return p.a(u.b((byte[])object));
            } catch (IOException iOException) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + iOException.getMessage());
            }
        }
        if (object instanceof f && (u2 = ((f)object).h()) instanceof p) {
            return (p)u2;
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + object.getClass().getName());
    }

    public p(byte[] byArray) {
        if (byArray == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.a = byArray;
    }

    public final InputStream b() {
        return new ByteArrayInputStream(this.a);
    }

    public byte[] c() {
        return this.a;
    }

    public int hashCode() {
        return org.bouncycastle.e.a.c(this.c());
    }

    final boolean a(u u2) {
        if (!(u2 instanceof p)) {
            return false;
        }
        u2 = (p)u2;
        return org.bouncycastle.e.a.a(this.a, ((p)u2).a);
    }

    public final u d() {
        return this.h();
    }

    final u f() {
        return new ba(this.a);
    }

    final u g() {
        return new ba(this.a);
    }

    abstract void a(r var1);

    public String toString() {
        return "#" + k.b(org.bouncycastle.e.a.f.b(this.a));
    }
}

