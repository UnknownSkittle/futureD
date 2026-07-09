/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.SignatureValidator;
import java.security.Key;

public interface SignatureValidatorFactory {
    public SignatureValidator createSignatureValidator(SignatureAlgorithm var1, Key var2);
}

