/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.asymmetric.a;

import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.f.b;
import org.bouncycastle.jcajce.provider.c.c;

public abstract class a
extends KeyFactorySpi
implements c {
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return this.a(b.a(((PKCS8EncodedKeySpec)keySpec).getEncoded()));
            } catch (Exception exception) {
                throw new InvalidKeySpecException("encoded key spec not recognized: " + exception.getMessage());
            }
        }
        throw new InvalidKeySpecException("key spec not recognized");
    }

    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return this.a(org.bouncycastle.asn1.j.c.a(((X509EncodedKeySpec)keySpec).getEncoded()));
            } catch (Exception exception) {
                throw new InvalidKeySpecException("encoded key spec not recognized: " + exception.getMessage());
            }
        }
        throw new InvalidKeySpecException("key spec not recognized");
    }

    protected KeySpec engineGetKeySpec(Key key, Class clazz) {
        if (clazz.isAssignableFrom(PKCS8EncodedKeySpec.class) && key.getFormat().equals("PKCS#8")) {
            return new PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (clazz.isAssignableFrom(X509EncodedKeySpec.class) && key.getFormat().equals("X.509")) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException("not implemented yet " + key + " " + clazz);
    }
}

