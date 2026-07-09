/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.i;

import java.math.BigInteger;
import org.bouncycastle.asn1.i.a;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.d;

final class i
extends ab {
    i() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("C302F41D932A36CDA7A3462F9E9E916B5BE8F1029AC4ACC1", 16);
        BigInteger bigInteger2 = new BigInteger("01", 16);
        d d2 = a.a(new org.bouncycastle.math.ec.i(new BigInteger("C302F41D932A36CDA7A3463093D18DB78FCE476DE1A86297", 16), new BigInteger("6A91174076B1E0E19C39C031FE8685C1CAE040E5C69A28EF", 16), new BigInteger("469A28EF7C28CCA3DC721D044F4496BCCA7EF4146FBF25C9", 16), bigInteger, bigInteger2));
        return new aa(d2, new ac(d2, f.a("04C0A0647EAAB6A48753B033C56CB0F0900A2F5C4853375FD614B690866ABD5BB88B5F4828C1490002E6773FA2FA299B8F")), bigInteger, bigInteger2);
    }
}

