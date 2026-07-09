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

final class m
extends ab {
    m() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("fffffffffffffffffffffffe5fb1a724dc80418648d8dd31", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(1L);
        i i2 = new i(new BigInteger("6277101735386680763835789423207666416083908700390324961279"), new BigInteger("fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger("cc22d6dfb95c6b25e49c0d6364a4e5980c393aa21668d953", 16), bigInteger, bigInteger2);
        return new aa((d)i2, new ac((d)i2, f.a("03eea2bae7e1497842f2de7769cfe9c989c072ad696f48034a")), bigInteger, bigInteger2, f.a("31a92ee2029fd10d901b113e990710f0d21ac6b6"));
    }
}

