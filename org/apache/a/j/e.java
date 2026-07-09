/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import java.util.NoSuchElementException;
import org.apache.a.h;

public final class e
implements h {
    private org.apache.a.e[] a;
    private int b;
    private String c;

    public e(org.apache.a.e[] eArray) {
        this.a = ai.a(eArray, "Header array");
        this.c = null;
        this.b = this.a(-1);
    }

    private int a(int n2) {
        if (n2 < -1) {
            return -1;
        }
        int n3 = this.a.length - 1;
        boolean bl2 = false;
        while (!bl2 && n2 < n3) {
            ++n2;
            bl2 = true;
        }
        if (bl2) {
            return n2;
        }
        return -1;
    }

    @Override
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override
    public final org.apache.a.e a() {
        int n2 = this.b;
        if (n2 < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.b = this.a(n2);
        return this.a[n2];
    }

    @Override
    public final Object next() {
        return this.a();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Removing headers is not supported.");
    }
}

