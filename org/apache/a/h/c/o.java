/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import java.util.concurrent.atomic.AtomicLong;
import org.apache.a.d.a;
import org.apache.a.e.a.b;
import org.apache.a.e.l;
import org.apache.a.g.d;
import org.apache.a.h.c.g;
import org.apache.a.h.c.h;
import org.apache.a.h.c.m;
import org.apache.a.i.e;
import org.apache.a.j;
import org.apache.a.q;
import org.apache.a.s;
import org.apache.commons.c.c;

public final class o
implements org.apache.a.e.j<b, l> {
    private static final AtomicLong b = new AtomicLong();
    public static final o a = new o('\u0000');
    private final org.apache.commons.c.a c = org.apache.commons.c.c.b(h.class);
    private final org.apache.commons.c.a d = org.apache.commons.c.c.b("org.apache.http.headers");
    private final org.apache.commons.c.a e = org.apache.commons.c.c.b("org.apache.http.wire");
    private final e<q> f = org.apache.a.h.g.h.a;
    private final org.apache.a.i.c<s> g = org.apache.a.h.c.g.a;
    private final d h = org.apache.a.h.e.a.a;
    private final d i = org.apache.a.h.e.b.a;

    private o() {
    }

    private o(byte by2) {
        this();
    }

    private o(char c2) {
        this(0);
    }

    @Override
    public final /* synthetic */ j a(a a2) {
        o o2 = this;
        a2 = a2 != null ? a2 : org.apache.a.d.a.a;
        String string = "http-outgoing-" + Long.toString(b.getAndIncrement());
        return new m(string, o2.c, o2.d, o2.e, a2.a(), o2.h, o2.i, o2.f, o2.g);
    }
}

