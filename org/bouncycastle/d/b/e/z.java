/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import java.io.IOException;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.d.b.e.a;
import org.bouncycastle.d.b.e.aa;
import org.bouncycastle.d.b.e.ad;
import org.bouncycastle.d.b.e.k;
import org.bouncycastle.d.b.e.l;
import org.bouncycastle.d.b.e.y;

public final class z
extends org.bouncycastle.crypto.i.a {
    private final y a;
    private final byte[] b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private final a f;

    private z(aa aa2) {
        super(true);
        this.a = aa.a(aa2);
        if (this.a == null) {
            throw new NullPointerException("params == null");
        }
        int n2 = this.a.b();
        byte[] byArray = aa.b(aa2);
        if (byArray != null) {
            if (byArray.length != n2) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.b = byArray;
        } else {
            this.b = new byte[n2];
        }
        byte[] byArray2 = aa.c(aa2);
        if (byArray2 != null) {
            if (byArray2.length != n2) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.c = byArray2;
        } else {
            this.c = new byte[n2];
        }
        byArray2 = aa.d(aa2);
        if (byArray2 != null) {
            if (byArray2.length != n2) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.d = byArray2;
        } else {
            this.d = new byte[n2];
        }
        byte[] byArray3 = aa.e(aa2);
        if (byArray3 != null) {
            if (byArray3.length != n2) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.e = byArray3;
        } else {
            this.e = new byte[n2];
        }
        a a2 = aa.f(aa2);
        if (a2 != null) {
            this.f = a2;
            return;
        }
        if (aa.g(aa2) < (1 << this.a.c()) - 2 && byArray2 != null && byArray != null) {
            this.f = new a(this.a, byArray2, byArray, (k)new l().a(), aa.g(aa2));
            return;
        }
        this.f = new a(this.a, aa.g(aa2));
    }

    public final byte[] b() {
        byte[] byArray;
        int n2;
        int n3 = n2 = this.a.b();
        int n4 = n2;
        int n5 = n2;
        byte[] byArray2 = new byte[n3 + 4 + n4 + n5 + n2];
        ab.a(this.f.a(), byArray2, 0);
        ad.a(byArray2, this.b, 4);
        ad.a(byArray2, this.c, n3 += 4);
        ad.a(byArray2, this.d, n3 += n4);
        ad.a(byArray2, this.e, n3 += n5);
        try {
            byArray = ad.a(this.f);
        } catch (IOException iOException) {
            throw new RuntimeException("error serializing bds state: " + iOException.getMessage());
        }
        return org.bouncycastle.e.a.c(byArray2, byArray);
    }

    public final y c() {
        return this.a;
    }

    /* synthetic */ z(aa aa2, byte by2) {
        this(aa2);
    }
}

