/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import org.bouncycastle.math.b.a;
import org.bouncycastle.math.ec.a.c.ab;
import org.bouncycastle.math.ec.a.c.ac;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.s;

public final class ad
extends s {
    public ad(d d2) {
        this(d2, null, null, false);
    }

    public ad(d d2, j j2, j j3, boolean bl2) {
        super(d2, j2, j3);
        if (j2 == null != (j3 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = bl2;
    }

    ad(d d2, j j2, j j3, j[] jArray, boolean bl2) {
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
        Object object = (ac)this.b;
        Object object2 = (ac)this.c;
        ac ac2 = (ac)jArray.g();
        Object object3 = (ac)jArray.h();
        ac ac3 = (ac)this.d[0];
        jArray = (ac)jArray.a(0);
        int[] nArray4 = new int[14];
        int[] nArray5 = new int[7];
        int[] nArray6 = new int[7];
        int[] nArray7 = new int[7];
        boolean bl2 = ac3.i();
        if (bl2) {
            nArray3 = ac2.f;
            nArray2 = ((ac)object3).f;
        } else {
            nArray2 = nArray6;
            ab.d(ac3.f, nArray2);
            nArray3 = nArray5;
            ab.b(nArray2, ac2.f, nArray3);
            ab.b(nArray2, ac3.f, nArray2);
            ab.b(nArray2, ((ac)object3).f, nArray2);
        }
        boolean bl3 = jArray.i();
        if (bl3) {
            object3 = ((ac)object).f;
            nArray = ((ac)object2).f;
        } else {
            nArray = nArray7;
            ab.d(jArray.f, nArray);
            object3 = nArray4;
            ab.b(nArray, ((ac)object).f, (int[])object3);
            ab.b(nArray, jArray.f, nArray);
            ab.b(nArray, ((ac)object2).f, nArray);
        }
        object2 = new int[7];
        ab.d((int[])object3, nArray3, (int[])object2);
        ab.d(nArray, nArray2, nArray5);
        if (org.bouncycastle.math.b.a.b((int[])object2)) {
            if (org.bouncycastle.math.b.a.b(nArray5)) {
                return this.s();
            }
            return d2.e();
        }
        object = nArray6;
        ab.d((int[])object2, (int[])object);
        nArray3 = new int[7];
        ab.b((int[])object, (int[])object2, nArray3);
        ab.b((int[])object, (int[])object3, nArray6);
        ab.b(nArray3, nArray3);
        org.bouncycastle.math.b.a.c(nArray, nArray3, nArray4);
        ab.a(org.bouncycastle.math.b.a.b(nArray6, nArray6, nArray3), nArray3);
        object = new ac(nArray7);
        ab.d(nArray5, ((ac)object).f);
        ab.d(((ac)object).f, nArray3, ((ac)object).f);
        object3 = new ac(nArray3);
        ab.d(nArray6, ((ac)object).f, ((ac)object3).f);
        ab.c(((ac)object3).f, nArray5, nArray4);
        ab.c(nArray4, ((ac)object3).f);
        object2 = new ac((int[])object2);
        if (!bl2) {
            ab.b(((ac)object2).f, ac3.f, ((ac)object2).f);
        }
        if (!bl3) {
            ab.b(((ac)object2).f, jArray.f, ((ac)object2).f);
        }
        jArray = new j[]{object2};
        return new ad(d2, (j)object, (j)object3, jArray, this.e);
    }

    public final p s() {
        if (this.n()) {
            return this;
        }
        d d2 = this.c();
        ac ac2 = (ac)this.c;
        if (ac2.j()) {
            return d2.e();
        }
        ac ac3 = (ac)this.b;
        ac ac4 = (ac)this.d[0];
        Object object = new int[7];
        Object object2 = new int[7];
        int[] nArray = new int[7];
        ab.d(ac2.f, nArray);
        int[] nArray2 = new int[7];
        ab.d(nArray, nArray2);
        boolean bl2 = ac4.i();
        int[] nArray3 = ac4.f;
        if (!bl2) {
            nArray3 = object2;
            ab.d(ac4.f, nArray3);
        }
        ab.d(ac3.f, nArray3, object);
        int[] nArray4 = object2;
        ab.a(ac3.f, nArray3, nArray4);
        ab.b(nArray4, object, nArray4);
        ab.a(org.bouncycastle.math.b.a.b(nArray4, nArray4, nArray4), nArray4);
        nArray3 = nArray;
        ab.b(nArray, ac3.f, nArray3);
        ab.a(org.bouncycastle.asn1.k.ab.d(7, nArray3, 0), nArray3);
        ab.a(org.bouncycastle.asn1.k.ab.b(7, nArray2, 0, object), object);
        ac3 = new ac(nArray2);
        ab.d(nArray4, ac3.f);
        ab.d(ac3.f, nArray3, ac3.f);
        ab.d(ac3.f, nArray3, ac3.f);
        object2 = new ac(nArray3);
        ab.d(nArray3, ac3.f, object2.f);
        ab.b(object2.f, nArray4, object2.f);
        ab.d(object2.f, object, object2.f);
        object = new ac(nArray4);
        ab.e(ac2.f, object.f);
        if (!bl2) {
            ab.b(object.f, ac4.f, object.f);
        }
        return new ad(d2, ac3, (j)object2, new j[]{object}, this.e);
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
        return new ad(this.a, this.b, this.c.d(), this.d, this.e);
    }
}

