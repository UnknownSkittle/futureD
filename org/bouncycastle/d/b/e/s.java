/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import java.io.IOException;
import org.bouncycastle.crypto.i.a;
import org.bouncycastle.d.b.e.ad;
import org.bouncycastle.d.b.e.b;
import org.bouncycastle.d.b.e.r;
import org.bouncycastle.d.b.e.t;

public final class s
extends a {
    private final r a;
    private final long b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final b g;

    private s(t t2) {
        super(true);
        this.a = t.a(t2);
        if (this.a == null) {
            throw new NullPointerException("params == null");
        }
        int n2 = this.a.d();
        this.b = t.b(t2);
        byte[] byArray = t.c(t2);
        if (byArray != null) {
            if (byArray.length != n2) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.c = byArray;
        } else {
            this.c = new byte[n2];
        }
        byte[] byArray2 = t.d(t2);
        if (byArray2 != null) {
            if (byArray2.length != n2) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.d = byArray2;
        } else {
            this.d = new byte[n2];
        }
        byArray2 = t.e(t2);
        if (byArray2 != null) {
            if (byArray2.length != n2) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.e = byArray2;
        } else {
            this.e = new byte[n2];
        }
        byte[] byArray3 = t.f(t2);
        if (byArray3 != null) {
            if (byArray3.length != n2) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f = byArray3;
        } else {
            this.f = new byte[n2];
        }
        b b2 = t.g(t2);
        if (b2 != null) {
            this.g = b2;
            return;
        }
        long l2 = t.b(t2);
        if (ad.a(this.a.a(), l2) && byArray2 != null && byArray != null) {
            this.g = new b(this.a, t.b(t2), byArray2, byArray);
            return;
        }
        this.g = new b();
    }

    public final byte[] b() {
        int n2 = this.a.d();
        int n3 = (this.a.a() + 7) / 8;
        int n4 = n2;
        int n5 = n2;
        int n6 = n2;
        byte[] byArray = new byte[n3 + n4 + n5 + n6 + n2];
        byte[] byArray2 = ad.a(this.b, n3);
        ad.a(byArray, byArray2, 0);
        ad.a(byArray, this.c, n3);
        ad.a(byArray, this.d, n3 += n4);
        ad.a(byArray, this.e, n3 += n5);
        ad.a(byArray, this.f, n3 += n6);
        try {
            return org.bouncycastle.e.a.c(byArray, ad.a(this.g));
        } catch (IOException iOException) {
            throw new IllegalStateException("error serializing bds state: " + iOException.getMessage(), iOException);
        }
    }

    public final r c() {
        return this.a;
    }

    /* synthetic */ s(t t2, byte by2) {
        this(t2);
    }
}

