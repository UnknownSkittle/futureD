/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ClaimsMutator;
import io.jsonwebtoken.CompressionCodec;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoder;
import io.jsonwebtoken.io.Serializer;
import io.jsonwebtoken.security.InvalidKeyException;
import java.security.Key;
import java.util.Date;
import java.util.Map;

public interface JwtBuilder
extends ClaimsMutator<JwtBuilder> {
    public JwtBuilder setHeader(Header var1);

    public JwtBuilder setHeader(Map<String, Object> var1);

    public JwtBuilder setHeaderParams(Map<String, Object> var1);

    public JwtBuilder setHeaderParam(String var1, Object var2);

    public JwtBuilder setPayload(String var1);

    public JwtBuilder setClaims(Claims var1);

    public JwtBuilder setClaims(Map<String, Object> var1);

    public JwtBuilder addClaims(Map<String, Object> var1);

    @Override
    public JwtBuilder setIssuer(String var1);

    @Override
    public JwtBuilder setSubject(String var1);

    @Override
    public JwtBuilder setAudience(String var1);

    @Override
    public JwtBuilder setExpiration(Date var1);

    @Override
    public JwtBuilder setNotBefore(Date var1);

    @Override
    public JwtBuilder setIssuedAt(Date var1);

    @Override
    public JwtBuilder setId(String var1);

    public JwtBuilder claim(String var1, Object var2);

    public JwtBuilder signWith(Key var1) throws InvalidKeyException;

    @Deprecated
    public JwtBuilder signWith(SignatureAlgorithm var1, byte[] var2) throws InvalidKeyException;

    @Deprecated
    public JwtBuilder signWith(SignatureAlgorithm var1, String var2) throws InvalidKeyException;

    @Deprecated
    public JwtBuilder signWith(SignatureAlgorithm var1, Key var2) throws InvalidKeyException;

    public JwtBuilder signWith(Key var1, SignatureAlgorithm var2) throws InvalidKeyException;

    public JwtBuilder compressWith(CompressionCodec var1);

    public JwtBuilder base64UrlEncodeWith(Encoder<byte[], String> var1);

    public JwtBuilder serializeToJsonWith(Serializer<Map<String, ?>> var1);

    public String compact();
}

