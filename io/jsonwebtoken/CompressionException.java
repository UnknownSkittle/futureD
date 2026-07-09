/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.JwtException;

public class CompressionException
extends JwtException {
    public CompressionException(String message) {
        super(message);
    }

    public CompressionException(String message, Throwable cause) {
        super(message, cause);
    }
}

