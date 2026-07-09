/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.crypto.i.a;
import org.bouncycastle.d.b.e.ad;
import org.bouncycastle.d.b.e.r;
import org.bouncycastle.d.b.e.v;

public final class u
extends a {
    private final r a;
    private final byte[] b;
    private final byte[] c;

    private u(v object) {
        super(false);
        this.a = v.a((v)object);
        if (this.a == null) {
            throw new NullPointerException("params == null");
        }
        int n2 = this.a.d();
        byte[] byArray = v.b((v)object);
        if (byArray != null) {
            if (byArray.length != n2) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.b = byArray;
        } else {
            this.b = new byte[n2];
        }
        byte[] byArray2 = v.c((v)object);
        object = byArray2;
        if (byArray2 != null) {
            if (((Object)object).length != n2) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.c = (byte[])object;
            return;
        }
        this.c = new byte[n2];
    }

    public final byte[] b() {
        int n2;
        int n3 = n2 = this.a.d();
        byte[] byArray = new byte[n2 + n2];
        ad.a(byArray, this.b, 0);
        ad.a(byArray, this.c, n3);
        return byArray;
    }

    public final byte[] c() {
        return ad.a(this.b);
    }

    public final byte[] d() {
        return ad.a(this.c);
    }

    public final r e() {
        return this.a;
    }

    /* synthetic */ u(v v2, byte by2) {
        this(v2);
    }
}

