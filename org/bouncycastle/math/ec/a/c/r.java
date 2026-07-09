/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.ec.a;
import org.bouncycastle.math.ec.a.c.p;
import org.bouncycastle.math.ec.a.c.q;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.s;

public final class r
extends s {
    public r(d d2) {
        this(d2, null, null, false);
    }

    public r(d d2, j j2, j j3, boolean bl2) {
        super(d2, j2, j3);
        if (j2 == null != (j3 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = bl2;
    }

    r(d d2, j j2, j j3, j[] jArray, boolean bl2) {
        super(d2, j2, j3, jArray);
        this.e = bl2;
    }

    public final org.bouncycastle.math.ec.p b(org.bouncycastle.math.ec.p jArray) {
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        if (this.n()) {
            return jArray;
        }
        if (jArray.n()) {
            return this;
        }
        if (this == jArray) {
            return this.s();
        }
        d d2 = this.c();
        Object object = (q)this.b;
        Object object2 = (q)this.c;
        q q2 = (q)jArray.g();
        Object object3 = (q)jArray.h();
        q q3 = (q)this.d[0];
        jArray = (q)jArray.a(0);
        int[] nArray4 = new int[12];
        int[] nArray5 = new int[6];
        int[] nArray6 = new int[6];
        int[] nArray7 = new int[6];
        boolean bl2 = q3.i();
        if (bl2) {
            nArray3 = q2.f;
            nArray2 = ((q)object3).f;
        } else {
            nArray2 = nArray6;
            p.d(q3.f, nArray2);
            nArray3 = nArray5;
            p.b(nArray2, q2.f, nArray3);
            p.b(nArray2, q3.f, nArray2);
            p.b(nArray2, ((q)object3).f, nArray2);
        }
        boolean bl3 = jArray.i();
        if (bl3) {
            object3 = ((q)object).f;
            nArray = ((q)object2).f;
        } else {
            nArray = nArray7;
            p.d(jArray.f, nArray);
            object3 = nArray4;
            p.b(nArray, ((q)object).f, (int[])object3);
            p.b(nArray, jArray.f, nArray);
            p.b(nArray, ((q)object2).f, nArray);
        }
        object2 = new int[6];
        p.d((int[])object3, nArray3, (int[])object2);
        p.d(nArray, nArray2, nArray5);
        if (org.bouncycastle.math.ec.a.b((int[])object2)) {
            if (org.bouncycastle.math.ec.a.b(nArray5)) {
                return this.s();
            }
            return d2.e();
        }
        object = nArray6;
        p.d((int[])object2, (int[])object);
        nArray3 = new int[6];
        p.b((int[])object, (int[])object2, nArray3);
        p.b((int[])object, (int[])object3, nArray6);
        p.b(nArray3, nArray3);
        org.bouncycastle.math.ec.a.d(nArray, nArray3, nArray4);
        p.a(org.bouncycastle.math.ec.a.b(nArray6, nArray6, nArray3), nArray3);
        object = new q(nArray7);
        p.d(nArray5, ((q)object).f);
        p.d(((q)object).f, nArray3, ((q)object).f);
        object3 = new q(nArray3);
        p.d(nArray6, ((q)object).f, ((q)object3).f);
        p.c(((q)object3).f, nArray5, nArray4);
        p.c(nArray4, ((q)object3).f);
        object2 = new q((int[])object2);
        if (!bl2) {
            p.b(((q)object2).f, q3.f, ((q)object2).f);
        }
        if (!bl3) {
            p.b(((q)object2).f, jArray.f, ((q)object2).f);
        }
        jArray = new j[]{object2};
        return new r(d2, (j)object, (j)object3, jArray, this.e);
    }

    public final org.bouncycastle.math.ec.p s() {
        if (this.n()) {
            return this;
        }
        d d2 = this.c();
        q q2 = (q)this.c;
        if (q2.j()) {
            return d2.e();
        }
        Object object = (q)this.b;
        q q3 = (q)this.d[0];
        Object object2 = new int[6];
        p.d(q2.f, object2);
        Object object3 = new int[6];
        p.d(object2, object3);
        int[] nArray = new int[6];
        p.d(((q)object).f, nArray);
        p.a(org.bouncycastle.math.ec.a.b(nArray, nArray, nArray), nArray);
        int[] nArray2 = object2;
        p.b(object2, ((q)object).f, nArray2);
        p.a(ab.d(6, nArray2, 0), nArray2);
        object = new int[6];
        p.a(ab.b(6, object3, 0, (int[])object), (int[])object);
        object3 = new q((int[])object3);
        p.d(nArray, object3.f);
        p.d(object3.f, nArray2, object3.f);
        p.d(object3.f, nArray2, object3.f);
        object2 = new q(nArray2);
        p.d(nArray2, object3.f, object2.f);
        p.b(object2.f, nArray, object2.f);
        p.d(object2.f, (int[])object, object2.f);
        object = new q(nArray);
        p.e(q2.f, ((q)object).f);
        if (!q3.i()) {
            p.b(((q)object).f, q3.f, ((q)object).f);
        }
        return new r(d2, (j)object3, (j)object2, new j[]{object}, this.e);
    }

    public final org.bouncycastle.math.ec.p c(org.bouncycastle.math.ec.p p2) {
        if (this == p2) {
            return this.t();
        }
        if (this.n()) {
            return p2;
        }
        if (p2.n()) {
            return this.s();
        }
        if (this.c.j()) {
            return p2;
        }
        return this.s().b(p2);
    }

    public final org.bouncycastle.math.ec.p t() {
        if (this.n() || this.c.j()) {
            return this;
        }
        return this.s().b(this);
    }

    public final org.bouncycastle.math.ec.p r() {
        if (this.n()) {
            return this;
        }
        return new r(this.a, this.b, this.c.d(), this.d, this.e);
    }
}

