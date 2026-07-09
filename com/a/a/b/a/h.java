/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.aa;
import com.a.a.b.a.i;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.s;
import com.a.a.x;
import com.a.a.y;
import java.util.Iterator;
import java.util.Map;

public final class h
extends a {
    private static final Object b;
    private Object[] c;
    private int d;
    private String[] e;
    private int[] f;

    @Override
    public final void a() {
        this.a(com.a.a.d.c.a);
        s s2 = (s)this.t();
        this.a(s2.iterator());
        this.f[this.d - 1] = 0;
    }

    @Override
    public final void b() {
        this.a(com.a.a.d.c.b);
        this.u();
        this.u();
        if (this.d > 0) {
            int n2 = this.d - 1;
            this.f[n2] = this.f[n2] + 1;
        }
    }

    @Override
    public final void c() {
        this.a(com.a.a.d.c.c);
        y y2 = (y)this.t();
        this.a(y2.h().iterator());
    }

    @Override
    public final void d() {
        this.a(com.a.a.d.c.d);
        this.u();
        this.u();
        if (this.d > 0) {
            int n2 = this.d - 1;
            this.f[n2] = this.f[n2] + 1;
        }
    }

    @Override
    public final boolean e() {
        c c2 = this.f();
        return c2 != com.a.a.d.c.d && c2 != com.a.a.d.c.b;
    }

    @Override
    public final c f() {
        Object object;
        block12: {
            boolean bl2;
            while (true) {
                if (this.d == 0) {
                    return com.a.a.d.c.j;
                }
                object = this.t();
                if (!(object instanceof Iterator)) break block12;
                bl2 = this.c[this.d - 2] instanceof y;
                if (!(object = (Iterator)object).hasNext()) break;
                if (bl2) {
                    return com.a.a.d.c.e;
                }
                this.a(object.next());
            }
            if (bl2) {
                return com.a.a.d.c.d;
            }
            return com.a.a.d.c.b;
        }
        if (object instanceof y) {
            return com.a.a.d.c.c;
        }
        if (object instanceof s) {
            return com.a.a.d.c.a;
        }
        if (object instanceof aa) {
            aa aa2 = (aa)object;
            if (aa2.j()) {
                return com.a.a.d.c.f;
            }
            if (aa2.h()) {
                return com.a.a.d.c.h;
            }
            if (aa2.i()) {
                return com.a.a.d.c.g;
            }
            throw new AssertionError();
        }
        if (object instanceof x) {
            return com.a.a.d.c.i;
        }
        if (object == b) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new AssertionError();
    }

    private Object t() {
        return this.c[this.d - 1];
    }

    private Object u() {
        Object object = this.c[--this.d];
        this.c[this.d] = null;
        return object;
    }

    private void a(c c2) {
        if (this.f() != c2) {
            throw new IllegalStateException("Expected " + (Object)((Object)c2) + " but was " + (Object)((Object)this.f()) + this.v());
        }
    }

    @Override
    public final String g() {
        String string;
        this.a(com.a.a.d.c.e);
        Map.Entry entry = (Map.Entry)((Iterator)this.t()).next();
        this.e[this.d - 1] = string = (String)entry.getKey();
        this.a(entry.getValue());
        return string;
    }

    @Override
    public final String h() {
        Object object = this.f();
        if (object != com.a.a.d.c.f && object != com.a.a.d.c.g) {
            throw new IllegalStateException("Expected " + (Object)((Object)com.a.a.d.c.f) + " but was " + (Object)object + this.v());
        }
        object = ((aa)this.u()).b();
        if (this.d > 0) {
            int n2 = this.d - 1;
            this.f[n2] = this.f[n2] + 1;
        }
        return object;
    }

    @Override
    public final boolean i() {
        this.a(com.a.a.d.c.h);
        boolean bl2 = ((aa)this.u()).f();
        if (this.d > 0) {
            int n2 = this.d - 1;
            this.f[n2] = this.f[n2] + 1;
        }
        return bl2;
    }

    @Override
    public final void j() {
        this.a(com.a.a.d.c.i);
        this.u();
        if (this.d > 0) {
            int n2 = this.d - 1;
            this.f[n2] = this.f[n2] + 1;
        }
    }

    @Override
    public final double k() {
        c c2 = this.f();
        if (c2 != com.a.a.d.c.g && c2 != com.a.a.d.c.f) {
            throw new IllegalStateException("Expected " + (Object)((Object)com.a.a.d.c.g) + " but was " + (Object)((Object)c2) + this.v());
        }
        double d2 = ((aa)this.t()).c();
        if (!this.q() && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(d2)));
        }
        this.u();
        if (this.d > 0) {
            int n2 = this.d - 1;
            this.f[n2] = this.f[n2] + 1;
        }
        return d2;
    }

    @Override
    public final long l() {
        c c2 = this.f();
        if (c2 != com.a.a.d.c.g && c2 != com.a.a.d.c.f) {
            throw new IllegalStateException("Expected " + (Object)((Object)com.a.a.d.c.g) + " but was " + (Object)((Object)c2) + this.v());
        }
        long l2 = ((aa)this.t()).d();
        this.u();
        if (this.d > 0) {
            int n2 = this.d - 1;
            this.f[n2] = this.f[n2] + 1;
        }
        return l2;
    }

    @Override
    public final int m() {
        c c2 = this.f();
        if (c2 != com.a.a.d.c.g && c2 != com.a.a.d.c.f) {
            throw new IllegalStateException("Expected " + (Object)((Object)com.a.a.d.c.g) + " but was " + (Object)((Object)c2) + this.v());
        }
        int n2 = ((aa)this.t()).e();
        this.u();
        if (this.d > 0) {
            int n3 = this.d - 1;
            this.f[n3] = this.f[n3] + 1;
        }
        return n2;
    }

    @Override
    public final void close() {
        this.c = new Object[]{b};
        this.d = 1;
    }

    @Override
    public final void n() {
        if (this.f() == com.a.a.d.c.e) {
            this.g();
            this.e[this.d - 2] = "null";
        } else {
            this.u();
            if (this.d > 0) {
                this.e[this.d - 1] = "null";
            }
        }
        if (this.d > 0) {
            int n2 = this.d - 1;
            this.f[n2] = this.f[n2] + 1;
        }
    }

    @Override
    public final String toString() {
        return this.getClass().getSimpleName();
    }

    public final void o() {
        this.a(com.a.a.d.c.e);
        Map.Entry entry = (Map.Entry)((Iterator)this.t()).next();
        this.a(entry.getValue());
        this.a(new aa((String)entry.getKey()));
    }

    private void a(Object object) {
        if (this.d == this.c.length) {
            Object[] objectArray = new Object[this.d << 1];
            int[] nArray = new int[this.d << 1];
            String[] stringArray = new String[this.d << 1];
            System.arraycopy(this.c, 0, objectArray, 0, this.d);
            System.arraycopy(this.f, 0, nArray, 0, this.d);
            System.arraycopy(this.e, 0, stringArray, 0, this.d);
            this.c = objectArray;
            this.f = nArray;
            this.e = stringArray;
        }
        this.c[this.d++] = object;
    }

    @Override
    public final String p() {
        StringBuilder stringBuilder = new StringBuilder("$");
        for (int i2 = 0; i2 < this.d; ++i2) {
            if (this.c[i2] instanceof s) {
                if (!(this.c[++i2] instanceof Iterator)) continue;
                stringBuilder.append('[').append(this.f[i2]).append(']');
                continue;
            }
            if (!(this.c[i2] instanceof y) || !(this.c[++i2] instanceof Iterator)) continue;
            stringBuilder.append('.');
            if (this.e[i2] == null) continue;
            stringBuilder.append(this.e[i2]);
        }
        return stringBuilder.toString();
    }

    private String v() {
        return " at path " + this.p();
    }

    static {
        new i();
        b = new Object();
    }
}

