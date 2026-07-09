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

final class l
extends ab {
    l() {
    }

    protected final aa a() {
        Object object = a.b("03E5A88919D7CAFCBF415F07C2176573B2");
        Object object2 = a.b("04B8266A46C55657AC734CE38F018F2192");
        byte[] byArray = f.a("985BD3ADBAD4D696E676875615175A21B43A97E3");
        BigInteger bigInteger = a.b("0400000000000000016954A233049BA98F");
        BigInteger bigInteger2 = BigInteger.valueOf(2L);
        object = a.a(new h(131, 2, 3, 8, (BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2));
        object2 = new ac((d)object, f.a("040356DCD8F2F95031AD652D23951BB366A80648F06D867940A5366D9E265DE9EB240F"));
        return new aa((d)object, (ac)object2, bigInteger, bigInteger2, byArray);
    }
}

