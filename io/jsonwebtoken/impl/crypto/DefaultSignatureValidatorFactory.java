/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.EllipticCurveSignatureValidator;
import io.jsonwebtoken.impl.crypto.MacValidator;
import io.jsonwebtoken.impl.crypto.RsaSignatureValidator;
import io.jsonwebtoken.impl.crypto.SignatureValidator;
import io.jsonwebtoken.impl.crypto.SignatureValidatorFactory;
import io.jsonwebtoken.lang.Assert;
import java.security.Key;

public class DefaultSignatureValidatorFactory
implements SignatureValidatorFactory {
    public static final SignatureValidatorFactory INSTANCE = new DefaultSignatureValidatorFactory();

    @Override
    public SignatureValidator createSignatureValidator(SignatureAlgorithm alg, Key key) {
        Assert.notNull((Object)alg, "SignatureAlgorithm cannot be null.");
        Assert.notNull(key, "Signing Key cannot be null.");
        switch (alg) {
            case HS256: 
            case HS384: 
            case HS512: {
                return new MacValidator(alg, key);
            }
            case RS256: 
            case RS384: 
            case RS512: 
            case PS256: 
            case PS384: 
            case PS512: {
                return new RsaSignatureValidator(alg, key);
            }
            case ES256: 
            case ES384: 
            case ES512: {
                return new EllipticCurveSignatureValidator(alg, key);
            }
        }
        throw new IllegalArgumentException("The '" + alg.name() + "' algorithm cannot be used for signing.");
    }
}

