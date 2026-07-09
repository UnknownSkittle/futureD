/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.b;

import com.a.a.b.ai;
import java.net.URI;
import org.apache.a.ac;
import org.apache.a.ae;
import org.apache.a.b.c.l;
import org.apache.a.j.a;
import org.apache.a.j.n;

@Deprecated
public final class q
extends a
implements l {
    private final org.apache.a.q c;
    private ac d;

    @Override
    public final ac c() {
        if (this.d == null) {
            this.d = ai.a(this.f());
        }
        return this.d;
    }

    @Override
    public final URI i() {
        return null;
    }

    @Override
    public final ae g() {
        ac ac2 = this.c();
        String string = "/";
        return new n(null, string, ac2);
    }

    @Override
    public final boolean h() {
        return false;
    }

    public final org.apache.a.q a() {
        return this.c;
    }
}

