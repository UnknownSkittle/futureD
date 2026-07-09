/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import org.bouncycastle.asn1.ay;
import org.bouncycastle.asn1.f.c;
import org.bouncycastle.asn1.j.a;

public class b
implements RSAPrivateKey {
    private static BigInteger c = BigInteger.valueOf(0L);
    protected BigInteger a;
    protected BigInteger b;
    private transient org.bouncycastle.jcajce.provider.asymmetric.a.c d = new org.bouncycastle.jcajce.provider.asymmetric.a.c();

    protected b() {
    }

    b(RSAPrivateKeySpec rSAPrivateKeySpec) {
        this.a = rSAPrivateKeySpec.getModulus();
        this.b = rSAPrivateKeySpec.getPrivateExponent();
    }

    b(RSAPrivateKey rSAPrivateKey) {
        this.a = rSAPrivateKey.getModulus();
        this.b = rSAPrivateKey.getPrivateExponent();
    }

    b(c c2) {
        this.a = c2.a();
        this.b = c2.c();
    }

    public BigInteger getModulus() {
        return this.a;
    }

    public BigInteger getPrivateExponent() {
        return this.b;
    }

    public String getAlgorithm() {
        return "RSA";
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public byte[] getEncoded() {
        BigInteger bigInteger = c;
        BigInteger bigInteger2 = c;
        return org.bouncycastle.asn1.util.a.b(new a(org.bouncycastle.asn1.f.a.b, ay.a), new c(this.getModulus(), c, this.getPrivateExponent(), bigInteger, bigInteger, bigInteger2, bigInteger2, c));
    }

    public boolean equals(Object object) {
        if (!(object instanceof RSAPrivateKey)) {
            return false;
        }
        if (object == this) {
            return true;
        }
        object = (RSAPrivateKey)object;
        return this.getModulus().equals(object.getModulus()) && this.getPrivateExponent().equals(object.getPrivateExponent());
    }

    public int hashCode() {
        return this.getModulus().hashCode() ^ this.getPrivateExponent().hashCode();
    }
}

