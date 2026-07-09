/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.crypto.i.a;
import org.bouncycastle.d.b.e.ac;
import org.bouncycastle.d.b.e.ad;
import org.bouncycastle.d.b.e.y;

public final class ab
extends a {
    private final y a;
    private final byte[] b;
    private final byte[] c;

    private ab(ac object) {
        super(false);
        this.a = ac.a((ac)object);
        if (this.a == null) {
            throw new NullPointerException("params == null");
        }
        int n2 = this.a.b();
        byte[] byArray = ac.b((ac)object);
        if (byArray != null) {
            if (byArray.length != n2) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.b = byArray;
        } else {
            this.b = new byte[n2];
        }
        byte[] byArray2 = ac.c((ac)object);
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
        int n3 = n2 = this.a.b();
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

    public final y e() {
        return this.a;
    }

    /* synthetic */ ab(ac ac2, byte by2) {
        this(ac2);
    }
}

