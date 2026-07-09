/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.ai;
import com.a.a.c.a;
import com.a.a.k;

final class bb
implements ai {
    private /* synthetic */ Class a;
    private /* synthetic */ ag b;

    bb(Class clazz, ag ag2) {
        this.a = clazz;
        this.b = ag2;
    }

    @Override
    public final <T> ag<T> a(k k2, a<T> a2) {
        if (a2.getRawType() == this.a) {
            return this.b;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.a.getName() + ",adapter=" + this.b + "]";
    }
}

