/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.bouncycastle.openpgp.af;
import org.bouncycastle.openpgp.v;

final class w
implements Iterator {
    private boolean a = false;
    private Object b = null;
    private /* synthetic */ v c;

    w(v v2) {
        this.c = v2;
    }

    public final boolean hasNext() {
        if (!this.a) {
            this.a = true;
            this.b = this.a();
        }
        return this.b != null;
    }

    public final Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove element from factory.");
    }

    private Object a() {
        try {
            return this.c.a();
        } catch (IOException iOException) {
            throw new af("Iterator failed to get next object: " + iOException.getMessage(), iOException);
        }
    }
}

