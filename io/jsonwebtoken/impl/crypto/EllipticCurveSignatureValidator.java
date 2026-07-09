/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.EllipticCurveProvider;
import io.jsonwebtoken.impl.crypto.SignatureValidator;
import io.jsonwebtoken.lang.Assert;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;

public class EllipticCurveSignatureValidator
extends EllipticCurveProvider
implements SignatureValidator {
    private static final String EC_PUBLIC_KEY_REQD_MSG = "Elliptic Curve signature validation requires an ECPublicKey instance.";

    public EllipticCurveSignatureValidator(SignatureAlgorithm alg, Key key) {
        super(alg, key);
        Assert.isTrue(key instanceof ECPublicKey, EC_PUBLIC_KEY_REQD_MSG);
    }

    @Override
    public boolean isValid(byte[] data, byte[] signature) {
        Signature sig = this.createSignatureInstance();
        PublicKey publicKey = (PublicKey)this.key;
        try {
            int expectedSize = EllipticCurveSignatureValidator.getSignatureByteArrayLength(this.alg);
            byte[] derSignature = expectedSize != signature.length && signature[0] == 48 ? signature : EllipticCurveProvider.transcodeSignatureToDER(signature);
            return this.doVerify(sig, publicKey, data, derSignature);
        } catch (Exception e2) {
            String msg = "Unable to verify Elliptic Curve signature using configured ECPublicKey. " + e2.getMessage();
            throw new io.jsonwebtoken.security.SignatureException(msg, e2);
        }
    }

    protected boolean doVerify(Signature sig, PublicKey publicKey, byte[] data, byte[] signature) throws InvalidKeyException, SignatureException {
        sig.initVerify(publicKey);
        sig.update(data);
        return sig.verify(signature);
    }
}

