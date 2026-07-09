/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import java.math.BigInteger;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.e;
import org.bouncycastle.math.ec.d;

final class x
extends ab {
    x() {
    }

    protected final aa a() {
        Object object = new org.bouncycastle.math.ec.b.d(new BigInteger("9ba48cba5ebcb9b6bd33b92830b2a2e0e192f10a", 16), new BigInteger("c39c6c3b3a36d7701b9c71a1f5804ae5d0003f4", 16), new BigInteger[]{new BigInteger("9162fbe73984472a0a9e", 16), new BigInteger("-96341f1138933bc2f505", 16)}, new BigInteger[]{new BigInteger("127971af8721782ecffa3", 16), new BigInteger("9162fbe73984472a0a9e", 16)}, new BigInteger("9162fbe73984472a0a9d0590", 16), new BigInteger("96341f1138933bc2f503fd44", 16), 176);
        object = a.a(new e(), (org.bouncycastle.math.ec.b.d)object);
        ac ac2 = new ac((d)object, f.a("043B4C382CE37AA192A4019E763036F4F5DD4D7EBB938CF935318FDCED6BC28286531733C3F03C4FEE"));
        return new aa((d)object, ac2, ((d)object).i(), ((d)object).j(), null);
    }
}

