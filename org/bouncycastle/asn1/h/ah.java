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
import org.bouncycastle.math.ec.i;

final class ah
extends ab {
    ah() {
    }

    protected final aa a() {
        Object object = a.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF");
        Object object2 = a.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC");
        BigInteger bigInteger = a.b("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1");
        byte[] byArray = f.a("3045AE6FC8422F64ED579528D38120EAE12196D5");
        BigInteger bigInteger2 = a.b("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831");
        BigInteger bigInteger3 = BigInteger.valueOf(1L);
        object = a.a(new i((BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2, bigInteger3));
        object2 = new ac((d)object, f.a("04188DA80EB03090F67CBF20EB43A18800F4FF0AFD82FF101207192B95FFC8DA78631011ED6B24CDD573F977A11E794811"));
        return new aa((d)object, (ac)object2, bigInteger2, bigInteger3, byArray);
    }
}

