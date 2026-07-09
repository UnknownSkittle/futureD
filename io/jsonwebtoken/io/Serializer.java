/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.io;

import io.jsonwebtoken.io.SerializationException;

public interface Serializer<T> {
    public byte[] serialize(T var1) throws SerializationException;
}

