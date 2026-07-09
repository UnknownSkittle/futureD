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

final class n
extends ab {
    n() {
    }

    protected final aa a() {
        Object object = BigInteger.valueOf(1L);
        Object object2 = BigInteger.valueOf(1L);
        BigInteger bigInteger = a.b("04000000000000000000020108A2E0CC0D99F8A5EF");
        BigInteger bigInteger2 = BigInteger.valueOf(2L);
        object = a.a(new h(163, 3, 6, 7, (BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2));
        object2 = new ac((d)object, f.a("0402FE13C0537BBC11ACAA07D793DE4E6D5E5C94EEE80289070FB05D38FF58321F2E800536D538CCDAA3D9"));
        return new aa((d)object, (ac)object2, bigInteger, bigInteger2, null);
    }
}

