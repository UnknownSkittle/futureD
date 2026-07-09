/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.b;

import org.a.b.x;

public abstract class q {
    private q a = null;
    private q b = null;
    private q c = null;
    private q d = null;
    private q e = null;

    public abstract void a(x var1);

    public final q h() {
        return this.e;
    }

    public final q i() {
        return this.d;
    }

    public final q j() {
        return this.b;
    }

    public final q k() {
        return this.c;
    }

    public q b() {
        return this.a;
    }

    protected void a(q q2) {
        this.a = q2;
    }

    public final void b(q q2) {
        q2.l();
        q2.a(this);
        if (this.c != null) {
            this.c.e = q2;
            q2.d = this.c;
            this.c = q2;
            return;
        }
        this.b = q2;
        this.c = q2;
    }

    public final void l() {
        if (this.d != null) {
            this.d.e = this.e;
        } else if (this.a != null) {
            this.a.b = this.e;
        }
        if (this.e != null) {
            this.e.d = this.d;
        } else if (this.a != null) {
            this.a.c = this.d;
        }
        this.a = null;
        this.e = null;
        this.d = null;
    }

    public final void c(q q2) {
        q2.l();
        q2.e = this.e;
        if (q2.e != null) {
            q2.e.d = q2;
        }
        q2.d = this;
        this.e = q2;
        q2.a = this.a;
        if (q2.e == null) {
            q2.a.c = q2;
        }
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{" + this.e_() + "}";
    }

    protected String e_() {
        return "";
    }
}

