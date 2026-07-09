/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.a;

import org.bouncycastle.math.ec.a.a.b;
import org.bouncycastle.math.ec.a.a.c;
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

    public final j a(int n2) {
        if (n2 == 1) {
            return this.u();
        }
        return super.a(n2);
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
        c c2 = (c)this.b;
        Object object = (c)this.c;
        c c3 = (c)this.d[0];
        c c4 = (c)jArray.g();
        Object object2 = (c)jArray.h();
        jArray = (c)jArray.a(0);
        int[] nArray4 = new int[16];
        int[] nArray5 = new int[8];
        int[] nArray6 = new int[8];
        int[] nArray7 = new int[8];
        boolean bl2 = c3.i();
        if (bl2) {
            nArray3 = c4.f;
            nArray2 = ((c)object2).f;
        } else {
            nArray2 = nArray6;
            org.bouncycastle.math.ec.a.a.b.d(c3.f, nArray2);
            nArray3 = nArray5;
            org.bouncycastle.math.ec.a.a.b.b(nArray2, c4.f, nArray3);
            org.bouncycastle.math.ec.a.a.b.b(nArray2, c3.f, nArray2);
            org.bouncycastle.math.ec.a.a.b.b(nArray2, ((c)object2).f, nArray2);
        }
        boolean bl3 = jArray.i();
        if (bl3) {
            object2 = c2.f;
            nArray = ((c)object).f;
        } else {
            nArray = nArray7;
            org.bouncycastle.math.ec.a.a.b.d(jArray.f, nArray);
            object2 = nArray4;
            org.bouncycastle.math.ec.a.a.b.b(nArray, c2.f, (int[])object2);
            org.bouncycastle.math.ec.a.a.b.b(nArray, jArray.f, nArray);
            org.bouncycastle.math.ec.a.a.b.b(nArray, ((c)object).f, nArray);
        }
        object = new int[8];
        org.bouncycastle.math.ec.a.a.b.d((int[])object2, nArray3, (int[])object);
        org.bouncycastle.math.ec.a.a.b.d(nArray, nArray2, nArray5);
        if (h.b((int[])object)) {
            if (h.b(nArray5)) {
                return this.s();
            }
            return d2.e();
        }
        nArray3 = new int[8];
        org.bouncycastle.math.ec.a.a.b.d((int[])object, nArray3);
        nArray2 = new int[8];
        org.bouncycastle.math.ec.a.a.b.b(nArray3, (int[])object, nArray2);
        org.bouncycastle.math.ec.a.a.b.b(nArray3, (int[])object2, nArray6);
        org.bouncycastle.math.ec.a.a.b.b(nArray2, nArray2);
        h.d(nArray, nArray2, nArray4);
        org.bouncycastle.math.ec.a.a.b.a(h.b(nArray6, nArray6, nArray2), nArray2);
        c2 = new c(nArray7);
        org.bouncycastle.math.ec.a.a.b.d(nArray5, c2.f);
        org.bouncycastle.math.ec.a.a.b.d(c2.f, nArray2, c2.f);
        object2 = new c(nArray2);
        org.bouncycastle.math.ec.a.a.b.d(nArray6, c2.f, ((c)object2).f);
        org.bouncycastle.math.ec.a.a.b.c(((c)object2).f, nArray5, nArray4);
        org.bouncycastle.math.ec.a.a.b.c(nArray4, ((c)object2).f);
        object = new c((int[])object);
        if (!bl2) {
            org.bouncycastle.math.ec.a.a.b.b(((c)object).f, c3.f, ((c)object).f);
        }
        if (!bl3) {
            org.bouncycastle.math.ec.a.a.b.b(((c)object).f, jArray.f, ((c)object).f);
        }
        jArray = bl2 && bl3 ? nArray3 : null;
        jArray = this.a((c)object, (int[])jArray);
        jArray = new j[]{object, jArray};
        return new d(d2, c2, (j)object2, jArray, this.e);
    }

    public final p s() {
        if (this.n()) {
            return this;
        }
        org.bouncycastle.math.ec.d d2 = this.c();
        if (this.c.j()) {
            return d2.e();
        }
        return this.c(true);
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
        return this.c(false).b(p2);
    }

    public final p t() {
        if (this.n()) {
            return this;
        }
        if (this.c.j()) {
            return this;
        }
        return this.c(false).b(this);
    }

    public final p r() {
        if (this.n()) {
            return this;
        }
        return new d(this.c(), this.b, this.c.d(), this.d, this.e);
    }

    private c a(c c2, int[] nArray) {
        c c3 = (c)this.c().g();
        if (c2.i()) {
            return c3;
        }
        c c4 = new c();
        if (nArray == null) {
            nArray = c4.f;
            org.bouncycastle.math.ec.a.a.b.d(c2.f, nArray);
        }
        org.bouncycastle.math.ec.a.a.b.d(nArray, c4.f);
        org.bouncycastle.math.ec.a.a.b.b(c4.f, c3.f, c4.f);
        return c4;
    }

    private c u() {
        c c2 = (c)this.d[1];
        if (c2 == null) {
            d d2 = this;
            c2 = d2.a((c)d2.d[0], null);
            this.d[1] = c2;
        }
        return c2;
    }

    private d c(boolean bl2) {
        Object object = (c)this.b;
        Object object2 = (c)this.c;
        c c2 = (c)this.d[0];
        c c3 = this.u();
        int[] nArray = new int[8];
        org.bouncycastle.math.ec.a.a.b.d(((c)object).f, nArray);
        org.bouncycastle.math.ec.a.a.b.a(h.b(nArray, nArray, nArray) + h.a(c3.f, nArray), nArray);
        int[] nArray2 = new int[8];
        org.bouncycastle.math.ec.a.a.b.e(((c)object2).f, nArray2);
        Object object3 = new int[8];
        org.bouncycastle.math.ec.a.a.b.b(nArray2, ((c)object2).f, object3);
        object2 = new int[8];
        org.bouncycastle.math.ec.a.a.b.b(object3, ((c)object).f, (int[])object2);
        Object object4 = object2;
        org.bouncycastle.math.ec.a.a.b.e((int[])object4, (int[])object4);
        object = new int[8];
        org.bouncycastle.math.ec.a.a.b.d(object3, (int[])object);
        Object object5 = object;
        org.bouncycastle.math.ec.a.a.b.e((int[])object5, (int[])object5);
        object3 = new c((int[])object3);
        org.bouncycastle.math.ec.a.a.b.d(nArray, object3.f);
        org.bouncycastle.math.ec.a.a.b.d(object3.f, (int[])object2, object3.f);
        org.bouncycastle.math.ec.a.a.b.d(object3.f, (int[])object2, object3.f);
        c c4 = new c((int[])object2);
        org.bouncycastle.math.ec.a.a.b.d((int[])object2, object3.f, c4.f);
        org.bouncycastle.math.ec.a.a.b.b(c4.f, nArray, c4.f);
        org.bouncycastle.math.ec.a.a.b.d(c4.f, (int[])object, c4.f);
        object2 = new c(nArray2);
        if (!h.a(c2.f)) {
            org.bouncycastle.math.ec.a.a.b.b(((c)object2).f, c2.f, ((c)object2).f);
        }
        c2 = null;
        if (bl2) {
            c2 = new c((int[])object);
            org.bouncycastle.math.ec.a.a.b.b(c2.f, c3.f, c2.f);
            org.bouncycastle.math.ec.a.a.b.e(c2.f, c2.f);
        }
        return new d(this.c(), (j)object3, c4, new j[]{object2, c2}, this.e);
    }
}

