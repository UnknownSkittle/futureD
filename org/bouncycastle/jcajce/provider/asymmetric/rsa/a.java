/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import org.bouncycastle.asn1.ay;
import org.bouncycastle.asn1.f.c;
import org.bouncycastle.e.k;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.b;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.d;

public final class a
extends b
implements RSAPrivateCrtKey {
    private BigInteger c;
    private BigInteger d;
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private BigInteger h;

    a(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        this.a = rSAPrivateCrtKeySpec.getModulus();
        this.c = rSAPrivateCrtKeySpec.getPublicExponent();
        this.b = rSAPrivateCrtKeySpec.getPrivateExponent();
        this.d = rSAPrivateCrtKeySpec.getPrimeP();
        this.e = rSAPrivateCrtKeySpec.getPrimeQ();
        this.f = rSAPrivateCrtKeySpec.getPrimeExponentP();
        this.g = rSAPrivateCrtKeySpec.getPrimeExponentQ();
        this.h = rSAPrivateCrtKeySpec.getCrtCoefficient();
    }

    a(RSAPrivateCrtKey rSAPrivateCrtKey) {
        this.a = rSAPrivateCrtKey.getModulus();
        this.c = rSAPrivateCrtKey.getPublicExponent();
        this.b = rSAPrivateCrtKey.getPrivateExponent();
        this.d = rSAPrivateCrtKey.getPrimeP();
        this.e = rSAPrivateCrtKey.getPrimeQ();
        this.f = rSAPrivateCrtKey.getPrimeExponentP();
        this.g = rSAPrivateCrtKey.getPrimeExponentQ();
        this.h = rSAPrivateCrtKey.getCrtCoefficient();
    }

    a(org.bouncycastle.asn1.f.b b2) {
        this(org.bouncycastle.asn1.f.c.a(b2.b()));
    }

    a(c c2) {
        this.a = c2.a();
        this.c = c2.b();
        this.b = c2.c();
        this.d = c2.d();
        this.e = c2.e();
        this.f = c2.f();
        this.g = c2.g();
        this.h = c2.i();
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final byte[] getEncoded() {
        return org.bouncycastle.asn1.util.a.b(new org.bouncycastle.asn1.j.a(org.bouncycastle.asn1.f.a.b, ay.a), new c(this.getModulus(), this.getPublicExponent(), this.getPrivateExponent(), this.getPrimeP(), this.getPrimeQ(), this.getPrimeExponentP(), this.getPrimeExponentQ(), this.getCrtCoefficient()));
    }

    public final BigInteger getPublicExponent() {
        return this.c;
    }

    public final BigInteger getPrimeP() {
        return this.d;
    }

    public final BigInteger getPrimeQ() {
        return this.e;
    }

    public final BigInteger getPrimeExponentP() {
        return this.f;
    }

    public final BigInteger getPrimeExponentQ() {
        return this.g;
    }

    public final BigInteger getCrtCoefficient() {
        return this.h;
    }

    public final int hashCode() {
        return this.getModulus().hashCode() ^ this.getPublicExponent().hashCode() ^ this.getPrivateExponent().hashCode();
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof RSAPrivateCrtKey)) {
            return false;
        }
        object = (RSAPrivateCrtKey)object;
        return this.getModulus().equals(object.getModulus()) && this.getPublicExponent().equals(object.getPublicExponent()) && this.getPrivateExponent().equals(object.getPrivateExponent()) && this.getPrimeP().equals(object.getPrimeP()) && this.getPrimeQ().equals(object.getPrimeQ()) && this.getPrimeExponentP().equals(object.getPrimeExponentP()) && this.getPrimeExponentQ().equals(object.getPrimeExponentQ()) && this.getCrtCoefficient().equals(object.getCrtCoefficient());
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = k.b();
        stringBuffer.append("RSA Private CRT Key [").append(org.bouncycastle.jcajce.provider.asymmetric.rsa.d.a(this.getModulus(), this.getPublicExponent())).append("]").append(string);
        stringBuffer.append("            modulus: ").append(this.getModulus().toString(16)).append(string);
        stringBuffer.append("    public exponent: ").append(this.getPublicExponent().toString(16)).append(string);
        return stringBuffer.toString();
    }
}

