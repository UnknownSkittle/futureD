/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import org.bouncycastle.math.b.a;
import org.bouncycastle.math.ec.a.c.cq;
import org.bouncycastle.math.ec.a.c.cr;
import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.r;

public final class ct
extends r {
    public ct(d d2) {
        this(d2, null, null, false);
    }

    public ct(d d2, j j2, j j3, boolean bl2) {
        super(d2, j2, j3);
        if (j2 == null != (j3 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = bl2;
    }

    ct(d d2, j j2, j j3, j[] jArray, boolean bl2) {
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
        Object object2;
        long[] lArray;
        long[] lArray2;
        if (this.n()) {
            return object;
        }
        if (((p)object).n()) {
            return this;
        }
        d d2 = this.c();
        Object object3 = (cr)this.b;
        cr cr2 = (cr)((p)object).i();
        if (((cr)object3).j()) {
            if (cr2.j()) {
                return d2.e();
            }
            return ((p)object).b(this);
        }
        cr cr3 = (cr)this.c;
        cr cr4 = (cr)this.d[0];
        Object object4 = (cr)((p)object).j();
        object = (cr)((p)object).a(0);
        Object object5 = new long[9];
        long[] lArray3 = new long[9];
        long[] lArray4 = new long[9];
        long[] lArray5 = new long[9];
        long[] lArray6 = cr4.i() ? null : cq.a(cr4.f);
        if (lArray6 == null) {
            lArray2 = cr2.f;
            lArray = ((cr)object4).f;
        } else {
            lArray2 = lArray3;
            cq.e(cr2.f, lArray6, lArray3);
            lArray = lArray5;
            cq.e(((cr)object4).f, lArray6, lArray5);
        }
        long[] lArray7 = ((cr)object).i() ? null : cq.a(((cr)object).f);
        object = lArray7;
        if (lArray7 == null) {
            object3 = ((cr)object3).f;
            object2 = cr3.f;
        } else {
            object3 = object5;
            cq.e(((cr)object3).f, (long[])object, object5);
            object2 = lArray4;
            cq.e(cr3.f, (long[])object, lArray4);
        }
        Object object6 = lArray4;
        cq.a((long[])object2, lArray, object6);
        lArray = lArray5;
        cq.a((long[])object3, lArray2, lArray);
        if (org.bouncycastle.math.b.a.a(lArray)) {
            if (org.bouncycastle.math.b.a.a(object6)) {
                return this.s();
            }
            return d2.e();
        }
        if (cr2.j()) {
            p p2 = this.m();
            object2 = p2;
            object3 = (cr)p2.g();
            j j2 = ((p)object2).h();
            object6 = j2;
            j j3 = j2.a((j)object4).d((j)object3);
            object5 = j3;
            cr2 = (cr)j3.e().a((j)object5).a((j)object3);
            if (cr2.j()) {
                return new ct(d2, (j)cr2, d2.h(), this.e);
            }
            object = (cr)object5.c(((cr)object3).a(cr2)).a(cr2).a((j)object6).d(cr2).a(cr2);
            object3 = (cr)d2.a(org.bouncycastle.math.ec.c.b);
        } else {
            cq.e(lArray, lArray);
            object2 = cq.a(object6);
            object6 = object5;
            object4 = lArray3;
            cq.e((long[])object3, (long[])object2, object6);
            cq.e(lArray2, (long[])object2, (long[])object4);
            cr2 = new cr((long[])object5);
            cq.c(object6, (long[])object4, cr2.f);
            if (cr2.j()) {
                return new ct(d2, (j)cr2, d2.h(), this.e);
            }
            object3 = new cr(lArray4);
            cq.e(lArray, (long[])object2, ((cr)object3).f);
            if (object != null) {
                cq.e(((cr)object3).f, (long[])object, ((cr)object3).f);
            }
            object5 = new long[18];
            cq.a((long[])object4, lArray, lArray5);
            cq.f(lArray5, object5);
            cq.a(cr3.f, cr4.f, lArray5);
            cq.d(lArray5, ((cr)object3).f, object5);
            object = new cr(lArray5);
            cq.c(object5, ((cr)object).f);
            if (lArray6 != null) {
                cq.e(((cr)object3).f, lArray6, ((cr)object3).f);
            }
        }
        return new ct(d2, cr2, (j)object, new j[]{object3}, this.e);
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
        j j5 = bl2 ? j4 : j4.e();
        j j6 = bl2 ? j3.e().a(j3) : j3.a(j4).c(j3);
        if (j6.j()) {
            return new ct(d2, j6, d2.h(), this.e);
        }
        j j7 = j6.e();
        j j8 = bl2 ? j6 : j6.c(j5);
        j2 = j3.a(j2).e();
        j3 = bl2 ? j4 : j5.e();
        j2 = j2.a(j6).a(j5).c(j2).a(j3).a(j7).a(j8);
        return new ct(d2, j7, j2, new j[]{j8}, this.e);
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
        j4 = j7.a(j4);
        j5 = j6.c();
        j2 = j5.c(j8).a(j7).b(j4, j2, j8);
        j6 = (j3 = j3.c(j8)).a(j4).e();
        if (j6.j()) {
            if (j2.j()) {
                return ((p)object).s();
            }
            return d2.e();
        }
        if (j2.j()) {
            return new ct(d2, j2, d2.h(), this.e);
        }
        object = j2.e().c(j3);
        j3 = j2.c(j6).c(j8);
        j2 = j2.a(j6).e().b(j4, j5, j3);
        return new ct(d2, (j)object, j2, new j[]{j3}, this.e);
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
        return new ct(this.a, j2, j3.a(j4), new j[]{j4}, this.e);
    }
}

