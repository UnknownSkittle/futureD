/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.co;
import org.bouncycastle.math.ec.d;

final class w
extends ab {
    w() {
    }

    protected final aa a() {
        byte[] byArray = f.a("4099B5A457F9D69F79213D094C4BCD4D4262210B");
        d d2 = a.a(new co());
        ac ac2 = new ac(d2, f.a("04015D4860D088DDB3496B0C6064756260441CDE4AF1771D4DB01FFE5B34E59703DC255A868A1180515603AEAB60794E54BB7996A70061B1CFAB6BE5F32BBFA78324ED106A7636B9C5A7BD198D0158AA4F5488D08F38514F1FDF4B4F40D2181B3681C364BA0273C706"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

