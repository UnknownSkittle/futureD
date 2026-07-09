/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.ec.a.c.an;
import org.bouncycastle.math.ec.a.c.ao;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.s;

public final class ap
extends s {
    public ap(d d2) {
        this(d2, null, null, false);
    }

    public ap(d d2, j j2, j j3, boolean bl2) {
        super(d2, j2, j3);
        if (j2 == null != (j3 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = bl2;
    }

    ap(d d2, j j2, j j3, j[] jArray, boolean bl2) {
        super(d2, j2, j3, jArray);
        this.e = bl2;
    }

    public final p b(p jArray) {
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
        Object object = (ao)this.b;
        Object object2 = (ao)this.c;
        ao ao2 = (ao)jArray.g();
        Object object3 = (ao)jArray.h();
        ao ao3 = (ao)this.d[0];
        jArray = (ao)jArray.a(0);
        int[] nArray4 = new int[24];
        int[] nArray5 = new int[24];
        int[] nArray6 = new int[12];
        int[] nArray7 = new int[12];
        boolean bl2 = ao3.i();
        if (bl2) {
            nArray3 = ao2.f;
            nArray2 = ((ao)object3).f;
        } else {
            nArray2 = nArray6;
            an.d(ao3.f, nArray2);
            nArray3 = nArray5;
            an.c(nArray2, ao2.f, nArray3);
            an.c(nArray2, ao3.f, nArray2);
            an.c(nArray2, ((ao)object3).f, nArray2);
        }
        boolean bl3 = jArray.i();
        if (bl3) {
            object3 = ((ao)object).f;
            nArray = ((ao)object2).f;
        } else {
            nArray = nArray7;
            an.d(jArray.f, nArray);
            object3 = nArray4;
            an.c(nArray, ((ao)object).f, (int[])object3);
            an.c(nArray, jArray.f, nArray);
            an.c(nArray, ((ao)object2).f, nArray);
        }
        object2 = new int[12];
        an.d((int[])object3, nArray3, (int[])object2);
        nArray3 = new int[12];
        an.d(nArray, nArray2, nArray3);
        if (ab.b(12, (int[])object2)) {
            if (ab.b(12, nArray3)) {
                return this.s();
            }
            return d2.e();
        }
        object = nArray6;
        an.d((int[])object2, (int[])object);
        nArray2 = new int[12];
        an.c((int[])object, (int[])object2, nArray2);
        an.c((int[])object, (int[])object3, nArray6);
        an.b(nArray2, nArray2);
        ab.b(nArray, nArray2, nArray4);
        an.a(ab.b(12, nArray6, nArray6, nArray2), nArray2);
        object = new ao(nArray7);
        an.d(nArray3, ((ao)object).f);
        an.d(((ao)object).f, nArray2, ((ao)object).f);
        object3 = new ao(nArray2);
        an.d(nArray6, ((ao)object).f, ((ao)object3).f);
        ab.b(((ao)object3).f, nArray3, nArray5);
        an.b(nArray4, nArray5, nArray4);
        an.c(nArray4, ((ao)object3).f);
        object2 = new ao((int[])object2);
        if (!bl2) {
            an.c(((ao)object2).f, ao3.f, ((ao)object2).f);
        }
        if (!bl3) {
            an.c(((ao)object2).f, jArray.f, ((ao)object2).f);
        }
        jArray = new j[]{object2};
        return new ap(d2, (j)object, (j)object3, jArray, this.e);
    }

    public final p s() {
        if (this.n()) {
            return this;
        }
        d d2 = this.c();
        ao ao2 = (ao)this.c;
        if (ao2.j()) {
            return d2.e();
        }
        ao ao3 = (ao)this.b;
        ao ao4 = (ao)this.d[0];
        Object object = new int[12];
        Object object2 = new int[12];
        int[] nArray = new int[12];
        an.d(ao2.f, nArray);
        int[] nArray2 = new int[12];
        an.d(nArray, nArray2);
        boolean bl2 = ao4.i();
        int[] nArray3 = ao4.f;
        if (!bl2) {
            nArray3 = object2;
            an.d(ao4.f, nArray3);
        }
        an.d(ao3.f, nArray3, object);
        int[] nArray4 = object2;
        an.a(ao3.f, nArray3, nArray4);
        an.c(nArray4, object, nArray4);
        an.a(ab.b(12, nArray4, nArray4, nArray4), nArray4);
        nArray3 = nArray;
        an.c(nArray, ao3.f, nArray3);
        an.a(ab.d(12, nArray3, 0), nArray3);
        an.a(ab.b(12, nArray2, 0, object), object);
        ao3 = new ao(nArray2);
        an.d(nArray4, ao3.f);
        an.d(ao3.f, nArray3, ao3.f);
        an.d(ao3.f, nArray3, ao3.f);
        object2 = new ao(nArray3);
        an.d(nArray3, ao3.f, object2.f);
        an.c(object2.f, nArray4, object2.f);
        an.d(object2.f, object, object2.f);
        object = new ao(nArray4);
        an.e(ao2.f, object.f);
        if (!bl2) {
            an.c(object.f, ao4.f, object.f);
        }
        return new ap(d2, ao3, (j)object2, new j[]{object}, this.e);
    }

    public final p c(p p2) {
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

    public final p t() {
        if (this.n() || this.c.j()) {
            return this;
        }
        return this.s().b(this);
    }

    public final p r() {
        if (this.n()) {
            return this;
        }
        return new ap(this.a, this.b, this.c.d(), this.d, this.e);
    }
}

