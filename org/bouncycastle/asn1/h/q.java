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
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.h;

final class q
extends ab {
    q() {
    }

    protected final aa a() {
        Object object = a.b("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01");
        Object object2 = a.b("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814");
        byte[] byArray = f.a("103FAEC74D696E676875615175777FC5B191EF30");
        BigInteger bigInteger = a.b("01000000000000000000000000C7F34A778F443ACC920EBA49");
        BigInteger bigInteger2 = BigInteger.valueOf(2L);
        object = a.a(new h(193, 15, (BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2));
        object2 = new ac((d)object, f.a("0401F481BC5F0FF84A74AD6CDF6FDEF4BF6179625372D8C0C5E10025E399F2903712CCF3EA9E3A1AD17FB0B3201B6AF7CE1B05"));
        return new aa((d)object, (ac)object2, bigInteger, bigInteger2, byArray);
    }
}

