/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.d;

final class aa
extends ab {
    aa() {
    }

    protected final org.bouncycastle.asn1.k.aa a() {
        d d2 = a.a(new org.bouncycastle.math.ec.a.b.a());
        ac ac2 = new ac(d2, f.a("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0"));
        return new org.bouncycastle.asn1.k.aa(d2, ac2, d2.i(), d2.j(), null);
    }
}

