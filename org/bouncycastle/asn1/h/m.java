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

final class m
extends ab {
    m() {
    }

    protected final aa a() {
        Object object = a.b("DB7C2ABF62E35E668076BEAD208B");
        Object object2 = a.b("6127C24C05F38A0AAAF65C0EF02C");
        BigInteger bigInteger = a.b("51DEF1815DB5ED74FCC34C85D709");
        byte[] byArray = f.a("002757A1114D696E6768756151755316C05E0BD4");
        BigInteger bigInteger2 = a.b("36DF0AAFD8B8D7597CA10520D04B");
        BigInteger bigInteger3 = BigInteger.valueOf(4L);
        object = a.a(new i((BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2, bigInteger3));
        object2 = new ac((d)object, f.a("044BA30AB5E892B4E1649DD0928643ADCD46F5882E3747DEF36E956E97"));
        return new aa((d)object, (ac)object2, bigInteger2, bigInteger3, byArray);
    }
}

