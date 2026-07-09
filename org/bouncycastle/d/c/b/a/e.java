/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.a;

import java.io.IOException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.j.c;
import org.bouncycastle.asn1.u;
import org.bouncycastle.d.c.b.a.a;
import org.bouncycastle.d.c.b.a.b;
import org.bouncycastle.d.c.b.a.g;

public final class e
extends KeyFactorySpi
implements org.bouncycastle.jcajce.provider.c.c {
    protected final PublicKey engineGeneratePublic(KeySpec object) {
        if (object instanceof X509EncodedKeySpec) {
            object = ((X509EncodedKeySpec)object).getEncoded();
            try {
                object = c.a(u.b((byte[])object));
            } catch (IOException iOException) {
                throw new InvalidKeySpecException(iOException.toString());
            }
            try {
                if (org.bouncycastle.d.a.e.d.equals(((c)object).a().a())) {
                    object = org.bouncycastle.d.a.b.a(((c)object).b());
                    return new b(new org.bouncycastle.d.b.a.c(((org.bouncycastle.d.a.b)object).a(), ((org.bouncycastle.d.a.b)object).b(), ((org.bouncycastle.d.a.b)object).c(), g.a(((org.bouncycastle.d.a.b)object).d()).a()));
                }
                throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
            } catch (IOException iOException) {
                throw new InvalidKeySpecException("Unable to decode X509EncodedKeySpec: " + iOException.getMessage());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + object.getClass() + ".");
    }

    protected final PrivateKey engineGeneratePrivate(KeySpec object) {
        if (object instanceof PKCS8EncodedKeySpec) {
            object = ((PKCS8EncodedKeySpec)object).getEncoded();
            try {
                object = org.bouncycastle.asn1.f.b.a(u.b((byte[])object));
            } catch (IOException iOException) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: ".concat(String.valueOf(iOException)));
            }
            try {
                if (org.bouncycastle.d.a.e.d.equals(((org.bouncycastle.asn1.f.b)object).a().a())) {
                    object = org.bouncycastle.d.a.a.a(((org.bouncycastle.asn1.f.b)object).b());
                    return new a(new org.bouncycastle.d.b.a.b(((org.bouncycastle.d.a.a)object).a(), ((org.bouncycastle.d.a.a)object).b(), ((org.bouncycastle.d.a.a)object).c(), ((org.bouncycastle.d.a.a)object).d(), ((org.bouncycastle.d.a.a)object).e(), g.a(((org.bouncycastle.d.a.a)object).f()).a()));
                }
                throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
            } catch (IOException iOException) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + object.getClass() + ".");
    }

    public final PublicKey a(c m2) {
        m2 = org.bouncycastle.d.a.b.a(((c)m2).b());
        return new b(new org.bouncycastle.d.b.a.c(((org.bouncycastle.d.a.b)m2).a(), ((org.bouncycastle.d.a.b)m2).b(), ((org.bouncycastle.d.a.b)m2).c(), g.a(((org.bouncycastle.d.a.b)m2).d()).a()));
    }

    public final PrivateKey a(org.bouncycastle.asn1.f.b m2) {
        m2 = org.bouncycastle.d.a.a.a(((org.bouncycastle.asn1.f.b)m2).b().h());
        return new a(new org.bouncycastle.d.b.a.b(((org.bouncycastle.d.a.a)m2).a(), ((org.bouncycastle.d.a.a)m2).b(), ((org.bouncycastle.d.a.a)m2).c(), ((org.bouncycastle.d.a.a)m2).d(), ((org.bouncycastle.d.a.a)m2).e(), null));
    }

    protected final KeySpec engineGetKeySpec(Key key, Class clazz) {
        return null;
    }

    protected final Key engineTranslateKey(Key key) {
        return null;
    }
}

