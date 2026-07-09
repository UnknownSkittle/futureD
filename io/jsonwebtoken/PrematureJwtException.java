/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.ClaimJwtException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Header;

public class PrematureJwtException
extends ClaimJwtException {
    public PrematureJwtException(Header header, Claims claims, String message) {
        super(header, claims, message);
    }

    public PrematureJwtException(Header header, Claims claims, String message, Throwable cause) {
        super(header, claims, message, cause);
    }
}

