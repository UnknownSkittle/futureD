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

final class e
extends ab {
    e() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("40000000000000000000000004A20E90C39067C893BBB9A5", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(2L);
        h h2 = new h(191, 9, new BigInteger("2866537B676752636A68F56554E12640276B649EF7526267", 16), new BigInteger("2E45EF571F00786F67B0081B9495A3D95462F5DE0AA185EC", 16), bigInteger, bigInteger2);
        return new aa((d)h2, new ac((d)h2, f.a("0236B3DAF8A23206F9C4F299D7B21A9C369137F2C84AE1AA0D")), bigInteger, bigInteger2, f.a("4E13CA542744D696E67687561517552F279A8C84"));
    }
}

