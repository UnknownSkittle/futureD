/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.EllipticCurveProvider;
import io.jsonwebtoken.impl.crypto.Signer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECKey;

public class EllipticCurveSigner
extends EllipticCurveProvider
implements Signer {
    public EllipticCurveSigner(SignatureAlgorithm alg, Key key) {
        super(alg, key);
        if (!(key instanceof PrivateKey) || !(key instanceof ECKey)) {
            String msg = "Elliptic Curve signatures must be computed using an EC PrivateKey.  The specified key of type " + key.getClass().getName() + " is not an EC PrivateKey.";
            throw new IllegalArgumentException(msg);
        }
    }

    @Override
    public byte[] sign(byte[] data) {
        try {
            return this.doSign(data);
        } catch (InvalidKeyException e2) {
            throw new io.jsonwebtoken.security.SignatureException("Invalid Elliptic Curve PrivateKey. " + e2.getMessage(), e2);
        } catch (SignatureException e3) {
            throw new io.jsonwebtoken.security.SignatureException("Unable to calculate signature using Elliptic Curve PrivateKey. " + e3.getMessage(), e3);
        } catch (JwtException e4) {
            throw new io.jsonwebtoken.security.SignatureException("Unable to convert signature to JOSE format. " + e4.getMessage(), e4);
        }
    }

    protected byte[] doSign(byte[] data) throws InvalidKeyException, SignatureException, JwtException {
        PrivateKey privateKey = (PrivateKey)this.key;
        Signature sig = this.createSignatureInstance();
        sig.initSign(privateKey);
        sig.update(data);
        return EllipticCurveSigner.transcodeSignatureToConcat(sig.sign(), EllipticCurveSigner.getSignatureByteArrayLength(this.alg));
    }
}

