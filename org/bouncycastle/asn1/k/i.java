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

final class i
extends ab {
    i() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("2000000000000000000000000000000F4D42FFE1492A4993F1CAD666E447", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(4L);
        h h2 = new h(239, 36, new BigInteger("32010857077C5431123A46B808906756F543423E8D27877578125778AC76", 16), new BigInteger("790408F2EEDAF392B012EDEFB3392F30F4327C0CA3F31FC383C422AA8C16", 16), bigInteger, bigInteger2);
        return new aa((d)h2, new ac((d)h2, f.a("0257927098FA932E7C0A96D3FD5B706EF7E5F5C156E16B7E7C86038552E91D")), bigInteger, bigInteger2, null);
    }
}

