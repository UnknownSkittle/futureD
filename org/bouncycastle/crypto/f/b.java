/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.f;

import org.bouncycastle.crypto.f.a;
import org.bouncycastle.math.ec.a.c.bo;

public final class b
extends a {
    public final void a(bo bo2) {
        this.a = bo2.i();
        this.b = (bo2.j() + 7) / 8;
        if (this.b == 0 || this.b == 21) {
            this.b = 24;
            return;
        }
        if (this.b == 14) {
            this.b = 16;
            return;
        }
        if (this.b != 24 && this.b != 16) {
            throw new IllegalArgumentException("DESede key must be 192 or 128 bits long.");
        }
    }

    public final byte[] a() {
        byte[] byArray = new byte[this.b];
        int n2 = 0;
        do {
            this.a.nextBytes(byArray);
            org.bouncycastle.crypto.i.b.a(byArray);
        } while (++n2 < 20 && (org.bouncycastle.crypto.i.b.b(byArray, byArray.length) || !org.bouncycastle.crypto.i.b.b(byArray)));
        if (org.bouncycastle.crypto.i.b.b(byArray, byArray.length) || !org.bouncycastle.crypto.i.b.b(byArray)) {
            throw new IllegalStateException("Unable to generate DES-EDE key");
        }
        return byArray;
    }
}

