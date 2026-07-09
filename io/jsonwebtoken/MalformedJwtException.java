/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.JwtException;

public class MalformedJwtException
extends JwtException {
    public MalformedJwtException(String message) {
        super(message);
    }

    public MalformedJwtException(String message, Throwable cause) {
        super(message, cause);
    }
}

