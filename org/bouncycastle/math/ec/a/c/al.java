/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.math.ec.a.c.aj;
import org.bouncycastle.math.ec.a.c.ak;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.s;
import org.bouncycastle.openpgp.h;

public final class al
extends s {
    public al(d d2) {
        this(d2, null, null, false);
    }

    public al(d d2, j j2, j j3, boolean bl2) {
        super(d2, j2, j3);
        if (j2 == null != (j3 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = bl2;
    }

    al(d d2, j j2, j j3, j[] jArray, boolean bl2) {
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
        Object object = (ak)this.b;
        Object object2 = (ak)this.c;
        ak ak2 = (ak)jArray.g();
        Object object3 = (ak)jArray.h();
        ak ak3 = (ak)this.d[0];
        jArray = (ak)jArray.a(0);
        int[] nArray4 = new int[16];
        int[] nArray5 = new int[8];
        int[] nArray6 = new int[8];
        int[] nArray7 = new int[8];
        boolean bl2 = ak3.i();
        if (bl2) {
            nArray3 = ak2.f;
            nArray2 = ((ak)object3).f;
        } else {
            nArray2 = nArray6;
            aj.d(ak3.f, nArray2);
            nArray3 = nArray5;
            aj.b(nArray2, ak2.f, nArray3);
            aj.b(nArray2, ak3.f, nArray2);
            aj.b(nArray2, ((ak)object3).f, nArray2);
        }
        boolean bl3 = jArray.i();
        if (bl3) {
            object3 = ((ak)object).f;
            nArray = ((ak)object2).f;
        } else {
            nArray = nArray7;
            aj.d(jArray.f, nArray);
            object3 = nArray4;
            aj.b(nArray, ((ak)object).f, (int[])object3);
            aj.b(nArray, jArray.f, nArray);
            aj.b(nArray, ((ak)object2).f, nArray);
        }
        object2 = new int[8];
        aj.d((int[])object3, nArray3, (int[])object2);
        aj.d(nArray, nArray2, nArray5);
        if (h.b((int[])object2)) {
            if (h.b(nArray5)) {
                return this.s();
            }
            return d2.e();
        }
        object = nArray6;
        aj.d((int[])object2, (int[])object);
        nArray3 = new int[8];
        aj.b((int[])object, (int[])object2, nArray3);
        aj.b((int[])object, (int[])object3, nArray6);
        aj.b(nArray3, nArray3);
        h.d(nArray, nArray3, nArray4);
        aj.a(h.b(nArray6, nArray6, nArray3), nArray3);
        object = new ak(nArray7);
        aj.d(nArray5, ((ak)object).f);
        aj.d(((ak)object).f, nArray3, ((ak)object).f);
        object3 = new ak(nArray3);
        aj.d(nArray6, ((ak)object).f, ((ak)object3).f);
        aj.c(((ak)object3).f, nArray5, nArray4);
        aj.c(nArray4, ((ak)object3).f);
        object2 = new ak((int[])object2);
        if (!bl2) {
            aj.b(((ak)object2).f, ak3.f, ((ak)object2).f);
        }
        if (!bl3) {
            aj.b(((ak)object2).f, jArray.f, ((ak)object2).f);
        }
        jArray = new j[]{object2};
        return new al(d2, (j)object, (j)object3, jArray, this.e);
    }

    public final p s() {
        if (this.n()) {
            return this;
        }
        d d2 = this.c();
        ak ak2 = (ak)this.c;
        if (ak2.j()) {
            return d2.e();
        }
        ak ak3 = (ak)this.b;
        ak ak4 = (ak)this.d[0];
        Object object = new int[8];
        Object object2 = new int[8];
        int[] nArray = new int[8];
        aj.d(ak2.f, nArray);
        int[] nArray2 = new int[8];
        aj.d(nArray, nArray2);
        boolean bl2 = ak4.i();
        int[] nArray3 = ak4.f;
        if (!bl2) {
            nArray3 = object2;
            aj.d(ak4.f, nArray3);
        }
        aj.d(ak3.f, nArray3, object);
        int[] nArray4 = object2;
        aj.a(ak3.f, nArray3, nArray4);
        aj.b(nArray4, object, nArray4);
        aj.a(h.b(nArray4, nArray4, nArray4), nArray4);
        nArray3 = nArray;
        aj.b(nArray, ak3.f, nArray3);
        aj.a(ab.d(8, nArray3, 0), nArray3);
        aj.a(ab.b(8, nArray2, 0, object), object);
        ak3 = new ak(nArray2);
        aj.d(nArray4, ak3.f);
        aj.d(ak3.f, nArray3, ak3.f);
        aj.d(ak3.f, nArray3, ak3.f);
        object2 = new ak(nArray3);
        aj.d(nArray3, ak3.f, object2.f);
        aj.b(object2.f, nArray4, object2.f);
        aj.d(object2.f, object, object2.f);
        object = new ak(nArray4);
        aj.e(ak2.f, object.f);
        if (!bl2) {
            aj.b(object.f, ak4.f, object.f);
        }
        return new al(d2, ak3, (j)object2, new j[]{object}, this.e);
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
        return new al(this.a, this.b, this.c.d(), this.d, this.e);
    }
}

