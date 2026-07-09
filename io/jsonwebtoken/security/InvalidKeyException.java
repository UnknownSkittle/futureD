/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.security;

import io.jsonwebtoken.security.KeyException;

public class InvalidKeyException
extends KeyException {
    public InvalidKeyException(String message) {
        super(message);
    }
}

