/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import org.bouncycastle.math.ec.j;

public abstract class k
extends j {
    public int m() {
        j j2;
        int n2 = this.b();
        j j3 = j2 = this;
        for (int i2 = 1; i2 < n2; ++i2) {
            j2 = j2.e();
            j3 = j3.a(j2);
        }
        if (j3.j()) {
            return 0;
        }
        if (j3.i()) {
            return 1;
        }
        throw new IllegalStateException("Internal error in trace calculation");
    }
}

