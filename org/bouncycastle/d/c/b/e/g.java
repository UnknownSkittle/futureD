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
import org.bouncycastle.asn1.u;
import org.bouncycastle.d.c.b.e.a;
import org.bouncycastle.d.c.b.e.b;
import org.bouncycastle.jcajce.provider.c.c;

public final class g
extends KeyFactorySpi
implements c {
    public final PrivateKey engineGeneratePrivate(KeySpec object) {
        if (object instanceof PKCS8EncodedKeySpec) {
            object = ((PKCS8EncodedKeySpec)object).getEncoded();
            try {
                return this.a(org.bouncycastle.asn1.f.b.a(u.b((byte[])object)));
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
        if (key instanceof a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(clazz)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (key instanceof b) {
            if (X509EncodedKeySpec.class.isAssignableFrom(clazz)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
        }
        throw new InvalidKeySpecException("unknown key specification: " + clazz + ".");
    }

    public final Key engineTranslateKey(Key key) {
        if (key instanceof a || key instanceof b) {
            return key;
        }
        throw new InvalidKeyException("unsupported key type");
    }

    public final PrivateKey a(org.bouncycastle.asn1.f.b b2) {
        return new a(b2);
    }

    public final PublicKey a(org.bouncycastle.asn1.j.c c2) {
        return new b(c2);
    }
}

