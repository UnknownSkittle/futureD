/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.cg;
import org.bouncycastle.math.ec.d;

final class t
extends ab {
    t() {
    }

    protected final aa a() {
        d d2 = a.a(new cg());
        ac ac2 = new ac(d2, f.a("040503213F78CA44883F1A3B8162F188E553CD265F23C1567A16876913B0C2AC245849283601CCDA380F1C9E318D90F95D07E5426FE87E45C0E8184698E45962364E34116177DD2259"));
        return new aa(d2, ac2, d2.i(), d2.j(), null);
    }
}

