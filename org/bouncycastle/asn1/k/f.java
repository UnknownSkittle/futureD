/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.k;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.h;

final class f
extends ab {
    f() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("20000000000000000000000050508CB89F652824E06B8173", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(4L);
        h h2 = new h(191, 9, new BigInteger("401028774D7777C7B7666D1366EA432071274F89FF01E718", 16), new BigInteger("0620048D28BCBD03B6249C99182B7C8CD19700C362C46A01", 16), bigInteger, bigInteger2);
        return new aa((d)h2, new ac((d)h2, org.bouncycastle.e.a.f.a("023809B2B7CC1B28CC5A87926AAD83FD28789E81E2C9E3BF10")), bigInteger, bigInteger2, null);
    }
}

