/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.bq;
import org.bouncycastle.math.ec.d;

final class o
extends ab {
    o() {
    }

    protected final aa a() {
        byte[] byArray = f.a("103FAEC74D696E676875615175777FC5B191EF30");
        d d2 = a.a(new bq());
        ac ac2 = new ac(d2, f.a("0401F481BC5F0FF84A74AD6CDF6FDEF4BF6179625372D8C0C5E10025E399F2903712CCF3EA9E3A1AD17FB0B3201B6AF7CE1B05"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

