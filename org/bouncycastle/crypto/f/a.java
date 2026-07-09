/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.f;

import org.bouncycastle.crypto.d;
import org.bouncycastle.crypto.i.b;
import org.bouncycastle.math.ec.a.c.bo;

public class a
extends d {
    public void a(bo bo2) {
        super.a(bo2);
        if (this.b == 0 || this.b == 7) {
            this.b = 8;
            return;
        }
        if (this.b != 8) {
            throw new IllegalArgumentException("DES key must be 64 bits long.");
        }
    }

    public byte[] a() {
        byte[] byArray = new byte[8];
        do {
            this.a.nextBytes(byArray);
            org.bouncycastle.crypto.i.b.a(byArray);
        } while (org.bouncycastle.crypto.i.b.a(byArray, 0));
        return byArray;
    }
}

