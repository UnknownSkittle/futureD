/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.jcajce.provider.c.a;
import org.bouncycastle.math.ec.a.c.l;
import org.bouncycastle.math.ec.a.c.m;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.s;

public final class f
extends s {
    public f(d d2) {
        this(d2, null, null, false);
    }

    public f(d d2, j j2, j j3, boolean bl2) {
        super(d2, j2, j3);
        if (j2 == null != (j3 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = bl2;
    }

    f(d d2, j j2, j j3, j[] jArray, boolean bl2) {
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
        Object object = (m)this.b;
        Object object2 = (m)this.c;
        m m2 = (m)jArray.g();
        Object object3 = (m)jArray.h();
        m m3 = (m)this.d[0];
        jArray = (m)jArray.a(0);
        int[] nArray4 = new int[10];
        int[] nArray5 = new int[5];
        int[] nArray6 = new int[5];
        int[] nArray7 = new int[5];
        boolean bl2 = m3.i();
        if (bl2) {
            nArray3 = m2.f;
            nArray2 = ((m)object3).f;
        } else {
            nArray2 = nArray6;
            l.d(m3.f, nArray2);
            nArray3 = nArray5;
            l.b(nArray2, m2.f, nArray3);
            l.b(nArray2, m3.f, nArray2);
            l.b(nArray2, ((m)object3).f, nArray2);
        }
        boolean bl3 = jArray.i();
        if (bl3) {
            object3 = ((m)object).f;
            nArray = ((m)object2).f;
        } else {
            nArray = nArray7;
            l.d(jArray.f, nArray);
            object3 = nArray4;
            l.b(nArray, ((m)object).f, (int[])object3);
            l.b(nArray, jArray.f, nArray);
            l.b(nArray, ((m)object2).f, nArray);
        }
        object2 = new int[5];
        l.d((int[])object3, nArray3, (int[])object2);
        l.d(nArray, nArray2, nArray5);
        if (org.bouncycastle.jcajce.provider.c.a.b((int[])object2)) {
            if (org.bouncycastle.jcajce.provider.c.a.b(nArray5)) {
                return this.s();
            }
            return d2.e();
        }
        object = nArray6;
        l.d((int[])object2, (int[])object);
        nArray3 = new int[5];
        l.b((int[])object, (int[])object2, nArray3);
        l.b((int[])object, (int[])object3, nArray6);
        l.b(nArray3, nArray3);
        org.bouncycastle.jcajce.provider.c.a.c(nArray, nArray3, nArray4);
        l.a(org.bouncycastle.jcajce.provider.c.a.b(nArray6, nArray6, nArray3), nArray3);
        object = new m(nArray7);
        l.d(nArray5, ((m)object).f);
        l.d(((m)object).f, nArray3, ((m)object).f);
        object3 = new m(nArray3);
        l.d(nArray6, ((m)object).f, ((m)object3).f);
        l.c(((m)object3).f, nArray5, nArray4);
        l.c(nArray4, ((m)object3).f);
        object2 = new m((int[])object2);
        if (!bl2) {
            l.b(((m)object2).f, m3.f, ((m)object2).f);
        }
        if (!bl3) {
            l.b(((m)object2).f, jArray.f, ((m)object2).f);
        }
        jArray = new j[]{object2};
        return new f(d2, (j)object, (j)object3, jArray, this.e);
    }

    public final p s() {
        if (this.n()) {
            return this;
        }
        d d2 = this.c();
        m m2 = (m)this.c;
        if (m2.j()) {
            return d2.e();
        }
        Object object = (m)this.b;
        m m3 = (m)this.d[0];
        Object object2 = new int[5];
        l.d(m2.f, object2);
        Object object3 = new int[5];
        l.d(object2, object3);
        int[] nArray = new int[5];
        l.d(((m)object).f, nArray);
        l.a(org.bouncycastle.jcajce.provider.c.a.b(nArray, nArray, nArray), nArray);
        int[] nArray2 = object2;
        l.b(object2, ((m)object).f, nArray2);
        l.a(ab.d(5, nArray2, 0), nArray2);
        object = new int[5];
        l.a(ab.b(5, object3, 0, (int[])object), (int[])object);
        object3 = new m((int[])object3);
        l.d(nArray, object3.f);
        l.d(object3.f, nArray2, object3.f);
        l.d(object3.f, nArray2, object3.f);
        object2 = new m(nArray2);
        l.d(nArray2, object3.f, object2.f);
        l.b(object2.f, nArray, object2.f);
        l.d(object2.f, (int[])object, object2.f);
        object = new m(nArray);
        l.e(m2.f, ((m)object).f);
        if (!m3.i()) {
            l.b(((m)object).f, m3.f, ((m)object).f);
        }
        return new f(d2, (j)object3, (j)object2, new j[]{object}, this.e);
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
        return new f(this.a, this.b, this.c.d(), this.d, this.e);
    }
}

