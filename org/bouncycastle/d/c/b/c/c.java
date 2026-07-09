/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.c;

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
import org.bouncycastle.d.a.f;
import org.bouncycastle.d.a.g;
import org.bouncycastle.d.c.b.c.a;
import org.bouncycastle.d.c.b.c.b;

public final class c
extends KeyFactorySpi
implements org.bouncycastle.jcajce.provider.c.c {
    public final PrivateKey engineGeneratePrivate(KeySpec object) {
        if (object instanceof org.bouncycastle.d.c.c.a) {
            return new a((org.bouncycastle.d.c.c.a)object);
        }
        if (object instanceof PKCS8EncodedKeySpec) {
            object = ((PKCS8EncodedKeySpec)object).getEncoded();
            try {
                return this.a(org.bouncycastle.asn1.f.b.a(u.b((byte[])object)));
            } catch (Exception exception) {
                throw new InvalidKeySpecException(exception.toString());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + object.getClass() + ".");
    }

    public final PublicKey engineGeneratePublic(KeySpec object) {
        if (object instanceof org.bouncycastle.d.c.c.b) {
            return new b((org.bouncycastle.d.c.c.b)object);
        }
        if (object instanceof X509EncodedKeySpec) {
            object = ((X509EncodedKeySpec)object).getEncoded();
            try {
                return this.a(org.bouncycastle.asn1.j.c.a(object));
            } catch (Exception exception) {
                throw new InvalidKeySpecException(exception.toString());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + object + ".");
    }

    public final KeySpec engineGetKeySpec(Key key, Class clazz) {
        if (key instanceof a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(clazz)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (org.bouncycastle.d.c.c.a.class.isAssignableFrom(clazz)) {
                key = (a)key;
                return new org.bouncycastle.d.c.c.a(((a)key).a(), ((a)key).b(), ((a)key).d(), ((a)key).c(), ((a)key).f(), ((a)key).e());
            }
        } else if (key instanceof b) {
            if (X509EncodedKeySpec.class.isAssignableFrom(clazz)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
            if (org.bouncycastle.d.c.c.b.class.isAssignableFrom(clazz)) {
                key = (b)key;
                return new org.bouncycastle.d.c.c.b(((b)key).a(), ((b)key).b(), ((b)key).c(), ((b)key).d());
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
        }
        throw new InvalidKeySpecException("Unknown key specification: " + clazz + ".");
    }

    public final Key engineTranslateKey(Key key) {
        if (key instanceof a || key instanceof b) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }

    public final PrivateKey a(org.bouncycastle.asn1.f.b m2) {
        m2 = f.a(((org.bouncycastle.asn1.f.b)m2).b());
        return new a(((f)m2).a(), ((f)m2).b(), ((f)m2).d(), ((f)m2).c(), ((f)m2).f(), ((f)m2).e());
    }

    public final PublicKey a(org.bouncycastle.asn1.j.c m2) {
        m2 = g.a(((org.bouncycastle.asn1.j.c)m2).b());
        return new b(((g)m2).a(), ((g)m2).b(), ((g)m2).c(), ((g)m2).d());
    }
}

