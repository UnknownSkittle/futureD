/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.ai;
import com.a.a.c.a;
import com.a.a.k;

final class bc
implements ai {
    private /* synthetic */ Class a;
    private /* synthetic */ Class b;
    private /* synthetic */ ag c;

    bc(Class clazz, Class clazz2, ag ag2) {
        this.a = clazz;
        this.b = clazz2;
        this.c = ag2;
    }

    @Override
    public final <T> ag<T> a(k clazz, a<T> a2) {
        clazz = a2.getRawType();
        if (clazz == this.a || clazz == this.b) {
            return this.c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.b.getName() + "+" + this.a.getName() + ",adapter=" + this.c + "]";
    }
}

