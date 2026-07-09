/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.DefaultSignatureValidatorFactory;
import io.jsonwebtoken.impl.crypto.JwtSignatureValidator;
import io.jsonwebtoken.impl.crypto.SignatureValidator;
import io.jsonwebtoken.impl.crypto.SignatureValidatorFactory;
import io.jsonwebtoken.io.Decoder;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.lang.Assert;
import java.nio.charset.Charset;
import java.security.Key;

public class DefaultJwtSignatureValidator
implements JwtSignatureValidator {
    private static final Charset US_ASCII = Charset.forName("US-ASCII");
    private final SignatureValidator signatureValidator;
    private final Decoder<String, byte[]> base64UrlDecoder;

    @Deprecated
    public DefaultJwtSignatureValidator(SignatureAlgorithm alg, Key key) {
        this(DefaultSignatureValidatorFactory.INSTANCE, alg, key, Decoders.BASE64URL);
    }

    public DefaultJwtSignatureValidator(SignatureAlgorithm alg, Key key, Decoder<String, byte[]> base64UrlDecoder) {
        this(DefaultSignatureValidatorFactory.INSTANCE, alg, key, base64UrlDecoder);
    }

    @Deprecated
    public DefaultJwtSignatureValidator(SignatureValidatorFactory factory, SignatureAlgorithm alg, Key key) {
        this(factory, alg, key, Decoders.BASE64URL);
    }

    public DefaultJwtSignatureValidator(SignatureValidatorFactory factory, SignatureAlgorithm alg, Key key, Decoder<String, byte[]> base64UrlDecoder) {
        Assert.notNull(factory, "SignerFactory argument cannot be null.");
        Assert.notNull(base64UrlDecoder, "Base64Url decoder argument cannot be null.");
        this.signatureValidator = factory.createSignatureValidator(alg, key);
        this.base64UrlDecoder = base64UrlDecoder;
    }

    @Override
    public boolean isValid(String jwtWithoutSignature, String base64UrlEncodedSignature) {
        byte[] data = jwtWithoutSignature.getBytes(US_ASCII);
        byte[] signature = this.base64UrlDecoder.decode(base64UrlEncodedSignature);
        return this.signatureValidator.isValid(data, signature);
    }
}

