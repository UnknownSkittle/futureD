/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.h;

import java.math.BigInteger;
import org.bouncycastle.asn1.h.a;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.i;

final class ac
extends ab {
    ac() {
    }

    protected final aa a() {
        Object object = a.b("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF");
        Object object2 = a.b("D6031998D1B3BBFEBF59CC9BBFF9AEE1");
        BigInteger bigInteger = a.b("5EEEFCA380D02919DC2C6558BB6D8A5D");
        byte[] byArray = f.a("004D696E67687561517512D8F03431FCE63B88F4");
        BigInteger bigInteger2 = a.b("3FFFFFFF7FFFFFFFBE0024720613B5A3");
        BigInteger bigInteger3 = BigInteger.valueOf(4L);
        object = a.a(new i((BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2, bigInteger3));
        object2 = new org.bouncycastle.asn1.k.ac((d)object, f.a("047B6AA5D85E572983E6FB32A7CDEBC14027B6916A894D3AEE7106FE805FC34B44"));
        return new aa((d)object, (org.bouncycastle.asn1.k.ac)object2, bigInteger2, bigInteger3, byArray);
    }
}

