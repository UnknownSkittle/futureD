/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.CompressionCodec;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.DefaultClaims;
import io.jsonwebtoken.impl.DefaultHeader;
import io.jsonwebtoken.impl.DefaultJwsHeader;
import io.jsonwebtoken.impl.crypto.DefaultJwtSigner;
import io.jsonwebtoken.impl.crypto.JwtSigner;
import io.jsonwebtoken.impl.io.InstanceLocator;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.io.Encoder;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.io.SerializationException;
import io.jsonwebtoken.io.Serializer;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Classes;
import io.jsonwebtoken.lang.Collections;
import io.jsonwebtoken.lang.Strings;
import io.jsonwebtoken.security.InvalidKeyException;
import java.security.Key;
import java.util.Date;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

public class DefaultJwtBuilder
implements JwtBuilder {
    private Header header;
    private Claims claims;
    private String payload;
    private SignatureAlgorithm algorithm;
    private Key key;
    private Serializer<Map<String, ?>> serializer;
    private Encoder<byte[], String> base64UrlEncoder = Encoders.BASE64URL;
    private CompressionCodec compressionCodec;

    @Override
    public JwtBuilder serializeToJsonWith(Serializer<Map<String, ?>> serializer) {
        Assert.notNull(serializer, "Serializer cannot be null.");
        this.serializer = serializer;
        return this;
    }

    @Override
    public JwtBuilder base64UrlEncodeWith(Encoder<byte[], String> base64UrlEncoder) {
        Assert.notNull(base64UrlEncoder, "base64UrlEncoder cannot be null.");
        this.base64UrlEncoder = base64UrlEncoder;
        return this;
    }

    @Override
    public JwtBuilder setHeader(Header header) {
        this.header = header;
        return this;
    }

    @Override
    public JwtBuilder setHeader(Map<String, Object> header) {
        this.header = new DefaultHeader(header);
        return this;
    }

    @Override
    public JwtBuilder setHeaderParams(Map<String, Object> params) {
        if (!Collections.isEmpty(params)) {
            Header header = this.ensureHeader();
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                header.put(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    protected Header ensureHeader() {
        if (this.header == null) {
            this.header = new DefaultHeader();
        }
        return this.header;
    }

    @Override
    public JwtBuilder setHeaderParam(String name, Object value) {
        this.ensureHeader().put(name, value);
        return this;
    }

    @Override
    public JwtBuilder signWith(Key key) throws InvalidKeyException {
        Assert.notNull(key, "Key argument cannot be null.");
        SignatureAlgorithm alg = SignatureAlgorithm.forSigningKey(key);
        return this.signWith(key, alg);
    }

    @Override
    public JwtBuilder signWith(Key key, SignatureAlgorithm alg) throws InvalidKeyException {
        Assert.notNull(key, "Key argument cannot be null.");
        Assert.notNull((Object)alg, "SignatureAlgorithm cannot be null.");
        alg.assertValidSigningKey(key);
        this.algorithm = alg;
        this.key = key;
        return this;
    }

    @Override
    public JwtBuilder signWith(SignatureAlgorithm alg, byte[] secretKeyBytes) throws InvalidKeyException {
        Assert.notNull((Object)alg, "SignatureAlgorithm cannot be null.");
        Assert.notEmpty(secretKeyBytes, "secret key byte array cannot be null or empty.");
        Assert.isTrue(alg.isHmac(), "Key bytes may only be specified for HMAC signatures.  If using RSA or Elliptic Curve, use the signWith(SignatureAlgorithm, Key) method instead.");
        SecretKeySpec key = new SecretKeySpec(secretKeyBytes, alg.getJcaName());
        return this.signWith(key, alg);
    }

    @Override
    public JwtBuilder signWith(SignatureAlgorithm alg, String base64EncodedSecretKey) throws InvalidKeyException {
        Assert.hasText(base64EncodedSecretKey, "base64-encoded secret key cannot be null or empty.");
        Assert.isTrue(alg.isHmac(), "Base64-encoded key bytes may only be specified for HMAC signatures.  If using RSA or Elliptic Curve, use the signWith(SignatureAlgorithm, Key) method instead.");
        byte[] bytes = Decoders.BASE64.decode(base64EncodedSecretKey);
        return this.signWith(alg, bytes);
    }

    @Override
    public JwtBuilder signWith(SignatureAlgorithm alg, Key key) {
        return this.signWith(key, alg);
    }

    @Override
    public JwtBuilder compressWith(CompressionCodec compressionCodec) {
        Assert.notNull(compressionCodec, "compressionCodec cannot be null");
        this.compressionCodec = compressionCodec;
        return this;
    }

    @Override
    public JwtBuilder setPayload(String payload) {
        this.payload = payload;
        return this;
    }

    protected Claims ensureClaims() {
        if (this.claims == null) {
            this.claims = new DefaultClaims();
        }
        return this.claims;
    }

    @Override
    public JwtBuilder setClaims(Claims claims) {
        this.claims = claims;
        return this;
    }

    @Override
    public JwtBuilder setClaims(Map<String, Object> claims) {
        this.claims = new DefaultClaims(claims);
        return this;
    }

    @Override
    public JwtBuilder addClaims(Map<String, Object> claims) {
        this.ensureClaims().putAll(claims);
        return this;
    }

    @Override
    public JwtBuilder setIssuer(String iss) {
        if (Strings.hasText(iss)) {
            this.ensureClaims().setIssuer(iss);
        } else if (this.claims != null) {
            this.claims.setIssuer(iss);
        }
        return this;
    }

    @Override
    public JwtBuilder setSubject(String sub) {
        if (Strings.hasText(sub)) {
            this.ensureClaims().setSubject(sub);
        } else if (this.claims != null) {
            this.claims.setSubject(sub);
        }
        return this;
    }

    @Override
    public JwtBuilder setAudience(String aud2) {
        if (Strings.hasText(aud2)) {
            this.ensureClaims().setAudience(aud2);
        } else if (this.claims != null) {
            this.claims.setAudience(aud2);
        }
        return this;
    }

    @Override
    public JwtBuilder setExpiration(Date exp) {
        if (exp != null) {
            this.ensureClaims().setExpiration(exp);
        } else if (this.claims != null) {
            this.claims.setExpiration(exp);
        }
        return this;
    }

    @Override
    public JwtBuilder setNotBefore(Date nbf) {
        if (nbf != null) {
            this.ensureClaims().setNotBefore(nbf);
        } else if (this.claims != null) {
            this.claims.setNotBefore(nbf);
        }
        return this;
    }

    @Override
    public JwtBuilder setIssuedAt(Date iat) {
        if (iat != null) {
            this.ensureClaims().setIssuedAt(iat);
        } else if (this.claims != null) {
            this.claims.setIssuedAt(iat);
        }
        return this;
    }

    @Override
    public JwtBuilder setId(String jti) {
        if (Strings.hasText(jti)) {
            this.ensureClaims().setId(jti);
        } else if (this.claims != null) {
            this.claims.setId(jti);
        }
        return this;
    }

    @Override
    public JwtBuilder claim(String name, Object value) {
        Assert.hasText(name, "Claim property name cannot be null or empty.");
        if (this.claims == null) {
            if (value != null) {
                this.ensureClaims().put(name, value);
            }
        } else if (value == null) {
            this.claims.remove(name);
        } else {
            this.claims.put(name, value);
        }
        return this;
    }

    @Override
    public String compact() {
        byte[] bytes;
        if (this.serializer == null) {
            InstanceLocator locator = (InstanceLocator)Classes.newInstance("io.jsonwebtoken.impl.io.RuntimeClasspathSerializerLocator");
            this.serializer = (Serializer)locator.getInstance();
        }
        if (this.payload == null && Collections.isEmpty(this.claims)) {
            throw new IllegalStateException("Either 'payload' or 'claims' must be specified.");
        }
        if (this.payload != null && !Collections.isEmpty(this.claims)) {
            throw new IllegalStateException("Both 'payload' and 'claims' cannot both be specified. Choose either one.");
        }
        Header header = this.ensureHeader();
        JwsHeader jwsHeader = header instanceof JwsHeader ? (JwsHeader)header : new DefaultJwsHeader(header);
        if (this.key != null) {
            jwsHeader.setAlgorithm(this.algorithm.getValue());
        } else {
            jwsHeader.setAlgorithm(SignatureAlgorithm.NONE.getValue());
        }
        if (this.compressionCodec != null) {
            jwsHeader.setCompressionAlgorithm(this.compressionCodec.getAlgorithmName());
        }
        String base64UrlEncodedHeader = this.base64UrlEncode(jwsHeader, "Unable to serialize header to json.");
        try {
            bytes = this.payload != null ? this.payload.getBytes(Strings.UTF_8) : this.toJson(this.claims);
        } catch (SerializationException e2) {
            throw new IllegalArgumentException("Unable to serialize claims object to json: " + e2.getMessage(), e2);
        }
        if (this.compressionCodec != null) {
            bytes = this.compressionCodec.compress(bytes);
        }
        String base64UrlEncodedBody = this.base64UrlEncoder.encode(bytes);
        String jwt = base64UrlEncodedHeader + '.' + base64UrlEncodedBody;
        if (this.key != null) {
            JwtSigner signer = this.createSigner(this.algorithm, this.key);
            String base64UrlSignature = signer.sign(jwt);
            jwt = jwt + '.' + base64UrlSignature;
        } else {
            jwt = jwt + '.';
        }
        return jwt;
    }

    protected JwtSigner createSigner(SignatureAlgorithm alg, Key key) {
        return new DefaultJwtSigner(alg, key, this.base64UrlEncoder);
    }

    @Deprecated
    protected String base64UrlEncode(Object o2, String errMsg) {
        byte[] bytes;
        Assert.isInstanceOf(Map.class, o2, "object argument must be a map.");
        Map m2 = (Map)o2;
        try {
            bytes = this.toJson(m2);
        } catch (SerializationException e2) {
            throw new IllegalStateException(errMsg, e2);
        }
        return this.base64UrlEncoder.encode(bytes);
    }

    @Deprecated
    protected byte[] toJson(Object object) throws SerializationException {
        Assert.isInstanceOf(Map.class, object, "object argument must be a map.");
        Map m2 = (Map)object;
        return this.serializer.serialize(m2);
    }
}

