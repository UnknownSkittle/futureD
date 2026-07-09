/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.d.b.e.ab;
import org.bouncycastle.d.b.e.ad;
import org.bouncycastle.d.b.e.y;

public final class ac {
    private final y a;
    private byte[] b = null;
    private byte[] c = null;
    private byte[] d = null;

    public ac(y y2) {
        this.a = y2;
    }

    public final ac a(byte[] byArray) {
        this.b = ad.a(byArray);
        return this;
    }

    public final ac b(byte[] byArray) {
        this.c = ad.a(byArray);
        return this;
    }

    public final ab a() {
        return new ab(this, 0);
    }

    static /* synthetic */ y a(ac ac2) {
        return ac2.a;
    }

    static /* synthetic */ byte[] b(ac ac2) {
        return ac2.b;
    }

    static /* synthetic */ byte[] c(ac ac2) {
        return ac2.c;
    }
}

