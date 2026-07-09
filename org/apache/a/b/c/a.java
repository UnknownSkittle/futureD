/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.c;

import com.a.a.b.ai;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.a.b.c.e;
import org.apache.a.q;

public abstract class a
extends org.apache.a.j.a
implements Cloneable,
e,
q {
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final AtomicReference<org.apache.a.c.a> d = new AtomicReference<Object>(null);

    protected a() {
        super((byte)0);
    }

    @Override
    public final boolean h() {
        return this.c.get();
    }

    @Override
    public final void a(org.apache.a.c.a a2) {
        if (!this.c.get()) {
            this.d.set(a2);
        }
    }

    public Object clone() {
        a a2 = (a)super.clone();
        ((a)super.clone()).a = ai.b(this.a);
        a2.b = ai.b(this.b);
        return a2;
    }
}

