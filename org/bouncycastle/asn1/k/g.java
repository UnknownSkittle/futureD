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

final class g
extends ab {
    g() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("155555555555555555555555610C0B196812BFB6288A3EA3", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(6L);
        h h2 = new h(191, 9, new BigInteger("6C01074756099122221056911C77D77E77A777E7E7E77FCB", 16), new BigInteger("71FE1AF926CF847989EFEF8DB459F66394D90F32AD3F15E8", 16), bigInteger, bigInteger2);
        return new aa((d)h2, new ac((d)h2, f.a("03375D4CE24FDE434489DE8746E71786015009E66E38A926DD")), bigInteger, bigInteger2, null);
    }
}

