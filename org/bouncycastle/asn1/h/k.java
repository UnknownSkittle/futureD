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

final class k
extends ab {
    k() {
    }

    protected final aa a() {
        Object object = a.b("07A11B09A76B562144418FF3FF8C2570B8");
        Object object2 = a.b("0217C05610884B63B9C6C7291678F9D341");
        byte[] byArray = f.a("4D696E676875615175985BD3ADBADA21B43A97E2");
        BigInteger bigInteger = a.b("0400000000000000023123953A9464B54D");
        BigInteger bigInteger2 = BigInteger.valueOf(2L);
        object = a.a(new h(131, 2, 3, 8, (BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2));
        object2 = new ac((d)object, f.a("040081BAF91FDF9833C40F9C181343638399078C6E7EA38C001F73C8134B1B4EF9E150"));
        return new aa((d)object, (ac)object2, bigInteger, bigInteger2, byArray);
    }
}

