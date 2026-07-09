/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.CompressionException;

public interface CompressionCodec {
    public String getAlgorithmName();

    public byte[] compress(byte[] var1) throws CompressionException;

    public byte[] decompress(byte[] var1) throws CompressionException;
}

