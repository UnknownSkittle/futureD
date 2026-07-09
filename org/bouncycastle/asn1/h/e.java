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
import org.bouncycastle.math.ec.i;

final class e
extends ab {
    e() {
    }

    protected final aa a() {
        Object object = a.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F");
        Object object2 = c.a;
        BigInteger bigInteger = BigInteger.valueOf(7L);
        BigInteger bigInteger2 = a.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141");
        BigInteger bigInteger3 = BigInteger.valueOf(1L);
        org.bouncycastle.math.ec.b.d d2 = new org.bouncycastle.math.ec.b.d(new BigInteger("7ae96a2b657c07106e64479eac3434e99cf0497512f58995c1396c28719501ee", 16), new BigInteger("5363ad4cc05c30e0a5261c028812645a122e22ea20816678df02967c1b23bd72", 16), new BigInteger[]{new BigInteger("3086d221a7d46bcde86c90e49284eb15", 16), new BigInteger("-e4437ed6010e88286f547fa90abfe4c3", 16)}, new BigInteger[]{new BigInteger("114ca50f7a8e2f3f657c1108d9d44cfd8", 16), new BigInteger("3086d221a7d46bcde86c90e49284eb15", 16)}, new BigInteger("3086d221a7d46bcde86c90e49284eb153dab", 16), new BigInteger("e4437ed6010e88286f547fa90abfe4c42212", 16), 272);
        object = a.a(new i((BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2, bigInteger3), d2);
        object2 = new ac((d)object, f.a("0479BE667EF9DCBBAC55A06295CE870B07029BFCDB2DCE28D959F2815B16F81798483ADA7726A3C4655DA4FBFC0E1108A8FD17B448A68554199C47D08FFB10D4B8"));
        return new aa((d)object, (ac)object2, bigInteger2, bigInteger3, null);
    }
}

