/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

public interface SignatureValidator {
    public boolean isValid(byte[] var1, byte[] var2);
}

