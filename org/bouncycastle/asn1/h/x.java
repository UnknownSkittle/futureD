/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.h;

import java.math.BigInteger;
import org.bouncycastle.asn1.h.a;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.i;

final class x
extends ab {
    x() {
    }

    protected final aa a() {
        Object object = a.b("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF");
        Object object2 = a.b("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC");
        BigInteger bigInteger = a.b("E87579C11079F43DD824993C2CEE5ED3");
        byte[] byArray = f.a("000E0D4D696E6768756151750CC03A4473D03679");
        BigInteger bigInteger2 = a.b("FFFFFFFE0000000075A30D1B9038A115");
        BigInteger bigInteger3 = BigInteger.valueOf(1L);
        object = a.a(new i((BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2, bigInteger3));
        object2 = new ac((d)object, f.a("04161FF7528B899B2D0C28607CA52C5B86CF5AC8395BAFEB13C02DA292DDED7A83"));
        return new aa((d)object, (ac)object2, bigInteger2, bigInteger3, byArray);
    }
}

