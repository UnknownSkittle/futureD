/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.f;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.a.c.a;
import org.apache.a.e.h;
import org.apache.a.i;

final class b
implements Closeable,
a {
    private final org.apache.commons.c.a a;
    private final h b;
    private final i c;
    private final AtomicBoolean d;
    private volatile boolean e;
    private volatile Object f;
    private volatile long g;
    private volatile TimeUnit h;

    public b(org.apache.commons.c.a a2, h h2, i i2) {
        this.a = a2;
        this.b = h2;
        this.c = i2;
        this.d = new AtomicBoolean(false);
    }

    public final boolean b() {
        return this.e;
    }

    public final void c() {
        this.e = true;
    }

    public final void d() {
        this.e = false;
    }

    public final void a(Object object) {
        this.f = object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(long l2, TimeUnit timeUnit) {
        i i2 = this.c;
        synchronized (i2) {
            this.g = l2;
            this.h = timeUnit;
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(boolean bl2) {
        if (this.d.compareAndSet(false, true)) {
            i i2 = this.c;
            synchronized (i2) {
                if (bl2) {
                    this.b.a(this.c, this.f, this.g, this.h);
                } else {
                    try {
                        this.c.close();
                        this.a.a("Connection discarded");
                    } catch (IOException iOException) {
                        if (this.a.a()) {
                            this.a.a(iOException.getMessage(), iOException);
                        }
                    } finally {
                        this.b.a(this.c, null, 0L, TimeUnit.MILLISECONDS);
                    }
                }
                return;
            }
        }
    }

    public final void e() {
        b b2 = this;
        b2.a(b2.e);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void f() {
        if (this.d.compareAndSet(false, true)) {
            i i2 = this.c;
            synchronized (i2) {
                try {
                    this.c.e();
                    this.a.a("Connection discarded");
                } catch (IOException iOException) {
                    if (this.a.a()) {
                        this.a.a(iOException.getMessage(), iOException);
                    }
                } finally {
                    this.b.a(this.c, null, 0L, TimeUnit.MILLISECONDS);
                }
                return;
            }
        }
    }

    @Override
    public final boolean a() {
        boolean bl2 = this.d.get();
        this.a.a("Cancelling request execution");
        this.f();
        return !bl2;
    }

    public final boolean g() {
        return this.d.get();
    }

    @Override
    public final void close() {
        this.a(false);
    }
}

