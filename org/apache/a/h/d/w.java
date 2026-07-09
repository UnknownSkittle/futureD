/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import org.apache.a.f.j;
import org.apache.a.f.k;
import org.apache.a.h.d.v;

public final class w
implements k {
    private final String[] a = null;
    private volatile j b;

    private w() {
    }

    public w(byte by2) {
        this();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final j a() {
        if (this.b == null) {
            w w2 = this;
            synchronized (w2) {
                if (this.b == null) {
                    this.b = new v();
                }
            }
        }
        return this.b;
    }
}

