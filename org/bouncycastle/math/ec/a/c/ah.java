/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.ec.a.c.af;
import org.bouncycastle.math.ec.a.c.ag;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.s;
import org.bouncycastle.openpgp.h;

public final class ah
extends s {
    public ah(d d2) {
        this(d2, null, null, false);
    }

    public ah(d d2, j j2, j j3, boolean bl2) {
        super(d2, j2, j3);
        if (j2 == null != (j3 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = bl2;
    }

    ah(d d2, j j2, j j3, j[] jArray, boolean bl2) {
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
        Object object = (ag)this.b;
        Object object2 = (ag)this.c;
        ag ag2 = (ag)jArray.g();
        Object object3 = (ag)jArray.h();
        ag ag3 = (ag)this.d[0];
        jArray = (ag)jArray.a(0);
        int[] nArray4 = new int[16];
        int[] nArray5 = new int[8];
        int[] nArray6 = new int[8];
        int[] nArray7 = new int[8];
        boolean bl2 = ag3.i();
        if (bl2) {
            nArray3 = ag2.f;
            nArray2 = ((ag)object3).f;
        } else {
            nArray2 = nArray6;
            af.d(ag3.f, nArray2);
            nArray3 = nArray5;
            af.b(nArray2, ag2.f, nArray3);
            af.b(nArray2, ag3.f, nArray2);
            af.b(nArray2, ((ag)object3).f, nArray2);
        }
        boolean bl3 = jArray.i();
        if (bl3) {
            object3 = ((ag)object).f;
            nArray = ((ag)object2).f;
        } else {
            nArray = nArray7;
            af.d(jArray.f, nArray);
            object3 = nArray4;
            af.b(nArray, ((ag)object).f, (int[])object3);
            af.b(nArray, jArray.f, nArray);
            af.b(nArray, ((ag)object2).f, nArray);
        }
        object2 = new int[8];
        af.d((int[])object3, nArray3, (int[])object2);
        af.d(nArray, nArray2, nArray5);
        if (h.b((int[])object2)) {
            if (h.b(nArray5)) {
                return this.s();
            }
            return d2.e();
        }
        object = nArray6;
        af.d((int[])object2, (int[])object);
        nArray3 = new int[8];
        af.b((int[])object, (int[])object2, nArray3);
        af.b((int[])object, (int[])object3, nArray6);
        af.b(nArray3, nArray3);
        h.d(nArray, nArray3, nArray4);
        af.a(h.b(nArray6, nArray6, nArray3), nArray3);
        object = new ag(nArray7);
        af.d(nArray5, ((ag)object).f);
        af.d(((ag)object).f, nArray3, ((ag)object).f);
        object3 = new ag(nArray3);
        af.d(nArray6, ((ag)object).f, ((ag)object3).f);
        af.c(((ag)object3).f, nArray5, nArray4);
        af.c(nArray4, ((ag)object3).f);
        object2 = new ag((int[])object2);
        if (!bl2) {
            af.b(((ag)object2).f, ag3.f, ((ag)object2).f);
        }
        if (!bl3) {
            af.b(((ag)object2).f, jArray.f, ((ag)object2).f);
        }
        jArray = new j[]{object2};
        return new ah(d2, (j)object, (j)object3, jArray, this.e);
    }

    public final p s() {
        if (this.n()) {
            return this;
        }
        d d2 = this.c();
        ag ag2 = (ag)this.c;
        if (ag2.j()) {
            return d2.e();
        }
        Object object = (ag)this.b;
        ag ag3 = (ag)this.d[0];
        Object object2 = new int[8];
        af.d(ag2.f, object2);
        Object object3 = new int[8];
        af.d(object2, object3);
        int[] nArray = new int[8];
        af.d(((ag)object).f, nArray);
        af.a(h.b(nArray, nArray, nArray), nArray);
        int[] nArray2 = object2;
        af.b(object2, ((ag)object).f, nArray2);
        af.a(ab.d(8, nArray2, 0), nArray2);
        object = new int[8];
        af.a(ab.b(8, object3, 0, (int[])object), (int[])object);
        object3 = new ag((int[])object3);
        af.d(nArray, object3.f);
        af.d(object3.f, nArray2, object3.f);
        af.d(object3.f, nArray2, object3.f);
        object2 = new ag(nArray2);
        af.d(nArray2, object3.f, object2.f);
        af.b(object2.f, nArray, object2.f);
        af.d(object2.f, (int[])object, object2.f);
        object = new ag(nArray);
        af.e(ag2.f, ((ag)object).f);
        if (!ag3.i()) {
            af.b(((ag)object).f, ag3.f, ((ag)object).f);
        }
        return new ah(d2, (j)object3, (j)object2, new j[]{object}, this.e);
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
        return new ah(this.a, this.b, this.c.d(), this.d, this.e);
    }
}

