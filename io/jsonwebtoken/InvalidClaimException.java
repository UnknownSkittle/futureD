/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.ClaimJwtException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Header;

public class InvalidClaimException
extends ClaimJwtException {
    private String claimName;
    private Object claimValue;

    protected InvalidClaimException(Header header, Claims claims, String message) {
        super(header, claims, message);
    }

    protected InvalidClaimException(Header header, Claims claims, String message, Throwable cause) {
        super(header, claims, message, cause);
    }

    public String getClaimName() {
        return this.claimName;
    }

    public void setClaimName(String claimName) {
        this.claimName = claimName;
    }

    public Object getClaimValue() {
        return this.claimValue;
    }

    public void setClaimValue(Object claimValue) {
        this.claimValue = claimValue;
    }
}

