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

final class p
extends ab {
    p() {
    }

    protected final aa a() {
        Object object = BigInteger.valueOf(1L);
        Object object2 = a.b("020A601907B8C953CA1481EB10512F78744A3205FD");
        byte[] byArray = f.a("85E25BFE5C86226CDB12016F7553F9D0E693A268");
        BigInteger bigInteger = a.b("040000000000000000000292FE77E70C12A4234C33");
        BigInteger bigInteger2 = BigInteger.valueOf(2L);
        object = a.a(new h(163, 3, 6, 7, (BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2));
        object2 = new ac((d)object, f.a("0403F0EBA16286A2D57EA0991168D4994637E8343E3600D51FBC6C71A0094FA2CDD545B11C5C0C797324F1"));
        return new aa((d)object, (ac)object2, bigInteger, bigInteger2, byArray);
    }
}

