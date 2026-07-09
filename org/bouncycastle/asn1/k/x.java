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

final class x
extends ab {
    x() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("03FFFFFFFFFFFFFFFFFFFDF64DE1151ADBB78F10A7", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(2L);
        h h2 = new h(163, 1, 2, 8, new BigInteger("0108B39E77C4B108BED981ED0E890E117C511CF072", 16), new BigInteger("0667ACEB38AF4E488C407433FFAE4F1C811638DF20", 16), bigInteger, bigInteger2);
        return new aa((d)h2, new ac((d)h2, f.a("030024266E4EB5106D0A964D92C4860E2671DB9B6CC5")), bigInteger, bigInteger2, null);
    }
}

