/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.ec.a;
import org.bouncycastle.math.ec.a.c.t;
import org.bouncycastle.math.ec.a.c.u;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.s;

public final class v
extends s {
    public v(d d2) {
        this(d2, null, null, false);
    }

    public v(d d2, j j2, j j3, boolean bl2) {
        super(d2, j2, j3);
        if (j2 == null != (j3 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = bl2;
    }

    v(d d2, j j2, j j3, j[] jArray, boolean bl2) {
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
        Object object = (u)this.b;
        Object object2 = (u)this.c;
        u u2 = (u)jArray.g();
        Object object3 = (u)jArray.h();
        u u3 = (u)this.d[0];
        jArray = (u)jArray.a(0);
        int[] nArray4 = new int[12];
        int[] nArray5 = new int[6];
        int[] nArray6 = new int[6];
        int[] nArray7 = new int[6];
        boolean bl2 = u3.i();
        if (bl2) {
            nArray3 = u2.f;
            nArray2 = ((u)object3).f;
        } else {
            nArray2 = nArray6;
            t.d(u3.f, nArray2);
            nArray3 = nArray5;
            t.b(nArray2, u2.f, nArray3);
            t.b(nArray2, u3.f, nArray2);
            t.b(nArray2, ((u)object3).f, nArray2);
        }
        boolean bl3 = jArray.i();
        if (bl3) {
            object3 = ((u)object).f;
            nArray = ((u)object2).f;
        } else {
            nArray = nArray7;
            t.d(jArray.f, nArray);
            object3 = nArray4;
            t.b(nArray, ((u)object).f, (int[])object3);
            t.b(nArray, jArray.f, nArray);
            t.b(nArray, ((u)object2).f, nArray);
        }
        object2 = new int[6];
        t.d((int[])object3, nArray3, (int[])object2);
        t.d(nArray, nArray2, nArray5);
        if (org.bouncycastle.math.ec.a.b((int[])object2)) {
            if (org.bouncycastle.math.ec.a.b(nArray5)) {
                return this.s();
            }
            return d2.e();
        }
        object = nArray6;
        t.d((int[])object2, (int[])object);
        nArray3 = new int[6];
        t.b((int[])object, (int[])object2, nArray3);
        t.b((int[])object, (int[])object3, nArray6);
        t.b(nArray3, nArray3);
        org.bouncycastle.math.ec.a.d(nArray, nArray3, nArray4);
        t.a(org.bouncycastle.math.ec.a.b(nArray6, nArray6, nArray3), nArray3);
        object = new u(nArray7);
        t.d(nArray5, ((u)object).f);
        t.d(((u)object).f, nArray3, ((u)object).f);
        object3 = new u(nArray3);
        t.d(nArray6, ((u)object).f, ((u)object3).f);
        t.c(((u)object3).f, nArray5, nArray4);
        t.c(nArray4, ((u)object3).f);
        object2 = new u((int[])object2);
        if (!bl2) {
            t.b(((u)object2).f, u3.f, ((u)object2).f);
        }
        if (!bl3) {
            t.b(((u)object2).f, jArray.f, ((u)object2).f);
        }
        jArray = new j[]{object2};
        return new v(d2, (j)object, (j)object3, jArray, this.e);
    }

    public final p s() {
        if (this.n()) {
            return this;
        }
        d d2 = this.c();
        u u2 = (u)this.c;
        if (u2.j()) {
            return d2.e();
        }
        u u3 = (u)this.b;
        u u4 = (u)this.d[0];
        Object object = new int[6];
        Object object2 = new int[6];
        int[] nArray = new int[6];
        t.d(u2.f, nArray);
        int[] nArray2 = new int[6];
        t.d(nArray, nArray2);
        boolean bl2 = u4.i();
        int[] nArray3 = u4.f;
        if (!bl2) {
            nArray3 = object2;
            t.d(u4.f, nArray3);
        }
        t.d(u3.f, nArray3, object);
        int[] nArray4 = object2;
        t.a(u3.f, nArray3, nArray4);
        t.b(nArray4, object, nArray4);
        t.a(org.bouncycastle.math.ec.a.b(nArray4, nArray4, nArray4), nArray4);
        nArray3 = nArray;
        t.b(nArray, u3.f, nArray3);
        t.a(ab.d(6, nArray3, 0), nArray3);
        t.a(ab.b(6, nArray2, 0, object), object);
        u3 = new u(nArray2);
        t.d(nArray4, u3.f);
        t.d(u3.f, nArray3, u3.f);
        t.d(u3.f, nArray3, u3.f);
        object2 = new u(nArray3);
        t.d(nArray3, u3.f, object2.f);
        t.b(object2.f, nArray4, object2.f);
        t.d(object2.f, object, object2.f);
        object = new u(nArray4);
        t.e(u2.f, object.f);
        if (!bl2) {
            t.b(object.f, u4.f, object.f);
        }
        return new v(d2, u3, (j)object2, new j[]{object}, this.e);
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
        return new v(this.a, this.b, this.c.d(), this.d, this.e);
    }
}

