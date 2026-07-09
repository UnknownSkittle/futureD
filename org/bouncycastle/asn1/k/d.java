/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.k;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.h;

final class d
extends ab {
    d() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("010092537397ECA4F6145799D62B0A19CE06FE26AD", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(65390L);
        h h2 = new h(176, 1, 2, 43, new BigInteger("00E4E6DB2995065C407D9D39B8D0967B96704BA8E9C90B", 16), new BigInteger("005DDA470ABE6414DE8EC133AE28E9BBD7FCEC0AE0FFF2", 16), bigInteger, bigInteger2);
        return new aa((org.bouncycastle.math.ec.d)h2, new ac((org.bouncycastle.math.ec.d)h2, f.a("038D16C2866798B600F9F08BB4A8E860F3298CE04A5798")), bigInteger, bigInteger2, null);
    }
}

