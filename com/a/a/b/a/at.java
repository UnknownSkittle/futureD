/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.d;
import java.util.Currency;

final class at
extends ag<Currency> {
    at() {
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        return Currency.getInstance(a2.h());
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        d2.b(((Currency)object).getCurrencyCode());
    }
}

