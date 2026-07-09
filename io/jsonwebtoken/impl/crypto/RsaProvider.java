/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.SignatureProvider;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.RuntimeEnvironment;
import io.jsonwebtoken.security.SignatureException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;

public abstract class RsaProvider
extends SignatureProvider {
    private static final Map<SignatureAlgorithm, PSSParameterSpec> PSS_PARAMETER_SPECS = RsaProvider.createPssParameterSpecs();

    private static Map<SignatureAlgorithm, PSSParameterSpec> createPssParameterSpecs() {
        HashMap<SignatureAlgorithm, PSSParameterSpec> m2 = new HashMap<SignatureAlgorithm, PSSParameterSpec>();
        MGF1ParameterSpec ps = MGF1ParameterSpec.SHA256;
        PSSParameterSpec spec = new PSSParameterSpec(ps.getDigestAlgorithm(), "MGF1", ps, 32, 1);
        m2.put(SignatureAlgorithm.PS256, spec);
        ps = MGF1ParameterSpec.SHA384;
        spec = new PSSParameterSpec(ps.getDigestAlgorithm(), "MGF1", ps, 48, 1);
        m2.put(SignatureAlgorithm.PS384, spec);
        ps = MGF1ParameterSpec.SHA512;
        spec = new PSSParameterSpec(ps.getDigestAlgorithm(), "MGF1", ps, 64, 1);
        m2.put(SignatureAlgorithm.PS512, spec);
        return m2;
    }

    protected RsaProvider(SignatureAlgorithm alg, Key key) {
        super(alg, key);
        Assert.isTrue(alg.isRsa(), "SignatureAlgorithm must be an RSASSA or RSASSA-PSS algorithm.");
    }

    @Override
    protected Signature createSignatureInstance() {
        Signature sig = super.createSignatureInstance();
        PSSParameterSpec spec = PSS_PARAMETER_SPECS.get((Object)this.alg);
        if (spec != null) {
            this.setParameter(sig, spec);
        }
        return sig;
    }

    protected void setParameter(Signature sig, PSSParameterSpec spec) {
        try {
            this.doSetParameter(sig, spec);
        } catch (InvalidAlgorithmParameterException e2) {
            String msg = "Unsupported RSASSA-PSS parameter '" + spec + "': " + e2.getMessage();
            throw new SignatureException(msg, e2);
        }
    }

    protected void doSetParameter(Signature sig, PSSParameterSpec spec) throws InvalidAlgorithmParameterException {
        sig.setParameter(spec);
    }

    public static KeyPair generateKeyPair() {
        return RsaProvider.generateKeyPair(4096);
    }

    public static KeyPair generateKeyPair(int keySizeInBits) {
        return RsaProvider.generateKeyPair(keySizeInBits, DEFAULT_SECURE_RANDOM);
    }

    public static KeyPair generateKeyPair(SignatureAlgorithm alg) {
        Assert.isTrue(alg.isRsa(), "Only RSA algorithms are supported by this method.");
        int keySizeInBits = 4096;
        switch (alg) {
            case RS256: 
            case PS256: {
                keySizeInBits = 2048;
                break;
            }
            case RS384: 
            case PS384: {
                keySizeInBits = 3072;
            }
        }
        return RsaProvider.generateKeyPair(keySizeInBits, DEFAULT_SECURE_RANDOM);
    }

    public static KeyPair generateKeyPair(int keySizeInBits, SecureRandom random) {
        return RsaProvider.generateKeyPair("RSA", keySizeInBits, random);
    }

    protected static KeyPair generateKeyPair(String jcaAlgorithmName, int keySizeInBits, SecureRandom random) {
        KeyPairGenerator keyGenerator;
        try {
            keyGenerator = KeyPairGenerator.getInstance(jcaAlgorithmName);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("Unable to obtain an RSA KeyPairGenerator: " + e2.getMessage(), e2);
        }
        keyGenerator.initialize(keySizeInBits, random);
        return keyGenerator.genKeyPair();
    }

    static {
        RuntimeEnvironment.enableBouncyCastleIfPossible();
    }
}

