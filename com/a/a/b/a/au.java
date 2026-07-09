/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b.a.av;
import com.a.a.c.a;
import com.a.a.k;
import java.sql.Timestamp;
import java.util.Date;

final class au
implements ai {
    au() {
    }

    @Override
    public final <T> ag<T> a(k object, a<T> a2) {
        if (a2.getRawType() != Timestamp.class) {
            return null;
        }
        object = ((k)object).a(Date.class);
        return new av(this, (ag)object);
    }
}

