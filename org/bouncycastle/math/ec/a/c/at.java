/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.ec.a.c.ar;
import org.bouncycastle.math.ec.a.c.as;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.s;

public final class at
extends s {
    public at(d d2) {
        this(d2, null, null, false);
    }

    public at(d d2, j j2, j j3, boolean bl2) {
        super(d2, j2, j3);
        if (j2 == null != (j3 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = bl2;
    }

    at(d d2, j j2, j j3, j[] jArray, boolean bl2) {
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
        Object object = (as)this.b;
        Object object2 = (as)this.c;
        as as2 = (as)jArray.g();
        Object object3 = (as)jArray.h();
        as as3 = (as)this.d[0];
        jArray = (as)jArray.a(0);
        int[] nArray4 = new int[17];
        int[] nArray5 = new int[17];
        int[] nArray6 = new int[17];
        Object object4 = new int[17];
        boolean bl2 = as3.i();
        if (bl2) {
            nArray3 = as2.f;
            nArray2 = ((as)object3).f;
        } else {
            nArray2 = nArray6;
            ar.c(as3.f, nArray2);
            nArray3 = nArray5;
            ar.b(nArray2, as2.f, nArray3);
            ar.b(nArray2, as3.f, nArray2);
            ar.b(nArray2, ((as)object3).f, nArray2);
        }
        boolean bl3 = jArray.i();
        if (bl3) {
            object3 = ((as)object).f;
            nArray = ((as)object2).f;
        } else {
            nArray = object4;
            ar.c(jArray.f, nArray);
            object3 = nArray4;
            ar.b(nArray, ((as)object).f, (int[])object3);
            ar.b(nArray, jArray.f, nArray);
            ar.b(nArray, ((as)object2).f, nArray);
        }
        object = new int[17];
        ar.c((int[])object3, nArray3, (int[])object);
        object2 = nArray5;
        ar.c(nArray, nArray2, (int[])object2);
        if (ab.b(17, (int[])object)) {
            if (ab.b(17, (int[])object2)) {
                return this.s();
            }
            return d2.e();
        }
        nArray3 = nArray6;
        ar.c((int[])object, nArray3);
        nArray2 = new int[17];
        ar.b(nArray3, (int[])object, nArray2);
        ar.b(nArray3, (int[])object3, nArray6);
        ar.b(nArray, nArray2, nArray4);
        object3 = new as((int[])object4);
        ar.c((int[])object2, ((as)object3).f);
        ar.a(((as)object3).f, nArray2, ((as)object3).f);
        ar.c(((as)object3).f, nArray6, ((as)object3).f);
        ar.c(((as)object3).f, nArray6, ((as)object3).f);
        object4 = new as(nArray2);
        ar.c(nArray6, ((as)object3).f, object4.f);
        ar.b(object4.f, (int[])object2, nArray5);
        ar.c(nArray5, nArray4, object4.f);
        object = new as((int[])object);
        if (!bl2) {
            ar.b(((as)object).f, as3.f, ((as)object).f);
        }
        if (!bl3) {
            ar.b(((as)object).f, jArray.f, ((as)object).f);
        }
        jArray = new j[]{object};
        return new at(d2, (j)object3, (j)object4, jArray, this.e);
    }

    public final p s() {
        if (this.n()) {
            return this;
        }
        d d2 = this.c();
        as as2 = (as)this.c;
        if (as2.j()) {
            return d2.e();
        }
        as as3 = (as)this.b;
        as as4 = (as)this.d[0];
        Object object = new int[17];
        int[] nArray = new int[17];
        Object object2 = new int[17];
        ar.c(as2.f, object2);
        int[] nArray2 = new int[17];
        ar.c(object2, nArray2);
        boolean bl2 = as4.i();
        int[] nArray3 = as4.f;
        if (!bl2) {
            nArray3 = nArray;
            ar.c(as4.f, nArray3);
        }
        ar.c(as3.f, nArray3, object);
        ar.a(as3.f, nArray3, nArray);
        ar.b(nArray, object, nArray);
        ab.b(17, nArray, nArray, nArray);
        ar.a(nArray);
        nArray3 = object2;
        ar.b(object2, as3.f, nArray3);
        ab.d(17, nArray3, 0);
        ar.a(nArray3);
        ab.b(17, nArray2, 0, object);
        ar.a(object);
        as3 = new as(nArray2);
        ar.c(nArray, as3.f);
        ar.c(as3.f, nArray3, as3.f);
        ar.c(as3.f, nArray3, as3.f);
        object2 = new as(nArray3);
        ar.c(nArray3, as3.f, object2.f);
        ar.b(object2.f, nArray, object2.f);
        ar.c(object2.f, object, object2.f);
        object = new as(nArray);
        ar.d(as2.f, object.f);
        if (!bl2) {
            ar.b(object.f, as4.f, object.f);
        }
        return new at(d2, as3, (j)object2, new j[]{object}, this.e);
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
        return new at(this.a, this.b, this.c.d(), this.d, this.e);
    }
}

