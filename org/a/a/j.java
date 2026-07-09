/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import org.a.a.z;
import org.a.c.a.b;
import org.a.c.a.e;

final class j
implements e {
    private final b a;

    public j(b b2) {
        this.a = b2;
    }

    @Override
    public final b a() {
        return this.a;
    }

    @Override
    public final CharSequence b() {
        if (this.a instanceof z) {
            return ((z)this.a).d();
        }
        return null;
    }
}

