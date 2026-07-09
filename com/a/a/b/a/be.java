/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b.a.bf;
import com.a.a.c.a;
import com.a.a.k;

final class be
implements ai {
    private /* synthetic */ Class b;
    final /* synthetic */ ag a;

    be(Class clazz, ag ag2) {
        this.b = clazz;
        this.a = ag2;
    }

    public final <T2> ag<T2> a(k clazz, a<T2> a2) {
        clazz = a2.getRawType();
        if (!this.b.isAssignableFrom(clazz)) {
            return null;
        }
        return new bf(this, clazz);
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.b.getName() + ",adapter=" + this.a + "]";
    }
}

