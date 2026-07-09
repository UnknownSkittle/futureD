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

final class u
extends ab {
    u() {
    }

    protected final aa a() {
        Object object = c.a;
        Object object2 = BigInteger.valueOf(1L);
        BigInteger bigInteger = a.b("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5");
        BigInteger bigInteger2 = BigInteger.valueOf(4L);
        object = a.a(new h(239, 158, (BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2));
        object2 = new ac((d)object, f.a("0429A0B6A887A983E9730988A68727A8B2D126C44CC2CC7B2A6555193035DC76310804F12E549BDB011C103089E73510ACB275FC312A5DC6B76553F0CA"));
        return new aa((d)object, (ac)object2, bigInteger, bigInteger2, null);
    }
}

