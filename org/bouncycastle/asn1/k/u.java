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
import org.bouncycastle.math.ec.i;

final class u
extends ab {
    u() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("7fffffffffffffffffffffff7fffff975deb41b3a6057c3c432146526551", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(1L);
        i i2 = new i(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), new BigInteger("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc", 16), new BigInteger("255705fa2a306654b1f4cb03d6a750a30c250102d4988717d9ba15ab6d3e", 16), bigInteger, bigInteger2);
        return new aa((d)i2, new ac((d)i2, f.a("036768ae8e18bb92cfcf005c949aa2c6d94853d0e660bbf854b1c9505fe95a")), bigInteger, bigInteger2, f.a("7d7374168ffe3471b60a857686a19475d3bfa2ff"));
    }
}

