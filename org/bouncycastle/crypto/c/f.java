/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.math.ec.a.c.aq;
import org.bouncycastle.math.ec.d;

final class f
extends ab {
    f() {
    }

    protected final aa a() {
        byte[] byArray = org.bouncycastle.e.a.f.a("D09E8800291CB85396CC6717393284AAA0DA64BA");
        d d2 = a.a(new aq());
        ac ac2 = new ac(d2, org.bouncycastle.e.a.f.a("0400C6858E06B70404E9CD9E3ECB662395B4429C648139053FB521F828AF606B4D3DBAA14B5E77EFE75928FE1DC127A2FFA8DE3348B3C1856A429BF97E7E31C2E5BD66011839296A789A3BC0045C8A5FB42C7D1BD998F54449579B446817AFBD17273E662C97EE72995EF42640C550B9013FAD0761353C7086A272C24088BE94769FD16650"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

