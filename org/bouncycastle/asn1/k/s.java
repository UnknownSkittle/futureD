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

final class s
extends ab {
    s() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("7fffffffffffffffffffffff7fffff9e5e9a9f5d9071fbd1522688909d0b", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(1L);
        i i2 = new i(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), new BigInteger("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc", 16), new BigInteger("6b016c3bdcf18941d0d654921475ca71a9db2fb27d1d37796185c2942c0a", 16), bigInteger, bigInteger2);
        return new aa((d)i2, new ac((d)i2, f.a("020ffa963cdca8816ccc33b8642bedf905c3d358573d3f27fbbd3b3cb9aaaf")), bigInteger, bigInteger2, f.a("e43bb460f0b80cc0c0b075798e948060f8321b7d"));
    }
}

