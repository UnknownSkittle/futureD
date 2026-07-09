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

final class t
extends ab {
    t() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("7fffffffffffffffffffffff800000cfa7e8594377d414c03821bc582063", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(1L);
        i i2 = new i(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), new BigInteger("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc", 16), new BigInteger("617fab6832576cbbfed50d99f0249c3fee58b94ba0038c7ae84c8c832f2c", 16), bigInteger, bigInteger2);
        return new aa((d)i2, new ac((d)i2, f.a("0238af09d98727705120c921bb5e9e26296a3cdcf2f35757a0eafd87b830e7")), bigInteger, bigInteger2, f.a("e8b4011604095303ca3b8099982be09fcb9ae616"));
    }
}

