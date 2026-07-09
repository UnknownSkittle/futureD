/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.l;

import com.a.a.b.ai;
import java.util.concurrent.TimeUnit;

public abstract class e<T, C> {
    private final String a;
    private final T b;
    private final C c;
    private final long d;
    private final long e;
    private long f;
    private long g;
    private volatile Object h;

    public e(String string, T t2, C c2, long l2, TimeUnit timeUnit) {
        ai.a(t2, "Route");
        ai.a(c2, "Connection");
        ai.a(timeUnit, "Time unit");
        this.a = string;
        this.b = t2;
        this.c = c2;
        this.f = this.d = System.currentTimeMillis();
        this.e = l2 > 0L ? this.d + timeUnit.toMillis(l2) : Long.MAX_VALUE;
        this.g = this.e;
    }

    public final String f() {
        return this.a;
    }

    public final T g() {
        return this.b;
    }

    public final C h() {
        return this.c;
    }

    public final Object i() {
        return this.h;
    }

    public final void a(Object object) {
        this.h = object;
    }

    public final synchronized long j() {
        return this.f;
    }

    public final synchronized long k() {
        return this.g;
    }

    public final synchronized void a(long l2, TimeUnit timeUnit) {
        ai.a(timeUnit, "Time unit");
        this.f = System.currentTimeMillis();
        long l3 = l2 > 0L ? this.f + timeUnit.toMillis(l2) : Long.MAX_VALUE;
        this.g = Math.min(l3, this.e);
    }

    public synchronized boolean a(long l2) {
        return l2 >= this.g;
    }

    public abstract void e();

    public abstract boolean d();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[id:");
        stringBuilder.append(this.a);
        stringBuilder.append("][route:");
        stringBuilder.append(this.b);
        stringBuilder.append("][state:");
        stringBuilder.append(this.h);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

