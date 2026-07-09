/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.k;
import org.bouncycastle.math.ec.d;

final class ac
extends ab {
    ac() {
    }

    protected final aa a() {
        byte[] byArray = f.a("B99B99B099B323E02709A4D696E6768756151751");
        d d2 = a.a(new k());
        org.bouncycastle.asn1.k.ac ac2 = new org.bouncycastle.asn1.k.ac(d2, f.a("0452DCB034293A117E1F4FF11B30F7199D3144CE6DFEAFFEF2E331F296E071FA0DF9982CFEA7D43F2E"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

