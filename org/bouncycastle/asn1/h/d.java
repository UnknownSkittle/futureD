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
import org.bouncycastle.math.ec.i;

final class d
extends ab {
    d() {
    }

    protected final aa a() {
        Object object = a.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001");
        Object object2 = a.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE");
        BigInteger bigInteger = a.b("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4");
        byte[] byArray = f.a("BD71344799D5C7FCDC45B59FA3B9AB8F6A948BC5");
        BigInteger bigInteger2 = a.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D");
        BigInteger bigInteger3 = BigInteger.valueOf(1L);
        object = a.a(new i((BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2, bigInteger3));
        object2 = new ac((org.bouncycastle.math.ec.d)object, f.a("04B70E0CBD6BB4BF7F321390B94A03C1D356C21122343280D6115C1D21BD376388B5F723FB4C22DFE6CD4375A05A07476444D5819985007E34"));
        return new aa((org.bouncycastle.math.ec.d)object, (ac)object2, bigInteger2, bigInteger3, byArray);
    }
}

