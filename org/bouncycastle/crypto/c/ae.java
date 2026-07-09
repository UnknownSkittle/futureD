/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.s;
import org.bouncycastle.math.ec.d;

final class ae
extends ab {
    ae() {
    }

    protected final aa a() {
        byte[] byArray = f.a("3045AE6FC8422F64ED579528D38120EAE12196D5");
        d d2 = a.a(new s());
        ac ac2 = new ac(d2, f.a("04188DA80EB03090F67CBF20EB43A18800F4FF0AFD82FF101207192B95FFC8DA78631011ED6B24CDD573F977A11E794811"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

