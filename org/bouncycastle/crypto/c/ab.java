/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.g;
import org.bouncycastle.math.ec.d;

final class ab
extends org.bouncycastle.asn1.k.ab {
    ab() {
    }

    protected final aa a() {
        byte[] byArray = f.a("1053CDE42C14D696E67687561517533BF3F83345");
        d d2 = a.a(new g());
        ac ac2 = new ac(d2, f.a("044A96B5688EF573284664698968C38BB913CBFC8223A628553168947D59DCC912042351377AC5FB32"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

