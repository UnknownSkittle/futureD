/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import java.net.URL;

final class ap
extends ag<URL> {
    ap() {
    }

    @Override
    public final /* synthetic */ Object read(a object) {
        if (((a)object).f() == c.i) {
            ((a)object).j();
            return null;
        }
        if ("null".equals(object = ((a)object).h())) {
            return null;
        }
        return new URL((String)object);
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        d2.b((object = (URL)object) == null ? null : ((URL)object).toExternalForm());
    }
}

