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
import org.bouncycastle.math.ec.i;

final class c
extends ab {
    c() {
    }

    protected final aa a() {
        Object object = a.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D");
        Object object2 = org.bouncycastle.math.ec.c.a;
        BigInteger bigInteger = BigInteger.valueOf(5L);
        BigInteger bigInteger2 = a.b("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7");
        BigInteger bigInteger3 = BigInteger.valueOf(1L);
        org.bouncycastle.math.ec.b.d d2 = new org.bouncycastle.math.ec.b.d(new BigInteger("fe0e87005b4e83761908c5131d552a850b3f58b749c37cf5b84d6768", 16), new BigInteger("60dcd2104c4cbc0be6eeefc2bdd610739ec34e317f9b33046c9e4788", 16), new BigInteger[]{new BigInteger("6b8cf07d4ca75c88957d9d670591", 16), new BigInteger("-b8adf1378a6eb73409fa6c9c637d", 16)}, new BigInteger[]{new BigInteger("1243ae1b4d71613bc9f780a03690e", 16), new BigInteger("6b8cf07d4ca75c88957d9d670591", 16)}, new BigInteger("6b8cf07d4ca75c88957d9d67059037a4", 16), new BigInteger("b8adf1378a6eb73409fa6c9c637ba7f5", 16), 240);
        object = a.a(new i((BigInteger)object, (BigInteger)object2, bigInteger, bigInteger2, bigInteger3), d2);
        object2 = new ac((d)object, f.a("04A1455B334DF099DF30FC28A169A467E9E47075A90F7E650EB6B7A45C7E089FED7FBA344282CAFBD6F7E319F7C0B0BD59E2CA4BDB556D61A5"));
        return new aa((d)object, (ac)object2, bigInteger2, bigInteger3, null);
    }
}

