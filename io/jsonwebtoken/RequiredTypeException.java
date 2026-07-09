/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.JwtException;

public class RequiredTypeException
extends JwtException {
    public RequiredTypeException(String message) {
        super(message);
    }

    public RequiredTypeException(String message, Throwable cause) {
        super(message, cause);
    }
}

