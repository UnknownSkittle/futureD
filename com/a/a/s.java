/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.aa;
import com.a.a.v;
import com.a.a.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class s
extends v
implements Iterable<v> {
    private final List<v> a = new ArrayList<v>();

    public final void a(String string) {
        this.a.add(string == null ? x.a : new aa(string));
    }

    public final void a(v v2) {
        if (v2 == null) {
            v2 = x.a;
        }
        this.a.add(v2);
    }

    @Override
    public final Iterator<v> iterator() {
        return this.a.iterator();
    }

    @Override
    public final Number a() {
        if (this.a.size() == 1) {
            return this.a.get(0).a();
        }
        throw new IllegalStateException();
    }

    @Override
    public final String b() {
        if (this.a.size() == 1) {
            return this.a.get(0).b();
        }
        throw new IllegalStateException();
    }

    @Override
    public final double c() {
        if (this.a.size() == 1) {
            return this.a.get(0).c();
        }
        throw new IllegalStateException();
    }

    @Override
    public final long d() {
        if (this.a.size() == 1) {
            return this.a.get(0).d();
        }
        throw new IllegalStateException();
    }

    @Override
    public final int e() {
        if (this.a.size() == 1) {
            return this.a.get(0).e();
        }
        throw new IllegalStateException();
    }

    @Override
    public final boolean f() {
        if (this.a.size() == 1) {
            return this.a.get(0).f();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object object) {
        return object == this || object instanceof s && ((s)object).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

