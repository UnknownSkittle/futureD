/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.SignatureProvider;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Strings;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;
import java.util.HashMap;
import java.util.Map;

public abstract class EllipticCurveProvider
extends SignatureProvider {
    private static final Map<SignatureAlgorithm, String> EC_CURVE_NAMES = EllipticCurveProvider.createEcCurveNames();

    private static Map<SignatureAlgorithm, String> createEcCurveNames() {
        HashMap<SignatureAlgorithm, String> m2 = new HashMap<SignatureAlgorithm, String>();
        m2.put(SignatureAlgorithm.ES256, "secp256r1");
        m2.put(SignatureAlgorithm.ES384, "secp384r1");
        m2.put(SignatureAlgorithm.ES512, "secp521r1");
        return m2;
    }

    protected EllipticCurveProvider(SignatureAlgorithm alg, Key key) {
        super(alg, key);
        Assert.isTrue(alg.isEllipticCurve(), "SignatureAlgorithm must be an Elliptic Curve algorithm.");
    }

    public static KeyPair generateKeyPair() {
        return EllipticCurveProvider.generateKeyPair(SignatureAlgorithm.ES512);
    }

    public static KeyPair generateKeyPair(SignatureAlgorithm alg) {
        return EllipticCurveProvider.generateKeyPair(alg, DEFAULT_SECURE_RANDOM);
    }

    public static KeyPair generateKeyPair(SignatureAlgorithm alg, SecureRandom random) {
        return EllipticCurveProvider.generateKeyPair("EC", null, alg, random);
    }

    public static KeyPair generateKeyPair(String jcaAlgorithmName, String jcaProviderName, SignatureAlgorithm alg, SecureRandom random) {
        Assert.notNull((Object)alg, "SignatureAlgorithm argument cannot be null.");
        Assert.isTrue(alg.isEllipticCurve(), "SignatureAlgorithm argument must represent an Elliptic Curve algorithm.");
        try {
            KeyPairGenerator g2 = Strings.hasText(jcaProviderName) ? KeyPairGenerator.getInstance(jcaAlgorithmName, jcaProviderName) : KeyPairGenerator.getInstance(jcaAlgorithmName);
            String paramSpecCurveName = EC_CURVE_NAMES.get((Object)alg);
            ECGenParameterSpec spec = new ECGenParameterSpec(paramSpecCurveName);
            g2.initialize(spec, random);
            return g2.generateKeyPair();
        } catch (Exception e2) {
            throw new IllegalStateException("Unable to generate Elliptic Curve KeyPair: " + e2.getMessage(), e2);
        }
    }

    public static int getSignatureByteArrayLength(SignatureAlgorithm alg) throws JwtException {
        switch (alg) {
            case ES256: {
                return 64;
            }
            case ES384: {
                return 96;
            }
            case ES512: {
                return 132;
            }
        }
        throw new JwtException("Unsupported Algorithm: " + alg.name());
    }

    public static byte[] transcodeSignatureToConcat(byte[] derSignature, int outputLength) throws JwtException {
        int sLength;
        int j2;
        int rLength;
        int i2;
        int offset;
        if (derSignature.length < 8 || derSignature[0] != 48) {
            throw new JwtException("Invalid ECDSA signature format");
        }
        if (derSignature[1] > 0) {
            offset = 2;
        } else if (derSignature[1] == -127) {
            offset = 3;
        } else {
            throw new JwtException("Invalid ECDSA signature format");
        }
        for (i2 = rLength = derSignature[offset + 1]; i2 > 0 && derSignature[offset + 2 + rLength - i2] == 0; --i2) {
        }
        for (j2 = sLength = derSignature[offset + 2 + rLength + 1]; j2 > 0 && derSignature[offset + 2 + rLength + 2 + sLength - j2] == 0; --j2) {
        }
        int rawLen = Math.max(i2, j2);
        rawLen = Math.max(rawLen, outputLength / 2);
        if ((derSignature[offset - 1] & 0xFF) != derSignature.length - offset || (derSignature[offset - 1] & 0xFF) != 2 + rLength + 2 + sLength || derSignature[offset] != 2 || derSignature[offset + 2 + rLength] != 2) {
            throw new JwtException("Invalid ECDSA signature format");
        }
        byte[] concatSignature = new byte[2 * rawLen];
        System.arraycopy(derSignature, offset + 2 + rLength - i2, concatSignature, rawLen - i2, i2);
        System.arraycopy(derSignature, offset + 2 + rLength + 2 + sLength - j2, concatSignature, 2 * rawLen - j2, j2);
        return concatSignature;
    }

    public static byte[] transcodeSignatureToDER(byte[] jwsSignature) throws JwtException {
        int offset;
        byte[] derSignature;
        int len;
        int k2;
        int rawLen;
        int i2;
        for (i2 = rawLen = jwsSignature.length / 2; i2 > 0 && jwsSignature[rawLen - i2] == 0; --i2) {
        }
        int j2 = i2;
        if (jwsSignature[rawLen - i2] < 0) {
            ++j2;
        }
        for (k2 = rawLen; k2 > 0 && jwsSignature[2 * rawLen - k2] == 0; --k2) {
        }
        int l2 = k2;
        if (jwsSignature[2 * rawLen - k2] < 0) {
            ++l2;
        }
        if ((len = 2 + j2 + 2 + l2) > 255) {
            throw new JwtException("Invalid ECDSA signature format");
        }
        if (len < 128) {
            derSignature = new byte[4 + j2 + 2 + l2];
            offset = 1;
        } else {
            derSignature = new byte[5 + j2 + 2 + l2];
            derSignature[1] = -127;
            offset = 2;
        }
        derSignature[0] = 48;
        derSignature[offset++] = (byte)len;
        derSignature[offset++] = 2;
        derSignature[offset++] = (byte)j2;
        System.arraycopy(jwsSignature, rawLen - i2, derSignature, offset + j2 - i2, i2);
        offset += j2;
        derSignature[offset++] = 2;
        derSignature[offset++] = (byte)l2;
        System.arraycopy(jwsSignature, 2 * rawLen - k2, derSignature, offset + l2 - k2, k2);
        return derSignature;
    }
}

