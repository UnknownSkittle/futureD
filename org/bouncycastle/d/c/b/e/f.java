/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.e;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.f.b;
import org.bouncycastle.asn1.u;
import org.bouncycastle.d.c.b.e.c;
import org.bouncycastle.d.c.b.e.d;

public final class f
extends KeyFactorySpi
implements org.bouncycastle.jcajce.provider.c.c {
    public final PrivateKey engineGeneratePrivate(KeySpec object) {
        if (object instanceof PKCS8EncodedKeySpec) {
            object = ((PKCS8EncodedKeySpec)object).getEncoded();
            try {
                return this.a(b.a(u.b((byte[])object)));
            } catch (Exception exception) {
                throw new InvalidKeySpecException(exception.toString());
            }
        }
        throw new InvalidKeySpecException("unsupported key specification: " + object.getClass() + ".");
    }

    public final PublicKey engineGeneratePublic(KeySpec object) {
        if (object instanceof X509EncodedKeySpec) {
            object = ((X509EncodedKeySpec)object).getEncoded();
            try {
                return this.a(org.bouncycastle.asn1.j.c.a(object));
            } catch (Exception exception) {
                throw new InvalidKeySpecException(exception.toString());
            }
        }
        throw new InvalidKeySpecException("unknown key specification: " + object + ".");
    }

    public final KeySpec engineGetKeySpec(Key key, Class clazz) {
        if (key instanceof c) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(clazz)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (key instanceof d) {
            if (X509EncodedKeySpec.class.isAssignableFrom(clazz)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
        }
        throw new InvalidKeySpecException("unknown key specification: " + clazz + ".");
    }

    public final Key engineTranslateKey(Key key) {
        if (key instanceof c || key instanceof d) {
            return key;
        }
        throw new InvalidKeyException("unsupported key type");
    }

    public final PrivateKey a(b b2) {
        return new c(b2);
    }

    public final PublicKey a(org.bouncycastle.asn1.j.c c2) {
        return new d(c2);
    }
}

