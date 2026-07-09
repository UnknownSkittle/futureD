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
import org.bouncycastle.math.ec.h;

final class i
extends ab {
    i() {
    }

    protected final aa a() {
        Object object = a.b("003088250CA6E7C7FE649CE85820F7");
        Object object2 = a.b("00E8BEE4D3E2260744188BE0E9C723");
        byte[] byArray = f.a("10E723AB14D696E6768756151756FEBF8FCB49A9");
        BigInteger bigInteger = a.b("0100000000000000D9CCEC8A39E56F");
        BigInteger bigInteger2 = BigInteger.valueOf(2L);
        object = a.a(new h(113, 9, (BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2));
        object2 = new ac((d)object, f.a("04009D73616F35F4AB1407D73562C10F00A52830277958EE84D1315ED31886"));
        return new aa((d)object, (ac)object2, bigInteger, bigInteger2, byArray);
    }
}

