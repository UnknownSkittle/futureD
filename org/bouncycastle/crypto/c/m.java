/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.d;

final class m
extends ab {
    m() {
    }

    protected final aa a() {
        byte[] byArray = f.a("000E0D4D696E6768756151750CC03A4473D03679");
        d d2 = a.a(new org.bouncycastle.math.ec.a.c.a());
        ac ac2 = new ac(d2, f.a("04161FF7528B899B2D0C28607CA52C5B86CF5AC8395BAFEB13C02DA292DDED7A83"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

