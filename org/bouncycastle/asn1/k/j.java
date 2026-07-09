/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.k;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.h;

final class j
extends ab {
    j() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("1555555555555555555555555555553C6F2885259C31E3FCDF154624522D", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(6L);
        h h2 = new h(239, 36, new BigInteger("4230017757A767FAE42398569B746325D45313AF0766266479B75654E65F", 16), new BigInteger("5037EA654196CFF0CD82B2C14A2FCF2E3FF8775285B545722F03EACDB74B", 16), bigInteger, bigInteger2);
        return new aa((d)h2, new ac((d)h2, f.a("0228F9D04E900069C8DC47A08534FE76D2B900B7D7EF31F5709F200C4CA205")), bigInteger, bigInteger2, null);
    }
}

