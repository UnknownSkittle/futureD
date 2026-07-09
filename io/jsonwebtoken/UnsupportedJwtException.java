/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.JwtException;

public class UnsupportedJwtException
extends JwtException {
    public UnsupportedJwtException(String message) {
        super(message);
    }

    public UnsupportedJwtException(String message, Throwable cause) {
        super(message, cause);
    }
}

