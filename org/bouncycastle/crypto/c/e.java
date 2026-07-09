/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.am;
import org.bouncycastle.math.ec.d;

final class e
extends ab {
    e() {
    }

    protected final aa a() {
        byte[] byArray = f.a("A335926AA319A27A1D00896A6773A4827ACDAC73");
        d d2 = a.a(new am());
        ac ac2 = new ac(d2, f.a("04AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB73617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

