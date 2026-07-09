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
import org.bouncycastle.asn1.f.b;
import org.bouncycastle.asn1.u;
import org.bouncycastle.d.a.e;
import org.bouncycastle.d.c.b.a.c;
import org.bouncycastle.d.c.b.a.d;

public final class f
extends KeyFactorySpi
implements org.bouncycastle.jcajce.provider.c.c {
    protected final PublicKey engineGeneratePublic(KeySpec object) {
        if (object instanceof X509EncodedKeySpec) {
            object = ((X509EncodedKeySpec)object).getEncoded();
            try {
                object = org.bouncycastle.asn1.j.c.a(u.b((byte[])object));
            } catch (IOException iOException) {
                throw new InvalidKeySpecException(iOException.toString());
            }
            try {
                if (e.c.equals(((org.bouncycastle.asn1.j.c)object).a().a())) {
                    object = org.bouncycastle.d.a.d.a(((org.bouncycastle.asn1.j.c)object).b());
                    return new d(new org.bouncycastle.d.b.a.f(((org.bouncycastle.d.a.d)object).a(), ((org.bouncycastle.d.a.d)object).b(), ((org.bouncycastle.d.a.d)object).c()));
                }
                throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
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
                object = b.a(u.b((byte[])object));
            } catch (IOException iOException) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: ".concat(String.valueOf(iOException)));
            }
            try {
                if (e.c.equals(((b)object).a().a())) {
                    object = org.bouncycastle.d.a.c.a(((b)object).b());
                    return new c(new org.bouncycastle.d.b.a.e(((org.bouncycastle.d.a.c)object).a(), ((org.bouncycastle.d.a.c)object).b(), ((org.bouncycastle.d.a.c)object).c(), ((org.bouncycastle.d.a.c)object).d(), ((org.bouncycastle.d.a.c)object).f(), ((org.bouncycastle.d.a.c)object).g(), ((org.bouncycastle.d.a.c)object).e()));
                }
                throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
            } catch (IOException iOException) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + object.getClass() + ".");
    }

    public final PublicKey a(org.bouncycastle.asn1.j.c m2) {
        m2 = org.bouncycastle.d.a.d.a(((org.bouncycastle.asn1.j.c)m2).b());
        return new d(new org.bouncycastle.d.b.a.f(((org.bouncycastle.d.a.d)m2).a(), ((org.bouncycastle.d.a.d)m2).b(), ((org.bouncycastle.d.a.d)m2).c()));
    }

    public final PrivateKey a(b m2) {
        m2 = org.bouncycastle.d.a.c.a(((b)m2).b().h());
        return new c(new org.bouncycastle.d.b.a.e(((org.bouncycastle.d.a.c)m2).a(), ((org.bouncycastle.d.a.c)m2).b(), ((org.bouncycastle.d.a.c)m2).c(), ((org.bouncycastle.d.a.c)m2).d(), ((org.bouncycastle.d.a.c)m2).f(), ((org.bouncycastle.d.a.c)m2).g(), ((org.bouncycastle.d.a.c)m2).e()));
    }

    protected final KeySpec engineGetKeySpec(Key key, Class clazz) {
        return null;
    }

    protected final Key engineTranslateKey(Key key) {
        return null;
    }
}

