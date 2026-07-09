/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.cc;
import org.bouncycastle.math.ec.d;

final class s
extends ab {
    s() {
    }

    protected final aa a() {
        d d2 = a.a(new cc());
        ac ac2 = new ac(d2, f.a("0429A0B6A887A983E9730988A68727A8B2D126C44CC2CC7B2A6555193035DC76310804F12E549BDB011C103089E73510ACB275FC312A5DC6B76553F0CA"));
        return new aa(d2, ac2, d2.i(), d2.j(), null);
    }
}

