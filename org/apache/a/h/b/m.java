/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.b;

import java.io.Closeable;
import org.apache.a.e.h;
import org.apache.a.h.b.l;

final class m
implements Closeable {
    private /* synthetic */ h a;
    private /* synthetic */ l b;

    m(l l2, h h2) {
        this.b = l2;
        this.a = h2;
    }

    @Override
    public final void close() {
        this.a.a();
    }
}

