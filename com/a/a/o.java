/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.d;
import java.util.concurrent.atomic.AtomicLong;

final class o
extends ag<AtomicLong> {
    private /* synthetic */ ag a;

    o(ag ag2) {
        this.a = ag2;
    }

    @Override
    public final /* synthetic */ Object read(a object) {
        object = (Number)this.a.read((a)object);
        return new AtomicLong(((Number)object).longValue());
    }

    @Override
    public final /* synthetic */ void write(d object, Object object2) {
        d d2 = object;
        object = (AtomicLong)object2;
        object2 = d2;
        this.a.write((d)object2, ((AtomicLong)object).get());
    }
}

