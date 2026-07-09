/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.aw;
import org.bouncycastle.math.ec.d;

final class g
extends ab {
    g() {
    }

    protected final aa a() {
        byte[] byArray = f.a("10E723AB14D696E6768756151756FEBF8FCB49A9");
        d d2 = a.a(new aw());
        ac ac2 = new ac(d2, f.a("04009D73616F35F4AB1407D73562C10F00A52830277958EE84D1315ED31886"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

