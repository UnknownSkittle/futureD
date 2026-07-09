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

final class h
extends ab {
    h() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("0101BAF95C9723C57B6C21DA2EFF2D5ED588BDD5717E212F9D", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(65096L);
        org.bouncycastle.math.ec.h h2 = new org.bouncycastle.math.ec.h(208, 1, 2, 83, new BigInteger("0", 16), new BigInteger("00C8619ED45A62E6212E1160349E2BFA844439FAFC2A3FD1638F9E", 16), bigInteger, bigInteger2);
        return new aa((d)h2, new ac((d)h2, f.a("0289FDFBE4ABE193DF9559ECF07AC0CE78554E2784EB8C1ED1A57A")), bigInteger, bigInteger2, null);
    }
}

