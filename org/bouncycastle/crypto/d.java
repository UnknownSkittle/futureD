/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto;

import java.security.SecureRandom;
import org.bouncycastle.math.ec.a.c.bo;

public class d {
    protected SecureRandom a;
    protected int b;

    public void a(bo bo2) {
        this.a = bo2.i();
        this.b = (bo2.j() + 7) / 8;
    }

    public byte[] a() {
        byte[] byArray = new byte[this.b];
        this.a.nextBytes(byArray);
        return byArray;
    }
}

