/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.h;

import java.math.BigInteger;
import org.bouncycastle.asn1.h.a;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.h;

final class j
extends ab {
    j() {
    }

    protected final aa a() {
        Object object = a.b("00689918DBEC7E5A0DD6DFC0AA55C7");
        Object object2 = a.b("0095E9A9EC9B297BD4BF36E059184F");
        byte[] byArray = f.a("10C0FB15760860DEF1EEF4D696E676875615175D");
        BigInteger bigInteger = a.b("010000000000000108789B2496AF93");
        BigInteger bigInteger2 = BigInteger.valueOf(2L);
        object = a.a(new h(113, 9, (BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2));
        object2 = new ac((d)object, f.a("0401A57A6A7B26CA5EF52FCDB816479700B3ADC94ED1FE674C06E695BABA1D"));
        return new aa((d)object, (ac)object2, bigInteger, bigInteger2, byArray);
    }
}

