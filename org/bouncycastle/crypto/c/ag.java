/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.d;

final class ag
extends ab {
    ag() {
    }

    protected final aa a() {
        byte[] byArray = f.a("BD71344799D5C7FCDC45B59FA3B9AB8F6A948BC5");
        d d2 = a.a(new org.bouncycastle.math.ec.a.c.aa());
        ac ac2 = new ac(d2, f.a("04B70E0CBD6BB4BF7F321390B94A03C1D356C21122343280D6115C1D21BD376388B5F723FB4C22DFE6CD4375A05A07476444D5819985007E34"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

