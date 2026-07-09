/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SigningKeyResolver;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.lang.Assert;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;

public class SigningKeyResolverAdapter
implements SigningKeyResolver {
    @Override
    public Key resolveSigningKey(JwsHeader header, Claims claims) {
        SignatureAlgorithm alg = SignatureAlgorithm.forName(header.getAlgorithm());
        Assert.isTrue(alg.isHmac(), "The default resolveSigningKey(JwsHeader, Claims) implementation cannot be used for asymmetric key algorithms (RSA, Elliptic Curve).  Override the resolveSigningKey(JwsHeader, Claims) method instead and return a Key instance appropriate for the " + alg.name() + " algorithm.");
        byte[] keyBytes = this.resolveSigningKeyBytes(header, claims);
        return new SecretKeySpec(keyBytes, alg.getJcaName());
    }

    @Override
    public Key resolveSigningKey(JwsHeader header, String plaintext) {
        SignatureAlgorithm alg = SignatureAlgorithm.forName(header.getAlgorithm());
        Assert.isTrue(alg.isHmac(), "The default resolveSigningKey(JwsHeader, String) implementation cannot be used for asymmetric key algorithms (RSA, Elliptic Curve).  Override the resolveSigningKey(JwsHeader, String) method instead and return a Key instance appropriate for the " + alg.name() + " algorithm.");
        byte[] keyBytes = this.resolveSigningKeyBytes(header, plaintext);
        return new SecretKeySpec(keyBytes, alg.getJcaName());
    }

    public byte[] resolveSigningKeyBytes(JwsHeader header, Claims claims) {
        throw new UnsupportedJwtException("The specified SigningKeyResolver implementation does not support Claims JWS signing key resolution.  Consider overriding either the resolveSigningKey(JwsHeader, Claims) method or, for HMAC algorithms, the resolveSigningKeyBytes(JwsHeader, Claims) method.");
    }

    public byte[] resolveSigningKeyBytes(JwsHeader header, String payload) {
        throw new UnsupportedJwtException("The specified SigningKeyResolver implementation does not support plaintext JWS signing key resolution.  Consider overriding either the resolveSigningKey(JwsHeader, String) method or, for HMAC algorithms, the resolveSigningKeyBytes(JwsHeader, String) method.");
    }
}

