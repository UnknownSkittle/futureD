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

final class b
extends ab {
    b() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("ffffffffffffffffffffffff99def836146bc9b1b4d22831", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(1L);
        i i2 = new i(new BigInteger("6277101735386680763835789423207666416083908700390324961279"), new BigInteger("fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger("64210519e59c80e70fa7e9ab72243049feb8deecc146b9b1", 16), bigInteger, bigInteger2);
        return new aa((d)i2, new ac((d)i2, f.a("03188da80eb03090f67cbf20eb43a18800f4ff0afd82ff1012")), bigInteger, bigInteger2, f.a("3045AE6FC8422f64ED579528D38120EAE12196D5"));
    }
}

