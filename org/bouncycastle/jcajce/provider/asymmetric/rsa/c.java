/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.asn1.ay;
import org.bouncycastle.asn1.f.a;
import org.bouncycastle.e.k;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.d;

public final class c
implements RSAPublicKey {
    private static final org.bouncycastle.asn1.j.a a = new org.bouncycastle.asn1.j.a(org.bouncycastle.asn1.f.a.b, ay.a);
    private BigInteger b;
    private BigInteger c;
    private transient org.bouncycastle.asn1.j.a d;

    c(RSAPublicKeySpec rSAPublicKeySpec) {
        this.d = a;
        this.b = rSAPublicKeySpec.getModulus();
        this.c = rSAPublicKeySpec.getPublicExponent();
    }

    c(RSAPublicKey rSAPublicKey) {
        this.d = a;
        this.b = rSAPublicKey.getModulus();
        this.c = rSAPublicKey.getPublicExponent();
    }

    c(org.bouncycastle.asn1.j.c object) {
        org.bouncycastle.asn1.j.c c2 = object;
        object = this;
        try {
            org.bouncycastle.asn1.f.d d2 = org.bouncycastle.asn1.f.d.a(c2.b());
            ((c)object).d = c2.a();
            ((c)object).b = d2.a();
            ((c)object).c = d2.b();
            return;
        } catch (IOException iOException) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }

    public final BigInteger getModulus() {
        return this.b;
    }

    public final BigInteger getPublicExponent() {
        return this.c;
    }

    public final String getAlgorithm() {
        return "RSA";
    }

    public final String getFormat() {
        return "X.509";
    }

    public final byte[] getEncoded() {
        return org.bouncycastle.asn1.util.a.a(this.d, new org.bouncycastle.asn1.f.d(this.getModulus(), this.getPublicExponent()));
    }

    public final int hashCode() {
        return this.getModulus().hashCode() ^ this.getPublicExponent().hashCode();
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof RSAPublicKey)) {
            return false;
        }
        object = (RSAPublicKey)object;
        return this.getModulus().equals(object.getModulus()) && this.getPublicExponent().equals(object.getPublicExponent());
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = k.b();
        stringBuffer.append("RSA Public Key [").append(org.bouncycastle.jcajce.provider.asymmetric.rsa.d.a(this.getModulus(), this.getPublicExponent())).append("]").append(string);
        stringBuffer.append("            modulus: ").append(this.getModulus().toString(16)).append(string);
        stringBuffer.append("    public exponent: ").append(this.getPublicExponent().toString(16)).append(string);
        return stringBuffer.toString();
    }
}

