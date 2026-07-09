/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.TimeZone;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.sevenz.aa;

public final class w
implements a {
    private String a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private long i;
    private long j;
    private boolean k;
    private int l;
    private boolean m;
    private long n;
    private long o;
    private Iterable<? extends aa> p;

    @Override
    public final String getName() {
        return this.a;
    }

    public final void a(String string) {
        this.a = string;
    }

    public final boolean a() {
        return this.b;
    }

    public final void a(boolean bl2) {
        this.b = bl2;
    }

    public final boolean b() {
        return this.c;
    }

    public final void b(boolean bl2) {
        this.c = bl2;
    }

    public final void c(boolean bl2) {
        this.d = bl2;
    }

    public final boolean c() {
        return this.e;
    }

    public final void d(boolean bl2) {
        this.e = bl2;
    }

    public final void a(long l2) {
        this.h = l2;
    }

    public final boolean d() {
        return this.f;
    }

    public final void e(boolean bl2) {
        this.f = bl2;
    }

    public final Date e() {
        if (this.f) {
            long l2 = this.i;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeZone(TimeZone.getTimeZone("GMT+0"));
            calendar.set(1601, 0, 1, 0, 0, 0);
            calendar.set(14, 0);
            long l3 = calendar.getTimeInMillis() + l2 / 10000L;
            return new Date(l3);
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    public final void b(long l2) {
        this.i = l2;
    }

    public final boolean f() {
        return this.g;
    }

    public final void f(boolean bl2) {
        this.g = bl2;
    }

    public final void c(long l2) {
        this.j = l2;
    }

    public final boolean g() {
        return this.k;
    }

    public final void g(boolean bl2) {
        this.k = bl2;
    }

    public final void a(int n2) {
        this.l = n2;
    }

    public final boolean h() {
        return this.m;
    }

    public final void h(boolean bl2) {
        this.m = bl2;
    }

    public final long i() {
        return this.n;
    }

    public final void d(long l2) {
        this.n = l2;
    }

    public final long j() {
        return this.o;
    }

    public final void e(long l2) {
        this.o = l2;
    }

    public final void a(Iterable<? extends aa> object) {
        if (object != null) {
            LinkedList<aa> linkedList = new LinkedList<aa>();
            object = object.iterator();
            while (object.hasNext()) {
                aa aa2 = (aa)object.next();
                linkedList.addLast(aa2);
            }
            this.p = Collections.unmodifiableList(linkedList);
            return;
        }
        this.p = null;
    }

    public final Iterable<? extends aa> k() {
        return this.p;
    }
}

