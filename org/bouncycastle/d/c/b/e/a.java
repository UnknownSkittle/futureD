/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.e;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.n;
import org.bouncycastle.d.a.j;
import org.bouncycastle.d.a.k;
import org.bouncycastle.d.a.l;
import org.bouncycastle.d.b.e.ad;
import org.bouncycastle.d.b.e.b;
import org.bouncycastle.d.b.e.r;
import org.bouncycastle.d.b.e.s;
import org.bouncycastle.d.b.e.t;
import org.bouncycastle.d.c.b.e.e;

public final class a
implements PrivateKey {
    private final n a;
    private final s b;

    public a(org.bouncycastle.asn1.f.b m2) {
        Object object = j.a(((org.bouncycastle.asn1.f.b)m2).a().b());
        this.a = ((j)object).c().a();
        m2 = l.a(((org.bouncycastle.asn1.f.b)m2).b());
        try {
            object = new t(new r(((j)object).a(), ((j)object).b(), e.a(this.a))).a(((l)m2).a()).a(((l)m2).b()).b(((l)m2).c()).c(((l)m2).d()).d(((l)m2).e());
            if (((l)m2).f() != null) {
                ((t)object).a((b)ad.a(((l)m2).f(), b.class));
            }
            this.b = ((t)object).a();
            return;
        } catch (ClassNotFoundException classNotFoundException) {
            throw new IOException("ClassNotFoundException processing BDS state: " + classNotFoundException.getMessage());
        }
    }

    public final String getAlgorithm() {
        return "XMSSMT";
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final byte[] getEncoded() {
        try {
            Object object = new org.bouncycastle.asn1.j.a(org.bouncycastle.d.a.e.h, new j(this.b.c().a(), this.b.c().b(), new org.bouncycastle.asn1.j.a(this.a)));
            org.bouncycastle.asn1.j.a a2 = object;
            object = this;
            byte[] byArray = ((a)object).b.b();
            int n2 = ((a)object).b.c().d();
            int n3 = ((a)object).b.c().a();
            int n4 = (n3 + 7) / 8;
            int n5 = n2;
            int n6 = n2;
            int n7 = n2;
            int n8 = (int)ad.a(byArray, n4);
            if (!ad.a(n3, (long)n8)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            n3 = n4;
            byte[] byArray2 = ad.a(byArray, n3, n5);
            byte[] byArray3 = ad.a(byArray, n3 += n5, n6);
            byte[] byArray4 = ad.a(byArray, n3 += n6, n7);
            byte[] byArray5 = ad.a(byArray, n3 += n7, n2);
            byte[] byArray6 = ad.a(byArray, n3 += n2, byArray.length - n3);
            return new org.bouncycastle.asn1.f.b(a2, new k(n8, byArray2, byArray3, byArray4, byArray5, byArray6)).j();
        } catch (IOException iOException) {
            return null;
        }
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof a) {
            object = (a)object;
            return this.a.equals(((a)object).a) && org.bouncycastle.e.a.a(this.b.b(), ((a)object).b.b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 37 * org.bouncycastle.e.a.c(this.b.b());
    }
}

