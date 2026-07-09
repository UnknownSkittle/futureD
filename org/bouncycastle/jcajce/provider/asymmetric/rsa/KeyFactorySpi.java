/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.n;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.a;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.b;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.c;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.d;

public class KeyFactorySpi
extends org.bouncycastle.jcajce.provider.asymmetric.a.a {
    protected KeySpec engineGetKeySpec(Key key, Class clazz) {
        if (clazz.isAssignableFrom(RSAPublicKeySpec.class) && key instanceof RSAPublicKey) {
            key = (RSAPublicKey)key;
            return new RSAPublicKeySpec(key.getModulus(), key.getPublicExponent());
        }
        if (clazz.isAssignableFrom(RSAPrivateKeySpec.class) && key instanceof RSAPrivateKey) {
            key = (RSAPrivateKey)key;
            return new RSAPrivateKeySpec(key.getModulus(), key.getPrivateExponent());
        }
        if (clazz.isAssignableFrom(RSAPrivateCrtKeySpec.class) && key instanceof RSAPrivateCrtKey) {
            key = (RSAPrivateCrtKey)key;
            return new RSAPrivateCrtKeySpec(key.getModulus(), key.getPublicExponent(), key.getPrivateExponent(), key.getPrimeP(), key.getPrimeQ(), key.getPrimeExponentP(), key.getPrimeExponentQ(), key.getCrtCoefficient());
        }
        return super.engineGetKeySpec(key, clazz);
    }

    protected Key engineTranslateKey(Key key) {
        if (key instanceof RSAPublicKey) {
            return new c((RSAPublicKey)key);
        }
        if (key instanceof RSAPrivateCrtKey) {
            return new a((RSAPrivateCrtKey)key);
        }
        if (key instanceof RSAPrivateKey) {
            return new b((RSAPrivateKey)key);
        }
        throw new InvalidKeyException("key type unknown");
    }

    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return this.a(org.bouncycastle.asn1.f.b.a(((PKCS8EncodedKeySpec)keySpec).getEncoded()));
            } catch (Exception exception) {
                try {
                    return new a(org.bouncycastle.asn1.f.c.a(((PKCS8EncodedKeySpec)keySpec).getEncoded()));
                } catch (Exception exception2) {
                    throw new org.bouncycastle.jcajce.provider.asymmetric.a.b("unable to process key spec: " + exception.toString(), exception);
                }
            }
        }
        if (keySpec instanceof RSAPrivateCrtKeySpec) {
            return new a((RSAPrivateCrtKeySpec)keySpec);
        }
        if (keySpec instanceof RSAPrivateKeySpec) {
            return new b((RSAPrivateKeySpec)keySpec);
        }
        throw new InvalidKeySpecException("Unknown KeySpec type: " + keySpec.getClass().getName());
    }

    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof RSAPublicKeySpec) {
            return new c((RSAPublicKeySpec)keySpec);
        }
        return super.engineGeneratePublic(keySpec);
    }

    public final PrivateKey a(org.bouncycastle.asn1.f.b b2) {
        m m2 = b2.a().a();
        if (d.a(m2)) {
            m2 = org.bouncycastle.asn1.f.c.a(b2.b());
            if (((org.bouncycastle.asn1.f.c)m2).i().intValue() == 0) {
                return new b((org.bouncycastle.asn1.f.c)m2);
            }
            return new a(b2);
        }
        throw new IOException("algorithm identifier " + m2 + " in key not recognised");
    }

    public final PublicKey a(org.bouncycastle.asn1.j.c c2) {
        n n2 = c2.a().a();
        if (d.a(n2)) {
            return new c(c2);
        }
        throw new IOException("algorithm identifier " + n2 + " in key not recognised");
    }
}

