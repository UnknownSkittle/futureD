/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import java.net.InetAddress;

final class ar
extends ag<InetAddress> {
    ar() {
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        if (a2.f() == c.i) {
            a2.j();
            return null;
        }
        return InetAddress.getByName(a2.h());
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        d2.b((object = (InetAddress)object) == null ? null : ((InetAddress)object).getHostAddress());
    }
}

