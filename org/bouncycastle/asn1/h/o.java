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

final class o
extends ab {
    o() {
    }

    protected final aa a() {
        Object object = a.b("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2");
        Object object2 = a.b("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9");
        byte[] byArray = f.a("24B7B137C8A14D696E6768756151756FD0DA2E5C");
        BigInteger bigInteger = a.b("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B");
        BigInteger bigInteger2 = BigInteger.valueOf(2L);
        object = a.a(new h(163, 3, 6, 7, (BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2));
        object2 = new ac((d)object, f.a("040369979697AB43897789566789567F787A7876A65400435EDB42EFAFB2989D51FEFCE3C80988F41FF883"));
        return new aa((d)object, (ac)object2, bigInteger, bigInteger2, byArray);
    }
}

