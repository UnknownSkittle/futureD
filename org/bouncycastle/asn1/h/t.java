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

final class t
extends ab {
    t() {
    }

    protected final aa a() {
        Object object = BigInteger.valueOf(1L);
        Object object2 = a.b("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD");
        byte[] byArray = f.a("74D59FF07F6B413D0EA14B344B20A2DB049B50C3");
        BigInteger bigInteger = a.b("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7");
        BigInteger bigInteger2 = BigInteger.valueOf(2L);
        object = a.a(new h(233, 74, (BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2));
        object2 = new ac((d)object, f.a("0400FAC9DFCBAC8313BB2139F1BB755FEF65BC391F8B36F8F8EB7371FD558B01006A08A41903350678E58528BEBF8A0BEFF867A7CA36716F7E01F81052"));
        return new aa((d)object, (ac)object2, bigInteger, bigInteger2, byArray);
    }
}

