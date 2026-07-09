/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.jcajce.provider.c.a;
import org.bouncycastle.math.ec.a.c.h;
import org.bouncycastle.math.ec.a.c.i;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.s;

public final class j
extends s {
    public j(d d2) {
        this(d2, null, null, false);
    }

    public j(d d2, org.bouncycastle.math.ec.j j2, org.bouncycastle.math.ec.j j3, boolean bl2) {
        super(d2, j2, j3);
        if (j2 == null != (j3 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = bl2;
    }

    j(d d2, org.bouncycastle.math.ec.j j2, org.bouncycastle.math.ec.j j3, org.bouncycastle.math.ec.j[] jArray, boolean bl2) {
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
        Object object = (i)this.b;
        Object object2 = (i)this.c;
        i i2 = (i)jArray.g();
        Object object3 = (i)jArray.h();
        i i3 = (i)this.d[0];
        jArray = (i)jArray.a(0);
        int[] nArray4 = new int[10];
        int[] nArray5 = new int[5];
        int[] nArray6 = new int[5];
        int[] nArray7 = new int[5];
        boolean bl2 = i3.i();
        if (bl2) {
            nArray3 = i2.f;
            nArray2 = ((i)object3).f;
        } else {
            nArray2 = nArray6;
            h.d(i3.f, nArray2);
            nArray3 = nArray5;
            h.b(nArray2, i2.f, nArray3);
            h.b(nArray2, i3.f, nArray2);
            h.b(nArray2, ((i)object3).f, nArray2);
        }
        boolean bl3 = jArray.i();
        if (bl3) {
            object3 = ((i)object).f;
            nArray = ((i)object2).f;
        } else {
            nArray = nArray7;
            h.d(jArray.f, nArray);
            object3 = nArray4;
            h.b(nArray, ((i)object).f, (int[])object3);
            h.b(nArray, jArray.f, nArray);
            h.b(nArray, ((i)object2).f, nArray);
        }
        object2 = new int[5];
        h.d((int[])object3, nArray3, (int[])object2);
        h.d(nArray, nArray2, nArray5);
        if (org.bouncycastle.jcajce.provider.c.a.b((int[])object2)) {
            if (org.bouncycastle.jcajce.provider.c.a.b(nArray5)) {
                return this.s();
            }
            return d2.e();
        }
        object = nArray6;
        h.d((int[])object2, (int[])object);
        nArray3 = new int[5];
        h.b((int[])object, (int[])object2, nArray3);
        h.b((int[])object, (int[])object3, nArray6);
        h.b(nArray3, nArray3);
        org.bouncycastle.jcajce.provider.c.a.c(nArray, nArray3, nArray4);
        h.a(org.bouncycastle.jcajce.provider.c.a.b(nArray6, nArray6, nArray3), nArray3);
        object = new i(nArray7);
        h.d(nArray5, ((i)object).f);
        h.d(((i)object).f, nArray3, ((i)object).f);
        object3 = new i(nArray3);
        h.d(nArray6, ((i)object).f, ((i)object3).f);
        h.c(((i)object3).f, nArray5, nArray4);
        h.c(nArray4, ((i)object3).f);
        object2 = new i((int[])object2);
        if (!bl2) {
            h.b(((i)object2).f, i3.f, ((i)object2).f);
        }
        if (!bl3) {
            h.b(((i)object2).f, jArray.f, ((i)object2).f);
        }
        jArray = new org.bouncycastle.math.ec.j[]{object2};
        return new j(d2, (org.bouncycastle.math.ec.j)object, (org.bouncycastle.math.ec.j)object3, jArray, this.e);
    }

    public final p s() {
        if (this.n()) {
            return this;
        }
        d d2 = this.c();
        i i2 = (i)this.c;
        if (i2.j()) {
            return d2.e();
        }
        i i3 = (i)this.b;
        i i4 = (i)this.d[0];
        Object object = new int[5];
        Object object2 = new int[5];
        int[] nArray = new int[5];
        h.d(i2.f, nArray);
        int[] nArray2 = new int[5];
        h.d(nArray, nArray2);
        boolean bl2 = i4.i();
        int[] nArray3 = i4.f;
        if (!bl2) {
            nArray3 = object2;
            h.d(i4.f, nArray3);
        }
        h.d(i3.f, nArray3, object);
        int[] nArray4 = object2;
        h.a(i3.f, nArray3, nArray4);
        h.b(nArray4, object, nArray4);
        h.a(org.bouncycastle.jcajce.provider.c.a.b(nArray4, nArray4, nArray4), nArray4);
        nArray3 = nArray;
        h.b(nArray, i3.f, nArray3);
        h.a(ab.d(5, nArray3, 0), nArray3);
        h.a(ab.b(5, nArray2, 0, object), object);
        i3 = new i(nArray2);
        h.d(nArray4, i3.f);
        h.d(i3.f, nArray3, i3.f);
        h.d(i3.f, nArray3, i3.f);
        object2 = new i(nArray3);
        h.d(nArray3, i3.f, object2.f);
        h.b(object2.f, nArray4, object2.f);
        h.d(object2.f, object, object2.f);
        object = new i(nArray4);
        h.e(i2.f, object.f);
        if (!bl2) {
            h.b(object.f, i4.f, object.f);
        }
        return new j(d2, i3, (org.bouncycastle.math.ec.j)object2, new org.bouncycastle.math.ec.j[]{object}, this.e);
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
        return new j(this.a, this.b, this.c.d(), this.d, this.e);
    }
}

