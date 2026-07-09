/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.a.e.l;
import org.apache.a.h.c.b;
import org.apache.a.l.d;
import org.apache.a.l.e;
import org.apache.commons.c.c;

class a
extends org.apache.a.l.a<org.apache.a.e.a.b, l, b> {
    private static final AtomicLong a = new AtomicLong();
    private final org.apache.commons.c.a b = org.apache.commons.c.c.b(a.class);
    private final long c;
    private final TimeUnit d;

    public a(d<org.apache.a.e.a.b, l> d2, long l2, TimeUnit timeUnit) {
        super(d2);
        this.c = l2;
        this.d = timeUnit;
    }

    @Override
    protected final /* synthetic */ boolean a(e e2) {
        return !((l)((b)e2).h()).d();
    }

    @Override
    protected final /* synthetic */ e a(Object object, Object object2) {
        l l2 = (l)object2;
        object2 = (org.apache.a.e.a.b)object;
        object = this;
        String string = Long.toString(a.getAndIncrement());
        return new b(((a)object).b, string, (org.apache.a.e.a.b)object2, l2, ((a)object).c, ((a)object).d);
    }
}

