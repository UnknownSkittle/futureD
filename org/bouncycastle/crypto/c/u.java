/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.ci;
import org.bouncycastle.math.ec.d;

final class u
extends ab {
    u() {
    }

    protected final aa a() {
        byte[] byArray = f.a("77E2B07370EB0F832A6DD5B62DFC88CD06BB84BE");
        d d2 = a.a(new ci());
        ac ac2 = new ac(d2, f.a("0405F939258DB7DD90E1934F8C70B0DFEC2EED25B8557EAC9C80E2E198F8CDBECD86B1205303676854FE24141CB98FE6D4B20D02B4516FF702350EDDB0826779C813F0DF45BE8112F4"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

