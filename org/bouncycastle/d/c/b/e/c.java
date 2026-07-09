/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.e;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.f.b;
import org.bouncycastle.asn1.n;
import org.bouncycastle.d.a.i;
import org.bouncycastle.d.a.l;
import org.bouncycastle.d.b.e.a;
import org.bouncycastle.d.b.e.aa;
import org.bouncycastle.d.b.e.ad;
import org.bouncycastle.d.b.e.y;
import org.bouncycastle.d.b.e.z;
import org.bouncycastle.d.c.b.e.e;

public final class c
implements PrivateKey {
    private final z a;
    private final n b;

    public c(b m2) {
        Object object = i.a(((b)m2).a().b());
        this.b = ((i)object).b().a();
        m2 = l.a(((b)m2).b());
        try {
            object = new aa(new y(((i)object).a(), e.a(this.b))).a(((l)m2).a()).a(((l)m2).b()).b(((l)m2).c()).c(((l)m2).d()).d(((l)m2).e());
            if (((l)m2).f() != null) {
                ((aa)object).a((a)ad.a(((l)m2).f(), a.class));
            }
            this.a = ((aa)object).a();
            return;
        } catch (ClassNotFoundException classNotFoundException) {
            throw new IOException("ClassNotFoundException processing BDS state: " + classNotFoundException.getMessage());
        }
    }

    public final String getAlgorithm() {
        return "XMSS";
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final byte[] getEncoded() {
        try {
            Object object = new org.bouncycastle.asn1.j.a(org.bouncycastle.d.a.e.g, new i(this.a.c().c(), new org.bouncycastle.asn1.j.a(this.b)));
            org.bouncycastle.asn1.j.a a2 = object;
            object = this;
            byte[] byArray = ((c)object).a.b();
            int n2 = ((c)object).a.c().b();
            int n3 = ((c)object).a.c().c();
            int n4 = n2;
            int n5 = n2;
            int n6 = n2;
            int n7 = (int)ad.a(byArray, 4);
            if (!ad.a(n3, (long)n7)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            byte[] byArray2 = ad.a(byArray, 4, n4);
            n3 = n4 + 4;
            byte[] byArray3 = ad.a(byArray, n3, n5);
            byte[] byArray4 = ad.a(byArray, n3 += n5, n6);
            byte[] byArray5 = ad.a(byArray, n3 += n6, n2);
            byte[] byArray6 = ad.a(byArray, n3 += n2, byArray.length - n3);
            return new b(a2, new l(n7, byArray2, byArray3, byArray4, byArray5, byArray6)).j();
        } catch (IOException iOException) {
            return null;
        }
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof c) {
            object = (c)object;
            return this.b.equals(((c)object).b) && org.bouncycastle.e.a.a(this.a.b(), ((c)object).a.b());
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + 37 * org.bouncycastle.e.a.c(this.a.b());
    }
}

