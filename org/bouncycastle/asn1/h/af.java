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

final class af
extends ab {
    af() {
    }

    protected final aa a() {
        Object object = a.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73");
        Object object2 = a.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70");
        BigInteger bigInteger = a.b("B4E134D3FB59EB8BAB57274904664D5AF50388BA");
        byte[] byArray = f.a("B99B99B099B323E02709A4D696E6768756151751");
        BigInteger bigInteger2 = a.b("0100000000000000000000351EE786A818F3A1A16B");
        BigInteger bigInteger3 = BigInteger.valueOf(1L);
        object = a.a(new i((BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2, bigInteger3));
        object2 = new ac((d)object, f.a("0452DCB034293A117E1F4FF11B30F7199D3144CE6DFEAFFEF2E331F296E071FA0DF9982CFEA7D43F2E"));
        return new aa((d)object, (ac)object2, bigInteger2, bigInteger3, byArray);
    }
}

