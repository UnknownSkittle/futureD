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

final class r
extends ab {
    r() {
    }

    protected final aa a() {
        Object object = a.b("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B");
        Object object2 = a.b("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE");
        byte[] byArray = f.a("10B7B4D696E676875615175137C8A16FD0DA2211");
        BigInteger bigInteger = a.b("010000000000000000000000015AAB561B005413CCD4EE99D5");
        BigInteger bigInteger2 = BigInteger.valueOf(2L);
        object = a.a(new h(193, 15, (BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2));
        object2 = new ac((d)object, f.a("0400D9B67D192E0367C803F39E1A7E82CA14A651350AAE617E8F01CE94335607C304AC29E7DEFBD9CA01F596F927224CDECF6C"));
        return new aa((d)object, (ac)object2, bigInteger, bigInteger2, byArray);
    }
}

