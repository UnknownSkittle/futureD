/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.b.af;
import com.a.a.b.y;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class ae<T>
implements Iterator<T> {
    private af<K, V> a;
    private af<K, V> b;
    private int c;
    private /* synthetic */ y d;

    ae(y y2) {
        this.d = y2;
        this.a = this.d.c.d;
        this.b = null;
        this.c = this.d.b;
    }

    @Override
    public final boolean hasNext() {
        return this.a != this.d.c;
    }

    final af<K, V> a() {
        af af2 = this.a;
        if (af2 == this.d.c) {
            throw new NoSuchElementException();
        }
        if (this.d.b != this.c) {
            throw new ConcurrentModificationException();
        }
        this.a = af2.d;
        this.b = af2;
        return this.b;
    }

    @Override
    public final void remove() {
        if (this.b == null) {
            throw new IllegalStateException();
        }
        this.d.a(this.b, true);
        this.b = null;
        this.c = this.d.b;
    }
}

