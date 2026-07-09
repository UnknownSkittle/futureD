/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.l;

import com.a.a.b;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.a.l.a;
import org.apache.a.l.e;

final class c
implements Future<E> {
    private volatile boolean a;
    private volatile boolean b;
    private volatile E c;
    private /* synthetic */ b d;
    private /* synthetic */ Object e;
    private /* synthetic */ Object f;
    private /* synthetic */ a g;

    c(a a2, Object object, Object object2) {
        this.g = a2;
        this.d = null;
        this.e = object;
        this.f = object2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final boolean cancel(boolean bl2) {
        this.a = true;
        org.apache.a.l.a.a(this.g).lock();
        try {
            org.apache.a.l.a.b(this.g).signalAll();
        } finally {
            org.apache.a.l.a.a(this.g).unlock();
        }
        c c2 = this;
        synchronized (c2) {
            boolean bl3 = !this.b;
            this.b = true;
            return bl3;
        }
    }

    @Override
    public final boolean isCancelled() {
        return this.a;
    }

    @Override
    public final boolean isDone() {
        return this.b;
    }

    private E a() {
        try {
            return this.a(0L, TimeUnit.MILLISECONDS);
        } catch (TimeoutException timeoutException) {
            throw new ExecutionException(timeoutException);
        }
    }

    private E a(long l2, TimeUnit timeUnit) {
        if (this.c != null) {
            return this.c;
        }
        c c2 = this;
        synchronized (c2) {
            try {
                e e2;
                while (true) {
                    e2 = org.apache.a.l.a.a(this.g, this.e, this.f, l2, timeUnit, this);
                    if (org.apache.a.l.a.c(this.g) <= 0 || e2.j() + (long)org.apache.a.l.a.c(this.g) > System.currentTimeMillis() || this.g.a(e2)) break;
                    e2.e();
                    this.g.a(e2, false);
                }
                this.c = e2;
                this.b = true;
                return this.c;
            } catch (IOException iOException) {
                this.b = true;
                throw new ExecutionException(iOException);
            }
        }
    }

    @Override
    public final /* synthetic */ Object get(long l2, TimeUnit timeUnit) {
        return this.a(l2, timeUnit);
    }

    @Override
    public final /* synthetic */ Object get() {
        return this.a();
    }
}

