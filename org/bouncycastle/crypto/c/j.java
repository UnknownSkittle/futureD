/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.be;
import org.bouncycastle.math.ec.d;

final class j
extends ab {
    j() {
    }

    protected final aa a() {
        byte[] byArray = f.a("985BD3ADBAD4D696E676875615175A21B43A97E3");
        d d2 = a.a(new be());
        ac ac2 = new ac(d2, f.a("040356DCD8F2F95031AD652D23951BB366A80648F06D867940A5366D9E265DE9EB240F"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

