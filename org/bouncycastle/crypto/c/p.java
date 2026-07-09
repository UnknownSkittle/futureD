/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.bs;
import org.bouncycastle.math.ec.d;

final class p
extends ab {
    p() {
    }

    protected final aa a() {
        byte[] byArray = f.a("10B7B4D696E676875615175137C8A16FD0DA2211");
        d d2 = a.a(new bs());
        ac ac2 = new ac(d2, f.a("0400D9B67D192E0367C803F39E1A7E82CA14A651350AAE617E8F01CE94335607C304AC29E7DEFBD9CA01F596F927224CDECF6C"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

