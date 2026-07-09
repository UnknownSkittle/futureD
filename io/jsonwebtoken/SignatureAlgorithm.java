/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.lang.Arrays;
import io.jsonwebtoken.security.InvalidKeyException;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;
import io.jsonwebtoken.security.WeakKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.util.Collections;
import java.util.List;
import javax.crypto.SecretKey;

public enum SignatureAlgorithm {
    NONE("none", "No digital signature or MAC performed", "None", null, false, 0, 0),
    HS256("HS256", "HMAC using SHA-256", "HMAC", "HmacSHA256", true, 256, 256),
    HS384("HS384", "HMAC using SHA-384", "HMAC", "HmacSHA384", true, 384, 384),
    HS512("HS512", "HMAC using SHA-512", "HMAC", "HmacSHA512", true, 512, 512),
    RS256("RS256", "RSASSA-PKCS-v1_5 using SHA-256", "RSA", "SHA256withRSA", true, 256, 2048),
    RS384("RS384", "RSASSA-PKCS-v1_5 using SHA-384", "RSA", "SHA384withRSA", true, 384, 2048),
    RS512("RS512", "RSASSA-PKCS-v1_5 using SHA-512", "RSA", "SHA512withRSA", true, 512, 2048),
    ES256("ES256", "ECDSA using P-256 and SHA-256", "ECDSA", "SHA256withECDSA", true, 256, 256),
    ES384("ES384", "ECDSA using P-384 and SHA-384", "ECDSA", "SHA384withECDSA", true, 384, 384),
    ES512("ES512", "ECDSA using P-521 and SHA-512", "ECDSA", "SHA512withECDSA", true, 512, 521),
    PS256("PS256", "RSASSA-PSS using SHA-256 and MGF1 with SHA-256", "RSA", "SHA256withRSAandMGF1", false, 256, 2048),
    PS384("PS384", "RSASSA-PSS using SHA-384 and MGF1 with SHA-384", "RSA", "SHA384withRSAandMGF1", false, 384, 2048),
    PS512("PS512", "RSASSA-PSS using SHA-512 and MGF1 with SHA-512", "RSA", "SHA512withRSAandMGF1", false, 512, 2048);

    private static final List<SignatureAlgorithm> PREFERRED_HMAC_ALGS;
    private static final List<SignatureAlgorithm> PREFERRED_EC_ALGS;
    private final String value;
    private final String description;
    private final String familyName;
    private final String jcaName;
    private final boolean jdkStandard;
    private final int digestLength;
    private final int minKeyLength;

    private SignatureAlgorithm(String value, String description, String familyName, String jcaName, boolean jdkStandard, int digestLength, int minKeyLength) {
        this.value = value;
        this.description = description;
        this.familyName = familyName;
        this.jcaName = jcaName;
        this.jdkStandard = jdkStandard;
        this.digestLength = digestLength;
        this.minKeyLength = minKeyLength;
    }

    public String getValue() {
        return this.value;
    }

