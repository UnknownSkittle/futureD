/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.l;

import com.a.a.b.ai;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Future;
import org.apache.a.l.e;

abstract class g<T, C, E extends e<T, C>> {
    private final T a;
    private final Set<E> b;
    private final LinkedList<E> c;
    private final LinkedList<Future<E>> d;

    g(T t2) {
        this.a = t2;
        this.b = new HashSet();
        this.c = new LinkedList();
        this.d = new LinkedList();
    }

    protected abstract E a(C var1);

    public final int a() {
        return this.b.size();
    }

    public final int b() {
        return this.d.size();
    }

    public final int c() {
        return this.c.size();
    }

    public final int d() {
        return this.c.size() + this.b.size();
    }

    public final E b(Object object) {
        if (!this.c.isEmpty()) {
            e e2;
            Iterator iterator;
            if (object != null) {
                iterator = this.c.iterator();
                while (iterator.hasNext()) {
                    e2 = (e)iterator.next();
                    if (!object.equals(e2.i())) continue;
                    iterator.remove();
                    this.b.add(e2);
                    return (E)e2;
                }
            }
            iterator = this.c.iterator();
            while (iterator.hasNext()) {
                e2 = (e)iterator.next();
                if (e2.i() != null) continue;
                iterator.remove();
                this.b.add(e2);
                return (E)e2;
            }
        }
        return null;
    }

    public final E e() {
        if (!this.c.isEmpty()) {
            return (E)((e)this.c.getLast());
        }
        return null;
    }

    public final boolean a(E e2) {
        ai.a(e2, "Pool entry");
        return this.c.remove(e2) || this.b.remove(e2);
    }

    public final void a(E e2, boolean bl2) {
        ai.a(e2, "Pool entry");
        E e3 = e2;
        String string = "Entry %s has not been leased from this pool";
        if (!this.b.remove(e2)) {
            throw new IllegalStateException(String.format(string, e3));
        }
        if (bl2) {
            this.c.addFirst(e2);
        }
    }

    public final E c(C object) {
        object = this.a((C)object);
        this.b.add(object);
        return (E)object;
    }

    public final void a(Future<E> future) {
        if (future == null) {
            return;
        }
        this.d.add(future);
    }

    public final Future<E> f() {
        return this.d.poll();
    }

    public final void b(Future<E> future) {
        if (future == null) {
            return;
        }
        this.d.remove(future);
    }

    public final void g() {
        Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((Future)iterator.next()).cancel(true);
        }
        this.d.clear();
        iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((e)iterator.next()).e();
        }
        this.c.clear();
        iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((e)iterator.next()).e();
        }
        this.b.clear();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[route: ");
        stringBuilder.append(this.a);
        stringBuilder.append("][leased: ");
        stringBuilder.append(this.b.size());
        stringBuilder.append("][available: ");
        stringBuilder.append(this.c.size());
        stringBuilder.append("][pending: ");
        stringBuilder.append(this.d.size());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

