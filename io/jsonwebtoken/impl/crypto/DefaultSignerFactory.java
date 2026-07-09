/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.EllipticCurveSigner;
import io.jsonwebtoken.impl.crypto.MacSigner;
import io.jsonwebtoken.impl.crypto.RsaSigner;
import io.jsonwebtoken.impl.crypto.Signer;
import io.jsonwebtoken.impl.crypto.SignerFactory;
import io.jsonwebtoken.lang.Assert;
import java.security.Key;

public class DefaultSignerFactory
implements SignerFactory {
    public static final SignerFactory INSTANCE = new DefaultSignerFactory();

    @Override
    public Signer createSigner(SignatureAlgorithm alg, Key key) {
        Assert.notNull((Object)alg, "SignatureAlgorithm cannot be null.");
        Assert.notNull(key, "Signing Key cannot be null.");
        switch (alg) {
            case HS256: 
            case HS384: 
            case HS512: {
                return new MacSigner(alg, key);
            }
            case RS256: 
            case RS384: 
            case RS512: 
            case PS256: 
            case PS384: 
            case PS512: {
                return new RsaSigner(alg, key);
            }
            case ES256: 
            case ES384: 
            case ES512: {
                return new EllipticCurveSigner(alg, key);
            }
        }
        throw new IllegalArgumentException("The '" + alg.name() + "' algorithm cannot be used for signing.");
    }
}

