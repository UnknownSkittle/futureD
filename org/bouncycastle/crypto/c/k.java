/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.bi;
import org.bouncycastle.math.ec.d;

final class k
extends ab {
    k() {
    }

    protected final aa a() {
        d d2 = a.a(new bi());
        ac ac2 = new ac(d2, f.a("0402FE13C0537BBC11ACAA07D793DE4E6D5E5C94EEE80289070FB05D38FF58321F2E800536D538CCDAA3D9"));
        return new aa(d2, ac2, d2.i(), d2.j(), null);
    }
}

