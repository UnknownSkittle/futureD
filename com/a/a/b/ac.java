/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.b.ad;
import com.a.a.b.y;
import java.util.AbstractSet;
import java.util.Iterator;

final class ac
extends AbstractSet<K> {
    final /* synthetic */ y a;

    ac(y y2) {
        this.a = y2;
    }

    @Override
    public final int size() {
        return this.a.a;
    }

    @Override
    public final Iterator<K> iterator() {
        return new ad(this);
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public final boolean remove(Object object) {
        return this.a.a(object) != null;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }
}

