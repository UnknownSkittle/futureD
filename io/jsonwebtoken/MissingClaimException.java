/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.InvalidClaimException;

public class MissingClaimException
extends InvalidClaimException {
    public MissingClaimException(Header header, Claims claims, String message) {
        super(header, claims, message);
    }

    public MissingClaimException(Header header, Claims claims, String message, Throwable cause) {
        super(header, claims, message, cause);
    }
}

