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

final class b
extends ab {
    b() {
    }

    protected final aa a() {
        Object object = a.b("DB7C2ABF62E35E668076BEAD208B");
        Object object2 = a.b("DB7C2ABF62E35E668076BEAD2088");
        BigInteger bigInteger = a.b("659EF8BA043916EEDE8911702B22");
        byte[] byArray = f.a("00F50B028E4D696E676875615175290472783FB1");
        BigInteger bigInteger2 = a.b("DB7C2ABF62E35E7628DFAC6561C5");
        BigInteger bigInteger3 = BigInteger.valueOf(1L);
        object = a.a(new i((BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2, bigInteger3));
        object2 = new ac((d)object, f.a("0409487239995A5EE76B55F9C2F098A89CE5AF8724C0A23E0E0FF77500"));
        return new aa((d)object, (ac)object2, bigInteger2, bigInteger3, byArray);
    }
}

