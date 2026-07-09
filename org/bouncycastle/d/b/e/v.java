/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.d.b.e.ad;
import org.bouncycastle.d.b.e.r;
import org.bouncycastle.d.b.e.u;

public final class v {
    private final r a;
    private byte[] b = null;
    private byte[] c = null;
    private byte[] d = null;

    public v(r r2) {
        this.a = r2;
    }

    public final v a(byte[] byArray) {
        this.b = ad.a(byArray);
        return this;
    }

    public final v b(byte[] byArray) {
        this.c = ad.a(byArray);
        return this;
    }

    public final u a() {
        return new u(this, 0);
    }

    static /* synthetic */ r a(v v2) {
        return v2.a;
    }

    static /* synthetic */ byte[] b(v v2) {
        return v2.b;
    }

    static /* synthetic */ byte[] c(v v2) {
        return v2.c;
    }
}

