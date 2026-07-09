/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.k;

import java.math.BigInteger;
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
        BigInteger bigInteger = new BigInteger("0100FAF51354E0E39E4892DF6E319C72C8161603FA45AA7B998A167B8F1E629521", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(65286L);
        h h2 = new h(272, 1, 3, 56, new BigInteger("0091A091F03B5FBA4AB2CCF49C4EDD220FB028712D42BE752B2C40094DBACDB586FB20", 16), new BigInteger("7167EFC92BB2E3CE7C8AAAFF34E12A9C557003D7C73A6FAF003F99F6CC8482E540F7", 16), bigInteger, bigInteger2);
        return new aa((d)h2, new ac((d)h2, f.a("026108BABB2CEEBCF787058A056CBE0CFE622D7723A289E08A07AE13EF0D10D171DD8D")), bigInteger, bigInteger2, null);
    }
}

