/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.security.SecurityException;

@Deprecated
public class SignatureException
extends SecurityException {
    public SignatureException(String message) {
        super(message);
    }

    public SignatureException(String message, Throwable cause) {
        super(message, cause);
    }
}

