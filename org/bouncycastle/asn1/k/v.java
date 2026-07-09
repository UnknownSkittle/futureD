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

final class v
extends ab {
    v() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("ffffffff00000000ffffffffffffffffbce6faada7179e84f3b9cac2fc632551", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(1L);
        i i2 = new i(new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951"), new BigInteger("ffffffff00000001000000000000000000000000fffffffffffffffffffffffc", 16), new BigInteger("5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", 16), bigInteger, bigInteger2);
        return new aa((d)i2, new ac((d)i2, f.a("036b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296")), bigInteger, bigInteger2, f.a("c49d360886e704936a6678e1139d26b7819f7e90"));
    }
}

