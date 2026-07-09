/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.d;
import java.util.concurrent.atomic.AtomicBoolean;

final class bm
extends ag<AtomicBoolean> {
    bm() {
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        return new AtomicBoolean(a2.i());
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        d2.a(((AtomicBoolean)object).get());
    }
}

