/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import java.io.Serializable;
import org.bouncycastle.d.b.e.ad;

public final class w
implements Serializable {
    private final int a;
    private final byte[] b;

    protected w(int n2, byte[] byArray) {
        this.a = n2;
        this.b = byArray;
    }

    public final int a() {
        return this.a;
    }

    public final byte[] b() {
        return ad.a(this.b);
    }

    protected final w c() {
        return new w(this.a, ad.a(this.b));
    }

    protected final /* synthetic */ Object clone() {
        return this.c();
    }
}

