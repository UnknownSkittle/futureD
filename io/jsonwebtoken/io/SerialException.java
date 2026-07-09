/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.io;

import io.jsonwebtoken.io.IOException;

public class SerialException
extends IOException {
    public SerialException(String msg) {
        super(msg);
    }

    public SerialException(String message, Throwable cause) {
        super(message, cause);
    }
}

