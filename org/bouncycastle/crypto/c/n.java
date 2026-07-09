/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.bm;
import org.bouncycastle.math.ec.d;

final class n
extends ab {
    n() {
    }

    protected final aa a() {
        byte[] byArray = f.a("85E25BFE5C86226CDB12016F7553F9D0E693A268");
        d d2 = a.a(new bm());
        ac ac2 = new ac(d2, f.a("0403F0EBA16286A2D57EA0991168D4994637E8343E3600D51FBC6C71A0094FA2CDD545B11C5C0C797324F1"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

