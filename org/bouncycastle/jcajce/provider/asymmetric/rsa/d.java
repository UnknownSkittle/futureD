/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import org.bouncycastle.asn1.f.a;
import org.bouncycastle.asn1.n;
import org.bouncycastle.crypto.i.l;
import org.bouncycastle.crypto.i.m;

public final class d {
    private static n[] a = new n[]{org.bouncycastle.asn1.f.a.b, org.bouncycastle.asn1.j.d.a, org.bouncycastle.asn1.f.a.g, org.bouncycastle.asn1.f.a.i};

    public static boolean a(n n2) {
        for (int i2 = 0; i2 != 4; ++i2) {
            if (!n2.equals(a[i2])) continue;
            return true;
        }
        return false;
    }

    static l a(RSAPublicKey rSAPublicKey) {
        return new l(false, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
    }

    static l a(RSAPrivateKey rSAPrivateKey) {
        if (rSAPrivateKey instanceof RSAPrivateCrtKey) {
            rSAPrivateKey = (RSAPrivateCrtKey)rSAPrivateKey;
            return new m(rSAPrivateKey.getModulus(), rSAPrivateKey.getPublicExponent(), rSAPrivateKey.getPrivateExponent(), rSAPrivateKey.getPrimeP(), rSAPrivateKey.getPrimeQ(), rSAPrivateKey.getPrimeExponentP(), rSAPrivateKey.getPrimeExponentQ(), rSAPrivateKey.getCrtCoefficient());
        }
        return new l(true, rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
    }

    static String a(BigInteger bigInteger, BigInteger bigInteger2) {
        return new org.bouncycastle.e.d(org.bouncycastle.e.a.c(bigInteger.toByteArray(), bigInteger2.toByteArray())).toString();
    }
}

