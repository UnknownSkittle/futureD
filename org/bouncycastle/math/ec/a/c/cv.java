/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import org.bouncycastle.math.b.a;
import org.bouncycastle.math.ec.a.c.cq;
import org.bouncycastle.math.ec.a.c.cr;
import org.bouncycastle.math.ec.a.c.cu;
import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.r;

public final class cv
extends r {
    public cv(d d2) {
        this(d2, null, null, false);
    }

    public cv(d d2, j j2, j j3, boolean bl2) {
        super(d2, j2, j3);
        if (j2 == null != (j3 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = bl2;
    }

    cv(d d2, j j2, j j3, j[] jArray, boolean bl2) {
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
            cr2 = (cr)j3.e().a((j)object5).a((j)object3).c();
            if (cr2.j()) {
                return new cv(d2, (j)cr2, (j)cu.h, this.e);
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
                return new cv(d2, (j)cr2, (j)cu.h, this.e);
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
        return new cv(d2, cr2, (j)object, new j[]{object3}, this.e);
    }

    public final p s() {
        Object object;
        if (this.n()) {
            return this;
        }
        d d2 = this.c();
        Object object2 = (cr)this.b;
        if (((cr)object2).j()) {
            return d2.e();
        }
        Object object3 = (cr)this.c;
        Object object4 = (cr)this.d[0];
        Object object5 = new long[9];
        long[] lArray = new long[9];
        long[] lArray2 = ((cr)object4).i() ? null : cq.a(((cr)object4).f);
        if (lArray2 == null) {
            object = ((cr)object3).f;
            object4 = ((cr)object4).f;
        } else {
            object = object5;
            cq.e(((cr)object3).f, lArray2, object5);
            object4 = lArray;
            cq.e(((cr)object4).f, lArray);
        }
        long[] lArray3 = new long[9];
        cq.e(((cr)object3).f, lArray3);
        cq.b(object, (long[])object4, lArray3);
        if (org.bouncycastle.math.b.a.a(lArray3)) {
            return new cv(d2, (j)new cr(lArray3), (j)cu.h, this.e);
        }
        object3 = new long[18];
        cq.d(lArray3, object, (long[])object3);
        object5 = new cr((long[])object5);
        cq.e(lArray3, object5.f);
        object = new cr(lArray3);
        if (lArray2 != null) {
            cq.c(object.f, (long[])object4, object.f);
        }
        if (lArray2 == null) {
            object2 = ((cr)object2).f;
        } else {
            object2 = lArray;
            cq.e(((cr)object2).f, lArray2, lArray);
        }
        cq.f((long[])object2, (long[])object3);
        cq.c((long[])object3, lArray);
        cq.b(object5.f, object.f, lArray);
        object2 = new cr(lArray);
        return new cv(d2, (j)object5, (j)object2, new j[]{object}, this.e);
    }

    public final p c(p object) {
        if (this.n()) {
            return object;
        }
        if (((p)object).n()) {
            return this.s();
        }
        d d2 = this.c();
        Object object2 = (cr)this.b;
        if (((cr)object2).j()) {
            return object;
        }
        Object object3 = (cr)((p)object).i();
        Object object4 = (cr)((p)object).a(0);
        if (((cr)object3).j() || !((cr)object4).i()) {
            return this.s().b((p)object);
        }
        object4 = (cr)this.c;
        Object object5 = (cr)this.d[0];
        cr cr2 = (cr)((p)object).j();
        Object object6 = new long[9];
        Object object7 = new long[9];
        long[] lArray = new long[9];
        long[] lArray2 = new long[9];
        long[] lArray3 = object6;
        cq.e(((cr)object2).f, lArray3);
        object2 = object7;
        cq.e(((cr)object4).f, (long[])object2);
        long[] lArray4 = lArray;
        cq.e(((cr)object5).f, lArray4);
        long[] lArray5 = lArray2;
        cq.c(((cr)object4).f, ((cr)object5).f, lArray5);
        object4 = lArray5;
        cq.b(lArray4, (long[])object2, (long[])object4);
        object5 = cq.a(lArray4);
        cq.e(cr2.f, (long[])object5, lArray);
        cq.a(lArray, (long[])object2, lArray);
        object2 = new long[18];
        cq.d(lArray, (long[])object4, (long[])object2);
        cq.f(lArray3, (long[])object5, (long[])object2);
        cq.c((long[])object2, lArray);
        lArray3 = object6;
        cq.e(((cr)object3).f, (long[])object5, lArray3);
        object3 = object7;
        cq.a(lArray3, (long[])object4, (long[])object3);
        Object object8 = object3;
        cq.e((long[])object8, (long[])object8);
        if (org.bouncycastle.math.b.a.a((long[])object3)) {
            if (org.bouncycastle.math.b.a.a(lArray)) {
                return ((p)object).s();
            }
            return d2.e();
        }
        if (org.bouncycastle.math.b.a.a(lArray)) {
            return new cv(d2, (j)new cr(lArray), (j)cu.h, this.e);
        }
        object = new cr();
        cq.e(lArray, ((cr)object).f);
        cq.c(((cr)object).f, lArray3, ((cr)object).f);
        object6 = new cr((long[])object6);
        cq.c(lArray, (long[])object3, object6.f);
        cq.e(object6.f, (long[])object5, object6.f);
        object5 = new cr((long[])object7);
        cq.a(lArray, (long[])object3, ((cr)object5).f);
        cq.e(((cr)object5).f, ((cr)object5).f);
        object7 = object2;
        for (int i2 = 0; i2 < 18; ++i2) {
            object7[i2] = 0L;
        }
        cq.d(((cr)object5).f, (long[])object4, (long[])object2);
        cq.a(cr2.f, lArray2);
        cq.d(lArray2, object6.f, (long[])object2);
        cq.c((long[])object2, ((cr)object5).f);
        return new cv(d2, (j)object, (j)object5, new j[]{object6}, this.e);
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
        return new cv(this.a, j2, j3.a(j4), new j[]{j4}, this.e);
    }
}

