/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.l;

import com.a.a.b.ai;
import com.a.a.r;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.a.l.b;
import org.apache.a.l.c;
import org.apache.a.l.d;
import org.apache.a.l.e;
import org.apache.a.l.f;
import org.apache.a.l.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class a<T, C, E extends e<T, C>> {
    private final Lock a;
    private final Condition b;
    private final d<T, C> c;
    private final Map<T, g<T, C, E>> d;
    private final Set<E> e;
    private final LinkedList<E> f;
    private final LinkedList<Future<E>> g;
    private final Map<T, Integer> h;
    private volatile boolean i;
    private volatile int j;
    private volatile int k;
    private volatile int l;

    public a(d<T, C> d2) {
        this.c = ai.a(d2, "Connection factory");
        this.j = ai.a(2, "Max per route value");
        this.k = ai.a(20, "Max total value");
        this.a = new ReentrantLock();
        this.b = this.a.newCondition();
        this.d = new HashMap<T, g<T, C, E>>();
        this.e = new HashSet();
        this.f = new LinkedList();
        this.g = new LinkedList();
        this.h = new HashMap<T, Integer>();
    }

    protected abstract E a(T var1, C var2);

    protected boolean a(E e2) {
        return true;
    }

    public final void a() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.a.lock();
        try {
            Iterator<Object> iterator = this.f.iterator();
            while (iterator.hasNext()) {
                ((e)iterator.next()).e();
            }
            iterator = this.e.iterator();
            while (iterator.hasNext()) {
                ((e)iterator.next()).e();
            }
            iterator = this.d.values().iterator();
            while (iterator.hasNext()) {
                ((g)iterator.next()).g();
            }
            this.d.clear();
            this.e.clear();
            this.f.clear();
            return;
        } finally {
            this.a.unlock();
        }
    }

    private g<T, C, E> b(T t2) {
        b b2 = this.d.get(t2);
        if (b2 == null) {
            T t3 = t2;
            b2 = new b(this, t3, t3);
            this.d.put(t2, b2);
        }
        return b2;
    }

    public final Future<E> b(T t2, Object object) {
        ai.a(t2, "Route");
        r.a(!this.i, "Connection pool shut down");
        return new c(this, t2, object);
    }

    private E a(T t2, Object object, long l2, TimeUnit timeUnit, Future<E> future) {
        Date date = null;
        if (l2 > 0L) {
            date = new Date(System.currentTimeMillis() + timeUnit.toMillis(l2));
        }
        this.a.lock();
        try {
            int n2;
            g<T, Object, E> g2 = this.b(t2);
            do {
                int n3;
                E e2;
                r.a(!this.i, "Connection pool shut down");
                while ((e2 = g2.b(object)) != null) {
                    if (((e)e2).a(System.currentTimeMillis())) {
                        ((e)e2).e();
                    }
                    if (!((e)e2).d()) break;
                    this.f.remove(e2);
                    g2.a(e2, false);
                }
                if (e2 != null) {
                    this.f.remove(e2);
                    this.e.add(e2);
                    return e2;
                }
                int n4 = this.c(t2);
                int n5 = Math.max(0, g2.d() + 1 - n4);
                if (n5 > 0) {
                    E e3;
                    for (n2 = 0; n2 < n5 && (e3 = g2.e()) != null; ++n2) {
                        ((e)e3).e();
                        this.f.remove(e3);
                        g2.a(e3);
                    }
                }
                if (g2.d() < n4 && (n3 = Math.max(this.k - (n2 = this.e.size()), 0)) > 0) {
                    if (this.f.size() > n3 - 1 && !this.f.isEmpty()) {
                        object = (e)this.f.removeLast();
                        ((e)object).e();
                        this.b(((e)object).g()).a(object);
                    }
                    object = this.c.a(t2);
                    E e4 = g2.c(object);
                    this.e.add(e4);
                    return e4;
                }
                try {
                    if (future.isCancelled()) {
                        throw new InterruptedException("Operation interrupted");
                    }
                    g2.a(future);
                    this.g.add(future);
                    if (date != null) {
                        n2 = this.b.awaitUntil(date) ? 1 : 0;
                    } else {
                        this.b.await();
                        n2 = 1;
                    }
                    if (future.isCancelled()) {
                        throw new InterruptedException("Operation interrupted");
                    }
                } finally {
                    g2.b(future);
                    this.g.remove(future);
                }
            } while (n2 != 0 || date == null || date.getTime() > System.currentTimeMillis());
            throw new TimeoutException("Timeout waiting for connection");
        } finally {
            this.a.unlock();
        }
    }

    public final void a(E object, boolean bl2) {
        this.a.lock();
        try {
            if (this.e.remove(object)) {
                g g2 = this.b(((e)object).g());
                g2.a(object, bl2);
                if (bl2 && !this.i) {
                    this.f.addFirst(object);
                } else {
                    ((e)object).e();
                }
                object = g2.f();
                if (object != null) {
                    this.g.remove(object);
                } else {
                    object = this.g.poll();
                }
                if (object != null) {
                    this.b.signalAll();
                }
            }
            return;
        } finally {
            this.a.unlock();
        }
    }

    private int c(T object) {
        if ((object = this.h.get(object)) != null) {
            return (Integer)object;
        }
        return this.j;
    }

    public final void a(int n2) {
        ai.a(n2, "Max per route value");
        this.a.lock();
        try {
            this.j = n2;
            return;
        } finally {
            this.a.unlock();
        }
    }

    public final f b() {
        this.a.lock();
        try {
            f f2 = new f(this.e.size(), this.g.size(), this.f.size(), this.k);
            return f2;
        } finally {
            this.a.unlock();
        }
    }

    public final f a(T object) {
        ai.a(object, "Route");
        this.a.lock();
        try {
            g<T, C, E> g2 = this.b(object);
            object = new f(g2.a(), g2.b(), g2.c(), this.c(object));
            return object;
        } finally {
            this.a.unlock();
        }
    }

    public final void c() {
        this.l = 2000;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[leased: ");
        stringBuilder.append(this.e);
        stringBuilder.append("][available: ");
        stringBuilder.append(this.f);
        stringBuilder.append("][pending: ");
        stringBuilder.append(this.g);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    static /* synthetic */ Lock a(a a2) {
        return a2.a;
    }

    static /* synthetic */ Condition b(a a2) {
        return a2.b;
    }

    static /* synthetic */ e a(a a2, Object object, Object object2, long l2, TimeUnit timeUnit, Future future) {
        return a2.a(object, object2, l2, timeUnit, future);
    }

    static /* synthetic */ int c(a a2) {
        return a2.l;
    }
}

