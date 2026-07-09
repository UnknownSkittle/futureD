/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.c;

import com.a.a.b.ai;
import org.apache.a.b.c.i;
import org.apache.a.e;
import org.apache.a.k;
import org.apache.a.l;

public abstract class d
extends i
implements l {
    private k c;

    @Override
    public final k b() {
        return this.c;
    }

    @Override
    public final void a(k k2) {
        this.c = k2;
    }

    @Override
    public final boolean a() {
        e e2 = this.c("Expect");
        return e2 != null && "100-continue".equalsIgnoreCase(e2.d());
    }

    @Override
    public Object clone() {
        d d2 = (d)super.clone();
        if (this.c != null) {
            d2.c = ai.b(this.c);
        }
        return d2;
    }
}

