/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.DefaultSignerFactory;
import io.jsonwebtoken.impl.crypto.JwtSigner;
import io.jsonwebtoken.impl.crypto.Signer;
import io.jsonwebtoken.impl.crypto.SignerFactory;
import io.jsonwebtoken.io.Encoder;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.lang.Assert;
import java.nio.charset.Charset;
import java.security.Key;

public class DefaultJwtSigner
implements JwtSigner {
    private static final Charset US_ASCII = Charset.forName("US-ASCII");
    private final Signer signer;
    private final Encoder<byte[], String> base64UrlEncoder;

    @Deprecated
    public DefaultJwtSigner(SignatureAlgorithm alg, Key key) {
        this(DefaultSignerFactory.INSTANCE, alg, key, Encoders.BASE64URL);
    }

    public DefaultJwtSigner(SignatureAlgorithm alg, Key key, Encoder<byte[], String> base64UrlEncoder) {
        this(DefaultSignerFactory.INSTANCE, alg, key, base64UrlEncoder);
    }

    @Deprecated
    public DefaultJwtSigner(SignerFactory factory, SignatureAlgorithm alg, Key key) {
        this(factory, alg, key, Encoders.BASE64URL);
    }

    public DefaultJwtSigner(SignerFactory factory, SignatureAlgorithm alg, Key key, Encoder<byte[], String> base64UrlEncoder) {
        Assert.notNull(factory, "SignerFactory argument cannot be null.");
        Assert.notNull(base64UrlEncoder, "Base64Url Encoder cannot be null.");
        this.base64UrlEncoder = base64UrlEncoder;
        this.signer = factory.createSigner(alg, key);
    }

    @Override
    public String sign(String jwtWithoutSignature) {
        byte[] bytesToSign = jwtWithoutSignature.getBytes(US_ASCII);
        byte[] signature = this.signer.sign(bytesToSign);
        return this.base64UrlEncoder.encode(signature);
    }
}

