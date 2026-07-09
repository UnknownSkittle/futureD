/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.ai;

final class d
extends ab {
    d() {
    }

    protected final aa a() {
        byte[] byArray = f.a("C49D360886E704936A6678E1139D26B7819F7E90");
        org.bouncycastle.math.ec.d d2 = a.a(new ai());
        ac ac2 = new ac(d2, f.a("046B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C2964FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

