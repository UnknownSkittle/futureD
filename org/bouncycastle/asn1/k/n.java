/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.k;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.h;

final class n
extends ab {
    n() {
    }

    protected final aa a() {
        BigInteger bigInteger = new BigInteger("0101D556572AABAC800101D556572AABAC8001022D5C91DD173F8FB561DA6899164443051D", 16);
        BigInteger bigInteger2 = BigInteger.valueOf(65070L);
        h h2 = new h(304, 1, 2, 11, new BigInteger("00FD0D693149A118F651E6DCE6802085377E5F882D1B510B44160074C1288078365A0396C8E681", 16), new BigInteger("00BDDB97E555A50A908E43B01C798EA5DAA6788F1EA2794EFCF57166B8C14039601E55827340BE", 16), bigInteger, bigInteger2);
        return new aa((d)h2, new ac((d)h2, f.a("02197B07845E9BE2D96ADB0F5F3C7F2CFFBD7A3EB8B6FEC35C7FD67F26DDF6285A644F740A2614")), bigInteger, bigInteger2, null);
    }
}

