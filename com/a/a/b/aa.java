/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.b.ab;
import com.a.a.b.y;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class aa
extends AbstractSet<Map.Entry<K, V>> {
    final /* synthetic */ y a;

    aa(y y2) {
        this.a = y2;
    }

    @Override
    public final int size() {
        return this.a.a;
    }

    @Override
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new ab(this);
    }

    @Override
    public final boolean contains(Object object) {
        return object instanceof Map.Entry && this.a.a((Map.Entry)object) != null;
    }

    @Override
    public final boolean remove(Object af2) {
        if (!(af2 instanceof Map.Entry)) {
            return false;
        }
        if ((af2 = this.a.a(af2)) == null) {
            return false;
        }
        this.a.a(af2, true);
        return true;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }
}

