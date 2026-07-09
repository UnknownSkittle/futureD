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

final class ae
extends ab {
    ae() {
    }

    protected final aa a() {
        Object object = a.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF");
        Object object2 = a.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC");
        BigInteger bigInteger = a.b("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45");
        byte[] byArray = f.a("1053CDE42C14D696E67687561517533BF3F83345");
        BigInteger bigInteger2 = a.b("0100000000000000000001F4C8F927AED3CA752257");
        BigInteger bigInteger3 = BigInteger.valueOf(1L);
        object = a.a(new i((BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2, bigInteger3));
        object2 = new ac((d)object, f.a("044A96B5688EF573284664698968C38BB913CBFC8223A628553168947D59DCC912042351377AC5FB32"));
        return new aa((d)object, (ac)object2, bigInteger2, bigInteger3, byArray);
    }
}

