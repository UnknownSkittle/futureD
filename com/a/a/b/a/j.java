/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.aa;
import com.a.a.b.a.k;
import com.a.a.d.d;
import com.a.a.s;
import com.a.a.v;
import com.a.a.x;
import com.a.a.y;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class j
extends d {
    private static final Writer a = new k();
    private static final aa b = new aa("closed");
    private final List<v> c = new ArrayList<v>();
    private String d;
    private v e = x.a;

    public j() {
        super(a);
    }

    public final v a() {
        if (!this.c.isEmpty()) {
            throw new IllegalStateException("Expected one JSON element but was " + this.c);
        }
        return this.e;
    }

    private v j() {
        return this.c.get(this.c.size() - 1);
    }

    private void a(v v2) {
        if (this.d != null) {
            if (!(v2 instanceof x) || this.i()) {
                ((y)this.j()).a(this.d, v2);
            }
            this.d = null;
            return;
        }
        if (this.c.isEmpty()) {
            this.e = v2;
            return;
        }
        v v3 = this.j();
        if (v3 instanceof s) {
            ((s)v3).a(v2);
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public final d b() {
        s s2 = new s();
        this.a(s2);
        this.c.add(s2);
        return this;
    }

    @Override
    public final d c() {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        }
        if (this.j() instanceof s) {
            this.c.remove(this.c.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override
    public final d d() {
        y y2 = new y();
        this.a(y2);
        this.c.add(y2);
        return this;
    }

    @Override
    public final d e() {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        }
        if (this.j() instanceof y) {
            this.c.remove(this.c.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override
    public final d a(String string) {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        }
        if (this.j() instanceof y) {
            this.d = string;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override
    public final d b(String string) {
        if (string == null) {
            return this.f();
        }
        this.a(new aa(string));
        return this;
    }

    @Override
    public final d f() {
        this.a(x.a);
        return this;
    }

    @Override
    public final d a(boolean bl2) {
        this.a(new aa(bl2));
        return this;
    }

    @Override
    public final d a(Boolean bl2) {
        if (bl2 == null) {
            return this.f();
        }
        this.a(new aa(bl2));
        return this;
    }

    @Override
    public final d a(long l2) {
        this.a(new aa(l2));
        return this;
    }

    @Override
    public final d a(Number number) {
        double d2;
        if (number == null) {
            return this.f();
        }
        if (!this.g() && (Double.isNaN(d2 = number.doubleValue()) || Double.isInfinite(d2))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(number)));
        }
        this.a(new aa(number));
        return this;
    }

    @Override
    public final void flush() {
    }

    @Override
    public final void close() {
        if (!this.c.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.c.add(b);
    }
}

