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
import org.bouncycastle.math.ec.i;

final class r
extends ab {
    r() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("ffffffffffffffffffffffff7a62d031c83f4294f640ec13", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(1L);
        i i2 = new i(new BigInteger("6277101735386680763835789423207666416083908700390324961279"), new BigInteger("fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger("22123dc2395a05caa7423daeccc94760a7d462256bd56916", 16), bigInteger, bigInteger2);
        return new aa((d)i2, new ac((d)i2, f.a("027d29778100c65a1da1783716588dce2b8b4aee8e228f1896")), bigInteger, bigInteger2, f.a("c469684435deb378c4b65ca9591e2a5763059a2e"));
    }
}

