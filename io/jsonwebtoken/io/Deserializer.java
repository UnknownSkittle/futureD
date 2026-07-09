/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.io;

import io.jsonwebtoken.io.DeserializationException;

public interface Deserializer<T> {
    public T deserialize(byte[] var1) throws DeserializationException;
}

