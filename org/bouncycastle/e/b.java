/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.e;

import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class b<T>
implements Iterator<T> {
    private final T[] a;
    private int b = 0;

    public b(T[] TArray) {
        this.a = TArray;
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override
    public final T next() {
        if (this.b == this.a.length) {
            throw new NoSuchElementException("Out of elements: " + this.b);
        }
        return this.a[this.b++];
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove element from an Array.");
    }
}

