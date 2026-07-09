/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import com.a.a.b.ai;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.a.d.h;
import org.apache.a.e.c.g;
import org.apache.a.e.d;
import org.apache.a.e.l;
import org.apache.a.h.c.a;
import org.apache.a.h.c.b;
import org.apache.a.h.c.c;
import org.apache.a.h.c.e;
import org.apache.a.h.c.q;
import org.apache.a.h.c.r;
import org.apache.a.h.c.s;
import org.apache.a.i;
import org.apache.a.l.f;
import org.apache.a.n;

public final class p
implements Closeable,
org.apache.a.e.h {
    private final org.apache.commons.c.a a = org.apache.commons.c.c.b(this.getClass());
    private final r b = new r();
    private final a c;
    private final org.apache.a.e.i d;
    private final AtomicBoolean e;

    public p() {
        this(org.apache.a.d.g.a().a("http", org.apache.a.e.b.c.b()).a("https", (org.apache.a.e.b.c)((Object)g.b())).b());
    }

    private p(org.apache.a.d.f<org.apache.a.e.b.a> f2) {
        this(f2, 0);
    }

    private p(org.apache.a.d.f<org.apache.a.e.b.a> f2, byte by2) {
        this(f2, -1L, TimeUnit.MILLISECONDS);
    }

    public p(org.apache.a.d.f<org.apache.a.e.b.a> f2, long l2, TimeUnit timeUnit) {
        this(new e(f2), l2, timeUnit);
    }

    private p(org.apache.a.e.i i2, long l2, TimeUnit timeUnit) {
        this.c = new a(new s(this.b), l2, timeUnit);
        this.c.c();
        this.d = ai.a(i2, "HttpClientConnectionOperator");
        this.e = new AtomicBoolean(false);
    }

    protected final void finalize() {
        try {
            this.a();
            return;
        } finally {
            super.finalize();
        }
    }

    @Override
    public final void close() {
        this.a();
    }

    private String a(org.apache.a.e.a.b object) {
        StringBuilder stringBuilder = new StringBuilder();
        f f2 = this.c.b();
        object = this.c.a(object);
        stringBuilder.append("[total kept alive: ").append(f2.b()).append("; ");
        stringBuilder.append("route allocated: ").append(((f)object).a() + ((f)object).b());
        stringBuilder.append(" of ").append(((f)object).c()).append("; ");
        stringBuilder.append("total allocated: ").append(f2.a() + f2.b());
        stringBuilder.append(" of ").append(f2.c()).append("]");
        return stringBuilder.toString();
    }

    private static String a(b object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[id: ").append(((org.apache.a.l.e)object).f()).append("]");
        stringBuilder.append("[route: ").append(((org.apache.a.l.e)object).g()).append("]");
        object = ((org.apache.a.l.e)object).i();
        if (object != null) {
            stringBuilder.append("[state: ").append(object).append("]");
        }
        return stringBuilder.toString();
    }

    @Override
    public final d a(org.apache.a.e.a.b object, Object object2) {
        ai.a(object, "HTTP route");
        if (this.a.a()) {
            StringBuilder stringBuilder = new StringBuilder("Connection request: ");
            Object object3 = object2;
            Object object4 = object;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("[route: ").append(object4).append("]");
            if (object3 != null) {
                stringBuilder2.append("[state: ").append(object3).append("]");
            }
            this.a.a(stringBuilder.append(stringBuilder2.toString()).append(this.a((org.apache.a.e.a.b)object)).toString());
        }
        object = this.c.b(object, object2);
        return new q(this, (Future)object);
    }

    protected final i a(Future<b> future, long l2, TimeUnit timeUnit) {
        try {
            b b2 = future.get(l2, timeUnit);
            if (b2 == null || future.isCancelled()) {
                throw new InterruptedException();
            }
            com.a.a.r.a(b2.h() != null, "Pool entry with no connection");
            if (this.a.a()) {
                this.a.a("Connection leased: " + p.a(b2) + this.a((org.apache.a.e.a.b)b2.g()));
            }
            return org.apache.a.h.c.c.a(b2);
        } catch (TimeoutException timeoutException) {
            throw new org.apache.a.e.c("Timeout waiting for connection from pool");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void a(i object, Object object2, long l2, TimeUnit timeUnit) {
        ai.a(object, "Managed connection");
        i i2 = object;
        synchronized (i2) {
            l l3;
            block8: {
                object = org.apache.a.h.c.c.b((i)object);
                if (object == null) {
                    return;
                }
                l3 = (l)((org.apache.a.l.e)object).h();
                try {
                    if (!l3.c()) break block8;
                    timeUnit = timeUnit != null ? timeUnit : TimeUnit.MILLISECONDS;
                    ((org.apache.a.l.e)object).a(object2);
                    ((org.apache.a.l.e)object).a(l2, timeUnit);
                    if (!this.a.a()) break block8;
                    object2 = l2 > 0L ? "for " + (double)timeUnit.toMillis(l2) / 1000.0 + " seconds" : "indefinitely";
                    this.a.a("Connection " + p.a((b)object) + " can be kept alive " + (String)object2);
                } catch (Throwable throwable) {
                    this.c.a(object, l3.c() && ((b)object).b());
                    if (this.a.a()) {
                        this.a.a("Connection released: " + p.a((b)object) + this.a((org.apache.a.e.a.b)((org.apache.a.l.e)object).g()));
                    }
                    throw throwable;
                }
            }
            this.c.a(object, l3.c() && ((b)object).b());
            if (this.a.a()) {
                this.a.a("Connection released: " + p.a((b)object) + this.a((org.apache.a.e.a.b)((org.apache.a.l.e)object).g()));
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void a(i i2, org.apache.a.e.a.b cloneable, int n2, org.apache.a.m.d d2) {
        ai.a(i2, "Managed Connection");
        ai.a(cloneable, "HTTP route");
        Object object = i2;
        synchronized (object) {
            i2 = (l)org.apache.a.h.c.c.a(i2).h();
        }
        object = cloneable.e() != null ? cloneable.e() : cloneable.a();
        InetSocketAddress inetSocketAddress = cloneable.c();
        cloneable = this.b.a((n)object);
        if (cloneable == null) {
            cloneable = this.b.a();
        }
        if (cloneable == null) {
            cloneable = h.a;
        }
        this.d.a((l)i2, (n)object, inetSocketAddress, n2, (h)cloneable, d2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void a(i i2, org.apache.a.e.a.b b2, org.apache.a.m.d d2) {
        ai.a(i2, "Managed Connection");
        ai.a(b2, "HTTP route");
        i i3 = i2;
        synchronized (i3) {
            i2 = (l)org.apache.a.h.c.c.a(i2).h();
        }
        this.d.a((l)i2, b2.a(), d2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void a(i i2, org.apache.a.e.a.b object) {
        ai.a(i2, "Managed Connection");
        ai.a(object, "HTTP route");
        object = i2;
        synchronized (object) {
            org.apache.a.h.c.c.a(i2).a();
            return;
        }
    }

    @Override
    public final void a() {
        if (this.e.compareAndSet(false, true)) {
            this.a.a("Connection manager is shutting down");
            try {
                this.c.a();
            } catch (IOException iOException) {
                this.a.a("I/O exception shutting down connection manager", iOException);
            }
            this.a.a("Connection manager shut down");
        }
    }

    public final void a(int n2) {
        this.c.a(n2);
    }
}

