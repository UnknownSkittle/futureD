/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.a.e.d;
import org.apache.a.h.c.p;
import org.apache.a.i;

final class q
implements d {
    private /* synthetic */ Future a;
    private /* synthetic */ p b;

    q(p p2, Future future) {
        this.b = p2;
        this.a = future;
    }

    @Override
    public final boolean a() {
        return this.a.cancel(true);
    }

    @Override
    public final i a(long l2, TimeUnit timeUnit) {
        return this.b.a(this.a, l2, timeUnit);
    }
}

