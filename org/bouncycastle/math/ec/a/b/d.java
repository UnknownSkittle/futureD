/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.b;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.ec.a.b.b;
import org.bouncycastle.math.ec.a.b.c;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.s;
import org.bouncycastle.openpgp.h;

public final class d
extends s {
    public d(org.bouncycastle.math.ec.d d2) {
        this(d2, null, null, false);
    }

    public d(org.bouncycastle.math.ec.d d2, j j2, j j3, boolean bl2) {
        super(d2, j2, j3);
        if (j2 == null != (j3 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = bl2;
    }

    d(org.bouncycastle.math.ec.d d2, j j2, j j3, j[] jArray, boolean bl2) {
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
        org.bouncycastle.math.ec.d d2 = this.c();
        Object object = (c)this.b;
        Object object2 = (c)this.c;
        c c2 = (c)jArray.g();
        Object object3 = (c)jArray.h();
        c c3 = (c)this.d[0];
        jArray = (c)jArray.a(0);
        int[] nArray4 = new int[16];
        int[] nArray5 = new int[8];
        int[] nArray6 = new int[8];
        int[] nArray7 = new int[8];
        boolean bl2 = c3.i();
        if (bl2) {
            nArray3 = c2.f;
            nArray2 = ((c)object3).f;
        } else {
            nArray2 = nArray6;
            org.bouncycastle.math.ec.a.b.b.d(c3.f, nArray2);
            nArray3 = nArray5;
            org.bouncycastle.math.ec.a.b.b.b(nArray2, c2.f, nArray3);
            org.bouncycastle.math.ec.a.b.b.b(nArray2, c3.f, nArray2);
            org.bouncycastle.math.ec.a.b.b.b(nArray2, ((c)object3).f, nArray2);
        }
        boolean bl3 = jArray.i();
        if (bl3) {
            object3 = ((c)object).f;
            nArray = ((c)object2).f;
        } else {
            nArray = nArray7;
            org.bouncycastle.math.ec.a.b.b.d(jArray.f, nArray);
            object3 = nArray4;
            org.bouncycastle.math.ec.a.b.b.b(nArray, ((c)object).f, (int[])object3);
            org.bouncycastle.math.ec.a.b.b.b(nArray, jArray.f, nArray);
            org.bouncycastle.math.ec.a.b.b.b(nArray, ((c)object2).f, nArray);
        }
        object2 = new int[8];
        org.bouncycastle.math.ec.a.b.b.d((int[])object3, nArray3, (int[])object2);
        org.bouncycastle.math.ec.a.b.b.d(nArray, nArray2, nArray5);
        if (h.b((int[])object2)) {
            if (h.b(nArray5)) {
                return this.s();
            }
            return d2.e();
        }
        object = nArray6;
        org.bouncycastle.math.ec.a.b.b.d((int[])object2, (int[])object);
        nArray3 = new int[8];
        org.bouncycastle.math.ec.a.b.b.b((int[])object, (int[])object2, nArray3);
        org.bouncycastle.math.ec.a.b.b.b((int[])object, (int[])object3, nArray6);
        org.bouncycastle.math.ec.a.b.b.b(nArray3, nArray3);
        h.d(nArray, nArray3, nArray4);
        org.bouncycastle.math.ec.a.b.b.a(h.b(nArray6, nArray6, nArray3), nArray3);
        object = new c(nArray7);
        org.bouncycastle.math.ec.a.b.b.d(nArray5, ((c)object).f);
        org.bouncycastle.math.ec.a.b.b.d(((c)object).f, nArray3, ((c)object).f);
        object3 = new c(nArray3);
        org.bouncycastle.math.ec.a.b.b.d(nArray6, ((c)object).f, ((c)object3).f);
        org.bouncycastle.math.ec.a.b.b.c(((c)object3).f, nArray5, nArray4);
        org.bouncycastle.math.ec.a.b.b.c(nArray4, ((c)object3).f);
        object2 = new c((int[])object2);
        if (!bl2) {
            org.bouncycastle.math.ec.a.b.b.b(((c)object2).f, c3.f, ((c)object2).f);
        }
        if (!bl3) {
            org.bouncycastle.math.ec.a.b.b.b(((c)object2).f, jArray.f, ((c)object2).f);
        }
        jArray = new j[]{object2};
        return new d(d2, (j)object, (j)object3, jArray, this.e);
    }

    public final p s() {
        if (this.n()) {
            return this;
        }
        org.bouncycastle.math.ec.d d2 = this.c();
        c c2 = (c)this.c;
        if (c2.j()) {
            return d2.e();
        }
        c c3 = (c)this.b;
        c c4 = (c)this.d[0];
        Object object = new int[8];
        Object object2 = new int[8];
        int[] nArray = new int[8];
        org.bouncycastle.math.ec.a.b.b.d(c2.f, nArray);
        int[] nArray2 = new int[8];
        org.bouncycastle.math.ec.a.b.b.d(nArray, nArray2);
        boolean bl2 = c4.i();
        int[] nArray3 = c4.f;
        if (!bl2) {
            nArray3 = object2;
            org.bouncycastle.math.ec.a.b.b.d(c4.f, nArray3);
        }
        org.bouncycastle.math.ec.a.b.b.d(c3.f, nArray3, object);
        int[] nArray4 = object2;
        org.bouncycastle.math.ec.a.b.b.a(c3.f, nArray3, nArray4);
        org.bouncycastle.math.ec.a.b.b.b(nArray4, object, nArray4);
        org.bouncycastle.math.ec.a.b.b.a(h.b(nArray4, nArray4, nArray4), nArray4);
        nArray3 = nArray;
        org.bouncycastle.math.ec.a.b.b.b(nArray, c3.f, nArray3);
        org.bouncycastle.math.ec.a.b.b.a(ab.d(8, nArray3, 0), nArray3);
        org.bouncycastle.math.ec.a.b.b.a(ab.b(8, nArray2, 0, object), object);
        c3 = new c(nArray2);
        org.bouncycastle.math.ec.a.b.b.d(nArray4, c3.f);
        org.bouncycastle.math.ec.a.b.b.d(c3.f, nArray3, c3.f);
        org.bouncycastle.math.ec.a.b.b.d(c3.f, nArray3, c3.f);
        object2 = new c(nArray3);
        org.bouncycastle.math.ec.a.b.b.d(nArray3, c3.f, object2.f);
        org.bouncycastle.math.ec.a.b.b.b(object2.f, nArray4, object2.f);
        org.bouncycastle.math.ec.a.b.b.d(object2.f, object, object2.f);
        object = new c(nArray4);
        org.bouncycastle.math.ec.a.b.b.e(c2.f, object.f);
        if (!bl2) {
            org.bouncycastle.math.ec.a.b.b.b(object.f, c4.f, object.f);
        }
        return new d(d2, c3, (j)object2, new j[]{object}, this.e);
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
        return new d(this.a, this.b, this.c.d(), this.d, this.e);
    }
}

