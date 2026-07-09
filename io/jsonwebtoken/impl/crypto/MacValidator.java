/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacSigner;
import io.jsonwebtoken.impl.crypto.SignatureValidator;
import java.security.Key;
import java.security.MessageDigest;

public class MacValidator
implements SignatureValidator {
    private final MacSigner signer;

    public MacValidator(SignatureAlgorithm alg, Key key) {
        this.signer = new MacSigner(alg, key);
    }

    @Override
    public boolean isValid(byte[] data, byte[] signature) {
        byte[] computed = this.signer.sign(data);
        return MessageDigest.isEqual(computed, signature);
    }
}

