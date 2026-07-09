/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.security.SignatureException;

public interface Signer {
    public byte[] sign(byte[] var1) throws SignatureException;
}

