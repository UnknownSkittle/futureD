/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.ay;
import org.bouncycastle.math.ec.d;

final class h
extends ab {
    h() {
    }

    protected final aa a() {
        byte[] byArray = f.a("10C0FB15760860DEF1EEF4D696E676875615175D");
        d d2 = a.a(new ay());
        ac ac2 = new ac(d2, f.a("0401A57A6A7B26CA5EF52FCDB816479700B3ADC94ED1FE674C06E695BABA1D"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

