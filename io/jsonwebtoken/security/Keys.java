/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.security;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Classes;
import io.jsonwebtoken.security.InvalidKeyException;
import io.jsonwebtoken.security.WeakKeyException;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class Keys {
    private static final String MAC = "io.jsonwebtoken.impl.crypto.MacProvider";
    private static final String RSA = "io.jsonwebtoken.impl.crypto.RsaProvider";
    private static final String EC = "io.jsonwebtoken.impl.crypto.EllipticCurveProvider";
    private static final Class[] SIG_ARG_TYPES = new Class[]{SignatureAlgorithm.class};
    private static final List<SignatureAlgorithm> PREFERRED_HMAC_ALGS = Collections.unmodifiableList(Arrays.asList(SignatureAlgorithm.HS512, SignatureAlgorithm.HS384, SignatureAlgorithm.HS256));

    private Keys() {
    }

    public static SecretKey hmacShaKeyFor(byte[] bytes) throws WeakKeyException {
        if (bytes == null) {
            throw new InvalidKeyException("SecretKey byte array cannot be null.");
        }
        int bitLength = bytes.length * 8;
        for (SignatureAlgorithm alg : PREFERRED_HMAC_ALGS) {
            if (bitLength < alg.getMinKeyLength()) continue;
            return new SecretKeySpec(bytes, alg.getJcaName());
        }
        String msg = "The specified key byte array is " + bitLength + " bits which is not secure enough for any JWT HMAC-SHA algorithm.  The JWT JWA Specification (RFC 7518, Section 3.2) states that keys used with HMAC-SHA algorithms MUST have a size >= 256 bits (the key size must be greater than or equal to the hash output size).  Consider using the " + Keys.class.getName() + "#secretKeyFor(SignatureAlgorithm) method to create a key guaranteed to be secure enough for your preferred HMAC-SHA algorithm.  See https://tools.ietf.org/html/rfc7518#section-3.2 for more information.";
        throw new WeakKeyException(msg);
    }

    public static SecretKey secretKeyFor(SignatureAlgorithm alg) throws IllegalArgumentException {
        Assert.notNull((Object)alg, "SignatureAlgorithm cannot be null.");
        switch (alg) {
            case HS256: 
            case HS384: 
            case HS512: {
                return (SecretKey)Classes.invokeStatic(MAC, "generateKey", SIG_ARG_TYPES, new Object[]{alg});
            }
        }
        String msg = "The " + alg.name() + " algorithm does not support shared secret keys.";
        throw new IllegalArgumentException(msg);
    }

    public static KeyPair keyPairFor(SignatureAlgorithm alg) throws IllegalArgumentException {
        Assert.notNull((Object)alg, "SignatureAlgorithm cannot be null.");
        switch (alg) {
            case RS256: 
            case PS256: 
            case RS384: 
            case PS384: 
            case RS512: 
            case PS512: {
                return (KeyPair)Classes.invokeStatic(RSA, "generateKeyPair", SIG_ARG_TYPES, new Object[]{alg});
            }
            case ES256: 
            case ES384: 
            case ES512: {
                return (KeyPair)Classes.invokeStatic(EC, "generateKeyPair", SIG_ARG_TYPES, new Object[]{alg});
            }
        }
        String msg = "The " + alg.name() + " algorithm does not support Key Pairs.";
        throw new IllegalArgumentException(msg);
    }
}

