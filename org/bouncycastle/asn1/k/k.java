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

final class k
extends ab {
    k() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("0CCCCCCCCCCCCCCCCCCCCCCCCCCCCCAC4912D2D9DF903EF9888B8A0E4CFF", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(10L);
        h h2 = new h(239, 36, new BigInteger("01238774666A67766D6676F778E676B66999176666E687666D8766C66A9F", 16), new BigInteger("6A941977BA9F6A435199ACFC51067ED587F519C5ECB541B8E44111DE1D40", 16), bigInteger, bigInteger2);
        return new aa((d)h2, new ac((d)h2, f.a("0370F6E9D04D289C4E89913CE3530BFDE903977D42B146D539BF1BDE4E9C92")), bigInteger, bigInteger2, null);
    }
}