    public String getDescription() {
        return this.description;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public String getJcaName() {
        return this.jcaName;
    }

    public boolean isJdkStandard() {
        return this.jdkStandard;
    }

    public boolean isHmac() {
        return this.familyName.equals("HMAC");
    }

    public boolean isRsa() {
        return this.familyName.equals("RSA");
    }

    public boolean isEllipticCurve() {
        return this.familyName.equals("ECDSA");
    }

    public int getMinKeyLength() {
        return this.minKeyLength;
    }

    public void assertValidSigningKey(Key key) throws InvalidKeyException {
        this.assertValid(key, true);
    }

    public void assertValidVerificationKey(Key key) throws InvalidKeyException {
        this.assertValid(key, false);
    }

    private static String keyType(boolean signing) {
        return signing ? "signing" : "verification";
    }

    private void assertValid(Key key, boolean signing) throws InvalidKeyException {
        if (this == NONE) {
            String msg = "The 'NONE' signature algorithm does not support cryptographic keys.";
            throw new InvalidKeyException(msg);
        }
        if (this.isHmac()) {
            if (!(key instanceof SecretKey)) {
                String msg = this.familyName + " " + SignatureAlgorithm.keyType(signing) + " keys must be SecretKey instances.";
                throw new InvalidKeyException(msg);
            }
            SecretKey secretKey = (SecretKey)key;
            byte[] encoded = secretKey.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("The " + SignatureAlgorithm.keyType(signing) + " key's encoded bytes cannot be null.");
            }
            String alg = secretKey.getAlgorithm();
            if (alg == null) {
                throw new InvalidKeyException("The " + SignatureAlgorithm.keyType(signing) + " key's algorithm cannot be null.");
            }
            if (!(SignatureAlgorithm.HS256.jcaName.equalsIgnoreCase(alg) || SignatureAlgorithm.HS384.jcaName.equalsIgnoreCase(alg) || SignatureAlgorithm.HS512.jcaName.equalsIgnoreCase(alg))) {
                throw new InvalidKeyException("The " + SignatureAlgorithm.keyType(signing) + " key's algorithm '" + alg + "' does not equal a valid HmacSHA* algorithm name and cannot be used with " + this.name() + ".");
            }
            int size = encoded.length * 8;
            if (size < this.minKeyLength) {
                String msg = "The " + SignatureAlgorithm.keyType(signing) + " key's size is " + size + " bits which is not secure enough for the " + this.name() + " algorithm.  The JWT JWA Specification (RFC 7518, Section 3.2) states that keys used with " + this.name() + " MUST have a size >= " + this.minKeyLength + " bits (the key size must be greater than or equal to the hash output size).  Consider using the " + Keys.class.getName() + " class's 'secretKeyFor(SignatureAlgorithm." + this.name() + ")' method to create a key guaranteed to be secure enough for " + this.name() + ".  See https://tools.ietf.org/html/rfc7518#section-3.2 for more information.";
                throw new WeakKeyException(msg);
            }
        } else {
            if (signing && !(key instanceof PrivateKey)) {
                String msg = this.familyName + " signing keys must be PrivateKey instances.";
                throw new InvalidKeyException(msg);
            }
            if (this.isEllipticCurve()) {
                if (!(key instanceof ECKey)) {
                    String msg = this.familyName + " " + SignatureAlgorithm.keyType(signing) + " keys must be ECKey instances.";
                    throw new InvalidKeyException(msg);
                }
                ECKey ecKey = (ECKey)((Object)key);
                int size = ecKey.getParams().getOrder().bitLength();
                if (size < this.minKeyLength) {
                    String msg = "The " + SignatureAlgorithm.keyType(signing) + " key's size (ECParameterSpec order) is " + size + " bits which is not secure enough for the " + this.name() + " algorithm.  The JWT JWA Specification (RFC 7518, Section 3.4) states that keys used with " + this.name() + " MUST have a size >= " + this.minKeyLength + " bits.  Consider using the " + Keys.class.getName() + " class's 'keyPairFor(SignatureAlgorithm." + this.name() + ")' method to create a key pair guaranteed to be secure enough for " + this.name() + ".  See https://tools.ietf.org/html/rfc7518#section-3.4 for more information.";
                    throw new WeakKeyException(msg);
                }
            } else {
                if (!(key instanceof RSAKey)) {
                    String msg = this.familyName + " " + SignatureAlgorithm.keyType(signing) + " keys must be RSAKey instances.";
                    throw new InvalidKeyException(msg);
                }
                RSAKey rsaKey = (RSAKey)((Object)key);
                int size = rsaKey.getModulus().bitLength();
                if (size < this.minKeyLength) {
                    String section = this.name().startsWith("P") ? "3.5" : "3.3";
                    String msg = "The " + SignatureAlgorithm.keyType(signing) + " key's size is " + size + " bits which is not secure enough for the " + this.name() + " algorithm.  The JWT JWA Specification (RFC 7518, Section " + section + ") states that keys used with " + this.name() + " MUST have a size >= " + this.minKeyLength + " bits.  Consider using the " + Keys.class.getName() + " class's 'keyPairFor(SignatureAlgorithm." + this.name() + ")' method to create a key pair guaranteed to be secure enough for " + this.name() + ".  See https://tools.ietf.org/html/rfc7518#section-" + section + " for more information.";
                    throw new WeakKeyException(msg);
                }
            }
        }
    }

