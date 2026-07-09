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

final class c
extends ab {
    c() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("03FFFFFFFFFFFFFFFFFFFE1AEE140F110AFF961309", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(2L);
        h h2 = new h(163, 1, 2, 8, new BigInteger("07A526C63D3E25A256A007699F5447E32AE456B50E", 16), new BigInteger("03F7061798EB99E238FD6F1BF95B48FEEB4854252B", 16), bigInteger, bigInteger2);
        return new aa((d)h2, new ac((d)h2, f.a("0202F9F87B7C574D0BDECF8A22E6524775F98CDEBDCB")), bigInteger, bigInteger2, null);
    }
}

