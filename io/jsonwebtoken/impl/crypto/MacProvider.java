/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.SignatureProvider;
import io.jsonwebtoken.lang.Assert;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public abstract class MacProvider
extends SignatureProvider {
    protected MacProvider(SignatureAlgorithm alg, Key key) {
        super(alg, key);
        Assert.isTrue(alg.isHmac(), "SignatureAlgorithm must be a HMAC SHA algorithm.");
    }

    public static SecretKey generateKey() {
        return MacProvider.generateKey(SignatureAlgorithm.HS512);
    }

    public static SecretKey generateKey(SignatureAlgorithm alg) {
        return MacProvider.generateKey(alg, DEFAULT_SECURE_RANDOM);
    }

    @Deprecated
    public static SecretKey generateKey(SignatureAlgorithm alg, SecureRandom random) {
        KeyGenerator gen;
        Assert.isTrue(alg.isHmac(), "SignatureAlgorithm argument must represent an HMAC algorithm.");
        try {
            gen = KeyGenerator.getInstance(alg.getJcaName());
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("The " + alg.getJcaName() + " algorithm is not available.  This should never happen on JDK 7 or later - please report this to the JJWT developers.", e2);
        }
        return gen.generateKey();
    }
}

