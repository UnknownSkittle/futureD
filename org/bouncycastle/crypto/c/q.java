/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.bw;
import org.bouncycastle.math.ec.d;

final class q
extends ab {
    q() {
    }

    protected final aa a() {
        d d2 = a.a(new bw());
        ac ac2 = new ac(d2, f.a("04017232BA853A7E731AF129F22FF4149563A419C26BF50A4C9D6EEFAD612601DB537DECE819B7F70F555A67C427A8CD9BF18AEB9B56E0C11056FAE6A3"));
        return new aa(d2, ac2, d2.i(), d2.j(), null);
    }
}

