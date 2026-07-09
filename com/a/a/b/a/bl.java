/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ac;
import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.d;
import java.util.concurrent.atomic.AtomicInteger;

final class bl
extends ag<AtomicInteger> {
    bl() {
    }

    private static AtomicInteger a(a a2) {
        try {
            return new AtomicInteger(a2.m());
        } catch (NumberFormatException numberFormatException) {
            throw new ac(numberFormatException);
        }
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        return bl.a(a2);
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        d2.a((long)((AtomicInteger)object).get());
    }
}

