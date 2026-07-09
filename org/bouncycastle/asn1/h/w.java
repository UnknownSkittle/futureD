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

final class w
extends ab {
    w() {
    }

    protected final aa a() {
        Object object = BigInteger.valueOf(1L);
        Object object2 = a.b("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5");
        byte[] byArray = f.a("77E2B07370EB0F832A6DD5B62DFC88CD06BB84BE");
        BigInteger bigInteger = a.b("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307");
        BigInteger bigInteger2 = BigInteger.valueOf(2L);
        object = a.a(new h(283, 5, 7, 12, (BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2));
        object2 = new ac((d)object, f.a("0405F939258DB7DD90E1934F8C70B0DFEC2EED25B8557EAC9C80E2E198F8CDBECD86B1205303676854FE24141CB98FE6D4B20D02B4516FF702350EDDB0826779C813F0DF45BE8112F4"));
        return new aa((d)object, (ac)object2, bigInteger, bigInteger2, byArray);
    }
}

