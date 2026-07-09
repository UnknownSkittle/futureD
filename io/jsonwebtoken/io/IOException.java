/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.io;

import io.jsonwebtoken.JwtException;

public class IOException
extends JwtException {
    public IOException(String msg) {
        super(msg);
    }

    public IOException(String message, Throwable cause) {
        super(message, cause);
    }
}

