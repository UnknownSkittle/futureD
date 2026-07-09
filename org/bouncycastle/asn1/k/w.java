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

final class w
extends ab {
    w() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("0400000000000000000001E60FC8821CC74DAEAFC1", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(2L);
        h h2 = new h(163, 1, 2, 8, new BigInteger("072546B5435234A422E0789675F432C89435DE5242", 16), new BigInteger("00C9517D06D5240D3CFF38C74B20B6CD4D6F9DD4D9", 16), bigInteger, bigInteger2);
        return new aa((d)h2, new ac((d)h2, f.a("0307AF69989546103D79329FCC3D74880F33BBE803CB")), bigInteger, bigInteger2, f.a("D2C0FB15760860DEF1EEF4D696E6768756151754"));
    }
}

