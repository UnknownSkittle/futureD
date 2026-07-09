/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.b;

import org.a.b.q;

public abstract class a
extends q {
    public final a a() {
        return (a)super.b();
    }

    @Override
    protected final void a(q q2) {
        if (!(q2 instanceof a)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        super.a(q2);
    }
}

