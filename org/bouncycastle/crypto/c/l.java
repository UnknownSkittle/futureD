/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.bk;
import org.bouncycastle.math.ec.d;

final class l
extends ab {
    l() {
    }

    protected final aa a() {
        byte[] byArray = f.a("24B7B137C8A14D696E6768756151756FD0DA2E5C");
        d d2 = a.a(new bk());
        ac ac2 = new ac(d2, f.a("040369979697AB43897789566789567F787A7876A65400435EDB42EFAFB2989D51FEFCE3C80988F41FF883"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