    public static SignatureAlgorithm forSigningKey(Key key) throws InvalidKeyException {
        if (key == null) {
            throw new InvalidKeyException("Key argument cannot be null.");
        }
        if (!(key instanceof SecretKey || key instanceof PrivateKey && (key instanceof ECKey || key instanceof RSAKey))) {
            String msg = "JWT standard signing algorithms require either 1) a SecretKey for HMAC-SHA algorithms or 2) a private RSAKey for RSA algorithms or 3) a private ECKey for Elliptic Curve algorithms.  The specified key is of type " + key.getClass().getName();
            throw new InvalidKeyException(msg);
        }
        if (key instanceof SecretKey) {
            SecretKey secretKey = (SecretKey)key;
            int bitLength = Arrays.length(secretKey.getEncoded()) * 8;
            for (SignatureAlgorithm alg : PREFERRED_HMAC_ALGS) {
                if (bitLength < alg.minKeyLength) continue;
                return alg;
            }
            String msg = "The specified SecretKey is not strong enough to be used with JWT HMAC signature algorithms.  The JWT specification requires HMAC keys to be >= 256 bits long.  The specified key is " + bitLength + " bits.  See https://tools.ietf.org/html/rfc7518#section-3.2 for more information.";
            throw new WeakKeyException(msg);
        }
        if (key instanceof RSAKey) {
            RSAKey rsaKey = (RSAKey)((Object)key);
            int bitLength = rsaKey.getModulus().bitLength();
            if (bitLength >= 4096) {
                RS512.assertValidSigningKey(key);
                return RS512;
            }
            if (bitLength >= 3072) {
                RS384.assertValidSigningKey(key);
                return RS384;
            }
            if (bitLength >= SignatureAlgorithm.RS256.minKeyLength) {
                RS256.assertValidSigningKey(key);
                return RS256;
            }
            String msg = "The specified RSA signing key is not strong enough to be used with JWT RSA signature algorithms.  The JWT specification requires RSA keys to be >= 2048 bits long.  The specified RSA key is " + bitLength + " bits.  See https://tools.ietf.org/html/rfc7518#section-3.3 for more information.";
            throw new WeakKeyException(msg);
        }
        ECKey ecKey = (ECKey)((Object)key);
        int bitLength = ecKey.getParams().getOrder().bitLength();
        for (SignatureAlgorithm alg : PREFERRED_EC_ALGS) {
            if (bitLength < alg.minKeyLength) continue;
            alg.assertValidSigningKey(key);
            return alg;
        }
        String msg = "The specified Elliptic Curve signing key is not strong enough to be used with JWT ECDSA signature algorithms.  The JWT specification requires ECDSA keys to be >= 256 bits long.  The specified ECDSA key is " + bitLength + " bits.  See https://tools.ietf.org/html/rfc7518#section-3.4 for more information.";
        throw new WeakKeyException(msg);
    }

    public static SignatureAlgorithm forName(String value) throws SignatureException {
        for (SignatureAlgorithm alg : SignatureAlgorithm.values()) {
            if (!alg.getValue().equalsIgnoreCase(value)) continue;
            return alg;
        }
        throw new SignatureException("Unsupported signature algorithm '" + value + "'");
    }

    static {
        PREFERRED_HMAC_ALGS = Collections.unmodifiableList(java.util.Arrays.asList(HS512, HS384, HS256));
        PREFERRED_EC_ALGS = Collections.unmodifiableList(java.util.Arrays.asList(ES512, ES384, ES256));
    }
}

