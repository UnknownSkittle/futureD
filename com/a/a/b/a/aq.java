/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import com.a.a.w;
import java.net.URI;
import java.net.URISyntaxException;

final class aq
extends ag<URI> {
    aq() {
    }

    private static URI a(a object) {
        if (((a)object).f() == c.i) {
            ((a)object).j();
            return null;
        }
        try {
            object = ((a)object).h();
            if ("null".equals(object)) {
                return null;
            }
            return new URI((String)object);
        } catch (URISyntaxException uRISyntaxException) {
            throw new w(uRISyntaxException);
        }
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        return aq.a(a2);
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        d2.b((object = (URI)object) == null ? null : ((URI)object).toASCIIString());
    }
}

