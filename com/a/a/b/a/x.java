/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b.a.w;
import com.a.a.c.a;
import com.a.a.k;
import java.sql.Time;

final class x
implements ai {
    x() {
    }

    @Override
    public final <T> ag<T> a(k k2, a<T> a2) {
        if (a2.getRawType() == Time.class) {
            return new w();
        }
        return null;
    }
}

