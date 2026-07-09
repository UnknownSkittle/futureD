/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.RuntimeEnvironment;
import io.jsonwebtoken.security.SignatureException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Signature;

abstract class SignatureProvider {
    public static final SecureRandom DEFAULT_SECURE_RANDOM = new SecureRandom();
    protected final SignatureAlgorithm alg;
    protected final Key key;

    protected SignatureProvider(SignatureAlgorithm alg, Key key) {
        Assert.notNull((Object)alg, "SignatureAlgorithm cannot be null.");
        Assert.notNull(key, "Key cannot be null.");
        this.alg = alg;
        this.key = key;
    }

    protected Signature createSignatureInstance() {
        try {
            return this.getSignatureInstance();
        } catch (NoSuchAlgorithmException e2) {
            String msg = "Unavailable " + this.alg.getFamilyName() + " Signature algorithm '" + this.alg.getJcaName() + "'.";
            if (!this.alg.isJdkStandard() && !this.isBouncyCastleAvailable()) {
                msg = msg + " This is not a standard JDK algorithm. Try including BouncyCastle in the runtime classpath.";
            }
            throw new SignatureException(msg, e2);
        }
    }

    protected Signature getSignatureInstance() throws NoSuchAlgorithmException {
        return Signature.getInstance(this.alg.getJcaName());
    }

    protected boolean isBouncyCastleAvailable() {
        return RuntimeEnvironment.BOUNCY_CASTLE_AVAILABLE;
    }

    static {
        DEFAULT_SECURE_RANDOM.nextBytes(new byte[64]);
    }
}

