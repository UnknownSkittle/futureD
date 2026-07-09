/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.b.a;
import org.bouncycastle.math.ec.a.c.x;
import org.bouncycastle.math.ec.a.c.y;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.s;

public final class z
extends s {
    public z(d d2) {
        this(d2, null, null, false);
    }

    public z(d d2, j j2, j j3, boolean bl2) {
        super(d2, j2, j3);
        if (j2 == null != (j3 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = bl2;
    }

    z(d d2, j j2, j j3, j[] jArray, boolean bl2) {
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
        Object object = (y)this.b;
        Object object2 = (y)this.c;
        y y2 = (y)jArray.g();
        Object object3 = (y)jArray.h();
        y y3 = (y)this.d[0];
        jArray = (y)jArray.a(0);
        int[] nArray4 = new int[14];
        int[] nArray5 = new int[7];
        int[] nArray6 = new int[7];
        int[] nArray7 = new int[7];
        boolean bl2 = y3.i();
        if (bl2) {
            nArray3 = y2.f;
            nArray2 = ((y)object3).f;
        } else {
            nArray2 = nArray6;
            x.d(y3.f, nArray2);
            nArray3 = nArray5;
            x.b(nArray2, y2.f, nArray3);
            x.b(nArray2, y3.f, nArray2);
            x.b(nArray2, ((y)object3).f, nArray2);
        }
        boolean bl3 = jArray.i();
        if (bl3) {
            object3 = ((y)object).f;
            nArray = ((y)object2).f;
        } else {
            nArray = nArray7;
            x.d(jArray.f, nArray);
            object3 = nArray4;
            x.b(nArray, ((y)object).f, (int[])object3);
            x.b(nArray, jArray.f, nArray);
            x.b(nArray, ((y)object2).f, nArray);
        }
        object2 = new int[7];
        x.d((int[])object3, nArray3, (int[])object2);
        x.d(nArray, nArray2, nArray5);
        if (org.bouncycastle.math.b.a.b((int[])object2)) {
            if (org.bouncycastle.math.b.a.b(nArray5)) {
                return this.s();
            }
            return d2.e();
        }
        object = nArray6;
        x.d((int[])object2, (int[])object);
        nArray3 = new int[7];
        x.b((int[])object, (int[])object2, nArray3);
        x.b((int[])object, (int[])object3, nArray6);
        x.b(nArray3, nArray3);
        org.bouncycastle.math.b.a.c(nArray, nArray3, nArray4);
        x.a(org.bouncycastle.math.b.a.b(nArray6, nArray6, nArray3), nArray3);
        object = new y(nArray7);
        x.d(nArray5, ((y)object).f);
        x.d(((y)object).f, nArray3, ((y)object).f);
        object3 = new y(nArray3);
        x.d(nArray6, ((y)object).f, ((y)object3).f);
        x.c(((y)object3).f, nArray5, nArray4);
        x.c(nArray4, ((y)object3).f);
        object2 = new y((int[])object2);
        if (!bl2) {
            x.b(((y)object2).f, y3.f, ((y)object2).f);
        }
        if (!bl3) {
            x.b(((y)object2).f, jArray.f, ((y)object2).f);
        }
        jArray = new j[]{object2};
        return new z(d2, (j)object, (j)object3, jArray, this.e);
    }

    public final p s() {
        if (this.n()) {
            return this;
        }
        d d2 = this.c();
        y y2 = (y)this.c;
        if (y2.j()) {
            return d2.e();
        }
        Object object = (y)this.b;
        y y3 = (y)this.d[0];
        Object object2 = new int[7];
        x.d(y2.f, object2);
        Object object3 = new int[7];
        x.d(object2, object3);
        int[] nArray = new int[7];
        x.d(((y)object).f, nArray);
        x.a(org.bouncycastle.math.b.a.b(nArray, nArray, nArray), nArray);
        int[] nArray2 = object2;
        x.b(object2, ((y)object).f, nArray2);
        x.a(ab.d(7, nArray2, 0), nArray2);
        object = new int[7];
        x.a(ab.b(7, object3, 0, (int[])object), (int[])object);
        object3 = new y((int[])object3);
        x.d(nArray, object3.f);
        x.d(object3.f, nArray2, object3.f);
        x.d(object3.f, nArray2, object3.f);
        object2 = new y(nArray2);
        x.d(nArray2, object3.f, object2.f);
        x.b(object2.f, nArray, object2.f);
        x.d(object2.f, (int[])object, object2.f);
        object = new y(nArray);
        x.e(y2.f, ((y)object).f);
        if (!y3.i()) {
            x.b(((y)object).f, y3.f, ((y)object).f);
        }
        return new z(d2, (j)object3, (j)object2, new j[]{object}, this.e);
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
        return new z(this.a, this.b, this.c.d(), this.d, this.e);
    }
}

