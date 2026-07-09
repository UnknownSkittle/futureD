/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.RsaProvider;
import io.jsonwebtoken.impl.crypto.Signer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAKey;

public class RsaSigner
extends RsaProvider
implements Signer {
    public RsaSigner(SignatureAlgorithm alg, Key key) {
        super(alg, key);
        if (!(key instanceof PrivateKey) || !(key instanceof RSAKey)) {
            String msg = "RSA signatures must be computed using an RSA PrivateKey.  The specified key of type " + key.getClass().getName() + " is not an RSA PrivateKey.";
            throw new IllegalArgumentException(msg);
        }
    }

    @Override
    public byte[] sign(byte[] data) {
        try {
            return this.doSign(data);
        } catch (InvalidKeyException e2) {
            throw new io.jsonwebtoken.security.SignatureException("Invalid RSA PrivateKey. " + e2.getMessage(), e2);
        } catch (SignatureException e3) {
            throw new io.jsonwebtoken.security.SignatureException("Unable to calculate signature using RSA PrivateKey. " + e3.getMessage(), e3);
        }
    }

    protected byte[] doSign(byte[] data) throws InvalidKeyException, SignatureException {
        PrivateKey privateKey = (PrivateKey)this.key;
        Signature sig = this.createSignatureInstance();
        sig.initSign(privateKey);
        sig.update(data);
        return sig.sign();
    }
}

