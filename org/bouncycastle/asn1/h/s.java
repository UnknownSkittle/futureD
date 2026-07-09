/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.h;

import java.math.BigInteger;
import org.bouncycastle.asn1.h.a;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.h;

final class s
extends ab {
    s() {
    }

    protected final aa a() {
        Object object = c.a;
        Object object2 = BigInteger.valueOf(1L);
        BigInteger bigInteger = a.b("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF");
        BigInteger bigInteger2 = BigInteger.valueOf(4L);
        object = a.a(new h(233, 74, (BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2));
        object2 = new ac((d)object, f.a("04017232BA853A7E731AF129F22FF4149563A419C26BF50A4C9D6EEFAD612601DB537DECE819B7F70F555A67C427A8CD9BF18AEB9B56E0C11056FAE6A3"));
        return new aa((d)object, (ac)object2, bigInteger, bigInteger2, null);
    }
}

