/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.r;

public final class ax
extends r {
    public ax(d d2) {
        this(d2, null, null, false);
    }

    public ax(d d2, j j2, j j3, boolean bl2) {
        super(d2, j2, j3);
        if (j2 == null != (j3 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = bl2;
    }

    ax(d d2, j j2, j j3, j[] jArray, boolean bl2) {
        super(d2, j2, j3, jArray);
        this.e = bl2;
    }

    public final j h() {
        j j2 = this.b;
        j j3 = this.c;
        if (this.n() || j2.j()) {
            return j3;
        }
        j2 = j3.a(j2).c(j2);
        j3 = this.d[0];
        if (!j3.i()) {
            j2 = j2.d(j3);
        }
        return j2;
    }

    protected final boolean q() {
        j j2 = this.i();
        if (j2.j()) {
            return false;
        }
        return this.j().k() != j2.k();
    }

    public final p b(p object) {
        if (this.n()) {
            return object;
        }
        if (((p)object).n()) {
            return this;
        }
        d d2 = this.c();
        j j2 = this.b;
        Object object2 = ((p)object).i();
        if (j2.j()) {
            if (((j)object2).j()) {
                return d2.e();
            }
            return ((p)object).b(this);
        }
        j j3 = this.c;
        j j4 = this.d[0];
        j j5 = ((p)object).j();
        object = ((p)object).a(0);
        boolean bl2 = j4.i();
        j j6 = object2;
        j j7 = j5;
        if (!bl2) {
            j6 = j6.c(j4);
            j7 = j7.c(j4);
        }
        boolean bl3 = ((j)object).i();
        j j8 = j3;
        if (!bl3) {
            j2 = j2.c((j)object);
            j8 = j8.c((j)object);
        }
        j7 = j8.a(j7);
        j8 = j2.a(j6);
        if (j8.j()) {
            if (j7.j()) {
                return this.s();
            }
            return d2.e();
        }
        if (((j)object2).j()) {
            object2 = this.m();
            j2 = ((p)object2).g();
            j6 = ((p)object2).h();
            object = j6.a(j5).d(j2);
            if (((j)(object2 = ((j)object).e().a((j)object).a(j2).a(d2.g()))).j()) {
                return new ax(d2, (j)object2, d2.h().g(), this.e);
            }
            object = ((j)object).c(j2.a((j)object2)).a((j)object2).a(j6).d((j)object2).a((j)object2);
            j2 = d2.a(org.bouncycastle.math.ec.c.b);
        } else {
            j8 = j8.e();
            object2 = j7.c(j2);
            if (((j)(object2 = ((j)object2).c(j6 = j7.c(j6)))).j()) {
                return new ax(d2, (j)object2, d2.h().g(), this.e);
            }
            j5 = j7.c(j8);
            if (!bl3) {
                j5 = j5.c((j)object);
            }
            object = j6.a(j8).a(j5, j3.a(j4));
            j2 = j5;
            if (!bl2) {
                j2 = j2.c(j4);
            }
        }
        return new ax(d2, (j)object2, (j)object, new j[]{j2}, this.e);
    }

    public final p s() {
        if (this.n()) {
            return this;
        }
        d d2 = this.c();
        j j2 = this.b;
        if (j2.j()) {
            return d2.e();
        }
        j j3 = this.c;
        j j4 = this.d[0];
        boolean bl2 = j4.i();
        j j5 = bl2 ? j3 : j3.c(j4);
        j j6 = bl2 ? j4 : j4.e();
        j j7 = d2.g();
        j7 = bl2 ? j7 : j7.c(j6);
        if ((j3 = j3.e().a(j5).a(j7)).j()) {
            return new ax(d2, j3, d2.h().g(), this.e);
        }
        j7 = j3.e();
        j6 = bl2 ? j3 : j3.c(j6);
        j2 = (bl2 ? j2 : j2.c(j4)).a(j3, j5).a(j7).a(j6);
        return new ax(d2, j7, j2, new j[]{j6}, this.e);
    }

    public final p c(p object) {
        if (this.n()) {
            return object;
        }
        if (((p)object).n()) {
            return this.s();
        }
        d d2 = this.c();
        j j2 = this.b;
        if (j2.j()) {
            return object;
        }
        j j3 = ((p)object).i();
        j j4 = ((p)object).a(0);
        if (j3.j() || !j4.i()) {
            return this.s().b((p)object);
        }
        j4 = this.c;
        j j5 = this.d[0];
        j j6 = ((p)object).j();
        j2 = j2.e();
        j j7 = j4.e();
        j j8 = j5.e();
        j4 = j4.c(j5);
        j4 = d2.g().c(j8).a(j7).a(j4);
        j5 = j6.c();
        j2 = d2.g().a(j5).c(j8).a(j7).b(j4, j2, j8);
        j6 = (j3 = j3.c(j8)).a(j4).e();
        if (j6.j()) {
            if (j2.j()) {
                return ((p)object).s();
            }
            return d2.e();
        }
        if (j2.j()) {
            return new ax(d2, j2, d2.h().g(), this.e);
        }
        object = j2.e().c(j3);
        j3 = j2.c(j6).c(j8);
        j2 = j2.a(j6).e().b(j4, j5, j3);
        return new ax(d2, (j)object, j2, new j[]{j3}, this.e);
    }

    public final p r() {
        if (this.n()) {
            return this;
        }
        j j2 = this.b;
        if (j2.j()) {
            return this;
        }
        j j3 = this.c;
        j j4 = this.d[0];
        return new ax(this.a, j2, j3.a(j4), new j[]{j4}, this.e);
    }
}

