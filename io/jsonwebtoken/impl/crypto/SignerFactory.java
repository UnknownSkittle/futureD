/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.Signer;
import java.security.Key;

public interface SignerFactory {
    public Signer createSigner(SignatureAlgorithm var1, Key var2);
}

