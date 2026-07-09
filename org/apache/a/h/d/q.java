/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import org.apache.a.f.j;
import org.apache.a.f.k;
import org.apache.a.h.d.p;

public final class q
implements k {
    private volatile j a;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final j a() {
        if (this.a == null) {
            q q2 = this;
            synchronized (q2) {
                if (this.a == null) {
                    this.a = new p();
                }
            }
        }
        return this.a;
    }
}

