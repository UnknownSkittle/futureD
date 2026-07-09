/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.a.e.l;
import org.apache.a.i;
import org.apache.a.l.e;
import org.apache.commons.c.a;

final class b
extends e<org.apache.a.e.a.b, l> {
    private final a a;
    private volatile boolean b;

    public b(a a2, String string, org.apache.a.e.a.b b2, l l2, long l3, TimeUnit timeUnit) {
        super(string, b2, l2, l3, timeUnit);
        this.a = a2;
    }

    public final void a() {
        this.b = true;
    }

    public final boolean b() {
        return this.b;
    }

    public final void c() {
        ((i)this.h()).close();
    }

    @Override
    public final boolean a(long l2) {
        boolean bl2 = super.a(l2);
        if (bl2 && this.a.a()) {
            this.a.a("Connection " + this + " expired @ " + new Date(this.k()));
        }
        return bl2;
    }

    @Override
    public final boolean d() {
        return !((i)this.h()).c();
    }

    @Override
    public final void e() {
        try {
            this.c();
            return;
        } catch (IOException iOException) {
            this.a.a("I/O error closing connection", iOException);
            return;
        }
    }
}

