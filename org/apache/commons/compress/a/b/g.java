/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.a.b;

import org.apache.commons.compress.a.b.b;
import org.apache.commons.compress.a.b.d;
import org.apache.commons.compress.a.b.i;

final class g
extends d {
    private /* synthetic */ b a;

    private g(b b2) {
        this.a = b2;
        super((byte)0);
    }

    @Override
    final int a() {
        return i.a;
    }

    @Override
    final int a(byte[] byArray, int n2, int n3) {
        throw new IllegalStateException("Cannot read in this state");
    }

    @Override
    final boolean b() {
        return false;
    }

    @Override
    final int c() {
        return 0;
    }

    /* synthetic */ g(b b2, byte by2) {
        this(b2);
    }
}

