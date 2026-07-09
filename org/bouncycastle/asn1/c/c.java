/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.c.a;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.i;

final class c
extends ab {
    c() {
    }

    protected final aa a() {
        Object object = a.b("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
        Object object2 = a.b("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
        BigInteger bigInteger = a.b("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
        BigInteger bigInteger2 = a.b("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
        BigInteger bigInteger3 = BigInteger.valueOf(1L);
        object = a.a(new i((BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2, bigInteger3));
        object2 = new ac((d)object, f.a("044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2"));
        return new aa((d)object, (ac)object2, bigInteger2, bigInteger3, null);
    }
}

