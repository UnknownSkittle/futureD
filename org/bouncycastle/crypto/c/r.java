/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.by;
import org.bouncycastle.math.ec.d;

final class r
extends ab {
    r() {
    }

    protected final aa a() {
        byte[] byArray = f.a("74D59FF07F6B413D0EA14B344B20A2DB049B50C3");
        d d2 = a.a(new by());
        ac ac2 = new ac(d2, f.a("0400FAC9DFCBAC8313BB2139F1BB755FEF65BC391F8B36F8F8EB7371FD558B01006A08A41903350678E58528BEBF8A0BEFF867A7CA36716F7E01F81052"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

